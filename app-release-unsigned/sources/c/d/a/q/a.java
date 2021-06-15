package c.d.a.q;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c.d.a.f;
import c.d.a.m.m;
import c.d.a.m.n;
import c.d.a.m.o;
import c.d.a.m.p;
import c.d.a.m.t;
import c.d.a.m.v.k;
import c.d.a.m.x.c.l;
import c.d.a.m.x.g.c;
import c.d.a.q.a;
import c.d.a.s.b;
import c.d.a.s.j;
import java.util.Map;
import java.util.Objects;

public abstract class a<T extends a<T>> implements Cloneable {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public float f1127f = 1.0f;

    /* renamed from: g  reason: collision with root package name */
    public k f1128g = k.f931c;

    /* renamed from: h  reason: collision with root package name */
    public f f1129h = f.NORMAL;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f1130i;

    /* renamed from: j  reason: collision with root package name */
    public int f1131j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f1132k;

    /* renamed from: l  reason: collision with root package name */
    public int f1133l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1134m = true;
    public int n = -1;
    public int o = -1;
    public m p;
    public boolean q;
    public boolean r;
    public Drawable s;
    public int t;
    public p u;
    public Map<Class<?>, t<?>> v;
    public Class<?> w;
    public boolean x;
    public Resources.Theme y;
    public boolean z;

    public a() {
        c.d.a.r.a aVar = c.d.a.r.a.b;
        this.p = c.d.a.r.a.b;
        this.r = true;
        this.u = new p();
        this.v = new b();
        this.w = Object.class;
        this.C = true;
    }

    public static boolean h(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public T a(a<?> aVar) {
        if (this.z) {
            return (T) clone().a(aVar);
        }
        if (h(aVar.e, 2)) {
            this.f1127f = aVar.f1127f;
        }
        if (h(aVar.e, 262144)) {
            this.A = aVar.A;
        }
        if (h(aVar.e, 1048576)) {
            this.D = aVar.D;
        }
        if (h(aVar.e, 4)) {
            this.f1128g = aVar.f1128g;
        }
        if (h(aVar.e, 8)) {
            this.f1129h = aVar.f1129h;
        }
        if (h(aVar.e, 16)) {
            this.f1130i = aVar.f1130i;
            this.f1131j = 0;
            this.e &= -33;
        }
        if (h(aVar.e, 32)) {
            this.f1131j = aVar.f1131j;
            this.f1130i = null;
            this.e &= -17;
        }
        if (h(aVar.e, 64)) {
            this.f1132k = aVar.f1132k;
            this.f1133l = 0;
            this.e &= -129;
        }
        if (h(aVar.e, 128)) {
            this.f1133l = aVar.f1133l;
            this.f1132k = null;
            this.e &= -65;
        }
        if (h(aVar.e, 256)) {
            this.f1134m = aVar.f1134m;
        }
        if (h(aVar.e, 512)) {
            this.o = aVar.o;
            this.n = aVar.n;
        }
        if (h(aVar.e, 1024)) {
            this.p = aVar.p;
        }
        if (h(aVar.e, 4096)) {
            this.w = aVar.w;
        }
        if (h(aVar.e, 8192)) {
            this.s = aVar.s;
            this.t = 0;
            this.e &= -16385;
        }
        if (h(aVar.e, 16384)) {
            this.t = aVar.t;
            this.s = null;
            this.e &= -8193;
        }
        if (h(aVar.e, 32768)) {
            this.y = aVar.y;
        }
        if (h(aVar.e, 65536)) {
            this.r = aVar.r;
        }
        if (h(aVar.e, 131072)) {
            this.q = aVar.q;
        }
        if (h(aVar.e, 2048)) {
            this.v.putAll(aVar.v);
            this.C = aVar.C;
        }
        if (h(aVar.e, 524288)) {
            this.B = aVar.B;
        }
        if (!this.r) {
            this.v.clear();
            int i2 = this.e & -2049;
            this.e = i2;
            this.q = false;
            this.e = i2 & -131073;
            this.C = true;
        }
        this.e |= aVar.e;
        this.u.d(aVar.u);
        m();
        return this;
    }

    /* renamed from: d */
    public T clone() {
        try {
            T t2 = (T) ((a) super.clone());
            p pVar = new p();
            t2.u = pVar;
            pVar.d(this.u);
            b bVar = new b();
            t2.v = bVar;
            bVar.putAll(this.v);
            t2.x = false;
            t2.z = false;
            return t2;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(aVar.f1127f, this.f1127f) == 0 && this.f1131j == aVar.f1131j && j.b(this.f1130i, aVar.f1130i) && this.f1133l == aVar.f1133l && j.b(this.f1132k, aVar.f1132k) && this.t == aVar.t && j.b(this.s, aVar.s) && this.f1134m == aVar.f1134m && this.n == aVar.n && this.o == aVar.o && this.q == aVar.q && this.r == aVar.r && this.A == aVar.A && this.B == aVar.B && this.f1128g.equals(aVar.f1128g) && this.f1129h == aVar.f1129h && this.u.equals(aVar.u) && this.v.equals(aVar.v) && this.w.equals(aVar.w) && j.b(this.p, aVar.p) && j.b(this.y, aVar.y);
    }

    public T f(Class<?> cls) {
        if (this.z) {
            return (T) clone().f(cls);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        this.w = cls;
        this.e |= 4096;
        m();
        return this;
    }

    public T g(k kVar) {
        if (this.z) {
            return (T) clone().g(kVar);
        }
        Objects.requireNonNull(kVar, "Argument must not be null");
        this.f1128g = kVar;
        this.e |= 4;
        m();
        return this;
    }

    public int hashCode() {
        return j.h(this.y, j.h(this.p, j.h(this.w, j.h(this.v, j.h(this.u, j.h(this.f1129h, j.h(this.f1128g, (((((((((((((j.h(this.s, (j.h(this.f1132k, (j.h(this.f1130i, (j.g(this.f1127f, 17) * 31) + this.f1131j) * 31) + this.f1133l) * 31) + this.t) * 31) + (this.f1134m ? 1 : 0)) * 31) + this.n) * 31) + this.o) * 31) + (this.q ? 1 : 0)) * 31) + (this.r ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0))))))));
    }

    public final T i(l lVar, t<Bitmap> tVar) {
        if (this.z) {
            return (T) clone().i(lVar, tVar);
        }
        Objects.requireNonNull(lVar, "Argument must not be null");
        o((o<Y>) l.f1045f, lVar);
        return s(tVar, false);
    }

    public T j(int i2, int i3) {
        if (this.z) {
            return (T) clone().j(i2, i3);
        }
        this.o = i2;
        this.n = i3;
        this.e |= 512;
        m();
        return this;
    }

    public T k(int i2) {
        if (this.z) {
            return (T) clone().k(i2);
        }
        this.f1133l = i2;
        int i3 = this.e | 128;
        this.e = i3;
        this.f1132k = null;
        this.e = i3 & -65;
        m();
        return this;
    }

    public T l(f fVar) {
        if (this.z) {
            return (T) clone().l(fVar);
        }
        Objects.requireNonNull(fVar, "Argument must not be null");
        this.f1129h = fVar;
        this.e |= 8;
        m();
        return this;
    }

    public final T m() {
        if (!this.x) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public <Y> T o(o<Y> oVar, Y y2) {
        if (this.z) {
            return (T) clone().o(oVar, y2);
        }
        Objects.requireNonNull(oVar, "Argument must not be null");
        Objects.requireNonNull(y2, "Argument must not be null");
        this.u.b.put(oVar, y2);
        m();
        return this;
    }

    public T p(m mVar) {
        if (this.z) {
            return (T) clone().p(mVar);
        }
        Objects.requireNonNull(mVar, "Argument must not be null");
        this.p = mVar;
        this.e |= 1024;
        m();
        return this;
    }

    public T q(boolean z2) {
        if (this.z) {
            return (T) clone().q(true);
        }
        this.f1134m = !z2;
        this.e |= 256;
        m();
        return this;
    }

    public T r(t<Bitmap> tVar) {
        return s(tVar, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: c.d.a.m.t<android.graphics.Bitmap> */
    /* JADX WARN: Multi-variable type inference failed */
    public T s(t<Bitmap> tVar, boolean z2) {
        if (this.z) {
            return (T) clone().s(tVar, z2);
        }
        c.d.a.m.x.c.o oVar = new c.d.a.m.x.c.o(tVar, z2);
        t(Bitmap.class, tVar, z2);
        t(Drawable.class, oVar, z2);
        t(BitmapDrawable.class, oVar, z2);
        t(c.class, new c.d.a.m.x.g.f(tVar), z2);
        m();
        return this;
    }

    public <Y> T t(Class<Y> cls, t<Y> tVar, boolean z2) {
        if (this.z) {
            return (T) clone().t(cls, tVar, z2);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        Objects.requireNonNull(tVar, "Argument must not be null");
        this.v.put(cls, tVar);
        int i2 = this.e | 2048;
        this.e = i2;
        this.r = true;
        int i3 = i2 | 65536;
        this.e = i3;
        this.C = false;
        if (z2) {
            this.e = i3 | 131072;
            this.q = true;
        }
        m();
        return this;
    }

    public T v(t<Bitmap>... tVarArr) {
        if (tVarArr.length > 1) {
            return s(new n(tVarArr), true);
        }
        if (tVarArr.length == 1) {
            return r(tVarArr[0]);
        }
        m();
        return this;
    }

    public T w(boolean z2) {
        if (this.z) {
            return (T) clone().w(z2);
        }
        this.D = z2;
        this.e |= 1048576;
        m();
        return this;
    }
}
