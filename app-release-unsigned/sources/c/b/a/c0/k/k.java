package c.b.a.c0.k;

import android.graphics.PointF;
import c.b.a.c0.a;
import java.util.ArrayList;
import java.util.List;

public class k {
    public final List<a> a;
    public PointF b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f582c;

    public k() {
        this.a = new ArrayList();
    }

    public k(PointF pointF, boolean z, List<a> list) {
        this.b = pointF;
        this.f582c = z;
        this.a = new ArrayList(list);
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("ShapeData{numCurves=");
        f2.append(this.a.size());
        f2.append("closed=");
        f2.append(this.f582c);
        f2.append('}');
        return f2.toString();
    }
}
