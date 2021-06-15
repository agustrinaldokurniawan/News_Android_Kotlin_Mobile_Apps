package h.a.s.e.b;

import h.a.f;
import h.a.r.c;
import java.util.Objects;

public final class g<T, U> extends a<T, U> {

    /* renamed from: g  reason: collision with root package name */
    public final c<? super T, ? extends U> f3132g;

    public static final class a<T, U> extends h.a.s.h.a<T, U> {

        /* renamed from: j  reason: collision with root package name */
        public final c<? super T, ? extends U> f3133j;

        public a(h.a.s.c.a<? super U> aVar, c<? super T, ? extends U> cVar) {
            super(aVar);
            this.f3133j = cVar;
        }

        @Override // l.b.b
        public void c(T t) {
            if (!this.f3263h) {
                if (this.f3264i != 0) {
                    this.e.c(null);
                    return;
                }
                try {
                    Object a = this.f3133j.a(t);
                    Objects.requireNonNull(a, "The mapper function returned a null value.");
                    this.e.c(a);
                } catch (Throwable th) {
                    e(th);
                }
            }
        }

        @Override // h.a.s.c.e
        public U d() {
            T d2 = this.f3262g.d();
            if (d2 == null) {
                return null;
            }
            U u = (U) this.f3133j.a(d2);
            Objects.requireNonNull(u, "The mapper function returned a null value.");
            return u;
        }

        @Override // h.a.s.c.a
        public boolean h(T t) {
            if (this.f3263h) {
                return false;
            }
            try {
                Object a = this.f3133j.a(t);
                Objects.requireNonNull(a, "The mapper function returned a null value.");
                return this.e.h(a);
            } catch (Throwable th) {
                e(th);
                return true;
            }
        }

        @Override // h.a.s.c.b
        public int j(int i2) {
            return k(i2);
        }
    }

    public static final class b<T, U> extends h.a.s.h.b<T, U> {

        /* renamed from: j  reason: collision with root package name */
        public final c<? super T, ? extends U> f3134j;

        public b(l.b.b<? super U> bVar, c<? super T, ? extends U> cVar) {
            super(bVar);
            this.f3134j = cVar;
        }

        @Override // l.b.b
        public void c(T t) {
            if (!this.f3267h) {
                if (this.f3268i != 0) {
                    this.e.c(null);
                    return;
                }
                try {
                    Object a = this.f3134j.a(t);
                    Objects.requireNonNull(a, "The mapper function returned a null value.");
                    this.e.c(a);
                } catch (Throwable th) {
                    e(th);
                }
            }
        }

        @Override // h.a.s.c.e
        public U d() {
            T d2 = this.f3266g.d();
            if (d2 == null) {
                return null;
            }
            U u = (U) this.f3134j.a(d2);
            Objects.requireNonNull(u, "The mapper function returned a null value.");
            return u;
        }

        @Override // h.a.s.c.b
        public int j(int i2) {
            return k(i2);
        }
    }

    public g(h.a.c<T> cVar, c<? super T, ? extends U> cVar2) {
        super(cVar);
        this.f3132g = cVar2;
    }

    @Override // h.a.c
    public void g(l.b.b<? super U> bVar) {
        f<? super T> fVar;
        h.a.c<T> cVar;
        if (bVar instanceof h.a.s.c.a) {
            cVar = this.f3094f;
            fVar = new a<>((h.a.s.c.a) bVar, this.f3132g);
        } else {
            cVar = this.f3094f;
            fVar = new b<>(bVar, this.f3132g);
        }
        cVar.f(fVar);
    }
}
