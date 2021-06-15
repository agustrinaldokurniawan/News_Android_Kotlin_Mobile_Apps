package g.f.c;

import g.f.c.b;
import g.f.c.i.c;
import java.util.Arrays;
import java.util.Objects;

public class d {
    public static boolean a = false;
    public static int b = 1000;

    /* renamed from: c  reason: collision with root package name */
    public static long f2267c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2268d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public a f2269f;

    /* renamed from: g  reason: collision with root package name */
    public int f2270g;

    /* renamed from: h  reason: collision with root package name */
    public int f2271h;

    /* renamed from: i  reason: collision with root package name */
    public b[] f2272i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2273j;

    /* renamed from: k  reason: collision with root package name */
    public boolean[] f2274k;

    /* renamed from: l  reason: collision with root package name */
    public int f2275l;

    /* renamed from: m  reason: collision with root package name */
    public int f2276m;
    public int n;
    public final c o;
    public h[] p;
    public int q;
    public a r;

    public interface a {
        void a(h hVar);

        h b(d dVar, boolean[] zArr);

        void clear();

        boolean isEmpty();
    }

    public d() {
        this.f2268d = false;
        this.e = 0;
        this.f2270g = 32;
        this.f2271h = 32;
        this.f2272i = null;
        this.f2273j = false;
        this.f2274k = new boolean[32];
        this.f2275l = 1;
        this.f2276m = 0;
        this.n = 32;
        this.p = new h[b];
        this.q = 0;
        this.f2272i = new b[32];
        t();
        c cVar = new c();
        this.o = cVar;
        this.f2269f = new f(cVar);
        this.r = new b(cVar);
    }

    public final h a(int i2, String str) {
        h a2 = this.o.f2265c.a();
        if (a2 == null) {
            a2 = new h(i2);
        } else {
            a2.c();
        }
        a2.f2299j = i2;
        int i3 = this.q;
        int i4 = b;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            b = i5;
            this.p = (h[]) Arrays.copyOf(this.p, i5);
        }
        h[] hVarArr = this.p;
        int i6 = this.q;
        this.q = i6 + 1;
        hVarArr[i6] = a2;
        return a2;
    }

    public void b(h hVar, h hVar2, int i2, float f2, h hVar3, h hVar4, int i3, int i4) {
        float f3;
        int i5;
        b m2 = m();
        if (hVar2 == hVar3) {
            m2.f2264d.c(hVar, 1.0f);
            m2.f2264d.c(hVar4, 1.0f);
            m2.f2264d.c(hVar2, -2.0f);
        } else {
            if (f2 == 0.5f) {
                m2.f2264d.c(hVar, 1.0f);
                m2.f2264d.c(hVar2, -1.0f);
                m2.f2264d.c(hVar3, -1.0f);
                m2.f2264d.c(hVar4, 1.0f);
                if (i2 > 0 || i3 > 0) {
                    i5 = (-i2) + i3;
                }
            } else if (f2 <= 0.0f) {
                m2.f2264d.c(hVar, -1.0f);
                m2.f2264d.c(hVar2, 1.0f);
                f3 = (float) i2;
                m2.b = f3;
            } else if (f2 >= 1.0f) {
                m2.f2264d.c(hVar4, -1.0f);
                m2.f2264d.c(hVar3, 1.0f);
                i5 = -i3;
            } else {
                float f4 = 1.0f - f2;
                m2.f2264d.c(hVar, f4 * 1.0f);
                m2.f2264d.c(hVar2, f4 * -1.0f);
                m2.f2264d.c(hVar3, -1.0f * f2);
                m2.f2264d.c(hVar4, 1.0f * f2);
                if (i2 > 0 || i3 > 0) {
                    m2.b = (((float) i3) * f2) + (((float) (-i2)) * f4);
                }
            }
            f3 = (float) i5;
            m2.b = f3;
        }
        if (i4 != 8) {
            m2.c(this, i4);
        }
        c(m2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(g.f.c.b r17) {
        /*
        // Method dump skipped, instructions count: 433
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.d.c(g.f.c.b):void");
    }

    public b d(h hVar, h hVar2, int i2, int i3) {
        if (i3 == 8 && hVar2.f2296g && hVar.f2294d == -1) {
            hVar.d(this, hVar2.f2295f + ((float) i2));
            return null;
        }
        b m2 = m();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            m2.b = (float) i2;
        }
        if (!z) {
            m2.f2264d.c(hVar, -1.0f);
            m2.f2264d.c(hVar2, 1.0f);
        } else {
            m2.f2264d.c(hVar, 1.0f);
            m2.f2264d.c(hVar2, -1.0f);
        }
        if (i3 != 8) {
            m2.c(this, i3);
        }
        c(m2);
        return m2;
    }

    public void e(h hVar, int i2) {
        b bVar;
        b.a aVar;
        float f2;
        int i3 = hVar.f2294d;
        if (i3 == -1) {
            hVar.d(this, (float) i2);
            for (int i4 = 0; i4 < this.e + 1; i4++) {
                h hVar2 = this.o.f2266d[i4];
            }
            return;
        }
        if (i3 != -1) {
            b bVar2 = this.f2272i[i3];
            if (!bVar2.e) {
                if (bVar2.f2264d.k() == 0) {
                    bVar2.e = true;
                } else {
                    bVar = m();
                    if (i2 < 0) {
                        bVar.b = (float) (i2 * -1);
                        aVar = bVar.f2264d;
                        f2 = 1.0f;
                    } else {
                        bVar.b = (float) i2;
                        aVar = bVar.f2264d;
                        f2 = -1.0f;
                    }
                    aVar.c(hVar, f2);
                }
            }
            bVar2.b = (float) i2;
            return;
        }
        bVar = m();
        bVar.a = hVar;
        float f3 = (float) i2;
        hVar.f2295f = f3;
        bVar.b = f3;
        bVar.e = true;
        c(bVar);
    }

    public void f(h hVar, h hVar2, int i2, int i3) {
        b m2 = m();
        h n2 = n();
        n2.e = 0;
        m2.e(hVar, hVar2, n2, i2);
        if (i3 != 8) {
            m2.f2264d.c(k(i3, null), (float) ((int) (m2.f2264d.g(n2) * -1.0f)));
        }
        c(m2);
    }

    public void g(h hVar, h hVar2, int i2, int i3) {
        b m2 = m();
        h n2 = n();
        n2.e = 0;
        m2.f(hVar, hVar2, n2, i2);
        if (i3 != 8) {
            m2.f2264d.c(k(i3, null), (float) ((int) (m2.f2264d.g(n2) * -1.0f)));
        }
        c(m2);
    }

    public void h(h hVar, h hVar2, h hVar3, h hVar4, float f2, int i2) {
        b m2 = m();
        m2.d(hVar, hVar2, hVar3, hVar4, f2);
        if (i2 != 8) {
            m2.c(this, i2);
        }
        c(m2);
    }

    public final void i(b bVar) {
        int i2;
        if (bVar.e) {
            bVar.a.d(this, bVar.b);
        } else {
            b[] bVarArr = this.f2272i;
            int i3 = this.f2276m;
            bVarArr[i3] = bVar;
            h hVar = bVar.a;
            hVar.f2294d = i3;
            this.f2276m = i3 + 1;
            hVar.e(this, bVar);
        }
        if (this.f2268d) {
            int i4 = 0;
            while (i4 < this.f2276m) {
                if (this.f2272i[i4] == null) {
                    System.out.println("WTF");
                }
                b[] bVarArr2 = this.f2272i;
                if (bVarArr2[i4] != null && bVarArr2[i4].e) {
                    b bVar2 = bVarArr2[i4];
                    bVar2.a.d(this, bVar2.b);
                    this.o.b.b(bVar2);
                    this.f2272i[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.f2276m;
                        if (i5 >= i2) {
                            break;
                        }
                        b[] bVarArr3 = this.f2272i;
                        int i7 = i5 - 1;
                        bVarArr3[i7] = bVarArr3[i5];
                        if (bVarArr3[i7].a.f2294d == i5) {
                            bVarArr3[i7].a.f2294d = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f2272i[i6] = null;
                    }
                    this.f2276m = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.f2268d = false;
        }
    }

    public final void j() {
        for (int i2 = 0; i2 < this.f2276m; i2++) {
            b bVar = this.f2272i[i2];
            bVar.a.f2295f = bVar.b;
        }
    }

    public h k(int i2, String str) {
        if (this.f2275l + 1 >= this.f2271h) {
            p();
        }
        h a2 = a(4, str);
        int i3 = this.e + 1;
        this.e = i3;
        this.f2275l++;
        a2.f2293c = i3;
        a2.e = i2;
        this.o.f2266d[i3] = a2;
        this.f2269f.a(a2);
        return a2;
    }

    public h l(Object obj) {
        h hVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f2275l + 1 >= this.f2271h) {
            p();
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            hVar = cVar.f2318i;
            if (hVar == null) {
                cVar.l();
                hVar = cVar.f2318i;
            }
            int i2 = hVar.f2293c;
            if (i2 == -1 || i2 > this.e || this.o.f2266d[i2] == null) {
                if (i2 != -1) {
                    hVar.c();
                }
                int i3 = this.e + 1;
                this.e = i3;
                this.f2275l++;
                hVar.f2293c = i3;
                hVar.f2299j = 1;
                this.o.f2266d[i3] = hVar;
            }
        }
        return hVar;
    }

    public b m() {
        b a2 = this.o.b.a();
        if (a2 == null) {
            a2 = new b(this.o);
            f2267c++;
        } else {
            a2.a = null;
            a2.f2264d.clear();
            a2.b = 0.0f;
            a2.e = false;
        }
        h.a++;
        return a2;
    }

    public h n() {
        if (this.f2275l + 1 >= this.f2271h) {
            p();
        }
        h a2 = a(3, null);
        int i2 = this.e + 1;
        this.e = i2;
        this.f2275l++;
        a2.f2293c = i2;
        this.o.f2266d[i2] = a2;
        return a2;
    }

    public int o(Object obj) {
        h hVar = ((c) obj).f2318i;
        if (hVar != null) {
            return (int) (hVar.f2295f + 0.5f);
        }
        return 0;
    }

    public final void p() {
        int i2 = this.f2270g * 2;
        this.f2270g = i2;
        this.f2272i = (b[]) Arrays.copyOf(this.f2272i, i2);
        c cVar = this.o;
        cVar.f2266d = (h[]) Arrays.copyOf(cVar.f2266d, this.f2270g);
        int i3 = this.f2270g;
        this.f2274k = new boolean[i3];
        this.f2271h = i3;
        this.n = i3;
    }

    public void q() {
        if (this.f2269f.isEmpty()) {
            j();
            return;
        }
        if (this.f2273j) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f2276m) {
                    z = true;
                    break;
                } else if (!this.f2272i[i2].e) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                j();
                return;
            }
        }
        r(this.f2269f);
    }

    public void r(a aVar) {
        float f2;
        int i2;
        boolean z;
        int i3 = 0;
        while (true) {
            f2 = 0.0f;
            i2 = 1;
            if (i3 >= this.f2276m) {
                z = false;
                break;
            }
            b[] bVarArr = this.f2272i;
            if (bVarArr[i3].a.f2299j != 1 && bVarArr[i3].b < 0.0f) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            boolean z2 = false;
            int i4 = 0;
            while (!z2) {
                i4 += i2;
                float f3 = Float.MAX_VALUE;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                int i8 = 0;
                while (i7 < this.f2276m) {
                    b bVar = this.f2272i[i7];
                    if (bVar.a.f2299j != i2 && !bVar.e && bVar.b < f2) {
                        int k2 = bVar.f2264d.k();
                        int i9 = 0;
                        while (i9 < k2) {
                            h f4 = bVar.f2264d.f(i9);
                            float g2 = bVar.f2264d.g(f4);
                            if (g2 > f2) {
                                for (int i10 = 0; i10 < 9; i10++) {
                                    float f5 = f4.f2297h[i10] / g2;
                                    if ((f5 < f3 && i10 == i8) || i10 > i8) {
                                        i6 = f4.f2293c;
                                        i8 = i10;
                                        f3 = f5;
                                        i5 = i7;
                                    }
                                }
                            }
                            i9++;
                            f2 = 0.0f;
                        }
                    }
                    i7++;
                    f2 = 0.0f;
                    i2 = 1;
                }
                if (i5 != -1) {
                    b bVar2 = this.f2272i[i5];
                    bVar2.a.f2294d = -1;
                    bVar2.j(this.o.f2266d[i6]);
                    h hVar = bVar2.a;
                    hVar.f2294d = i5;
                    hVar.e(this, bVar2);
                } else {
                    z2 = true;
                }
                if (i4 > this.f2275l / 2) {
                    z2 = true;
                }
                f2 = 0.0f;
                i2 = 1;
            }
        }
        s(aVar);
        j();
    }

    public final int s(a aVar) {
        for (int i2 = 0; i2 < this.f2275l; i2++) {
            this.f2274k[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            i3++;
            if (i3 >= this.f2275l * 2) {
                return i3;
            }
            h hVar = ((b) aVar).a;
            if (hVar != null) {
                this.f2274k[hVar.f2293c] = true;
            }
            h b2 = aVar.b(this, this.f2274k);
            if (b2 != null) {
                boolean[] zArr = this.f2274k;
                int i4 = b2.f2293c;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (b2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f2276m; i6++) {
                    b bVar = this.f2272i[i6];
                    if (bVar.a.f2299j != 1 && !bVar.e && bVar.f2264d.h(b2)) {
                        float g2 = bVar.f2264d.g(b2);
                        if (g2 < 0.0f) {
                            float f3 = (-bVar.b) / g2;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    b bVar2 = this.f2272i[i5];
                    bVar2.a.f2294d = -1;
                    bVar2.j(b2);
                    h hVar2 = bVar2.a;
                    hVar2.f2294d = i5;
                    hVar2.e(this, bVar2);
                }
            } else {
                z = true;
            }
        }
        return i3;
    }

    public final void t() {
        for (int i2 = 0; i2 < this.f2276m; i2++) {
            b bVar = this.f2272i[i2];
            if (bVar != null) {
                this.o.b.b(bVar);
            }
            this.f2272i[i2] = null;
        }
    }

    public void u() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.o;
            h[] hVarArr = cVar.f2266d;
            if (i2 >= hVarArr.length) {
                break;
            }
            h hVar = hVarArr[i2];
            if (hVar != null) {
                hVar.c();
            }
            i2++;
        }
        e<h> eVar = cVar.f2265c;
        h[] hVarArr2 = this.p;
        int i3 = this.q;
        Objects.requireNonNull(eVar);
        if (i3 > hVarArr2.length) {
            i3 = hVarArr2.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            h hVar2 = hVarArr2[i4];
            int i5 = eVar.b;
            Object[] objArr = eVar.a;
            if (i5 < objArr.length) {
                objArr[i5] = hVar2;
                eVar.b = i5 + 1;
            }
        }
        this.q = 0;
        Arrays.fill(this.o.f2266d, (Object) null);
        this.e = 0;
        this.f2269f.clear();
        this.f2275l = 1;
        for (int i6 = 0; i6 < this.f2276m; i6++) {
            b[] bVarArr = this.f2272i;
            if (bVarArr[i6] != null) {
                Objects.requireNonNull(bVarArr[i6]);
            }
        }
        t();
        this.f2276m = 0;
        this.r = new b(this.o);
    }
}
