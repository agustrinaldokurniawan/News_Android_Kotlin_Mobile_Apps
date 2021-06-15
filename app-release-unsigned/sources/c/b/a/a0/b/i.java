package c.b.a.a0.b;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import c.b.a.a0.c.a;
import c.b.a.a0.c.p;
import c.b.a.c0.k.c;
import c.b.a.c0.l.b;
import c.b.a.m;
import c.b.a.r;
import g.e.e;
import g.f.c.g;

public class i extends a {
    public final String o;
    public final boolean p;
    public final e<LinearGradient> q = new e<>(10);
    public final e<RadialGradient> r = new e<>(10);
    public final RectF s = new RectF();
    public final int t;
    public final int u;
    public final a<c, c> v;
    public final a<PointF, PointF> w;
    public final a<PointF, PointF> x;
    public p y;

    public i(m mVar, b bVar, c.b.a.c0.k.e eVar) {
        super(mVar, bVar, g.h(eVar.f557h), g.i(eVar.f558i), eVar.f559j, eVar.f554d, eVar.f556g, eVar.f560k, eVar.f561l);
        this.o = eVar.a;
        this.t = eVar.b;
        this.p = eVar.f562m;
        this.u = (int) (mVar.f693f.b() / 32.0f);
        a<c, c> a = eVar.f553c.a();
        this.v = a;
        a.a.add(this);
        bVar.d(a);
        a<PointF, PointF> a2 = eVar.e.a();
        this.w = a2;
        a2.a.add(this);
        bVar.d(a2);
        a<PointF, PointF> a3 = eVar.f555f.a();
        this.x = a3;
        a3.a.add(this);
        bVar.d(a3);
    }

    public final int[] d(int[] iArr) {
        p pVar = this.y;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.e();
            int i2 = 0;
            if (iArr.length == numArr.length) {
                while (i2 < iArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i2 < numArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            }
        }
        return iArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.lang.Integer[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.b.a.c0.f, c.b.a.a0.b.a
    public <T> void f(T t2, c.b.a.g0.c<T> cVar) {
        super.f(t2, cVar);
        if (t2 == r.F) {
            p pVar = this.y;
            if (pVar != null) {
                this.f417f.u.remove(pVar);
            }
            if (cVar == null) {
                this.y = null;
                return;
            }
            p pVar2 = new p(cVar, null);
            this.y = pVar2;
            pVar2.a.add(this);
            this.f417f.d(this.y);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: g.e.e<android.graphics.RadialGradient> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v14, resolved type: g.e.e<android.graphics.LinearGradient> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.b.a.a0.b.e, c.b.a.a0.b.a
    public void g(Canvas canvas, Matrix matrix, int i2) {
        RadialGradient radialGradient;
        if (!this.p) {
            a(this.s, matrix, false);
            if (this.t == 1) {
                long j2 = (long) j();
                radialGradient = this.q.g(j2);
                if (radialGradient == null) {
                    PointF e = this.w.e();
                    PointF e2 = this.x.e();
                    c e3 = this.v.e();
                    radialGradient = new LinearGradient(e.x, e.y, e2.x, e2.y, d(e3.b), e3.a, Shader.TileMode.CLAMP);
                    this.q.j(j2, radialGradient);
                }
            } else {
                long j3 = (long) j();
                radialGradient = this.r.g(j3);
                if (radialGradient == null) {
                    PointF e4 = this.w.e();
                    PointF e5 = this.x.e();
                    c e6 = this.v.e();
                    int[] d2 = d(e6.b);
                    float[] fArr = e6.a;
                    float f2 = e4.x;
                    float f3 = e4.y;
                    radialGradient = new RadialGradient(f2, f3, (float) Math.hypot((double) (e5.x - f2), (double) (e5.y - f3)), d2, fArr, Shader.TileMode.CLAMP);
                    this.r.j(j3, radialGradient);
                }
            }
            radialGradient.setLocalMatrix(matrix);
            this.f420i.setShader(radialGradient);
            super.g(canvas, matrix, i2);
        }
    }

    @Override // c.b.a.a0.b.c
    public String i() {
        return this.o;
    }

    public final int j() {
        int round = Math.round(this.w.f488d * ((float) this.u));
        int round2 = Math.round(this.x.f488d * ((float) this.u));
        int round3 = Math.round(this.v.f488d * ((float) this.u));
        int i2 = 17;
        if (round != 0) {
            i2 = 527 * round;
        }
        if (round2 != 0) {
            i2 = i2 * 31 * round2;
        }
        return round3 != 0 ? i2 * 31 * round3 : i2;
    }
}
