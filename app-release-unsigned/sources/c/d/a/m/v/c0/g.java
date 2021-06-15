package c.d.a.m.v.c0;

import c.d.a.m.v.c0.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class g<K extends l, V> {
    public final a<K, V> a = new a<>(null);
    public final Map<K, a<K, V>> b = new HashMap();

    public static class a<K, V> {
        public final K a;
        public List<V> b;

        /* renamed from: c  reason: collision with root package name */
        public a<K, V> f859c;

        /* renamed from: d  reason: collision with root package name */
        public a<K, V> f860d;

        public a() {
            this(null);
        }

        public a(K k2) {
            this.f860d = this;
            this.f859c = this;
            this.a = k2;
        }

        public V a() {
            List<V> list = this.b;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                return this.b.remove(size - 1);
            }
            return null;
        }
    }

    public V a(K k2) {
        a<K, V> aVar = this.b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            this.b.put(k2, aVar);
        } else {
            k2.a();
        }
        a<K, V> aVar2 = aVar.f860d;
        aVar2.f859c = aVar.f859c;
        aVar.f859c.f860d = aVar2;
        a<K, V> aVar3 = this.a;
        aVar.f860d = aVar3;
        a<K, V> aVar4 = aVar3.f859c;
        aVar.f859c = aVar4;
        aVar4.f860d = aVar;
        aVar.f860d.f859c = aVar;
        return aVar.a();
    }

    public void b(K k2, V v) {
        a<K, V> aVar = this.b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            a<K, V> aVar2 = aVar.f860d;
            aVar2.f859c = aVar.f859c;
            aVar.f859c.f860d = aVar2;
            a<K, V> aVar3 = this.a;
            aVar.f860d = aVar3.f860d;
            aVar.f859c = aVar3;
            aVar3.f860d = aVar;
            aVar.f860d.f859c = aVar;
            this.b.put(k2, aVar);
        } else {
            k2.a();
        }
        if (aVar.b == null) {
            aVar.b = new ArrayList();
        }
        aVar.b.add(v);
    }

    public V c() {
        a aVar = this.a;
        while (true) {
            aVar = aVar.f860d;
            if (aVar.equals(this.a)) {
                return null;
            }
            V v = (V) aVar.a();
            if (v != null) {
                return v;
            }
            a<K, V> aVar2 = aVar.f860d;
            aVar2.f859c = aVar.f859c;
            aVar.f859c.f860d = aVar2;
            this.b.remove(aVar.a);
            aVar.a.a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a<K, V> aVar = this.a.f859c; !aVar.equals(this.a); aVar = aVar.f859c) {
            z = true;
            sb.append('{');
            sb.append((Object) aVar.a);
            sb.append(':');
            List<V> list = aVar.b;
            sb.append(list != null ? list.size() : 0);
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
