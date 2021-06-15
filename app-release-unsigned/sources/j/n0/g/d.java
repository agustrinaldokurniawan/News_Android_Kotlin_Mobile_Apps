package j.n0.g;

import c.d.a.l.e;
import i.s.c.h;
import j.a;
import j.l0;
import j.n0.g.m;
import j.n0.j.b;
import j.n0.j.u;
import j.t;
import j.y;
import java.io.IOException;

public final class d {
    public m.a a;
    public m b;

    /* renamed from: c  reason: collision with root package name */
    public int f3501c;

    /* renamed from: d  reason: collision with root package name */
    public int f3502d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public l0 f3503f;

    /* renamed from: g  reason: collision with root package name */
    public final j f3504g;

    /* renamed from: h  reason: collision with root package name */
    public final a f3505h;

    /* renamed from: i  reason: collision with root package name */
    public final e f3506i;

    /* renamed from: j  reason: collision with root package name */
    public final t f3507j;

    public d(j jVar, a aVar, e eVar, t tVar) {
        h.f(jVar, "connectionPool");
        h.f(aVar, "address");
        h.f(eVar, "call");
        h.f(tVar, "eventListener");
        this.f3504g = jVar;
        this.f3505h = aVar;
        this.f3506i = eVar;
        this.f3507j = tVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0318 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j.n0.g.i a(int r16, int r17, int r18, int r19, boolean r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 870
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.g.d.a(int, int, int, int, boolean, boolean):j.n0.g.i");
    }

    public final boolean b(y yVar) {
        h.f(yVar, "url");
        y yVar2 = this.f3505h.a;
        return yVar.f3717h == yVar2.f3717h && h.a(yVar.f3716g, yVar2.f3716g);
    }

    public final void c(IOException iOException) {
        h.f(iOException, e.a);
        this.f3503f = null;
        if ((iOException instanceof u) && ((u) iOException).e == b.f3572i) {
            this.f3501c++;
        } else if (iOException instanceof j.n0.j.a) {
            this.f3502d++;
        } else {
            this.e++;
        }
    }
}
