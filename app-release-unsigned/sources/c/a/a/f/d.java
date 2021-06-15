package c.a.a.f;

import android.view.View;
import g.l.b.p;
import i.s.c.h;

public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ g e;

    public /* synthetic */ d(g gVar) {
        this.e = gVar;
    }

    public final void onClick(View view) {
        g gVar = this.e;
        int i2 = g.X;
        h.e(gVar, "this$0");
        p h2 = gVar.h();
        if (h2 != null) {
            h2.onBackPressed();
        }
    }
}
