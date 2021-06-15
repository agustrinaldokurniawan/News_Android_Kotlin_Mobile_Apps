package d.a;

import d.a.a.e;
import d.a.a1.h;
import d.a.a1.i;
import h.a.t.a;
import i.g;
import i.m;
import i.q.d;
import i.q.f;
import java.util.concurrent.CancellationException;

public abstract class w<T> extends h {

    /* renamed from: g  reason: collision with root package name */
    public int f1836g;

    public w(int i2) {
        this.f1836g = i2;
    }

    public void b(Object obj, Throwable th) {
    }

    public abstract d<T> c();

    public Throwable e(Object obj) {
        if (!(obj instanceof m)) {
            obj = null;
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.b;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                a.d(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            i.s.c.h.c(th);
            a.x(c().d(), new u("Fatal exception in coroutines machinery for " + this + ". " + "Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object h();

    public final void run() {
        Object obj;
        Object n;
        i iVar = this.f1802f;
        try {
            d<T> c2 = c();
            if (c2 != null) {
                e eVar = (e) c2;
                d<T> dVar = eVar.f1761m;
                f d2 = dVar.d();
                Object h2 = h();
                Object b = d.a.a.a.b(d2, eVar.f1759k);
                try {
                    Throwable e = e(h2);
                    l0 l0Var = (e != null || !a.C(this.f1836g)) ? null : (l0) d2.get(l0.f1827d);
                    if (l0Var == null || l0Var.b()) {
                        n = e != null ? a.n(e) : f(h2);
                    } else {
                        CancellationException n2 = l0Var.n();
                        b(h2, n2);
                        n = a.n(n2);
                    }
                    dVar.a(n);
                    Object obj2 = m.a;
                    try {
                        iVar.b0();
                    } catch (Throwable th) {
                        obj2 = a.n(th);
                    }
                    g(null, g.a(obj2));
                    return;
                } finally {
                    d.a.a.a.a(d2, b);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
            }
        } catch (Throwable th2) {
            obj = a.n(th2);
        }
        g(th, g.a(obj));
    }
}
