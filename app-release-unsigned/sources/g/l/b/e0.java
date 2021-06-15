package g.l.b;

import android.util.Log;
import g.n.t;
import g.n.u;
import g.n.v;
import java.util.HashMap;
import java.util.Iterator;

public final class e0 extends t {

    /* renamed from: c  reason: collision with root package name */
    public static final u.a f2672c = new a();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, m> f2673d = new HashMap<>();
    public final HashMap<String, e0> e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, v> f2674f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2675g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2676h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2677i = false;

    public class a implements u.a {
        @Override // g.n.u.a
        public <T extends t> T a(Class<T> cls) {
            return new e0(true);
        }
    }

    public e0(boolean z) {
        this.f2675g = z;
    }

    @Override // g.n.t
    public void a() {
        if (b0.O(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2676h = true;
    }

    public void b(m mVar) {
        if (!this.f2677i) {
            if ((this.f2673d.remove(mVar.f2717j) != null) && b0.O(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + mVar);
            }
        } else if (b0.O(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    public boolean c(m mVar) {
        if (this.f2673d.containsKey(mVar.f2717j) && this.f2675g) {
            return this.f2676h;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f2673d.equals(e0Var.f2673d) && this.e.equals(e0Var.e) && this.f2674f.equals(e0Var.f2674f);
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        return this.f2674f.hashCode() + ((hashCode + (this.f2673d.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<m> it = this.f2673d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2674f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
