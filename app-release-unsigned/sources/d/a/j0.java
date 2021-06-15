package d.a;

import c.c.a.a.a;
import i.m;
import i.s.b.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class j0 extends n0<l0> {

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1822i = AtomicIntegerFieldUpdater.newUpdater(j0.class, "_invoked");
    public volatile int _invoked = 0;

    /* renamed from: j  reason: collision with root package name */
    public final l<Throwable, m> f1823j;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: i.s.b.l<? super java.lang.Throwable, i.m> */
    /* JADX WARN: Multi-variable type inference failed */
    public j0(l0 l0Var, l<? super Throwable, m> lVar) {
        super(l0Var);
        this.f1823j = lVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // i.s.b.l
    public /* bridge */ /* synthetic */ m o(Throwable th) {
        p(th);
        return m.a;
    }

    public void p(Throwable th) {
        if (f1822i.compareAndSet(this, 0, 1)) {
            this.f1823j.o(th);
        }
    }

    @Override // d.a.a.i
    public String toString() {
        StringBuilder f2 = a.f("InvokeOnCancelling[");
        f2.append(j0.class.getSimpleName());
        f2.append('@');
        f2.append(h.a.t.a.u(this));
        f2.append(']');
        return f2.toString();
    }
}
