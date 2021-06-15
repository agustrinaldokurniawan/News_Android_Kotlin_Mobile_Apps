package c.d.a.m.v;

import c.c.a.a.a;
import c.d.a.m.m;
import c.d.a.m.p;
import c.d.a.m.t;
import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;

public class o implements m {
    public final Object b;

    /* renamed from: c  reason: collision with root package name */
    public final int f954c;

    /* renamed from: d  reason: collision with root package name */
    public final int f955d;
    public final Class<?> e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f956f;

    /* renamed from: g  reason: collision with root package name */
    public final m f957g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, t<?>> f958h;

    /* renamed from: i  reason: collision with root package name */
    public final p f959i;

    /* renamed from: j  reason: collision with root package name */
    public int f960j;

    public o(Object obj, m mVar, int i2, int i3, Map<Class<?>, t<?>> map, Class<?> cls, Class<?> cls2, p pVar) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.b = obj;
        Objects.requireNonNull(mVar, "Signature must not be null");
        this.f957g = mVar;
        this.f954c = i2;
        this.f955d = i3;
        Objects.requireNonNull(map, "Argument must not be null");
        this.f958h = map;
        Objects.requireNonNull(cls, "Resource class must not be null");
        this.e = cls;
        Objects.requireNonNull(cls2, "Transcode class must not be null");
        this.f956f = cls2;
        Objects.requireNonNull(pVar, "Argument must not be null");
        this.f959i = pVar;
    }

    @Override // c.d.a.m.m
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // c.d.a.m.m
    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.b.equals(oVar.b) && this.f957g.equals(oVar.f957g) && this.f955d == oVar.f955d && this.f954c == oVar.f954c && this.f958h.equals(oVar.f958h) && this.e.equals(oVar.e) && this.f956f.equals(oVar.f956f) && this.f959i.equals(oVar.f959i);
    }

    @Override // c.d.a.m.m
    public int hashCode() {
        if (this.f960j == 0) {
            int hashCode = this.b.hashCode();
            this.f960j = hashCode;
            int hashCode2 = this.f957g.hashCode() + (hashCode * 31);
            this.f960j = hashCode2;
            int i2 = (hashCode2 * 31) + this.f954c;
            this.f960j = i2;
            int i3 = (i2 * 31) + this.f955d;
            this.f960j = i3;
            int hashCode3 = this.f958h.hashCode() + (i3 * 31);
            this.f960j = hashCode3;
            int hashCode4 = this.e.hashCode() + (hashCode3 * 31);
            this.f960j = hashCode4;
            int hashCode5 = this.f956f.hashCode() + (hashCode4 * 31);
            this.f960j = hashCode5;
            this.f960j = this.f959i.hashCode() + (hashCode5 * 31);
        }
        return this.f960j;
    }

    public String toString() {
        StringBuilder f2 = a.f("EngineKey{model=");
        f2.append(this.b);
        f2.append(", width=");
        f2.append(this.f954c);
        f2.append(", height=");
        f2.append(this.f955d);
        f2.append(", resourceClass=");
        f2.append(this.e);
        f2.append(", transcodeClass=");
        f2.append(this.f956f);
        f2.append(", signature=");
        f2.append(this.f957g);
        f2.append(", hashCode=");
        f2.append(this.f960j);
        f2.append(", transformations=");
        f2.append(this.f958h);
        f2.append(", options=");
        f2.append(this.f959i);
        f2.append('}');
        return f2.toString();
    }
}
