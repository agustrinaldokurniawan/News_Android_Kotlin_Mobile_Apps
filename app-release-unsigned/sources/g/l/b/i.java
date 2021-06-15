package g.l.b;

import android.graphics.Rect;
import android.view.View;

public class i implements Runnable {
    public final /* synthetic */ s0 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f2693f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Rect f2694g;

    public i(c cVar, s0 s0Var, View view, Rect rect) {
        this.e = s0Var;
        this.f2693f = view;
        this.f2694g = rect;
    }

    public void run() {
        this.e.j(this.f2693f, this.f2694g);
    }
}
