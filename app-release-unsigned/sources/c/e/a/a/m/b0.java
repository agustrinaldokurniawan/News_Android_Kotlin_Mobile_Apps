package c.e.a.a.m;

import android.view.View;

public class b0 implements View.OnClickListener {
    public final /* synthetic */ int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c0 f1238f;

    public b0(c0 c0Var, int i2) {
        this.f1238f = c0Var;
        this.e = i2;
    }

    public void onClick(View view) {
        s k2 = s.k(this.e, this.f1238f.f1244d.c0.f1254f);
        a aVar = this.f1238f.f1244d.b0;
        if (k2.compareTo(aVar.e) < 0) {
            k2 = aVar.e;
        } else if (k2.compareTo(aVar.f1227f) > 0) {
            k2 = aVar.f1227f;
        }
        this.f1238f.f1244d.E0(k2);
        this.f1238f.f1244d.F0(1);
    }
}
