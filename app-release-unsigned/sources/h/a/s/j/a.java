package h.a.s.j;

import java.util.concurrent.atomic.AtomicReference;

public final class a extends AtomicReference<Throwable> {
    public boolean a(Throwable th) {
        Throwable th2;
        Throwable th3;
        Throwable th4 = b.a;
        do {
            th2 = (Throwable) get();
            if (th2 == b.a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new h.a.q.a(th2, th);
            }
        } while (!compareAndSet(th2, th3));
        return true;
    }

    public Throwable b() {
        Throwable th = b.a;
        Throwable th2 = (Throwable) get();
        Throwable th3 = b.a;
        return th2 != th3 ? (Throwable) getAndSet(th3) : th2;
    }
}
