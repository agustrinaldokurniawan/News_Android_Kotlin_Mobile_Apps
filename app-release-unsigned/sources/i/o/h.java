package i.o;

import i.s.c.e;
import i.s.c.s.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class h implements List, Serializable, RandomAccess, a {
    public static final h e = new h();

    @Override // java.util.List
    public /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Void) {
            i.s.c.h.e((Void) obj, "element");
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        i.s.c.h.e(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    @Override // java.util.List
    public Object get(int i2) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i2 + '.');
    }

    public int hashCode() {
        return 1;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Void) {
            i.s.c.h.e((Void) obj, "element");
        }
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return g.e;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            i.s.c.h.e((Void) obj, "element");
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return g.e;
    }

    @Override // java.util.List
    public ListIterator listIterator(int i2) {
        if (i2 == 0) {
            return g.e;
        }
        throw new IndexOutOfBoundsException(c.c.a.a.a.l("Index: ", i2));
    }

    @Override // java.util.List
    public /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.List
    public List subList(int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(c.c.a.a.a.m("fromIndex: ", i2, ", toIndex: ", i3));
    }

    public Object[] toArray() {
        return e.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) e.b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
