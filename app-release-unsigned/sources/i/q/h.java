package i.q;

import i.q.f;
import i.s.b.p;
import java.io.Serializable;

public final class h implements f, Serializable {
    public static final h e = new h();

    @Override // i.q.f
    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        i.s.c.h.e(pVar, "operation");
        return r;
    }

    @Override // i.q.f
    public <E extends f.a> E get(f.b<E> bVar) {
        i.s.c.h.e(bVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // i.q.f
    public f minusKey(f.b<?> bVar) {
        i.s.c.h.e(bVar, "key");
        return this;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
