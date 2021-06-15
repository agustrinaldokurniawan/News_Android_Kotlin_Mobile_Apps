package g.f.c.i.m;

import g.f.c.i.c;
import g.f.c.i.d;
import g.f.c.i.e;
import g.f.c.i.g;
import g.f.c.i.m.b;
import java.util.HashSet;
import java.util.Iterator;

public class h {
    public static b.a a = new b.a();

    public static boolean a(d dVar) {
        int o = dVar.o();
        int s = dVar.s();
        d dVar2 = dVar.P;
        e eVar = dVar2 != null ? (e) dVar2 : null;
        if (eVar != null) {
            eVar.o();
        }
        if (eVar != null) {
            eVar.s();
        }
        boolean z = o == 1 || o == 2 || (o == 3 && dVar.f2335l == 0 && dVar.S == 0.0f && dVar.w(0)) || dVar.B();
        boolean z2 = s == 1 || s == 2 || (s == 3 && dVar.f2336m == 0 && dVar.S == 0.0f && dVar.w(1)) || dVar.C();
        if (dVar.S <= 0.0f || (!z && !z2)) {
            return z && z2;
        }
        return true;
    }

    public static void b(d dVar, b.AbstractC0071b bVar, boolean z) {
        HashSet<c> hashSet;
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        c cVar5;
        if (!(dVar instanceof e) && dVar.A() && a(dVar)) {
            e.a0(dVar, bVar, new b.a(), 0);
        }
        c k2 = dVar.k(c.a.LEFT);
        c k3 = dVar.k(c.a.RIGHT);
        int d2 = k2.d();
        int d3 = k3.d();
        HashSet<c> hashSet2 = k2.a;
        if (hashSet2 != null && k2.f2313c) {
            Iterator<c> it = hashSet2.iterator();
            while (it.hasNext()) {
                c next = it.next();
                d dVar2 = next.f2314d;
                boolean a2 = a(dVar2);
                if (dVar2.A() && a2) {
                    e.a0(dVar2, bVar, new b.a(), 0);
                }
                if (dVar2.o() != 3 || a2) {
                    if (!dVar2.A()) {
                        c cVar6 = dVar2.D;
                        if (next == cVar6 && dVar2.F.f2315f == null) {
                            int e = cVar6.e() + d2;
                            dVar2.I(e, dVar2.t() + e);
                        } else {
                            c cVar7 = dVar2.F;
                            if (next == cVar7 && cVar6.f2315f == null) {
                                int e2 = d2 - cVar7.e();
                                dVar2.I(e2 - dVar2.t(), e2);
                            } else if (next == cVar6 && (cVar3 = cVar7.f2315f) != null && cVar3.f2313c && !dVar2.y()) {
                                c(bVar, dVar2, z);
                            }
                        }
                        b(dVar2, bVar, z);
                    }
                } else if (dVar2.o() == 3 && dVar2.p >= 0 && dVar2.o >= 0) {
                    if ((dVar2.c0 == 8 || (dVar2.f2335l == 0 && dVar2.S == 0.0f)) && !dVar2.y() && !dVar2.A) {
                        c cVar8 = dVar2.D;
                        if (((next == cVar8 && (cVar5 = dVar2.F.f2315f) != null && cVar5.f2313c) || (next == dVar2.F && (cVar4 = cVar8.f2315f) != null && cVar4.f2313c)) && !dVar2.y()) {
                            d(dVar, bVar, dVar2, z);
                        }
                    }
                }
            }
        }
        if (!(dVar instanceof g) && (hashSet = k3.a) != null && k3.f2313c) {
            Iterator<c> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                c next2 = it2.next();
                d dVar3 = next2.f2314d;
                boolean a3 = a(dVar3);
                if (dVar3.A() && a3) {
                    e.a0(dVar3, bVar, new b.a(), 0);
                }
                c cVar9 = dVar3.D;
                boolean z2 = (next2 == cVar9 && (cVar2 = dVar3.F.f2315f) != null && cVar2.f2313c) || (next2 == dVar3.F && (cVar = cVar9.f2315f) != null && cVar.f2313c);
                if (dVar3.o() != 3 || a3) {
                    if (!dVar3.A()) {
                        c cVar10 = dVar3.D;
                        if (next2 == cVar10 && dVar3.F.f2315f == null) {
                            int e3 = cVar10.e() + d3;
                            dVar3.I(e3, dVar3.t() + e3);
                        } else {
                            c cVar11 = dVar3.F;
                            if (next2 == cVar11 && cVar10.f2315f == null) {
                                int e4 = d3 - cVar11.e();
                                dVar3.I(e4 - dVar3.t(), e4);
                            } else if (z2 && !dVar3.y()) {
                                c(bVar, dVar3, z);
                            }
                        }
                        b(dVar3, bVar, z);
                    }
                } else if (dVar3.o() == 3 && dVar3.p >= 0 && dVar3.o >= 0) {
                    if ((dVar3.c0 == 8 || (dVar3.f2335l == 0 && dVar3.S == 0.0f)) && !dVar3.y() && !dVar3.A && z2 && !dVar3.y()) {
                        d(dVar, bVar, dVar3, z);
                    }
                }
            }
        }
    }

    public static void c(b.AbstractC0071b bVar, d dVar, boolean z) {
        float f2 = dVar.Z;
        int d2 = dVar.D.f2315f.d();
        int d3 = dVar.F.f2315f.d();
        int e = dVar.D.e() + d2;
        int e2 = d3 - dVar.F.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e;
            d3 = e2;
        }
        int t = dVar.t();
        int i2 = (d3 - d2) - t;
        if (d2 > d3) {
            i2 = (d2 - d3) - t;
        }
        int i3 = ((int) ((f2 * ((float) i2)) + 0.5f)) + d2;
        int i4 = i3 + t;
        if (d2 > d3) {
            i4 = i3 - t;
        }
        dVar.I(i3, i4);
        b(dVar, bVar, z);
    }

    public static void d(d dVar, b.AbstractC0071b bVar, d dVar2, boolean z) {
        float f2 = dVar2.Z;
        int e = dVar2.D.e() + dVar2.D.f2315f.d();
        int d2 = dVar2.F.f2315f.d() - dVar2.F.e();
        if (d2 >= e) {
            int t = dVar2.t();
            if (dVar2.c0 != 8) {
                int i2 = dVar2.f2335l;
                if (i2 == 2) {
                    if (!(dVar instanceof e)) {
                        dVar = dVar.P;
                    }
                    t = (int) (dVar2.Z * 0.5f * ((float) dVar.t()));
                } else if (i2 == 0) {
                    t = d2 - e;
                }
                t = Math.max(dVar2.o, t);
                int i3 = dVar2.p;
                if (i3 > 0) {
                    t = Math.min(i3, t);
                }
            }
            int i4 = e + ((int) ((f2 * ((float) ((d2 - e) - t))) + 0.5f));
            dVar2.I(i4, t + i4);
            b(dVar2, bVar, z);
        }
    }

    public static void e(b.AbstractC0071b bVar, d dVar) {
        float f2 = dVar.a0;
        int d2 = dVar.E.f2315f.d();
        int d3 = dVar.G.f2315f.d();
        int e = dVar.E.e() + d2;
        int e2 = d3 - dVar.G.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e;
            d3 = e2;
        }
        int n = dVar.n();
        int i2 = (d3 - d2) - n;
        if (d2 > d3) {
            i2 = (d2 - d3) - n;
        }
        int i3 = (int) ((f2 * ((float) i2)) + 0.5f);
        int i4 = d2 + i3;
        int i5 = i4 + n;
        if (d2 > d3) {
            i4 = d2 - i3;
            i5 = i4 - n;
        }
        dVar.J(i4, i5);
        g(dVar, bVar);
    }

    public static void f(d dVar, b.AbstractC0071b bVar, d dVar2) {
        float f2 = dVar2.a0;
        int e = dVar2.E.e() + dVar2.E.f2315f.d();
        int d2 = dVar2.G.f2315f.d() - dVar2.G.e();
        if (d2 >= e) {
            int n = dVar2.n();
            if (dVar2.c0 != 8) {
                int i2 = dVar2.f2336m;
                if (i2 == 2) {
                    if (!(dVar instanceof e)) {
                        dVar = dVar.P;
                    }
                    n = (int) (f2 * 0.5f * ((float) dVar.n()));
                } else if (i2 == 0) {
                    n = d2 - e;
                }
                n = Math.max(dVar2.r, n);
                int i3 = dVar2.s;
                if (i3 > 0) {
                    n = Math.min(i3, n);
                }
            }
            int i4 = e + ((int) ((f2 * ((float) ((d2 - e) - n))) + 0.5f));
            dVar2.J(i4, n + i4);
            g(dVar2, bVar);
        }
    }

    public static void g(d dVar, b.AbstractC0071b bVar) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        c cVar5;
        if (!(dVar instanceof e) && dVar.A() && a(dVar)) {
            e.a0(dVar, bVar, new b.a(), 0);
        }
        c k2 = dVar.k(c.a.TOP);
        c k3 = dVar.k(c.a.BOTTOM);
        int d2 = k2.d();
        int d3 = k3.d();
        HashSet<c> hashSet = k2.a;
        if (hashSet != null && k2.f2313c) {
            Iterator<c> it = hashSet.iterator();
            while (it.hasNext()) {
                c next = it.next();
                d dVar2 = next.f2314d;
                boolean a2 = a(dVar2);
                if (dVar2.A() && a2) {
                    e.a0(dVar2, bVar, new b.a(), 0);
                }
                if (dVar2.s() != 3 || a2) {
                    if (!dVar2.A()) {
                        c cVar6 = dVar2.E;
                        if (next == cVar6 && dVar2.G.f2315f == null) {
                            int e = cVar6.e() + d2;
                            dVar2.J(e, dVar2.n() + e);
                        } else {
                            c cVar7 = dVar2.G;
                            if (next == cVar7 && cVar7.f2315f == null) {
                                int e2 = d2 - cVar7.e();
                                dVar2.J(e2 - dVar2.n(), e2);
                            } else if (next == cVar6 && (cVar3 = cVar7.f2315f) != null && cVar3.f2313c) {
                                e(bVar, dVar2);
                            }
                        }
                        g(dVar2, bVar);
                    }
                } else if (dVar2.s() == 3 && dVar2.s >= 0 && dVar2.r >= 0) {
                    if ((dVar2.c0 == 8 || (dVar2.f2336m == 0 && dVar2.S == 0.0f)) && !dVar2.z() && !dVar2.A) {
                        c cVar8 = dVar2.E;
                        if (((next == cVar8 && (cVar5 = dVar2.G.f2315f) != null && cVar5.f2313c) || (next == dVar2.G && (cVar4 = cVar8.f2315f) != null && cVar4.f2313c)) && !dVar2.z()) {
                            f(dVar, bVar, dVar2);
                        }
                    }
                }
            }
        }
        if (!(dVar instanceof g)) {
            HashSet<c> hashSet2 = k3.a;
            if (hashSet2 != null && k3.f2313c) {
                Iterator<c> it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    c next2 = it2.next();
                    d dVar3 = next2.f2314d;
                    boolean a3 = a(dVar3);
                    if (dVar3.A() && a3) {
                        e.a0(dVar3, bVar, new b.a(), 0);
                    }
                    c cVar9 = dVar3.E;
                    boolean z = (next2 == cVar9 && (cVar2 = dVar3.G.f2315f) != null && cVar2.f2313c) || (next2 == dVar3.G && (cVar = cVar9.f2315f) != null && cVar.f2313c);
                    if (dVar3.s() != 3 || a3) {
                        if (!dVar3.A()) {
                            c cVar10 = dVar3.E;
                            if (next2 == cVar10 && dVar3.G.f2315f == null) {
                                int e3 = cVar10.e() + d3;
                                dVar3.J(e3, dVar3.n() + e3);
                            } else {
                                c cVar11 = dVar3.G;
                                if (next2 == cVar11 && cVar10.f2315f == null) {
                                    int e4 = d3 - cVar11.e();
                                    dVar3.J(e4 - dVar3.n(), e4);
                                } else if (z && !dVar3.z()) {
                                    e(bVar, dVar3);
                                }
                            }
                            g(dVar3, bVar);
                        }
                    } else if (dVar3.s() == 3 && dVar3.s >= 0 && dVar3.r >= 0) {
                        if ((dVar3.c0 == 8 || (dVar3.f2336m == 0 && dVar3.S == 0.0f)) && !dVar3.z() && !dVar3.A && z && !dVar3.z()) {
                            f(dVar, bVar, dVar3);
                        }
                    }
                }
            }
            c k4 = dVar.k(c.a.BASELINE);
            if (k4.a != null && k4.f2313c) {
                int d4 = k4.d();
                Iterator<c> it3 = k4.a.iterator();
                while (it3.hasNext()) {
                    c next3 = it3.next();
                    d dVar4 = next3.f2314d;
                    boolean a4 = a(dVar4);
                    if (dVar4.A() && a4) {
                        e.a0(dVar4, bVar, new b.a(), 0);
                    }
                    if ((dVar4.s() != 3 || a4) && !dVar4.A() && next3 == dVar4.H) {
                        if (dVar4.y) {
                            int i2 = d4 - dVar4.W;
                            int i3 = dVar4.R + i2;
                            dVar4.V = i2;
                            dVar4.E.m(i2);
                            dVar4.G.m(i3);
                            c cVar12 = dVar4.H;
                            cVar12.b = d4;
                            cVar12.f2313c = true;
                            dVar4.f2332i = true;
                        }
                        g(dVar4, bVar);
                    }
                }
            }
        }
    }
}
