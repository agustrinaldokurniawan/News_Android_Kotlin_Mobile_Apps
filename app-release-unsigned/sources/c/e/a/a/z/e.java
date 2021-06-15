package c.e.a.a.z;

import android.animation.ValueAnimator;

public class e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ a a;

    public e(a aVar) {
        this.a = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.f1425c.setScaleX(floatValue);
        this.a.f1425c.setScaleY(floatValue);
    }
}
