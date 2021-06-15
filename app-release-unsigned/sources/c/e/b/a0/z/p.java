package c.e.b.a0.z;

import c.e.b.b0.a;
import c.e.b.i;
import c.e.b.x;
import c.e.b.y;

public class p implements y {
    public final /* synthetic */ Class e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f1500f;

    public p(Class cls, x xVar) {
        this.e = cls;
        this.f1500f = xVar;
    }

    @Override // c.e.b.y
    public <T> x<T> a(i iVar, a<T> aVar) {
        if (aVar.a == this.e) {
            return this.f1500f;
        }
        return null;
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("Factory[type=");
        f2.append(this.e.getName());
        f2.append(",adapter=");
        f2.append(this.f1500f);
        f2.append("]");
        return f2.toString();
    }
}
