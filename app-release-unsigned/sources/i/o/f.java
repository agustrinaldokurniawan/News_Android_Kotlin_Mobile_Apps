package i.o;

import i.w.e;
import java.util.Iterator;

public final class f implements e<T> {
    public final /* synthetic */ Iterable a;

    public f(Iterable iterable) {
        this.a = iterable;
    }

    @Override // i.w.e
    public Iterator<T> iterator() {
        return this.a.iterator();
    }
}
