package h.a.s.g;

import h.a.p.c;
import h.a.s.b.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public final class h implements Callable<Void>, c {
    public static final FutureTask<Void> e;

    /* renamed from: f  reason: collision with root package name */
    public static final FutureTask<Void> f3240f;

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f3241g;

    /* renamed from: h  reason: collision with root package name */
    public Thread f3242h;

    static {
        Runnable runnable = a.a;
        e = new FutureTask<>(runnable, null);
        f3240f = new FutureTask<>(runnable, null);
    }

    public h(Runnable runnable) {
        this.f3241g = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != e) {
                if (future2 == f3240f) {
                    future.cancel(this.f3242h != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public Void call() {
        this.f3242h = Thread.currentThread();
        try {
            this.f3241g.run();
            return null;
        } finally {
            lazySet(e);
            this.f3242h = null;
        }
    }

    @Override // h.a.p.c
    public final void e() {
        FutureTask<Void> futureTask;
        Future future = (Future) get();
        if (future != e && future != (futureTask = f3240f) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(this.f3242h != Thread.currentThread());
        }
    }
}
