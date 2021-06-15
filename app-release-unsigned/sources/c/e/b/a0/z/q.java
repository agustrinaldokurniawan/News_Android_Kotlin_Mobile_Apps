package c.e.b.a0.z;

import c.e.b.b0.a;
import c.e.b.i;
import c.e.b.x;
import c.e.b.y;

public class q implements y {
    public final /* synthetic */ Class e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Class f1501f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ x f1502g;

    public q(Class cls, Class cls2, x xVar) {
        this.e = cls;
        this.f1501f = cls2;
        this.f1502g = xVar;
    }

    @Override // c.e.b.y
    public <T> x<T> a(i iVar, a<T> aVar) {
        Class<? super T> cls = aVar.a;
        if (cls == this.e || cls == this.f1501f) {
            return this.f1502g;
        }
        return null;
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("Factory[type=");
        f2.append(this.f1501f.getName());
        f2.append("+");
        f2.append(this.e.getName());
        f2.append(",adapter=");
        f2.append(this.f1502g);
        f2.append("]");
        return f2.toString();
    }
}
