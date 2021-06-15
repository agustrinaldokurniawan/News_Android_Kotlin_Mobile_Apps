package c.e.a.a.m;

import android.view.View;

public class m implements View.OnClickListener {
    public final /* synthetic */ v e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f1253f;

    public m(g gVar, v vVar) {
        this.f1253f = gVar;
        this.e = vVar;
    }

    public void onClick(View view) {
        int k1 = this.f1253f.C0().k1() - 1;
        if (k1 >= 0) {
            this.f1253f.E0(this.e.e(k1));
        }
    }
}
