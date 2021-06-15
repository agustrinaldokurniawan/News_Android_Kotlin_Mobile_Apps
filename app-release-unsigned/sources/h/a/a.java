package h.a;

import c.f.a.b;

public abstract class a {
    public final void a(b bVar) {
        try {
            b(bVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            b.h(th);
            h.a.t.a.M(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void b(b bVar);
}
