package g.u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public class j extends AnimatorListenerAdapter {
    public final /* synthetic */ h a;

    public j(h hVar) {
        this.a = hVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.q();
        animator.removeListener(this);
    }
}
