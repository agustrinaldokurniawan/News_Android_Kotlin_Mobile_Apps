package c.b.a.c0.l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import c.b.a.a0.b.e;
import c.b.a.a0.c.a;
import c.b.a.a0.c.c;
import c.b.a.a0.c.g;
import c.b.a.a0.c.o;
import c.b.a.c0.f;
import c.b.a.c0.j.l;
import c.b.a.c0.k.k;
import c.b.a.d;
import c.b.a.m;
import c.b.a.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class b implements e, a.b, f {
    public final Path a = new Path();
    public final Matrix b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    public final Paint f599c;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f600d;
    public final Paint e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f601f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f602g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f603h;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f604i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f605j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f606k;

    /* renamed from: l  reason: collision with root package name */
    public final String f607l;

    /* renamed from: m  reason: collision with root package name */
    public final Matrix f608m;
    public final m n;
    public final e o;
    public g p;
    public c q;
    public b r;
    public b s;
    public List<b> t;
    public final List<a<?, ?>> u;
    public final o v;
    public boolean w;
    public boolean x;
    public Paint y;

    public b(m mVar, e eVar) {
        boolean z = true;
        this.f599c = new c.b.a.a0.a(1);
        this.f600d = new c.b.a.a0.a(1, PorterDuff.Mode.DST_IN);
        this.e = new c.b.a.a0.a(1, PorterDuff.Mode.DST_OUT);
        c.b.a.a0.a aVar = new c.b.a.a0.a(1);
        this.f601f = aVar;
        this.f602g = new c.b.a.a0.a(PorterDuff.Mode.CLEAR);
        this.f603h = new RectF();
        this.f604i = new RectF();
        this.f605j = new RectF();
        this.f606k = new RectF();
        this.f608m = new Matrix();
        this.u = new ArrayList();
        this.w = true;
        this.n = mVar;
        this.o = eVar;
        this.f607l = c.c.a.a.a.e(new StringBuilder(), eVar.f609c, "#draw");
        aVar.setXfermode(eVar.u == 3 ? new PorterDuffXfermode(PorterDuff.Mode.DST_OUT) : new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        l lVar = eVar.f614i;
        Objects.requireNonNull(lVar);
        o oVar = new o(lVar);
        this.v = oVar;
        oVar.b(this);
        List<c.b.a.c0.k.f> list = eVar.f613h;
        if (list != null && !list.isEmpty()) {
            g gVar = new g(eVar.f613h);
            this.p = gVar;
            for (a<k, Path> aVar2 : gVar.a) {
                aVar2.a.add(this);
            }
            for (a<Integer, Integer> aVar3 : this.p.b) {
                d(aVar3);
                aVar3.a.add(this);
            }
        }
        if (!this.o.t.isEmpty()) {
            c cVar = new c(this.o.t);
            this.q = cVar;
            cVar.b = true;
            cVar.a.add(new a(this));
            s(((Float) this.q.e()).floatValue() != 1.0f ? false : z);
            d(this.q);
            return;
        }
        s(true);
    }

    @Override // c.b.a.a0.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.f603h.set(0.0f, 0.0f, 0.0f, 0.0f);
        j();
        this.f608m.set(matrix);
        if (z) {
            List<b> list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f608m.preConcat(this.t.get(size).v.e());
                }
            } else {
                b bVar = this.s;
                if (bVar != null) {
                    this.f608m.preConcat(bVar.v.e());
                }
            }
        }
        this.f608m.preConcat(this.v.e());
    }

    @Override // c.b.a.a0.c.a.b
    public void b() {
        this.n.invalidateSelf();
    }

    @Override // c.b.a.a0.b.c
    public void c(List<c.b.a.a0.b.c> list, List<c.b.a.a0.b.c> list2) {
    }

    public void d(a<?, ?> aVar) {
        if (aVar != null) {
            this.u.add(aVar);
        }
    }

    @Override // c.b.a.c0.f
    public void e(c.b.a.c0.e eVar, int i2, List<c.b.a.c0.e> list, c.b.a.c0.e eVar2) {
        b bVar = this.r;
        if (bVar != null) {
            c.b.a.c0.e a2 = eVar2.a(bVar.o.f609c);
            if (eVar.c(this.r.o.f609c, i2)) {
                list.add(a2.g(this.r));
            }
            if (eVar.f(this.o.f609c, i2)) {
                this.r.p(eVar, eVar.d(this.r.o.f609c, i2) + i2, list, a2);
            }
        }
        if (eVar.e(this.o.f609c, i2)) {
            if (!"__container".equals(this.o.f609c)) {
                eVar2 = eVar2.a(this.o.f609c);
                if (eVar.c(this.o.f609c, i2)) {
                    list.add(eVar2.g(this));
                }
            }
            if (eVar.f(this.o.f609c, i2)) {
                p(eVar, eVar.d(this.o.f609c, i2) + i2, list, eVar2);
            }
        }
    }

    @Override // c.b.a.c0.f
    public <T> void f(T t2, c.b.a.g0.c<T> cVar) {
        this.v.c(t2, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x03c9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x025b  */
    @Override // c.b.a.a0.b.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
        // Method dump skipped, instructions count: 1095
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.a.c0.l.b.g(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // c.b.a.a0.b.c
    public String i() {
        return this.o.f609c;
    }

    public final void j() {
        if (this.t == null) {
            if (this.s == null) {
                this.t = Collections.emptyList();
                return;
            }
            this.t = new ArrayList();
            for (b bVar = this.s; bVar != null; bVar = bVar.s) {
                this.t.add(bVar);
            }
        }
    }

    public final void k(Canvas canvas) {
        RectF rectF = this.f603h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f602g);
        d.a("Layer#clearLayer");
    }

    public abstract void l(Canvas canvas, Matrix matrix, int i2);

    public boolean m() {
        g gVar = this.p;
        return gVar != null && !gVar.a.isEmpty();
    }

    public boolean n() {
        return this.r != null;
    }

    public final void o(float f2) {
        v vVar = this.n.f693f.a;
        String str = this.o.f609c;
        if (vVar.a) {
            c.b.a.f0.e eVar = vVar.f718c.get(str);
            if (eVar == null) {
                eVar = new c.b.a.f0.e();
                vVar.f718c.put(str, eVar);
            }
            float f3 = eVar.a + f2;
            eVar.a = f3;
            int i2 = eVar.b + 1;
            eVar.b = i2;
            if (i2 == Integer.MAX_VALUE) {
                eVar.a = f3 / 2.0f;
                eVar.b = i2 / 2;
            }
            if (str.equals("__container")) {
                for (v.a aVar : vVar.b) {
                    aVar.a(f2);
                }
            }
        }
    }

    public void p(c.b.a.c0.e eVar, int i2, List<c.b.a.c0.e> list, c.b.a.c0.e eVar2) {
    }

    public void q(boolean z) {
        if (z && this.y == null) {
            this.y = new c.b.a.a0.a();
        }
        this.x = z;
    }

    public void r(float f2) {
        o oVar = this.v;
        a<Integer, Integer> aVar = oVar.f515j;
        if (aVar != null) {
            aVar.i(f2);
        }
        a<?, Float> aVar2 = oVar.f518m;
        if (aVar2 != null) {
            aVar2.i(f2);
        }
        a<?, Float> aVar3 = oVar.n;
        if (aVar3 != null) {
            aVar3.i(f2);
        }
        a<PointF, PointF> aVar4 = oVar.f511f;
        if (aVar4 != null) {
            aVar4.i(f2);
        }
        a<?, PointF> aVar5 = oVar.f512g;
        if (aVar5 != null) {
            aVar5.i(f2);
        }
        a<c.b.a.g0.d, c.b.a.g0.d> aVar6 = oVar.f513h;
        if (aVar6 != null) {
            aVar6.i(f2);
        }
        a<Float, Float> aVar7 = oVar.f514i;
        if (aVar7 != null) {
            aVar7.i(f2);
        }
        c cVar = oVar.f516k;
        if (cVar != null) {
            cVar.i(f2);
        }
        c cVar2 = oVar.f517l;
        if (cVar2 != null) {
            cVar2.i(f2);
        }
        if (this.p != null) {
            for (int i2 = 0; i2 < this.p.a.size(); i2++) {
                this.p.a.get(i2).i(f2);
            }
        }
        float f3 = this.o.f618m;
        if (f3 != 0.0f) {
            f2 /= f3;
        }
        c cVar3 = this.q;
        if (cVar3 != null) {
            cVar3.i(f2 / f3);
        }
        b bVar = this.r;
        if (bVar != null) {
            bVar.r(bVar.o.f618m * f2);
        }
        for (int i3 = 0; i3 < this.u.size(); i3++) {
            this.u.get(i3).i(f2);
        }
    }

    public final void s(boolean z) {
        if (z != this.w) {
            this.w = z;
            this.n.invalidateSelf();
        }
    }
}
