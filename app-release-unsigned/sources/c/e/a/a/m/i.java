package c.e.a.a.m;

import android.view.View;
import com.tsuga.news.R;
import g.h.j.a;
import g.h.j.z.b;

public class i extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f1250d;

    public i(g gVar) {
        this.f1250d = gVar;
    }

    @Override // g.h.j.a
    public void d(View view, b bVar) {
        g gVar;
        int i2;
        this.b.onInitializeAccessibilityNodeInfo(view, bVar.b);
        if (this.f1250d.i0.getVisibility() == 0) {
            gVar = this.f1250d;
            i2 = R.string.mtrl_picker_toggle_to_year_selection;
        } else {
            gVar = this.f1250d;
            i2 = R.string.mtrl_picker_toggle_to_day_selection;
        }
        bVar.k(gVar.D(i2));
    }
}
