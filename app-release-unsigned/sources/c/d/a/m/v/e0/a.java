package c.d.a.m.v.e0;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public final class a implements ExecutorService {
    public static final long e = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: f  reason: collision with root package name */
    public static volatile int f895f;

    /* renamed from: g  reason: collision with root package name */
    public final ExecutorService f896g;

    /* renamed from: c.d.a.m.v.e0.a$a  reason: collision with other inner class name */
    public static final class ThreadFactoryC0018a implements ThreadFactory {
        public final String e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f897f;

        /* renamed from: g  reason: collision with root package name */
        public int f898g;

        /* renamed from: c.d.a.m.v.e0.a$a$a  reason: collision with other inner class name */
        public class C0019a extends Thread {
            public C0019a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (ThreadFactoryC0018a.this.f897f) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    Objects.requireNonNull(ThreadFactoryC0018a.this);
                    ((b.C0020a) b.b).a(th);
                }
            }
        }

        public ThreadFactoryC0018a(String str, b bVar, boolean z) {
            this.e = str;
            this.f897f = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            C0019a aVar;
            aVar = new C0019a(runnable, "glide-" + this.e + "-thread-" + this.f898g);
            this.f898g = this.f898g + 1;
            return aVar;
        }
    }

    public interface b {
        public static final b a;
        public static final b b;

        /* renamed from: c.d.a.m.v.e0.a$b$a  reason: collision with other inner class name */
        public class C0020a implements b {
            public void a(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C0020a aVar = new C0020a();
            a = aVar;
            b = aVar;
        }
    }

    public a(ExecutorService executorService) {
        this.f896g = executorService;
    }

    public static int a() {
        if (f895f == 0) {
            f895f = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f895f;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return this.f896g.awaitTermination(j2, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f896g.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f896g.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) {
        return this.f896g.invokeAll(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f896g.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) {
        return (T) this.f896g.invokeAny(collection, j2, timeUnit);
    }

    public boolean isShutdown() {
        return this.f896g.isShutdown();
    }

    public boolean isTerminated() {
        return this.f896g.isTerminated();
    }

    public void shutdown() {
        this.f896g.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f896g.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f896g.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f896g.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f896g.submit(callable);
    }

    public String toString() {
        return this.f896g.toString();
    }
}
