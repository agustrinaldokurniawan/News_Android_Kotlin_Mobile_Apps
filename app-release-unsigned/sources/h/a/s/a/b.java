package h.a.s.a;

import h.a.p.c;
import h.a.q.d;
import h.a.t.a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public enum b implements c {
    DISPOSED;

    public static boolean a(AtomicReference<c> atomicReference) {
        c andSet;
        c cVar = atomicReference.get();
        b bVar = DISPOSED;
        if (cVar == bVar || (andSet = atomicReference.getAndSet(bVar)) == bVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.e();
        return true;
    }

    public static boolean b(c cVar) {
        return cVar == DISPOSED;
    }

    public static boolean c(AtomicReference<c> atomicReference, c cVar) {
        c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar == null) {
                    return false;
                }
                cVar.e();
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        return true;
    }

    public static boolean d(AtomicReference<c> atomicReference, c cVar) {
        Objects.requireNonNull(cVar, "d is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.e();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        a.M(new d("Disposable already set!"));
        return false;
    }

    @Override // h.a.p.c
    public void e() {
    }
}
