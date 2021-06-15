package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public int a = 0;
    public int b = 2;

    /* renamed from: c  reason: collision with root package name */
    public int f1614c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ViewPropertyAnimator f1615d;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f1615d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void B(V v, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.f1615d = v.animate().translationY((float) i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i2) {
        this.a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i3 > 0) {
            if (this.b != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f1615d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    v.clearAnimation();
                }
                this.b = 1;
                B(v, this.a + this.f1614c, 175, c.e.a.a.c.a.f1179c);
            }
        } else if (i3 < 0 && this.b != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f1615d;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v.clearAnimation();
            }
            this.b = 2;
            B(v, 0, 225, c.e.a.a.c.a.f1180d);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        return i2 == 2;
    }
}
