package h.a.s.d;

import h.a.b;
import h.a.p.c;
import java.util.concurrent.atomic.AtomicReference;

public final class a extends AtomicReference<c> implements b, c {
    @Override // h.a.b
    public void a() {
        lazySet(h.a.s.a.b.DISPOSED);
    }

    @Override // h.a.b
    public void b(Throwable th) {
        lazySet(h.a.s.a.b.DISPOSED);
        h.a.t.a.M(new h.a.q.c(th));
    }

    @Override // h.a.b
    public void d(c cVar) {
        h.a.s.a.b.d(this, cVar);
    }

    @Override // h.a.p.c
    public void e() {
        h.a.s.a.b.a(this);
    }
}
