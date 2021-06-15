package g.f.c.i.m;

import g.f.c.i.c;
import g.f.c.i.d;

public abstract class o implements d {
    public int a;
    public d b;

    /* renamed from: c  reason: collision with root package name */
    public l f2387c;

    /* renamed from: d  reason: collision with root package name */
    public int f2388d;
    public g e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f2389f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2390g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f2391h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f2392i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public int f2393j = 1;

    public o(d dVar) {
        this.b = dVar;
    }

    @Override // g.f.c.i.m.d
    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i2) {
        fVar.f2370l.add(fVar2);
        fVar.f2364f = i2;
        fVar2.f2369k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.f2370l.add(fVar2);
        fVar.f2370l.add(this.e);
        fVar.f2366h = i2;
        fVar.f2367i = gVar;
        fVar2.f2369k.add(fVar);
        gVar.f2369k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        int i4;
        if (i3 == 0) {
            d dVar = this.b;
            int i5 = dVar.p;
            i4 = Math.max(dVar.o, i2);
            if (i5 > 0) {
                i4 = Math.min(i5, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        } else {
            d dVar2 = this.b;
            int i6 = dVar2.s;
            i4 = Math.max(dVar2.r, i2);
            if (i6 > 0) {
                i4 = Math.min(i6, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        }
        return i4;
    }

    public final f h(c cVar) {
        o oVar;
        o oVar2;
        c cVar2 = cVar.f2315f;
        if (cVar2 == null) {
            return null;
        }
        d dVar = cVar2.f2314d;
        int ordinal = cVar2.e.ordinal();
        if (ordinal == 1) {
            oVar = dVar.f2328d;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                oVar2 = dVar.f2328d;
            } else if (ordinal == 4) {
                oVar2 = dVar.e;
            } else if (ordinal != 5) {
                return null;
            } else {
                return dVar.e.f2382k;
            }
            return oVar2.f2392i;
        } else {
            oVar = dVar.e;
        }
        return oVar.f2391h;
    }

    public final f i(c cVar, int i2) {
        c cVar2 = cVar.f2315f;
        if (cVar2 == null) {
            return null;
        }
        d dVar = cVar2.f2314d;
        o oVar = i2 == 0 ? dVar.f2328d : dVar.e;
        int ordinal = cVar2.e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return oVar.f2391h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return oVar.f2392i;
        }
        return null;
    }

    public long j() {
        g gVar = this.e;
        if (gVar.f2368j) {
            return (long) gVar.f2365g;
        }
        return 0;
    }

    public abstract boolean k();

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r9.a == 3) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(g.f.c.i.c r13, g.f.c.i.c r14, int r15) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.i.m.o.l(g.f.c.i.c, g.f.c.i.c, int):void");
    }
}
