package c.b.a.f0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class a extends ValueAnimator {
    public final Set<ValueAnimator.AnimatorUpdateListener> e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    public final Set<Animator.AnimatorListener> f654f = new CopyOnWriteArraySet();

    public void a(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f654f) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f654f.add(animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.e.add(animatorUpdateListener);
    }

    public void d() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.e) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f654f.clear();
    }

    public void removeAllUpdateListeners() {
        this.e.clear();
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f654f.remove(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.e.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.ValueAnimator
    public ValueAnimator setDuration(long j2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
