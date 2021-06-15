package d.a;

import d.a.a.i;
import d.a.a.n;
import d.a.l0;
import java.util.Objects;

public abstract class o0<J extends l0> extends o implements y, h0 {

    /* renamed from: h  reason: collision with root package name */
    public final J f1828h;

    public o0(J j2) {
        this.f1828h = j2;
    }

    @Override // d.a.h0
    public boolean b() {
        return true;
    }

    @Override // d.a.y
    public void e() {
        Object d2;
        Object h2;
        i iVar;
        n nVar;
        J j2 = this.f1828h;
        Objects.requireNonNull(j2, "null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
        p0 p0Var = (p0) j2;
        do {
            d2 = p0Var.d();
            if (d2 instanceof o0) {
                if (d2 != this) {
                    return;
                }
            } else if ((d2 instanceof h0) && ((h0) d2).f() != null) {
                do {
                    h2 = h();
                    if (h2 instanceof n) {
                        i iVar2 = ((n) h2).a;
                        return;
                    } else if (h2 == this) {
                        i iVar3 = (i) h2;
                        return;
                    } else {
                        Objects.requireNonNull(h2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        iVar = (i) h2;
                        nVar = (n) iVar._removedRef;
                        if (nVar == null) {
                            nVar = new n(iVar);
                            i.f1763g.lazySet(iVar, nVar);
                        }
                    }
                } while (!i.e.compareAndSet(this, h2, nVar));
                iVar.a(null);
                return;
            } else {
                return;
            }
        } while (!p0.e.compareAndSet(p0Var, d2, q0.f1832f));
    }

    @Override // d.a.h0
    public s0 f() {
        return null;
    }
}
