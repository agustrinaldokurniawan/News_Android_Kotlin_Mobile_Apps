package g.f.c.i.m;

import java.util.ArrayList;

public class l {
    public static int a;
    public o b = null;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<o> f2381c = new ArrayList<>();

    public l(o oVar, int i2) {
        a++;
        this.b = oVar;
    }

    public final long a(f fVar, long j2) {
        o oVar = fVar.f2363d;
        if (oVar instanceof j) {
            return j2;
        }
        int size = fVar.f2369k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f2369k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f2363d != oVar) {
                    j3 = Math.min(j3, a(fVar2, ((long) fVar2.f2364f) + j2));
                }
            }
        }
        if (fVar != oVar.f2392i) {
            return j3;
        }
        long j4 = j2 - oVar.j();
        return Math.min(Math.min(j3, a(oVar.f2391h, j4)), j4 - ((long) oVar.f2391h.f2364f));
    }

    public final long b(f fVar, long j2) {
        o oVar = fVar.f2363d;
        if (oVar instanceof j) {
            return j2;
        }
        int size = fVar.f2369k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f2369k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f2363d != oVar) {
                    j3 = Math.max(j3, b(fVar2, ((long) fVar2.f2364f) + j2));
                }
            }
        }
        if (fVar != oVar.f2391h) {
            return j3;
        }
        long j4 = j2 + oVar.j();
        return Math.max(Math.max(j3, b(oVar.f2392i, j4)), j4 - ((long) oVar.f2392i.f2364f));
    }
}
