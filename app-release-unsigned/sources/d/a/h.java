package d.a;

import c.c.a.a.a;
import d.a.a.e;
import d.a.a.f;
import d.a.a.o;
import i.m;
import i.q.d;
import java.util.Objects;
import java.util.concurrent.CancellationException;

public final class h extends n0<l0> {

    /* renamed from: i  reason: collision with root package name */
    public final f<?> f1819i;

    public h(l0 l0Var, f<?> fVar) {
        super(l0Var);
        this.f1819i = fVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // i.s.b.l
    public /* bridge */ /* synthetic */ m o(Throwable th) {
        p(th);
        return m.a;
    }

    public void p(Throwable th) {
        f<?> fVar = this.f1819i;
        J j2 = this.f1828h;
        Objects.requireNonNull(fVar);
        CancellationException n = j2.n();
        boolean z = true;
        boolean z2 = false;
        if (fVar.f1836g == 2) {
            d<T> dVar = fVar.f1817k;
            if (!(dVar instanceof e)) {
                dVar = null;
            }
            e eVar = (e) dVar;
            if (eVar != null) {
                while (true) {
                    Object obj = eVar._reusableCancellableContinuation;
                    o oVar = f.b;
                    if (!i.s.c.h.a(obj, oVar)) {
                        if (obj instanceof Throwable) {
                            break;
                        } else if (e.f1756h.compareAndSet(eVar, obj, null)) {
                            z = false;
                            break;
                        }
                    } else if (e.f1756h.compareAndSet(eVar, oVar, n)) {
                        break;
                    }
                }
                z2 = z;
            }
        }
        if (!z2) {
            fVar.l(n);
            fVar.m();
        }
    }

    @Override // d.a.a.i
    public String toString() {
        StringBuilder f2 = a.f("ChildContinuation[");
        f2.append(this.f1819i);
        f2.append(']');
        return f2.toString();
    }
}
