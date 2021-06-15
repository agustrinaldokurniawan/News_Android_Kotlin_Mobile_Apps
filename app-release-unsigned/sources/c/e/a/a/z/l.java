package c.e.a.a.z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public class l extends AnimatorListenerAdapter {
    public final /* synthetic */ h a;

    public l(h hVar) {
        this.a = hVar;
    }

    public void onAnimationEnd(Animator animator) {
        h hVar = this.a;
        hVar.f1425c.setChecked(hVar.f1418j);
        this.a.p.start();
    }
}
