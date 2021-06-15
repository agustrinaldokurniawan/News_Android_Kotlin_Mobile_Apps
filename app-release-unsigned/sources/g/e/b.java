package g.e;

import java.util.Map;

public class b extends g<E, E> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f2220d;

    public b(c cVar) {
        this.f2220d = cVar;
    }

    @Override // g.e.g
    public void a() {
        this.f2220d.clear();
    }

    @Override // g.e.g
    public Object b(int i2, int i3) {
        return this.f2220d.f2227l[i2];
    }

    @Override // g.e.g
    public Map<E, E> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // g.e.g
    public int d() {
        return this.f2220d.f2228m;
    }

    @Override // g.e.g
    public int e(Object obj) {
        return this.f2220d.indexOf(obj);
    }

    @Override // g.e.g
    public int f(Object obj) {
        return this.f2220d.indexOf(obj);
    }

    @Override // g.e.g
    public void g(E e, E e2) {
        this.f2220d.add(e);
    }

    @Override // g.e.g
    public void h(int i2) {
        this.f2220d.e(i2);
    }

    @Override // g.e.g
    public E i(int i2, E e) {
        throw new UnsupportedOperationException("not a map");
    }
}
