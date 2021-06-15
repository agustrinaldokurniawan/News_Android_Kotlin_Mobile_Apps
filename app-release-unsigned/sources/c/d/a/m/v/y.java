package c.d.a.m.v;

import c.c.a.a.a;
import c.d.a.m.m;
import c.d.a.m.p;
import c.d.a.m.t;
import c.d.a.m.v.c0.b;
import c.d.a.s.g;
import c.d.a.s.j;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class y implements m {
    public static final g<Class<?>, byte[]> b = new g<>(50);

    /* renamed from: c  reason: collision with root package name */
    public final b f986c;

    /* renamed from: d  reason: collision with root package name */
    public final m f987d;
    public final m e;

    /* renamed from: f  reason: collision with root package name */
    public final int f988f;

    /* renamed from: g  reason: collision with root package name */
    public final int f989g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f990h;

    /* renamed from: i  reason: collision with root package name */
    public final p f991i;

    /* renamed from: j  reason: collision with root package name */
    public final t<?> f992j;

    public y(b bVar, m mVar, m mVar2, int i2, int i3, t<?> tVar, Class<?> cls, p pVar) {
        this.f986c = bVar;
        this.f987d = mVar;
        this.e = mVar2;
        this.f988f = i2;
        this.f989g = i3;
        this.f992j = tVar;
        this.f990h = cls;
        this.f991i = pVar;
    }

    @Override // c.d.a.m.m
    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f986c.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f988f).putInt(this.f989g).array();
        this.e.a(messageDigest);
        this.f987d.a(messageDigest);
        messageDigest.update(bArr);
        t<?> tVar = this.f992j;
        if (tVar != null) {
            tVar.a(messageDigest);
        }
        this.f991i.a(messageDigest);
        g<Class<?>, byte[]> gVar = b;
        byte[] a = gVar.a(this.f990h);
        if (a == null) {
            a = this.f990h.getName().getBytes(m.a);
            gVar.d(this.f990h, a);
        }
        messageDigest.update(a);
        this.f986c.d(bArr);
    }

    @Override // c.d.a.m.m
    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f989g == yVar.f989g && this.f988f == yVar.f988f && j.b(this.f992j, yVar.f992j) && this.f990h.equals(yVar.f990h) && this.f987d.equals(yVar.f987d) && this.e.equals(yVar.e) && this.f991i.equals(yVar.f991i);
    }

    @Override // c.d.a.m.m
    public int hashCode() {
        int hashCode = ((((this.e.hashCode() + (this.f987d.hashCode() * 31)) * 31) + this.f988f) * 31) + this.f989g;
        t<?> tVar = this.f992j;
        if (tVar != null) {
            hashCode = (hashCode * 31) + tVar.hashCode();
        }
        int hashCode2 = this.f990h.hashCode();
        return this.f991i.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder f2 = a.f("ResourceCacheKey{sourceKey=");
        f2.append(this.f987d);
        f2.append(", signature=");
        f2.append(this.e);
        f2.append(", width=");
        f2.append(this.f988f);
        f2.append(", height=");
        f2.append(this.f989g);
        f2.append(", decodedResourceClass=");
        f2.append(this.f990h);
        f2.append(", transformation='");
        f2.append(this.f992j);
        f2.append('\'');
        f2.append(", options=");
        f2.append(this.f991i);
        f2.append('}');
        return f2.toString();
    }
}
