package m.h0.a;

import c.f.a.b;
import h.a.j;
import h.a.l;
import h.a.p.c;
import m.a0;

public final class a<T> extends j<T> {
    public final j<a0<T>> e;

    /* renamed from: m.h0.a.a$a  reason: collision with other inner class name */
    public static class C0132a<R> implements l<a0<R>> {
        public final l<? super R> e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3825f;

        public C0132a(l<? super R> lVar) {
            this.e = lVar;
        }

        @Override // h.a.l
        public void a() {
            if (!this.f3825f) {
                this.e.a();
            }
        }

        @Override // h.a.l
        public void b(Throwable th) {
            if (!this.f3825f) {
                this.e.b(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            h.a.t.a.M(assertionError);
        }

        @Override // h.a.l
        public void d(c cVar) {
            this.e.d(cVar);
        }

        /* renamed from: e */
        public void c(a0<R> a0Var) {
            if (a0Var.a()) {
                this.e.c(a0Var.b);
                return;
            }
            this.f3825f = true;
            c cVar = new c(a0Var);
            try {
                this.e.b(cVar);
            } catch (Throwable th) {
                b.h(th);
                h.a.t.a.M(new h.a.q.a(cVar, th));
            }
        }
    }

    public a(j<a0<T>> jVar) {
        this.e = jVar;
    }

    @Override // h.a.j
    public void f(l<? super T> lVar) {
        this.e.e(new C0132a(lVar));
    }
}
