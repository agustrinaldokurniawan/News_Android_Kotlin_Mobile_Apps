package c.b.a.a0.b;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import c.b.a.a0.c.a;
import c.b.a.c0.e;
import c.b.a.c0.k.i;
import c.b.a.c0.l.b;
import c.b.a.f0.f;
import c.b.a.g0.c;
import c.b.a.m;
import c.b.a.r;
import java.util.List;

public class o implements a.b, k, m {
    public final Path a = new Path();
    public final RectF b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public final String f467c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f468d;
    public final m e;

    /* renamed from: f  reason: collision with root package name */
    public final a<?, PointF> f469f;

    /* renamed from: g  reason: collision with root package name */
    public final a<?, PointF> f470g;

    /* renamed from: h  reason: collision with root package name */
    public final a<?, Float> f471h;

    /* renamed from: i  reason: collision with root package name */
    public b f472i = new b();

    /* renamed from: j  reason: collision with root package name */
    public boolean f473j;

    public o(m mVar, b bVar, i iVar) {
        this.f467c = iVar.a;
        this.f468d = iVar.e;
        this.e = mVar;
        a<PointF, PointF> a2 = iVar.b.a();
        this.f469f = a2;
        a<PointF, PointF> a3 = iVar.f578c.a();
        this.f470g = a3;
        a<Float, Float> a4 = iVar.f579d.a();
        this.f471h = a4;
        bVar.d(a2);
        bVar.d(a3);
        bVar.d(a4);
        a2.a.add(this);
        a3.a.add(this);
        a4.a.add(this);
    }

    @Override // c.b.a.a0.c.a.b
    public void b() {
        this.f473j = false;
        this.e.invalidateSelf();
    }

    @Override // c.b.a.a0.b.c
    public void c(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            c cVar = list.get(i2);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.f484c == 1) {
                    this.f472i.a.add(sVar);
                    sVar.b.add(this);
                }
            }
        }
    }

    @Override // c.b.a.c0.f
    public void e(e eVar, int i2, List<e> list, e eVar2) {
        f.f(eVar, i2, list, eVar2, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: c.b.a.g0.c<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.b.a.c0.f
    public <T> void f(T t, c<T> cVar) {
        a aVar;
        if (t == r.f712j) {
            aVar = this.f470g;
        } else if (t == r.f714l) {
            aVar = this.f469f;
        } else if (t == r.f713k) {
            aVar = this.f471h;
        } else {
            return;
        }
        c<A> cVar2 = aVar.e;
        aVar.e = cVar;
    }

    @Override // c.b.a.a0.b.m
    public Path h() {
        if (this.f473j) {
            return this.a;
        }
        this.a.reset();
        if (!this.f468d) {
            PointF e2 = this.f470g.e();
            float f2 = e2.x / 2.0f;
            float f3 = e2.y / 2.0f;
            a<?, Float> aVar = this.f471h;
            float k2 = aVar == null ? 0.0f : ((c.b.a.a0.c.c) aVar).k();
            float min = Math.min(f2, f3);
            if (k2 > min) {
                k2 = min;
            }
            PointF e3 = this.f469f.e();
            this.a.moveTo(e3.x + f2, (e3.y - f3) + k2);
            this.a.lineTo(e3.x + f2, (e3.y + f3) - k2);
            int i2 = (k2 > 0.0f ? 1 : (k2 == 0.0f ? 0 : -1));
            if (i2 > 0) {
                RectF rectF = this.b;
                float f4 = e3.x;
                float f5 = k2 * 2.0f;
                float f6 = e3.y;
                rectF.set((f4 + f2) - f5, (f6 + f3) - f5, f4 + f2, f6 + f3);
                this.a.arcTo(this.b, 0.0f, 90.0f, false);
            }
            this.a.lineTo((e3.x - f2) + k2, e3.y + f3);
            if (i2 > 0) {
                RectF rectF2 = this.b;
                float f7 = e3.x;
                float f8 = e3.y;
                float f9 = k2 * 2.0f;
                rectF2.set(f7 - f2, (f8 + f3) - f9, (f7 - f2) + f9, f8 + f3);
                this.a.arcTo(this.b, 90.0f, 90.0f, false);
            }
            this.a.lineTo(e3.x - f2, (e3.y - f3) + k2);
            if (i2 > 0) {
                RectF rectF3 = this.b;
                float f10 = e3.x;
                float f11 = e3.y;
                float f12 = k2 * 2.0f;
                rectF3.set(f10 - f2, f11 - f3, (f10 - f2) + f12, (f11 - f3) + f12);
                this.a.arcTo(this.b, 180.0f, 90.0f, false);
            }
            this.a.lineTo((e3.x + f2) - k2, e3.y - f3);
            if (i2 > 0) {
                RectF rectF4 = this.b;
                float f13 = e3.x;
                float f14 = k2 * 2.0f;
                float f15 = e3.y;
                rectF4.set((f13 + f2) - f14, f15 - f3, f13 + f2, (f15 - f3) + f14);
                this.a.arcTo(this.b, 270.0f, 90.0f, false);
            }
            this.a.close();
            this.f472i.a(this.a);
        }
        this.f473j = true;
        return this.a;
    }

    @Override // c.b.a.a0.b.c
    public String i() {
        return this.f467c;
    }
}
