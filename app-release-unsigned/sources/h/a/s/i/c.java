package h.a.s.i;

import h.a.q.d;
import h.a.t.a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public enum c implements l.b.c {
    CANCELLED;

    public static boolean a(AtomicReference<l.b.c> atomicReference) {
        l.b.c andSet;
        l.b.c cVar = atomicReference.get();
        c cVar2 = CANCELLED;
        if (cVar == cVar2 || (andSet = atomicReference.getAndSet(cVar2)) == cVar2) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean b(AtomicReference<l.b.c> atomicReference, l.b.c cVar) {
        Objects.requireNonNull(cVar, "s is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        a.M(new d("Subscription already set!"));
        return false;
    }

    public static boolean c(long j2) {
        if (j2 > 0) {
            return true;
        }
        a.M(new IllegalArgumentException(c.c.a.a.a.n("n > 0 required but it was ", j2)));
        return false;
    }

    public static boolean d(l.b.c cVar, l.b.c cVar2) {
        if (cVar2 == null) {
            a.M(new NullPointerException("next is null"));
            return false;
        } else if (cVar == null) {
            return true;
        } else {
            cVar2.cancel();
            a.M(new d("Subscription already set!"));
            return false;
        }
    }

    @Override // l.b.c
    public void cancel() {
    }

    @Override // l.b.c
    public void f(long j2) {
    }
}
