package g.p;

import g.n.t;
import g.n.u;
import g.n.v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

public class g extends t {

    /* renamed from: c  reason: collision with root package name */
    public static final u.a f2836c = new a();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<UUID, v> f2837d = new HashMap<>();

    public class a implements u.a {
        @Override // g.n.u.a
        public <T extends t> T a(Class<T> cls) {
            return new g();
        }
    }

    public static g b(v vVar) {
        u.a aVar = f2836c;
        String canonicalName = g.class.getCanonicalName();
        if (canonicalName != null) {
            String q = c.c.a.a.a.q("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            t tVar = vVar.a.get(q);
            if (!g.class.isInstance(tVar)) {
                tVar = aVar instanceof u.b ? ((u.b) aVar).c(q, g.class) : aVar.a(g.class);
                t put = vVar.a.put(q, tVar);
                if (put != null) {
                    put.a();
                }
            } else if (aVar instanceof u.c) {
                ((u.c) aVar).b(tVar);
            }
            return (g) tVar;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // g.n.t
    public void a() {
        for (v vVar : this.f2837d.values()) {
            vVar.a();
        }
        this.f2837d.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.f2837d.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
