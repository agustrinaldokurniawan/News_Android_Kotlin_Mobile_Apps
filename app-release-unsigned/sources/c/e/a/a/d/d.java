package c.e.a.a.d;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import g.h.j.z.d;

public class d implements g.h.j.z.d {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ boolean b;

    public d(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
        this.a = appBarLayout;
        this.b = z;
    }

    @Override // g.h.j.z.d
    public boolean a(View view, d.a aVar) {
        this.a.setExpanded(this.b);
        return true;
    }
}
