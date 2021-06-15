package i.w;

import i.s.c.h;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T> implements e<T> {
    public final AtomicReference<e<T>> a;

    public a(e<? extends T> eVar) {
        h.e(eVar, "sequence");
        this.a = new AtomicReference<>(eVar);
    }

    @Override // i.w.e
    public Iterator<T> iterator() {
        e<T> andSet = this.a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
