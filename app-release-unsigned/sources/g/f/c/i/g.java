package g.f.c.i;

import g.f.c.b;
import g.f.c.d;
import g.f.c.h;
import g.f.c.i.c;

public class g extends d {
    public float l0 = -1.0f;
    public int m0 = -1;
    public int n0 = -1;
    public c o0 = this.E;
    public int p0;
    public boolean q0;

    public g() {
        this.p0 = 0;
        this.M.clear();
        this.M.add(this.o0);
        int length = this.L.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.L[i2] = this.o0;
        }
    }

    @Override // g.f.c.i.d
    public boolean B() {
        return this.q0;
    }

    @Override // g.f.c.i.d
    public boolean C() {
        return this.q0;
    }

    @Override // g.f.c.i.d
    public void R(d dVar, boolean z) {
        if (this.P != null) {
            int o = dVar.o(this.o0);
            if (this.p0 == 1) {
                this.U = o;
                this.V = 0;
                K(this.P.n());
                P(0);
                return;
            }
            this.U = 0;
            this.V = o;
            P(this.P.t());
            K(0);
        }
    }

    public void S(int i2) {
        c cVar = this.o0;
        cVar.b = i2;
        cVar.f2313c = true;
        this.q0 = true;
    }

    public void T(int i2) {
        if (this.p0 != i2) {
            this.p0 = i2;
            this.M.clear();
            this.o0 = this.p0 == 1 ? this.D : this.E;
            this.M.add(this.o0);
            int length = this.L.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.L[i3] = this.o0;
            }
        }
    }

    @Override // g.f.c.i.d
    public void d(d dVar, boolean z) {
        h hVar;
        h hVar2;
        h hVar3;
        e eVar = (e) this.P;
        if (eVar != null) {
            Object k2 = eVar.k(c.a.LEFT);
            Object k3 = eVar.k(c.a.RIGHT);
            d dVar2 = this.P;
            boolean z2 = true;
            boolean z3 = dVar2 != null && dVar2.O[0] == 2;
            if (this.p0 == 0) {
                k2 = eVar.k(c.a.TOP);
                k3 = eVar.k(c.a.BOTTOM);
                d dVar3 = this.P;
                if (dVar3 == null || dVar3.O[1] != 2) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (this.q0) {
                c cVar = this.o0;
                if (cVar.f2313c) {
                    h l2 = dVar.l(cVar);
                    dVar.e(l2, this.o0.d());
                    if (this.m0 != -1) {
                        if (z3) {
                            hVar3 = dVar.l(k3);
                        }
                        this.q0 = false;
                        return;
                    }
                    if (this.n0 != -1 && z3) {
                        h l3 = dVar.l(k3);
                        dVar.f(l2, dVar.l(k2), 0, 5);
                        hVar3 = l3;
                    }
                    this.q0 = false;
                    return;
                    dVar.f(hVar3, l2, 0, 5);
                    this.q0 = false;
                    return;
                }
            }
            if (this.m0 != -1) {
                hVar = dVar.l(this.o0);
                dVar.d(hVar, dVar.l(k2), this.m0, 8);
                if (z3) {
                    hVar2 = dVar.l(k3);
                } else {
                    return;
                }
            } else if (this.n0 != -1) {
                hVar = dVar.l(this.o0);
                h l4 = dVar.l(k3);
                dVar.d(hVar, l4, -this.n0, 8);
                if (z3) {
                    dVar.f(hVar, dVar.l(k2), 0, 5);
                    hVar2 = l4;
                } else {
                    return;
                }
            } else if (this.l0 != -1.0f) {
                h l5 = dVar.l(this.o0);
                h l6 = dVar.l(k3);
                float f2 = this.l0;
                b m2 = dVar.m();
                m2.f2264d.c(l5, -1.0f);
                m2.f2264d.c(l6, f2);
                dVar.c(m2);
                return;
            } else {
                return;
            }
            dVar.f(hVar2, hVar, 0, 5);
        }
    }

    @Override // g.f.c.i.d
    public boolean e() {
        return true;
    }

    @Override // g.f.c.i.d
    public c k(c.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.p0 == 1) {
                    return this.o0;
                }
                break;
            case 2:
            case 4:
                if (this.p0 == 0) {
                    return this.o0;
                }
                break;
        }
        throw new AssertionError(aVar.name());
    }
}
