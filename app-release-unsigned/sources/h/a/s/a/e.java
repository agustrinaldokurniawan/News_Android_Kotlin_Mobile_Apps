package h.a.s.a;

import h.a.p.c;
import java.util.concurrent.atomic.AtomicReference;

public final class e extends AtomicReference<c> implements c {
    public e() {
    }

    public e(c cVar) {
        lazySet(cVar);
    }

    public boolean a() {
        return b.b((c) get());
    }

    @Override // h.a.p.c
    public void e() {
        b.a(this);
    }
}
