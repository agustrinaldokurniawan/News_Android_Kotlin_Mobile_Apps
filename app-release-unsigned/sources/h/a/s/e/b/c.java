package h.a.s.e.b;

import h.a.f;

public final class c<T> extends a<T, T> {

    /* renamed from: g  reason: collision with root package name */
    public final h.a.r.b<? super T> f3106g;

    /* renamed from: h  reason: collision with root package name */
    public final h.a.r.b<? super Throwable> f3107h;

    /* renamed from: i  reason: collision with root package name */
    public final h.a.r.a f3108i;

    /* renamed from: j  reason: collision with root package name */
    public final h.a.r.a f3109j;

    public static final class a<T> extends h.a.s.h.a<T, T> {

        /* renamed from: j  reason: collision with root package name */
        public final h.a.r.b<? super T> f3110j;

        /* renamed from: k  reason: collision with root package name */
        public final h.a.r.b<? super Throwable> f3111k;

        /* renamed from: l  reason: collision with root package name */
        public final h.a.r.a f3112l;

        /* renamed from: m  reason: collision with root package name */
        public final h.a.r.a f3113m;

        public a(h.a.s.c.a<? super T> aVar, h.a.r.b<? super T> bVar, h.a.r.b<? super Throwable> bVar2, h.a.r.a aVar2, h.a.r.a aVar3) {
            super(aVar);
            this.f3110j = bVar;
            this.f3111k = bVar2;
            this.f3112l = aVar2;
            this.f3113m = aVar3;
        }

        @Override // h.a.s.h.a, l.b.b
        public void a() {
            if (!this.f3263h) {
                try {
                    this.f3112l.run();
                    this.f3263h = true;
                    this.e.a();
                    try {
                        this.f3113m.run();
                    } catch (Throwable th) {
                        c.f.a.b.h(th);
                        h.a.t.a.M(th);
                    }
                } catch (Throwable th2) {
                    e(th2);
                }
            }
        }

        @Override // h.a.s.h.a, l.b.b
        public void b(Throwable th) {
            if (this.f3263h) {
                h.a.t.a.M(th);
                return;
            }
            boolean z = true;
            this.f3263h = true;
            try {
                this.f3111k.a(th);
            } catch (Throwable th2) {
                c.f.a.b.h(th2);
                this.e.b(new h.a.q.a(th, th2));
                z = false;
            }
            if (z) {
                this.e.b(th);
            }
            try {
                this.f3113m.run();
            } catch (Throwable th3) {
                c.f.a.b.h(th3);
                h.a.t.a.M(th3);
            }
        }

        @Override // l.b.b
        public void c(T t) {
            if (!this.f3263h) {
                if (this.f3264i != 0) {
                    this.e.c(null);
                    return;
                }
                try {
                    this.f3110j.a(t);
                    this.e.c(t);
                } catch (Throwable th) {
                    e(th);
                }
            }
        }

        @Override // h.a.s.c.e
        public T d() {
            try {
                T d2 = this.f3262g.d();
                if (d2 != null) {
                    try {
                        this.f3110j.a(d2);
                    } catch (Throwable th) {
                        throw new h.a.q.a(th, th);
                    }
                } else {
                    if (this.f3264i == 1) {
                        this.f3112l.run();
                    }
                    return d2;
                }
                this.f3113m.run();
                return d2;
            } catch (Throwable th2) {
                throw new h.a.q.a(th, th2);
            }
        }

        @Override // h.a.s.c.a
        public boolean h(T t) {
            if (this.f3263h) {
                return false;
            }
            try {
                this.f3110j.a(t);
                return this.e.h(t);
            } catch (Throwable th) {
                e(th);
                return false;
            }
        }

        @Override // h.a.s.c.b
        public int j(int i2) {
            return k(i2);
        }
    }

    public static final class b<T> extends h.a.s.h.b<T, T> {

        /* renamed from: j  reason: collision with root package name */
        public final h.a.r.b<? super T> f3114j;

        /* renamed from: k  reason: collision with root package name */
        public final h.a.r.b<? super Throwable> f3115k;

        /* renamed from: l  reason: collision with root package name */
        public final h.a.r.a f3116l;

        /* renamed from: m  reason: collision with root package name */
        public final h.a.r.a f3117m;

        public b(l.b.b<? super T> bVar, h.a.r.b<? super T> bVar2, h.a.r.b<? super Throwable> bVar3, h.a.r.a aVar, h.a.r.a aVar2) {
            super(bVar);
            this.f3114j = bVar2;
            this.f3115k = bVar3;
            this.f3116l = aVar;
            this.f3117m = aVar2;
        }

        @Override // h.a.s.h.b, l.b.b
        public void a() {
            if (!this.f3267h) {
                try {
                    this.f3116l.run();
                    this.f3267h = true;
                    this.e.a();
                    try {
                        this.f3117m.run();
                    } catch (Throwable th) {
                        c.f.a.b.h(th);
                        h.a.t.a.M(th);
                    }
                } catch (Throwable th2) {
                    e(th2);
                }
            }
        }

        @Override // h.a.s.h.b, l.b.b
        public void b(Throwable th) {
            if (this.f3267h) {
                h.a.t.a.M(th);
                return;
            }
            boolean z = true;
            this.f3267h = true;
            try {
                this.f3115k.a(th);
            } catch (Throwable th2) {
                c.f.a.b.h(th2);
                this.e.b(new h.a.q.a(th, th2));
                z = false;
            }
            if (z) {
                this.e.b(th);
            }
            try {
                this.f3117m.run();
            } catch (Throwable th3) {
                c.f.a.b.h(th3);
                h.a.t.a.M(th3);
            }
        }

        @Override // l.b.b
        public void c(T t) {
            if (!this.f3267h) {
                if (this.f3268i != 0) {
                    this.e.c(null);
                    return;
                }
                try {
                    this.f3114j.a(t);
                    this.e.c(t);
                } catch (Throwable th) {
                    e(th);
                }
            }
        }

        @Override // h.a.s.c.e
        public T d() {
            try {
                T d2 = this.f3266g.d();
                if (d2 != null) {
                    try {
                        this.f3114j.a(d2);
                    } catch (Throwable th) {
                        throw new h.a.q.a(th, th);
                    }
                } else {
                    if (this.f3268i == 1) {
                        this.f3116l.run();
                    }
                    return d2;
                }
                this.f3117m.run();
                return d2;
            } catch (Throwable th2) {
                throw new h.a.q.a(th, th2);
            }
        }

        @Override // h.a.s.c.b
        public int j(int i2) {
            return k(i2);
        }
    }

    public c(h.a.c<T> cVar, h.a.r.b<? super T> bVar, h.a.r.b<? super Throwable> bVar2, h.a.r.a aVar, h.a.r.a aVar2) {
        super(cVar);
        this.f3106g = bVar;
        this.f3107h = bVar2;
        this.f3108i = aVar;
        this.f3109j = aVar2;
    }

    @Override // h.a.c
    public void g(l.b.b<? super T> bVar) {
        f<? super T> fVar;
        h.a.c<T> cVar;
        if (bVar instanceof h.a.s.c.a) {
            cVar = this.f3094f;
            fVar = new a<>((h.a.s.c.a) bVar, this.f3106g, this.f3107h, this.f3108i, this.f3109j);
        } else {
            cVar = this.f3094f;
            fVar = new b<>(bVar, this.f3106g, this.f3107h, this.f3108i, this.f3109j);
        }
        cVar.f(fVar);
    }
}
