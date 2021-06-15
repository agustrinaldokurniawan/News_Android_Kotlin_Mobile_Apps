package i.o;

import i.s.c.e;
import i.s.c.h;
import i.s.c.s.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class c<T> implements Collection<T>, a {
    public final T[] e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3300f;

    public c(T[] tArr, boolean z) {
        h.e(tArr, "values");
        this.e = tArr;
        this.f3300f = z;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean contains(java.lang.Object r6) {
        /*
            r5 = this;
            T[] r0 = r5.e
            java.lang.String r1 = "$this$contains"
            i.s.c.h.e(r0, r1)
            java.lang.String r1 = "$this$indexOf"
            i.s.c.h.e(r0, r1)
            r1 = 0
            if (r6 != 0) goto L_0x001b
            int r6 = r0.length
            r2 = r1
        L_0x0011:
            if (r2 >= r6) goto L_0x002c
            r3 = r0[r2]
            if (r3 != 0) goto L_0x0018
            goto L_0x002d
        L_0x0018:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x001b:
            int r2 = r0.length
            r3 = r1
        L_0x001d:
            if (r3 >= r2) goto L_0x002c
            r4 = r0[r3]
            boolean r4 = i.s.c.h.a(r6, r4)
            if (r4 == 0) goto L_0x0029
            r2 = r3
            goto L_0x002d
        L_0x0029:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x002c:
            r2 = -1
        L_0x002d:
            if (r2 < 0) goto L_0x0030
            r1 = 1
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.o.c.contains(java.lang.Object):boolean");
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
        return this.e.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        T[] tArr = this.e;
        h.e(tArr, "array");
        return new i.s.c.a(tArr);
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

    public final int size() {
        return this.e.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.e;
        boolean z = this.f3300f;
        h.e(tArr, "$this$copyToArrayOfAny");
        if (z && h.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        h.d(copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) e.b(this, tArr);
    }
}
