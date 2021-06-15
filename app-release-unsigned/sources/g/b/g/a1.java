package g.b.g;

import android.view.View;
import android.view.Window;
import g.b.f.i.a;

public class a1 implements View.OnClickListener {
    public final a e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b1 f2040f;

    public a1(b1 b1Var) {
        this.f2040f = b1Var;
        this.e = new a(b1Var.a.getContext(), 0, 16908332, 0, b1Var.f2050i);
    }

    public void onClick(View view) {
        b1 b1Var = this.f2040f;
        Window.Callback callback = b1Var.f2053l;
        if (callback != null && b1Var.f2054m) {
            callback.onMenuItemSelected(0, this.e);
        }
    }
}
