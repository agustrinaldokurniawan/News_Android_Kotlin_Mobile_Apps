package g.e;

import g.e.g;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends h<K, V> implements Map<K, V> {

    /* renamed from: l  reason: collision with root package name */
    public g<K, V> f2218l;

    /* renamed from: g.e.a$a  reason: collision with other inner class name */
    public class C0070a extends g<K, V> {
        public C0070a() {
        }

        @Override // g.e.g
        public void a() {
            a.this.clear();
        }

        @Override // g.e.g
        public Object b(int i2, int i3) {
            return a.this.f2250j[(i2 << 1) + i3];
        }

        @Override // g.e.g
        public Map<K, V> c() {
            return a.this;
        }

        @Override // g.e.g
        public int d() {
            return a.this.f2251k;
        }

        @Override // g.e.g
        public int e(Object obj) {
            return a.this.e(obj);
        }

        @Override // g.e.g
        public int f(Object obj) {
            return a.this.g(obj);
        }

        @Override // g.e.g
        public void g(K k2, V v) {
            a.this.put(k2, v);
        }

        @Override // g.e.g
        public void h(int i2) {
            a.this.j(i2);
        }

        @Override // g.e.g
        public V i(int i2, V v) {
            return (V) a.this.k(i2, v);
        }
    }

    public a() {
    }

    public a(h hVar) {
        if (hVar != null) {
            i(hVar);
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V> m2 = m();
        if (m2.a == null) {
            m2.a = new g.b();
        }
        return m2.a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        g<K, V> m2 = m();
        if (m2.b == null) {
            m2.b = new g.c();
        }
        return m2.b;
    }

    public final g<K, V> m() {
        if (this.f2218l == null) {
            this.f2218l = new C0070a();
        }
        return this.f2218l;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: g.e.a<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f2251k);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        g<K, V> m2 = m();
        if (m2.f2238c == null) {
            m2.f2238c = new g.e();
        }
        return m2.f2238c;
    }
}
