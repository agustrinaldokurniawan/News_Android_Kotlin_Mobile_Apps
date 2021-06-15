package l.a.b.a.d;

import g.n.s;
import i.s.c.h;
import i.s.c.p;
import i.v.b;
import java.util.List;

public final class a extends l.a.c.k.a {
    public final s b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(s sVar, List<? extends Object> list) {
        super(list);
        h.e(sVar, "state");
        h.e(list, "values");
        this.b = sVar;
    }

    @Override // l.a.c.k.a
    public <T> T a(b<T> bVar) {
        h.e(bVar, "clazz");
        return h.a(bVar, p.a(s.class)) ? (T) this.b : (T) super.a(bVar);
    }
}
