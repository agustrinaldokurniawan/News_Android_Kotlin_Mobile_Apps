package i.q;

import i.q.f;
import i.q.f.a;
import i.s.b.l;
import i.s.c.h;

public abstract class b<B extends f.a, E extends B> implements f.b<E> {
    public final f.b<?> a;
    public final l<f.a, E> b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: i.q.f$b<?> */
    /* JADX WARN: Type inference failed for: r3v0, types: [i.s.b.l<? super i.q.f$a, ? extends E extends B>, i.s.b.l<i.q.f$a, E extends B>, java.lang.Object] */
    public b(f.b<B> bVar, l<? super f.a, ? extends E> lVar) {
        h.e(bVar, "baseKey");
        h.e(lVar, "safeCast");
        this.b = lVar;
        this.a = bVar instanceof b ? (f.b<B>) ((b) bVar).a : bVar;
    }

    public final E a(f.a aVar) {
        h.e(aVar, "element");
        return this.b.o(aVar);
    }
}
