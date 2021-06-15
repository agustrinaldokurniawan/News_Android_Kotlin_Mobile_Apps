package j.n0.h;

import j.a0;
import j.j0;

public final class h extends j0 {

    /* renamed from: g  reason: collision with root package name */
    public final String f3548g;

    /* renamed from: h  reason: collision with root package name */
    public final long f3549h;

    /* renamed from: i  reason: collision with root package name */
    public final k.h f3550i;

    public h(String str, long j2, k.h hVar) {
        i.s.c.h.f(hVar, "source");
        this.f3548g = str;
        this.f3549h = j2;
        this.f3550i = hVar;
    }

    @Override // j.j0
    public long b() {
        return this.f3549h;
    }

    @Override // j.j0
    public a0 c() {
        String str = this.f3548g;
        if (str == null) {
            return null;
        }
        a0.a aVar = a0.f3357c;
        i.s.c.h.f(str, "$this$toMediaTypeOrNull");
        try {
            return a0.a.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // j.j0
    public k.h e() {
        return this.f3550i;
    }
}
