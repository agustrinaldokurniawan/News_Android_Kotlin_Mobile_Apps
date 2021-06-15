package c.f.a.f;

import android.view.View;
import android.view.WindowInsets;
import i.s.b.q;
import i.s.c.h;

public final class d implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ q a;
    public final /* synthetic */ b b;

    public d(q qVar, b bVar) {
        this.a = qVar;
        this.b = bVar;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        q qVar = this.a;
        h.b(view, "v");
        h.b(windowInsets, "insets");
        qVar.j(view, windowInsets, this.b);
        return windowInsets;
    }
}
