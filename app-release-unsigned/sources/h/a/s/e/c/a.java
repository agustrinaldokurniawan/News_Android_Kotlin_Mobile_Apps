package h.a.s.e.c;

import c.f.a.b;
import h.a.g;
import h.a.h;
import h.a.p.e;
import java.util.concurrent.Callable;

public final class a<T> extends g<T> implements Callable<T> {
    public final Callable<? extends T> e;

    public a(Callable<? extends T> callable) {
        this.e = callable;
    }

    @Override // h.a.g
    public void b(h<? super T> hVar) {
        e eVar = new e(h.a.s.b.a.a);
        hVar.d(eVar);
        if (!eVar.a()) {
            try {
                Object obj = (Object) this.e.call();
                if (eVar.a()) {
                    return;
                }
                if (obj == 0) {
                    hVar.a();
                } else {
                    hVar.c(obj);
                }
            } catch (Throwable th) {
                b.h(th);
                if (!eVar.a()) {
                    hVar.b(th);
                } else {
                    h.a.t.a.M(th);
                }
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        return (T) this.e.call();
    }
}
