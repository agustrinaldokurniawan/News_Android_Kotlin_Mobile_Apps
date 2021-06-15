package g.l.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import g.l.b.c;
import g.l.b.x0;

public class d extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f2663c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ x0.d f2664d;
    public final /* synthetic */ c.b e;

    public d(c cVar, ViewGroup viewGroup, View view, boolean z, x0.d dVar, c.b bVar) {
        this.a = viewGroup;
        this.b = view;
        this.f2663c = z;
        this.f2664d = dVar;
        this.e = bVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        if (this.f2663c) {
            this.f2664d.a.a(this.b);
        }
        this.e.a();
    }
}
