package g.f.c.i;

import c.c.a.a.a;
import g.f.c.i.c;
import g.f.c.i.m.c;
import g.f.c.i.m.f;
import g.f.c.i.m.k;
import g.f.c.i.m.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class d {
    public boolean A = false;
    public int B = 0;
    public int C = 0;
    public c D;
    public c E;
    public c F;
    public c G;
    public c H;
    public c I;
    public c J;
    public c K;
    public c[] L;
    public ArrayList<c> M;
    public boolean[] N;
    public int[] O;
    public d P;
    public int Q;
    public int R;
    public float S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public float Z;
    public boolean a = false;
    public float a0;
    public c b;
    public Object b0;

    /* renamed from: c  reason: collision with root package name */
    public c f2327c;
    public int c0;

    /* renamed from: d  reason: collision with root package name */
    public k f2328d = null;
    public String d0;
    public m e = null;
    public int e0;

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f2329f = {true, true};
    public int f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2330g = true;
    public float[] g0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2331h = false;
    public d[] h0;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2332i = false;
    public d[] i0;

    /* renamed from: j  reason: collision with root package name */
    public int f2333j = -1;
    public int j0;

    /* renamed from: k  reason: collision with root package name */
    public int f2334k = -1;
    public int k0;

    /* renamed from: l  reason: collision with root package name */
    public int f2335l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f2336m = 0;
    public int[] n = new int[2];
    public int o = 0;
    public int p = 0;
    public float q = 1.0f;
    public int r = 0;
    public int s = 0;
    public float t = 1.0f;
    public int u = -1;
    public float v = 1.0f;
    public int[] w = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float x = 0.0f;
    public boolean y = false;
    public boolean z;

    public d() {
        c cVar = new c(this, c.a.LEFT);
        this.D = cVar;
        c cVar2 = new c(this, c.a.TOP);
        this.E = cVar2;
        c cVar3 = new c(this, c.a.RIGHT);
        this.F = cVar3;
        c cVar4 = new c(this, c.a.BOTTOM);
        this.G = cVar4;
        c cVar5 = new c(this, c.a.BASELINE);
        this.H = cVar5;
        this.I = new c(this, c.a.CENTER_X);
        this.J = new c(this, c.a.CENTER_Y);
        c cVar6 = new c(this, c.a.CENTER);
        this.K = cVar6;
        this.L = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar6};
        ArrayList<c> arrayList = new ArrayList<>();
        this.M = arrayList;
        this.N = new boolean[2];
        this.O = new int[]{1, 1};
        this.P = null;
        this.Q = 0;
        this.R = 0;
        this.S = 0.0f;
        this.T = -1;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.Z = 0.5f;
        this.a0 = 0.5f;
        this.c0 = 0;
        this.d0 = null;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = new float[]{-1.0f, -1.0f};
        this.h0 = new d[]{null, null};
        this.i0 = new d[]{null, null};
        this.j0 = -1;
        this.k0 = -1;
        arrayList.add(this.D);
        this.M.add(this.E);
        this.M.add(this.F);
        this.M.add(this.G);
        this.M.add(this.I);
        this.M.add(this.J);
        this.M.add(this.K);
        this.M.add(this.H);
    }

    public boolean A() {
        return this.f2330g && this.c0 != 8;
    }

    public boolean B() {
        return this.f2331h || (this.D.f2313c && this.F.f2313c);
    }

    public boolean C() {
        return this.f2332i || (this.E.f2313c && this.G.f2313c);
    }

    public void D() {
        this.D.k();
        this.E.k();
        this.F.k();
        this.G.k();
        this.H.k();
        this.I.k();
        this.J.k();
        this.K.k();
        this.P = null;
        this.x = 0.0f;
        this.Q = 0;
        this.R = 0;
        this.S = 0.0f;
        this.T = -1;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.5f;
        this.a0 = 0.5f;
        int[] iArr = this.O;
        iArr[0] = 1;
        iArr[1] = 1;
        this.b0 = null;
        this.c0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        float[] fArr = this.g0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f2333j = -1;
        this.f2334k = -1;
        int[] iArr2 = this.w;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f2335l = 0;
        this.f2336m = 0;
        this.q = 1.0f;
        this.t = 1.0f;
        this.p = Integer.MAX_VALUE;
        this.s = Integer.MAX_VALUE;
        this.o = 0;
        this.r = 0;
        this.u = -1;
        this.v = 1.0f;
        boolean[] zArr = this.f2329f;
        zArr[0] = true;
        zArr[1] = true;
        this.A = false;
        boolean[] zArr2 = this.N;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f2330g = true;
    }

    public void E() {
        d dVar = this.P;
        if (dVar != null && (dVar instanceof e)) {
            Objects.requireNonNull((e) dVar);
        }
        int size = this.M.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.M.get(i2).k();
        }
    }

    public void F() {
        this.f2331h = false;
        this.f2332i = false;
        int size = this.M.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = this.M.get(i2);
            cVar.f2313c = false;
            cVar.b = 0;
        }
    }

    public void G(g.f.c.c cVar) {
        this.D.l();
        this.E.l();
        this.F.l();
        this.G.l();
        this.H.l();
        this.K.l();
        this.I.l();
        this.J.l();
    }

    public void H(int i2) {
        this.W = i2;
        this.y = i2 > 0;
    }

    public void I(int i2, int i3) {
        c cVar = this.D;
        cVar.b = i2;
        cVar.f2313c = true;
        c cVar2 = this.F;
        cVar2.b = i3;
        cVar2.f2313c = true;
        this.U = i2;
        this.Q = i3 - i2;
        this.f2331h = true;
    }

    public void J(int i2, int i3) {
        c cVar = this.E;
        cVar.b = i2;
        cVar.f2313c = true;
        c cVar2 = this.G;
        cVar2.b = i3;
        cVar2.f2313c = true;
        this.V = i2;
        this.R = i3 - i2;
        if (this.y) {
            this.H.m(i2 + this.W);
        }
        this.f2332i = true;
    }

    public void K(int i2) {
        this.R = i2;
        int i3 = this.Y;
        if (i2 < i3) {
            this.R = i3;
        }
    }

    public void L(int i2) {
        this.O[0] = i2;
    }

    public void M(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.Y = i2;
    }

    public void N(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.X = i2;
    }

    public void O(int i2) {
        this.O[1] = i2;
    }

    public void P(int i2) {
        this.Q = i2;
        int i3 = this.X;
        if (i2 < i3) {
            this.Q = i3;
        }
    }

    public void Q(boolean z2, boolean z3) {
        int i2;
        int i3;
        k kVar = this.f2328d;
        boolean z4 = z2 & kVar.f2390g;
        m mVar = this.e;
        boolean z5 = z3 & mVar.f2390g;
        int i4 = kVar.f2391h.f2365g;
        int i5 = mVar.f2391h.f2365g;
        int i6 = kVar.f2392i.f2365g;
        int i7 = mVar.f2392i.f2365g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i7 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (z4) {
            this.U = i4;
        }
        if (z5) {
            this.V = i5;
        }
        if (this.c0 == 8) {
            this.Q = 0;
            this.R = 0;
            return;
        }
        if (z4) {
            if (this.O[0] == 1 && i9 < (i3 = this.Q)) {
                i9 = i3;
            }
            this.Q = i9;
            int i11 = this.X;
            if (i9 < i11) {
                this.Q = i11;
            }
        }
        if (z5) {
            if (this.O[1] == 1 && i10 < (i2 = this.R)) {
                i10 = i2;
            }
            this.R = i10;
            int i12 = this.Y;
            if (i10 < i12) {
                this.R = i12;
            }
        }
    }

    public void R(g.f.c.d dVar, boolean z2) {
        int i2;
        int i3;
        m mVar;
        k kVar;
        int o2 = dVar.o(this.D);
        int o3 = dVar.o(this.E);
        int o4 = dVar.o(this.F);
        int o5 = dVar.o(this.G);
        if (z2 && (kVar = this.f2328d) != null) {
            f fVar = kVar.f2391h;
            if (fVar.f2368j) {
                f fVar2 = kVar.f2392i;
                if (fVar2.f2368j) {
                    o2 = fVar.f2365g;
                    o4 = fVar2.f2365g;
                }
            }
        }
        if (z2 && (mVar = this.e) != null) {
            f fVar3 = mVar.f2391h;
            if (fVar3.f2368j) {
                f fVar4 = mVar.f2392i;
                if (fVar4.f2368j) {
                    o3 = fVar3.f2365g;
                    o5 = fVar4.f2365g;
                }
            }
        }
        int i4 = o5 - o3;
        if (o4 - o2 < 0 || i4 < 0 || o2 == Integer.MIN_VALUE || o2 == Integer.MAX_VALUE || o3 == Integer.MIN_VALUE || o3 == Integer.MAX_VALUE || o4 == Integer.MIN_VALUE || o4 == Integer.MAX_VALUE || o5 == Integer.MIN_VALUE || o5 == Integer.MAX_VALUE) {
            o5 = 0;
            o2 = 0;
            o3 = 0;
            o4 = 0;
        }
        int i5 = o4 - o2;
        int i6 = o5 - o3;
        this.U = o2;
        this.V = o3;
        if (this.c0 == 8) {
            this.Q = 0;
            this.R = 0;
            return;
        }
        int[] iArr = this.O;
        if (iArr[0] == 1 && i5 < (i3 = this.Q)) {
            i5 = i3;
        }
        if (iArr[1] == 1 && i6 < (i2 = this.R)) {
            i6 = i2;
        }
        this.Q = i5;
        this.R = i6;
        int i7 = this.Y;
        if (i6 < i7) {
            this.R = i7;
        }
        int i8 = this.X;
        if (i5 < i8) {
            this.Q = i8;
        }
    }

    public void b(e eVar, g.f.c.d dVar, HashSet<d> hashSet, int i2, boolean z2) {
        if (z2) {
            if (hashSet.contains(this)) {
                j.a(eVar, dVar, this);
                hashSet.remove(this);
                d(dVar, eVar.b0(64));
            } else {
                return;
            }
        }
        if (i2 == 0) {
            HashSet<c> hashSet2 = this.D.a;
            if (hashSet2 != null) {
                Iterator<c> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f2314d.b(eVar, dVar, hashSet, i2, true);
                }
            }
            HashSet<c> hashSet3 = this.F.a;
            if (hashSet3 != null) {
                Iterator<c> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f2314d.b(eVar, dVar, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet<c> hashSet4 = this.E.a;
        if (hashSet4 != null) {
            Iterator<c> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f2314d.b(eVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<c> hashSet5 = this.G.a;
        if (hashSet5 != null) {
            Iterator<c> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f2314d.b(eVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<c> hashSet6 = this.H.a;
        if (hashSet6 != null) {
            Iterator<c> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f2314d.b(eVar, dVar, hashSet, i2, true);
            }
        }
    }

    public boolean c() {
        return (this instanceof k) || (this instanceof g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:193:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x059b  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x05e7  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x060e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(g.f.c.d r50, boolean r51) {
        /*
        // Method dump skipped, instructions count: 1702
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.i.d.d(g.f.c.d, boolean):void");
    }

    public boolean e() {
        return this.c0 != 8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:156:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x030b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03aa A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0428 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0445 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x046e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:321:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:325:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(g.f.c.d r31, boolean r32, boolean r33, boolean r34, boolean r35, g.f.c.h r36, g.f.c.h r37, int r38, boolean r39, g.f.c.i.c r40, g.f.c.i.c r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
        // Method dump skipped, instructions count: 1197
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.i.d.f(g.f.c.d, boolean, boolean, boolean, boolean, g.f.c.h, g.f.c.h, int, boolean, g.f.c.i.c, g.f.c.i.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0162, code lost:
        if (r13.i() != false) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0189, code lost:
        if (r13.i() != false) goto L_0x018b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(g.f.c.i.c.a r11, g.f.c.i.d r12, g.f.c.i.c.a r13, int r14) {
        /*
        // Method dump skipped, instructions count: 405
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.i.d.g(g.f.c.i.c$a, g.f.c.i.d, g.f.c.i.c$a, int):void");
    }

    public void h(c cVar, c cVar2, int i2) {
        if (cVar.f2314d == this) {
            g(cVar.e, cVar2.f2314d, cVar2.e, i2);
        }
    }

    public void i(g.f.c.d dVar) {
        dVar.l(this.D);
        dVar.l(this.E);
        dVar.l(this.F);
        dVar.l(this.G);
        if (this.W > 0) {
            dVar.l(this.H);
        }
    }

    public void j() {
        if (this.f2328d == null) {
            this.f2328d = new k(this);
        }
        if (this.e == null) {
            this.e = new m(this);
        }
    }

    public c k(c.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.D;
            case 2:
                return this.E;
            case 3:
                return this.F;
            case 4:
                return this.G;
            case 5:
                return this.H;
            case 6:
                return this.K;
            case 7:
                return this.I;
            case 8:
                return this.J;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public int l() {
        return v() + this.R;
    }

    public int m(int i2) {
        if (i2 == 0) {
            return o();
        }
        if (i2 == 1) {
            return s();
        }
        return 0;
    }

    public int n() {
        if (this.c0 == 8) {
            return 0;
        }
        return this.R;
    }

    public int o() {
        return this.O[0];
    }

    public d p(int i2) {
        c cVar;
        c cVar2;
        if (i2 == 0) {
            c cVar3 = this.F;
            c cVar4 = cVar3.f2315f;
            if (cVar4 == null || cVar4.f2315f != cVar3) {
                return null;
            }
            return cVar4.f2314d;
        } else if (i2 == 1 && (cVar2 = (cVar = this.G).f2315f) != null && cVar2.f2315f == cVar) {
            return cVar2.f2314d;
        } else {
            return null;
        }
    }

    public d q(int i2) {
        c cVar;
        c cVar2;
        if (i2 == 0) {
            c cVar3 = this.D;
            c cVar4 = cVar3.f2315f;
            if (cVar4 == null || cVar4.f2315f != cVar3) {
                return null;
            }
            return cVar4.f2314d;
        } else if (i2 == 1 && (cVar2 = (cVar = this.E).f2315f) != null && cVar2.f2315f == cVar) {
            return cVar2.f2314d;
        } else {
            return null;
        }
    }

    public int r() {
        return u() + this.Q;
    }

    public int s() {
        return this.O[1];
    }

    public int t() {
        if (this.c0 == 8) {
            return 0;
        }
        return this.Q;
    }

    public String toString() {
        String str = "";
        StringBuilder f2 = a.f(str);
        if (this.d0 != null) {
            str = a.e(a.f("id: "), this.d0, " ");
        }
        f2.append(str);
        f2.append("(");
        f2.append(this.U);
        f2.append(", ");
        f2.append(this.V);
        f2.append(") - (");
        f2.append(this.Q);
        f2.append(" x ");
        f2.append(this.R);
        f2.append(")");
        return f2.toString();
    }

    public int u() {
        d dVar = this.P;
        return (dVar == null || !(dVar instanceof e)) ? this.U : ((e) dVar).r0 + this.U;
    }

    public int v() {
        d dVar = this.P;
        return (dVar == null || !(dVar instanceof e)) ? this.V : ((e) dVar).s0 + this.V;
    }

    public boolean w(int i2) {
        if (i2 == 0) {
            return (this.D.f2315f != null ? 1 : 0) + (this.F.f2315f != null ? 1 : 0) < 2;
        }
        return ((this.E.f2315f != null ? 1 : 0) + (this.G.f2315f != null ? 1 : 0)) + (this.H.f2315f != null ? 1 : 0) < 2;
    }

    public final boolean x(int i2) {
        int i3 = i2 * 2;
        c[] cVarArr = this.L;
        if (!(cVarArr[i3].f2315f == null || cVarArr[i3].f2315f.f2315f == cVarArr[i3])) {
            int i4 = i3 + 1;
            return cVarArr[i4].f2315f != null && cVarArr[i4].f2315f.f2315f == cVarArr[i4];
        }
    }

    public boolean y() {
        c cVar = this.D;
        c cVar2 = cVar.f2315f;
        if (cVar2 != null && cVar2.f2315f == cVar) {
            return true;
        }
        c cVar3 = this.F;
        c cVar4 = cVar3.f2315f;
        return cVar4 != null && cVar4.f2315f == cVar3;
    }

    public boolean z() {
        c cVar = this.E;
        c cVar2 = cVar.f2315f;
        if (cVar2 != null && cVar2.f2315f == cVar) {
            return true;
        }
        c cVar3 = this.G;
        c cVar4 = cVar3.f2315f;
        return cVar4 != null && cVar4.f2315f == cVar3;
    }
}
