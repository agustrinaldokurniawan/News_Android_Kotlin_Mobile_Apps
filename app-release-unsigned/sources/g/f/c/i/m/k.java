package g.f.c.i.m;

import c.c.a.a.a;
import g.f.c.i.c;
import g.f.c.i.d;
import g.f.c.i.h;
import g.f.c.i.m.f;
import java.util.List;

public class k extends o {

    /* renamed from: k  reason: collision with root package name */
    public static int[] f2380k = new int[2];

    public k(d dVar) {
        super(dVar);
        this.f2391h.e = f.a.LEFT;
        this.f2392i.e = f.a.RIGHT;
        this.f2389f = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0268, code lost:
        if (r15 != 1) goto L_0x02b5;
     */
    @Override // g.f.c.i.m.d, g.f.c.i.m.o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(g.f.c.i.m.d r18) {
        /*
        // Method dump skipped, instructions count: 973
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.i.m.k.a(g.f.c.i.m.d):void");
    }

    @Override // g.f.c.i.m.o
    public void d() {
        c cVar;
        f fVar;
        d dVar;
        d dVar2;
        List<d> list;
        f fVar2;
        int i2;
        f fVar3;
        f fVar4;
        d dVar3;
        d dVar4;
        d dVar5 = this.b;
        if (dVar5.a) {
            this.e.c(dVar5.t());
        }
        if (!this.e.f2368j) {
            int o = this.b.o();
            this.f2388d = o;
            if (o != 3) {
                if (o == 4 && (((dVar4 = this.b.P) != null && dVar4.o() == 1) || dVar4.o() == 4)) {
                    int t = (dVar4.t() - this.b.D.e()) - this.b.F.e();
                    b(this.f2391h, dVar4.f2328d.f2391h, this.b.D.e());
                    b(this.f2392i, dVar4.f2328d.f2392i, -this.b.F.e());
                    this.e.c(t);
                    return;
                } else if (this.f2388d == 1) {
                    this.e.c(this.b.t());
                }
            }
        } else if (this.f2388d == 4 && (((dVar3 = this.b.P) != null && dVar3.o() == 1) || dVar3.o() == 4)) {
            b(this.f2391h, dVar3.f2328d.f2391h, this.b.D.e());
            b(this.f2392i, dVar3.f2328d.f2392i, -this.b.F.e());
            return;
        }
        g gVar = this.e;
        if (gVar.f2368j) {
            d dVar6 = this.b;
            if (dVar6.a) {
                c[] cVarArr = dVar6.L;
                if (cVarArr[0].f2315f == null || cVarArr[1].f2315f == null) {
                    if (cVarArr[0].f2315f != null) {
                        f h2 = h(cVarArr[0]);
                        if (h2 != null) {
                            f fVar5 = this.f2391h;
                            int e = this.b.L[0].e();
                            fVar5.f2370l.add(h2);
                            fVar5.f2364f = e;
                            h2.f2369k.add(fVar5);
                        } else {
                            return;
                        }
                    } else if (cVarArr[1].f2315f != null) {
                        f h3 = h(cVarArr[1]);
                        if (h3 != null) {
                            f fVar6 = this.f2392i;
                            fVar6.f2370l.add(h3);
                            fVar6.f2364f = -this.b.L[1].e();
                            h3.f2369k.add(fVar6);
                            fVar4 = this.f2391h;
                            fVar3 = this.f2392i;
                            i2 = -this.e.f2365g;
                            b(fVar4, fVar3, i2);
                            return;
                        }
                        return;
                    } else if (!(dVar6 instanceof h) && dVar6.P != null && dVar6.k(c.a.CENTER).f2315f == null) {
                        d dVar7 = this.b;
                        b(this.f2391h, dVar7.P.f2328d.f2391h, dVar7.u());
                    } else {
                        return;
                    }
                    fVar4 = this.f2392i;
                    fVar3 = this.f2391h;
                    i2 = this.e.f2365g;
                    b(fVar4, fVar3, i2);
                    return;
                } else if (dVar6.y()) {
                    this.f2391h.f2364f = this.b.L[0].e();
                    fVar = this.f2392i;
                    cVar = this.b.L[1];
                    fVar.f2364f = -cVar.e();
                } else {
                    f h4 = h(this.b.L[0]);
                    if (h4 != null) {
                        f fVar7 = this.f2391h;
                        int e2 = this.b.L[0].e();
                        fVar7.f2370l.add(h4);
                        fVar7.f2364f = e2;
                        h4.f2369k.add(fVar7);
                    }
                    f h5 = h(this.b.L[1]);
                    if (h5 != null) {
                        f fVar8 = this.f2392i;
                        fVar8.f2370l.add(h5);
                        fVar8.f2364f = -this.b.L[1].e();
                        h5.f2369k.add(fVar8);
                    }
                    this.f2391h.b = true;
                    this.f2392i.b = true;
                    return;
                }
            }
        }
        if (this.f2388d == 3) {
            d dVar8 = this.b;
            int i3 = dVar8.f2335l;
            if (i3 == 2) {
                d dVar9 = dVar8.P;
                if (dVar9 != null) {
                    g gVar2 = dVar9.e.e;
                    gVar.f2370l.add(gVar2);
                    gVar2.f2369k.add(this.e);
                    g gVar3 = this.e;
                    gVar3.b = true;
                    gVar3.f2369k.add(this.f2391h);
                    list = this.e.f2369k;
                    dVar2 = this.f2392i;
                }
            } else if (i3 == 3) {
                if (dVar8.f2336m == 3) {
                    this.f2391h.a = this;
                    this.f2392i.a = this;
                    m mVar = dVar8.e;
                    mVar.f2391h.a = this;
                    mVar.f2392i.a = this;
                    gVar.a = this;
                    if (dVar8.z()) {
                        this.e.f2370l.add(this.b.e.e);
                        this.b.e.e.f2369k.add(this.e);
                        m mVar2 = this.b.e;
                        mVar2.e.a = this;
                        this.e.f2370l.add(mVar2.f2391h);
                        this.e.f2370l.add(this.b.e.f2392i);
                        this.b.e.f2391h.f2369k.add(this.e);
                        list = this.b.e.f2392i.f2369k;
                        dVar2 = this.e;
                    } else if (this.b.y()) {
                        this.b.e.e.f2370l.add(this.e);
                        list = this.e.f2369k;
                        dVar2 = this.b.e.e;
                    } else {
                        fVar2 = this.b.e.e;
                    }
                } else {
                    g gVar4 = dVar8.e.e;
                    gVar.f2370l.add(gVar4);
                    gVar4.f2369k.add(this.e);
                    this.b.e.f2391h.f2369k.add(this.e);
                    this.b.e.f2392i.f2369k.add(this.e);
                    g gVar5 = this.e;
                    gVar5.b = true;
                    gVar5.f2369k.add(this.f2391h);
                    this.e.f2369k.add(this.f2392i);
                    this.f2391h.f2370l.add(this.e);
                    fVar2 = this.f2392i;
                }
                list = fVar2.f2370l;
                dVar2 = this.e;
            }
            list.add(dVar2);
        }
        d dVar10 = this.b;
        c[] cVarArr2 = dVar10.L;
        if (cVarArr2[0].f2315f == null || cVarArr2[1].f2315f == null) {
            if (cVarArr2[0].f2315f != null) {
                f h6 = h(cVarArr2[0]);
                if (h6 != null) {
                    f fVar9 = this.f2391h;
                    int e3 = this.b.L[0].e();
                    fVar9.f2370l.add(h6);
                    fVar9.f2364f = e3;
                    h6.f2369k.add(fVar9);
                } else {
                    return;
                }
            } else if (cVarArr2[1].f2315f != null) {
                f h7 = h(cVarArr2[1]);
                if (h7 != null) {
                    f fVar10 = this.f2392i;
                    fVar10.f2370l.add(h7);
                    fVar10.f2364f = -this.b.L[1].e();
                    h7.f2369k.add(fVar10);
                    c(this.f2391h, this.f2392i, -1, this.e);
                    return;
                }
                return;
            } else if (!(dVar10 instanceof h) && (dVar = dVar10.P) != null) {
                b(this.f2391h, dVar.f2328d.f2391h, dVar10.u());
            } else {
                return;
            }
            c(this.f2392i, this.f2391h, 1, this.e);
        } else if (dVar10.y()) {
            this.f2391h.f2364f = this.b.L[0].e();
            fVar = this.f2392i;
            cVar = this.b.L[1];
            fVar.f2364f = -cVar.e();
        } else {
            f h8 = h(this.b.L[0]);
            f h9 = h(this.b.L[1]);
            h8.f2369k.add(this);
            if (h8.f2368j) {
                a(this);
            }
            h9.f2369k.add(this);
            if (h9.f2368j) {
                a(this);
            }
            this.f2393j = 4;
        }
    }

    @Override // g.f.c.i.m.o
    public void e() {
        f fVar = this.f2391h;
        if (fVar.f2368j) {
            this.b.U = fVar.f2365g;
        }
    }

    @Override // g.f.c.i.m.o
    public void f() {
        this.f2387c = null;
        this.f2391h.b();
        this.f2392i.b();
        this.e.b();
        this.f2390g = false;
    }

    @Override // g.f.c.i.m.o
    public boolean k() {
        return this.f2388d != 3 || this.b.f2335l == 0;
    }

    public final void m(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 == -1) {
            int i9 = (int) ((((float) i8) * f2) + 0.5f);
            int i10 = (int) ((((float) i7) / f2) + 0.5f);
            if (i9 <= i7 && i8 <= i8) {
                iArr[0] = i9;
                iArr[1] = i8;
            } else if (i7 <= i7 && i10 <= i8) {
                iArr[0] = i7;
                iArr[1] = i10;
            }
        } else if (i6 == 0) {
            iArr[0] = (int) ((((float) i8) * f2) + 0.5f);
            iArr[1] = i8;
        } else if (i6 == 1) {
            iArr[0] = i7;
            iArr[1] = (int) ((((float) i7) * f2) + 0.5f);
        }
    }

    public void n() {
        this.f2390g = false;
        this.f2391h.b();
        this.f2391h.f2368j = false;
        this.f2392i.b();
        this.f2392i.f2368j = false;
        this.e.f2368j = false;
    }

    public String toString() {
        StringBuilder f2 = a.f("HorizontalRun ");
        f2.append(this.b.d0);
        return f2.toString();
    }
}
