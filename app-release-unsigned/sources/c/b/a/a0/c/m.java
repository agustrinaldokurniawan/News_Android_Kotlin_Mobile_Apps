package c.b.a.a0.c;

import android.graphics.PointF;
import c.b.a.g0.a;
import c.b.a.g0.c;
import java.util.Collections;

public class m extends a<PointF, PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f504i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    public final PointF f505j = new PointF();

    /* renamed from: k  reason: collision with root package name */
    public final a<Float, Float> f506k;

    /* renamed from: l  reason: collision with root package name */
    public final a<Float, Float> f507l;

    /* renamed from: m  reason: collision with root package name */
    public c<Float> f508m;
    public c<Float> n;

    public m(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f506k = aVar;
        this.f507l = aVar2;
        i(this.f488d);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.b.a.a0.c.a
    public PointF e() {
        return k(0.0f);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [c.b.a.g0.a, float] */
    @Override // c.b.a.a0.c.a
    public /* bridge */ /* synthetic */ PointF f(a<PointF> aVar, float f2) {
        return k(f2);
    }

    @Override // c.b.a.a0.c.a
    public void i(float f2) {
        this.f506k.i(f2);
        this.f507l.i(f2);
        this.f504i.set(this.f506k.e().floatValue(), this.f507l.e().floatValue());
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            this.a.get(i2).b();
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (Lc/b/a/g0/a<Landroid/graphics/PointF;>;F)Landroid/graphics/PointF; */
    public PointF k(float f2) {
        Float f3;
        a<Float> a;
        a<Float> a2;
        Float f4 = null;
        if (this.f508m == null || (a2 = this.f506k.a()) == null) {
            f3 = null;
        } else {
            float c2 = this.f506k.c();
            Float f5 = a2.f679h;
            c<Float> cVar = this.f508m;
            float f6 = a2.f678g;
            f3 = cVar.a(f6, f5 == null ? f6 : f5.floatValue(), a2.b, a2.f675c, f2, f2, c2);
        }
        if (!(this.n == null || (a = this.f507l.a()) == null)) {
            float c3 = this.f507l.c();
            Float f7 = a.f679h;
            c<Float> cVar2 = this.n;
            float f8 = a.f678g;
            f4 = cVar2.a(f8, f7 == null ? f8 : f7.floatValue(), a.b, a.f675c, f2, f2, c3);
        }
        if (f3 == null) {
            this.f505j.set(this.f504i.x, 0.0f);
        } else {
            this.f505j.set(f3.floatValue(), 0.0f);
        }
        PointF pointF = this.f505j;
        pointF.set(pointF.x, f4 == null ? this.f504i.y : f4.floatValue());
        return this.f505j;
    }
}
