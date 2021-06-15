package m;

import d.a.e;
import h.a.t.a;
import i.s.c.h;

public final class p implements f<T> {
    public final /* synthetic */ e a;

    public p(e eVar) {
        this.a = eVar;
    }

    @Override // m.f
    public void a(d<T> dVar, Throwable th) {
        h.f(dVar, "call");
        h.f(th, "t");
        this.a.a(a.n(th));
    }

    @Override // m.f
    public void b(d<T> dVar, a0<T> a0Var) {
        h.f(dVar, "call");
        h.f(a0Var, "response");
        this.a.a(a0Var);
    }
}
