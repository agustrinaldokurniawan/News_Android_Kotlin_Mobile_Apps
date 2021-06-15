package d.a;

import c.c.a.a.a;
import i.m;
import i.s.b.l;

public final class k0 extends o0<l0> {

    /* renamed from: i  reason: collision with root package name */
    public final l<Throwable, m> f1824i;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: i.s.b.l<? super java.lang.Throwable, i.m> */
    /* JADX WARN: Multi-variable type inference failed */
    public k0(l0 l0Var, l<? super Throwable, m> lVar) {
        super(l0Var);
        this.f1824i = lVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // i.s.b.l
    public m o(Throwable th) {
        this.f1824i.o(th);
        return m.a;
    }

    @Override // d.a.a.i
    public String toString() {
        StringBuilder f2 = a.f("InvokeOnCompletion[");
        f2.append(k0.class.getSimpleName());
        f2.append('@');
        f2.append(h.a.t.a.u(this));
        f2.append(']');
        return f2.toString();
    }
}
