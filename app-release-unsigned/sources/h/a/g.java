package h.a;

import c.f.a.b;

public abstract class g<T> implements i<T> {
    @Override // h.a.i
    public final void a(h<? super T> hVar) {
        try {
            b(hVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            b.h(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void b(h<? super T> hVar);
}
