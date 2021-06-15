package i.w;

import i.s.c.h;
import java.util.Iterator;

public final class b<T> implements e<T>, c<T> {
    public final e<T> a;
    public final int b;

    public static final class a implements Iterator<T>, i.s.c.s.a {
        public final Iterator<T> e;

        /* renamed from: f  reason: collision with root package name */
        public int f3327f;

        public a(b bVar) {
            this.e = bVar.a.iterator();
            this.f3327f = bVar.b;
        }

        public final void a() {
            while (this.f3327f > 0 && this.e.hasNext()) {
                this.e.next();
                this.f3327f--;
            }
        }

        public boolean hasNext() {
            a();
            return this.e.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.e.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: i.w.e<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(e<? extends T> eVar, int i2) {
        h.e(eVar, "sequence");
        this.a = eVar;
        this.b = i2;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
        }
    }

    @Override // i.w.c
    public e<T> a(int i2) {
        int i3 = this.b + i2;
        return i3 < 0 ? new b(this, i2) : new b(this.a, i3);
    }

    @Override // i.w.e
    public Iterator<T> iterator() {
        return new a(this);
    }
}
