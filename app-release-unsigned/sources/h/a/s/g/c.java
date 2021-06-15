package h.a.s.g;

import h.a.m;
import h.a.s.a.e;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends m {
    public static final m a = h.a.u.a.a;
    public final Executor b;

    public final class a implements Runnable {
        public final b e;

        public a(b bVar) {
            this.e = bVar;
        }

        public void run() {
            b bVar = this.e;
            h.a.s.a.b.c(bVar.f3213f, c.this.b(bVar));
        }
    }

    public static final class b extends AtomicReference<Runnable> implements Runnable, h.a.p.c {
        public final e e = new e();

        /* renamed from: f  reason: collision with root package name */
        public final e f3213f = new e();

        public b(Runnable runnable) {
            super(runnable);
        }

        @Override // h.a.p.c
        public void e() {
            if (getAndSet(null) != null) {
                this.e.e();
                this.f3213f.e();
            }
        }

        public void run() {
            h.a.s.a.b bVar = h.a.s.a.b.DISPOSED;
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    this.e.lazySet(bVar);
                    this.f3213f.lazySet(bVar);
                }
            }
        }
    }

    /* renamed from: h.a.s.g.c$c  reason: collision with other inner class name */
    public static final class RunnableC0113c extends m.b implements Runnable {
        public final boolean e;

        /* renamed from: f  reason: collision with root package name */
        public final Executor f3214f;

        /* renamed from: g  reason: collision with root package name */
        public final h.a.s.f.a<Runnable> f3215g;

        /* renamed from: h  reason: collision with root package name */
        public volatile boolean f3216h;

        /* renamed from: i  reason: collision with root package name */
        public final AtomicInteger f3217i = new AtomicInteger();

        /* renamed from: j  reason: collision with root package name */
        public final h.a.p.b f3218j = new h.a.p.b();

        /* renamed from: h.a.s.g.c$c$a */
        public static final class a extends AtomicBoolean implements Runnable, h.a.p.c {
            public final Runnable e;

            public a(Runnable runnable) {
                this.e = runnable;
            }

            @Override // h.a.p.c
            public void e() {
                lazySet(true);
            }

            public void run() {
                if (!get()) {
                    try {
                        this.e.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }
        }

        /* renamed from: h.a.s.g.c$c$b */
        public static final class b extends AtomicInteger implements Runnable, h.a.p.c {
            public final Runnable e;

            /* renamed from: f  reason: collision with root package name */
            public final h.a.s.a.a f3219f;

            /* renamed from: g  reason: collision with root package name */
            public volatile Thread f3220g;

            public b(Runnable runnable, h.a.s.a.a aVar) {
                this.e = runnable;
                this.f3219f = aVar;
            }

            public void a() {
                h.a.s.a.a aVar = this.f3219f;
                if (aVar != null) {
                    aVar.a(this);
                }
            }

            @Override // h.a.p.c
            public void e() {
                while (true) {
                    int i2 = get();
                    if (i2 < 2) {
                        if (i2 == 0) {
                            if (compareAndSet(0, 4)) {
                                break;
                            }
                        } else if (compareAndSet(1, 3)) {
                            Thread thread = this.f3220g;
                            if (thread != null) {
                                thread.interrupt();
                                this.f3220g = null;
                            }
                            set(4);
                        }
                    } else {
                        return;
                    }
                }
                a();
            }

            public void run() {
                if (get() == 0) {
                    this.f3220g = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.e.run();
                            this.f3220g = null;
                            if (compareAndSet(1, 2)) {
                                a();
                                return;
                            }
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        } catch (Throwable th) {
                            this.f3220g = null;
                            if (!compareAndSet(1, 2)) {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            } else {
                                a();
                            }
                            throw th;
                        }
                    } else {
                        this.f3220g = null;
                    }
                }
            }
        }

        /* renamed from: h.a.s.g.c$c$c  reason: collision with other inner class name */
        public final class RunnableC0114c implements Runnable {
            public final e e;

            /* renamed from: f  reason: collision with root package name */
            public final Runnable f3221f;

            public RunnableC0114c(e eVar, Runnable runnable) {
                this.e = eVar;
                this.f3221f = runnable;
            }

            public void run() {
                h.a.s.a.b.c(this.e, RunnableC0113c.this.b(this.f3221f));
            }
        }

        public RunnableC0113c(Executor executor, boolean z) {
            this.f3214f = executor;
            this.f3215g = new h.a.s.f.a<>();
            this.e = z;
        }

        @Override // h.a.m.b
        public h.a.p.c b(Runnable runnable) {
            h.a.p.c cVar;
            h.a.s.a.c cVar2 = h.a.s.a.c.INSTANCE;
            if (this.f3216h) {
                return cVar2;
            }
            Objects.requireNonNull(runnable, "run is null");
            if (this.e) {
                cVar = new b(runnable, this.f3218j);
                this.f3218j.c(cVar);
            } else {
                cVar = new a(runnable);
            }
            this.f3215g.i(cVar);
            if (this.f3217i.getAndIncrement() == 0) {
                try {
                    this.f3214f.execute(this);
                } catch (RejectedExecutionException e2) {
                    this.f3216h = true;
                    this.f3215g.clear();
                    h.a.t.a.M(e2);
                    return cVar2;
                }
            }
            return cVar;
        }

        @Override // h.a.m.b
        public h.a.p.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
            h.a.s.a.c cVar = h.a.s.a.c.INSTANCE;
            if (j2 <= 0) {
                return b(runnable);
            }
            if (this.f3216h) {
                return cVar;
            }
            e eVar = new e();
            e eVar2 = new e(eVar);
            Objects.requireNonNull(runnable, "run is null");
            i iVar = new i(new RunnableC0114c(eVar2, runnable), this.f3218j);
            this.f3218j.c(iVar);
            Executor executor = this.f3214f;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    iVar.a(((ScheduledExecutorService) executor).schedule((Callable) iVar, j2, timeUnit));
                } catch (RejectedExecutionException e2) {
                    this.f3216h = true;
                    h.a.t.a.M(e2);
                    return cVar;
                }
            } else {
                iVar.a(new b(c.a.c(iVar, j2, timeUnit)));
            }
            h.a.s.a.b.c(eVar, iVar);
            return eVar2;
        }

        @Override // h.a.p.c
        public void e() {
            if (!this.f3216h) {
                this.f3216h = true;
                this.f3218j.e();
                if (this.f3217i.getAndIncrement() == 0) {
                    this.f3215g.clear();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            r1 = r3.f3217i.addAndGet(-r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            if (r1 != 0) goto L_0x0003;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r3.f3216h == false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0.clear();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                h.a.s.f.a<java.lang.Runnable> r0 = r3.f3215g
                r1 = 1
            L_0x0003:
                boolean r2 = r3.f3216h
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            L_0x000b:
                java.lang.Object r2 = r0.d()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                if (r2 != 0) goto L_0x0025
                boolean r2 = r3.f3216h
                if (r2 == 0) goto L_0x001b
                r0.clear()
                return
            L_0x001b:
                java.util.concurrent.atomic.AtomicInteger r2 = r3.f3217i
                int r1 = -r1
                int r1 = r2.addAndGet(r1)
                if (r1 != 0) goto L_0x0003
                return
            L_0x0025:
                r2.run()
                boolean r2 = r3.f3216h
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h.a.s.g.c.RunnableC0113c.run():void");
        }
    }

    public c(Executor executor, boolean z) {
        this.b = executor;
    }

    @Override // h.a.m
    public m.b a() {
        return new RunnableC0113c(this.b, false);
    }

    @Override // h.a.m
    public h.a.p.c b(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        try {
            if (this.b instanceof ExecutorService) {
                h hVar = new h(runnable);
                hVar.a(((ExecutorService) this.b).submit(hVar));
                return hVar;
            }
            RunnableC0113c.a aVar = new RunnableC0113c.a(runnable);
            this.b.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e) {
            h.a.t.a.M(e);
            return h.a.s.a.c.INSTANCE;
        }
    }

    @Override // h.a.m
    public h.a.p.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        if (this.b instanceof ScheduledExecutorService) {
            try {
                h hVar = new h(runnable);
                hVar.a(((ScheduledExecutorService) this.b).schedule(hVar, j2, timeUnit));
                return hVar;
            } catch (RejectedExecutionException e) {
                h.a.t.a.M(e);
                return h.a.s.a.c.INSTANCE;
            }
        } else {
            b bVar = new b(runnable);
            h.a.s.a.b.c(bVar.e, a.c(new a(bVar), j2, timeUnit));
            return bVar;
        }
    }
}
