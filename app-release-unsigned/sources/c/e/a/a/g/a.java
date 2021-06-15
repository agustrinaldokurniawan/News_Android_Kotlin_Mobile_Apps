package c.e.a.a.g;

import android.animation.ValueAnimator;
import c.e.a.a.w.g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g gVar = this.a.f1633i;
        if (gVar != null) {
            gVar.q(floatValue);
        }
    }
}
