package i.y;

import i.s.c.f;
import i.s.c.h;
import i.u.d;
import java.util.concurrent.TimeUnit;

public final class b implements Comparable<b> {
    public static final long e = h.a.t.a.p(4611686018427387903L);

    /* renamed from: f  reason: collision with root package name */
    public static final long f3347f = h.a.t.a.p(-4611686018427387903L);

    /* renamed from: g  reason: collision with root package name */
    public static final a f3348g = new a(null);

    public static final class a {
        public a(f fVar) {
        }
    }

    static {
        b(0);
    }

    public static final long a(long j2, long j3) {
        long j4 = (long) 1000000;
        long j5 = j3 / j4;
        long j6 = j2 + j5;
        if (-4611686018426L > j6 || 4611686018426L < j6) {
            return h.a.t.a.p(d.b(j6, -4611686018427387903L, 4611686018427387903L));
        }
        return h.a.t.a.q((j6 * j4) + (j3 - (j5 * j4)));
    }

    public static long b(long j2) {
        if (c(j2)) {
            long j3 = j2 >> 1;
            if (-4611686018426999999L > j3 || 4611686018426999999L < j3) {
                throw new AssertionError(j3 + " ns is out of nanoseconds range");
            }
        } else {
            long j4 = j2 >> 1;
            if (-4611686018427387903L > j4 || 4611686018427387903L < j4) {
                throw new AssertionError(j4 + " ms is out of milliseconds range");
            } else if (-4611686018426L <= j4 && 4611686018426L >= j4) {
                throw new AssertionError(j4 + " ms is denormalized");
            }
        }
        return j2;
    }

    public static final boolean c(long j2) {
        return (((int) j2) & 1) == 0;
    }

    public static final boolean d(long j2) {
        return j2 == e || j2 == f3347f;
    }

    public static final double e(long j2, TimeUnit timeUnit) {
        h.e(timeUnit, "unit");
        if (j2 == e) {
            return Double.POSITIVE_INFINITY;
        }
        if (j2 == f3347f) {
            return Double.NEGATIVE_INFINITY;
        }
        double d2 = (double) (j2 >> 1);
        TimeUnit timeUnit2 = c(j2) ? TimeUnit.NANOSECONDS : TimeUnit.MILLISECONDS;
        h.e(timeUnit2, "sourceUnit");
        h.e(timeUnit, "targetUnit");
        long convert = timeUnit.convert(1, timeUnit2);
        return convert > 0 ? d2 * ((double) convert) : d2 / ((double) timeUnit2.convert(1, timeUnit));
    }
}
