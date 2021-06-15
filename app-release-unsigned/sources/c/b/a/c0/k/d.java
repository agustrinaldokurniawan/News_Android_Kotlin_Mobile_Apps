package c.b.a.c0.k;

import android.graphics.Path;
import c.b.a.a0.b.h;
import c.b.a.c0.j.b;
import c.b.a.c0.j.c;
import c.b.a.c0.j.f;
import c.b.a.m;

public class d implements b {
    public final int a;
    public final Path.FillType b;

    /* renamed from: c  reason: collision with root package name */
    public final c f548c;

    /* renamed from: d  reason: collision with root package name */
    public final c.b.a.c0.j.d f549d;
    public final f e;

    /* renamed from: f  reason: collision with root package name */
    public final f f550f;

    /* renamed from: g  reason: collision with root package name */
    public final String f551g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f552h;

    public d(String str, int i2, Path.FillType fillType, c cVar, c.b.a.c0.j.d dVar, f fVar, f fVar2, b bVar, b bVar2, boolean z) {
        this.a = i2;
        this.b = fillType;
        this.f548c = cVar;
        this.f549d = dVar;
        this.e = fVar;
        this.f550f = fVar2;
        this.f551g = str;
        this.f552h = z;
    }

    @Override // c.b.a.c0.k.b
    public c.b.a.a0.b.c a(m mVar, c.b.a.c0.l.b bVar) {
        return new h(mVar, bVar, this);
    }
}
