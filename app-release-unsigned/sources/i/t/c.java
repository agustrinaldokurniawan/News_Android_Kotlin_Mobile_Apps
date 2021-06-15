package i.t;

import i.r.b;
import i.s.c.f;
import i.s.c.h;
import java.io.Serializable;

public abstract class c {
    public static final c e = b.a.b();

    /* renamed from: f  reason: collision with root package name */
    public static final a f3319f = new a(null);

    public static final class a extends c implements Serializable {
        public a(f fVar) {
        }

        @Override // i.t.c
        public int a(int i2) {
            return c.e.a(i2);
        }

        @Override // i.t.c
        public int b() {
            return c.e.b();
        }

        @Override // i.t.c
        public int c(int i2, int i3) {
            return c.e.c(i2, i3);
        }
    }

    public abstract int a(int i2);

    public abstract int b();

    public int c(int i2, int i3) {
        int i4;
        int b;
        int i5;
        if (i3 > i2) {
            int i6 = i3 - i2;
            if (i6 > 0 || i6 == Integer.MIN_VALUE) {
                if (((-i6) & i6) == i6) {
                    i4 = a(31 - Integer.numberOfLeadingZeros(i6));
                } else {
                    do {
                        b = b() >>> 1;
                        i5 = b % i6;
                    } while ((i6 - 1) + (b - i5) < 0);
                    i4 = i5;
                }
                return i2 + i4;
            }
            while (true) {
                int b2 = b();
                if (i2 <= b2 && i3 > b2) {
                    return b2;
                }
            }
        } else {
            Integer valueOf = Integer.valueOf(i2);
            Integer valueOf2 = Integer.valueOf(i3);
            h.e(valueOf, "from");
            h.e(valueOf2, "until");
            throw new IllegalArgumentException(("Random range is empty: [" + valueOf + ", " + valueOf2 + ").").toString());
        }
    }
}
