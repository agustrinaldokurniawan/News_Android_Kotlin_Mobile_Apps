package c.e.a.a.e;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import g.h.j.o;
import g.h.j.z.d;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class a implements d {
    public final /* synthetic */ SwipeDismissBehavior a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // g.h.j.z.d
    public boolean a(View view, d.a aVar) {
        boolean z = false;
        if (!this.a.B(view)) {
            return false;
        }
        AtomicInteger atomicInteger = o.a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.a.f1616c;
        if ((i2 == 0 && z2) || (i2 == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        Objects.requireNonNull(this.a);
        return true;
    }
}
