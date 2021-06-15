package c.b.a.e0;

import android.graphics.Color;
import c.b.a.e0.h0.c;

public class e implements g0<Integer> {
    public static final e a = new e();

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.b.a.e0.g0
    public Integer a(c cVar, float f2) {
        boolean z = cVar.f0() == c.b.BEGIN_ARRAY;
        if (z) {
            cVar.b();
        }
        double V = cVar.V();
        double V2 = cVar.V();
        double V3 = cVar.V();
        double V4 = cVar.f0() == c.b.NUMBER ? cVar.V() : 1.0d;
        if (z) {
            cVar.e();
        }
        if (V <= 1.0d && V2 <= 1.0d && V3 <= 1.0d) {
            V *= 255.0d;
            V2 *= 255.0d;
            V3 *= 255.0d;
            if (V4 <= 1.0d) {
                V4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) V4, (int) V, (int) V2, (int) V3));
    }
}
