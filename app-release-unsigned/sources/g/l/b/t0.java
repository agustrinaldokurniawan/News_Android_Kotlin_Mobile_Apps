package g.l.b;

import android.view.View;
import g.h.j.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class t0 implements Runnable {
    public final /* synthetic */ ArrayList e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Map f2773f;

    public t0(s0 s0Var, ArrayList arrayList, Map map) {
        this.e = arrayList;
        this.f2773f = map;
    }

    public void run() {
        String str;
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.e.get(i2);
            AtomicInteger atomicInteger = o.a;
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                Iterator it = this.f2773f.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (transitionName.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                view.setTransitionName(str);
            }
        }
    }
}
