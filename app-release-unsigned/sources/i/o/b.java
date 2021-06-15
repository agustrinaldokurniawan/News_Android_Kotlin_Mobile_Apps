package i.o;

import i.s.c.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public abstract class b<E> extends a<E> implements List<E>, i.s.c.s.a {

    public class a implements Iterator<E>, i.s.c.s.a {
        public int e;

        public a() {
        }

        public boolean hasNext() {
            return this.e < b.this.a();
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                b bVar = b.this;
                int i2 = this.e;
                this.e = i2 + 1;
                return (E) bVar.get(i2);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: i.o.b$b  reason: collision with other inner class name */
    public class C0118b extends b<E>.a implements ListIterator<E>, i.s.c.s.a {
        public C0118b(int i2) {
            super();
            int a = b.this.a();
            if (i2 < 0 || i2 > a) {
                throw new IndexOutOfBoundsException(c.c.a.a.a.m("index: ", i2, ", size: ", a));
            }
            this.e = i2;
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return this.e > 0;
        }

        public int nextIndex() {
            return this.e;
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                b bVar = b.this;
                int i2 = this.e - 1;
                this.e = i2;
                return (E) bVar.get(i2);
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.e - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c<E> extends b<E> implements RandomAccess {
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public final b<E> f3298f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3299g;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: i.o.b<? extends E> */
        /* JADX WARN: Multi-variable type inference failed */
        public c(b<? extends E> bVar, int i2, int i3) {
            h.e(bVar, "list");
            this.f3298f = bVar;
            this.f3299g = i2;
            int a = bVar.a();
            if (i2 < 0 || i3 > a) {
                throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + a);
            } else if (i2 <= i3) {
                this.e = i3 - i2;
            } else {
                throw new IllegalArgumentException(c.c.a.a.a.m("fromIndex: ", i2, " > toIndex: ", i3));
            }
        }

        @Override // i.o.a
        public int a() {
            return this.e;
        }

        @Override // i.o.b, java.util.List
        public E get(int i2) {
            int i3 = this.e;
            if (i2 >= 0 && i2 < i3) {
                return this.f3298f.get(this.f3299g + i2);
            }
            throw new IndexOutOfBoundsException(c.c.a.a.a.m("index: ", i2, ", size: ", i3));
        }
    }

    @Override // java.util.List
    public void add(int i2, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        h.e(this, "c");
        h.e(collection, "other");
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            for (E e : this) {
                if (!h.a(e, it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i2);

    public int hashCode() {
        h.e(this, "c");
        Iterator<E> it = iterator();
        int i2 = 1;
        while (it.hasNext()) {
            E next = it.next();
            i2 = (i2 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i2;
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (h.a(it.next(), obj)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (h.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C0118b(0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i2) {
        return new C0118b(i2);
    }

    @Override // java.util.List
    public E remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i2, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i2, int i3) {
        return new c(this, i2, i3);
    }
}
