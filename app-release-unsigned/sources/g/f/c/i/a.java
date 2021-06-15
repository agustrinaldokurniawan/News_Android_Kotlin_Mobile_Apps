package g.f.c.i;

import g.f.c.b;
import g.f.c.d;
import g.f.c.h;
import g.f.c.i.c;

public class a extends i {
    public int n0 = 0;
    public boolean o0 = true;
    public int p0 = 0;
    public boolean q0 = false;

    @Override // g.f.c.i.d
    public boolean B() {
        return this.q0;
    }

    @Override // g.f.c.i.d
    public boolean C() {
        return this.q0;
    }

    public boolean T() {
        int i2;
        c k2;
        c k3;
        c k4;
        int i3;
        int i4;
        c.a aVar = c.a.BOTTOM;
        c.a aVar2 = c.a.TOP;
        c.a aVar3 = c.a.RIGHT;
        c.a aVar4 = c.a.LEFT;
        int i5 = 0;
        boolean z = true;
        while (true) {
            i2 = this.m0;
            if (i5 >= i2) {
                break;
            }
            d dVar = this.l0[i5];
            if ((this.o0 || dVar.e()) && ((((i3 = this.n0) == 0 || i3 == 1) && !dVar.B()) || (((i4 = this.n0) == 2 || i4 == 3) && !dVar.C()))) {
                z = false;
            }
            i5++;
        }
        if (!z || i2 <= 0) {
            return false;
        }
        int i6 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < this.m0; i7++) {
            d dVar2 = this.l0[i7];
            if (this.o0 || dVar2.e()) {
                if (!z2) {
                    int i8 = this.n0;
                    if (i8 == 0) {
                        k4 = dVar2.k(aVar4);
                    } else if (i8 == 1) {
                        k4 = dVar2.k(aVar3);
                    } else if (i8 == 2) {
                        k4 = dVar2.k(aVar2);
                    } else {
                        if (i8 == 3) {
                            k4 = dVar2.k(aVar);
                        }
                        z2 = true;
                    }
                    i6 = k4.d();
                    z2 = true;
                }
                int i9 = this.n0;
                if (i9 == 0) {
                    k3 = dVar2.k(aVar4);
                } else {
                    if (i9 == 1) {
                        k2 = dVar2.k(aVar3);
                    } else if (i9 == 2) {
                        k3 = dVar2.k(aVar2);
                    } else if (i9 == 3) {
                        k2 = dVar2.k(aVar);
                    }
                    i6 = Math.max(i6, k2.d());
                }
                i6 = Math.min(i6, k3.d());
            }
        }
        int i10 = i6 + this.p0;
        int i11 = this.n0;
        if (i11 == 0 || i11 == 1) {
            I(i10, i10);
        } else {
            J(i10, i10);
        }
        this.q0 = true;
        return true;
    }

    public int U() {
        int i2 = this.n0;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return (i2 == 2 || i2 == 3) ? 1 : -1;
    }

    @Override // g.f.c.i.d
    public void d(d dVar, boolean z) {
        Object[] objArr;
        boolean z2;
        h hVar;
        c cVar;
        int i2;
        int i3;
        int i4;
        h hVar2;
        int i5;
        c[] cVarArr = this.L;
        cVarArr[0] = this.D;
        cVarArr[2] = this.E;
        cVarArr[1] = this.F;
        cVarArr[3] = this.G;
        int i6 = 0;
        while (true) {
            objArr = this.L;
            if (i6 >= objArr.length) {
                break;
            }
            objArr[i6].f2318i = dVar.l(objArr[i6]);
            i6++;
        }
        int i7 = this.n0;
        if (i7 >= 0 && i7 < 4) {
            c cVar2 = objArr[i7];
            if (!this.q0) {
                T();
            }
            if (this.q0) {
                this.q0 = false;
                int i8 = this.n0;
                if (i8 == 0 || i8 == 1) {
                    dVar.e(this.D.f2318i, this.U);
                    hVar2 = this.F.f2318i;
                    i5 = this.U;
                } else if (i8 == 2 || i8 == 3) {
                    dVar.e(this.E.f2318i, this.V);
                    hVar2 = this.G.f2318i;
                    i5 = this.V;
                } else {
                    return;
                }
                dVar.e(hVar2, i5);
                return;
            }
            int i9 = 0;
            while (true) {
                if (i9 >= this.m0) {
                    z2 = false;
                    break;
                }
                d dVar2 = this.l0[i9];
                if ((this.o0 || dVar2.e()) && ((((i3 = this.n0) == 0 || i3 == 1) && dVar2.o() == 3 && dVar2.D.f2315f != null && dVar2.F.f2315f != null) || (((i4 = this.n0) == 2 || i4 == 3) && dVar2.s() == 3 && dVar2.E.f2315f != null && dVar2.G.f2315f != null))) {
                    z2 = true;
                } else {
                    i9++;
                }
            }
            z2 = true;
            boolean z3 = this.D.g() || this.F.g();
            boolean z4 = this.E.g() || this.G.g();
            boolean z5 = !z2 && (((i2 = this.n0) == 0 && z3) || ((i2 == 2 && z4) || ((i2 == 1 && z3) || (i2 == 3 && z4))));
            int i10 = 5;
            if (!z5) {
                i10 = 4;
            }
            for (int i11 = 0; i11 < this.m0; i11++) {
                d dVar3 = this.l0[i11];
                if (this.o0 || dVar3.e()) {
                    h l2 = dVar.l(dVar3.L[this.n0]);
                    c[] cVarArr2 = dVar3.L;
                    int i12 = this.n0;
                    cVarArr2[i12].f2318i = l2;
                    int i13 = (cVarArr2[i12].f2315f == null || cVarArr2[i12].f2315f.f2314d != this) ? 0 : cVarArr2[i12].f2316g + 0;
                    if (i12 == 0 || i12 == 2) {
                        b m2 = dVar.m();
                        h n = dVar.n();
                        n.e = 0;
                        m2.f(cVar2.f2318i, l2, n, this.p0 - i13);
                        dVar.c(m2);
                    } else {
                        b m3 = dVar.m();
                        h n2 = dVar.n();
                        n2.e = 0;
                        m3.e(cVar2.f2318i, l2, n2, this.p0 + i13);
                        dVar.c(m3);
                    }
                    dVar.d(cVar2.f2318i, l2, this.p0 + i13, i10);
                }
            }
            int i14 = this.n0;
            if (i14 == 0) {
                dVar.d(this.F.f2318i, this.D.f2318i, 0, 8);
                dVar.d(this.D.f2318i, this.P.F.f2318i, 0, 4);
                hVar = this.D.f2318i;
                cVar = this.P.D;
            } else if (i14 == 1) {
                dVar.d(this.D.f2318i, this.F.f2318i, 0, 8);
                dVar.d(this.D.f2318i, this.P.D.f2318i, 0, 4);
                hVar = this.D.f2318i;
                cVar = this.P.F;
            } else if (i14 == 2) {
                dVar.d(this.G.f2318i, this.E.f2318i, 0, 8);
                dVar.d(this.E.f2318i, this.P.G.f2318i, 0, 4);
                hVar = this.E.f2318i;
                cVar = this.P.E;
            } else if (i14 == 3) {
                dVar.d(this.E.f2318i, this.G.f2318i, 0, 8);
                dVar.d(this.E.f2318i, this.P.E.f2318i, 0, 4);
                hVar = this.E.f2318i;
                cVar = this.P.G;
            } else {
                return;
            }
            dVar.d(hVar, cVar.f2318i, 0, 0);
        }
    }

    @Override // g.f.c.i.d
    public boolean e() {
        return true;
    }

    @Override // g.f.c.i.d
    public String toString() {
        String e = c.c.a.a.a.e(c.c.a.a.a.f("[Barrier] "), this.d0, " {");
        for (int i2 = 0; i2 < this.m0; i2++) {
            d dVar = this.l0[i2];
            if (i2 > 0) {
                e = c.c.a.a.a.q(e, ", ");
            }
            StringBuilder f2 = c.c.a.a.a.f(e);
            f2.append(dVar.d0);
            e = f2.toString();
        }
        return c.c.a.a.a.q(e, "}");
    }
}
