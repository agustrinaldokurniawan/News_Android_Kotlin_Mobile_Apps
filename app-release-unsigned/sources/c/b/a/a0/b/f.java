package c.b.a.a0.b;

import android.graphics.Path;
import android.graphics.PointF;
import c.b.a.a0.c.a;
import c.b.a.c0.e;
import c.b.a.c0.l.b;
import c.b.a.g0.c;
import c.b.a.m;
import c.b.a.r;
import java.util.List;

public class f implements m, a.b, k {
    public final Path a = new Path();
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public final m f433c;

    /* renamed from: d  reason: collision with root package name */
    public final a<?, PointF> f434d;
    public final a<?, PointF> e;

    /* renamed from: f  reason: collision with root package name */
    public final c.b.a.c0.k.a f435f;

    /* renamed from: g  reason: collision with root package name */
    public b f436g = new b();

    /* renamed from: h  reason: collision with root package name */
    public boolean f437h;

    public f(m mVar, b bVar, c.b.a.c0.k.a aVar) {
        this.b = aVar.a;
        this.f433c = mVar;
        a<PointF, PointF> a2 = aVar.f546c.a();
        this.f434d = a2;
        a<PointF, PointF> a3 = aVar.b.a();
        this.e = a3;
        this.f435f = aVar;
        bVar.d(a2);
        bVar.d(a3);
        a2.a.add(this);
        a3.a.add(this);
    }

    @Override // c.b.a.a0.c.a.b
    public void b() {
        this.f437h = false;
        this.f433c.invalidateSelf();
    }

    @Override // c.b.a.a0.b.c
    public void c(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            c cVar = list.get(i2);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.f484c == 1) {
                    this.f436g.a.add(sVar);
                    sVar.b.add(this);
                }
            }
        }
    }

    @Override // c.b.a.c0.f
    public void e(e eVar, int i2, List<e> list, e eVar2) {
        c.b.a.f0.f.f(eVar, i2, list, eVar2, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: c.b.a.g0.c<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.b.a.c0.f
    public <T> void f(T t, c<T> cVar) {
        a<?, PointF> aVar;
        if (t == r.f711i) {
            aVar = this.f434d;
        } else if (t == r.f714l) {
            aVar = this.e;
        } else {
            return;
        }
        c<A> cVar2 = aVar.e;
        aVar.e = cVar;
    }

    @Override // c.b.a.a0.b.m
    public Path h() {
        if (this.f437h) {
            return this.a;
        }
        this.a.reset();
        if (!this.f435f.e) {
            PointF e2 = this.f434d.e();
            float f2 = e2.x / 2.0f;
            float f3 = e2.y / 2.0f;
            float f4 = f2 * 0.55228f;
            float f5 = 0.55228f * f3;
            this.a.reset();
            if (this.f435f.f547d) {
                float f6 = -f3;
                this.a.moveTo(0.0f, f6);
                float f7 = 0.0f - f4;
                float f8 = -f2;
                float f9 = 0.0f - f5;
                this.a.cubicTo(f7, f6, f8, f9, f8, 0.0f);
                float f10 = f5 + 0.0f;
                this.a.cubicTo(f8, f10, f7, f3, 0.0f, f3);
                float f11 = f4 + 0.0f;
                this.a.cubicTo(f11, f3, f2, f10, f2, 0.0f);
                this.a.cubicTo(f2, f9, f11, f6, 0.0f, f6);
            } else {
                float f12 = -f3;
                this.a.moveTo(0.0f, f12);
                float f13 = f4 + 0.0f;
                float f14 = 0.0f - f5;
                this.a.cubicTo(f13, f12, f2, f14, f2, 0.0f);
                float f15 = f5 + 0.0f;
                this.a.cubicTo(f2, f15, f13, f3, 0.0f, f3);
                float f16 = 0.0f - f4;
                float f17 = -f2;
                this.a.cubicTo(f16, f3, f17, f15, f17, 0.0f);
                this.a.cubicTo(f17, f14, f16, f12, 0.0f, f12);
            }
            PointF e3 = this.e.e();
            this.a.offset(e3.x, e3.y);
            this.a.close();
            this.f436g.a(this.a);
        }
        this.f437h = true;
        return this.a;
    }

    @Override // c.b.a.a0.b.c
    public String i() {
        return this.b;
    }
}
