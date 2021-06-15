package i.q.j.a;

import i.q.d;
import i.q.e;
import i.q.f;
import i.s.c.h;

public abstract class c extends a {

    /* renamed from: f  reason: collision with root package name */
    public transient d<Object> f3305f;

    /* renamed from: g  reason: collision with root package name */
    public final f f3306g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar) {
        super(dVar);
        f d2 = dVar != null ? dVar.d() : null;
        this.f3306g = d2;
    }

    @Override // i.q.d
    public f d() {
        f fVar = this.f3306g;
        h.c(fVar);
        return fVar;
    }

    @Override // i.q.j.a.a
    public void e() {
        d<?> dVar = this.f3305f;
        if (!(dVar == null || dVar == this)) {
            f fVar = this.f3306g;
            h.c(fVar);
            int i2 = e.b;
            f.a aVar = fVar.get(e.a.a);
            h.c(aVar);
            ((e) aVar).c(dVar);
        }
        this.f3305f = b.e;
    }
}
