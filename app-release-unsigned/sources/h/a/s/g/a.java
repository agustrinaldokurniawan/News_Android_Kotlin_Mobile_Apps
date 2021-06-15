package h.a.s.g;

import h.a.m;
import h.a.s.a.d;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class a extends m {
    public static final b a;
    public static final g b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f3204c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f3205d;
    public final ThreadFactory e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<b> f3206f;

    /* renamed from: h.a.s.g.a$a  reason: collision with other inner class name */
    public static final class C0112a extends m.b {
        public final d e;

        /* renamed from: f  reason: collision with root package name */
        public final h.a.p.b f3207f;

        /* renamed from: g  reason: collision with root package name */
        public final d f3208g;

        /* renamed from: h  reason: collision with root package name */
        public final c f3209h;

        /* renamed from: i  reason: collision with root package name */
        public volatile boolean f3210i;

        public C0112a(c cVar) {
            this.f3209h = cVar;
            d dVar = new d();
            this.e = dVar;
            h.a.p.b bVar = new h.a.p.b();
            this.f3207f = bVar;
            d dVar2 = new d();
            this.f3208g = dVar2;
            dVar2.c(dVar);
            dVar2.c(bVar);
        }

        @Override // h.a.m.b
        public h.a.p.c b(Runnable runnable) {
            return this.f3210i ? h.a.s.a.c.INSTANCE : this.f3209h.d(runnable, 0, TimeUnit.MILLISECONDS, this.e);
        }

        @Override // h.a.m.b
        public h.a.p.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
            return this.f3210i ? h.a.s.a.c.INSTANCE : this.f3209h.d(runnable, j2, timeUnit, this.f3207f);
        }

        @Override // h.a.p.c
        public void e() {
            if (!this.f3210i) {
                this.f3210i = true;
                this.f3208g.e();
            }
        }
    }

    public static final class b {
        public final int a;
        public final c[] b;

        /* renamed from: c  reason: collision with root package name */
        public long f3211c;

        public b(int i2, ThreadFactory threadFactory) {
            this.a = i2;
            this.b = new c[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                this.b[i3] = new c(threadFactory);
            }
        }

        public c a() {
            int i2 = this.a;
            if (i2 == 0) {
                return a.f3205d;
            }
            c[] cVarArr = this.b;
            long j2 = this.f3211c;
            this.f3211c = 1 + j2;
            return cVarArr[(int) (j2 % ((long) i2))];
        }
    }

    public static final class c extends f {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f3204c = availableProcessors;
        c cVar = new c(new g("RxComputationShutdown"));
        f3205d = cVar;
        cVar.e();
        g gVar = new g("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        b = gVar;
        b bVar = new b(0, gVar);
        a = bVar;
        for (c cVar2 : bVar.b) {
            cVar2.e();
        }
    }

    public a() {
        g gVar = b;
        this.e = gVar;
        b bVar = a;
        AtomicReference<b> atomicReference = new AtomicReference<>(bVar);
        this.f3206f = atomicReference;
        b bVar2 = new b(f3204c, gVar);
        if (!atomicReference.compareAndSet(bVar, bVar2)) {
            for (c cVar : bVar2.b) {
                cVar.e();
            }
        }
    }

    @Override // h.a.m
    public m.b a() {
        return new C0112a(this.f3206f.get().a());
    }

    @Override // h.a.m
    public h.a.p.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
        Future future;
        c a2 = this.f3206f.get().a();
        Objects.requireNonNull(a2);
        Objects.requireNonNull(runnable, "run is null");
        h hVar = new h(runnable);
        if (j2 <= 0) {
            try {
                future = a2.e.submit(hVar);
            } catch (RejectedExecutionException e2) {
                h.a.t.a.M(e2);
                return h.a.s.a.c.INSTANCE;
            }
        } else {
            future = a2.e.schedule(hVar, j2, timeUnit);
        }
        hVar.a(future);
        return hVar;
    }
}
