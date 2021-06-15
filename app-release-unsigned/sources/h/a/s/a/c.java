package h.a.s.a;

import h.a.s.c.b;

public enum c implements b, h.a.p.c {
    INSTANCE,
    NEVER;

    @Override // h.a.s.c.e
    public void clear() {
    }

    @Override // h.a.s.c.e
    public Object d() {
        return null;
    }

    @Override // h.a.p.c
    public void e() {
    }

    @Override // h.a.s.c.e
    public boolean i(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // h.a.s.c.e
    public boolean isEmpty() {
        return true;
    }
}
