package c.e.a.a.z;

import android.animation.ValueAnimator;

public class i implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ h a;

    public i(h hVar) {
        this.a = hVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.f1425c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
