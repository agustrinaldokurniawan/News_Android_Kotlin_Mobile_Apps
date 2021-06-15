package c.b.a.a0.c;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import c.b.a.g;
import c.b.a.g0.a;

public class h extends a<PointF> {
    public Path q;
    public final a<PointF> r;

    public h(g gVar, a<PointF> aVar) {
        super(gVar, aVar.b, aVar.f675c, aVar.f676d, aVar.e, aVar.f677f, aVar.f678g, aVar.f679h);
        this.r = aVar;
        e();
    }

    public void e() {
        T t;
        T t2;
        T t3 = this.f675c;
        boolean z = (t3 == null || (t2 = this.b) == null || !t2.equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.b;
        if (t4 != null && (t = this.f675c) != null && !z) {
            T t5 = t4;
            T t6 = t;
            a<PointF> aVar = this.r;
            PointF pointF = aVar.o;
            PointF pointF2 = aVar.p;
            ThreadLocal<PathMeasure> threadLocal = c.b.a.f0.g.a;
            Path path = new Path();
            path.moveTo(((PointF) t5).x, ((PointF) t5).y);
            if (pointF == null || pointF2 == null || (pointF.length() == 0.0f && pointF2.length() == 0.0f)) {
                path.lineTo(((PointF) t6).x, ((PointF) t6).y);
            } else {
                float f2 = ((PointF) t5).x;
                float f3 = ((PointF) t6).x;
                float f4 = ((PointF) t6).y;
                path.cubicTo(pointF.x + f2, ((PointF) t5).y + pointF.y, f3 + pointF2.x, f4 + pointF2.y, f3, f4);
            }
            this.q = path;
        }
    }
}
