package c.e.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class k extends n implements Iterable<n> {
    public final List<n> e = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof k) && ((k) obj).e.equals(this.e));
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<n> iterator() {
        return this.e.iterator();
    }
}
