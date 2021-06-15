package c.e.b.a0.z;

import c.e.b.a0.z.j;
import c.e.b.c0.a;
import c.e.b.c0.c;
import c.e.b.i;
import c.e.b.x;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public final class n<T> extends x<T> {
    public final i a;
    public final x<T> b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f1489c;

    public n(i iVar, x<T> xVar, Type type) {
        this.a = iVar;
        this.b = xVar;
        this.f1489c = type;
    }

    @Override // c.e.b.x
    public T a(a aVar) {
        return this.b.a(aVar);
    }

    @Override // c.e.b.x
    public void b(c cVar, T t) {
        x<T> xVar = this.b;
        Type type = this.f1489c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f1489c) {
            xVar = this.a.b(new c.e.b.b0.a<>(type));
            if (xVar instanceof j.a) {
                x<T> xVar2 = this.b;
                if (!(xVar2 instanceof j.a)) {
                    xVar = xVar2;
                }
            }
        }
        xVar.b(cVar, t);
    }
}
