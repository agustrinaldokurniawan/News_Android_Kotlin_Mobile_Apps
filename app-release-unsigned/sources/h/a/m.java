package h.a;

import h.a.p.c;
import h.a.s.g.f;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public abstract class m {

    public static final class a implements c, Runnable {
        public final Runnable e;

        /* renamed from: f  reason: collision with root package name */
        public final b f3075f;

        /* renamed from: g  reason: collision with root package name */
        public Thread f3076g;

        public a(Runnable runnable, b bVar) {
            this.e = runnable;
            this.f3075f = bVar;
        }

        @Override // h.a.p.c
        public void e() {
            if (this.f3076g == Thread.currentThread()) {
                b bVar = this.f3075f;
                if (bVar instanceof f) {
                    f fVar = (f) bVar;
                    if (!fVar.f3237f) {
                        fVar.f3237f = true;
                        fVar.e.shutdown();
                        return;
                    }
                    return;
                }
            }
            this.f3075f.e();
        }

        public void run() {
            this.f3076g = Thread.currentThread();
            try {
                this.e.run();
            } finally {
                e();
                this.f3076g = null;
            }
        }
    }

    public static abstract class b implements c {
        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public c b(Runnable runnable) {
            return c(runnable, 0, TimeUnit.NANOSECONDS);
        }

        public abstract c c(Runnable runnable, long j2, TimeUnit timeUnit);
    }

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());
    }

    public abstract b a();

    public c b(Runnable runnable) {
        return c(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public c c(Runnable runnable, long j2, TimeUnit timeUnit) {
        b a2 = a();
        Objects.requireNonNull(runnable, "run is null");
        a aVar = new a(runnable, a2);
        a2.c(aVar, j2, timeUnit);
        return aVar;
    }
}
