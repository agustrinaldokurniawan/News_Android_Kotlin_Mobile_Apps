package g.f.c.i.m;

import g.f.c.i.d;
import g.f.c.i.g;

public class i extends o {
    public i(d dVar) {
        super(dVar);
        dVar.f2328d.f();
        dVar.e.f();
        this.f2389f = ((g) dVar).p0;
    }

    @Override // g.f.c.i.m.d, g.f.c.i.m.o
    public void a(d dVar) {
        f fVar = this.f2391h;
        if (fVar.f2362c && !fVar.f2368j) {
            this.f2391h.c((int) ((((float) fVar.f2370l.get(0).f2365g) * ((g) this.b).l0) + 0.5f));
        }
    }

    @Override // g.f.c.i.m.o
    public void d() {
        o oVar;
        d dVar = this.b;
        g gVar = (g) dVar;
        int i2 = gVar.m0;
        int i3 = gVar.n0;
        if (gVar.p0 == 1) {
            f fVar = this.f2391h;
            if (i2 != -1) {
                fVar.f2370l.add(dVar.P.f2328d.f2391h);
                this.b.P.f2328d.f2391h.f2369k.add(this.f2391h);
                this.f2391h.f2364f = i2;
            } else if (i3 != -1) {
                fVar.f2370l.add(dVar.P.f2328d.f2392i);
                this.b.P.f2328d.f2392i.f2369k.add(this.f2391h);
                this.f2391h.f2364f = -i3;
            } else {
                fVar.b = true;
                fVar.f2370l.add(dVar.P.f2328d.f2392i);
                this.b.P.f2328d.f2392i.f2369k.add(this.f2391h);
            }
            m(this.b.f2328d.f2391h);
            oVar = this.b.f2328d;
        } else {
            f fVar2 = this.f2391h;
            if (i2 != -1) {
                fVar2.f2370l.add(dVar.P.e.f2391h);
                this.b.P.e.f2391h.f2369k.add(this.f2391h);
                this.f2391h.f2364f = i2;
            } else if (i3 != -1) {
                fVar2.f2370l.add(dVar.P.e.f2392i);
                this.b.P.e.f2392i.f2369k.add(this.f2391h);
                this.f2391h.f2364f = -i3;
            } else {
                fVar2.b = true;
                fVar2.f2370l.add(dVar.P.e.f2392i);
                this.b.P.e.f2392i.f2369k.add(this.f2391h);
            }
            m(this.b.e.f2391h);
            oVar = this.b.e;
        }
        m(oVar.f2392i);
    }

    @Override // g.f.c.i.m.o
    public void e() {
        d dVar = this.b;
        if (((g) dVar).p0 == 1) {
            dVar.U = this.f2391h.f2365g;
        } else {
            dVar.V = this.f2391h.f2365g;
        }
    }

    @Override // g.f.c.i.m.o
    public void f() {
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
