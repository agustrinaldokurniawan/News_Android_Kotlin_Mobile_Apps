package c.d.a.m.v.d0;

import c.d.a.m.m;
import c.d.a.m.v.d0.i;
import c.d.a.m.v.l;
import c.d.a.m.v.w;
import c.d.a.s.g;

public class h extends g<m, w<?>> implements i {

    /* renamed from: d  reason: collision with root package name */
    public i.a f888d;

    public h(long j2) {
        super(j2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // c.d.a.s.g
    public int b(w<?> wVar) {
        w<?> wVar2 = wVar;
        if (wVar2 == null) {
            return 1;
        }
        return wVar2.b();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // c.d.a.s.g
    public void c(m mVar, w<?> wVar) {
        w<?> wVar2 = wVar;
        i.a aVar = this.f888d;
        if (aVar != null && wVar2 != null) {
            ((l) aVar).f934f.a(wVar2, true);
        }
    }
}
