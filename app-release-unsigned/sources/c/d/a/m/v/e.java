package c.d.a.m.v;

import c.c.a.a.a;
import c.d.a.m.m;
import java.security.MessageDigest;

public final class e implements m {
    public final m b;

    /* renamed from: c  reason: collision with root package name */
    public final m f894c;

    public e(m mVar, m mVar2) {
        this.b = mVar;
        this.f894c = mVar2;
    }

    @Override // c.d.a.m.m
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.f894c.a(messageDigest);
    }

    @Override // c.d.a.m.m
    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.b.equals(eVar.b) && this.f894c.equals(eVar.f894c);
    }

    @Override // c.d.a.m.m
    public int hashCode() {
        return this.f894c.hashCode() + (this.b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder f2 = a.f("DataCacheKey{sourceKey=");
        f2.append(this.b);
        f2.append(", signature=");
        f2.append(this.f894c);
        f2.append('}');
        return f2.toString();
    }
}
