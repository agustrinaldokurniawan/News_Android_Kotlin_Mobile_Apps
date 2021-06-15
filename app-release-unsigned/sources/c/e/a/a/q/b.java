package c.e.a.a.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import c.e.a.a.q.d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class b extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.f f1276c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f1277d;

    public b(d dVar, boolean z, d.f fVar) {
        this.f1277d = dVar;
        this.b = z;
        this.f1276c = fVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public void onAnimationEnd(Animator animator) {
        d dVar = this.f1277d;
        dVar.v = 0;
        dVar.q = null;
        if (!this.a) {
            FloatingActionButton floatingActionButton = dVar.z;
            boolean z = this.b;
            floatingActionButton.b(z ? 8 : 4, z);
            d.f fVar = this.f1276c;
            if (fVar != null) {
                a aVar = (a) fVar;
                aVar.a.a(aVar.b);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f1277d.z.b(0, this.b);
        d dVar = this.f1277d;
        dVar.v = 1;
        dVar.q = animator;
        this.a = false;
    }
}
