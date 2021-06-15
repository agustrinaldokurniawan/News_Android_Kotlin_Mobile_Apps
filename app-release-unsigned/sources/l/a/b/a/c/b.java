package l.a.b.a.c;

import g.n.s;
import i.s.b.a;
import i.s.c.h;
import i.s.c.i;

public final class b extends i implements a<l.a.c.k.a> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c<T> f3779f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ s f3780g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c<T> cVar, s sVar) {
        super(0);
        this.f3779f = cVar;
        this.f3780g = sVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // i.s.b.a
    public l.a.c.k.a c() {
        l.a.c.k.a aVar;
        a<l.a.c.k.a> aVar2 = this.f3779f.e.f3776c;
        if (aVar2 == null) {
            aVar = null;
        } else {
            aVar = aVar2.c();
        }
        if (aVar == null) {
            aVar = new l.a.c.k.a(null, 1);
        }
        s sVar = this.f3780g;
        h.e(sVar, "state");
        h.e(aVar, "params");
        return new l.a.b.a.d.a(sVar, aVar.a);
    }
}
