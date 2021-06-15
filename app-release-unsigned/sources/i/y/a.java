package i.y;

import i.s.c.f;
import i.s.c.h;
import i.u.d;
import i.y.b;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public abstract class a {
    public final TimeUnit a;

    /* renamed from: i.y.a$a  reason: collision with other inner class name */
    public static final class C0121a extends d {
        public final long a;
        public final a b;

        public C0121a(long j2, a aVar, long j3, f fVar) {
            this.a = j2;
            this.b = aVar;
        }

        @Override // i.y.d
        public long a() {
            long j2;
            Objects.requireNonNull((c) this.b);
            long nanoTime = System.nanoTime() - this.a;
            TimeUnit timeUnit = this.b.a;
            h.e(timeUnit, "unit");
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            h.e(timeUnit2, "sourceUnit");
            h.e(timeUnit, "targetUnit");
            long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
            if ((-convert) <= nanoTime && convert >= nanoTime) {
                h.e(timeUnit, "sourceUnit");
                h.e(timeUnit2, "targetUnit");
                j2 = h.a.t.a.q(timeUnit2.convert(nanoTime, timeUnit));
            } else {
                TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
                h.e(timeUnit, "sourceUnit");
                h.e(timeUnit3, "targetUnit");
                j2 = h.a.t.a.p(d.b(timeUnit3.convert(nanoTime, timeUnit), -4611686018427387903L, 4611686018427387903L));
            }
            long j3 = ((long) (((int) 0) & 1)) + 0;
            b.b(j3);
            if (b.d(j2)) {
                if ((true ^ b.d(j3)) || (j3 ^ j2) >= 0) {
                    return j2;
                }
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            } else if (b.d(j3)) {
                return j3;
            } else {
                int i2 = ((int) j2) & 1;
                if (i2 == (((int) j3) & 1)) {
                    long j4 = (j2 >> 1) + (j3 >> 1);
                    if (!b.c(j2)) {
                        return (-4611686018426L <= j4 && 4611686018426L >= j4) ? h.a.t.a.q(j4 * ((long) 1000000)) : h.a.t.a.p(d.b(j4, -4611686018427387903L, 4611686018427387903L));
                    }
                    if (-4611686018426999999L <= j4 && 4611686018426999999L >= j4) {
                        return h.a.t.a.q(j4);
                    }
                    return h.a.t.a.p(j4 / ((long) 1000000));
                }
                return i2 == 1 ? b.a(j2 >> 1, j3 >> 1) : b.a(j3 >> 1, j2 >> 1);
            }
        }
    }

    public a(TimeUnit timeUnit) {
        h.e(timeUnit, "unit");
        this.a = timeUnit;
    }

    public d a() {
        long nanoTime = System.nanoTime();
        b.a aVar = b.f3348g;
        b.a aVar2 = b.f3348g;
        return new C0121a(nanoTime, this, 0, null);
    }
}
