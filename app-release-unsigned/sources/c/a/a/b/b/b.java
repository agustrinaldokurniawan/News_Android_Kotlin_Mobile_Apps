package c.a.a.b.b;

import c.a.a.b.b.m;
import c.a.a.b.b.n;
import h.a.c;
import h.a.m;
import h.a.s.e.b.f;
import h.a.u.a;
import i.s.c.h;
import java.util.List;
import java.util.Objects;

public final /* synthetic */ class b implements h.a.r.b {
    public final /* synthetic */ c e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l f344f;

    public /* synthetic */ b(c cVar, l lVar) {
        this.e = cVar;
        this.f344f = lVar;
    }

    @Override // h.a.r.b
    public final void a(Object obj) {
        c cVar = this.e;
        l lVar = this.f344f;
        h.e(cVar, "$dbSource");
        h.e(lVar, "this$0");
        m mVar = a.f3281c;
        cVar.j(mVar);
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            c.a.a.b.b.o.b.c cVar2 = ((m.a) lVar).f351d.a;
            Objects.requireNonNull(cVar2);
            h.a.v.a aVar = new h.a.v.a();
            h.d(aVar, "create<ApiResponse<List<NewsResponse>>>()");
            c<c.a.a.b.b.o.b.d.b> i2 = cVar2.a.a().h(a.b).d(h.a.o.a.a.a()).i(1);
            c.a.a.b.b.o.b.a aVar2 = new c.a.a.b.b.o.b.a(aVar);
            c.a.a.b.b.o.b.b bVar = new c.a.a.b.b.o.b.b(aVar);
            h.a.r.a aVar3 = h.a.s.b.a.b;
            f fVar = f.INSTANCE;
            i2.e(aVar2, bVar, aVar3, fVar);
            c g2 = aVar.g(3);
            h.d(g2, "resultData.toFlowable(BackpressureStrategy.BUFFER)");
            lVar.b.c(new n.b(null));
            c i3 = g2.h(mVar).d(h.a.o.a.a.a()).i(1);
            c cVar3 = new c(lVar);
            h.a.r.b<Object> bVar2 = h.a.s.b.a.f3088c;
            lVar.f349c.c(new h.a.s.e.b.c(i3, bVar2, bVar2, cVar3, aVar3).e(new d(lVar), h.a.s.b.a.f3089d, aVar3, fVar));
            return;
        }
        lVar.b.c(new n.c(obj));
    }
}
