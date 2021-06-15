package c.d.a.s;

import g.e.a;
import g.e.h;

public final class b<K, V> extends a<K, V> {

    /* renamed from: m  reason: collision with root package name */
    public int f1160m;

    @Override // g.e.h
    public void clear() {
        this.f1160m = 0;
        super.clear();
    }

    @Override // g.e.h
    public int hashCode() {
        if (this.f1160m == 0) {
            this.f1160m = super.hashCode();
        }
        return this.f1160m;
    }

    @Override // g.e.h
    public void i(h<? extends K, ? extends V> hVar) {
        this.f1160m = 0;
        super.i(hVar);
    }

    @Override // g.e.h
    public V j(int i2) {
        this.f1160m = 0;
        return (V) super.j(i2);
    }

    @Override // g.e.h
    public V k(int i2, V v) {
        this.f1160m = 0;
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f2250j;
        V v2 = (V) objArr[i3];
        objArr[i3] = v;
        return v2;
    }

    @Override // java.util.Map, g.e.h
    public V put(K k2, V v) {
        this.f1160m = 0;
        return (V) super.put(k2, v);
    }
}
