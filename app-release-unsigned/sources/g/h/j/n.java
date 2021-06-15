package g.h.j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

public final class n implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View e;

    /* renamed from: f  reason: collision with root package name */
    public ViewTreeObserver f2529f;

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f2530g;

    public n(View view, Runnable runnable) {
        this.e = view;
        this.f2529f = view.getViewTreeObserver();
        this.f2530g = runnable;
    }

    public static n a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        n nVar = new n(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(nVar);
        view.addOnAttachStateChangeListener(nVar);
        return nVar;
    }

    public void b() {
        (this.f2529f.isAlive() ? this.f2529f : this.e.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.e.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f2530g.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f2529f = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
