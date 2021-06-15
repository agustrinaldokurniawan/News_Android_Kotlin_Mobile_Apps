package g.c.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> e;

    /* renamed from: f  reason: collision with root package name */
    public c<K, V> f2202f;

    /* renamed from: g  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f2203g = new WeakHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public int f2204h = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // g.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f2207h;
        }

        @Override // g.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f2206g;
        }
    }

    /* renamed from: g.c.a.b.b$b  reason: collision with other inner class name */
    public static class C0069b<K, V> extends e<K, V> {
        public C0069b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // g.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f2206g;
        }

        @Override // g.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f2207h;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {
        public final K e;

        /* renamed from: f  reason: collision with root package name */
        public final V f2205f;

        /* renamed from: g  reason: collision with root package name */
        public c<K, V> f2206g;

        /* renamed from: h  reason: collision with root package name */
        public c<K, V> f2207h;

        public c(K k2, V v) {
            this.e = k2;
            this.f2205f = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.e.equals(cVar.e) && this.f2205f.equals(cVar.f2205f);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.e;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f2205f;
        }

        public int hashCode() {
            return this.e.hashCode() ^ this.f2205f.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return ((Object) this.e) + "=" + ((Object) this.f2205f);
        }
    }

    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2208f = true;

        public d() {
        }

        @Override // g.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.e;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f2207h;
                this.e = cVar3;
                this.f2208f = cVar3 == null;
            }
        }

        public boolean hasNext() {
            if (this.f2208f) {
                return b.this.e != null;
            }
            c<K, V> cVar = this.e;
            return (cVar == null || cVar.f2206g == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar;
            if (this.f2208f) {
                this.f2208f = false;
                cVar = b.this.e;
            } else {
                c<K, V> cVar2 = this.e;
                cVar = cVar2 != null ? cVar2.f2206g : null;
            }
            this.e = cVar;
            return cVar;
        }
    }

    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> e;

        /* renamed from: f  reason: collision with root package name */
        public c<K, V> f2210f;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.e = cVar2;
            this.f2210f = cVar;
        }

        @Override // g.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.e == cVar && cVar == this.f2210f) {
                this.f2210f = null;
                this.e = null;
            }
            c<K, V> cVar3 = this.e;
            if (cVar3 == cVar) {
                this.e = b(cVar3);
            }
            c<K, V> cVar4 = this.f2210f;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.e;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = c(cVar4);
                }
                this.f2210f = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        public boolean hasNext() {
            return this.f2210f != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar = this.f2210f;
            c<K, V> cVar2 = this.e;
            this.f2210f = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k2) {
        c<K, V> cVar = this.e;
        while (cVar != null && !cVar.e.equals(k2)) {
            cVar = cVar.f2206g;
        }
        return cVar;
    }

    public b<K, V>.d b() {
        b<K, V>.d dVar = new d();
        this.f2203g.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public c<K, V> c(K k2, V v) {
        c<K, V> cVar = new c<>(k2, v);
        this.f2204h++;
        c<K, V> cVar2 = this.f2202f;
        if (cVar2 == null) {
            this.e = cVar;
        } else {
            cVar2.f2206g = cVar;
            cVar.f2207h = cVar2;
        }
        this.f2202f = cVar;
        return cVar;
    }

    public V d(K k2, V v) {
        c<K, V> a2 = a(k2);
        if (a2 != null) {
            return a2.f2205f;
        }
        c(k2, v);
        return null;
    }

    public V e(K k2) {
        c<K, V> a2 = a(k2);
        if (a2 == null) {
            return null;
        }
        this.f2204h--;
        if (!this.f2203g.isEmpty()) {
            for (f<K, V> fVar : this.f2203g.keySet()) {
                fVar.a(a2);
            }
        }
        c<K, V> cVar = a2.f2207h;
        c<K, V> cVar2 = a2.f2206g;
        if (cVar != null) {
            cVar.f2206g = cVar2;
        } else {
            this.e = cVar2;
        }
        c<K, V> cVar3 = a2.f2206g;
        if (cVar3 != null) {
            cVar3.f2207h = cVar;
        } else {
            this.f2202f = cVar;
        }
        a2.f2206g = null;
        a2.f2207h = null;
        return a2.f2205f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((g.c.a.b.b.e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof g.c.a.b.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            g.c.a.b.b r7 = (g.c.a.b.b) r7
            int r1 = r6.f2204h
            int r3 = r7.f2204h
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            g.c.a.b.b$e r3 = (g.c.a.b.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            g.c.a.b.b$e r4 = (g.c.a.b.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            g.c.a.b.b$e r7 = (g.c.a.b.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.b.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i2 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.e, this.f2202f);
        this.f2203g.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                f2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    f2.append(", ");
                }
            } else {
                f2.append("]");
                return f2.toString();
            }
        }
    }
}
