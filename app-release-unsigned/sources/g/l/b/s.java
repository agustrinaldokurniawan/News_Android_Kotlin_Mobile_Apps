package g.l.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import g.h.f.a;
import g.l.b.b0;
import g.l.b.m;
import g.l.b.q0;

public class s extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f2767c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q0.a f2768d;
    public final /* synthetic */ a e;

    public s(ViewGroup viewGroup, View view, m mVar, q0.a aVar, a aVar2) {
        this.a = viewGroup;
        this.b = view;
        this.f2767c = mVar;
        this.f2768d = aVar;
        this.e = aVar2;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        m mVar = this.f2767c;
        m.b bVar = mVar.M;
        Animator animator2 = bVar == null ? null : bVar.b;
        mVar.t0(null);
        if (animator2 != null && this.a.indexOfChild(this.b) < 0) {
            ((b0.d) this.f2768d).a(this.f2767c, this.e);
        }
    }
}
