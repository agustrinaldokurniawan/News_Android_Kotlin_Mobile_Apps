package c.f.a.f;

import android.animation.ValueAnimator;
import android.widget.TextView;
import i.j;
import i.s.c.h;

public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TextView a;

    public f(TextView textView, long j2) {
        this.a = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        TextView textView = this.a;
        h.b(valueAnimator, "animator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            textView.setTextColor(((Integer) animatedValue).intValue());
            return;
        }
        throw new j("null cannot be cast to non-null type kotlin.Int");
    }
}
