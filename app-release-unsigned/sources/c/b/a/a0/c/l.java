package c.b.a.a0.c;

import android.graphics.Path;
import android.graphics.PointF;
import c.b.a.c0.k.k;
import c.b.a.f0.c;
import c.b.a.f0.f;
import c.b.a.g0.a;
import java.util.List;

public class l extends a<k, Path> {

    /* renamed from: i  reason: collision with root package name */
    public final k f502i = new k();

    /* renamed from: j  reason: collision with root package name */
    public final Path f503j = new Path();

    public l(List<a<k>> list) {
        super(list);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.b.a.g0.a, float] */
    @Override // c.b.a.a0.c.a
    public Path f(a<k> aVar, float f2) {
        T t = aVar.b;
        T t2 = aVar.f675c;
        k kVar = this.f502i;
        if (kVar.b == null) {
            kVar.b = new PointF();
        }
        kVar.f582c = t.f582c || t2.f582c;
        if (t.a.size() != t2.a.size()) {
            StringBuilder f3 = c.c.a.a.a.f("Curves must have the same number of control points. Shape 1: ");
            f3.append(t.a.size());
            f3.append("\tShape 2: ");
            f3.append(t2.a.size());
            c.b(f3.toString());
        }
        int min = Math.min(t.a.size(), t2.a.size());
        if (kVar.a.size() < min) {
            for (int size = kVar.a.size(); size < min; size++) {
                kVar.a.add(new c.b.a.c0.a());
            }
        } else if (kVar.a.size() > min) {
            for (int size2 = kVar.a.size() - 1; size2 >= min; size2--) {
                List<c.b.a.c0.a> list = kVar.a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointF = t.b;
        PointF pointF2 = t2.b;
        float e = f.e(pointF.x, pointF2.x, f2);
        float e2 = f.e(pointF.y, pointF2.y, f2);
        if (kVar.b == null) {
            kVar.b = new PointF();
        }
        kVar.b.set(e, e2);
        for (int size3 = kVar.a.size() - 1; size3 >= 0; size3--) {
            c.b.a.c0.a aVar2 = t.a.get(size3);
            c.b.a.c0.a aVar3 = t2.a.get(size3);
            PointF pointF3 = aVar2.a;
            PointF pointF4 = aVar2.b;
            PointF pointF5 = aVar2.f524c;
            PointF pointF6 = aVar3.a;
            PointF pointF7 = aVar3.b;
            PointF pointF8 = aVar3.f524c;
            kVar.a.get(size3).a.set(f.e(pointF3.x, pointF6.x, f2), f.e(pointF3.y, pointF6.y, f2));
            kVar.a.get(size3).b.set(f.e(pointF4.x, pointF7.x, f2), f.e(pointF4.y, pointF7.y, f2));
            kVar.a.get(size3).f524c.set(f.e(pointF5.x, pointF8.x, f2), f.e(pointF5.y, pointF8.y, f2));
        }
        k kVar2 = this.f502i;
        Path path = this.f503j;
        path.reset();
        PointF pointF9 = kVar2.b;
        path.moveTo(pointF9.x, pointF9.y);
        f.a.set(pointF9.x, pointF9.y);
        for (int i2 = 0; i2 < kVar2.a.size(); i2++) {
            c.b.a.c0.a aVar4 = kVar2.a.get(i2);
            PointF pointF10 = aVar4.a;
            PointF pointF11 = aVar4.b;
            PointF pointF12 = aVar4.f524c;
            if (!pointF10.equals(f.a) || !pointF11.equals(pointF12)) {
                path.cubicTo(pointF10.x, pointF10.y, pointF11.x, pointF11.y, pointF12.x, pointF12.y);
            } else {
                path.lineTo(pointF12.x, pointF12.y);
            }
            f.a.set(pointF12.x, pointF12.y);
        }
        if (kVar2.f582c) {
            path.close();
        }
        return this.f503j;
    }
}
