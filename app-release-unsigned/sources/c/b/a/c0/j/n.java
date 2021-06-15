package c.b.a.c0.j;

import c.b.a.g0.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class n<V, O> implements m<V, O> {
    public final List<a<V>> a;

    public n(V v) {
        this.a = Collections.singletonList(new a(v));
    }

    public n(List<a<V>> list) {
        this.a = list;
    }

    @Override // c.b.a.c0.j.m
    public List<a<V>> b() {
        return this.a;
    }

    @Override // c.b.a.c0.j.m
    public boolean c() {
        return this.a.isEmpty() || (this.a.size() == 1 && this.a.get(0).d());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
