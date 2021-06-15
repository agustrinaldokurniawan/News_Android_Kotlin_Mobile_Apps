package k;

import i.s.c.h;

public abstract class j implements x {
    public final x e;

    public j(x xVar) {
        h.f(xVar, "delegate");
        this.e = xVar;
    }

    @Override // k.x
    public a0 g() {
        return this.e.g();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.e + ')';
    }
}
