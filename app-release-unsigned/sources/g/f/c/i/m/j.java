package g.f.c.i.m;

import g.f.c.i.a;
import g.f.c.i.d;
import g.f.c.i.m.f;

public class j extends o {
    public j(d dVar) {
        super(dVar);
    }

    @Override // g.f.c.i.m.d, g.f.c.i.m.o
    public void a(d dVar) {
        a aVar = (a) this.b;
        int i2 = aVar.n0;
        int i3 = 0;
        int i4 = -1;
        for (f fVar : this.f2391h.f2370l) {
            int i5 = fVar.f2365g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 == 0 || i2 == 2) {
            this.f2391h.c(i4 + aVar.p0);
        } else {
            this.f2391h.c(i3 + aVar.p0);
        }
    }

    @Override // g.f.c.i.m.o
    public void d() {
        o oVar;
        d dVar = this.b;
        if (dVar instanceof a) {
            f fVar = this.f2391h;
            fVar.b = true;
            a aVar = (a) dVar;
            int i2 = aVar.n0;
            boolean z = aVar.o0;
            int i3 = 0;
            if (i2 == 0) {
                fVar.e = f.a.LEFT;
                while (i3 < aVar.m0) {
                    d dVar2 = aVar.l0[i3];
                    if (z || dVar2.c0 != 8) {
                        f fVar2 = dVar2.f2328d.f2391h;
                        fVar2.f2369k.add(this.f2391h);
                        this.f2391h.f2370l.add(fVar2);
                    }
                    i3++;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    fVar.e = f.a.TOP;
                    while (i3 < aVar.m0) {
                        d dVar3 = aVar.l0[i3];
                        if (z || dVar3.c0 != 8) {
                            f fVar3 = dVar3.e.f2391h;
                            fVar3.f2369k.add(this.f2391h);
                            this.f2391h.f2370l.add(fVar3);
                        }
                        i3++;
                    }
                } else if (i2 == 3) {
                    fVar.e = f.a.BOTTOM;
                    while (i3 < aVar.m0) {
                        d dVar4 = aVar.l0[i3];
                        if (z || dVar4.c0 != 8) {
                            f fVar4 = dVar4.e.f2392i;
                            fVar4.f2369k.add(this.f2391h);
                            this.f2391h.f2370l.add(fVar4);
                        }
                        i3++;
                    }
                } else {
                    return;
                }
                m(this.b.e.f2391h);
                oVar = this.b.e;
                m(oVar.f2392i);
            } else {
                fVar.e = f.a.RIGHT;
                while (i3 < aVar.m0) {
                    d dVar5 = aVar.l0[i3];
                    if (z || dVar5.c0 != 8) {
                        f fVar5 = dVar5.f2328d.f2392i;
                        fVar5.f2369k.add(this.f2391h);
                        this.f2391h.f2370l.add(fVar5);
                    }
                    i3++;
                }
            }
            m(this.b.f2328d.f2391h);
            oVar = this.b.f2328d;
            m(oVar.f2392i);
        }
    }

    @Override // g.f.c.i.m.o
    public void e() {
        d dVar = this.b;
        if (dVar instanceof a) {
            int i2 = ((a) dVar).n0;
            if (i2 == 0 || i2 == 1) {
                dVar.U = this.f2391h.f2365g;
            } else {
                dVar.V = this.f2391h.f2365g;
            }
        }
    }

    @Override // g.f.c.i.m.o
    public void f() {
        this.f2387c = null;
        this.f2391h.b();
    }

    @Override // g.f.c.i.m.o
    public boolean k() {
        return false;
    }

    public final void m(f fVar) {
        this.f2391h.f2369k.add(fVar);
        fVar.f2370l.add(this.f2391h);
    }
}
