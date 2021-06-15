package l.a.b.a.c;

import g.n.t;
import g.n.u;
import i.s.c.h;
import l.a.b.a.b;

public final class a<T extends t> implements u.a {
    public final l.a.c.n.a a;
    public final b<T> b;

    public a(l.a.c.n.a aVar, b<T> bVar) {
        h.e(aVar, "scope");
        h.e(bVar, "parameters");
        this.a = aVar;
        this.b = bVar;
    }

    @Override // g.n.u.a
    public <T extends t> T a(Class<T> cls) {
        h.e(cls, "modelClass");
        l.a.c.n.a aVar = this.a;
        b<T> bVar = this.b;
        return (T) ((t) aVar.a(bVar.a, bVar.b, bVar.f3776c));
    }
}
