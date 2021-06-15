package h.a.s.g;

import h.a.m;
import h.a.p.e;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class l extends m {
    public static final l a = new l();

    public static final class a implements Runnable {
        public final Runnable e;

        /* renamed from: f  reason: collision with root package name */
        public final c f3252f;

        /* renamed from: g  reason: collision with root package name */
        public final long f3253g;

        public a(Runnable runnable, c cVar, long j2) {
            this.e = runnable;
            this.f3252f = cVar;
            this.f3253g = j2;
        }

        public void run() {
            if (!this.f3252f.f3259h) {
                long a = this.f3252f.a(TimeUnit.MILLISECONDS);
                long j2 = this.f3253g;
                if (j2 > a) {
                    try {
                        Thread.sleep(j2 - a);
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        h.a.t.a.M(e2);
                        return;
                    }
                }
                if (!this.f3252f.f3259h) {
                    this.e.run();
                }
            }
        }
    }

    public static final class b implements Comparable<b> {
        public final Runnable e;

        /* renamed from: f  reason: collision with root package name */
        public final long f3254f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3255g;

        /* renamed from: h  reason: collision with root package name */
        public volatile boolean f3256h;

        public b(Runnable runnable, Long l2, int i2) {
            this.e = runnable;
            this.f3254f = l2.longValue();
            this.f3255g = i2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            b bVar2 = bVar;
            int i2 = (this.f3254f > bVar2.f3254f ? 1 : (this.f3254f == bVar2.f3254f ? 0 : -1));
            int i3 = 1;
            int i4 = i2 < 0 ? -1 : i2 > 0 ? 1 : 0;
            if (i4 != 0) {
                return i4;
            }
            int i5 = this.f3255g;
            int i6 = bVar2.f3255g;
            if (i5 < i6) {
                i3 = -1;
            } else if (i5 <= i6) {
                i3 = 0;
            }
            return i3;
        }
    }

    public static final class c extends m.b implements h.a.p.c {
        public final PriorityBlockingQueue<b> e = new PriorityBlockingQueue<>();

        /* renamed from: f  reason: collision with root package name */
        public final AtomicInteger f3257f = new AtomicInteger();

        /* renamed from: g  reason: collision with root package name */
        public final AtomicInteger f3258g = new AtomicInteger();

        /* renamed from: h  reason: collision with root package name */
        public volatile boolean f3259h;

        public final class a implements Runnable {
            public final b e;

            public a(b bVar) {
                this.e = bVar;
            }

            public void run() {
                this.e.f3256h = true;
                c.this.e.remove(this.e);
            }
        }

        @Override // h.a.m.b
        public h.a.p.c b(Runnable runnable) {
            return d(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // h.a.m.b
        public h.a.p.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j2) + a(TimeUnit.MILLISECONDS);
            return d(new a(runnable, this, millis), millis);
        }

        public h.a.p.c d(Runnable runnable, long j2) {
            h.a.s.a.c cVar = h.a.s.a.c.INSTANCE;
            if (this.f3259h) {
                return cVar;
            }
            b bVar = new b(runnable, Long.valueOf(j2), this.f3258g.incrementAndGet());
            this.e.add(bVar);
            if (this.f3257f.getAndIncrement() != 0) {
                return new e(new a(bVar));
            }
            int i2 = 1;
            while (!this.f3259h) {
                b poll = this.e.poll();
                if (poll == null) {
                    i2 = this.f3257f.addAndGet(-i2);
                    if (i2 == 0) {
                        return cVar;
                    }
                } else if (!poll.f3256h) {
                    poll.e.run();
                }
            }
            this.e.clear();
            return cVar;
        }

        @Override // h.a.p.c
        public void e() {
            this.f3259h = true;
        }
    }

    @Override // h.a.m
    public m.b a() {
        return new c();
    }

    @Override // h.a.m
    public h.a.p.c b(Runnable runnable) {
        runnable.run();
        return h.a.s.a.c.INSTANCE;
    }

    @Override // h.a.m
    public h.a.p.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j2);
            Objects.requireNonNull(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            h.a.t.a.M(e);
        }
        return h.a.s.a.c.INSTANCE;
    }
}
