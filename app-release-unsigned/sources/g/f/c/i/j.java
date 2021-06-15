package g.f.c.i;

import g.f.c.d;

public class j {
    public static boolean[] a = new boolean[3];

    public static void a(e eVar, d dVar, d dVar2) {
        dVar2.f2333j = -1;
        dVar2.f2334k = -1;
        if (eVar.O[0] != 2 && dVar2.O[0] == 4) {
            int i2 = dVar2.D.f2316g;
            int t = eVar.t() - dVar2.F.f2316g;
            c cVar = dVar2.D;
            cVar.f2318i = dVar.l(cVar);
            c cVar2 = dVar2.F;
            cVar2.f2318i = dVar.l(cVar2);
            dVar.e(dVar2.D.f2318i, i2);
            dVar.e(dVar2.F.f2318i, t);
            dVar2.f2333j = 2;
            dVar2.U = i2;
            int i3 = t - i2;
            dVar2.Q = i3;
            int i4 = dVar2.X;
            if (i3 < i4) {
                dVar2.Q = i4;
            }
        }
        if (eVar.O[1] != 2 && dVar2.O[1] == 4) {
            int i5 = dVar2.E.f2316g;
            int n = eVar.n() - dVar2.G.f2316g;
            c cVar3 = dVar2.E;
            cVar3.f2318i = dVar.l(cVar3);
            c cVar4 = dVar2.G;
            cVar4.f2318i = dVar.l(cVar4);
            dVar.e(dVar2.E.f2318i, i5);
            dVar.e(dVar2.G.f2318i, n);
            if (dVar2.W > 0 || dVar2.c0 == 8) {
                c cVar5 = dVar2.H;
                cVar5.f2318i = dVar.l(cVar5);
                dVar.e(dVar2.H.f2318i, dVar2.W + i5);
            }
            dVar2.f2334k = 2;
            dVar2.V = i5;
            int i6 = n - i5;
            dVar2.R = i6;
            int i7 = dVar2.Y;
            if (i6 < i7) {
                dVar2.R = i7;
            }
        }
    }

    public static final boolean b(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
