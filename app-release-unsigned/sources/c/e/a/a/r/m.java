package c.e.a.a.r;

import android.view.View;
import g.h.j.o;
import java.util.concurrent.atomic.AtomicInteger;

public final class m implements View.OnAttachStateChangeListener {
    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        AtomicInteger atomicInteger = o.a;
        view.requestApplyInsets();
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
