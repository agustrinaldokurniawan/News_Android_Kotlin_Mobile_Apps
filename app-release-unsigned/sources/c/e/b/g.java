package c.e.b;

import c.e.b.c0.a;
import c.e.b.c0.c;
import java.util.concurrent.atomic.AtomicLong;

public class g extends x<AtomicLong> {
    public final /* synthetic */ x a;

    public g(x xVar) {
        this.a = xVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.e.b.x
    public AtomicLong a(a aVar) {
        return new AtomicLong(((Number) this.a.a(aVar)).longValue());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.e.b.c0.c, java.lang.Object] */
    @Override // c.e.b.x
    public void b(c cVar, AtomicLong atomicLong) {
        this.a.b(cVar, Long.valueOf(atomicLong.get()));
    }
}
