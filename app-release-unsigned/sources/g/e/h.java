package g.e;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class h<K, V> {
    public static Object[] e;

    /* renamed from: f  reason: collision with root package name */
    public static int f2246f;

    /* renamed from: g  reason: collision with root package name */
    public static Object[] f2247g;

    /* renamed from: h  reason: collision with root package name */
    public static int f2248h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f2249i;

    /* renamed from: j  reason: collision with root package name */
    public Object[] f2250j;

    /* renamed from: k  reason: collision with root package name */
    public int f2251k;

    public h() {
        this.f2249i = d.a;
        this.f2250j = d.f2229c;
        this.f2251k = 0;
    }

    public h(int i2) {
        if (i2 == 0) {
            this.f2249i = d.a;
            this.f2250j = d.f2229c;
        } else {
            a(i2);
        }
        this.f2251k = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (f2248h < 10) {
                    objArr[0] = f2247g;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2247g = objArr;
                    f2248h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (h.class) {
                if (f2246f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    e = objArr;
                    f2246f++;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (h.class) {
                Object[] objArr = f2247g;
                if (objArr != null) {
                    this.f2250j = objArr;
                    f2247g = (Object[]) objArr[0];
                    this.f2249i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2248h--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (h.class) {
                Object[] objArr2 = e;
                if (objArr2 != null) {
                    this.f2250j = objArr2;
                    e = (Object[]) objArr2[0];
                    this.f2249i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2246f--;
                    return;
                }
            }
        }
        this.f2249i = new int[i2];
        this.f2250j = new Object[(i2 << 1)];
    }

    public void b(int i2) {
        int i3 = this.f2251k;
        int[] iArr = this.f2249i;
        if (iArr.length < i2) {
            Object[] objArr = this.f2250j;
            a(i2);
            if (this.f2251k > 0) {
                System.arraycopy(iArr, 0, this.f2249i, 0, i3);
                System.arraycopy(objArr, 0, this.f2250j, 0, i3 << 1);
            }
            c(iArr, objArr, i3);
        }
        if (this.f2251k != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.f2251k;
        if (i2 > 0) {
            int[] iArr = this.f2249i;
            Object[] objArr = this.f2250j;
            this.f2249i = d.a;
            this.f2250j = d.f2229c;
            this.f2251k = 0;
            c(iArr, objArr, i2);
        }
        if (this.f2251k > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public int d(Object obj, int i2) {
        int i3 = this.f2251k;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a = d.a(this.f2249i, i3, i2);
            if (a < 0 || obj.equals(this.f2250j[a << 1])) {
                return a;
            }
            int i4 = a + 1;
            while (i4 < i3 && this.f2249i[i4] == i2) {
                if (obj.equals(this.f2250j[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            int i5 = a - 1;
            while (i5 >= 0 && this.f2249i[i5] == i2) {
                if (obj.equals(this.f2250j[i5 << 1])) {
                    return i5;
                }
                i5--;
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f2251k != hVar.f2251k) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2251k; i2++) {
                try {
                    K h2 = h(i2);
                    V l2 = l(i2);
                    Object obj2 = hVar.get(h2);
                    if (l2 == null) {
                        if (obj2 != null || !hVar.containsKey(h2)) {
                            return false;
                        }
                    } else if (!l2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f2251k != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f2251k; i3++) {
                try {
                    K h3 = h(i3);
                    V l3 = l(i3);
                    Object obj3 = map.get(h3);
                    if (l3 == null) {
                        if (obj3 != null || !map.containsKey(h3)) {
                            return false;
                        }
                    } else if (!l3.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f() {
        int i2 = this.f2251k;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a = d.a(this.f2249i, i2, 0);
            if (a < 0 || this.f2250j[a << 1] == null) {
                return a;
            }
            int i3 = a + 1;
            while (i3 < i2 && this.f2249i[i3] == 0) {
                if (this.f2250j[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            int i4 = a - 1;
            while (i4 >= 0 && this.f2249i[i4] == 0) {
                if (this.f2250j[i4 << 1] == null) {
                    return i4;
                }
                i4--;
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int g(Object obj) {
        int i2 = this.f2251k * 2;
        Object[] objArr = this.f2250j;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int e2 = e(obj);
        return e2 >= 0 ? (V) this.f2250j[(e2 << 1) + 1] : v;
    }

    public K h(int i2) {
        return (K) this.f2250j[i2 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f2249i;
        Object[] objArr = this.f2250j;
        int i2 = this.f2251k;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: g.e.h<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public void i(h<? extends K, ? extends V> hVar) {
        int i2 = hVar.f2251k;
        b(this.f2251k + i2);
        if (this.f2251k != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(hVar.h(i3), hVar.l(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(hVar.f2249i, 0, this.f2249i, 0, i2);
            System.arraycopy(hVar.f2250j, 0, this.f2250j, 0, i2 << 1);
            this.f2251k = i2;
        }
    }

    public boolean isEmpty() {
        return this.f2251k <= 0;
    }

    public V j(int i2) {
        Object[] objArr = this.f2250j;
        int i3 = i2 << 1;
        V v = (V) objArr[i3 + 1];
        int i4 = this.f2251k;
        int i5 = 0;
        if (i4 <= 1) {
            c(this.f2249i, objArr, i4);
            this.f2249i = d.a;
            this.f2250j = d.f2229c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f2249i;
            int i7 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr, i8, iArr, i2, i9);
                    Object[] objArr2 = this.f2250j;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i3, i9 << 1);
                }
                Object[] objArr3 = this.f2250j;
                int i10 = i6 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                if (i4 > 8) {
                    i7 = i4 + (i4 >> 1);
                }
                a(i7);
                if (i4 == this.f2251k) {
                    if (i2 > 0) {
                        System.arraycopy(iArr, 0, this.f2249i, 0, i2);
                        System.arraycopy(objArr, 0, this.f2250j, 0, i3);
                    }
                    if (i2 < i6) {
                        int i11 = i2 + 1;
                        int i12 = i6 - i2;
                        System.arraycopy(iArr, i11, this.f2249i, i2, i12);
                        System.arraycopy(objArr, i11 << 1, this.f2250j, i3, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i5 = i6;
        }
        if (i4 == this.f2251k) {
            this.f2251k = i5;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f2250j;
        V v2 = (V) objArr[i3];
        objArr[i3] = v;
        return v2;
    }

    public V l(int i2) {
        return (V) this.f2250j[(i2 << 1) + 1];
    }

    public V put(K k2, V v) {
        int i2;
        int i3;
        int i4 = this.f2251k;
        if (k2 == null) {
            i3 = f();
            i2 = 0;
        } else {
            int hashCode = k2.hashCode();
            i2 = hashCode;
            i3 = d(k2, hashCode);
        }
        if (i3 >= 0) {
            int i5 = (i3 << 1) + 1;
            Object[] objArr = this.f2250j;
            V v2 = (V) objArr[i5];
            objArr[i5] = v;
            return v2;
        }
        int i6 = ~i3;
        int[] iArr = this.f2249i;
        if (i4 >= iArr.length) {
            int i7 = 4;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i7 = 8;
            }
            Object[] objArr2 = this.f2250j;
            a(i7);
            if (i4 == this.f2251k) {
                int[] iArr2 = this.f2249i;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f2250j, 0, objArr2.length);
                }
                c(iArr, objArr2, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr3 = this.f2249i;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr3 = this.f2250j;
            System.arraycopy(objArr3, i6 << 1, objArr3, i8 << 1, (this.f2251k - i6) << 1);
        }
        int i9 = this.f2251k;
        if (i4 == i9) {
            int[] iArr4 = this.f2249i;
            if (i6 < iArr4.length) {
                iArr4[i6] = i2;
                Object[] objArr4 = this.f2250j;
                int i10 = i6 << 1;
                objArr4[i10] = k2;
                objArr4[i10 + 1] = v;
                this.f2251k = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k2, V v) {
        V orDefault = getOrDefault(k2, null);
        return orDefault == null ? put(k2, v) : orDefault;
    }

    public V remove(Object obj) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return j(e2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        V l2 = l(e2);
        if (obj2 != l2 && (obj2 == null || !obj2.equals(l2))) {
            return false;
        }
        j(e2);
        return true;
    }

    public V replace(K k2, V v) {
        int e2 = e(k2);
        if (e2 >= 0) {
            return k(e2, v);
        }
        return null;
    }

    public boolean replace(K k2, V v, V v2) {
        int e2 = e(k2);
        if (e2 < 0) {
            return false;
        }
        V l2 = l(e2);
        if (l2 != v && (v == null || !v.equals(l2))) {
            return false;
        }
        k(e2, v2);
        return true;
    }

    public int size() {
        return this.f2251k;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2251k * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2251k; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K h2 = h(i2);
            if (h2 != this) {
                sb.append((Object) h2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V l2 = l(i2);
            if (l2 != this) {
                sb.append((Object) l2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
