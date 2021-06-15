package i.o;

import i.s.b.l;
import i.s.c.e;
import i.s.c.h;
import i.s.c.i;
import java.util.Collection;
import java.util.Iterator;

public abstract class a<E> implements Collection<E>, i.s.c.s.a {

    /* renamed from: i.o.a$a  reason: collision with other inner class name */
    public static final class C0117a extends i implements l<E, CharSequence> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ a f3295f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0117a(a aVar) {
            super(1);
            this.f3295f = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // i.s.b.l
        public CharSequence o(Object obj) {
            return obj == this.f3295f ? "(this Collection)" : String.valueOf(obj);
        }
    }

    public abstract int a();

    @Override // java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = ((b) this).iterator();
        while (it.hasNext()) {
            if (h.a(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        h.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return a() == 0;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public Object[] toArray() {
        return e.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        h.e(tArr, "array");
        return (T[]) e.b(this, tArr);
    }

    public String toString() {
        return e.h(this, ", ", "[", "]", 0, null, new C0117a(this), 24);
    }
}
