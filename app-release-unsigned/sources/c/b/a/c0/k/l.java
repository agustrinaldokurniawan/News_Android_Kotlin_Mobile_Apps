package c.b.a.c0.k;

import android.graphics.Path;
import c.b.a.a0.b.c;
import c.b.a.a0.b.g;
import c.b.a.c0.j.a;
import c.b.a.c0.j.d;
import c.b.a.c0.l.b;
import c.b.a.m;

public class l implements b {
    public final boolean a;
    public final Path.FillType b;

    /* renamed from: c  reason: collision with root package name */
    public final String f583c;

    /* renamed from: d  reason: collision with root package name */
    public final a f584d;
    public final d e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f585f;

    public l(String str, boolean z, Path.FillType fillType, a aVar, d dVar, boolean z2) {
        this.f583c = str;
        this.a = z;
        this.b = fillType;
        this.f584d = aVar;
        this.e = dVar;
        this.f585f = z2;
    }

    @Override // c.b.a.c0.k.b
    public c a(m mVar, b bVar) {
        return new g(mVar, bVar, this);
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("ShapeFill{color=, fillEnabled=");
        f2.append(this.a);
        f2.append('}');
        return f2.toString();
    }
}
