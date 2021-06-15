package c.b.a.a0.c;

import android.graphics.PointF;
import c.b.a.f0.f;
import c.b.a.g0.a;
import c.b.a.g0.c;
import java.util.List;

public class e extends f<Integer> {
    public e(List<a<Integer>> list) {
        super(list);
    }

    @Override // c.b.a.a0.c.a
    public Object f(a aVar, float f2) {
        return Integer.valueOf(k(aVar, f2));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    public int k(a<Integer> aVar, float f2) {
        A a;
        if (aVar.b == null || aVar.f675c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c<A> cVar = this.e;
        if (cVar != null && (a = cVar.a(aVar.f678g, aVar.f679h.floatValue(), aVar.b, aVar.f675c, f2, d(), this.f488d)) != null) {
            return a.intValue();
        }
        if (aVar.f682k == 784923401) {
            aVar.f682k = aVar.b.intValue();
        }
        int i2 = aVar.f682k;
        if (aVar.f683l == 784923401) {
            aVar.f683l = aVar.f675c.intValue();
        }
        int i3 = aVar.f683l;
        PointF pointF = f.a;
        return (int) ((f2 * ((float) (i3 - i2))) + ((float) i2));
    }
}
