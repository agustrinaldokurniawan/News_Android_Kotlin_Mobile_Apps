package c.b.a.a0.c;

import android.graphics.Matrix;
import android.graphics.PointF;
import c.b.a.a0.c.a;
import c.b.a.c0.j.b;
import c.b.a.c0.j.e;
import c.b.a.c0.j.g;
import c.b.a.c0.j.l;
import c.b.a.c0.j.m;
import c.b.a.g0.c;
import c.b.a.g0.d;
import c.b.a.r;
import java.util.Collections;

public class o {
    public final Matrix a = new Matrix();
    public final Matrix b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f509c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f510d;
    public final float[] e;

    /* renamed from: f  reason: collision with root package name */
    public a<PointF, PointF> f511f;

    /* renamed from: g  reason: collision with root package name */
    public a<?, PointF> f512g;

    /* renamed from: h  reason: collision with root package name */
    public a<d, d> f513h;

    /* renamed from: i  reason: collision with root package name */
    public a<Float, Float> f514i;

    /* renamed from: j  reason: collision with root package name */
    public a<Integer, Integer> f515j;

    /* renamed from: k  reason: collision with root package name */
    public c f516k;

    /* renamed from: l  reason: collision with root package name */
    public c f517l;

    /* renamed from: m  reason: collision with root package name */
    public a<?, Float> f518m;
    public a<?, Float> n;

    public o(l lVar) {
        a<PointF, PointF> aVar;
        a<PointF, PointF> aVar2;
        a<d, d> aVar3;
        a<Float, Float> aVar4;
        c cVar;
        c cVar2;
        e eVar = lVar.a;
        if (eVar == null) {
            aVar = null;
        } else {
            aVar = eVar.a();
        }
        this.f511f = aVar;
        m<PointF, PointF> mVar = lVar.b;
        if (mVar == null) {
            aVar2 = null;
        } else {
            aVar2 = mVar.a();
        }
        this.f512g = aVar2;
        g gVar = lVar.f540c;
        if (gVar == null) {
            aVar3 = null;
        } else {
            aVar3 = gVar.a();
        }
        this.f513h = aVar3;
        b bVar = lVar.f541d;
        if (bVar == null) {
            aVar4 = null;
        } else {
            aVar4 = bVar.a();
        }
        this.f514i = aVar4;
        b bVar2 = lVar.f542f;
        if (bVar2 == null) {
            cVar = null;
        } else {
            cVar = (c) bVar2.a();
        }
        this.f516k = cVar;
        if (cVar != null) {
            this.b = new Matrix();
            this.f509c = new Matrix();
            this.f510d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.f509c = null;
            this.f510d = null;
            this.e = null;
        }
        b bVar3 = lVar.f543g;
        if (bVar3 == null) {
            cVar2 = null;
        } else {
            cVar2 = (c) bVar3.a();
        }
        this.f517l = cVar2;
        c.b.a.c0.j.d dVar = lVar.e;
        if (dVar != null) {
            this.f515j = dVar.a();
        }
        b bVar4 = lVar.f544h;
        if (bVar4 != null) {
            this.f518m = bVar4.a();
        } else {
            this.f518m = null;
        }
        b bVar5 = lVar.f545i;
        if (bVar5 != null) {
            this.n = bVar5.a();
        } else {
            this.n = null;
        }
    }

    public void a(c.b.a.c0.l.b bVar) {
        bVar.d(this.f515j);
        bVar.d(this.f518m);
        bVar.d(this.n);
        bVar.d(this.f511f);
        bVar.d(this.f512g);
        bVar.d(this.f513h);
        bVar.d(this.f514i);
        bVar.d(this.f516k);
        bVar.d(this.f517l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f515j;
        if (aVar != null) {
            aVar.a.add(bVar);
        }
        a<?, Float> aVar2 = this.f518m;
        if (aVar2 != null) {
            aVar2.a.add(bVar);
        }
        a<?, Float> aVar3 = this.n;
        if (aVar3 != null) {
            aVar3.a.add(bVar);
        }
        a<PointF, PointF> aVar4 = this.f511f;
        if (aVar4 != null) {
            aVar4.a.add(bVar);
        }
        a<?, PointF> aVar5 = this.f512g;
        if (aVar5 != null) {
            aVar5.a.add(bVar);
        }
        a<d, d> aVar6 = this.f513h;
        if (aVar6 != null) {
            aVar6.a.add(bVar);
        }
        a<Float, Float> aVar7 = this.f514i;
        if (aVar7 != null) {
            aVar7.a.add(bVar);
        }
        c cVar = this.f516k;
        if (cVar != null) {
            cVar.a.add(bVar);
        }
        c cVar2 = this.f517l;
        if (cVar2 != null) {
            cVar2.a.add(bVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: c.b.a.g0.c<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> boolean c(T t, c<T> cVar) {
        c cVar2;
        a aVar;
        c cVar3;
        a<?, Float> aVar2;
        if (t == r.e) {
            aVar = this.f511f;
            if (aVar == null) {
                this.f511f = new p(cVar, new PointF());
                return true;
            }
        } else if (t == r.f708f) {
            aVar = this.f512g;
            if (aVar == null) {
                this.f512g = new p(cVar, new PointF());
                return true;
            }
        } else {
            if (t == r.f709g) {
                a<?, PointF> aVar3 = this.f512g;
                if (aVar3 instanceof m) {
                    m mVar = (m) aVar3;
                    c<Float> cVar4 = mVar.f508m;
                    mVar.f508m = cVar;
                    return true;
                }
            }
            if (t == r.f710h) {
                a<?, PointF> aVar4 = this.f512g;
                if (aVar4 instanceof m) {
                    m mVar2 = (m) aVar4;
                    c<Float> cVar5 = mVar2.n;
                    mVar2.n = cVar;
                    return true;
                }
            }
            if (t == r.f715m) {
                aVar = this.f513h;
                if (aVar == null) {
                    this.f513h = new p(cVar, new d());
                    return true;
                }
            } else if (t == r.n) {
                aVar = this.f514i;
                if (aVar == null) {
                    this.f514i = new p(cVar, Float.valueOf(0.0f));
                    return true;
                }
            } else if (t == r.f706c) {
                aVar = this.f515j;
                if (aVar == null) {
                    this.f515j = new p(cVar, 100);
                    return true;
                }
            } else {
                if (t != r.A || (aVar2 = this.f518m) == null) {
                    if (t != r.B || (aVar2 = this.n) == null) {
                        if (t == r.o && (cVar3 = this.f516k) != null) {
                            if (cVar3 == null) {
                                this.f516k = new c(Collections.singletonList(new c.b.a.g0.a(Float.valueOf(0.0f))));
                            }
                            aVar = this.f516k;
                        } else if (t != r.p || (cVar2 = this.f517l) == null) {
                            return false;
                        } else {
                            if (cVar2 == null) {
                                this.f517l = new c(Collections.singletonList(new c.b.a.g0.a(Float.valueOf(0.0f))));
                            }
                            aVar = this.f517l;
                        }
                    } else if (aVar2 == null) {
                        this.n = new p(cVar, 100);
                        return true;
                    }
                } else if (aVar2 == null) {
                    this.f518m = new p(cVar, 100);
                    return true;
                }
                c<A> cVar6 = aVar2.e;
                aVar2.e = cVar;
                return true;
            }
        }
        c<A> cVar7 = aVar.e;
        aVar.e = cVar;
        return true;
    }

    public final void d() {
        for (int i2 = 0; i2 < 9; i2++) {
            this.e[i2] = 0.0f;
        }
    }

    public Matrix e() {
        this.a.reset();
        a<?, PointF> aVar = this.f512g;
        if (aVar != null) {
            PointF e2 = aVar.e();
            float f2 = e2.x;
            if (!(f2 == 0.0f && e2.y == 0.0f)) {
                this.a.preTranslate(f2, e2.y);
            }
        }
        a<Float, Float> aVar2 = this.f514i;
        if (aVar2 != null) {
            float floatValue = aVar2 instanceof p ? aVar2.e().floatValue() : ((c) aVar2).k();
            if (floatValue != 0.0f) {
                this.a.preRotate(floatValue);
            }
        }
        if (this.f516k != null) {
            c cVar = this.f517l;
            float cos = cVar == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-cVar.k()) + 90.0f)));
            c cVar2 = this.f517l;
            float sin = cVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-cVar2.k()) + 90.0f)));
            d();
            float[] fArr = this.e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f3 = -sin;
            fArr[3] = f3;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.b.setValues(fArr);
            d();
            float[] fArr2 = this.e;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) Math.tan(Math.toRadians((double) this.f516k.k()));
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f509c.setValues(fArr2);
            d();
            float[] fArr3 = this.e;
            fArr3[0] = cos;
            fArr3[1] = f3;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f510d.setValues(fArr3);
            this.f509c.preConcat(this.b);
            this.f510d.preConcat(this.f509c);
            this.a.preConcat(this.f510d);
        }
        a<d, d> aVar3 = this.f513h;
        if (aVar3 != null) {
            d e3 = aVar3.e();
            float f4 = e3.a;
            if (!(f4 == 1.0f && e3.b == 1.0f)) {
                this.a.preScale(f4, e3.b);
            }
        }
        a<PointF, PointF> aVar4 = this.f511f;
        if (aVar4 != null) {
            PointF e4 = aVar4.e();
            float f5 = e4.x;
            if (!(f5 == 0.0f && e4.y == 0.0f)) {
                this.a.preTranslate(-f5, -e4.y);
            }
        }
        return this.a;
    }

    public Matrix f(float f2) {
        a<?, PointF> aVar = this.f512g;
        PointF pointF = null;
        PointF e2 = aVar == null ? null : aVar.e();
        a<d, d> aVar2 = this.f513h;
        d e3 = aVar2 == null ? null : aVar2.e();
        this.a.reset();
        if (e2 != null) {
            this.a.preTranslate(e2.x * f2, e2.y * f2);
        }
        if (e3 != null) {
            double d2 = (double) f2;
            this.a.preScale((float) Math.pow((double) e3.a, d2), (float) Math.pow((double) e3.b, d2));
        }
        a<Float, Float> aVar3 = this.f514i;
        if (aVar3 != null) {
            float floatValue = aVar3.e().floatValue();
            a<PointF, PointF> aVar4 = this.f511f;
            if (aVar4 != null) {
                pointF = aVar4.e();
            }
            Matrix matrix = this.a;
            float f3 = floatValue * f2;
            float f4 = 0.0f;
            float f5 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f4 = pointF.y;
            }
            matrix.preRotate(f3, f5, f4);
        }
        return this.a;
    }
}
