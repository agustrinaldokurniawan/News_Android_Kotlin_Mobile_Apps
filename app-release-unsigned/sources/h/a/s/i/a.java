package h.a.s.i;

import h.a.s.c.c;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a<T> extends AtomicInteger implements c<T> {
    @Override // h.a.s.c.e
    public final boolean i(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
