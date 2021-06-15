package c.b.a.f0;

import android.graphics.PointF;
import c.b.a.a0.b.k;
import c.b.a.c0.e;
import c.c.a.a.a;
import java.util.List;

public class f {
    public static PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f4, f2));
    }

    public static int c(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i4, i2));
    }

    public static int d(float f2, float f3) {
        int i2 = (int) f2;
        int i3 = (int) f3;
        int i4 = i2 / i3;
        int i5 = i2 % i3;
        if (!((i2 ^ i3) >= 0) && i5 != 0) {
            i4--;
        }
        return i2 - (i3 * i4);
    }

    public static float e(float f2, float f3, float f4) {
        return a.a(f3, f2, f4, f2);
    }

    public static void f(e eVar, int i2, List<e> list, e eVar2, k kVar) {
        if (eVar.c(kVar.i(), i2)) {
            list.add(eVar2.a(kVar.i()).g(kVar));
        }
    }
}
