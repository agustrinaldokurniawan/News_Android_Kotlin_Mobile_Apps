package androidx.lifecycle;

import g.n.d;
import g.n.e;
import g.n.g;
import g.n.i;
import g.n.n;

public class CompositeGeneratedAdaptersObserver implements g {
    public final d[] a;

    public CompositeGeneratedAdaptersObserver(d[] dVarArr) {
        this.a = dVarArr;
    }

    @Override // g.n.g
    public void d(i iVar, e.a aVar) {
        n nVar = new n();
        for (d dVar : this.a) {
            dVar.a(iVar, aVar, false, nVar);
        }
        for (d dVar2 : this.a) {
            dVar2.a(iVar, aVar, true, nVar);
        }
    }
}
