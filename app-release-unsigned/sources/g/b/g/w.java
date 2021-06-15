package g.b.g;

import android.annotation.SuppressLint;
import android.view.View;
import g.b.f.i.p;
import g.b.g.x;

public class w extends j0 {
    public final /* synthetic */ x.d n;
    public final /* synthetic */ x o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(x xVar, View view, x.d dVar) {
        super(view);
        this.o = xVar;
        this.n = dVar;
    }

    @Override // g.b.g.j0
    public p b() {
        return this.n;
    }

    @Override // g.b.g.j0
    @SuppressLint({"SyntheticAccessor"})
    public boolean c() {
        if (this.o.getInternalPopup().b()) {
            return true;
        }
        this.o.b();
        return true;
    }
}
