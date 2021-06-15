package g.f.c.i.m;

import androidx.constraintlayout.widget.ConstraintLayout;
import c.c.a.a.a;
import g.f.c.i.d;
import g.f.c.i.g;
import g.f.c.i.i;
import g.f.c.i.m.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class e {
    public g.f.c.i.e a;
    public boolean b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2357c = true;

    /* renamed from: d  reason: collision with root package name */
    public g.f.c.i.e f2358d;
    public ArrayList<o> e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public b.AbstractC0071b f2359f;

    /* renamed from: g  reason: collision with root package name */
    public b.a f2360g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<l> f2361h;

    public e(g.f.c.i.e eVar) {
        new ArrayList();
        this.f2359f = null;
        this.f2360g = new b.a();
        this.f2361h = new ArrayList<>();
        this.a = eVar;
        this.f2358d = eVar;
    }

    public final void a(f fVar, int i2, int i3, f fVar2, ArrayList<l> arrayList, l lVar) {
        o oVar = fVar.f2363d;
        if (oVar.f2387c == null) {
            g.f.c.i.e eVar = this.a;
            if (!(oVar == eVar.f2328d || oVar == eVar.e)) {
                if (lVar == null) {
                    lVar = new l(oVar, i3);
                    arrayList.add(lVar);
                }
                oVar.f2387c = lVar;
                lVar.f2381c.add(oVar);
                for (d dVar : oVar.f2391h.f2369k) {
                    if (dVar instanceof f) {
                        a((f) dVar, i2, 0, fVar2, arrayList, lVar);
                    }
                }
                for (d dVar2 : oVar.f2392i.f2369k) {
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i2, 1, fVar2, arrayList, lVar);
                    }
                }
                if (i2 == 1 && (oVar instanceof m)) {
                    for (d dVar3 : ((m) oVar).f2382k.f2369k) {
                        if (dVar3 instanceof f) {
                            a((f) dVar3, i2, 2, fVar2, arrayList, lVar);
                        }
                    }
                }
                for (f fVar3 : oVar.f2391h.f2370l) {
                    a(fVar3, i2, 0, fVar2, arrayList, lVar);
                }
                for (f fVar4 : oVar.f2392i.f2370l) {
                    a(fVar4, i2, 1, fVar2, arrayList, lVar);
                }
                if (i2 == 1 && (oVar instanceof m)) {
                    for (f fVar5 : ((m) oVar).f2382k.f2370l) {
                        a(fVar5, i2, 2, fVar2, arrayList, lVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0184, code lost:
        if (r4[3].f2315f != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (r2.f2336m == 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0117, code lost:
        if (r9[1].f2315f != null) goto L_0x011b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(g.f.c.i.e r17) {
        /*
        // Method dump skipped, instructions count: 564
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.i.m.e.b(g.f.c.i.e):boolean");
    }

    public void c() {
        o oVar;
        ArrayList<o> arrayList = this.e;
        arrayList.clear();
        this.f2358d.f2328d.f();
        this.f2358d.e.f();
        arrayList.add(this.f2358d.f2328d);
        arrayList.add(this.f2358d.e);
        Iterator<d> it = this.f2358d.l0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            d next = it.next();
            if (next instanceof g) {
                oVar = new i(next);
            } else {
                if (next.y()) {
                    if (next.b == null) {
                        next.b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.b);
                } else {
                    arrayList.add(next.f2328d);
                }
                if (next.z()) {
                    if (next.f2327c == null) {
                        next.f2327c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2327c);
                } else {
                    arrayList.add(next.e);
                }
                if (next instanceof i) {
                    oVar = new j(next);
                }
            }
            arrayList.add(oVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<o> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<o> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o next2 = it3.next();
            if (next2.b != this.f2358d) {
                next2.d();
            }
        }
        this.f2361h.clear();
        l.a = 0;
        e(this.a.f2328d, 0, this.f2361h);
        e(this.a.e, 1, this.f2361h);
        this.b = false;
    }

    public final int d(g.f.c.i.e eVar, int i2) {
        long j2;
        long j3;
        e eVar2 = this;
        g.f.c.i.e eVar3 = eVar;
        int size = eVar2.f2361h.size();
        long j4 = 0;
        int i3 = 0;
        long j5 = 0;
        while (i3 < size) {
            l lVar = eVar2.f2361h.get(i3);
            o oVar = lVar.b;
            if (oVar instanceof c) {
                if (((c) oVar).f2389f != i2) {
                    j4 = Math.max(j4, j5);
                    i3++;
                    j5 = 0;
                    eVar2 = this;
                    eVar3 = eVar;
                }
            } else if (i2 == 0) {
                if (!(oVar instanceof k)) {
                    j4 = Math.max(j4, j5);
                    i3++;
                    j5 = 0;
                    eVar2 = this;
                    eVar3 = eVar;
                }
            } else if (!(oVar instanceof m)) {
                j4 = Math.max(j4, j5);
                i3++;
                j5 = 0;
                eVar2 = this;
                eVar3 = eVar;
            }
            f fVar = (i2 == 0 ? eVar3.f2328d : eVar3.e).f2391h;
            f fVar2 = (i2 == 0 ? eVar3.f2328d : eVar3.e).f2392i;
            boolean contains = oVar.f2391h.f2370l.contains(fVar);
            boolean contains2 = lVar.b.f2392i.f2370l.contains(fVar2);
            long j6 = lVar.b.j();
            if (!contains || !contains2) {
                o oVar2 = lVar.b;
                if (contains) {
                    f fVar3 = oVar2.f2391h;
                    j3 = lVar.b(fVar3, (long) fVar3.f2364f);
                    j2 = ((long) lVar.b.f2391h.f2364f) + j6;
                } else if (contains2) {
                    f fVar4 = oVar2.f2392i;
                    long a2 = lVar.a(fVar4, (long) fVar4.f2364f);
                    j2 = ((long) (-lVar.b.f2392i.f2364f)) + j6;
                    j3 = -a2;
                } else {
                    j5 = (oVar2.j() + ((long) oVar2.f2391h.f2364f)) - ((long) lVar.b.f2392i.f2364f);
                    j4 = Math.max(j4, j5);
                    i3++;
                    j5 = 0;
                    eVar2 = this;
                    eVar3 = eVar;
                }
                j5 = Math.max(j3, j2);
                j4 = Math.max(j4, j5);
                i3++;
                j5 = 0;
                eVar2 = this;
                eVar3 = eVar;
            } else {
                long b2 = lVar.b(lVar.b.f2391h, j5);
                long a3 = lVar.a(lVar.b.f2392i, j5);
                long j7 = b2 - j6;
                o oVar3 = lVar.b;
                int i4 = oVar3.f2392i.f2364f;
                if (j7 >= ((long) (-i4))) {
                    j7 += (long) i4;
                }
                long j8 = (long) oVar3.f2391h.f2364f;
                long j9 = ((-a3) - j6) - j8;
                if (j9 >= j8) {
                    j9 -= j8;
                }
                d dVar = oVar3.b;
                Objects.requireNonNull(dVar);
                float f2 = i2 == 0 ? dVar.Z : i2 == 1 ? dVar.a0 : -1.0f;
                float f3 = (float) (f2 > 0.0f ? (long) ((((float) j7) / (1.0f - f2)) + (((float) j9) / f2)) : 0);
                long a4 = ((long) ((f3 * f2) + 0.5f)) + j6 + ((long) a.a(1.0f, f2, f3, 0.5f));
                o oVar4 = lVar.b;
                j5 = (((long) oVar4.f2391h.f2364f) + a4) - ((long) oVar4.f2392i.f2364f);
                j4 = Math.max(j4, j5);
                i3++;
                j5 = 0;
                eVar2 = this;
                eVar3 = eVar;
            }
        }
        return (int) j4;
    }

    public final void e(o oVar, int i2, ArrayList<l> arrayList) {
        for (d dVar : oVar.f2391h.f2369k) {
            if (dVar instanceof f) {
                a((f) dVar, i2, 0, oVar.f2392i, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).f2391h, i2, 0, oVar.f2392i, arrayList, null);
            }
        }
        for (d dVar2 : oVar.f2392i.f2369k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i2, 1, oVar.f2391h, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).f2392i, i2, 1, oVar.f2391h, arrayList, null);
            }
        }
        if (i2 == 1) {
            for (d dVar3 : ((m) oVar).f2382k.f2369k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i2, 2, null, arrayList, null);
                }
            }
        }
    }

    public final void f(d dVar, int i2, int i3, int i4, int i5) {
        b.a aVar = this.f2360g;
        aVar.a = i2;
        aVar.b = i4;
        aVar.f2348c = i3;
        aVar.f2349d = i5;
        ((ConstraintLayout.b) this.f2359f).b(dVar, aVar);
        dVar.P(this.f2360g.e);
        dVar.K(this.f2360g.f2350f);
        b.a aVar2 = this.f2360g;
        dVar.y = aVar2.f2352h;
        dVar.H(aVar2.f2351g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        if (r10 == 3) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        if (r8 == 3) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        r2.c(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g() {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.i.m.e.g():void");
    }
}
