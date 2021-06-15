package h.a.s.g;

import h.a.m;
import h.a.p.b;
import h.a.p.c;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class k extends m {
    public static final g a = new g("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    public static final ScheduledExecutorService b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService> f3249c;

    public static final class a extends m.b {
        public final ScheduledExecutorService e;

        /* renamed from: f  reason: collision with root package name */
        public final b f3250f = new b();

        /* renamed from: g  reason: collision with root package name */
        public volatile boolean f3251g;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.e = scheduledExecutorService;
        }

        @Override // h.a.m.b
        public c c(Runnable runnable, long j2, TimeUnit timeUnit) {
            Future<?> future;
            h.a.s.a.c cVar = h.a.s.a.c.INSTANCE;
            if (this.f3251g) {
                return cVar;
            }
            Objects.requireNonNull(runnable, "run is null");
            i iVar = new i(runnable, this.f3250f);
            this.f3250f.c(iVar);
            if (j2 <= 0) {
                try {
                    future = this.e.submit((Callable) iVar);
                } catch (RejectedExecutionException e2) {
                    e();
                    h.a.t.a.M(e2);
                    return cVar;
                }
            } else {
                future = this.e.schedule((Callable) iVar, j2, timeUnit);
            }
            iVar.a(future);
            return iVar;
        }

        @Override // h.a.p.c
        public void e() {
            if (!this.f3251g) {
                this.f3251g = true;
                this.f3250f.e();
            }
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        b = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public k() {
        g gVar = a;
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f3249c = atomicReference;
        atomicReference.lazySet(j.a(gVar));
    }

    @Override // h.a.m
    public m.b a() {
        return new a(this.f3249c.get());
    }

    @Override // h.a.m
    public c c(Runnable runnable, long j2, TimeUnit timeUnit) {
        Future future;
        Objects.requireNonNull(runnable, "run is null");
        h hVar = new h(runnable);
        if (j2 <= 0) {
            try {
                future = this.f3249c.get().submit(hVar);
            } catch (RejectedExecutionException e) {
                h.a.t.a.M(e);
                return h.a.s.a.c.INSTANCE;
            }
        } else {
            future = this.f3249c.get().schedule(hVar, j2, timeUnit);
        }
        hVar.a(future);
        return hVar;
    }
}
