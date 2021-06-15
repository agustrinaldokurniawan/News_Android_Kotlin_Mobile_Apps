package h.a.s.e.a;

import h.a.b;
import h.a.p.e;
import java.util.concurrent.Callable;

public final class a extends h.a.a {
    public final Callable<?> a;

    public a(Callable<?> callable) {
        this.a = callable;
    }

    @Override // h.a.a
    public void b(b bVar) {
        e eVar = new e(h.a.s.b.a.a);
        bVar.d(eVar);
        try {
            this.a.call();
            if (!eVar.a()) {
                bVar.a();
            }
        } catch (Throwable th) {
            c.f.a.b.h(th);
            if (!eVar.a()) {
                bVar.b(th);
            } else {
                h.a.t.a.M(th);
            }
        }
    }
}
