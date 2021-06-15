package i.q;

import i.s.b.p;
import i.s.c.h;

public interface f {

    public interface a extends f {

        /* renamed from: i.q.f$a$a  reason: collision with other inner class name */
        public static final class C0119a {
            public static <R> R a(a aVar, R r, p<? super R, ? super a, ? extends R> pVar) {
                h.e(pVar, "operation");
                return (R) pVar.k(r, aVar);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: i.q.f$a */
            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends a> E b(a aVar, b<E> bVar) {
                h.e(bVar, "key");
                if (h.a(aVar.getKey(), bVar)) {
                    return aVar;
                }
                return null;
            }

            public static f c(a aVar, b<?> bVar) {
                h.e(bVar, "key");
                return h.a(aVar.getKey(), bVar) ? h.e : aVar;
            }

            public static f d(a aVar, f fVar) {
                h.e(fVar, "context");
                h.e(fVar, "context");
                return fVar == h.e ? aVar : (f) fVar.fold(aVar, g.f3303f);
            }
        }

        @Override // i.q.f
        <E extends a> E get(b<E> bVar);

        b<?> getKey();
    }

    public interface b<E extends a> {
    }

    <R> R fold(R r, p<? super R, ? super a, ? extends R> pVar);

    <E extends a> E get(b<E> bVar);

    f minusKey(b<?> bVar);
}
