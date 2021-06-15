package c.d.a.n;

import c.d.a.q.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public class r {
    public final Set<c> a = Collections.newSetFromMap(new WeakHashMap());
    public final List<c> b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f1124c;

    public boolean a(c cVar) {
        boolean z = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.a.remove(cVar);
        if (!this.b.remove(cVar) && !remove) {
            z = false;
        }
        if (z) {
            cVar.clear();
        }
        return z;
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.f1124c + "}";
    }
}
