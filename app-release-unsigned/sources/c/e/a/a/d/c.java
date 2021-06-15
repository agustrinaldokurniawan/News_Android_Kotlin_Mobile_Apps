package c.e.a.a.d;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import g.h.j.z.d;

public class c implements d {
    public final /* synthetic */ CoordinatorLayout a;
    public final /* synthetic */ AppBarLayout b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1185c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1186d;
    public final /* synthetic */ AppBarLayout.BaseBehavior e;

    public c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
        this.e = baseBehavior;
        this.a = coordinatorLayout;
        this.b = appBarLayout;
        this.f1185c = view;
        this.f1186d = i2;
    }

    @Override // g.h.j.z.d
    public boolean a(View view, d.a aVar) {
        this.e.L(this.a, this.b, this.f1185c, this.f1186d, new int[]{0, 0});
        return true;
    }
}
