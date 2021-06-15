package g.f.c;

import g.f.c.b;
import java.util.Arrays;
import java.util.Comparator;

public class f extends b {

    /* renamed from: f  reason: collision with root package name */
    public int f2277f = 128;

    /* renamed from: g  reason: collision with root package name */
    public h[] f2278g = new h[128];

    /* renamed from: h  reason: collision with root package name */
    public h[] f2279h = new h[128];

    /* renamed from: i  reason: collision with root package name */
    public int f2280i = 0;

    /* renamed from: j  reason: collision with root package name */
    public b f2281j = new b(this);

    public class a implements Comparator<h> {
        public a(f fVar) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(h hVar, h hVar2) {
            return hVar.f2293c - hVar2.f2293c;
        }
    }

    public class b implements Comparable {
        public h e;

        public b(f fVar) {
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.e.f2293c - ((h) obj).f2293c;
        }

        public String toString() {
            String str = "[ ";
            if (this.e != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    StringBuilder f2 = c.c.a.a.a.f(str);
                    f2.append(this.e.f2298i[i2]);
                    f2.append(" ");
                    str = f2.toString();
                }
            }
            StringBuilder h2 = c.c.a.a.a.h(str, "] ");
            h2.append(this.e);
            return h2.toString();
        }
    }

    public f(c cVar) {
        super(cVar);
    }

    @Override // g.f.c.d.a, g.f.c.b
    public void a(h hVar) {
        this.f2281j.e = hVar;
        Arrays.fill(hVar.f2298i, 0.0f);
        hVar.f2298i[hVar.e] = 1.0f;
        m(hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r8 < r7) goto L_0x0057;
     */
    @Override // g.f.c.d.a, g.f.c.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g.f.c.h b(g.f.c.d r11, boolean[] r12) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.f.b(g.f.c.d, boolean[]):g.f.c.h");
    }

    @Override // g.f.c.d.a, g.f.c.b
    public void clear() {
        this.f2280i = 0;
        this.b = 0.0f;
    }

    @Override // g.f.c.d.a, g.f.c.b
    public boolean isEmpty() {
        return this.f2280i == 0;
    }

    @Override // g.f.c.b
    public void l(d dVar, b bVar, boolean z) {
        h hVar = bVar.a;
        if (hVar != null) {
            b.a aVar = bVar.f2264d;
            int k2 = aVar.k();
            for (int i2 = 0; i2 < k2; i2++) {
                h f2 = aVar.f(i2);
                float a2 = aVar.a(i2);
                b bVar2 = this.f2281j;
                bVar2.e = f2;
                boolean z2 = true;
                if (f2.b) {
                    for (int i3 = 0; i3 < 9; i3++) {
                        float[] fArr = bVar2.e.f2298i;
                        fArr[i3] = (hVar.f2298i[i3] * a2) + fArr[i3];
                        if (Math.abs(fArr[i3]) < 1.0E-4f) {
                            bVar2.e.f2298i[i3] = 0.0f;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        f.this.n(bVar2.e);
                    }
                    z2 = false;
                } else {
                    for (int i4 = 0; i4 < 9; i4++) {
                        float f3 = hVar.f2298i[i4];
                        if (f3 != 0.0f) {
                            float f4 = f3 * a2;
                            if (Math.abs(f4) < 1.0E-4f) {
                                f4 = 0.0f;
                            }
                            bVar2.e.f2298i[i4] = f4;
                        } else {
                            bVar2.e.f2298i[i4] = 0.0f;
                        }
                    }
                }
                if (z2) {
                    m(f2);
                }
                this.b = (bVar.b * a2) + this.b;
            }
            n(hVar);
        }
    }

    public final void m(h hVar) {
        int i2;
        int i3 = this.f2280i + 1;
        h[] hVarArr = this.f2278g;
        if (i3 > hVarArr.length) {
            h[] hVarArr2 = (h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
            this.f2278g = hVarArr2;
            this.f2279h = (h[]) Arrays.copyOf(hVarArr2, hVarArr2.length * 2);
        }
        h[] hVarArr3 = this.f2278g;
        int i4 = this.f2280i;
        hVarArr3[i4] = hVar;
        int i5 = i4 + 1;
        this.f2280i = i5;
        if (i5 > 1 && hVarArr3[i5 - 1].f2293c > hVar.f2293c) {
            int i6 = 0;
            while (true) {
                i2 = this.f2280i;
                if (i6 >= i2) {
                    break;
                }
                this.f2279h[i6] = this.f2278g[i6];
                i6++;
            }
            Arrays.sort(this.f2279h, 0, i2, new a(this));
            for (int i7 = 0; i7 < this.f2280i; i7++) {
                this.f2278g[i7] = this.f2279h[i7];
            }
        }
        hVar.b = true;
        hVar.a(this);
    }

    public final void n(h hVar) {
        int i2 = 0;
        while (i2 < this.f2280i) {
            if (this.f2278g[i2] == hVar) {
                while (true) {
                    int i3 = this.f2280i;
                    if (i2 < i3 - 1) {
                        h[] hVarArr = this.f2278g;
                        int i4 = i2 + 1;
                        hVarArr[i2] = hVarArr[i4];
                        i2 = i4;
                    } else {
                        this.f2280i = i3 - 1;
                        hVar.b = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // g.f.c.b
    public String toString() {
        StringBuilder h2 = c.c.a.a.a.h("", " goal -> (");
        h2.append(this.b);
        h2.append(") : ");
        String sb = h2.toString();
        for (int i2 = 0; i2 < this.f2280i; i2++) {
            this.f2281j.e = this.f2278g[i2];
            StringBuilder f2 = c.c.a.a.a.f(sb);
            f2.append(this.f2281j);
            f2.append(" ");
            sb = f2.toString();
        }
        return sb;
    }
}
