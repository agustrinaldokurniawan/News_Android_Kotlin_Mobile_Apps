package g.q.c;

import androidx.recyclerview.widget.RecyclerView;
import g.e.e;
import g.e.h;
import g.h.i.c;
import g.h.i.d;

public class b0 {
    public final h<RecyclerView.z, a> a = new h<>();
    public final e<RecyclerView.z> b = new e<>(10);

    public static class a {
        public static c<a> a = new d(20);
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.i.c f2892c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView.i.c f2893d;

        public static a a() {
            a b2 = a.b();
            return b2 == null ? new a() : b2;
        }

        public static void b(a aVar) {
            aVar.b = 0;
            aVar.f2892c = null;
            aVar.f2893d = null;
            a.a(aVar);
        }
    }

    public interface b {
    }

    public void a(RecyclerView.z zVar) {
        a orDefault = this.a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(zVar, orDefault);
        }
        orDefault.b |= 1;
    }

    public void b(RecyclerView.z zVar, RecyclerView.i.c cVar) {
        a orDefault = this.a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(zVar, orDefault);
        }
        orDefault.f2893d = cVar;
        orDefault.b |= 8;
    }

    public void c(RecyclerView.z zVar, RecyclerView.i.c cVar) {
        a orDefault = this.a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(zVar, orDefault);
        }
        orDefault.f2892c = cVar;
        orDefault.b |= 4;
    }

    public boolean d(RecyclerView.z zVar) {
        a orDefault = this.a.getOrDefault(zVar, null);
        return (orDefault == null || (orDefault.b & 1) == 0) ? false : true;
    }

    public final RecyclerView.i.c e(RecyclerView.z zVar, int i2) {
        a l2;
        RecyclerView.i.c cVar;
        int e = this.a.e(zVar);
        if (e >= 0 && (l2 = this.a.l(e)) != null) {
            int i3 = l2.b;
            if ((i3 & i2) != 0) {
                int i4 = (~i2) & i3;
                l2.b = i4;
                if (i2 == 4) {
                    cVar = l2.f2892c;
                } else if (i2 == 8) {
                    cVar = l2.f2893d;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i4 & 12) == 0) {
                    this.a.j(e);
                    a.b(l2);
                }
                return cVar;
            }
        }
        return null;
    }

    public void f(RecyclerView.z zVar) {
        a orDefault = this.a.getOrDefault(zVar, null);
        if (orDefault != null) {
            orDefault.b &= -2;
        }
    }

    public void g(RecyclerView.z zVar) {
        int k2 = this.b.k() - 1;
        while (true) {
            if (k2 < 0) {
                break;
            } else if (zVar == this.b.l(k2)) {
                e<RecyclerView.z> eVar = this.b;
                Object[] objArr = eVar.f2232h;
                Object obj = objArr[k2];
                Object obj2 = e.e;
                if (obj != obj2) {
                    objArr[k2] = obj2;
                    eVar.f2230f = true;
                }
            } else {
                k2--;
            }
        }
        a remove = this.a.remove(zVar);
        if (remove != null) {
            a.b(remove);
        }
    }
}
