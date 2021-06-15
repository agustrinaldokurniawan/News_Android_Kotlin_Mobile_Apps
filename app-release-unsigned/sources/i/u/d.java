package i.u;

import i.s.c.h;

public class d {
    public static final int a(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static final long b(long j2, long j3, long j4) {
        if (j3 <= j4) {
            return j2 < j3 ? j3 : j2 > j4 ? j4 : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j4 + " is less than minimum " + j3 + '.');
    }

    public static final a c(int i2, int i3) {
        return new a(i2, i3, -1);
    }

    public static final a d(a aVar, int i2) {
        h.e(aVar, "$this$step");
        boolean z = i2 > 0;
        Integer valueOf = Integer.valueOf(i2);
        h.e(valueOf, "step");
        if (z) {
            int i3 = aVar.e;
            int i4 = aVar.f3320f;
            if (aVar.f3321g <= 0) {
                i2 = -i2;
            }
            return new a(i3, i4, i2);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final c e(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new c(i2, i3 - 1);
        }
        c cVar = c.f3326i;
        return c.f3325h;
    }
}
