package c.b.a.a0.c;

import c.b.a.f0.f;
import c.b.a.g0.a;
import java.util.List;

public class c extends f<Float> {
    public c(List<a<Float>> list) {
        super(list);
    }

    @Override // c.b.a.a0.c.a
    public Object f(a aVar, float f2) {
        return Float.valueOf(l(aVar, f2));
    }

    public float k() {
        return l(a(), c());
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    public float l(a<Float> aVar, float f2) {
        A a;
        if (aVar.b == null || aVar.f675c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c.b.a.g0.c<A> cVar = this.e;
        if (cVar != null && (a = cVar.a(aVar.f678g, aVar.f679h.floatValue(), aVar.b, aVar.f675c, f2, d(), this.f488d)) != null) {
            return a.floatValue();
        }
        if (aVar.f680i == -3987645.8f) {
            aVar.f680i = aVar.b.floatValue();
        }
        float f3 = aVar.f680i;
        if (aVar.f681j == -3987645.8f) {
            aVar.f681j = aVar.f675c.floatValue();
        }
        return f.e(f3, aVar.f681j, f2);
    }
}
