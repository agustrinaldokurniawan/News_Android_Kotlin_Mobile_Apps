package c.b.a.c0.j;

import android.graphics.PointF;
import c.b.a.a0.c.a;
import c.b.a.a0.c.m;
import java.util.List;

public class i implements m<PointF, PointF> {
    public final b a;
    public final b b;

    public i(b bVar, b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    @Override // c.b.a.c0.j.m
    public a<PointF, PointF> a() {
        return new m(this.a.a(), this.b.a());
    }

    @Override // c.b.a.c0.j.m
    public List<c.b.a.g0.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // c.b.a.c0.j.m
    public boolean c() {
        return this.a.c() && this.b.c();
    }
}
