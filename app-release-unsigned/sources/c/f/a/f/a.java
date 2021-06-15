package c.f.a.f;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import i.j;
import i.s.c.h;

public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ValueAnimator a;
    public final /* synthetic */ ImageView b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ PorterDuff.Mode f1551c;

    public a(ValueAnimator valueAnimator, ImageView imageView, long j2, PorterDuff.Mode mode) {
        this.a = valueAnimator;
        this.b = imageView;
        this.f1551c = mode;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        h.b(valueAnimator, "animator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            int intValue = ((Integer) animatedValue).intValue();
            PorterDuff.Mode mode = this.f1551c;
            if (mode != null) {
                this.b.setColorFilter(intValue, mode);
            } else {
                this.b.setColorFilter(intValue);
            }
        } else {
            throw new j("null cannot be cast to non-null type kotlin.Int");
        }
    }
}
