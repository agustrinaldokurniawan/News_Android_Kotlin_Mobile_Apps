package k;

import i.s.c.h;

public abstract class k implements z {
    public final z e;

    public k(z zVar) {
        h.f(zVar, "delegate");
        this.e = zVar;
    }

    @Override // k.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.e.close();
    }

    @Override // k.z
    public a0 g() {
        return this.e.g();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.e + ')';
    }
}
