package g.b.c;

import android.view.View;
import g.h.j.o;
import g.h.j.w;
import java.util.concurrent.atomic.AtomicInteger;

public class n extends w {
    public final /* synthetic */ j a;

    public n(j jVar) {
        this.a = jVar;
    }

    @Override // g.h.j.v
    public void a(View view) {
        this.a.w.setAlpha(1.0f);
        this.a.z.d(null);
        this.a.z = null;
    }

    @Override // g.h.j.v, g.h.j.w
    public void b(View view) {
        this.a.w.setVisibility(0);
        this.a.w.sendAccessibilityEvent(32);
        if (this.a.w.getParent() instanceof View) {
            AtomicInteger atomicInteger = o.a;
            ((View) this.a.w.getParent()).requestApplyInsets();
        }
    }
}
