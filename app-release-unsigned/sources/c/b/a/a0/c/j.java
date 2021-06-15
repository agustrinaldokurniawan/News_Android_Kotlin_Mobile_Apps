package c.b.a.a0.c;

import android.graphics.PointF;
import c.b.a.g0.a;
import c.b.a.g0.c;
import java.util.List;

public class j extends f<PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f500i = new PointF();

    public j(List<a<PointF>> list) {
        super(list);
    }

    @Override // c.b.a.a0.c.a
    public Object f(a aVar, float f2) {
        return g(aVar, f2, f2, f2);
    }

    /* renamed from: k */
    public PointF g(a<PointF> aVar, float f2, float f3, float f4) {
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
        PointF pointF = this.f500i;
        float f5 = ((PointF) t3).x;
        float a2 = c.c.a.a.a.a(((PointF) t4).x, f5, f3, f5);
        float f6 = ((PointF) t3).y;
        pointF.set(a2, ((((PointF) t4).y - f6) * f4) + f6);
        return this.f500i;
    }
}
