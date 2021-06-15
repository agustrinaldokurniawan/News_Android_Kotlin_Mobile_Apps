package h.a.s.i;

import h.a.s.c.c;

public enum b implements c<Object> {
    INSTANCE;

    @Override // l.b.c
    public void cancel() {
    }

    @Override // h.a.s.c.e
    public void clear() {
    }

    @Override // h.a.s.c.e
    public Object d() {
        return null;
    }

    @Override // l.b.c
    public void f(long j2) {
        c.c(j2);
    }

    @Override // h.a.s.c.e
    public boolean i(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // h.a.s.c.e
    public boolean isEmpty() {
        return true;
    }

    @Override // h.a.s.c.b
    public int j(int i2) {
        return i2 & 2;
    }

    public String toString() {
        return "EmptySubscription";
    }
}
