package d.a;

import i.q.f;
import i.x.e;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class j extends f0 {

    /* renamed from: f  reason: collision with root package name */
    public static final int f1820f;

    /* renamed from: g  reason: collision with root package name */
    public static final j f1821g = new j();
    public static volatile Executor pool;

    public static final class a implements ThreadFactory {
        public final /* synthetic */ AtomicInteger e;

        public a(AtomicInteger atomicInteger) {
            this.e = atomicInteger;
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder f2 = c.c.a.a.a.f("CommonPool-worker-");
            f2.append(this.e.incrementAndGet());
            Thread thread = new Thread(runnable, f2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    static {
        String str;
        int i2;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            Integer x = e.x(str);
            if (x == null || x.intValue() < 1) {
                throw new IllegalStateException(c.c.a.a.a.q("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            i2 = x.intValue();
        } else {
            i2 = -1;
        }
        f1820f = i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // d.a.s
    public void d0(f fVar, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                synchronized (this) {
                    executor = pool;
                    if (executor == null) {
                        executor = g0();
                        pool = executor;
                    }
                }
            }
            executor.execute(runnable);
        } catch (RejectedExecutionException unused) {
            v.f1835l.m0(runnable);
        }
    }

    public final ExecutorService f0() {
        return Executors.newFixedThreadPool(h0(), new a(new AtomicInteger()));
    }

    public final ExecutorService g0() {
        Class<?> cls;
        ExecutorService executorService;
        Integer num;
        if (System.getSecurityManager() != null) {
            return f0();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return f0();
        }
        if (f1820f < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                Object invoke = method != null ? method.invoke(null, new Object[0]) : null;
                if (!(invoke instanceof ExecutorService)) {
                    invoke = null;
                }
                executorService = (ExecutorService) invoke;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                Objects.requireNonNull(f1821g);
                executorService.submit(k.e);
                try {
                    Object invoke2 = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
                    if (!(invoke2 instanceof Integer)) {
                        invoke2 = null;
                    }
                    num = (Integer) invoke2;
                } catch (Throwable unused3) {
                    num = null;
                }
                if (!(num != null && num.intValue() >= 1)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(f1821g.h0()));
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService2 = (ExecutorService) newInstance;
        } catch (Throwable unused4) {
        }
        return executorService2 != null ? executorService2 : f0();
    }

    public final int h0() {
        Integer valueOf = Integer.valueOf(f1820f);
        int i2 = 1;
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        if (availableProcessors >= 1) {
            i2 = availableProcessors;
        }
        return i2;
    }

    @Override // d.a.s
    public String toString() {
        return "CommonPool";
    }
}
