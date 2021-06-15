package i.q;

import i.q.e;
import i.q.f;
import i.s.b.p;
import i.s.c.h;
import i.s.c.i;

public final class g extends i implements p<f, f.a, f> {

    /* renamed from: f  reason: collision with root package name */
    public static final g f3303f = new g();

    public g() {
        super(2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // i.s.b.p
    public f k(f fVar, f.a aVar) {
        c cVar;
        f fVar2 = fVar;
        f.a aVar2 = aVar;
        h.e(fVar2, "acc");
        h.e(aVar2, "element");
        f minusKey = fVar2.minusKey(aVar2.getKey());
        h hVar = h.e;
        if (minusKey == hVar) {
            return aVar2;
        }
        int i2 = e.b;
        e.a aVar3 = e.a.a;
        e eVar = (e) minusKey.get(aVar3);
        if (eVar == null) {
            cVar = new c(minusKey, aVar2);
        } else {
            f minusKey2 = minusKey.minusKey(aVar3);
            if (minusKey2 == hVar) {
                return new c(aVar2, eVar);
            }
            cVar = new c(new c(minusKey2, aVar2), eVar);
        }
        return cVar;
    }
}
