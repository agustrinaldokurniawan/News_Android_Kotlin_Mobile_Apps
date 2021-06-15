package g.l.b;

import android.view.View;
import g.h.j.o;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class u0 implements Runnable {
    public final /* synthetic */ ArrayList e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Map f2778f;

    public u0(s0 s0Var, ArrayList arrayList, Map map) {
        this.e = arrayList;
        this.f2778f = map;
    }

    public void run() {
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.e.get(i2);
            AtomicInteger atomicInteger = o.a;
            view.setTransitionName((String) this.f2778f.get(view.getTransitionName()));
        }
    }
}
