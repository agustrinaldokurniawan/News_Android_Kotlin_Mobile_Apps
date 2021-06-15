package c.b.a.e0;

import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import c.b.a.e0.h0.c;
import c.b.a.f0.f;
import c.b.a.f0.g;
import c.b.a.g0.a;
import c.d.a.l.e;
import g.e.i;
import java.lang.ref.WeakReference;

public class p {
    public static final Interpolator a = new LinearInterpolator();
    public static i<WeakReference<Interpolator>> b;

    /* renamed from: c  reason: collision with root package name */
    public static c.a f648c = c.a.a("t", "s", e.a, "o", "i", "h", "to", "ti");

    /* renamed from: d  reason: collision with root package name */
    public static c.a f649d = c.a.a("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        Interpolator interpolator;
        WeakReference<Interpolator> h2;
        pointF.x = f.b(pointF.x, -1.0f, 1.0f);
        pointF.y = f.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = f.b(pointF2.x, -1.0f, 1.0f);
        float b2 = f.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b2;
        float f2 = pointF.x;
        float f3 = pointF.y;
        float f4 = pointF2.x;
        ThreadLocal<PathMeasure> threadLocal = g.a;
        int i2 = f2 != 0.0f ? (int) (((float) 527) * f2) : 17;
        if (f3 != 0.0f) {
            i2 = (int) (((float) (i2 * 31)) * f3);
        }
        if (f4 != 0.0f) {
            i2 = (int) (((float) (i2 * 31)) * f4);
        }
        if (b2 != 0.0f) {
            i2 = (int) (((float) (i2 * 31)) * b2);
        }
        synchronized (p.class) {
            if (b == null) {
                b = new i<>();
            }
            interpolator = null;
            h2 = b.h(i2, null);
        }
        if (h2 != null) {
            interpolator = h2.get();
        }
        if (h2 == null || interpolator == null) {
            try {
                interpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    interpolator = new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    interpolator = new LinearInterpolator();
                }
            }
            try {
                WeakReference<Interpolator> weakReference = new WeakReference<>(interpolator);
                synchronized (p.class) {
                    b.j(i2, weakReference);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    public static <T> a<T> b(c cVar, c.b.a.g gVar, float f2, g0<T> g0Var, boolean z, boolean z2) {
        Interpolator interpolator;
        T t;
        Interpolator interpolator2;
        Interpolator interpolator3;
        T t2;
        Interpolator interpolator4;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        T t3;
        T t4;
        PointF pointF4;
        if (z && z2) {
            c.b bVar = c.b.BEGIN_OBJECT;
            c.b bVar2 = c.b.NUMBER;
            cVar.c();
            PointF pointF5 = null;
            PointF pointF6 = null;
            PointF pointF7 = null;
            PointF pointF8 = null;
            boolean z3 = false;
            PointF pointF9 = null;
            PointF pointF10 = null;
            PointF pointF11 = null;
            T t5 = null;
            PointF pointF12 = null;
            T t6 = null;
            float f3 = 0.0f;
            while (cVar.K()) {
                switch (cVar.h0(f648c)) {
                    case 0:
                        pointF2 = pointF7;
                        pointF = pointF8;
                        pointF3 = pointF11;
                        t5 = t5;
                        f3 = (float) cVar.V();
                        pointF11 = pointF3;
                        break;
                    case 1:
                        pointF2 = pointF7;
                        pointF = pointF8;
                        t5 = g0Var.a(cVar, f2);
                        break;
                    case 2:
                        pointF2 = pointF7;
                        pointF = pointF8;
                        t6 = g0Var.a(cVar, f2);
                        break;
                    case 3:
                        pointF2 = pointF7;
                        pointF = pointF8;
                        pointF3 = pointF11;
                        if (cVar.f0() != bVar) {
                            pointF9 = o.b(cVar, f2);
                            t5 = t5;
                            pointF11 = pointF3;
                            break;
                        } else {
                            cVar.c();
                            float f4 = 0.0f;
                            float f5 = 0.0f;
                            float f6 = 0.0f;
                            float f7 = 0.0f;
                            while (cVar.K()) {
                                int h0 = cVar.h0(f649d);
                                if (h0 != 0) {
                                    if (h0 != 1) {
                                        cVar.j0();
                                    } else if (cVar.f0() == bVar2) {
                                        f5 = (float) cVar.V();
                                        f7 = f5;
                                    } else {
                                        cVar.b();
                                        f5 = (float) cVar.V();
                                        f7 = cVar.f0() == bVar2 ? (float) cVar.V() : f5;
                                    }
                                } else if (cVar.f0() == bVar2) {
                                    f4 = (float) cVar.V();
                                    f6 = f4;
                                } else {
                                    cVar.b();
                                    f4 = (float) cVar.V();
                                    f6 = cVar.f0() == bVar2 ? (float) cVar.V() : f4;
                                }
                                cVar.e();
                            }
                            pointF12 = new PointF(f4, f5);
                            PointF pointF13 = new PointF(f6, f7);
                            cVar.n();
                            t5 = t5;
                            pointF11 = pointF13;
                            break;
                        }
                    case 4:
                        if (cVar.f0() == bVar) {
                            cVar.c();
                            pointF = pointF8;
                            float f8 = 0.0f;
                            float f9 = 0.0f;
                            float f10 = 0.0f;
                            float f11 = 0.0f;
                            while (cVar.K()) {
                                int h02 = cVar.h0(f649d);
                                if (h02 != 0) {
                                    t4 = t5;
                                    if (h02 != 1) {
                                        cVar.j0();
                                        pointF4 = pointF11;
                                    } else {
                                        pointF4 = pointF11;
                                        if (cVar.f0() == bVar2) {
                                            f9 = (float) cVar.V();
                                            f11 = f9;
                                        } else {
                                            cVar.b();
                                            f9 = (float) cVar.V();
                                            f11 = cVar.f0() == bVar2 ? (float) cVar.V() : f9;
                                        }
                                    }
                                    t5 = t4;
                                    pointF11 = pointF4;
                                    pointF7 = pointF7;
                                } else {
                                    pointF4 = pointF11;
                                    t4 = t5;
                                    if (cVar.f0() == bVar2) {
                                        f8 = (float) cVar.V();
                                        f10 = f8;
                                        t5 = t4;
                                        pointF11 = pointF4;
                                        pointF7 = pointF7;
                                    } else {
                                        cVar.b();
                                        f8 = (float) cVar.V();
                                        f10 = cVar.f0() == bVar2 ? (float) cVar.V() : f8;
                                    }
                                }
                                cVar.e();
                                t5 = t4;
                                pointF11 = pointF4;
                                pointF7 = pointF7;
                            }
                            pointF2 = pointF7;
                            pointF3 = pointF11;
                            PointF pointF14 = new PointF(f8, f9);
                            PointF pointF15 = new PointF(f10, f11);
                            cVar.n();
                            pointF6 = pointF15;
                            pointF5 = pointF14;
                            pointF11 = pointF3;
                            break;
                        } else {
                            pointF2 = pointF7;
                            pointF = pointF8;
                            pointF3 = pointF11;
                            t3 = t5;
                            pointF10 = o.b(cVar, f2);
                            t5 = t3;
                            pointF11 = pointF3;
                        }
                    case 5:
                        if (cVar.b0() == 1) {
                            z3 = true;
                            pointF2 = pointF7;
                            pointF = pointF8;
                            pointF3 = pointF11;
                            t3 = t5;
                            t5 = t3;
                            pointF11 = pointF3;
                            break;
                        } else {
                            pointF2 = pointF7;
                            pointF = pointF8;
                            pointF3 = pointF11;
                            t3 = t5;
                            z3 = false;
                            t5 = t3;
                            pointF11 = pointF3;
                        }
                    case 6:
                        pointF7 = o.b(cVar, f2);
                        pointF2 = pointF7;
                        pointF = pointF8;
                        pointF3 = pointF11;
                        t3 = t5;
                        t5 = t3;
                        pointF11 = pointF3;
                        break;
                    case 7:
                        pointF8 = o.b(cVar, f2);
                        continue;
                    default:
                        pointF2 = pointF7;
                        pointF = pointF8;
                        cVar.j0();
                        break;
                }
                pointF7 = pointF2;
                pointF8 = pointF;
            }
            cVar.n();
            if (z3) {
                interpolator4 = a;
                t6 = t5;
            } else if (pointF9 != null && pointF10 != null) {
                interpolator4 = a(pointF9, pointF10);
            } else if (pointF12 == null || pointF11 == null || pointF5 == null || pointF6 == null) {
                interpolator4 = a;
            } else {
                Interpolator a2 = a(pointF12, pointF5);
                interpolator2 = a(pointF11, pointF6);
                t2 = t6;
                interpolator3 = a2;
                interpolator4 = null;
                a<T> aVar = (interpolator3 != null || interpolator2 == null) ? new a<>(gVar, t5, t2, interpolator4, f3, null) : new a<>(gVar, t5, t2, interpolator3, interpolator2, f3, null);
                aVar.o = pointF7;
                aVar.p = pointF8;
                return aVar;
            }
            t2 = t6;
            interpolator3 = null;
            interpolator2 = null;
            if (interpolator3 != null) {
            }
            aVar.o = pointF7;
            aVar.p = pointF8;
            return aVar;
        } else if (!z) {
            return new a<>(g0Var.a(cVar, f2));
        } else {
            cVar.c();
            PointF pointF16 = null;
            PointF pointF17 = null;
            PointF pointF18 = null;
            PointF pointF19 = null;
            T t7 = null;
            boolean z4 = false;
            float f12 = 0.0f;
            T t8 = null;
            while (cVar.K()) {
                switch (cVar.h0(f648c)) {
                    case 0:
                        f12 = (float) cVar.V();
                        break;
                    case 1:
                        t7 = g0Var.a(cVar, f2);
                        break;
                    case 2:
                        t8 = g0Var.a(cVar, f2);
                        break;
                    case 3:
                        pointF19 = o.b(cVar, 1.0f);
                        break;
                    case 4:
                        pointF16 = o.b(cVar, 1.0f);
                        break;
                    case 5:
                        if (cVar.b0() != 1) {
                            z4 = false;
                            break;
                        } else {
                            z4 = true;
                            break;
                        }
                    case 6:
                        pointF17 = o.b(cVar, f2);
                        break;
                    case 7:
                        pointF18 = o.b(cVar, f2);
                        break;
                    default:
                        cVar.j0();
                        break;
                }
            }
            cVar.n();
            if (z4) {
                interpolator = a;
                t = t7;
            } else {
                interpolator = (pointF19 == null || pointF16 == null) ? a : a(pointF19, pointF16);
                t = t8;
            }
            a<T> aVar2 = new a<>(gVar, t7, t, interpolator, f12, null);
            aVar2.o = pointF17;
            aVar2.p = pointF18;
            return aVar2;
        }
    }
}
