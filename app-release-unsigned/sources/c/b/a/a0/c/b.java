package c.b.a.a0.c;

import c.b.a.f0.f;
import c.b.a.g0.a;
import c.b.a.g0.c;
import java.util.List;

public class b extends f<Integer> {
    public b(List<a<Integer>> list) {
        super(list);
    }

    @Override // c.b.a.a0.c.a
    public Object f(a aVar, float f2) {
        return Integer.valueOf(k(aVar, f2));
    }

    public int k(a<Integer> aVar, float f2) {
        A a;
        T t = aVar.b;
        if (t == null || aVar.f675c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = t.intValue();
        int intValue2 = aVar.f675c.intValue();
        c<A> cVar = this.e;
        return (cVar == null || (a = cVar.a(aVar.f678g, aVar.f679h.floatValue(), (A) Integer.valueOf(intValue), (A) Integer.valueOf(intValue2), f2, d(), this.f488d)) == null) ? g.q.a.g(f.b(f2, 0.0f, 1.0f), intValue, intValue2) : a.intValue();
    }
}
