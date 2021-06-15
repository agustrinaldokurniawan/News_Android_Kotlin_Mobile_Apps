package c.b.a.e0;

import android.graphics.PointF;
import c.b.a.a0.c.h;
import c.b.a.c0.j.b;
import c.b.a.c0.j.e;
import c.b.a.c0.j.i;
import c.b.a.c0.j.m;
import c.b.a.e0.h0.c;
import c.b.a.g;
import java.util.ArrayList;

public class a {
    public static final c.a a = c.a.a("k", "x", "y");

    public static e a(c cVar, g gVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.f0() == c.b.BEGIN_ARRAY) {
            cVar.b();
            while (cVar.K()) {
                arrayList.add(new h(gVar, p.b(cVar, gVar, c.b.a.f0.g.c(), u.a, cVar.f0() == c.b.BEGIN_OBJECT, false)));
            }
            cVar.e();
            q.b(arrayList);
        } else {
            arrayList.add(new c.b.a.g0.a(o.b(cVar, c.b.a.f0.g.c())));
        }
        return new e(arrayList);
    }

    public static m<PointF, PointF> b(c cVar, g gVar) {
        c.b bVar = c.b.STRING;
        cVar.c();
        e eVar = null;
        b bVar2 = null;
        boolean z = false;
        b bVar3 = null;
        while (cVar.f0() != c.b.END_OBJECT) {
            int h0 = cVar.h0(a);
            if (h0 != 0) {
                if (h0 != 1) {
                    if (h0 != 2) {
                        cVar.i0();
                        cVar.j0();
                    } else if (cVar.f0() != bVar) {
                        bVar2 = g.q.a.s(cVar, gVar);
                    }
                } else if (cVar.f0() != bVar) {
                    bVar3 = g.q.a.s(cVar, gVar);
                }
                cVar.j0();
                z = true;
            } else {
                eVar = a(cVar, gVar);
            }
        }
        cVar.n();
        if (z) {
            gVar.a("Lottie doesn't support expressions.");
        }
        return eVar != null ? eVar : new i(bVar3, bVar2);
    }
}
