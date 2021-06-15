package h.a.s.e.b;

import h.a.f;
import h.a.s.c.d;
import java.util.concurrent.atomic.AtomicLong;
import l.b.b;
import l.b.c;

public final class i<T> extends a<T, T> {

    /* renamed from: g  reason: collision with root package name */
    public final int f3146g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3147h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3148i;

    /* renamed from: j  reason: collision with root package name */
    public final h.a.r.a f3149j;

    public static final class a<T> extends h.a.s.i.a<T> implements f<T> {
        public final b<? super T> e;

        /* renamed from: f  reason: collision with root package name */
        public final d<T> f3150f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f3151g;

        /* renamed from: h  reason: collision with root package name */
        public final h.a.r.a f3152h;

        /* renamed from: i  reason: collision with root package name */
        public c f3153i;

        /* renamed from: j  reason: collision with root package name */
        public volatile boolean f3154j;

        /* renamed from: k  reason: collision with root package name */
        public volatile boolean f3155k;

        /* renamed from: l  reason: collision with root package name */
        public Throwable f3156l;

        /* renamed from: m  reason: collision with root package name */
        public final AtomicLong f3157m = new AtomicLong();
        public boolean n;

        public a(b<? super T> bVar, int i2, boolean z, boolean z2, h.a.r.a aVar) {
            this.e = bVar;
            this.f3152h = aVar;
            this.f3151g = z2;
            this.f3150f = z ? new h.a.s.f.c<>(i2) : new h.a.s.f.b<>(i2);
        }

        @Override // l.b.b
        public void a() {
            this.f3155k = true;
            if (this.n) {
                this.e.a();
            } else {
                k();
            }
        }

        @Override // l.b.b
        public void b(Throwable th) {
            this.f3156l = th;
            this.f3155k = true;
            if (this.n) {
                this.e.b(th);
            } else {
                k();
            }
        }

        @Override // l.b.b
        public void c(T t) {
            if (!this.f3150f.i(t)) {
                this.f3153i.cancel();
                h.a.q.b bVar = new h.a.q.b("Buffer is full");
                try {
                    this.f3152h.run();
                } catch (Throwable th) {
                    c.f.a.b.h(th);
                    bVar.initCause(th);
                }
                b(bVar);
            } else if (this.n) {
                this.e.c(null);
            } else {
                k();
            }
        }

        @Override // l.b.c
        public void cancel() {
            if (!this.f3154j) {
                this.f3154j = true;
                this.f3153i.cancel();
                if (!this.n && getAndIncrement() == 0) {
                    this.f3150f.clear();
                }
            }
        }

        @Override // h.a.s.c.e
        public void clear() {
            this.f3150f.clear();
        }

        @Override // h.a.s.c.e
        public T d() {
            return this.f3150f.d();
        }

        public boolean e(boolean z, boolean z2, b<? super T> bVar) {
            if (this.f3154j) {
                this.f3150f.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f3151g) {
                    Throwable th = this.f3156l;
                    if (th != null) {
                        this.f3150f.clear();
                        bVar.b(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        bVar.a();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.f3156l;
                    if (th2 != null) {
                        bVar.b(th2);
                    } else {
                        bVar.a();
                    }
                    return true;
                }
            }
        }

        @Override // l.b.c
        public void f(long j2) {
            if (!this.n && h.a.s.i.c.c(j2)) {
                c.f.a.b.a(this.f3157m, j2);
                k();
            }
        }

        @Override // h.a.f, l.b.b
        public void g(c cVar) {
            if (h.a.s.i.c.d(this.f3153i, cVar)) {
                this.f3153i = cVar;
                this.e.g(this);
                cVar.f(Long.MAX_VALUE);
            }
        }

        @Override // h.a.s.c.e
        public boolean isEmpty() {
            return this.f3150f.isEmpty();
        }

        @Override // h.a.s.c.b
        public int j(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.n = true;
            return 2;
        }

        public void k() {
            int i2;
            if (getAndIncrement() == 0) {
                d<T> dVar = this.f3150f;
                b<? super T> bVar = this.e;
                int i3 = 1;
                while (!e(this.f3155k, dVar.isEmpty(), bVar)) {
                    long j2 = this.f3157m.get();
                    long j3 = 0;
                    while (true) {
                        i2 = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
                        if (i2 == 0) {
                            break;
                        }
                        boolean z = this.f3155k;
                        T d2 = dVar.d();
                        boolean z2 = d2 == null;
                        if (!e(z, z2, bVar)) {
                            if (z2) {
                                break;
                            }
                            bVar.c(d2);
                            j3++;
                        } else {
                            return;
                        }
                    }
                    if (i2 != 0 || !e(this.f3155k, dVar.isEmpty(), bVar)) {
                        if (!(j3 == 0 || j2 == Long.MAX_VALUE)) {
                            this.f3157m.addAndGet(-j3);
                        }
                        i3 = addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public i(h.a.c<T> cVar, int i2, boolean z, boolean z2, h.a.r.a aVar) {
        super(cVar);
        this.f3146g = i2;
        this.f3147h = z;
        this.f3148i = z2;
        this.f3149j = aVar;
    }

    @Override // h.a.c
    public void g(b<? super T> bVar) {
        this.f3094f.f(new a(bVar, this.f3146g, this.f3147h, this.f3148i, this.f3149j));
    }
}
