package c.e.a.a.c0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import c.e.a.a.l.c;
import com.google.android.material.transformation.FabTransformationBehavior;

public class c extends AnimatorListenerAdapter {
    public final /* synthetic */ c.e.a.a.l.c a;

    public c(FabTransformationBehavior fabTransformationBehavior, c.e.a.a.l.c cVar) {
        this.a = cVar;
    }

    public void onAnimationEnd(Animator animator) {
        c.e revealInfo = this.a.getRevealInfo();
        revealInfo.f1226c = Float.MAX_VALUE;
        this.a.setRevealInfo(revealInfo);
    }
}
