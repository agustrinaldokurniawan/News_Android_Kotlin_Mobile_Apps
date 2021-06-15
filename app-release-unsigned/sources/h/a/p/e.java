package h.a.p;

import c.c.a.a.a;

public final class e extends d<Runnable> {
    public e(Runnable runnable) {
        super(runnable);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.a.p.d
    public void b(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        StringBuilder f2 = a.f("RunnableDisposable(disposed=");
        f2.append(a());
        f2.append(", ");
        f2.append(get());
        f2.append(")");
        return f2.toString();
    }
}
