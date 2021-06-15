package c.b.a.e0;

import android.graphics.PointF;
import c.b.a.e0.h0.c;

public class v implements g0<PointF> {
    public static final v a = new v();

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.b.a.e0.g0
    public PointF a(c cVar, float f2) {
        c.b f0 = cVar.f0();
        if (f0 == c.b.BEGIN_ARRAY || f0 == c.b.BEGIN_OBJECT) {
            return o.b(cVar, f2);
        }
        if (f0 == c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.V()) * f2, ((float) cVar.V()) * f2);
            while (cVar.K()) {
                cVar.j0();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + f0);
    }
}
