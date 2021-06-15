package g.f.c.i.m;

import c.c.a.a.a;
import g.f.c.g;
import g.f.c.i.d;
import g.f.c.i.m.f;

public class m extends o {

    /* renamed from: k  reason: collision with root package name */
    public f f2382k;

    /* renamed from: l  reason: collision with root package name */
    public g f2383l = null;

    public m(d dVar) {
        super(dVar);
        f fVar = new f(this);
        this.f2382k = fVar;
        this.f2391h.e = f.a.TOP;
        this.f2392i.e = f.a.BOTTOM;
        fVar.e = f.a.BASELINE;
        this.f2389f = 1;
    }

    @Override // g.f.c.i.m.d, g.f.c.i.m.o
    public void a(d dVar) {
        int i2;
        float f2;
        float f3;
        float f4;
        int f5 = g.f(this.f2393j);
        if (f5 == 1 || f5 == 2 || f5 != 3) {
            g gVar = this.e;
            if (gVar.f2362c && !gVar.f2368j && this.f2388d == 3) {
                d dVar2 = this.b;
                int i3 = dVar2.f2336m;
                if (i3 == 2) {
                    d dVar3 = dVar2.P;
                    if (dVar3 != null) {
                        g gVar2 = dVar3.e.e;
                        if (gVar2.f2368j) {
                            f3 = dVar2.t;
                            f4 = (float) gVar2.f2365g;
                        }
                    }
                } else if (i3 == 3) {
                    g gVar3 = dVar2.f2328d.e;
                    if (gVar3.f2368j) {
                        int i4 = dVar2.T;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                f4 = (float) gVar3.f2365g;
                                f3 = dVar2.S;
                            } else if (i4 != 1) {
                                i2 = 0;
                                gVar.c(i2);
                            }
                        }
                        f2 = ((float) gVar3.f2365g) / dVar2.S;
                        i2 = (int) (f2 + 0.5f);
                        gVar.c(i2);
                    }
                }
                f2 = f4 * f3;
                i2 = (int) (f2 + 0.5f);
                gVar.c(i2);
            }
            f fVar = this.f2391h;
            if (fVar.f2362c) {
                f fVar2 = this.f2392i;
                if (fVar2.f2362c) {
                    if (!fVar.f2368j || !fVar2.f2368j || !this.e.f2368j) {
                        if (!this.e.f2368j && this.f2388d == 3) {
                            d dVar4 = this.b;
                            if (dVar4.f2335l == 0 && !dVar4.z()) {
                                int i5 = this.f2391h.f2370l.get(0).f2365g;
                                f fVar3 = this.f2391h;
                                int i6 = i5 + fVar3.f2364f;
                                int i7 = this.f2392i.f2370l.get(0).f2365g + this.f2392i.f2364f;
                                fVar3.c(i6);
                                this.f2392i.c(i7);
                                this.e.c(i7 - i6);
                                return;
                            }
                        }
                        if (!this.e.f2368j && this.f2388d == 3 && this.a == 1 && this.f2391h.f2370l.size() > 0 && this.f2392i.f2370l.size() > 0) {
                            int i8 = (this.f2392i.f2370l.get(0).f2365g + this.f2392i.f2364f) - (this.f2391h.f2370l.get(0).f2365g + this.f2391h.f2364f);
                            g gVar4 = this.e;
                            int i9 = gVar4.f2379m;
                            if (i8 < i9) {
                                gVar4.c(i8);
                            } else {
                                gVar4.c(i9);
                            }
                        }
                        if (this.e.f2368j && this.f2391h.f2370l.size() > 0 && this.f2392i.f2370l.size() > 0) {
                            f fVar4 = this.f2391h.f2370l.get(0);
                            f fVar5 = this.f2392i.f2370l.get(0);
                            int i10 = fVar4.f2365g;
                            f fVar6 = this.f2391h;
                            int i11 = fVar6.f2364f + i10;
                            int i12 = fVar5.f2365g;
                            int i13 = this.f2392i.f2364f + i12;
                            float f6 = this.b.a0;
                            if (fVar4 == fVar5) {
                                f6 = 0.5f;
                            } else {
                                i10 = i11;
                                i12 = i13;
                            }
                            fVar6.c((int) ((((float) ((i12 - i10) - this.e.f2365g)) * f6) + ((float) i10) + 0.5f));
                            this.f2392i.c(this.f2391h.f2365g + this.e.f2365g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        d dVar5 = this.b;
        l(dVar5.E, dVar5.G, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0309, code lost:
        if (r9.b.y != false) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x035c, code lost:
        if (r0.f2388d == 3) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0395, code lost:
        if (r9.b.y != false) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x040a, code lost:
        if (r0.f2388d == 3) goto L_0x040c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    @Override // g.f.c.i.m.o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
        // Method dump skipped, instructions count: 1077
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.i.m.m.d():void");
    }

    @Override // g.f.c.i.m.o
    public void e() {
        f fVar = this.f2391h;
        if (fVar.f2368j) {
            this.b.V = fVar.f2365g;
        }
    }

    @Override // g.f.c.i.m.o
    public void f() {
        this.f2387c = null;
        this.f2391h.b();
        this.f2392i.b();
        this.f2382k.b();
        this.e.b();
        this.f2390g = false;
    }

    @Override // g.f.c.i.m.o
    public boolean k() {
        return this.f2388d != 3 || this.b.f2336m == 0;
    }

    public void m() {
        this.f2390g = false;
        this.f2391h.b();
        this.f2391h.f2368j = false;
        this.f2392i.b();
        this.f2392i.f2368j = false;
        this.f2382k.b();
        this.f2382k.f2368j = false;
        this.e.f2368j = false;
    }

    public String toString() {
        StringBuilder f2 = a.f("VerticalRun ");
        f2.append(this.b.d0);
        return f2.toString();
    }
}
