package i.w;

import java.util.Iterator;

public final class f implements e<T> {
    public final /* synthetic */ Iterator a;

    public f(Iterator it) {
        this.a = it;
    }

    @Override // i.w.e
    public Iterator<T> iterator() {
        return this.a;
    }
}
