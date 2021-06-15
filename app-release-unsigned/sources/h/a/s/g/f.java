package h.a.s.g;

import h.a.m;
import h.a.p.c;
import h.a.s.a.a;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class f extends m.b implements c {
    public final ScheduledExecutorService e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f3237f;

    public f(ThreadFactory threadFactory) {
        this.e = j.a(threadFactory);
    }

    @Override // h.a.m.b
    public c b(Runnable runnable) {
        return c(runnable, 0, null);
    }

    @Override // h.a.m.b
    public c c(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f3237f ? h.a.s.a.c.INSTANCE : d(runnable, j2, timeUnit, null);
    }

    public i d(Runnable runnable, long j2, TimeUnit timeUnit, a aVar) {
        Future<?> future;
        Objects.requireNonNull(runnable, "run is null");
        i iVar = new i(runnable, aVar);
        if (aVar != null && !aVar.c(iVar)) {
            return iVar;
        }
        if (j2 <= 0) {
            try {
                future = this.e.submit((Callable) iVar);
            } catch (RejectedExecutionException e2) {
                if (aVar != null) {
                    aVar.b(iVar);
                }
                h.a.t.a.M(e2);
            }
        } else {
            future = this.e.schedule((Callable) iVar, j2, timeUnit);
        }
        iVar.a(future);
        return iVar;
    }

    @Override // h.a.p.c
    public void e() {
        if (!this.f3237f) {
            this.f3237f = true;
            this.e.shutdownNow();
        }
    }
}
