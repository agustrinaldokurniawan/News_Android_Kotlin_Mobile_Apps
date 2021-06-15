package androidx.lifecycle;

import g.n.e;
import g.n.g;
import g.n.i;
import g.n.j;
import i.s.c.h;
import java.util.Objects;

public final class LifecycleController$observer$1 implements g {
    @Override // g.n.g
    public final void d(i iVar, e.a aVar) {
        h.e(iVar, "source");
        h.e(aVar, "<anonymous parameter 1>");
        e a = iVar.a();
        h.d(a, "source.lifecycle");
        if (((j) a).b == e.b.DESTROYED) {
            throw null;
        }
        e a2 = iVar.a();
        h.d(a2, "source.lifecycle");
        j jVar = (j) a2;
        Objects.requireNonNull(null);
        throw null;
    }
}
