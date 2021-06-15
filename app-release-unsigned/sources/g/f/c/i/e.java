package g.f.c.i;

import androidx.constraintlayout.widget.ConstraintLayout;
import g.b.a;
import g.f.c.d;
import g.f.c.i.m.b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class e extends l {
    public WeakReference<c> A0 = null;
    public WeakReference<c> B0 = null;
    public WeakReference<c> C0 = null;
    public WeakReference<c> D0 = null;
    public b.a E0 = new b.a();
    public b m0 = new b(this);
    public g.f.c.i.m.e n0 = new g.f.c.i.m.e(this);
    public b.AbstractC0071b o0 = null;
    public boolean p0 = false;
    public d q0 = new d();
    public int r0;
    public int s0;
    public int t0 = 0;
    public int u0 = 0;
    public b[] v0 = new b[4];
    public b[] w0 = new b[4];
    public int x0 = 257;
    public boolean y0 = false;
    public boolean z0 = false;

    public static boolean a0(d dVar, b.AbstractC0071b bVar, b.a aVar, int i2) {
        int i3;
        int i4;
        if (bVar == null) {
            return false;
        }
        aVar.a = dVar.o();
        aVar.b = dVar.s();
        aVar.f2348c = dVar.t();
        aVar.f2349d = dVar.n();
        aVar.f2353i = false;
        aVar.f2354j = i2;
        boolean z = aVar.a == 3;
        boolean z2 = aVar.b == 3;
        boolean z3 = z && dVar.S > 0.0f;
        boolean z4 = z2 && dVar.S > 0.0f;
        if (z && dVar.w(0) && dVar.f2335l == 0 && !z3) {
            aVar.a = 2;
            if (z2 && dVar.f2336m == 0) {
                aVar.a = 1;
            }
            z = false;
        }
        if (z2 && dVar.w(1) && dVar.f2336m == 0 && !z4) {
            aVar.b = 2;
            if (z && dVar.f2335l == 0) {
                aVar.b = 1;
            }
            z2 = false;
        }
        if (dVar.B()) {
            aVar.a = 1;
            z = false;
        }
        if (dVar.C()) {
            aVar.b = 1;
            z2 = false;
        }
        if (z3) {
            if (dVar.n[0] == 4) {
                aVar.a = 1;
            } else if (!z2) {
                if (aVar.b == 1) {
                    i4 = aVar.f2349d;
                } else {
                    aVar.a = 2;
                    ((ConstraintLayout.b) bVar).b(dVar, aVar);
                    i4 = aVar.f2350f;
                }
                aVar.a = 1;
                int i5 = dVar.T;
                aVar.f2348c = (int) ((i5 == 0 || i5 == -1) ? dVar.S * ((float) i4) : dVar.S / ((float) i4));
            }
        }
        if (z4) {
            if (dVar.n[1] == 4) {
                aVar.b = 1;
            } else if (!z) {
                if (aVar.a == 1) {
                    i3 = aVar.f2348c;
                } else {
                    aVar.b = 2;
                    ((ConstraintLayout.b) bVar).b(dVar, aVar);
                    i3 = aVar.e;
                }
                aVar.b = 1;
                int i6 = dVar.T;
                aVar.f2349d = (int) ((i6 == 0 || i6 == -1) ? ((float) i3) / dVar.S : ((float) i3) * dVar.S);
            }
        }
        ((ConstraintLayout.b) bVar).b(dVar, aVar);
        dVar.P(aVar.e);
        dVar.K(aVar.f2350f);
        dVar.y = aVar.f2352h;
        dVar.H(aVar.f2351g);
        aVar.f2354j = 0;
        return aVar.f2353i;
    }

    @Override // g.f.c.i.d, g.f.c.i.l
    public void D() {
        this.q0.u();
        this.r0 = 0;
        this.s0 = 0;
        super.D();
    }

    @Override // g.f.c.i.d
    public void Q(boolean z, boolean z2) {
        super.Q(z, z2);
        int size = this.l0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.l0.get(i2).Q(z, z2);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:487:0x00bc */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: int[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: int[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x056f  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x05cc  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0601  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0627  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x063c  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0659  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0758  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0780  */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0798  */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x080f  */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x081c  */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x082f  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0839  */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x083d  */
    /* JADX WARNING: Removed duplicated region for block: B:474:0x0879  */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x088a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // g.f.c.i.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void S() {
        /*
        // Method dump skipped, instructions count: 2202
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.i.e.S():void");
    }

    public void T(d dVar, int i2) {
        if (i2 == 0) {
            int i3 = this.t0 + 1;
            b[] bVarArr = this.w0;
            if (i3 >= bVarArr.length) {
                this.w0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.w0;
            int i4 = this.t0;
            bVarArr2[i4] = new b(dVar, 0, this.p0);
            this.t0 = i4 + 1;
        } else if (i2 == 1) {
            int i5 = this.u0 + 1;
            b[] bVarArr3 = this.v0;
            if (i5 >= bVarArr3.length) {
                this.v0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.v0;
            int i6 = this.u0;
            bVarArr4[i6] = new b(dVar, 1, this.p0);
            this.u0 = i6 + 1;
        }
    }

    public boolean U(d dVar) {
        boolean b0 = b0(64);
        d(dVar, b0);
        int size = this.l0.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar2 = this.l0.get(i2);
            boolean[] zArr = dVar2.N;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar2 instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                d dVar3 = this.l0.get(i3);
                if (dVar3 instanceof a) {
                    a aVar = (a) dVar3;
                    for (int i4 = 0; i4 < aVar.m0; i4++) {
                        d dVar4 = aVar.l0[i4];
                        int i5 = aVar.n0;
                        if (i5 == 0 || i5 == 1) {
                            dVar4.N[0] = true;
                        } else if (i5 == 2 || i5 == 3) {
                            dVar4.N[1] = true;
                        }
                    }
                }
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            d dVar5 = this.l0.get(i6);
            if (dVar5.c()) {
                dVar5.d(dVar, b0);
            }
        }
        if (d.a) {
            HashSet<d> hashSet = new HashSet<>();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar6 = this.l0.get(i7);
                if (!dVar6.c()) {
                    hashSet.add(dVar6);
                }
            }
            b(this, dVar, hashSet, o() == 2 ? 0 : 1, false);
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                d next = it.next();
                j.a(this, dVar, next);
                next.d(dVar, b0);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                d dVar7 = this.l0.get(i8);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.O;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        iArr[0] = 1;
                    }
                    if (i10 == 2) {
                        iArr[1] = 1;
                    }
                    dVar7.d(dVar, b0);
                    if (i9 == 2) {
                        dVar7.L(i9);
                    }
                    if (i10 == 2) {
                        dVar7.O(i10);
                    }
                } else {
                    j.a(this, dVar, dVar7);
                    if (!dVar7.c()) {
                        dVar7.d(dVar, b0);
                    }
                }
            }
        }
        if (this.t0 > 0) {
            a.a(this, dVar, null, 0);
        }
        if (this.u0 > 0) {
            a.a(this, dVar, null, 1);
        }
        return true;
    }

    public void V(c cVar) {
        WeakReference<c> weakReference = this.D0;
        if (weakReference == null || weakReference.get() == null || cVar.d() > this.D0.get().d()) {
            this.D0 = new WeakReference<>(cVar);
        }
    }

    public void W(c cVar) {
        WeakReference<c> weakReference = this.C0;
        if (weakReference == null || weakReference.get() == null || cVar.d() > this.C0.get().d()) {
            this.C0 = new WeakReference<>(cVar);
        }
    }

    public void X(c cVar) {
        WeakReference<c> weakReference = this.A0;
        if (weakReference == null || weakReference.get() == null || cVar.d() > this.A0.get().d()) {
            this.A0 = new WeakReference<>(cVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0129 A[EDGE_INSN: B:77:0x0129->B:62:0x0129 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Y(boolean r12, int r13) {
        /*
        // Method dump skipped, instructions count: 308
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.c.i.e.Y(boolean, int):boolean");
    }

    public void Z() {
        this.n0.b = true;
    }

    public boolean b0(int i2) {
        return (this.x0 & i2) == i2;
    }

    public void c0(int i2) {
        this.x0 = i2;
        d.a = b0(512);
    }
}
