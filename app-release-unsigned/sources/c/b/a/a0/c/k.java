package c.b.a.a0.c;

import c.b.a.f0.f;
import c.b.a.g0.a;
import c.b.a.g0.c;
import c.b.a.g0.d;
import java.util.List;

public class k extends f<d> {

    /* renamed from: i  reason: collision with root package name */
    public final d f501i = new d();

    public k(List<a<d>> list) {
        super(list);
    }

    @Override // c.b.a.a0.c.a
    public Object f(a aVar, float f2) {
        T t;
        A a;
        T t2 = aVar.b;
        if (t2 == null || (t = aVar.f675c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        T t3 = t2;
        T t4 = t;
        c<A> cVar = this.e;
        if (cVar != null && (a = cVar.a(aVar.f678g, aVar.f679h.floatValue(), t3, t4, f2, d(), this.f488d)) != null) {
            return a;
        }
        d dVar = this.f501i;
        float e = f.e(t3.a, t4.a, f2);
        float e2 = f.e(t3.b, t4.b, f2);
        dVar.a = e;
        dVar.b = e2;
        return this.f501i;
    }
}
