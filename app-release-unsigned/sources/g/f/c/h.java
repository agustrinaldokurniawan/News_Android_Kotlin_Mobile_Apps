package g.f.c;

import c.c.a.a.a;
import java.util.Arrays;

public class h {
    public static int a = 1;
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public int f2293c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f2294d = -1;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f2295f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2296g = false;

    /* renamed from: h  reason: collision with root package name */
    public float[] f2297h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    public float[] f2298i = new float[9];

    /* renamed from: j  reason: collision with root package name */
    public int f2299j;

    /* renamed from: k  reason: collision with root package name */
    public b[] f2300k = new b[16];

    /* renamed from: l  reason: collision with root package name */
    public int f2301l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f2302m = 0;
    public int n = -1;

    public h(int i2) {
        this.f2299j = i2;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f2301l;
            if (i2 >= i3) {
                b[] bVarArr = this.f2300k;
                if (i3 >= bVarArr.length) {
                    this.f2300k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f2300k;
                int i4 = this.f2301l;
                bVarArr2[i4] = bVar;
                this.f2301l = i4 + 1;
                return;
            } else if (this.f2300k[i2] != bVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i2 = this.f2301l;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f2300k[i3] == bVar) {
                while (i3 < i2 - 1) {
                    b[] bVarArr = this.f2300k;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.f2301l--;
                return;
            }
            i3++;
        }
    }

    public void c() {
        this.f2299j = 5;
        this.e = 0;
        this.f2293c = -1;
        this.f2294d = -1;
        this.f2295f = 0.0f;
        this.f2296g = false;
        this.n = -1;
        int i2 = this.f2301l;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2300k[i3] = null;
        }
        this.f2301l = 0;
        this.f2302m = 0;
        this.b = false;
        Arrays.fill(this.f2298i, 0.0f);
    }

    public void d(d dVar, float f2) {
        this.f2295f = f2;
        this.f2296g = true;
        this.n = -1;
        int i2 = this.f2301l;
        this.f2294d = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2300k[i3].k(dVar, this, false);
        }
        this.f2301l = 0;
    }

    public final void e(d dVar, b bVar) {
        int i2 = this.f2301l;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2300k[i3].l(dVar, bVar, false);
        }
        this.f2301l = 0;
    }

    public String toString() {
        StringBuilder f2 = a.f("");
        f2.append(this.f2293c);
        return f2.toString();
    }
}
