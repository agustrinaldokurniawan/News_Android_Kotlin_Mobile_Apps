package j.n0.j;

import i.s.c.h;
import k.i;

public final class c {
    public static final i a;
    public static final i b;

    /* renamed from: c  reason: collision with root package name */
    public static final i f3577c;

    /* renamed from: d  reason: collision with root package name */
    public static final i f3578d;
    public static final i e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f3579f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3580g;

    /* renamed from: h  reason: collision with root package name */
    public final i f3581h;

    /* renamed from: i  reason: collision with root package name */
    public final i f3582i;

    static {
        i.a aVar = i.f3739f;
        a = aVar.b(":");
        b = aVar.b(":status");
        f3577c = aVar.b(":method");
        f3578d = aVar.b(":path");
        e = aVar.b(":scheme");
        f3579f = aVar.b(":authority");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            i.s.c.h.f(r2, r0)
            java.lang.String r0 = "value"
            i.s.c.h.f(r3, r0)
            k.i$a r0 = k.i.f3739f
            k.i r2 = r0.b(r2)
            k.i r3 = r0.b(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.j.c.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(i iVar, String str) {
        this(iVar, i.f3739f.b(str));
        h.f(iVar, "name");
        h.f(str, "value");
    }

    public c(i iVar, i iVar2) {
        h.f(iVar, "name");
        h.f(iVar2, "value");
        this.f3581h = iVar;
        this.f3582i = iVar2;
        this.f3580g = iVar.d() + 32 + iVar2.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.a(this.f3581h, cVar.f3581h) && h.a(this.f3582i, cVar.f3582i);
    }

    public int hashCode() {
        i iVar = this.f3581h;
        int i2 = 0;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        i iVar2 = this.f3582i;
        if (iVar2 != null) {
            i2 = iVar2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return this.f3581h.k() + ": " + this.f3582i.k();
    }
}
