package c.b.a.c0.k;

import c.b.a.a0.b.c;
import c.b.a.a0.b.r;
import c.b.a.c0.j.a;
import c.b.a.c0.j.b;
import c.b.a.c0.j.d;
import c.b.a.m;
import java.util.List;

public class o implements b {
    public final String a;
    public final b b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f589c;

    /* renamed from: d  reason: collision with root package name */
    public final a f590d;
    public final d e;

    /* renamed from: f  reason: collision with root package name */
    public final b f591f;

    /* renamed from: g  reason: collision with root package name */
    public final int f592g;

    /* renamed from: h  reason: collision with root package name */
    public final int f593h;

    /* renamed from: i  reason: collision with root package name */
    public final float f594i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f595j;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Lc/b/a/c0/j/b;Ljava/util/List<Lc/b/a/c0/j/b;>;Lc/b/a/c0/j/a;Lc/b/a/c0/j/d;Lc/b/a/c0/j/b;Ljava/lang/Object;Ljava/lang/Object;FZ)V */
    public o(String str, b bVar, List list, a aVar, d dVar, b bVar2, int i2, int i3, float f2, boolean z) {
        this.a = str;
        this.b = bVar;
        this.f589c = list;
        this.f590d = aVar;
        this.e = dVar;
        this.f591f = bVar2;
        this.f592g = i2;
        this.f593h = i3;
        this.f594i = f2;
        this.f595j = z;
    }

    @Override // c.b.a.c0.k.b
    public c a(m mVar, c.b.a.c0.l.b bVar) {
        return new r(mVar, bVar, this);
    }
}
