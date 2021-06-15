package i.s.c;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a<T> implements Iterator<T>, i.s.c.s.a {
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public final T[] f3309f;

    public a(T[] tArr) {
        h.e(tArr, "array");
        this.f3309f = tArr;
    }

    public boolean hasNext() {
        return this.e < this.f3309f.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f3309f;
            int i2 = this.e;
            this.e = i2 + 1;
            return tArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.e--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
