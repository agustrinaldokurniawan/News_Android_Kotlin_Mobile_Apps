package c.f.a.f;

import android.view.View;
import i.s.c.h;

public final class e implements View.OnAttachStateChangeListener {
    public void onViewAttachedToWindow(View view) {
        h.f(view, "v");
        view.removeOnAttachStateChangeListener(this);
        view.requestApplyInsets();
    }

    public void onViewDetachedFromWindow(View view) {
        h.f(view, "v");
    }
}
