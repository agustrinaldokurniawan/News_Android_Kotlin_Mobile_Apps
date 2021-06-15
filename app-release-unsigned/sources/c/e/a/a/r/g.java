package c.e.a.a.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

public final class g {
    public final ArrayList<b> a = new ArrayList<>();
    public b b = null;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f1308c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Animator.AnimatorListener f1309d = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            g gVar = g.this;
            if (gVar.f1308c == animator) {
                gVar.f1308c = null;
            }
        }
    }

    public static class b {
        public final int[] a;
        public final ValueAnimator b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f1309d);
        this.a.add(bVar);
    }
}
