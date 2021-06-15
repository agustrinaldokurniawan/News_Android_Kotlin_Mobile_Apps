package m;

import d.a.f;
import i.q.d;
import i.s.c.h;
import j.e;
import j.j0;
import javax.annotation.Nullable;

public abstract class k<ResponseT, ReturnT> extends d0<ReturnT> {
    public final z a;
    public final e.a b;

    /* renamed from: c  reason: collision with root package name */
    public final h<j0, ResponseT> f3834c;

    public static final class a<ResponseT, ReturnT> extends k<ResponseT, ReturnT> {

        /* renamed from: d  reason: collision with root package name */
        public final e<ResponseT, ReturnT> f3835d;

        public a(z zVar, e.a aVar, h<j0, ResponseT> hVar, e<ResponseT, ReturnT> eVar) {
            super(zVar, aVar, hVar);
            this.f3835d = eVar;
        }

        @Override // m.k
        public ReturnT c(d<ResponseT> dVar, Object[] objArr) {
            return this.f3835d.b(dVar);
        }
    }

    public static final class b<ResponseT> extends k<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final e<ResponseT, d<ResponseT>> f3836d;

        public b(z zVar, e.a aVar, h<j0, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar, boolean z) {
            super(zVar, aVar, hVar);
            this.f3836d = eVar;
        }

        @Override // m.k
        public Object c(d<ResponseT> dVar, Object[] objArr) {
            d<ResponseT> b = this.f3836d.b(dVar);
            d dVar2 = (d) objArr[objArr.length - 1];
            try {
                f fVar = new f(h.a.t.a.z(dVar2), 1);
                fVar.p(new m(b));
                b.K(new n(fVar));
                Object o = fVar.o();
                if (o == i.q.i.a.e) {
                    h.e(dVar2, "frame");
                }
                return o;
            } catch (Exception e) {
                return h.a.t.a.U(e, dVar2);
            }
        }
    }

    public static final class c<ResponseT> extends k<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final e<ResponseT, d<ResponseT>> f3837d;

        public c(z zVar, e.a aVar, h<j0, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar) {
            super(zVar, aVar, hVar);
            this.f3837d = eVar;
        }

        @Override // m.k
        public Object c(d<ResponseT> dVar, Object[] objArr) {
            d<ResponseT> b = this.f3837d.b(dVar);
            d dVar2 = (d) objArr[objArr.length - 1];
            try {
                f fVar = new f(h.a.t.a.z(dVar2), 1);
                fVar.p(new o(b));
                b.K(new p(fVar));
                Object o = fVar.o();
                if (o == i.q.i.a.e) {
                    h.e(dVar2, "frame");
                }
                return o;
            } catch (Exception e) {
                return h.a.t.a.U(e, dVar2);
            }
        }
    }

    public k(z zVar, e.a aVar, h<j0, ResponseT> hVar) {
        this.a = zVar;
        this.b = aVar;
        this.f3834c = hVar;
    }

    @Override // m.d0
    @Nullable
    public final ReturnT a(Object[] objArr) {
        return c(new s(this.a, objArr, this.b, this.f3834c), objArr);
    }

    @Nullable
    public abstract ReturnT c(d<ResponseT> dVar, Object[] objArr);
}
