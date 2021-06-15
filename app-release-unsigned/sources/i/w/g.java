package i.w;

import i.s.c.s.a;
import java.util.Iterator;

public final class g implements Iterable<T>, a {
    public final /* synthetic */ e e;

    public g(e eVar) {
        this.e = eVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.e.iterator();
    }
}
