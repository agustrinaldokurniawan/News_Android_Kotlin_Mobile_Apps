package g.e;

import g.e.g;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class c<E> implements Collection<E>, Set<E> {
    public static final int[] e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    public static final Object[] f2221f = new Object[0];

    /* renamed from: g  reason: collision with root package name */
    public static Object[] f2222g;

    /* renamed from: h  reason: collision with root package name */
    public static int f2223h;

    /* renamed from: i  reason: collision with root package name */
    public static Object[] f2224i;

    /* renamed from: j  reason: collision with root package name */
    public static int f2225j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f2226k = e;

    /* renamed from: l  reason: collision with root package name */
    public Object[] f2227l = f2221f;

    /* renamed from: m  reason: collision with root package name */
    public int f2228m = 0;
    public g<E, E> n;

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (f2225j < 10) {
                    objArr[0] = f2224i;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2224i = objArr;
                    f2225j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (f2223h < 10) {
                    objArr[0] = f2222g;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f2222g = objArr;
                    f2223h++;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (c.class) {
                Object[] objArr = f2224i;
                if (objArr != null) {
                    this.f2227l = objArr;
                    f2224i = (Object[]) objArr[0];
                    this.f2226k = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2225j--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (c.class) {
                Object[] objArr2 = f2222g;
                if (objArr2 != null) {
                    this.f2227l = objArr2;
                    f2222g = (Object[]) objArr2[0];
                    this.f2226k = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2223h--;
                    return;
                }
            }
        }
        this.f2226k = new int[i2];
        this.f2227l = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = d();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = c(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        int i5 = this.f2228m;
        int[] iArr = this.f2226k;
        if (i5 >= iArr.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f2227l;
            a(i6);
            int[] iArr2 = this.f2226k;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2227l, 0, objArr.length);
            }
            b(iArr, objArr, this.f2228m);
        }
        int i7 = this.f2228m;
        if (i4 < i7) {
            int[] iArr3 = this.f2226k;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f2227l;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f2228m - i4);
        }
        this.f2226k[i4] = i2;
        this.f2227l[i4] = e2;
        this.f2228m++;
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: g.e.c<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f2228m;
        int[] iArr = this.f2226k;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f2227l;
            a(size);
            int i2 = this.f2228m;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f2226k, 0, i2);
                System.arraycopy(objArr, 0, this.f2227l, 0, this.f2228m);
            }
            b(iArr, objArr, this.f2228m);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public final int c(Object obj, int i2) {
        int i3 = this.f2228m;
        if (i3 == 0) {
            return -1;
        }
        int a = d.a(this.f2226k, i3, i2);
        if (a < 0 || obj.equals(this.f2227l[a])) {
            return a;
        }
        int i4 = a + 1;
        while (i4 < i3 && this.f2226k[i4] == i2) {
            if (obj.equals(this.f2227l[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a - 1;
        while (i5 >= 0 && this.f2226k[i5] == i2) {
            if (obj.equals(this.f2227l[i5])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public void clear() {
        int i2 = this.f2228m;
        if (i2 != 0) {
            b(this.f2226k, this.f2227l, i2);
            this.f2226k = e;
            this.f2227l = f2221f;
            this.f2228m = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i2 = this.f2228m;
        if (i2 == 0) {
            return -1;
        }
        int a = d.a(this.f2226k, i2, 0);
        if (a < 0 || this.f2227l[a] == null) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f2226k[i3] == 0) {
            if (this.f2227l[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f2226k[i4] == 0) {
            if (this.f2227l[i4] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public E e(int i2) {
        Object[] objArr = this.f2227l;
        E e2 = (E) objArr[i2];
        int i3 = this.f2228m;
        if (i3 <= 1) {
            b(this.f2226k, objArr, i3);
            this.f2226k = e;
            this.f2227l = f2221f;
            this.f2228m = 0;
        } else {
            int[] iArr = this.f2226k;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = i3 - 1;
                this.f2228m = i5;
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    System.arraycopy(iArr, i6, iArr, i2, i5 - i2);
                    Object[] objArr2 = this.f2227l;
                    System.arraycopy(objArr2, i6, objArr2, i2, this.f2228m - i2);
                }
                this.f2227l[this.f2228m] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                a(i4);
                this.f2228m--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f2226k, 0, i2);
                    System.arraycopy(objArr, 0, this.f2227l, 0, i2);
                }
                int i7 = this.f2228m;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr, i8, this.f2226k, i2, i7 - i2);
                    System.arraycopy(objArr, i8, this.f2227l, i2, this.f2228m - i2);
                }
            }
        }
        return e2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f2228m != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2228m; i2++) {
                try {
                    if (!set.contains(this.f2227l[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f2226k;
        int i2 = this.f2228m;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? d() : c(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f2228m <= 0;
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        if (this.n == null) {
            this.n = new b(this);
        }
        g<E, E> gVar = this.n;
        if (gVar.b == null) {
            gVar.b = new g.c();
        }
        return gVar.b.iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        e(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f2228m - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f2227l[i2])) {
                e(i2);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f2228m;
    }

    public Object[] toArray() {
        int i2 = this.f2228m;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f2227l, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f2228m) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f2228m));
        }
        System.arraycopy(this.f2227l, 0, tArr, 0, this.f2228m);
        int length = tArr.length;
        int i2 = this.f2228m;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2228m * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2228m; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f2227l[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
