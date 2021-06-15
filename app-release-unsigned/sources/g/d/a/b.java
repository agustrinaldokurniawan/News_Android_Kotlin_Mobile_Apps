package g.d.a;

public class b implements d {
    public final e a(c cVar) {
        return (e) cVar.c();
    }

    public void b(c cVar, float f2) {
        e a = a(cVar);
        boolean a2 = cVar.a();
        boolean d2 = cVar.d();
        if (f2 != a.b || a.f2213c != a2 || a.f2214d != d2) {
            a.b = f2;
            a.f2213c = a2;
            a.f2214d = d2;
            a.b(null);
            throw null;
        } else if (!cVar.a()) {
            cVar.b(0, 0, 0, 0);
        } else {
            float f3 = a(cVar).b;
            float f4 = a(cVar).a;
            int ceil = (int) Math.ceil((double) f.a(f3, f4, cVar.d()));
            int ceil2 = (int) Math.ceil((double) f.b(f3, f4, cVar.d()));
            cVar.b(ceil, ceil2, ceil, ceil2);
        }
    }
}
