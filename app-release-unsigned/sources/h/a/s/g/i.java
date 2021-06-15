package h.a.s.g;

import h.a.p.c;
import h.a.s.a.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class i extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, c {
    public static final Object e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final Object f3243f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static final Object f3244g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public static final Object f3245h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f3246i;

    public i(Runnable runnable, a aVar) {
        super(3);
        this.f3246i = runnable;
        lazySet(0, aVar);
    }

    public void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f3245h) {
                if (obj == f3243f) {
                    future.cancel(false);
                    return;
                } else if (obj == f3244g) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // h.a.p.c
    public void e() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f3245h || obj5 == (obj3 = f3243f) || obj5 == (obj4 = f3244g)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f3245h || obj == (obj2 = e) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((a) obj).a(this);
    }

    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f3246i.run();
        } catch (Throwable th) {
            lazySet(2, null);
            Object obj3 = get(0);
            if (!(obj3 == e || !compareAndSet(0, obj3, f3245h) || obj3 == null)) {
                ((a) obj3).a(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f3243f || obj2 == f3244g) {
                    throw th;
                }
            } while (!compareAndSet(1, obj2, f3245h));
            throw th;
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (!(obj4 == e || !compareAndSet(0, obj4, f3245h) || obj4 == null)) {
            ((a) obj4).a(this);
        }
        do {
            obj = get(1);
            if (obj == f3243f || obj == f3244g) {
                return;
            }
        } while (!compareAndSet(1, obj, f3245h));
    }
}
