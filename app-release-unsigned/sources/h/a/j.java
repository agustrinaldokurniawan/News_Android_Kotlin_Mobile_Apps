package h.a;

import c.f.a.b;
import g.f.c.g;
import h.a.s.e.b.e;
import h.a.s.e.b.i;
import h.a.s.e.b.k;
import h.a.s.e.b.l;
import h.a.t.a;
import java.util.Objects;

public abstract class j<T> implements k<T> {
    public final void e(l<? super T> lVar) {
        Objects.requireNonNull(lVar, "observer is null");
        try {
            f(lVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            b.h(th);
            a.M(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void f(l<? super T> lVar);

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;)Lh/a/c<TT;>; */
    public final c g(int i2) {
        e eVar = new e(this);
        int f2 = g.f(i2);
        if (f2 == 0) {
            return eVar;
        }
        if (f2 == 1) {
            return new k(eVar);
        }
        if (f2 == 3) {
            return new h.a.s.e.b.j(eVar);
        }
        if (f2 == 4) {
            return new l(eVar);
        }
        int i3 = c.e;
        h.a.s.b.b.a(i3, "capacity");
        return new i(eVar, i3, true, false, h.a.s.b.a.b);
    }
}
