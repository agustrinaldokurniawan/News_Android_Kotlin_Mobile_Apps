package g.f.c.i;

import g.f.c.d;
import java.util.ArrayList;

public class f extends k {
    public int A0 = -1;
    public int B0 = -1;
    public int C0 = -1;
    public int D0 = -1;
    public float E0 = 0.5f;
    public float F0 = 0.5f;
    public float G0 = 0.5f;
    public float H0 = 0.5f;
    public float I0 = 0.5f;
    public float J0 = 0.5f;
    public int K0 = 0;
    public int L0 = 0;
    public int M0 = 2;
    public int N0 = 2;
    public int O0 = 0;
    public int P0 = -1;
    public int Q0 = 0;
    public ArrayList<a> R0 = new ArrayList<>();
    public d[] S0 = null;
    public d[] T0 = null;
    public int[] U0 = null;
    public d[] V0;
    public int W0 = 0;
    public int y0 = -1;
    public int z0 = -1;

    public class a {
        public int a = 0;
        public d b = null;

        /* renamed from: c  reason: collision with root package name */
        public int f2337c = 0;

        /* renamed from: d  reason: collision with root package name */
        public c f2338d;
        public c e;

        /* renamed from: f  reason: collision with root package name */
        public c f2339f;

        /* renamed from: g  reason: collision with root package name */
        public c f2340g;

        /* renamed from: h  reason: collision with root package name */
        public int f2341h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f2342i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f2343j = 0;

        /* renamed from: k  reason: collision with root package name */
        public int f2344k = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f2345l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f2346m = 0;
        public int n = 0;
        public int o = 0;
        public int p = 0;
        public int q = 0;

        public a(int i2, c cVar, c cVar2, c cVar3, c cVar4, int i3) {
            this.a = i2;
            this.f2338d = cVar;
            this.e = cVar2;
            this.f2339f = cVar3;
            this.f2340g = cVar4;
            this.f2341h = f.this.r0;
            this.f2342i = f.this.n0;
            this.f2343j = f.this.s0;
            this.f2344k = f.this.o0;
            this.q = i3;
        }

        public void a(d dVar) {
            int i2 = 0;
            if (this.a == 0) {
                int W = f.this.W(dVar, this.q);
                if (dVar.o() == 3) {
                    this.p++;
                    W = 0;
                }
                f fVar = f.this;
                int i3 = fVar.K0;
                if (dVar.c0 != 8) {
                    i2 = i3;
                }
                this.f2345l = W + i2 + this.f2345l;
                int V = fVar.V(dVar, this.q);
                if (this.b == null || this.f2337c < V) {
                    this.b = dVar;
                    this.f2337c = V;
                    this.f2346m = V;
                }
            } else {
                int W2 = f.this.W(dVar, this.q);
                int V2 = f.this.V(dVar, this.q);
                if (dVar.s() == 3) {
                    this.p++;
                    V2 = 0;
                }
                int i4 = f.this.L0;
                if (dVar.c0 != 8) {
                    i2 = i4;
                }
                this.f2346m = V2 + i2 + this.f2346m;
                if (this.b == null || this.f2337c < W2) {
                    this.b = dVar;
                    this.f2337c = W2;
                    this.f2345l = W2;
                }
            }
            this.o++;
        }

        /* JADX WARNING: Removed duplicated region for block: B:123:0x01cc  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(boolean r18, int r19, boolean r20) {
            /*
            // Method dump skipped, instructions count: 667
            */
            throw new UnsupportedOperationException("Method not decompiled: g.f.c.i.f.a.b(boolean, int, boolean):void");
        }

        public int c() {
            if (this.a == 1) {
                return this.f2346m - f.this.L0;
            }
            return this.f2346m;
        }

        public int d() {
            if (this.a == 0) {
                return this.f2345l - f.this.K0;
            }
            return this.f2345l;
        }

        public void e(int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            f fVar;
            int i7 = this.p;
            if (i7 != 0) {
                int i8 = this.o;
                int i9 = i2 / i7;
                for (int i10 = 0; i10 < i8; i10++) {
                    int i11 = this.n + i10;
                    f fVar2 = f.this;
                    if (i11 >= fVar2.W0) {
                        break;
                    }
                    d dVar = fVar2.V0[i11];
                    if (this.a == 0) {
                        if (dVar != null && dVar.o() == 3 && dVar.f2335l == 0) {
                            f fVar3 = f.this;
                            i5 = i9;
                            i4 = dVar.s();
                            i3 = dVar.n();
                            fVar = fVar3;
                            i6 = 1;
                        }
                    } else {
                        if (dVar != null && dVar.s() == 3 && dVar.f2336m == 0) {
                            f fVar4 = f.this;
                            int o2 = dVar.o();
                            i3 = i9;
                            i4 = 1;
                            i5 = dVar.t();
                            i6 = o2;
                            fVar = fVar4;
                        }
                    }
                    fVar.U(dVar, i6, i5, i4, i3);
                }
                this.f2345l = 0;
                this.f2346m = 0;
                this.b = null;
                this.f2337c = 0;
                int i12 = this.o;
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = this.n + i13;
                    f fVar5 = f.this;
                    if (i14 < fVar5.W0) {
                        d dVar2 = fVar5.V0[i14];
                        if (this.a == 0) {
                            int t = dVar2.t();
                            f fVar6 = f.this;
                            int i15 = fVar6.K0;
                            if (dVar2.c0 == 8) {
                                i15 = 0;
                            }
                            this.f2345l = t + i15 + this.f2345l;
                            int V = fVar6.V(dVar2, this.q);
                            if (this.b == null || this.f2337c < V) {
                                this.b = dVar2;
                                this.f2337c = V;
                                this.f2346m = V;
                            }
                        } else {
                            int W = fVar5.W(dVar2, this.q);
                            int V2 = f.this.V(dVar2, this.q);
                            int i16 = f.this.L0;
                            if (dVar2.c0 == 8) {
                                i16 = 0;
                            }
                            this.f2346m = V2 + i16 + this.f2346m;
                            if (this.b == null || this.f2337c < W) {
                                this.b = dVar2;
                                this.f2337c = W;
                                this.f2345l = W;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public void f(int i2, c cVar, c cVar2, c cVar3, c cVar4, int i3, int i4, int i5, int i6, int i7) {
            this.a = i2;
            this.f2338d = cVar;
            this.e = cVar2;
            this.f2339f = cVar3;
            this.f2340g = cVar4;
            this.f2341h = i3;
            this.f2342i = i4;
            this.f2343j = i5;
            this.f2344k = i6;
            this.q = i7;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v4, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v5, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v6, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a8, code lost:
        if (r33.z0 == -1) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b3, code lost:
        if (r33.z0 == -1) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x05ea  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x05ec  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x05fa  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x05fc  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0616  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0618  */
    @Override // g.f.c.i.k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void T(int r34, int r35, int r36, int r37) {
        /*
        // Method dump skipped, instructions count: 1564
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.i.f.T(int, int, int, int):void");
    }

    public final int V(d dVar, int i2) {
        if (dVar == null) {
            return 0;
        }
        if (dVar.s() == 3) {
            int i3 = dVar.f2336m;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (dVar.t * ((float) i2));
                if (i4 != dVar.n()) {
                    dVar.f2330g = true;
                    U(dVar, dVar.o(), dVar.t(), 1, i4);
                }
                return i4;
            } else if (i3 == 1) {
                return dVar.n();
            } else {
                if (i3 == 3) {
                    return (int) ((((float) dVar.t()) * dVar.S) + 0.5f);
                }
            }
        }
        return dVar.n();
    }

    public final int W(d dVar, int i2) {
        if (dVar == null) {
            return 0;
        }
        if (dVar.o() == 3) {
            int i3 = dVar.f2335l;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (dVar.q * ((float) i2));
                if (i4 != dVar.t()) {
                    dVar.f2330g = true;
                    U(dVar, 1, i4, dVar.s(), dVar.n());
                }
                return i4;
            } else if (i3 == 1) {
                return dVar.t();
            } else {
                if (i3 == 3) {
                    return (int) ((((float) dVar.n()) * dVar.S) + 0.5f);
                }
            }
        }
        return dVar.t();
    }

    @Override // g.f.c.i.d
    public void d(d dVar, boolean z) {
        d dVar2;
        super.d(dVar, z);
        d dVar3 = this.P;
        boolean z2 = dVar3 != null ? ((e) dVar3).p0 : false;
        int i2 = this.O0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = this.R0.size();
                int i3 = 0;
                while (i3 < size) {
                    this.R0.get(i3).b(z2, i3, i3 == size + -1);
                    i3++;
                }
            } else if (!(i2 != 2 || this.U0 == null || this.T0 == null || this.S0 == null)) {
                for (int i4 = 0; i4 < this.W0; i4++) {
                    this.V0[i4].E();
                }
                int[] iArr = this.U0;
                int i5 = iArr[0];
                int i6 = iArr[1];
                d dVar4 = null;
                for (int i7 = 0; i7 < i5; i7++) {
                    d dVar5 = this.T0[z2 ? (i5 - i7) - 1 : i7];
                    if (!(dVar5 == null || dVar5.c0 == 8)) {
                        if (i7 == 0) {
                            dVar5.h(dVar5.D, this.D, this.r0);
                            dVar5.e0 = this.y0;
                            dVar5.Z = this.E0;
                        }
                        if (i7 == i5 - 1) {
                            dVar5.h(dVar5.F, this.F, this.s0);
                        }
                        if (i7 > 0) {
                            dVar5.h(dVar5.D, dVar4.F, this.K0);
                            dVar4.h(dVar4.F, dVar5.D, 0);
                        }
                        dVar4 = dVar5;
                    }
                }
                for (int i8 = 0; i8 < i6; i8++) {
                    d dVar6 = this.S0[i8];
                    if (!(dVar6 == null || dVar6.c0 == 8)) {
                        if (i8 == 0) {
                            dVar6.h(dVar6.E, this.E, this.n0);
                            dVar6.f0 = this.z0;
                            dVar6.a0 = this.F0;
                        }
                        if (i8 == i6 - 1) {
                            dVar6.h(dVar6.G, this.G, this.o0);
                        }
                        if (i8 > 0) {
                            dVar6.h(dVar6.E, dVar4.G, this.L0);
                            dVar4.h(dVar4.G, dVar6.E, 0);
                        }
                        dVar4 = dVar6;
                    }
                }
                for (int i9 = 0; i9 < i5; i9++) {
                    for (int i10 = 0; i10 < i6; i10++) {
                        int i11 = (i10 * i5) + i9;
                        if (this.Q0 == 1) {
                            i11 = (i9 * i6) + i10;
                        }
                        d[] dVarArr = this.V0;
                        if (!(i11 >= dVarArr.length || (dVar2 = dVarArr[i11]) == null || dVar2.c0 == 8)) {
                            d dVar7 = this.T0[i9];
                            d dVar8 = this.S0[i10];
                            if (dVar2 != dVar7) {
                                dVar2.h(dVar2.D, dVar7.D, 0);
                                dVar2.h(dVar2.F, dVar7.F, 0);
                            }
                            if (dVar2 != dVar8) {
                                dVar2.h(dVar2.E, dVar8.E, 0);
                                dVar2.h(dVar2.G, dVar8.G, 0);
                            }
                        }
                    }
                }
            }
        } else if (this.R0.size() > 0) {
            this.R0.get(0).b(z2, 0, true);
        }
        this.t0 = false;
    }
}
