package g.u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import g.e.a;

public class i extends AnimatorListenerAdapter {
    public final /* synthetic */ a a;
    public final /* synthetic */ h b;

    public i(h hVar, a aVar) {
        this.b = hVar;
        this.a = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.t.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.b.t.add(animator);
    }
}
