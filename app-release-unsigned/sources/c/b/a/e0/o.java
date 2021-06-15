package c.b.a.e0;

import android.graphics.Color;
import android.graphics.PointF;
import c.b.a.e0.h0.c;
import c.c.a.a.a;
import java.util.ArrayList;
import java.util.List;

public class o {
    public static final c.a a = c.a.a("x", "y");

    public static int a(c cVar) {
        cVar.b();
        int V = (int) (cVar.V() * 255.0d);
        int V2 = (int) (cVar.V() * 255.0d);
        int V3 = (int) (cVar.V() * 255.0d);
        while (cVar.K()) {
            cVar.j0();
        }
        cVar.e();
        return Color.argb(255, V, V2, V3);
    }

    public static PointF b(c cVar, float f2) {
        int ordinal = cVar.f0().ordinal();
        if (ordinal == 0) {
            cVar.b();
            float V = (float) cVar.V();
            float V2 = (float) cVar.V();
            while (cVar.f0() != c.b.END_ARRAY) {
                cVar.j0();
            }
            cVar.e();
            return new PointF(V * f2, V2 * f2);
        } else if (ordinal == 2) {
            cVar.c();
            float f3 = 0.0f;
            float f4 = 0.0f;
            while (cVar.K()) {
                int h0 = cVar.h0(a);
                if (h0 == 0) {
                    f3 = d(cVar);
                } else if (h0 != 1) {
                    cVar.i0();
                    cVar.j0();
                } else {
                    f4 = d(cVar);
                }
            }
            cVar.n();
            return new PointF(f3 * f2, f4 * f2);
        } else if (ordinal == 6) {
            float V3 = (float) cVar.V();
            float V4 = (float) cVar.V();
            while (cVar.K()) {
                cVar.j0();
            }
            return new PointF(V3 * f2, V4 * f2);
        } else {
            StringBuilder f5 = a.f("Unknown point starts with ");
            f5.append(cVar.f0());
            throw new IllegalArgumentException(f5.toString());
        }
    }

    public static List<PointF> c(c cVar, float f2) {
        ArrayList arrayList = new ArrayList();
        cVar.b();
        while (cVar.f0() == c.b.BEGIN_ARRAY) {
            cVar.b();
            arrayList.add(b(cVar, f2));
            cVar.e();
        }
        cVar.e();
        return arrayList;
    }

    public static float d(c cVar) {
        c.b f0 = cVar.f0();
        int ordinal = f0.ordinal();
        if (ordinal == 0) {
            cVar.b();
            float V = (float) cVar.V();
            while (cVar.K()) {
                cVar.j0();
            }
            cVar.e();
            return V;
        } else if (ordinal == 6) {
            return (float) cVar.V();
        } else {
            throw new IllegalArgumentException("Unknown value for token of type " + f0);
        }
    }
}
