package g.u;

import android.view.View;
import android.view.ViewGroup;
import com.tsuga.news.R;

public class z extends k {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3065c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a0 f3066d;

    public z(a0 a0Var, ViewGroup viewGroup, View view, View view2) {
        this.f3066d = a0Var;
        this.a = viewGroup;
        this.b = view;
        this.f3065c = view2;
    }

    @Override // g.u.k, g.u.h.d
    public void a(h hVar) {
        this.a.getOverlay().remove(this.b);
    }

    @Override // g.u.k, g.u.h.d
    public void b(h hVar) {
        if (this.b.getParent() == null) {
            this.a.getOverlay().add(this.b);
        } else {
            this.f3066d.cancel();
        }
    }

    @Override // g.u.h.d
    public void e(h hVar) {
        this.f3065c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        hVar.A(this);
    }
}
