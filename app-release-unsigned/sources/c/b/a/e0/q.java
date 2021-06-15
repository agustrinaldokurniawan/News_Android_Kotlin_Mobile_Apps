package c.b.a.e0;

import c.b.a.a0.c.h;
import c.b.a.e0.h0.c;
import c.b.a.g;
import c.b.a.g0.a;
import java.util.ArrayList;
import java.util.List;

public class q {
    public static c.a a = c.a.a("k");

    public static <T> List<a<T>> a(c cVar, g gVar, float f2, g0<T> g0Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (cVar.f0() == c.b.STRING) {
            gVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.c();
        while (cVar.K()) {
            if (cVar.h0(a) != 0) {
                cVar.j0();
            } else if (cVar.f0() == c.b.BEGIN_ARRAY) {
                cVar.b();
                if (cVar.f0() == c.b.NUMBER) {
                    arrayList.add(p.b(cVar, gVar, f2, g0Var, false, z));
                } else {
                    while (cVar.K()) {
                        arrayList.add(p.b(cVar, gVar, f2, g0Var, true, z));
                    }
                }
                cVar.e();
            } else {
                arrayList.add(p.b(cVar, gVar, f2, g0Var, false, z));
            }
        }
        cVar.n();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends a<T>> list) {
        int i2;
        T t;
        int size = list.size();
        int i3 = 0;
        while (true) {
            i2 = size - 1;
            if (i3 >= i2) {
                break;
            }
            a aVar = (a) list.get(i3);
            i3++;
            a aVar2 = (a) list.get(i3);
            aVar.f679h = Float.valueOf(aVar2.f678g);
            if (aVar.f675c == null && (t = aVar2.b) != null) {
                aVar.f675c = t;
                if (aVar instanceof h) {
                    ((h) aVar).e();
                }
            }
        }
        a aVar3 = (a) list.get(i2);
        if ((aVar3.b == null || aVar3.f675c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
