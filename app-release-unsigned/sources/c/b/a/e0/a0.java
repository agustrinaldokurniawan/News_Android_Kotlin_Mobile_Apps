package c.b.a.e0;

import android.graphics.PointF;
import c.b.a.c0.a;
import c.b.a.c0.k.k;
import c.b.a.e0.h0.c;
import c.b.a.f0.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a0 implements g0<k> {
    public static final a0 a = new a0();
    public static final c.a b = c.a.a("c", "v", "i", "o");

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.b.a.e0.g0
    public k a(c cVar, float f2) {
        if (cVar.f0() == c.b.BEGIN_ARRAY) {
            cVar.b();
        }
        cVar.c();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (cVar.K()) {
            int h0 = cVar.h0(b);
            if (h0 == 0) {
                z = cVar.Q();
            } else if (h0 == 1) {
                list = o.c(cVar, f2);
            } else if (h0 == 2) {
                list2 = o.c(cVar, f2);
            } else if (h0 != 3) {
                cVar.i0();
                cVar.j0();
            } else {
                list3 = o.c(cVar, f2);
            }
        }
        cVar.n();
        if (cVar.f0() == c.b.END_ARRAY) {
            cVar.e();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new k(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 1; i2 < size; i2++) {
                PointF pointF2 = list.get(i2);
                int i3 = i2 - 1;
                arrayList.add(new a(f.a(list.get(i3), list3.get(i3)), f.a(pointF2, list2.get(i2)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i4 = size - 1;
                arrayList.add(new a(f.a(list.get(i4), list3.get(i4)), f.a(pointF3, list2.get(0)), pointF3));
            }
            return new k(pointF, z, arrayList);
        }
    }
}
