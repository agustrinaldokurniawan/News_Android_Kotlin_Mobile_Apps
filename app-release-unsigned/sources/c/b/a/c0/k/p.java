package c.b.a.c0.k;

import c.b.a.a0.b.c;
import c.b.a.a0.b.s;
import c.b.a.c0.j.b;
import c.b.a.m;
import c.c.a.a.a;

public class p implements b {
    public final String a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final b f596c;

    /* renamed from: d  reason: collision with root package name */
    public final b f597d;
    public final b e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f598f;

    public p(String str, int i2, b bVar, b bVar2, b bVar3, boolean z) {
        this.a = str;
        this.b = i2;
        this.f596c = bVar;
        this.f597d = bVar2;
        this.e = bVar3;
        this.f598f = z;
    }

    @Override // c.b.a.c0.k.b
    public c a(m mVar, c.b.a.c0.l.b bVar) {
        return new s(bVar, this);
    }

    public String toString() {
        StringBuilder f2 = a.f("Trim Path: {start: ");
        f2.append(this.f596c);
        f2.append(", end: ");
        f2.append(this.f597d);
        f2.append(", offset: ");
        f2.append(this.e);
        f2.append("}");
        return f2.toString();
    }
}
