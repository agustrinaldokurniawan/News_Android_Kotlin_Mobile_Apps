package g.h.j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import g.b.c.s;
import java.lang.ref.WeakReference;

public final class u {
    public WeakReference<View> a;
    public int b = -1;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ v a;
        public final /* synthetic */ View b;

        public a(u uVar, v vVar, View view) {
            this.a = vVar;
            this.b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.a.c(this.b);
        }

        public void onAnimationEnd(Animator animator) {
            this.a.a(this.b);
        }

        public void onAnimationStart(Animator animator) {
            this.a.b(this.b);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ x a;
        public final /* synthetic */ View b;

        public b(u uVar, x xVar, View view) {
            this.a = xVar;
            this.b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) s.this.f1903f.getParent()).invalidate();
        }
    }

    public u(View view) {
        this.a = new WeakReference<>(view);
    }

    public u a(float f2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public u c(long j2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public u d(v vVar) {
        View view = this.a.get();
        if (view != null) {
            e(view, vVar);
        }
        return this;
    }

    public final void e(View view, v vVar) {
        if (vVar != null) {
            view.animate().setListener(new a(this, vVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public u f(x xVar) {
        View view = this.a.get();
        if (view != null) {
            b bVar = null;
            if (xVar != null) {
                bVar = new b(this, xVar, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public u g(float f2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
