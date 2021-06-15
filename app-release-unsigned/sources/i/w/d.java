package i.w;

import i.s.b.l;
import i.s.c.h;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d<T> implements e<T> {
    public final e<T> a;
    public final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final l<T, Boolean> f3328c;

    public static final class a implements Iterator<T>, i.s.c.s.a {
        public final Iterator<T> e;

        /* renamed from: f  reason: collision with root package name */
        public int f3329f = -1;

        /* renamed from: g  reason: collision with root package name */
        public T f3330g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ d f3331h;

        public a(d dVar) {
            this.f3331h = dVar;
            this.e = dVar.a.iterator();
        }

        public final void a() {
            int i2;
            while (true) {
                if (!this.e.hasNext()) {
                    i2 = 0;
                    break;
                }
                T next = this.e.next();
                if (this.f3331h.f3328c.o(next).booleanValue() == this.f3331h.b) {
                    this.f3330g = next;
                    i2 = 1;
                    break;
                }
            }
            this.f3329f = i2;
        }

        public boolean hasNext() {
            if (this.f3329f == -1) {
                a();
            }
            return this.f3329f == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f3329f == -1) {
                a();
            }
            if (this.f3329f != 0) {
                T t = this.f3330g;
                this.f3330g = null;
                this.f3329f = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: i.w.e<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: i.s.b.l<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(e<? extends T> eVar, boolean z, l<? super T, Boolean> lVar) {
        h.e(eVar, "sequence");
        h.e(lVar, "predicate");
        this.a = eVar;
        this.b = z;
        this.f3328c = lVar;
    }

    @Override // i.w.e
    public Iterator<T> iterator() {
        return new a(this);
    }
}
