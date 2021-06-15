package g.f.c;

import g.f.c.d;
import java.util.ArrayList;

public class b implements d.a {
    public h a = null;
    public float b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<h> f2263c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public a f2264d;
    public boolean e = false;

    public interface a {
        float a(int i2);

        float b(b bVar, boolean z);

        void c(h hVar, float f2);

        void clear();

        float d(h hVar, boolean z);

        void e(h hVar, float f2, boolean z);

        h f(int i2);

        float g(h hVar);

        boolean h(h hVar);

        void i(float f2);

        void j();

        int k();
    }

    public b() {
    }

    public b(c cVar) {
        this.f2264d = new a(this, cVar);
    }

    @Override // g.f.c.d.a
    public void a(h hVar) {
        float f2;
        int i2 = hVar.e;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
            this.f2264d.c(hVar, f2);
        }
        f2 = 1.0f;
        this.f2264d.c(hVar, f2);
    }

    @Override // g.f.c.d.a
    public h b(d dVar, boolean[] zArr) {
        return i(zArr, null);
    }

    public b c(d dVar, int i2) {
        this.f2264d.c(dVar.k(i2, "ep"), 1.0f);
        this.f2264d.c(dVar.k(i2, "em"), -1.0f);
        return this;
    }

    @Override // g.f.c.d.a
    public void clear() {
        this.f2264d.clear();
        this.a = null;
        this.b = 0.0f;
    }

    public b d(h hVar, h hVar2, h hVar3, h hVar4, float f2) {
        this.f2264d.c(hVar, -1.0f);
        this.f2264d.c(hVar2, 1.0f);
        this.f2264d.c(hVar3, f2);
        this.f2264d.c(hVar4, -f2);
        return this;
    }

    public b e(h hVar, h hVar2, h hVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.b = (float) i2;
        }
        if (!z) {
            this.f2264d.c(hVar, -1.0f);
            this.f2264d.c(hVar2, 1.0f);
            this.f2264d.c(hVar3, 1.0f);
        } else {
            this.f2264d.c(hVar, 1.0f);
            this.f2264d.c(hVar2, -1.0f);
            this.f2264d.c(hVar3, -1.0f);
        }
        return this;
    }

    public b f(h hVar, h hVar2, h hVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.b = (float) i2;
        }
        if (!z) {
            this.f2264d.c(hVar, -1.0f);
            this.f2264d.c(hVar2, 1.0f);
            this.f2264d.c(hVar3, -1.0f);
        } else {
            this.f2264d.c(hVar, 1.0f);
            this.f2264d.c(hVar2, -1.0f);
            this.f2264d.c(hVar3, 1.0f);
        }
        return this;
    }

    public b g(h hVar, h hVar2, h hVar3, h hVar4, float f2) {
        this.f2264d.c(hVar3, 0.5f);
        this.f2264d.c(hVar4, 0.5f);
        this.f2264d.c(hVar, -0.5f);
        this.f2264d.c(hVar2, -0.5f);
        this.b = -f2;
        return this;
    }

    public final boolean h(h hVar) {
        return hVar.f2302m <= 1;
    }

    public final h i(boolean[] zArr, h hVar) {
        int i2;
        int k2 = this.f2264d.k();
        h hVar2 = null;
        float f2 = 0.0f;
        for (int i3 = 0; i3 < k2; i3++) {
            float a2 = this.f2264d.a(i3);
            if (a2 < 0.0f) {
                h f3 = this.f2264d.f(i3);
                if ((zArr == null || !zArr[f3.f2293c]) && f3 != hVar && (((i2 = f3.f2299j) == 3 || i2 == 4) && a2 < f2)) {
                    f2 = a2;
                    hVar2 = f3;
                }
            }
        }
        return hVar2;
    }

    @Override // g.f.c.d.a
    public boolean isEmpty() {
        return this.a == null && this.b == 0.0f && this.f2264d.k() == 0;
    }

    public void j(h hVar) {
        h hVar2 = this.a;
        if (hVar2 != null) {
            this.f2264d.c(hVar2, -1.0f);
            this.a.f2294d = -1;
            this.a = null;
        }
        float d2 = this.f2264d.d(hVar, true) * -1.0f;
        this.a = hVar;
        if (d2 != 1.0f) {
            this.b /= d2;
            this.f2264d.i(d2);
        }
    }

    public void k(d dVar, h hVar, boolean z) {
        if (hVar.f2296g) {
            float g2 = this.f2264d.g(hVar);
            this.b = (hVar.f2295f * g2) + this.b;
            this.f2264d.d(hVar, z);
            if (z) {
                hVar.b(this);
            }
            if (this.f2264d.k() == 0) {
                this.e = true;
                dVar.f2268d = true;
            }
        }
    }

    public void l(d dVar, b bVar, boolean z) {
        float b2 = this.f2264d.b(bVar, z);
        this.b = (bVar.b * b2) + this.b;
        if (z) {
            bVar.a.b(this);
        }
        if (this.a != null && this.f2264d.k() == 0) {
            this.e = true;
            dVar.f2268d = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.b.toString():java.lang.String");
    }
}
