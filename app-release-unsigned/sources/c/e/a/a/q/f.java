package c.e.a.a.q;

import android.view.ViewTreeObserver;

public class f implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ d e;

    public f(d dVar) {
        this.e = dVar;
    }

    public boolean onPreDraw() {
        d dVar = this.e;
        float rotation = dVar.z.getRotation();
        if (dVar.t == rotation) {
            return true;
        }
        dVar.t = rotation;
        dVar.r();
        return true;
    }
}
