package c.b.a.a0.c;

import c.b.a.c0.k.c;
import c.b.a.f0.f;
import c.b.a.g0.a;
import java.util.List;
import java.util.Objects;

public class d extends f<c> {

    /* renamed from: i  reason: collision with root package name */
    public final c f494i;

    public d(List<a<c>> list) {
        super(list);
        int i2 = 0;
        T t = list.get(0).b;
        i2 = t != null ? t.b.length : i2;
        this.f494i = new c(new float[i2], new int[i2]);
    }

    @Override // c.b.a.a0.c.a
    public Object f(a aVar, float f2) {
        c cVar = this.f494i;
        T t = aVar.b;
        T t2 = aVar.f675c;
        Objects.requireNonNull(cVar);
        if (t.b.length == t2.b.length) {
            for (int i2 = 0; i2 < t.b.length; i2++) {
                cVar.a[i2] = f.e(t.a[i2], t2.a[i2], f2);
                cVar.b[i2] = g.q.a.g(f2, t.b[i2], t2.b[i2]);
            }
            return this.f494i;
        }
        StringBuilder f3 = c.c.a.a.a.f("Cannot interpolate between gradients. Lengths vary (");
        f3.append(t.b.length);
        f3.append(" vs ");
        f3.append(t2.b.length);
        f3.append(")");
        throw new IllegalArgumentException(f3.toString());
    }
}
