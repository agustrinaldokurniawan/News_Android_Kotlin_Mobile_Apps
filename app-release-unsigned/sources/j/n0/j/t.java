package j.n0.j;

import i.s.c.h;

public final class t {
    public int a;
    public final int[] b = new int[10];

    public final int a() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public final void b(t tVar) {
        h.f(tVar, "other");
        for (int i2 = 0; i2 < 10; i2++) {
            boolean z = true;
            if (((1 << i2) & tVar.a) == 0) {
                z = false;
            }
            if (z) {
                c(i2, tVar.b[i2]);
            }
        }
    }

    public final t c(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.b;
            if (i2 < iArr.length) {
                this.a = (1 << i2) | this.a;
                iArr[i2] = i3;
            }
        }
        return this;
    }
}
