package c.e.a.a.z;

import android.animation.ValueAnimator;

public class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ a a;

    public d(a aVar) {
        this.a = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.f1425c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
