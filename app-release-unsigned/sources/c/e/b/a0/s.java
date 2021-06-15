package c.e.b.a0;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class s<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator<Comparable> e = new a();

    /* renamed from: f  reason: collision with root package name */
    public Comparator<? super K> f1455f;

    /* renamed from: g  reason: collision with root package name */
    public e<K, V> f1456g;

    /* renamed from: h  reason: collision with root package name */
    public int f1457h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f1458i = 0;

    /* renamed from: j  reason: collision with root package name */
    public final e<K, V> f1459j = new e<>();

    /* renamed from: k  reason: collision with root package name */
    public s<K, V>.b f1460k;

    /* renamed from: l  reason: collision with root package name */
    public s<K, V>.c f1461l;

    public class a implements Comparator<Comparable> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends s<K, V>.d {
            public a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a();
            }
        }

        public b() {
        }

        public void clear() {
            s.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && s.this.b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            e<K, V> b;
            if (!(obj instanceof Map.Entry) || (b = s.this.b((Map.Entry) obj)) == null) {
                return false;
            }
            s.this.e(b, true);
            return true;
        }

        public int size() {
            return s.this.f1457h;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends s<K, V>.d {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f1469j;
            }
        }

        public c() {
        }

        public void clear() {
            s.this.clear();
        }

        public boolean contains(Object obj) {
            return s.this.c(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            s sVar = s.this;
            e<K, V> c2 = sVar.c(obj);
            if (c2 != null) {
                sVar.e(c2, true);
            }
            return c2 != null;
        }

        public int size() {
            return s.this.f1457h;
        }
    }

    public abstract class d<T> implements Iterator<T> {
        public e<K, V> e;

        /* renamed from: f  reason: collision with root package name */
        public e<K, V> f1462f = null;

        /* renamed from: g  reason: collision with root package name */
        public int f1463g;

        public d() {
            this.e = s.this.f1459j.f1467h;
            this.f1463g = s.this.f1458i;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.e;
            s sVar = s.this;
            if (eVar == sVar.f1459j) {
                throw new NoSuchElementException();
            } else if (sVar.f1458i == this.f1463g) {
                this.e = eVar.f1467h;
                this.f1462f = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.e != s.this.f1459j;
        }

        public final void remove() {
            e<K, V> eVar = this.f1462f;
            if (eVar != null) {
                s.this.e(eVar, true);
                this.f1462f = null;
                this.f1463g = s.this.f1458i;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static final class e<K, V> implements Map.Entry<K, V> {
        public e<K, V> e;

        /* renamed from: f  reason: collision with root package name */
        public e<K, V> f1465f;

        /* renamed from: g  reason: collision with root package name */
        public e<K, V> f1466g;

        /* renamed from: h  reason: collision with root package name */
        public e<K, V> f1467h;

        /* renamed from: i  reason: collision with root package name */
        public e<K, V> f1468i;

        /* renamed from: j  reason: collision with root package name */
        public final K f1469j;

        /* renamed from: k  reason: collision with root package name */
        public V f1470k;

        /* renamed from: l  reason: collision with root package name */
        public int f1471l;

        public e() {
            this.f1469j = null;
            this.f1468i = this;
            this.f1467h = this;
        }

        public e(e<K, V> eVar, K k2, e<K, V> eVar2, e<K, V> eVar3) {
            this.e = eVar;
            this.f1469j = k2;
            this.f1471l = 1;
            this.f1467h = eVar2;
            this.f1468i = eVar3;
            eVar3.f1467h = this;
            eVar2.f1468i = this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f1469j
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f1470k
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: c.e.b.a0.s.e.equals(java.lang.Object):boolean");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f1469j;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f1470k;
        }

        public int hashCode() {
            K k2 = this.f1469j;
            int i2 = 0;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f1470k;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f1470k;
            this.f1470k = v;
            return v2;
        }

        public String toString() {
            return ((Object) this.f1469j) + "=" + ((Object) this.f1470k);
        }
    }

    public s() {
        Comparator<Comparable> comparator = e;
        this.f1455f = comparator;
    }

    public e<K, V> a(K k2, boolean z) {
        int i2;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f1455f;
        e<K, V> eVar2 = this.f1456g;
        if (eVar2 != null) {
            K k3 = comparator == e ? k2 : null;
            while (true) {
                K k4 = eVar2.f1469j;
                i2 = k3 != null ? k3.compareTo(k4) : comparator.compare(k2, k4);
                if (i2 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i2 < 0 ? eVar2.f1465f : eVar2.f1466g;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f1459j;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f1468i);
            if (i2 < 0) {
                eVar2.f1465f = eVar;
            } else {
                eVar2.f1466g = eVar;
            }
            d(eVar2, true);
        } else if (comparator != e || (k2 instanceof Comparable)) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f1468i);
            this.f1456g = eVar;
        } else {
            throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
        }
        this.f1457h++;
        this.f1458i++;
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c.e.b.a0.s.e<K, V> b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            c.e.b.a0.s$e r0 = r4.c(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.f1470k
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L_0x001f
            if (r3 == 0) goto L_0x001d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r5 = r2
            goto L_0x0020
        L_0x001f:
            r5 = r1
        L_0x0020:
            if (r5 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.b.a0.s.b(java.util.Map$Entry):c.e.b.a0.s$e");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public e<K, V> c(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public void clear() {
        this.f1456g = null;
        this.f1457h = 0;
        this.f1458i++;
        e<K, V> eVar = this.f1459j;
        eVar.f1468i = eVar;
        eVar.f1467h = eVar;
    }

    public boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    public final void d(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f1465f;
            e<K, V> eVar3 = eVar.f1466g;
            int i2 = 0;
            int i3 = eVar2 != null ? eVar2.f1471l : 0;
            int i4 = eVar3 != null ? eVar3.f1471l : 0;
            int i5 = i3 - i4;
            if (i5 == -2) {
                e<K, V> eVar4 = eVar3.f1465f;
                e<K, V> eVar5 = eVar3.f1466g;
                int i6 = eVar5 != null ? eVar5.f1471l : 0;
                if (eVar4 != null) {
                    i2 = eVar4.f1471l;
                }
                int i7 = i2 - i6;
                if (i7 != -1 && (i7 != 0 || z)) {
                    h(eVar3);
                }
                g(eVar);
                if (z) {
                    return;
                }
            } else if (i5 == 2) {
                e<K, V> eVar6 = eVar2.f1465f;
                e<K, V> eVar7 = eVar2.f1466g;
                int i8 = eVar7 != null ? eVar7.f1471l : 0;
                if (eVar6 != null) {
                    i2 = eVar6.f1471l;
                }
                int i9 = i2 - i8;
                if (i9 != 1 && (i9 != 0 || z)) {
                    g(eVar2);
                }
                h(eVar);
                if (z) {
                    return;
                }
            } else if (i5 == 0) {
                eVar.f1471l = i3 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f1471l = Math.max(i3, i4) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.e;
        }
    }

    public void e(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        int i2;
        if (z) {
            e<K, V> eVar3 = eVar.f1468i;
            eVar3.f1467h = eVar.f1467h;
            eVar.f1467h.f1468i = eVar3;
        }
        e<K, V> eVar4 = eVar.f1465f;
        e<K, V> eVar5 = eVar.f1466g;
        e<K, V> eVar6 = eVar.e;
        int i3 = 0;
        if (eVar4 == null || eVar5 == null) {
            if (eVar4 != null) {
                f(eVar, eVar4);
                eVar.f1465f = null;
            } else if (eVar5 != null) {
                f(eVar, eVar5);
                eVar.f1466g = null;
            } else {
                f(eVar, null);
            }
            d(eVar6, false);
            this.f1457h--;
            this.f1458i++;
            return;
        }
        if (eVar4.f1471l > eVar5.f1471l) {
            do {
                eVar2 = eVar4;
                eVar4 = eVar4.f1466g;
            } while (eVar4 != null);
        } else {
            do {
                eVar5 = eVar5.f1465f;
            } while (eVar5 != null);
            eVar2 = eVar5;
        }
        e(eVar2, false);
        e<K, V> eVar7 = eVar.f1465f;
        if (eVar7 != null) {
            i2 = eVar7.f1471l;
            eVar2.f1465f = eVar7;
            eVar7.e = eVar2;
            eVar.f1465f = null;
        } else {
            i2 = 0;
        }
        e<K, V> eVar8 = eVar.f1466g;
        if (eVar8 != null) {
            i3 = eVar8.f1471l;
            eVar2.f1466g = eVar8;
            eVar8.e = eVar2;
            eVar.f1466g = null;
        }
        eVar2.f1471l = Math.max(i2, i3) + 1;
        f(eVar, eVar2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        s<K, V>.b bVar = this.f1460k;
        if (bVar != null) {
            return bVar;
        }
        s<K, V>.b bVar2 = new b();
        this.f1460k = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.e;
        eVar.e = null;
        if (eVar2 != null) {
            eVar2.e = eVar3;
        }
        if (eVar3 == null) {
            this.f1456g = eVar2;
        } else if (eVar3.f1465f == eVar) {
            eVar3.f1465f = eVar2;
        } else {
            eVar3.f1466g = eVar2;
        }
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f1465f;
        e<K, V> eVar3 = eVar.f1466g;
        e<K, V> eVar4 = eVar3.f1465f;
        e<K, V> eVar5 = eVar3.f1466g;
        eVar.f1466g = eVar4;
        if (eVar4 != null) {
            eVar4.e = eVar;
        }
        f(eVar, eVar3);
        eVar3.f1465f = eVar;
        eVar.e = eVar3;
        int i2 = 0;
        int max = Math.max(eVar2 != null ? eVar2.f1471l : 0, eVar4 != null ? eVar4.f1471l : 0) + 1;
        eVar.f1471l = max;
        if (eVar5 != null) {
            i2 = eVar5.f1471l;
        }
        eVar3.f1471l = Math.max(max, i2) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> c2 = c(obj);
        if (c2 != null) {
            return c2.f1470k;
        }
        return null;
    }

    public final void h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f1465f;
        e<K, V> eVar3 = eVar.f1466g;
        e<K, V> eVar4 = eVar2.f1465f;
        e<K, V> eVar5 = eVar2.f1466g;
        eVar.f1465f = eVar5;
        if (eVar5 != null) {
            eVar5.e = eVar;
        }
        f(eVar, eVar2);
        eVar2.f1466g = eVar;
        eVar.e = eVar2;
        int i2 = 0;
        int max = Math.max(eVar3 != null ? eVar3.f1471l : 0, eVar5 != null ? eVar5.f1471l : 0) + 1;
        eVar.f1471l = max;
        if (eVar4 != null) {
            i2 = eVar4.f1471l;
        }
        eVar2.f1471l = Math.max(max, i2) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        s<K, V>.c cVar = this.f1461l;
        if (cVar != null) {
            return cVar;
        }
        s<K, V>.c cVar2 = new c();
        this.f1461l = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        Objects.requireNonNull(k2, "key == null");
        e<K, V> a2 = a(k2, true);
        V v2 = a2.f1470k;
        a2.f1470k = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> c2 = c(obj);
        if (c2 != null) {
            e(c2, true);
        }
        if (c2 != null) {
            return c2.f1470k;
        }
        return null;
    }

    public int size() {
        return this.f1457h;
    }
}
