package c.a.a.b.b;

import c.a.a.b.b.o.b.c;
import i.s.c.h;
import java.util.List;
import java.util.Objects;

public final class m implements c.a.a.b.d.b.a {
    public final c a;
    public final c.a.a.b.b.o.a.a b;

    /* renamed from: c  reason: collision with root package name */
    public final c.a.a.b.f.a f350c;

    public static final class a extends l<List<? extends c.a.a.b.d.a.a>, List<? extends c.a.a.b.b.o.b.e.a>> {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m f351d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m mVar, c.a.a.b.f.a aVar) {
            super(aVar);
            this.f351d = mVar;
        }

        /* Return type fixed from 'h.a.c<java.util.List<c.a.a.b.d.a.a>>' to match base method */
        @Override // c.a.a.b.b.l
        public h.a.c<List<? extends c.a.a.b.d.a.a>> a() {
            h.a.c<R> c2 = this.f351d.b.a.a().c(j.a);
            h.d(c2, "localDataSource.getAllNews().map { DataMapper.mapEntitiesToDomain(it) }");
            return c2;
        }
    }

    public m(c cVar, c.a.a.b.b.o.a.a aVar, c.a.a.b.f.a aVar2) {
        h.e(cVar, "remoteDataSource");
        h.e(aVar, "localDataSource");
        h.e(aVar2, "executors");
        this.a = cVar;
        this.b = aVar;
        this.f350c = aVar2;
    }

    @Override // c.a.a.b.d.b.a
    public h.a.c<n<List<c.a.a.b.d.a.a>>> a() {
        h.a.c<n<List<c.a.a.b.d.a.a>>> g2 = new a(this, this.f350c).b.g(3);
        h.d(g2, "result.toFlowable(BackpressureStrategy.BUFFER)");
        return g2;
    }

    @Override // c.a.a.b.d.b.a
    public h.a.c<List<c.a.a.b.d.a.a>> b(String str) {
        h.e(str, "keyword");
        c.a.a.b.b.o.a.a aVar = this.b;
        Objects.requireNonNull(aVar);
        h.e(str, "keyword");
        c.a.a.b.b.o.a.c.a aVar2 = aVar.a;
        h.a.c<R> c2 = aVar2.b('%' + str + '%').c(h.a);
        h.d(c2, "localDataSource.getBookmarkByKeyword(keyword)\n            .map { DataMapper.mapEntitiesToDomain(it) }");
        return c2;
    }

    @Override // c.a.a.b.d.b.a
    public h.a.c<List<c.a.a.b.d.a.a>> c(String str) {
        h.e(str, "keyword");
        c.a.a.b.b.o.a.a aVar = this.b;
        Objects.requireNonNull(aVar);
        h.e(str, "keyword");
        c.a.a.b.b.o.a.c.a aVar2 = aVar.a;
        h.a.c<R> c2 = aVar2.c('%' + str + '%').c(k.a);
        h.d(c2, "localDataSource.getNewsByKeyword(keyword).map { DataMapper.mapEntitiesToDomain(it) }");
        return c2;
    }

    @Override // c.a.a.b.d.b.a
    public void d(c.a.a.b.d.a.a aVar, boolean z) {
        h.e(aVar, "news");
        h.e(aVar, "input");
        this.f350c.a.execute(new i(this, new c.a.a.b.b.o.a.b.a(aVar.e, aVar.f371f, aVar.f372g, aVar.f373h, aVar.f374i, aVar.f375j, aVar.f376k, aVar.f377l, aVar.f378m), z));
    }

    @Override // c.a.a.b.d.b.a
    public h.a.c<List<c.a.a.b.d.a.a>> e() {
        h.a.c<R> c2 = this.b.a.f().c(g.a);
        h.d(c2, "localDataSource.getBookmarkNews().map { DataMapper.mapEntitiesToDomain(it) }");
        return c2;
    }
}
