package c.b.a.e0;

import c.b.a.c0.b;
import c.b.a.e0.h0.c;

public class g implements g0<b> {
    public static final g a = new g();
    public static final c.a b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.b.a.e0.g0
    public b a(c cVar, float f2) {
        cVar.c();
        int i2 = 3;
        String str = null;
        String str2 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        boolean z = true;
        while (cVar.K()) {
            switch (cVar.h0(b)) {
                case 0:
                    str = cVar.e0();
                    break;
                case 1:
                    str2 = cVar.e0();
                    break;
                case 2:
                    f3 = (float) cVar.V();
                    break;
                case 3:
                    int b0 = cVar.b0();
                    if (b0 <= 2 && b0 >= 0) {
                        i2 = g.f.c.g.com$airbnb$lottie$model$DocumentData$Justification$s$values()[b0];
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 4:
                    i3 = cVar.b0();
                    break;
                case 5:
                    f4 = (float) cVar.V();
                    break;
                case 6:
                    f5 = (float) cVar.V();
                    break;
                case 7:
                    i4 = o.a(cVar);
                    break;
                case 8:
                    i5 = o.a(cVar);
                    break;
                case 9:
                    f6 = (float) cVar.V();
                    break;
                case 10:
                    z = cVar.Q();
                    break;
                default:
                    cVar.i0();
                    cVar.j0();
                    break;
            }
        }
        cVar.n();
        return new b(str, str2, f3, i2, i3, f4, f5, i4, i5, f6, z);
    }
}
