package d.a;

import c.c.a.a.a;
import i.m;
import i.s.b.l;

public final class i0 extends d {
    public final l<Throwable, m> e;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: i.s.b.l<? super java.lang.Throwable, i.m> */
    /* JADX WARN: Multi-variable type inference failed */
    public i0(l<? super Throwable, m> lVar) {
        this.e = lVar;
    }

    @Override // d.a.d
    public void a(Throwable th) {
        this.e.o(th);
    }

    @Override // i.s.b.l
    public /* bridge */ /* synthetic */ Object o(Object obj) {
        a((Throwable) obj);
        return m.a;
    }

    public String toString() {
        StringBuilder f2 = a.f("InvokeOnCancel[");
        f2.append(h.a.t.a.t(this.e));
        f2.append('@');
        f2.append(h.a.t.a.u(this));
        f2.append(']');
        return f2.toString();
    }
}
