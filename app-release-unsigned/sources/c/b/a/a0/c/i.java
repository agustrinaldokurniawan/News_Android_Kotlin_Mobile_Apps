package c.b.a.a0.c;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import c.b.a.g0.a;
import c.b.a.g0.c;
import java.util.List;

public class i extends f<PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f496i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    public final float[] f497j = new float[2];

    /* renamed from: k  reason: collision with root package name */
    public final PathMeasure f498k = new PathMeasure();

    /* renamed from: l  reason: collision with root package name */
    public h f499l;

    public i(List<? extends a<PointF>> list) {
        super(list);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.Object] */
    @Override // c.b.a.a0.c.a
    public Object f(a aVar, float f2) {
        A a;
        h hVar = (h) aVar;
        Path path = hVar.q;
        if (path == null) {
            return aVar.b;
        }
        c<A> cVar = this.e;
        if (cVar != null && (a = cVar.a(hVar.f678g, hVar.f679h.floatValue(), hVar.b, hVar.f675c, d(), f2, this.f488d)) != null) {
            return a;
        }
        if (this.f499l != hVar) {
            this.f498k.setPath(path, false);
            this.f499l = hVar;
        }
        PathMeasure pathMeasure = this.f498k;
        pathMeasure.getPosTan(pathMeasure.getLength() * f2, this.f497j, null);
        PointF pointF = this.f496i;
        float[] fArr = this.f497j;
        pointF.set(fArr[0], fArr[1]);
        return this.f496i;
    }
}
