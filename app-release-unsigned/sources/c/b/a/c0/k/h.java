package c.b.a.c0.k;

import android.graphics.PointF;
import c.b.a.a0.b.c;
import c.b.a.a0.b.n;
import c.b.a.c0.j.b;
import c.b.a.c0.j.m;

public class h implements b {
    public final String a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final b f571c;

    /* renamed from: d  reason: collision with root package name */
    public final m<PointF, PointF> f572d;
    public final b e;

    /* renamed from: f  reason: collision with root package name */
    public final b f573f;

    /* renamed from: g  reason: collision with root package name */
    public final b f574g;

    /* renamed from: h  reason: collision with root package name */
    public final b f575h;

    /* renamed from: i  reason: collision with root package name */
    public final b f576i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f577j;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Object;Lc/b/a/c0/j/b;Lc/b/a/c0/j/m<Landroid/graphics/PointF;Landroid/graphics/PointF;>;Lc/b/a/c0/j/b;Lc/b/a/c0/j/b;Lc/b/a/c0/j/b;Lc/b/a/c0/j/b;Lc/b/a/c0/j/b;Z)V */
    public h(String str, int i2, b bVar, m mVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, boolean z) {
        this.a = str;
        this.b = i2;
        this.f571c = bVar;
        this.f572d = mVar;
        this.e = bVar2;
        this.f573f = bVar3;
        this.f574g = bVar4;
        this.f575h = bVar5;
        this.f576i = bVar6;
        this.f577j = z;
    }

    @Override // c.b.a.c0.k.b
    public c a(c.b.a.m mVar, c.b.a.c0.l.b bVar) {
        return new n(mVar, bVar, this);
    }
}
