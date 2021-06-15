package c.b.a.e0;

import c.b.a.e0.h0.c;
import c.b.a.g0.d;

public class z implements g0<d> {
    public static final z a = new z();

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.b.a.e0.g0
    public d a(c cVar, float f2) {
        boolean z = cVar.f0() == c.b.BEGIN_ARRAY;
        if (z) {
            cVar.b();
        }
        float V = (float) cVar.V();
        float V2 = (float) cVar.V();
        while (cVar.K()) {
            cVar.j0();
        }
        if (z) {
            cVar.e();
        }
        return new d((V / 100.0f) * f2, (V2 / 100.0f) * f2);
    }
}
