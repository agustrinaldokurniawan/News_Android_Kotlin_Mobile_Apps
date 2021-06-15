package m.h0.a;

import c.f.a.b;
import h.a.j;
import h.a.l;
import h.a.p.c;
import java.util.Objects;
import m.a0;

public final class e<T> extends j<d<T>> {
    public final j<a0<T>> e;

    public static class a<R> implements l<a0<R>> {
        public final l<? super d<R>> e;

        public a(l<? super d<R>> lVar) {
            this.e = lVar;
        }

        @Override // h.a.l
        public void a() {
            this.e.a();
        }

        @Override // h.a.l
        public void b(Throwable th) {
            try {
                l<? super d<R>> lVar = this.e;
                Objects.requireNonNull(th, "error == null");
                lVar.c(new d(null, th));
                this.e.a();
            } catch (Throwable th2) {
                b.h(th2);
                h.a.t.a.M(new h.a.q.a(th, th2));
            }
        }

        @Override // h.a.l
        public void c(Object obj) {
            a0 a0Var = (a0) obj;
            l<? super d<R>> lVar = this.e;
            Objects.requireNonNull(a0Var, "response == null");
            lVar.c(new d(a0Var, null));
        }

        @Override // h.a.l
        public void d(c cVar) {
            this.e.d(cVar);
        }
    }

    public e(j<a0<T>> jVar) {
        this.e = jVar;
    }

    @Override // h.a.j
    public void f(l<? super d<T>> lVar) {
        this.e.e(new a(lVar));
    }
}
