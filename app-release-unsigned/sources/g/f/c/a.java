package g.f.c;

import g.f.c.b;
import java.util.Arrays;

public class a implements b.a {
    public int a = 0;
    public final b b;

    /* renamed from: c  reason: collision with root package name */
    public final c f2256c;

    /* renamed from: d  reason: collision with root package name */
    public int f2257d = 8;
    public int[] e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f2258f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f2259g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f2260h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f2261i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2262j = false;

    public a(b bVar, c cVar) {
        this.b = bVar;
        this.f2256c = cVar;
    }

    @Override // g.f.c.b.a
    public float a(int i2) {
        int i3 = this.f2260h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.f2259g[i3];
            }
            i3 = this.f2258f[i3];
            i4++;
        }
        return 0.0f;
    }

    @Override // g.f.c.b.a
    public float b(b bVar, boolean z) {
        float g2 = g(bVar.a);
        d(bVar.a, z);
        b.a aVar = bVar.f2264d;
        int k2 = aVar.k();
        for (int i2 = 0; i2 < k2; i2++) {
            h f2 = aVar.f(i2);
            e(f2, aVar.g(f2) * g2, z);
        }
        return g2;
    }

    @Override // g.f.c.b.a
    public final void c(h hVar, float f2) {
        if (f2 == 0.0f) {
            d(hVar, true);
            return;
        }
        int i2 = this.f2260h;
        if (i2 == -1) {
            this.f2260h = 0;
            this.f2259g[0] = f2;
            this.e[0] = hVar.f2293c;
            this.f2258f[0] = -1;
            hVar.f2302m++;
            hVar.a(this.b);
            this.a++;
            if (!this.f2262j) {
                int i3 = this.f2261i + 1;
                this.f2261i = i3;
                int[] iArr = this.e;
                if (i3 >= iArr.length) {
                    this.f2262j = true;
                    this.f2261i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.a) {
            int[] iArr2 = this.e;
            int i6 = iArr2[i2];
            int i7 = hVar.f2293c;
            if (i6 == i7) {
                this.f2259g[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i5 = i2;
            }
            i2 = this.f2258f[i2];
            i4++;
        }
        int i8 = this.f2261i;
        int i9 = i8 + 1;
        if (this.f2262j) {
            int[] iArr3 = this.e;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.e;
        if (i8 >= iArr4.length && this.a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.e;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.e;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.f2257d * 2;
            this.f2257d = i11;
            this.f2262j = false;
            this.f2261i = i8 - 1;
            this.f2259g = Arrays.copyOf(this.f2259g, i11);
            this.e = Arrays.copyOf(this.e, this.f2257d);
            this.f2258f = Arrays.copyOf(this.f2258f, this.f2257d);
        }
        this.e[i8] = hVar.f2293c;
        this.f2259g[i8] = f2;
        int[] iArr7 = this.f2258f;
        if (i5 != -1) {
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            iArr7[i8] = this.f2260h;
            this.f2260h = i8;
        }
        hVar.f2302m++;
        hVar.a(this.b);
        int i12 = this.a + 1;
        this.a = i12;
        if (!this.f2262j) {
            this.f2261i++;
        }
        int[] iArr8 = this.e;
        if (i12 >= iArr8.length) {
            this.f2262j = true;
        }
        if (this.f2261i >= iArr8.length) {
            this.f2262j = true;
            this.f2261i = iArr8.length - 1;
        }
    }

    @Override // g.f.c.b.a
    public final void clear() {
        int i2 = this.f2260h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            h hVar = this.f2256c.f2266d[this.e[i2]];
            if (hVar != null) {
                hVar.b(this.b);
            }
            i2 = this.f2258f[i2];
            i3++;
        }
        this.f2260h = -1;
        this.f2261i = -1;
        this.f2262j = false;
        this.a = 0;
    }

    @Override // g.f.c.b.a
    public final float d(h hVar, boolean z) {
        int i2 = this.f2260h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.a) {
            if (this.e[i2] == hVar.f2293c) {
                if (i2 == this.f2260h) {
                    this.f2260h = this.f2258f[i2];
                } else {
                    int[] iArr = this.f2258f;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    hVar.b(this.b);
                }
                hVar.f2302m--;
                this.a--;
                this.e[i2] = -1;
                if (this.f2262j) {
                    this.f2261i = i2;
                }
                return this.f2259g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f2258f[i2];
        }
        return 0.0f;
    }

    @Override // g.f.c.b.a
    public void e(h hVar, float f2, boolean z) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.f2260h;
            if (i2 == -1) {
                this.f2260h = 0;
                this.f2259g[0] = f2;
                this.e[0] = hVar.f2293c;
                this.f2258f[0] = -1;
                hVar.f2302m++;
                hVar.a(this.b);
                this.a++;
                if (!this.f2262j) {
                    int i3 = this.f2261i + 1;
                    this.f2261i = i3;
                    int[] iArr = this.e;
                    if (i3 >= iArr.length) {
                        this.f2262j = true;
                        this.f2261i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.a) {
                int[] iArr2 = this.e;
                int i6 = iArr2[i2];
                int i7 = hVar.f2293c;
                if (i6 == i7) {
                    float[] fArr = this.f2259g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.f2260h) {
                            this.f2260h = this.f2258f[i2];
                        } else {
                            int[] iArr3 = this.f2258f;
                            iArr3[i5] = iArr3[i2];
                        }
                        if (z) {
                            hVar.b(this.b);
                        }
                        if (this.f2262j) {
                            this.f2261i = i2;
                        }
                        hVar.f2302m--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i5 = i2;
                }
                i2 = this.f2258f[i2];
                i4++;
            }
            int i8 = this.f2261i;
            int i9 = i8 + 1;
            if (this.f2262j) {
                int[] iArr4 = this.e;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.e;
            if (i8 >= iArr5.length && this.a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.e;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.e;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.f2257d * 2;
                this.f2257d = i11;
                this.f2262j = false;
                this.f2261i = i8 - 1;
                this.f2259g = Arrays.copyOf(this.f2259g, i11);
                this.e = Arrays.copyOf(this.e, this.f2257d);
                this.f2258f = Arrays.copyOf(this.f2258f, this.f2257d);
            }
            this.e[i8] = hVar.f2293c;
            this.f2259g[i8] = f2;
            int[] iArr8 = this.f2258f;
            if (i5 != -1) {
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                iArr8[i8] = this.f2260h;
                this.f2260h = i8;
            }
            hVar.f2302m++;
            hVar.a(this.b);
            this.a++;
            if (!this.f2262j) {
                this.f2261i++;
            }
            int i12 = this.f2261i;
            int[] iArr9 = this.e;
            if (i12 >= iArr9.length) {
                this.f2262j = true;
                this.f2261i = iArr9.length - 1;
            }
        }
    }

    @Override // g.f.c.b.a
    public h f(int i2) {
        int i3 = this.f2260h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.f2256c.f2266d[this.e[i3]];
            }
            i3 = this.f2258f[i3];
            i4++;
        }
        return null;
    }

    @Override // g.f.c.b.a
    public final float g(h hVar) {
        int i2 = this.f2260h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.e[i2] == hVar.f2293c) {
                return this.f2259g[i2];
            }
            i2 = this.f2258f[i2];
            i3++;
        }
        return 0.0f;
    }

    @Override // g.f.c.b.a
    public boolean h(h hVar) {
        int i2 = this.f2260h;
        if (i2 == -1) {
            return false;
        }
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.e[i2] == hVar.f2293c) {
                return true;
            }
            i2 = this.f2258f[i2];
            i3++;
        }
        return false;
    }

    @Override // g.f.c.b.a
    public void i(float f2) {
        int i2 = this.f2260h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.f2259g;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f2258f[i2];
            i3++;
        }
    }

    @Override // g.f.c.b.a
    public void j() {
        int i2 = this.f2260h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.f2259g;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f2258f[i2];
            i3++;
        }
    }

    @Override // g.f.c.b.a
    public int k() {
        return this.a;
    }

    public String toString() {
        int i2 = this.f2260h;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            StringBuilder f2 = c.c.a.a.a.f(c.c.a.a.a.q(str, " -> "));
            f2.append(this.f2259g[i2]);
            f2.append(" : ");
            StringBuilder f3 = c.c.a.a.a.f(f2.toString());
            f3.append(this.f2256c.f2266d[this.e[i2]]);
            str = f3.toString();
            i2 = this.f2258f[i2];
            i3++;
        }
        return str;
    }
}
