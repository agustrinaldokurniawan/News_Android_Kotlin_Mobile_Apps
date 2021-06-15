package c.b.a.c0.k;

import android.graphics.PointF;
import c.b.a.a0.b.c;
import c.b.a.a0.b.o;
import c.b.a.c0.j.b;
import c.b.a.c0.j.m;
import c.c.a.a.a;

public class i implements b {
    public final String a;
    public final m<PointF, PointF> b;

    /* renamed from: c  reason: collision with root package name */
    public final m<PointF, PointF> f578c;

    /* renamed from: d  reason: collision with root package name */
    public final b f579d;
    public final boolean e;

    public i(String str, m<PointF, PointF> mVar, m<PointF, PointF> mVar2, b bVar, boolean z) {
        this.a = str;
        this.b = mVar;
        this.f578c = mVar2;
        this.f579d = bVar;
        this.e = z;
    }

    @Override // c.b.a.c0.k.b
    public c a(c.b.a.m mVar, c.b.a.c0.l.b bVar) {
        return new o(mVar, bVar, this);
    }

    public String toString() {
        StringBuilder f2 = a.f("RectangleShape{position=");
        f2.append(this.b);
        f2.append(", size=");
        f2.append(this.f578c);
        f2.append('}');
        return f2.toString();
    }
}
