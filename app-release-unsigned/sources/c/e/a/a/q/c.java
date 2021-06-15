package c.e.a.a.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import c.e.a.a.q.d;

public class c extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d.f b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f1278c;

    public c(d dVar, boolean z, d.f fVar) {
        this.f1278c = dVar;
        this.a = z;
        this.b = fVar;
    }

    public void onAnimationEnd(Animator animator) {
        d dVar = this.f1278c;
        dVar.v = 0;
        dVar.q = null;
        d.f fVar = this.b;
        if (fVar != null) {
            a aVar = (a) fVar;
            aVar.a.b(aVar.b);
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f1278c.z.b(0, this.a);
        d dVar = this.f1278c;
        dVar.v = 2;
        dVar.q = animator;
    }
}
