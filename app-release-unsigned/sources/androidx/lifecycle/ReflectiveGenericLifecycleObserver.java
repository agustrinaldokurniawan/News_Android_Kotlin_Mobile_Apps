package androidx.lifecycle;

import g.n.b;
import g.n.e;
import g.n.g;
import g.n.i;

public class ReflectiveGenericLifecycleObserver implements g {
    public final Object a;
    public final b.a b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.b = b.a.b(obj.getClass());
    }

    @Override // g.n.g
    public void d(i iVar, e.a aVar) {
        b.a aVar2 = this.b;
        Object obj = this.a;
        b.a.a(aVar2.a.get(aVar), iVar, aVar, obj);
        b.a.a(aVar2.a.get(e.a.ON_ANY), iVar, aVar, obj);
    }
}
