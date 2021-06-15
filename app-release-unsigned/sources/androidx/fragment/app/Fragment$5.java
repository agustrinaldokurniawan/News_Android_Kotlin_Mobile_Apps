package androidx.fragment.app;

import android.view.View;
import g.l.b.m;
import g.n.e;
import g.n.g;
import g.n.i;

public class Fragment$5 implements g {
    public final /* synthetic */ m a;

    public Fragment$5(m mVar) {
        this.a = mVar;
    }

    @Override // g.n.g
    public void d(i iVar, e.a aVar) {
        View view;
        if (aVar == e.a.ON_STOP && (view = this.a.J) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
