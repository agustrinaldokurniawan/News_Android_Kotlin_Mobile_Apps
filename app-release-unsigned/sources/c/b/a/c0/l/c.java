package c.b.a.c0.l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import c.b.a.a0.c.a;
import c.b.a.a0.c.p;
import c.b.a.c0.j.b;
import c.b.a.d;
import c.b.a.g;
import c.b.a.m;
import c.b.a.r;
import g.e.e;
import java.util.ArrayList;
import java.util.List;

public class c extends b {
    public final List<b> A = new ArrayList();
    public final RectF B = new RectF();
    public final RectF C = new RectF();
    public Paint D = new Paint();
    public a<Float, Float> z;

    public c(m mVar, e eVar, List<e> list, g gVar) {
        super(mVar, eVar);
        int i2;
        b bVar;
        b bVar2;
        b bVar3 = eVar.s;
        if (bVar3 != null) {
            a<Float, Float> a = bVar3.a();
            this.z = a;
            d(a);
            this.z.a.add(this);
        } else {
            this.z = null;
        }
        e eVar2 = new e(gVar.f670i.size());
        int size = list.size() - 1;
        b bVar4 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar3 = list.get(size);
            int ordinal = eVar3.e.ordinal();
            if (ordinal == 0) {
                bVar2 = new c(mVar, eVar3, gVar.f665c.get(eVar3.f612g), gVar);
            } else if (ordinal == 1) {
                bVar2 = new h(mVar, eVar3);
            } else if (ordinal == 2) {
                bVar2 = new d(mVar, eVar3);
            } else if (ordinal == 3) {
                bVar2 = new f(mVar, eVar3);
            } else if (ordinal == 4) {
                bVar2 = new g(mVar, eVar3);
            } else if (ordinal != 5) {
                StringBuilder f2 = c.c.a.a.a.f("Unknown layer type ");
                f2.append(eVar3.e);
                c.b.a.f0.c.b(f2.toString());
                bVar2 = null;
            } else {
                bVar2 = new i(mVar, eVar3);
            }
            if (bVar2 != null) {
                eVar2.j(bVar2.o.f610d, bVar2);
                if (bVar4 != null) {
                    bVar4.r = bVar2;
                    bVar4 = null;
                } else {
                    this.A.add(0, bVar2);
                    int f3 = g.f.c.g.f(eVar3.u);
                    if (f3 == 1 || f3 == 2) {
                        bVar4 = bVar2;
                    }
                }
            }
            size--;
        }
        for (i2 = 0; i2 < eVar2.k(); i2++) {
            b bVar5 = (b) eVar2.g(eVar2.i(i2));
            if (!(bVar5 == null || (bVar = (b) eVar2.g(bVar5.o.f611f)) == null)) {
                bVar5.s = bVar;
            }
        }
    }

    @Override // c.b.a.a0.b.e, c.b.a.c0.l.b
    public void a(RectF rectF, Matrix matrix, boolean z2) {
        super.a(rectF, matrix, z2);
        for (int size = this.A.size() - 1; size >= 0; size--) {
            this.B.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.A.get(size).a(this.B, this.f608m, true);
            rectF.union(this.B);
        }
    }

    @Override // c.b.a.c0.f, c.b.a.c0.l.b
    public <T> void f(T t, c.b.a.g0.c<T> cVar) {
        this.v.c(t, cVar);
        if (t != r.C) {
            return;
        }
        if (cVar == null) {
            a<Float, Float> aVar = this.z;
            if (aVar != null) {
                aVar.j(null);
                return;
            }
            return;
        }
        p pVar = new p(cVar, null);
        this.z = pVar;
        pVar.a.add(this);
        d(this.z);
    }

    @Override // c.b.a.c0.l.b
    public void l(Canvas canvas, Matrix matrix, int i2) {
        RectF rectF = this.C;
        e eVar = this.o;
        rectF.set(0.0f, 0.0f, (float) eVar.o, (float) eVar.p);
        matrix.mapRect(this.C);
        boolean z2 = this.n.w && this.A.size() > 1 && i2 != 255;
        if (z2) {
            this.D.setAlpha(i2);
            RectF rectF2 = this.C;
            Paint paint = this.D;
            ThreadLocal<PathMeasure> threadLocal = c.b.a.f0.g.a;
            canvas.saveLayer(rectF2, paint);
            d.a("Utils#saveLayer");
        } else {
            canvas.save();
        }
        if (z2) {
            i2 = 255;
        }
        for (int size = this.A.size() - 1; size >= 0; size--) {
            if (!this.C.isEmpty() ? canvas.clipRect(this.C) : true) {
                this.A.get(size).g(canvas, matrix, i2);
            }
        }
        canvas.restore();
        d.a("CompositionLayer#draw");
    }

    @Override // c.b.a.c0.l.b
    public void p(c.b.a.c0.e eVar, int i2, List<c.b.a.c0.e> list, c.b.a.c0.e eVar2) {
        for (int i3 = 0; i3 < this.A.size(); i3++) {
            this.A.get(i3).e(eVar, i2, list, eVar2);
        }
    }

    @Override // c.b.a.c0.l.b
    public void q(boolean z2) {
        if (z2 && this.y == null) {
            this.y = new c.b.a.a0.a();
        }
        this.x = z2;
        for (b bVar : this.A) {
            bVar.q(z2);
        }
    }

    @Override // c.b.a.c0.l.b
    public void r(float f2) {
        super.r(f2);
        if (this.z != null) {
            f2 = ((this.z.e().floatValue() * this.o.b.f674m) - this.o.b.f672k) / (this.n.f693f.c() + 0.01f);
        }
        if (this.z == null) {
            e eVar = this.o;
            f2 -= eVar.n / eVar.b.c();
        }
        float f3 = this.o.f618m;
        if (f3 != 0.0f) {
            f2 /= f3;
        }
        int size = this.A.size();
        while (true) {
            size--;
            if (size >= 0) {
                this.A.get(size).r(f2);
            } else {
                return;
            }
        }
    }
}
