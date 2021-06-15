package c.b.a.a0.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import c.b.a.a0.c.a;
import c.b.a.a0.c.c;
import c.b.a.a0.c.p;
import c.b.a.c0.e;
import c.b.a.c0.j.d;
import c.b.a.f0.f;
import c.b.a.f0.g;
import c.b.a.m;
import c.b.a.r;
import java.util.ArrayList;
import java.util.List;

public abstract class a implements a.b, k, e {
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f415c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f416d = new RectF();
    public final m e;

    /* renamed from: f  reason: collision with root package name */
    public final c.b.a.c0.l.b f417f;

    /* renamed from: g  reason: collision with root package name */
    public final List<b> f418g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f419h;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f420i;

    /* renamed from: j  reason: collision with root package name */
    public final c.b.a.a0.c.a<?, Float> f421j;

    /* renamed from: k  reason: collision with root package name */
    public final c.b.a.a0.c.a<?, Integer> f422k;

    /* renamed from: l  reason: collision with root package name */
    public final List<c.b.a.a0.c.a<?, Float>> f423l;

    /* renamed from: m  reason: collision with root package name */
    public final c.b.a.a0.c.a<?, Float> f424m;
    public c.b.a.a0.c.a<ColorFilter, ColorFilter> n;

    public static final class b {
        public final List<m> a = new ArrayList();
        public final s b;

        public b(s sVar, C0008a aVar) {
            this.b = sVar;
        }
    }

    public a(m mVar, c.b.a.c0.l.b bVar, Paint.Cap cap, Paint.Join join, float f2, d dVar, c.b.a.c0.j.b bVar2, List<c.b.a.c0.j.b> list, c.b.a.c0.j.b bVar3) {
        c.b.a.a0.a aVar = new c.b.a.a0.a(1);
        this.f420i = aVar;
        this.e = mVar;
        this.f417f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f2);
        this.f422k = dVar.a();
        this.f421j = bVar2.a();
        this.f424m = bVar3 == null ? null : bVar3.a();
        this.f423l = new ArrayList(list.size());
        this.f419h = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f423l.add(list.get(i2).a());
        }
        bVar.d(this.f422k);
        bVar.d(this.f421j);
        for (int i3 = 0; i3 < this.f423l.size(); i3++) {
            bVar.d(this.f423l.get(i3));
        }
        c.b.a.a0.c.a<?, Float> aVar2 = this.f424m;
        if (aVar2 != null) {
            bVar.d(aVar2);
        }
        this.f422k.a.add(this);
        this.f421j.a.add(this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f423l.get(i4).a.add(this);
        }
        c.b.a.a0.c.a<?, Float> aVar3 = this.f424m;
        if (aVar3 != null) {
            aVar3.a.add(this);
        }
    }

    @Override // c.b.a.a0.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.b.reset();
        for (int i2 = 0; i2 < this.f418g.size(); i2++) {
            b bVar = this.f418g.get(i2);
            for (int i3 = 0; i3 < bVar.a.size(); i3++) {
                this.b.addPath(bVar.a.get(i3).h(), matrix);
            }
        }
        this.b.computeBounds(this.f416d, false);
        float k2 = ((c) this.f421j).k();
        RectF rectF2 = this.f416d;
        float f2 = k2 / 2.0f;
        rectF2.set(rectF2.left - f2, rectF2.top - f2, rectF2.right + f2, rectF2.bottom + f2);
        rectF.set(this.f416d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        c.b.a.d.a("StrokeContent#getBounds");
    }

    @Override // c.b.a.a0.c.a.b
    public void b() {
        this.e.invalidateSelf();
    }

    @Override // c.b.a.a0.b.c
    public void c(List<c> list, List<c> list2) {
        s sVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof s) {
                s sVar2 = (s) cVar;
                if (sVar2.f484c == 2) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.b.add(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof s) {
                s sVar3 = (s) cVar2;
                if (sVar3.f484c == 2) {
                    if (bVar != null) {
                        this.f418g.add(bVar);
                    }
                    bVar = new b(sVar3, null);
                    sVar3.b.add(this);
                }
            }
            if (cVar2 instanceof m) {
                if (bVar == null) {
                    bVar = new b(sVar, null);
                }
                bVar.a.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.f418g.add(bVar);
        }
    }

    @Override // c.b.a.c0.f
    public void e(e eVar, int i2, List<e> list, e eVar2) {
        f.f(eVar, i2, list, eVar2, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: c.b.a.g0.c<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.b.a.c0.f
    public <T> void f(T t, c.b.a.g0.c<T> cVar) {
        c.b.a.a0.c.a aVar;
        if (t == r.f707d) {
            aVar = this.f422k;
        } else if (t == r.q) {
            aVar = this.f421j;
        } else if (t == r.E) {
            c.b.a.a0.c.a<ColorFilter, ColorFilter> aVar2 = this.n;
            if (aVar2 != null) {
                this.f417f.u.remove(aVar2);
            }
            if (cVar == 0) {
                this.n = null;
                return;
            }
            p pVar = new p(cVar, null);
            this.n = pVar;
            pVar.a.add(this);
            this.f417f.d(this.n);
            return;
        } else {
            return;
        }
        c.b.a.g0.c<A> cVar2 = aVar.e;
        aVar.e = cVar;
    }

    @Override // c.b.a.a0.b.e
    public void g(Canvas canvas, Matrix matrix, int i2) {
        float[] fArr = g.f663d.get();
        boolean z = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            c.b.a.d.a("StrokeContent#draw");
            return;
        }
        c.b.a.a0.c.e eVar = (c.b.a.a0.c.e) this.f422k;
        float k2 = (((float) i2) / 255.0f) * ((float) eVar.k(eVar.a(), eVar.c()));
        float f2 = 100.0f;
        this.f420i.setAlpha(f.c((int) ((k2 / 100.0f) * 255.0f), 0, 255));
        this.f420i.setStrokeWidth(g.d(matrix) * ((c) this.f421j).k());
        if (this.f420i.getStrokeWidth() <= 0.0f) {
            c.b.a.d.a("StrokeContent#draw");
            return;
        }
        float f3 = 1.0f;
        if (!this.f423l.isEmpty()) {
            float d2 = g.d(matrix);
            for (int i3 = 0; i3 < this.f423l.size(); i3++) {
                this.f419h[i3] = this.f423l.get(i3).e().floatValue();
                if (i3 % 2 == 0) {
                    float[] fArr2 = this.f419h;
                    if (fArr2[i3] < 1.0f) {
                        fArr2[i3] = 1.0f;
                    }
                } else {
                    float[] fArr3 = this.f419h;
                    if (fArr3[i3] < 0.1f) {
                        fArr3[i3] = 0.1f;
                    }
                }
                float[] fArr4 = this.f419h;
                fArr4[i3] = fArr4[i3] * d2;
            }
            c.b.a.a0.c.a<?, Float> aVar = this.f424m;
            this.f420i.setPathEffect(new DashPathEffect(this.f419h, aVar == null ? 0.0f : aVar.e().floatValue() * d2));
        }
        c.b.a.d.a("StrokeContent#applyDashPattern");
        c.b.a.a0.c.a<ColorFilter, ColorFilter> aVar2 = this.n;
        if (aVar2 != null) {
            this.f420i.setColorFilter(aVar2.e());
        }
        int i4 = 0;
        while (i4 < this.f418g.size()) {
            b bVar = this.f418g.get(i4);
            s sVar = bVar.b;
            if (sVar != null) {
                if (sVar != null) {
                    this.b.reset();
                    int size = bVar.a.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        this.b.addPath(bVar.a.get(size).h(), matrix);
                    }
                    this.a.setPath(this.b, z);
                    float length = this.a.getLength();
                    while (this.a.nextContour()) {
                        length += this.a.getLength();
                    }
                    float floatValue = (bVar.b.f486f.e().floatValue() * length) / 360.0f;
                    float floatValue2 = ((bVar.b.f485d.e().floatValue() * length) / f2) + floatValue;
                    float floatValue3 = ((bVar.b.e.e().floatValue() * length) / f2) + floatValue;
                    int size2 = bVar.a.size() - 1;
                    float f4 = 0.0f;
                    while (size2 >= 0) {
                        this.f415c.set(bVar.a.get(size2).h());
                        this.f415c.transform(matrix);
                        this.a.setPath(this.f415c, z);
                        float length2 = this.a.getLength();
                        if (floatValue3 > length) {
                            float f5 = floatValue3 - length;
                            if (f5 < f4 + length2 && f4 < f5) {
                                g.a(this.f415c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f5 / length2, f3), 0.0f);
                                canvas.drawPath(this.f415c, this.f420i);
                                f4 += length2;
                                size2--;
                                z = false;
                                f3 = 1.0f;
                            }
                        }
                        float f6 = f4 + length2;
                        if (f6 >= floatValue2 && f4 <= floatValue3) {
                            if (f6 > floatValue3 || floatValue2 >= f4) {
                                g.a(this.f415c, floatValue2 < f4 ? 0.0f : (floatValue2 - f4) / length2, floatValue3 > f6 ? 1.0f : (floatValue3 - f4) / length2, 0.0f);
                            }
                            canvas.drawPath(this.f415c, this.f420i);
                        }
                        f4 += length2;
                        size2--;
                        z = false;
                        f3 = 1.0f;
                    }
                }
                c.b.a.d.a("StrokeContent#applyTrimPath");
            } else {
                this.b.reset();
                for (int size3 = bVar.a.size() - 1; size3 >= 0; size3--) {
                    this.b.addPath(bVar.a.get(size3).h(), matrix);
                }
                c.b.a.d.a("StrokeContent#buildPath");
                canvas.drawPath(this.b, this.f420i);
                c.b.a.d.a("StrokeContent#drawPath");
            }
            i4++;
            z = false;
            f2 = 100.0f;
            f3 = 1.0f;
        }
        c.b.a.d.a("StrokeContent#draw");
    }
}
