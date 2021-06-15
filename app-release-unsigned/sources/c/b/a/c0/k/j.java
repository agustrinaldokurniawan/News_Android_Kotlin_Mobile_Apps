package c.b.a.c0.k;

import c.b.a.a0.b.c;
import c.b.a.a0.b.p;
import c.b.a.c0.j.b;
import c.b.a.c0.j.l;
import c.b.a.m;

public class j implements b {
    public final String a;
    public final b b;

    /* renamed from: c  reason: collision with root package name */
    public final b f580c;

    /* renamed from: d  reason: collision with root package name */
    public final l f581d;
    public final boolean e;

    public j(String str, b bVar, b bVar2, l lVar, boolean z) {
        this.a = str;
        this.b = bVar;
        this.f580c = bVar2;
        this.f581d = lVar;
        this.e = z;
    }

    @Override // c.b.a.c0.k.b
    public c a(m mVar, c.b.a.c0.l.b bVar) {
        return new p(mVar, bVar, this);
    }
}
