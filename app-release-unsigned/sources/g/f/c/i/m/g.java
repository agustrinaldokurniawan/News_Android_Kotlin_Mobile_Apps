package g.f.c.i.m;

import g.f.c.i.m.f;

public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f2379m;

    public g(o oVar) {
        super(oVar);
        this.e = oVar instanceof k ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // g.f.c.i.m.f
    public void c(int i2) {
        if (!this.f2368j) {
            this.f2368j = true;
            this.f2365g = i2;
            for (d dVar : this.f2369k) {
                dVar.a(dVar);
            }
        }
    }
}
