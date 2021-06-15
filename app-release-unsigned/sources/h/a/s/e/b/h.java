package h.a.s.e.b;

import h.a.f;
import h.a.m;
import h.a.s.c.e;
import java.util.concurrent.atomic.AtomicLong;

public final class h<T> extends a<T, T> {

    /* renamed from: g  reason: collision with root package name */
    public final m f3135g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3136h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3137i;

    public static abstract class a<T> extends h.a.s.i.a<T> implements f<T>, Runnable {
        public final m.b e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f3138f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3139g;

        /* renamed from: h  reason: collision with root package name */
        public final int f3140h;

        /* renamed from: i  reason: collision with root package name */
        public final AtomicLong f3141i = new AtomicLong();

        /* renamed from: j  reason: collision with root package name */
        public l.b.c f3142j;

        /* renamed from: k  reason: collision with root package name */
        public e<T> f3143k;

        /* renamed from: l  reason: collision with root package name */
        public volatile boolean f3144l;

        /* renamed from: m  reason: collision with root package name */
        public volatile boolean f3145m;
        public Throwable n;
        public int o;
        public long p;
        public boolean q;

        public a(m.b bVar, boolean z, int i2) {
            this.e = bVar;
            this.f3138f = z;
            this.f3139g = i2;
            this.f3140h = i2 - (i2 >> 2);
        }

        @Override // l.b.b
        public final void a() {
            if (!this.f3145m) {
                this.f3145m = true;
                n();
            }
        }

        @Override // l.b.b
        public final void b(Throwable th) {
            if (this.f3145m) {
                h.a.t.a.M(th);
                return;
            }
            this.n = th;
            this.f3145m = true;
            n();
        }

        @Override // l.b.b
        public final void c(T t) {
            if (!this.f3145m) {
                if (this.o == 2) {
                    n();
                    return;
                }
                if (!this.f3143k.i(t)) {
                    this.f3142j.cancel();
                    this.n = new h.a.q.b("Queue is full?!");
                    this.f3145m = true;
                }
                n();
            }
        }

        @Override // l.b.c
        public final void cancel() {
            if (!this.f3144l) {
                this.f3144l = true;
                this.f3142j.cancel();
                this.e.e();
                if (!this.q && getAndIncrement() == 0) {
                    this.f3143k.clear();
                }
            }
        }

        @Override // h.a.s.c.e
        public final void clear() {
            this.f3143k.clear();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r3 != null) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean e(boolean r3, boolean r4, l.b.b<?> r5) {
            /*
                r2 = this;
                boolean r0 = r2.f3144l
                r1 = 1
                if (r0 == 0) goto L_0x000b
                h.a.s.c.e<T> r3 = r2.f3143k
                r3.clear()
                return r1
            L_0x000b:
                if (r3 == 0) goto L_0x0037
                boolean r3 = r2.f3138f
                if (r3 == 0) goto L_0x0020
                if (r4 == 0) goto L_0x0037
                r2.f3144l = r1
                java.lang.Throwable r3 = r2.n
                if (r3 == 0) goto L_0x0033
                goto L_0x002b
            L_0x001a:
                h.a.m$b r3 = r2.e
                r3.e()
                return r1
            L_0x0020:
                java.lang.Throwable r3 = r2.n
                if (r3 == 0) goto L_0x002f
                r2.f3144l = r1
                h.a.s.c.e<T> r4 = r2.f3143k
                r4.clear()
            L_0x002b:
                r5.b(r3)
                goto L_0x001a
            L_0x002f:
                if (r4 == 0) goto L_0x0037
                r2.f3144l = r1
            L_0x0033:
                r5.a()
                goto L_0x001a
            L_0x0037:
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: h.a.s.e.b.h.a.e(boolean, boolean, l.b.b):boolean");
        }

        @Override // l.b.c
        public final void f(long j2) {
            if (h.a.s.i.c.c(j2)) {
                c.f.a.b.a(this.f3141i, j2);
                n();
            }
        }

        @Override // h.a.s.c.e
        public final boolean isEmpty() {
            return this.f3143k.isEmpty();
        }

        @Override // h.a.s.c.b
        public final int j(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.q = true;
            return 2;
        }

        public abstract void k();

        public abstract void l();

        public abstract void m();

        public final void n() {
            if (getAndIncrement() == 0) {
                this.e.b(this);
            }
        }

        public final void run() {
            if (this.q) {
                l();
            } else if (this.o == 1) {
                m();
            } else {
                k();
            }
        }
    }

    public static final class b<T> extends a<T> {
        public final h.a.s.c.a<? super T> r;
        public long s;

        public b(h.a.s.c.a<? super T> aVar, m.b bVar, boolean z, int i2) {
            super(bVar, z, i2);
            this.r = aVar;
        }

        @Override // h.a.s.c.e
        public T d() {
            T d2 = this.f3143k.d();
            if (!(d2 == null || this.o == 1)) {
                long j2 = this.s + 1;
                if (j2 == ((long) this.f3140h)) {
                    this.s = 0;
                    this.f3142j.f(j2);
                } else {
                    this.s = j2;
                }
            }
            return d2;
        }

        @Override // h.a.f, l.b.b
        public void g(l.b.c cVar) {
            if (h.a.s.i.c.d(this.f3142j, cVar)) {
                this.f3142j = cVar;
                if (cVar instanceof h.a.s.c.c) {
                    h.a.s.c.c cVar2 = (h.a.s.c.c) cVar;
                    int j2 = cVar2.j(7);
                    if (j2 == 1) {
                        this.o = 1;
                        this.f3143k = cVar2;
                        this.f3145m = true;
                        this.r.g(this);
                        return;
                    } else if (j2 == 2) {
                        this.o = 2;
                        this.f3143k = cVar2;
                        this.r.g(this);
                        cVar.f((long) this.f3139g);
                        return;
                    }
                }
                this.f3143k = new h.a.s.f.b(this.f3139g);
                this.r.g(this);
                cVar.f((long) this.f3139g);
            }
        }

        @Override // h.a.s.e.b.h.a
        public void k() {
            int i2;
            h.a.s.c.a<? super T> aVar = this.r;
            e<T> eVar = this.f3143k;
            long j2 = this.p;
            long j3 = this.s;
            int i3 = 1;
            while (true) {
                long j4 = this.f3141i.get();
                while (true) {
                    i2 = (j2 > j4 ? 1 : (j2 == j4 ? 0 : -1));
                    if (i2 == 0) {
                        break;
                    }
                    boolean z = this.f3145m;
                    try {
                        T d2 = eVar.d();
                        boolean z2 = d2 == null;
                        if (!e(z, z2, aVar)) {
                            if (z2) {
                                break;
                            }
                            if (aVar.h(d2)) {
                                j2++;
                            }
                            j3++;
                            if (j3 == ((long) this.f3140h)) {
                                this.f3142j.f(j3);
                                j3 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        c.f.a.b.h(th);
                        this.f3144l = true;
                        this.f3142j.cancel();
                        eVar.clear();
                        aVar.b(th);
                        this.e.e();
                        return;
                    }
                }
                if (i2 != 0 || !e(this.f3145m, eVar.isEmpty(), aVar)) {
                    int i4 = get();
                    if (i3 == i4) {
                        this.p = j2;
                        this.s = j3;
                        i3 = addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    } else {
                        i3 = i4;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // h.a.s.e.b.h.a
        public void l() {
            int i2 = 1;
            while (!this.f3144l) {
                boolean z = this.f3145m;
                this.r.c(null);
                if (z) {
                    this.f3144l = true;
                    Throwable th = this.n;
                    if (th != null) {
                        this.r.b(th);
                    } else {
                        this.r.a();
                    }
                    this.e.e();
                    return;
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
            if (r10.f3144l == false) goto L_0x0046;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
            if (r1.isEmpty() == false) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
            r6 = get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
            if (r5 != r6) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
            r10.p = r2;
            r5 = addAndGet(-r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
            if (r5 != 0) goto L_0x0008;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
            r5 = r6;
         */
        @Override // h.a.s.e.b.h.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m() {
            /*
                r10 = this;
                h.a.s.c.a<? super T> r0 = r10.r
                h.a.s.c.e<T> r1 = r10.f3143k
                long r2 = r10.p
                r4 = 1
                r5 = r4
            L_0x0008:
                java.util.concurrent.atomic.AtomicLong r6 = r10.f3141i
                long r6 = r6.get()
            L_0x000e:
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 == 0) goto L_0x0041
                java.lang.Object r8 = r1.d()     // Catch:{ all -> 0x0032 }
                boolean r9 = r10.f3144l
                if (r9 == 0) goto L_0x001b
                return
            L_0x001b:
                if (r8 != 0) goto L_0x0028
            L_0x001d:
                r10.f3144l = r4
                r0.a()
            L_0x0022:
                h.a.m$b r0 = r10.e
                r0.e()
                return
            L_0x0028:
                boolean r8 = r0.h(r8)
                if (r8 == 0) goto L_0x000e
                r8 = 1
                long r2 = r2 + r8
                goto L_0x000e
            L_0x0032:
                r1 = move-exception
                c.f.a.b.h(r1)
                r10.f3144l = r4
                l.b.c r2 = r10.f3142j
                r2.cancel()
                r0.b(r1)
                goto L_0x0022
            L_0x0041:
                boolean r6 = r10.f3144l
                if (r6 == 0) goto L_0x0046
                return
            L_0x0046:
                boolean r6 = r1.isEmpty()
                if (r6 == 0) goto L_0x004d
                goto L_0x001d
            L_0x004d:
                int r6 = r10.get()
                if (r5 != r6) goto L_0x005d
                r10.p = r2
                int r5 = -r5
                int r5 = r10.addAndGet(r5)
                if (r5 != 0) goto L_0x0008
                return
            L_0x005d:
                r5 = r6
                goto L_0x0008
            */
            throw new UnsupportedOperationException("Method not decompiled: h.a.s.e.b.h.b.m():void");
        }
    }

    public static final class c<T> extends a<T> implements f<T> {
        public final l.b.b<? super T> r;

        public c(l.b.b<? super T> bVar, m.b bVar2, boolean z, int i2) {
            super(bVar2, z, i2);
            this.r = bVar;
        }

        @Override // h.a.s.c.e
        public T d() {
            T d2 = this.f3143k.d();
            if (!(d2 == null || this.o == 1)) {
                long j2 = this.p + 1;
                if (j2 == ((long) this.f3140h)) {
                    this.p = 0;
                    this.f3142j.f(j2);
                } else {
                    this.p = j2;
                }
            }
            return d2;
        }

        @Override // h.a.f, l.b.b
        public void g(l.b.c cVar) {
            if (h.a.s.i.c.d(this.f3142j, cVar)) {
                this.f3142j = cVar;
                if (cVar instanceof h.a.s.c.c) {
                    h.a.s.c.c cVar2 = (h.a.s.c.c) cVar;
                    int j2 = cVar2.j(7);
                    if (j2 == 1) {
                        this.o = 1;
                        this.f3143k = cVar2;
                        this.f3145m = true;
                        this.r.g(this);
                        return;
                    } else if (j2 == 2) {
                        this.o = 2;
                        this.f3143k = cVar2;
                        this.r.g(this);
                        cVar.f((long) this.f3139g);
                        return;
                    }
                }
                this.f3143k = new h.a.s.f.b(this.f3139g);
                this.r.g(this);
                cVar.f((long) this.f3139g);
            }
        }

        @Override // h.a.s.e.b.h.a
        public void k() {
            int i2;
            l.b.b<? super T> bVar = this.r;
            e<T> eVar = this.f3143k;
            long j2 = this.p;
            int i3 = 1;
            while (true) {
                long j3 = this.f3141i.get();
                while (true) {
                    i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
                    if (i2 == 0) {
                        break;
                    }
                    boolean z = this.f3145m;
                    try {
                        T d2 = eVar.d();
                        boolean z2 = d2 == null;
                        if (!e(z, z2, bVar)) {
                            if (z2) {
                                break;
                            }
                            bVar.c(d2);
                            j2++;
                            if (j2 == ((long) this.f3140h)) {
                                if (j3 != Long.MAX_VALUE) {
                                    j3 = this.f3141i.addAndGet(-j2);
                                }
                                this.f3142j.f(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        c.f.a.b.h(th);
                        this.f3144l = true;
                        this.f3142j.cancel();
                        eVar.clear();
                        bVar.b(th);
                        this.e.e();
                        return;
                    }
                }
                if (i2 != 0 || !e(this.f3145m, eVar.isEmpty(), bVar)) {
                    int i4 = get();
                    if (i3 == i4) {
                        this.p = j2;
                        i3 = addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    } else {
                        i3 = i4;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // h.a.s.e.b.h.a
        public void l() {
            int i2 = 1;
            while (!this.f3144l) {
                boolean z = this.f3145m;
                this.r.c(null);
                if (z) {
                    this.f3144l = true;
                    Throwable th = this.n;
                    if (th != null) {
                        this.r.b(th);
                    } else {
                        this.r.a();
                    }
                    this.e.e();
                    return;
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
            if (r10.f3144l == false) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
            if (r1.isEmpty() == false) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
            r6 = get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
            if (r5 != r6) goto L_0x005a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
            r10.p = r2;
            r5 = addAndGet(-r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
            if (r5 != 0) goto L_0x0008;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
            r5 = r6;
         */
        @Override // h.a.s.e.b.h.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m() {
            /*
                r10 = this;
                l.b.b<? super T> r0 = r10.r
                h.a.s.c.e<T> r1 = r10.f3143k
                long r2 = r10.p
                r4 = 1
                r5 = r4
            L_0x0008:
                java.util.concurrent.atomic.AtomicLong r6 = r10.f3141i
                long r6 = r6.get()
            L_0x000e:
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 == 0) goto L_0x003e
                java.lang.Object r8 = r1.d()     // Catch:{ all -> 0x002f }
                boolean r9 = r10.f3144l
                if (r9 == 0) goto L_0x001b
                return
            L_0x001b:
                if (r8 != 0) goto L_0x0028
            L_0x001d:
                r10.f3144l = r4
                r0.a()
            L_0x0022:
                h.a.m$b r0 = r10.e
                r0.e()
                return
            L_0x0028:
                r0.c(r8)
                r8 = 1
                long r2 = r2 + r8
                goto L_0x000e
            L_0x002f:
                r1 = move-exception
                c.f.a.b.h(r1)
                r10.f3144l = r4
                l.b.c r2 = r10.f3142j
                r2.cancel()
                r0.b(r1)
                goto L_0x0022
            L_0x003e:
                boolean r6 = r10.f3144l
                if (r6 == 0) goto L_0x0043
                return
            L_0x0043:
                boolean r6 = r1.isEmpty()
                if (r6 == 0) goto L_0x004a
                goto L_0x001d
            L_0x004a:
                int r6 = r10.get()
                if (r5 != r6) goto L_0x005a
                r10.p = r2
                int r5 = -r5
                int r5 = r10.addAndGet(r5)
                if (r5 != 0) goto L_0x0008
                return
            L_0x005a:
                r5 = r6
                goto L_0x0008
            */
            throw new UnsupportedOperationException("Method not decompiled: h.a.s.e.b.h.c.m():void");
        }
    }

    public h(h.a.c<T> cVar, m mVar, boolean z, int i2) {
        super(cVar);
        this.f3135g = mVar;
        this.f3136h = z;
        this.f3137i = i2;
    }

    @Override // h.a.c
    public void g(l.b.b<? super T> bVar) {
        f<? super T> fVar;
        h.a.c<T> cVar;
        m.b a2 = this.f3135g.a();
        if (bVar instanceof h.a.s.c.a) {
            cVar = this.f3094f;
            fVar = new b<>((h.a.s.c.a) bVar, a2, this.f3136h, this.f3137i);
        } else {
            cVar = this.f3094f;
            fVar = new c<>(bVar, a2, this.f3136h, this.f3137i);
        }
        cVar.f(fVar);
    }
}
