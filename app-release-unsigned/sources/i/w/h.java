package i.w;

import i.s.b.l;
import java.util.Iterator;

public final class h<T, R> implements e<R> {
    public final e<T> a;
    public final l<T, R> b;

    public static final class a implements Iterator<R>, i.s.c.s.a {
        public final Iterator<T> e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ h f3332f;

        public a(h hVar) {
            this.f3332f = hVar;
            this.e = hVar.a.iterator();
        }

        public boolean hasNext() {
            return this.e.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return this.f3332f.b.o(this.e.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: i.w.e<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: i.s.b.l<? super T, ? extends R> */
    /* JADX WARN: Multi-variable type inference failed */
    public h(e<? extends T> eVar, l<? super T, ? extends R> lVar) {
        i.s.c.h.e(eVar, "sequence");
        i.s.c.h.e(lVar, "transformer");
        this.a = eVar;
        this.b = lVar;
    }

    @Override // i.w.e
    public Iterator<R> iterator() {
        return new a(this);
    }
}
