package androidx.lifecycle;

import g.n.c;
import g.n.e;
import g.n.g;
import g.n.i;

public class FullLifecycleObserverAdapter implements g {
    public final c a;
    public final g b;

    public FullLifecycleObserverAdapter(c cVar, g gVar) {
        this.a = cVar;
        this.b = gVar;
    }

    @Override // g.n.g
    public void d(i iVar, e.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                this.a.c(iVar);
                break;
            case 1:
                this.a.g(iVar);
                break;
            case 2:
                this.a.a(iVar);
                break;
            case 3:
                this.a.e(iVar);
                break;
            case 4:
                this.a.f(iVar);
                break;
            case 5:
                this.a.b(iVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        g gVar = this.b;
        if (gVar != null) {
            gVar.d(iVar, aVar);
        }
    }
}
