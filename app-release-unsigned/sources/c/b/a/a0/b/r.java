package c.b.a.a0.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import c.b.a.a0.c.a;
import c.b.a.a0.c.p;
import c.b.a.c0.k.o;
import c.b.a.c0.l.b;
import c.b.a.g0.c;
import c.b.a.m;
import g.f.c.g;

public class r extends a {
    public final b o;
    public final String p;
    public final boolean q;
    public final a<Integer, Integer> r;
    public a<ColorFilter, ColorFilter> s;

    public r(m mVar, b bVar, o oVar) {
        super(mVar, bVar, g.h(oVar.f592g), g.i(oVar.f593h), oVar.f594i, oVar.e, oVar.f591f, oVar.f589c, oVar.b);
        this.o = bVar;
        this.p = oVar.a;
        this.q = oVar.f595j;
        a<Integer, Integer> a = oVar.f590d.a();
        this.r = a;
        a.a.add(this);
        bVar.d(a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: c.b.a.g0.c<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.b.a.c0.f, c.b.a.a0.b.a
    public <T> void f(T t, c<T> cVar) {
        super.f(t, cVar);
        if (t == c.b.a.r.b) {
            a<Integer, Integer> aVar = this.r;
            c<A> cVar2 = aVar.e;
            aVar.e = cVar;
        } else if (t == c.b.a.r.E) {
            a<ColorFilter, ColorFilter> aVar2 = this.s;
            if (aVar2 != null) {
                this.o.u.remove(aVar2);
            }
            if (cVar == 0) {
                this.s = null;
                return;
            }
            p pVar = new p(cVar, null);
            this.s = pVar;
            pVar.a.add(this);
            this.o.d(this.r);
        }
    }

    @Override // c.b.a.a0.b.e, c.b.a.a0.b.a
    public void g(Canvas canvas, Matrix matrix, int i2) {
        if (!this.q) {
            Paint paint = this.f420i;
            c.b.a.a0.c.b bVar = (c.b.a.a0.c.b) this.r;
            paint.setColor(bVar.k(bVar.a(), bVar.c()));
            a<ColorFilter, ColorFilter> aVar = this.s;
            if (aVar != null) {
                this.f420i.setColorFilter(aVar.e());
            }
            super.g(canvas, matrix, i2);
        }
    }

    @Override // c.b.a.a0.b.c
    public String i() {
        return this.p;
    }
}
