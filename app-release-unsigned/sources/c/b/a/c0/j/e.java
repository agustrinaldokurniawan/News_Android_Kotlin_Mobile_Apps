package c.b.a.c0.j;

import android.graphics.PointF;
import c.b.a.a0.c.i;
import c.b.a.a0.c.j;
import c.b.a.g0.a;
import java.util.List;

public class e implements m<PointF, PointF> {
    public final List<a<PointF>> a;

    public e(List<a<PointF>> list) {
        this.a = list;
    }

    @Override // c.b.a.c0.j.m
    public c.b.a.a0.c.a<PointF, PointF> a() {
        return this.a.get(0).d() ? new j(this.a) : new i(this.a);
    }

    @Override // c.b.a.c0.j.m
    public List<a<PointF>> b() {
        return this.a;
    }

    @Override // c.b.a.c0.j.m
    public boolean c() {
        return this.a.size() == 1 && this.a.get(0).d();
    }
}
