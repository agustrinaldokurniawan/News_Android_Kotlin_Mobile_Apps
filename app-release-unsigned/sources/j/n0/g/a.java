package j.n0.g;

import i.s.c.h;
import j.c0;
import j.i0;
import j.n0.h.g;
import j.z;
import java.io.IOException;
import java.util.Objects;

public final class a implements z {
    public static final a a = new a();

    @Override // j.z
    public i0 a(z.a aVar) {
        h.f(aVar, "chain");
        g gVar = (g) aVar;
        e eVar = gVar.b;
        Objects.requireNonNull(eVar);
        h.f(gVar, "chain");
        synchronized (eVar) {
            if (!eVar.p) {
                throw new IllegalStateException("released".toString());
            } else if (!(!eVar.o)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!(!eVar.n)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        d dVar = eVar.f3512j;
        if (dVar != null) {
            c0 c0Var = eVar.t;
            h.f(c0Var, "client");
            h.f(gVar, "chain");
            try {
                c cVar = new c(eVar, eVar.f3508f, dVar, dVar.a(gVar.f3545g, gVar.f3546h, gVar.f3547i, 0, c0Var.f3376m, !h.a(gVar.f3544f.f3395c, "GET")).k(c0Var, gVar));
                eVar.f3515m = cVar;
                eVar.r = cVar;
                synchronized (eVar) {
                    eVar.n = true;
                    eVar.o = true;
                }
                if (!eVar.q) {
                    return g.a(gVar, 0, cVar, null, 0, 0, 0, 61).b(gVar.f3544f);
                }
                throw new IOException("Canceled");
            } catch (l e) {
                dVar.c(e.e);
                throw e;
            } catch (IOException e2) {
                dVar.c(e2);
                throw new l(e2);
            }
        } else {
            h.j();
            throw null;
        }
    }
}
