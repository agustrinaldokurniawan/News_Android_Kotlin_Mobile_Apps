package c.b.a.g0;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import c.b.a.g;

public class a<T> {
    public final g a;
    public final T b;

    /* renamed from: c  reason: collision with root package name */
    public T f675c;

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f676d;
    public final Interpolator e;

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator f677f;

    /* renamed from: g  reason: collision with root package name */
    public final float f678g;

    /* renamed from: h  reason: collision with root package name */
    public Float f679h;

    /* renamed from: i  reason: collision with root package name */
    public float f680i;

    /* renamed from: j  reason: collision with root package name */
    public float f681j;

    /* renamed from: k  reason: collision with root package name */
    public int f682k;

    /* renamed from: l  reason: collision with root package name */
    public int f683l;

    /* renamed from: m  reason: collision with root package name */
    public float f684m;
    public float n;
    public PointF o;
    public PointF p;

    public a(g gVar, T t, T t2, Interpolator interpolator, float f2, Float f3) {
        this.f680i = -3987645.8f;
        this.f681j = -3987645.8f;
        this.f682k = 784923401;
        this.f683l = 784923401;
        this.f684m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = gVar;
        this.b = t;
        this.f675c = t2;
        this.f676d = interpolator;
        this.e = null;
        this.f677f = null;
        this.f678g = f2;
        this.f679h = f3;
    }

    public a(g gVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f2, Float f3) {
        this.f680i = -3987645.8f;
        this.f681j = -3987645.8f;
        this.f682k = 784923401;
        this.f683l = 784923401;
        this.f684m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = gVar;
        this.b = t;
        this.f675c = t2;
        this.f676d = null;
        this.e = interpolator;
        this.f677f = interpolator2;
        this.f678g = f2;
        this.f679h = null;
    }

    public a(g gVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f2, Float f3) {
        this.f680i = -3987645.8f;
        this.f681j = -3987645.8f;
        this.f682k = 784923401;
        this.f683l = 784923401;
        this.f684m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = gVar;
        this.b = t;
        this.f675c = t2;
        this.f676d = interpolator;
        this.e = interpolator2;
        this.f677f = interpolator3;
        this.f678g = f2;
        this.f679h = f3;
    }

    public a(T t) {
        this.f680i = -3987645.8f;
        this.f681j = -3987645.8f;
        this.f682k = 784923401;
        this.f683l = 784923401;
        this.f684m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = null;
        this.b = t;
        this.f675c = t;
        this.f676d = null;
        this.e = null;
        this.f677f = null;
        this.f678g = Float.MIN_VALUE;
        this.f679h = Float.valueOf(Float.MAX_VALUE);
    }

    public boolean a(float f2) {
        return f2 >= c() && f2 < b();
    }

    public float b() {
        float f2 = 1.0f;
        if (this.a == null) {
            return 1.0f;
        }
        if (this.n == Float.MIN_VALUE) {
            if (this.f679h != null) {
                f2 = ((this.f679h.floatValue() - this.f678g) / this.a.c()) + c();
            }
            this.n = f2;
        }
        return this.n;
    }

    public float c() {
        g gVar = this.a;
        if (gVar == null) {
            return 0.0f;
        }
        if (this.f684m == Float.MIN_VALUE) {
            this.f684m = (this.f678g - gVar.f672k) / gVar.c();
        }
        return this.f684m;
    }

    public boolean d() {
        return this.f676d == null && this.e == null && this.f677f == null;
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("Keyframe{startValue=");
        f2.append((Object) this.b);
        f2.append(", endValue=");
        f2.append((Object) this.f675c);
        f2.append(", startFrame=");
        f2.append(this.f678g);
        f2.append(", endFrame=");
        f2.append(this.f679h);
        f2.append(", interpolator=");
        f2.append(this.f676d);
        f2.append('}');
        return f2.toString();
    }
}
