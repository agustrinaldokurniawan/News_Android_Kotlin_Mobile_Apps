package g.l.b;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class i0 {
    public final ArrayList<m> a = new ArrayList<>();
    public final HashMap<String, h0> b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public e0 f2695c;

    public void a(m mVar) {
        if (!this.a.contains(mVar)) {
            synchronized (this.a) {
                this.a.add(mVar);
            }
            mVar.p = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + mVar);
    }

    public void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.b.get(str) != null;
    }

    public m d(String str) {
        h0 h0Var = this.b.get(str);
        if (h0Var != null) {
            return h0Var.f2691c;
        }
        return null;
    }

    public m e(String str) {
        for (h0 h0Var : this.b.values()) {
            if (h0Var != null) {
                m mVar = h0Var.f2691c;
                if (!str.equals(mVar.f2717j)) {
                    mVar = mVar.y.f2642c.e(str);
                }
                if (mVar != null) {
                    return mVar;
                }
            }
        }
        return null;
    }

    public List<h0> f() {
        ArrayList arrayList = new ArrayList();
        for (h0 h0Var : this.b.values()) {
            if (h0Var != null) {
                arrayList.add(h0Var);
            }
        }
        return arrayList;
    }

    public List<m> g() {
        ArrayList arrayList = new ArrayList();
        Iterator<h0> it = this.b.values().iterator();
        while (it.hasNext()) {
            h0 next = it.next();
            arrayList.add(next != null ? next.f2691c : null);
        }
        return arrayList;
    }

    public h0 h(String str) {
        return this.b.get(str);
    }

    public List<m> i() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public void j(h0 h0Var) {
        m mVar = h0Var.f2691c;
        if (!c(mVar.f2717j)) {
            this.b.put(mVar.f2717j, h0Var);
            if (b0.O(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + mVar);
            }
        }
    }

    public void k(h0 h0Var) {
        m mVar = h0Var.f2691c;
        if (mVar.F) {
            this.f2695c.b(mVar);
        }
        if (this.b.put(mVar.f2717j, null) != null && b0.O(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + mVar);
        }
    }

    public void l(m mVar) {
        synchronized (this.a) {
            this.a.remove(mVar);
        }
        mVar.p = false;
    }
}
