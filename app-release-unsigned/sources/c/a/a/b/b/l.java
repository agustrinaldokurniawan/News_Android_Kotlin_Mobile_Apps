package c.a.a.b.b;

import c.a.a.b.f.a;
import h.a.c;
import h.a.p.b;
import h.a.s.e.b.f;
import i.s.c.h;

public abstract class l<ResultType, RequestType> {
    public final a a;
    public final h.a.v.a<n<ResultType>> b;

    /* renamed from: c  reason: collision with root package name */
    public final b f349c;

    public l(a aVar) {
        h.e(aVar, "mExecutors");
        this.a = aVar;
        h.a.v.a<n<ResultType>> aVar2 = new h.a.v.a<>();
        h.d(aVar2, "create<Resource<ResultType>>()");
        this.b = aVar2;
        b bVar = new b();
        this.f349c = bVar;
        c<ResultType> a2 = a();
        bVar.c(a2.h(h.a.u.a.f3281c).d(h.a.o.a.a.a()).i(1).e(new b(a2, this), h.a.s.b.a.f3089d, h.a.s.b.a.b, f.INSTANCE));
    }

    public abstract c<ResultType> a();
}
