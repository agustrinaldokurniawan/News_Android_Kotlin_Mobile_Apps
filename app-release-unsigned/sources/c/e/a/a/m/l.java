package c.e.a.a.m;

import android.view.View;

public class l implements View.OnClickListener {
    public final /* synthetic */ v e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f1252f;

    public l(g gVar, v vVar) {
        this.f1252f = gVar;
        this.e = vVar;
    }

    public void onClick(View view) {
        int j1 = this.f1252f.C0().j1() + 1;
        if (j1 < this.f1252f.g0.getAdapter().a()) {
            this.f1252f.E0(this.e.e(j1));
        }
    }
}
