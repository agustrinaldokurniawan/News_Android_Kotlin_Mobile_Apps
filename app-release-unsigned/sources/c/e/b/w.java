package c.e.b;

import c.e.b.c0.a;
import c.e.b.c0.b;
import c.e.b.c0.c;

public class w extends x<T> {
    public final /* synthetic */ x a;

    public w(x xVar) {
        this.a = xVar;
    }

    @Override // c.e.b.x
    public T a(a aVar) {
        if (aVar.p0() != b.NULL) {
            return (T) this.a.a(aVar);
        }
        aVar.l0();
        return null;
    }

    @Override // c.e.b.x
    public void b(c cVar, T t) {
        if (t == null) {
            cVar.b0();
        } else {
            this.a.b(cVar, t);
        }
    }
}
