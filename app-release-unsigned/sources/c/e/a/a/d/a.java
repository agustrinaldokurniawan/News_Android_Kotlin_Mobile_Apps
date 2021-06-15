package c.e.a.a.d;

import android.animation.ValueAnimator;
import c.e.a.a.w.g;
import com.google.android.material.appbar.AppBarLayout;

public class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ g a;

    public a(AppBarLayout appBarLayout, g gVar) {
        this.a = gVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.o(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
