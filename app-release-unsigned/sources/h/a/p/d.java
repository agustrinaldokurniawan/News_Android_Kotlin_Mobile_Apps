package h.a.p;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public abstract class d<T> extends AtomicReference<T> implements c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(T t) {
        super(t);
        Objects.requireNonNull(t, "value is null");
    }

    public final boolean a() {
        return get() == null;
    }

    public abstract void b(T t);

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.a.p.d<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.a.p.c
    public final void e() {
        Object andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            b(andSet);
        }
    }
}
