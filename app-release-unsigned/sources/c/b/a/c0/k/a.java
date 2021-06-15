package c.b.a.c0.k;

import android.graphics.PointF;
import c.b.a.a0.b.c;
import c.b.a.c0.j.f;
import c.b.a.c0.j.m;
import c.b.a.c0.l.b;

public class a implements b {
    public final String a;
    public final m<PointF, PointF> b;

    /* renamed from: c  reason: collision with root package name */
    public final f f546c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f547d;
    public final boolean e;

    public a(String str, m<PointF, PointF> mVar, f fVar, boolean z, boolean z2) {
        this.a = str;
        this.b = mVar;
        this.f546c = fVar;
        this.f547d = z;
        this.e = z2;
    }

    @Override // c.b.a.c0.k.b
    public c a(c.b.a.m mVar, b bVar) {
        return new c.b.a.a0.b.f(mVar, bVar, this);
    }
}
