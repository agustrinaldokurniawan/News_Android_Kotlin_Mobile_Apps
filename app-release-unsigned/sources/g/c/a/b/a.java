package g.c.a.b;

import g.c.a.b.b;
import java.util.HashMap;

public class a<K, V> extends b<K, V> {

    /* renamed from: i  reason: collision with root package name */
    public HashMap<K, b.c<K, V>> f2201i = new HashMap<>();

    @Override // g.c.a.b.b
    public b.c<K, V> a(K k2) {
        return this.f2201i.get(k2);
    }

    public boolean contains(K k2) {
        return this.f2201i.containsKey(k2);
    }

    @Override // g.c.a.b.b
    public V d(K k2, V v) {
        b.c<K, V> cVar = this.f2201i.get(k2);
        if (cVar != null) {
            return cVar.f2205f;
        }
        this.f2201i.put(k2, c(k2, v));
        return null;
    }

    @Override // g.c.a.b.b
    public V e(K k2) {
        V v = (V) super.e(k2);
        this.f2201i.remove(k2);
        return v;
    }
}
