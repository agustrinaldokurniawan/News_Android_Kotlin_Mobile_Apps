package androidx.savedstate;

import g.n.e;
import g.n.g;
import g.n.i;
import g.s.a;

public class SavedStateRegistry$1 implements g {
    public final /* synthetic */ a a;

    public SavedStateRegistry$1(a aVar) {
        this.a = aVar;
    }

    @Override // g.n.g
    public void d(i iVar, e.a aVar) {
        a aVar2;
        boolean z;
        if (aVar == e.a.ON_START) {
            aVar2 = this.a;
            z = true;
        } else if (aVar == e.a.ON_STOP) {
            aVar2 = this.a;
            z = false;
        } else {
            return;
        }
        aVar2.e = z;
    }
}
