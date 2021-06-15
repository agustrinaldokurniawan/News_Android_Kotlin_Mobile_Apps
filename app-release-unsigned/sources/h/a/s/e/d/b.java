package h.a.s.e.d;

import h.a.g;
import h.a.h;
import h.a.j;
import h.a.k;
import h.a.l;
import h.a.p.c;
import h.a.q.d;

public final class b<T> extends g<T> {
    public final k<T> e;

    public static final class a<T> implements l<T>, c {
        public final h<? super T> e;

        /* renamed from: f  reason: collision with root package name */
        public c f3187f;

        /* renamed from: g  reason: collision with root package name */
        public T f3188g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3189h;

        public a(h<? super T> hVar) {
            this.e = hVar;
        }

        @Override // h.a.l
        public void a() {
            if (!this.f3189h) {
                this.f3189h = true;
                T t = this.f3188g;
                this.f3188g = null;
                if (t == null) {
                    this.e.a();
                } else {
                    this.e.c(t);
                }
            }
        }

        @Override // h.a.l
        public void b(Throwable th) {
            if (this.f3189h) {
                h.a.t.a.M(th);
                return;
            }
            this.f3189h = true;
            this.e.b(th);
        }

        @Override // h.a.l
        public void c(T t) {
            if (!this.f3189h) {
                if (this.f3188g != null) {
                    this.f3189h = true;
                    this.f3187f.e();
                    this.e.b(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f3188g = t;
            }
        }

        @Override // h.a.l
        public void d(c cVar) {
            c cVar2 = this.f3187f;
            boolean z = false;
            if (cVar == null) {
                h.a.t.a.M(new NullPointerException("next is null"));
            } else if (cVar2 != null) {
                cVar.e();
                h.a.t.a.M(new d("Disposable already set!"));
            } else {
                z = true;
            }
            if (z) {
                this.f3187f = cVar;
                this.e.d(this);
            }
        }

        @Override // h.a.p.c
        public void e() {
            this.f3187f.e();
        }
    }

    public b(k<T> kVar) {
        this.e = kVar;
    }

    @Override // h.a.g
    public void b(h<? super T> hVar) {
        ((j) this.e).e(new a(hVar));
    }
}
