package c.b.a.c0.k;

import c.b.a.a0.b.c;
import c.b.a.a0.b.q;
import c.b.a.c0.j.h;
import c.b.a.c0.l.b;
import c.b.a.m;
import c.c.a.a.a;

public class n implements b {
    public final String a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final h f587c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f588d;

    public n(String str, int i2, h hVar, boolean z) {
        this.a = str;
        this.b = i2;
        this.f587c = hVar;
        this.f588d = z;
    }

    @Override // c.b.a.c0.k.b
    public c a(m mVar, b bVar) {
        return new q(mVar, bVar, this);
    }

    public String toString() {
        StringBuilder f2 = a.f("ShapePath{name=");
        f2.append(this.a);
        f2.append(", index=");
        f2.append(this.b);
        f2.append('}');
        return f2.toString();
    }
}
