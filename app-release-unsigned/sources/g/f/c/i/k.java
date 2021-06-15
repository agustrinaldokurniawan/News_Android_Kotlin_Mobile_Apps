package g.f.c.i;

import androidx.constraintlayout.widget.ConstraintLayout;
import g.f.c.i.m.b;

public class k extends i {
    public int n0 = 0;
    public int o0 = 0;
    public int p0 = 0;
    public int q0 = 0;
    public int r0 = 0;
    public int s0 = 0;
    public boolean t0 = false;
    public int u0 = 0;
    public int v0 = 0;
    public b.a w0 = new b.a();
    public b.AbstractC0071b x0 = null;

    public void T(int i2, int i3, int i4, int i5) {
    }

    public void U(d dVar, int i2, int i3, int i4, int i5) {
        b.AbstractC0071b bVar;
        d dVar2;
        while (true) {
            bVar = this.x0;
            if (bVar != null || (dVar2 = this.P) == null) {
                b.a aVar = this.w0;
                aVar.a = i2;
                aVar.b = i4;
                aVar.f2348c = i3;
                aVar.f2349d = i5;
                ((ConstraintLayout.b) bVar).b(dVar, aVar);
                dVar.P(this.w0.e);
                dVar.K(this.w0.f2350f);
                b.a aVar2 = this.w0;
                dVar.y = aVar2.f2352h;
                dVar.H(aVar2.f2351g);
            } else {
                this.x0 = ((e) dVar2).o0;
            }
        }
        b.a aVar3 = this.w0;
        aVar3.a = i2;
        aVar3.b = i4;
        aVar3.f2348c = i3;
        aVar3.f2349d = i5;
        ((ConstraintLayout.b) bVar).b(dVar, aVar3);
        dVar.P(this.w0.e);
        dVar.K(this.w0.f2350f);
        b.a aVar22 = this.w0;
        dVar.y = aVar22.f2352h;
        dVar.H(aVar22.f2351g);
    }

    @Override // g.f.c.i.i, g.f.c.i.h
    public void a(e eVar) {
        for (int i2 = 0; i2 < this.m0; i2++) {
            d dVar = this.l0[i2];
            if (dVar != null) {
                dVar.A = true;
            }
        }
    }
}
