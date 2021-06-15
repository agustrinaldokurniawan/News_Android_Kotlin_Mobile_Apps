package c.b.a.a0.b;

import android.graphics.Path;
import android.graphics.PointF;
import c.b.a.a0.c.a;
import c.b.a.c0.e;
import c.b.a.c0.k.h;
import c.b.a.c0.l.b;
import c.b.a.f0.f;
import c.b.a.g0.c;
import c.b.a.m;
import c.b.a.r;
import g.f.c.g;
import java.util.List;

public class n implements m, a.b, k {
    public final Path a = new Path();
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public final m f457c;

    /* renamed from: d  reason: collision with root package name */
    public final int f458d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final a<?, Float> f459f;

    /* renamed from: g  reason: collision with root package name */
    public final a<?, PointF> f460g;

    /* renamed from: h  reason: collision with root package name */
    public final a<?, Float> f461h;

    /* renamed from: i  reason: collision with root package name */
    public final a<?, Float> f462i;

    /* renamed from: j  reason: collision with root package name */
    public final a<?, Float> f463j;

    /* renamed from: k  reason: collision with root package name */
    public final a<?, Float> f464k;

    /* renamed from: l  reason: collision with root package name */
    public final a<?, Float> f465l;

    /* renamed from: m  reason: collision with root package name */
    public b f466m = new b();
    public boolean n;

    public n(m mVar, b bVar, h hVar) {
        a<Float, Float> aVar;
        this.f457c = mVar;
        this.b = hVar.a;
        int i2 = hVar.b;
        this.f458d = i2;
        this.e = hVar.f577j;
        a<Float, Float> a2 = hVar.f571c.a();
        this.f459f = a2;
        a<PointF, PointF> a3 = hVar.f572d.a();
        this.f460g = a3;
        a<Float, Float> a4 = hVar.e.a();
        this.f461h = a4;
        a<Float, Float> a5 = hVar.f574g.a();
        this.f463j = a5;
        a<Float, Float> a6 = hVar.f576i.a();
        this.f465l = a6;
        if (i2 == 1) {
            this.f462i = hVar.f573f.a();
            aVar = hVar.f575h.a();
        } else {
            aVar = null;
            this.f462i = null;
        }
        this.f464k = aVar;
        bVar.d(a2);
        bVar.d(a3);
        bVar.d(a4);
        bVar.d(a5);
        bVar.d(a6);
        if (i2 == 1) {
            bVar.d(this.f462i);
            bVar.d(aVar);
        }
        a2.a.add(this);
        a3.a.add(this);
        a4.a.add(this);
        a5.a.add(this);
        a6.a.add(this);
        if (i2 == 1) {
            this.f462i.a.add(this);
            aVar.a.add(this);
        }
    }

    @Override // c.b.a.a0.c.a.b
    public void b() {
        this.n = false;
        this.f457c.invalidateSelf();
    }

    @Override // c.b.a.a0.b.c
    public void c(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            c cVar = list.get(i2);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.f484c == 1) {
                    this.f466m.a.add(sVar);
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
        a<?, Float> aVar2;
        if (t == r.u) {
            aVar = this.f459f;
        } else if (t == r.v) {
            aVar = this.f461h;
        } else if (t == r.f714l) {
            aVar = this.f460g;
        } else {
            if (t != r.w || (aVar2 = this.f462i) == null) {
                if (t == r.x) {
                    aVar = this.f463j;
                } else if (t != r.y || (aVar2 = this.f464k) == null) {
                    if (t == r.z) {
                        aVar = this.f465l;
                    } else {
                        return;
                    }
                }
            }
            c<A> cVar2 = aVar2.e;
            aVar2.e = cVar;
            return;
        }
        c<A> cVar3 = aVar.e;
        aVar.e = cVar;
    }

    @Override // c.b.a.a0.b.m
    public Path h() {
        float f2;
        float f3;
        float f4;
        float f5;
        double d2;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        double d3;
        float f11;
        float f12;
        double d4;
        double d5;
        double d6;
        if (this.n) {
            return this.a;
        }
        this.a.reset();
        if (this.e) {
            this.n = true;
        } else {
            int f13 = g.f(this.f458d);
            double d7 = 0.0d;
            if (f13 == 0) {
                float floatValue = this.f459f.e().floatValue();
                a<?, Float> aVar = this.f461h;
                if (aVar != null) {
                    d7 = (double) aVar.e().floatValue();
                }
                double radians = Math.toRadians(d7 - 90.0d);
                double d8 = (double) floatValue;
                float f14 = (float) (6.283185307179586d / d8);
                float f15 = f14 / 2.0f;
                float f16 = floatValue - ((float) ((int) floatValue));
                int i2 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
                if (i2 != 0) {
                    radians += (double) ((1.0f - f16) * f15);
                }
                float floatValue2 = this.f463j.e().floatValue();
                float floatValue3 = this.f462i.e().floatValue();
                a<?, Float> aVar2 = this.f464k;
                float floatValue4 = aVar2 != null ? aVar2.e().floatValue() / 100.0f : 0.0f;
                a<?, Float> aVar3 = this.f465l;
                float floatValue5 = aVar3 != null ? aVar3.e().floatValue() / 100.0f : 0.0f;
                if (i2 != 0) {
                    f6 = c.c.a.a.a.a(floatValue2, floatValue3, f16, floatValue3);
                    double d9 = (double) f6;
                    f3 = floatValue3;
                    f2 = floatValue4;
                    f5 = (float) (Math.cos(radians) * d9);
                    f4 = (float) (d9 * Math.sin(radians));
                    this.a.moveTo(f5, f4);
                    d2 = radians + ((double) ((f14 * f16) / 2.0f));
                } else {
                    f3 = floatValue3;
                    f2 = floatValue4;
                    double d10 = (double) floatValue2;
                    float cos = (float) (Math.cos(radians) * d10);
                    f4 = (float) (Math.sin(radians) * d10);
                    this.a.moveTo(cos, f4);
                    d2 = radians + ((double) f15);
                    f5 = cos;
                    f6 = 0.0f;
                }
                double ceil = Math.ceil(d8) * 2.0d;
                int i3 = 0;
                boolean z = false;
                while (true) {
                    double d11 = (double) i3;
                    if (d11 >= ceil) {
                        break;
                    }
                    float f17 = z ? floatValue2 : f3;
                    int i4 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
                    if (i4 == 0 || d11 != ceil - 2.0d) {
                        f7 = f14;
                        f8 = f15;
                    } else {
                        f7 = f14;
                        f8 = (f14 * f16) / 2.0f;
                    }
                    if (i4 == 0 || d11 != ceil - 1.0d) {
                        f9 = f6;
                        f6 = f17;
                        f10 = f8;
                    } else {
                        f10 = f8;
                        f9 = f6;
                    }
                    double d12 = (double) f6;
                    float cos2 = (float) (Math.cos(d2) * d12);
                    float sin = (float) (d12 * Math.sin(d2));
                    if (f2 == 0.0f && floatValue5 == 0.0f) {
                        this.a.lineTo(cos2, sin);
                        f11 = sin;
                        d3 = d2;
                        f12 = floatValue5;
                    } else {
                        d3 = d2;
                        double atan2 = (double) ((float) (Math.atan2((double) f4, (double) f5) - 1.5707963267948966d));
                        float cos3 = (float) Math.cos(atan2);
                        float sin2 = (float) Math.sin(atan2);
                        f11 = sin;
                        f12 = floatValue5;
                        double atan22 = (double) ((float) (Math.atan2((double) sin, (double) cos2) - 1.5707963267948966d));
                        float cos4 = (float) Math.cos(atan22);
                        float sin3 = (float) Math.sin(atan22);
                        float f18 = z ? f2 : f12;
                        float f19 = z ? f12 : f2;
                        float f20 = (z ? f3 : floatValue2) * f18 * 0.47829f;
                        float f21 = cos3 * f20;
                        float f22 = f20 * sin2;
                        float f23 = (z ? floatValue2 : f3) * f19 * 0.47829f;
                        float f24 = cos4 * f23;
                        float f25 = f23 * sin3;
                        if (i2 != 0) {
                            if (i3 == 0) {
                                f21 *= f16;
                                f22 *= f16;
                            } else if (d11 == ceil - 1.0d) {
                                f24 *= f16;
                                f25 *= f16;
                            }
                        }
                        this.a.cubicTo(f5 - f21, f4 - f22, cos2 + f24, f11 + f25, cos2, f11);
                    }
                    d2 = d3 + ((double) f10);
                    z = !z;
                    i3++;
                    f5 = cos2;
                    f6 = f9;
                    f14 = f7;
                    f4 = f11;
                    floatValue5 = f12;
                }
                PointF e2 = this.f460g.e();
                this.a.offset(e2.x, e2.y);
                this.a.close();
            } else if (f13 == 1) {
                int floor = (int) Math.floor((double) this.f459f.e().floatValue());
                a<?, Float> aVar4 = this.f461h;
                if (aVar4 != null) {
                    d7 = (double) aVar4.e().floatValue();
                }
                double radians2 = Math.toRadians(d7 - 90.0d);
                double d13 = (double) floor;
                float floatValue6 = this.f465l.e().floatValue() / 100.0f;
                float floatValue7 = this.f463j.e().floatValue();
                double d14 = (double) floatValue7;
                float cos5 = (float) (Math.cos(radians2) * d14);
                float sin4 = (float) (Math.sin(radians2) * d14);
                this.a.moveTo(cos5, sin4);
                double d15 = (double) ((float) (6.283185307179586d / d13));
                double d16 = radians2 + d15;
                double ceil2 = Math.ceil(d13);
                int i5 = 0;
                while (((double) i5) < ceil2) {
                    float cos6 = (float) (Math.cos(d16) * d14);
                    float sin5 = (float) (Math.sin(d16) * d14);
                    if (floatValue6 != 0.0f) {
                        d6 = d14;
                        d5 = d16;
                        double atan23 = (double) ((float) (Math.atan2((double) sin4, (double) cos5) - 1.5707963267948966d));
                        float cos7 = (float) Math.cos(atan23);
                        d4 = d15;
                        double atan24 = (double) ((float) (Math.atan2((double) sin5, (double) cos6) - 1.5707963267948966d));
                        float f26 = floatValue7 * floatValue6 * 0.25f;
                        this.a.cubicTo(cos5 - (cos7 * f26), sin4 - (((float) Math.sin(atan23)) * f26), cos6 + (((float) Math.cos(atan24)) * f26), sin5 + (f26 * ((float) Math.sin(atan24))), cos6, sin5);
                    } else {
                        d5 = d16;
                        d6 = d14;
                        d4 = d15;
                        this.a.lineTo(cos6, sin5);
                    }
                    d16 = d5 + d4;
                    i5++;
                    sin4 = sin5;
                    cos5 = cos6;
                    ceil2 = ceil2;
                    d14 = d6;
                    d15 = d4;
                }
                PointF e3 = this.f460g.e();
                this.a.offset(e3.x, e3.y);
                this.a.close();
            }
            this.a.close();
            this.f466m.a(this.a);
            this.n = true;
        }
        return this.a;
    }

    @Override // c.b.a.a0.b.c
    public String i() {
        return this.b;
    }
}
