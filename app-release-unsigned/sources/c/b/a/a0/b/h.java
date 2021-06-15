package c.b.a.a0.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import c.b.a.a0.c.a;
import c.b.a.a0.c.p;
import c.b.a.c0.k.c;
import c.b.a.c0.k.d;
import c.b.a.c0.l.b;
import c.b.a.f0.f;
import c.b.a.m;
import c.b.a.r;
import g.e.e;
import java.util.ArrayList;
import java.util.List;

public class h implements e, a.b, k {
    public final String a;
    public final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final b f445c;

    /* renamed from: d  reason: collision with root package name */
    public final e<LinearGradient> f446d = new e<>(10);
    public final e<RadialGradient> e = new e<>(10);

    /* renamed from: f  reason: collision with root package name */
    public final Path f447f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f448g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f449h;

    /* renamed from: i  reason: collision with root package name */
    public final List<m> f450i;

    /* renamed from: j  reason: collision with root package name */
    public final int f451j;

    /* renamed from: k  reason: collision with root package name */
    public final a<c, c> f452k;

    /* renamed from: l  reason: collision with root package name */
    public final a<Integer, Integer> f453l;

    /* renamed from: m  reason: collision with root package name */
    public final a<PointF, PointF> f454m;
    public final a<PointF, PointF> n;
    public a<ColorFilter, ColorFilter> o;
    public p p;
    public final m q;
    public final int r;

    public h(m mVar, b bVar, d dVar) {
        Path path = new Path();
        this.f447f = path;
        this.f448g = new c.b.a.a0.a(1);
        this.f449h = new RectF();
        this.f450i = new ArrayList();
        this.f445c = bVar;
        this.a = dVar.f551g;
        this.b = dVar.f552h;
        this.q = mVar;
        this.f451j = dVar.a;
        path.setFillType(dVar.b);
        this.r = (int) (mVar.f693f.b() / 32.0f);
        a<c, c> a2 = dVar.f548c.a();
        this.f452k = a2;
        a2.a.add(this);
        bVar.d(a2);
        a<Integer, Integer> a3 = dVar.f549d.a();
        this.f453l = a3;
        a3.a.add(this);
        bVar.d(a3);
        a<PointF, PointF> a4 = dVar.e.a();
        this.f454m = a4;
        a4.a.add(this);
        bVar.d(a4);
        a<PointF, PointF> a5 = dVar.f550f.a();
        this.n = a5;
        a5.a.add(this);
        bVar.d(a5);
    }

    @Override // c.b.a.a0.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.f447f.reset();
        for (int i2 = 0; i2 < this.f450i.size(); i2++) {
            this.f447f.addPath(this.f450i.get(i2).h(), matrix);
        }
        this.f447f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // c.b.a.a0.c.a.b
    public void b() {
        this.q.invalidateSelf();
    }

    @Override // c.b.a.a0.b.c
    public void c(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            c cVar = list2.get(i2);
            if (cVar instanceof m) {
                this.f450i.add((m) cVar);
            }
        }
    }

    public final int[] d(int[] iArr) {
        p pVar = this.p;
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

    @Override // c.b.a.c0.f
    public void e(c.b.a.c0.e eVar, int i2, List<c.b.a.c0.e> list, c.b.a.c0.e eVar2) {
        f.f(eVar, i2, list, eVar2, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: c.b.a.g0.c<T> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Integer[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.b.a.c0.f
    public <T> void f(T t, c.b.a.g0.c<T> cVar) {
        b bVar;
        a<?, ?> aVar;
        if (t == r.f707d) {
            a<Integer, Integer> aVar2 = this.f453l;
            c.b.a.g0.c<A> cVar2 = aVar2.e;
            aVar2.e = cVar;
            return;
        }
        if (t == r.E) {
            a<ColorFilter, ColorFilter> aVar3 = this.o;
            if (aVar3 != null) {
                this.f445c.u.remove(aVar3);
            }
            if (cVar == 0) {
                this.o = null;
                return;
            }
            p pVar = new p(cVar, null);
            this.o = pVar;
            pVar.a.add(this);
            bVar = this.f445c;
            aVar = this.o;
        } else if (t == r.F) {
            p pVar2 = this.p;
            if (pVar2 != null) {
                this.f445c.u.remove(pVar2);
            }
            if (cVar == 0) {
                this.p = null;
                return;
            }
            this.f446d.a();
            this.e.a();
            p pVar3 = new p(cVar, null);
            this.p = pVar3;
            pVar3.a.add(this);
            bVar = this.f445c;
            aVar = this.p;
        } else {
            return;
        }
        bVar.d(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v19, resolved type: g.e.e<android.graphics.RadialGradient> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.b.a.a0.b.e
    public void g(Canvas canvas, Matrix matrix, int i2) {
        RadialGradient radialGradient;
        if (!this.b) {
            this.f447f.reset();
            for (int i3 = 0; i3 < this.f450i.size(); i3++) {
                this.f447f.addPath(this.f450i.get(i3).h(), matrix);
            }
            this.f447f.computeBounds(this.f449h, false);
            if (this.f451j == 1) {
                long j2 = (long) j();
                radialGradient = this.f446d.g(j2);
                if (radialGradient == null) {
                    PointF e2 = this.f454m.e();
                    PointF e3 = this.n.e();
                    c e4 = this.f452k.e();
                    LinearGradient linearGradient = new LinearGradient(e2.x, e2.y, e3.x, e3.y, d(e4.b), e4.a, Shader.TileMode.CLAMP);
                    this.f446d.j(j2, linearGradient);
                    radialGradient = linearGradient;
                }
            } else {
                long j3 = (long) j();
                radialGradient = this.e.g(j3);
                if (radialGradient == null) {
                    PointF e5 = this.f454m.e();
                    PointF e6 = this.n.e();
                    c e7 = this.f452k.e();
                    int[] d2 = d(e7.b);
                    float[] fArr = e7.a;
                    float f2 = e5.x;
                    float f3 = e5.y;
                    float hypot = (float) Math.hypot((double) (e6.x - f2), (double) (e6.y - f3));
                    if (hypot <= 0.0f) {
                        hypot = 0.001f;
                    }
                    radialGradient = new RadialGradient(f2, f3, hypot, d2, fArr, Shader.TileMode.CLAMP);
                    this.e.j(j3, radialGradient);
                }
            }
            radialGradient.setLocalMatrix(matrix);
            this.f448g.setShader(radialGradient);
            a<ColorFilter, ColorFilter> aVar = this.o;
            if (aVar != null) {
                this.f448g.setColorFilter(aVar.e());
            }
            this.f448g.setAlpha(f.c((int) ((((((float) i2) / 255.0f) * ((float) this.f453l.e().intValue())) / 100.0f) * 255.0f), 0, 255));
            canvas.drawPath(this.f447f, this.f448g);
            c.b.a.d.a("GradientFillContent#draw");
        }
    }

    @Override // c.b.a.a0.b.c
    public String i() {
        return this.a;
    }

    public final int j() {
        int round = Math.round(this.f454m.f488d * ((float) this.r));
        int round2 = Math.round(this.n.f488d * ((float) this.r));
        int round3 = Math.round(this.f452k.f488d * ((float) this.r));
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
