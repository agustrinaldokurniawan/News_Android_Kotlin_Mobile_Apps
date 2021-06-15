package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g.h.j.z.b;
import g.q.c.m;
import java.util.Arrays;
import java.util.Objects;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean G = false;
    public int H = -1;
    public int[] I;
    public View[] J;
    public final SparseIntArray K = new SparseIntArray();
    public final SparseIntArray L = new SparseIntArray();
    public c M = new a();
    public final Rect N = new Rect();

    public static final class a extends c {
    }

    public static class b extends RecyclerView.m {
        public int e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f216f = 0;

        public b(int i2, int i3) {
            super(i2, i3);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();

        public int a(int i2, int i3) {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i4++;
                if (i4 == i3) {
                    i5++;
                    i4 = 0;
                } else if (i4 > i3) {
                    i5++;
                    i4 = 1;
                }
            }
            return i4 + 1 > i3 ? i5 + 1 : i5;
        }
    }

    public GridLayoutManager(Context context, int i2, int i3, boolean z) {
        super(i3, z);
        N1(i2);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        N1(RecyclerView.l.S(context, attributeSet, i2, i3).b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int A(RecyclerView.r rVar, RecyclerView.w wVar) {
        if (this.r == 1) {
            return this.H;
        }
        if (wVar.b() < 1) {
            return 0;
        }
        return I1(rVar, wVar, wVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void B1(boolean z) {
        if (!z) {
            d(null);
            if (this.x) {
                this.x = false;
                K0();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final void F1(int i2) {
        int i3;
        int[] iArr = this.I;
        int i4 = this.H;
        if (!(iArr != null && iArr.length == i4 + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i4 + 1)];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i4;
        int i7 = i2 % i4;
        int i8 = 0;
        for (int i9 = 1; i9 <= i4; i9++) {
            i5 += i7;
            if (i5 <= 0 || i4 - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i4;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        this.I = iArr;
    }

    public final void G1() {
        View[] viewArr = this.J;
        if (viewArr == null || viewArr.length != this.H) {
            this.J = new View[this.H];
        }
    }

    public int H1(int i2, int i3) {
        if (this.r != 1 || !s1()) {
            int[] iArr = this.I;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.I;
        int i4 = this.H;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    public final int I1(RecyclerView.r rVar, RecyclerView.w wVar, int i2) {
        if (!wVar.f278g) {
            return this.M.a(i2, this.H);
        }
        int c2 = rVar.c(i2);
        if (c2 != -1) {
            return this.M.a(c2, this.H);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    public final int J1(RecyclerView.r rVar, RecyclerView.w wVar, int i2) {
        if (!wVar.f278g) {
            c cVar = this.M;
            int i3 = this.H;
            Objects.requireNonNull(cVar);
            return i2 % i3;
        }
        int i4 = this.L.get(i2, -1);
        if (i4 != -1) {
            return i4;
        }
        int c2 = rVar.c(i2);
        if (c2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
            return 0;
        }
        c cVar2 = this.M;
        int i5 = this.H;
        Objects.requireNonNull(cVar2);
        return c2 % i5;
    }

    public final int K1(RecyclerView.r rVar, RecyclerView.w wVar, int i2) {
        if (!wVar.f278g) {
            Objects.requireNonNull(this.M);
            return 1;
        }
        int i3 = this.K.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        if (rVar.c(i2) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
            return 1;
        }
        Objects.requireNonNull(this.M);
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public int L0(int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        O1();
        G1();
        if (this.r == 1) {
            return 0;
        }
        return z1(i2, rVar, wVar);
    }

    public final void L1(View view, int i2, boolean z) {
        int i3;
        int i4;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i5 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i6 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int H1 = H1(bVar.e, bVar.f216f);
        if (this.r == 1) {
            i3 = RecyclerView.l.z(H1, i2, i6, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i4 = RecyclerView.l.z(this.t.l(), this.o, i5, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int z2 = RecyclerView.l.z(H1, i2, i5, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int z3 = RecyclerView.l.z(this.t.l(), this.n, i6, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i4 = z2;
            i3 = z3;
        }
        M1(view, i3, i4, z);
    }

    public final void M1(View view, int i2, int i3, boolean z) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        if (z ? V0(view, i2, i3, mVar) : T0(view, i2, i3, mVar)) {
            view.measure(i2, i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public int N0(int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        O1();
        G1();
        if (this.r == 0) {
            return 0;
        }
        return z1(i2, rVar, wVar);
    }

    public void N1(int i2) {
        if (i2 != this.H) {
            this.G = true;
            if (i2 >= 1) {
                this.H = i2;
                this.M.a.clear();
                K0();
                return;
            }
            throw new IllegalArgumentException(c.c.a.a.a.l("Span count should be at least 1. Provided ", i2));
        }
    }

    public final void O1() {
        int i2;
        int i3;
        if (this.r == 1) {
            i3 = this.p - P();
            i2 = O();
        } else {
            i3 = this.q - N();
            i2 = Q();
        }
        F1(i3 - i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void Q0(Rect rect, int i2, int i3) {
        int i4;
        int i5;
        if (this.I == null) {
            super.Q0(rect, i2, i3);
        }
        int P = P() + O();
        int N2 = N() + Q();
        if (this.r == 1) {
            i5 = RecyclerView.l.h(i3, rect.height() + N2, L());
            int[] iArr = this.I;
            i4 = RecyclerView.l.h(i2, iArr[iArr.length - 1] + P, M());
        } else {
            i4 = RecyclerView.l.h(i2, rect.width() + P, M());
            int[] iArr2 = this.I;
            i5 = RecyclerView.l.h(i3, iArr2[iArr2.length - 1] + N2, L());
        }
        this.b.setMeasuredDimension(i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int T(RecyclerView.r rVar, RecyclerView.w wVar) {
        if (this.r == 0) {
            return this.H;
        }
        if (wVar.b() < 1) {
            return 0;
        }
        return I1(rVar, wVar, wVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public boolean Y0() {
        return this.B == null && !this.G;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void a1(RecyclerView.w wVar, LinearLayoutManager.c cVar, RecyclerView.l.c cVar2) {
        int i2 = this.H;
        for (int i3 = 0; i3 < this.H && cVar.b(wVar) && i2 > 0; i3++) {
            ((m.b) cVar2).a(cVar.f222d, Math.max(0, cVar.f224g));
            Objects.requireNonNull(this.M);
            i2--;
            cVar.f222d += cVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.m mVar) {
        return mVar instanceof b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ca, code lost:
        if (r13 == (r2 > r15)) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e6, code lost:
        if (r13 == (r2 > r8)) goto L_0x00e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f0  */
    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View i0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.r r25, androidx.recyclerview.widget.RecyclerView.w r26) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.i0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public int l(RecyclerView.w wVar) {
        return c1(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public int m(RecyclerView.w wVar) {
        return d1(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void m0(RecyclerView.r rVar, RecyclerView.w wVar, View view, g.h.j.z.b bVar) {
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            l0(view, bVar);
            return;
        }
        b bVar2 = (b) layoutParams;
        int I1 = I1(rVar, wVar, bVar2.a());
        if (this.r == 0) {
            i5 = bVar2.e;
            i4 = bVar2.f216f;
            i2 = 1;
            z2 = false;
            z = false;
            i3 = I1;
        } else {
            i4 = 1;
            i3 = bVar2.e;
            i2 = bVar2.f216f;
            z2 = false;
            z = false;
            i5 = I1;
        }
        bVar.j(b.c.a(i5, i4, i3, i2, z2, z));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View n1(RecyclerView.r rVar, RecyclerView.w wVar, boolean z, boolean z2) {
        int i2;
        int y = y();
        int i3 = -1;
        int i4 = 1;
        if (z2) {
            i2 = y() - 1;
            i4 = -1;
        } else {
            i3 = y;
            i2 = 0;
        }
        int b2 = wVar.b();
        f1();
        int k2 = this.t.k();
        int g2 = this.t.g();
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View x = x(i2);
            int R = R(x);
            if (R >= 0 && R < b2 && J1(rVar, wVar, R) == 0) {
                if (((RecyclerView.m) x.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = x;
                    }
                } else if (this.t.e(x) < g2 && this.t.b(x) >= k2) {
                    return x;
                } else {
                    if (view == null) {
                        view = x;
                    }
                }
            }
            i2 += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public int o(RecyclerView.w wVar) {
        return c1(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void o0(RecyclerView recyclerView, int i2, int i3) {
        this.M.a.clear();
        this.M.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public int p(RecyclerView.w wVar) {
        return d1(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void p0(RecyclerView recyclerView) {
        this.M.a.clear();
        this.M.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void q0(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.M.a.clear();
        this.M.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void r0(RecyclerView recyclerView, int i2, int i3) {
        this.M.a.clear();
        this.M.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void t0(RecyclerView recyclerView, int i2, int i3, Object obj) {
        this.M.a.clear();
        this.M.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void t1(RecyclerView.r rVar, RecyclerView.w wVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        View c2;
        int j2 = this.t.j();
        boolean z = j2 != 1073741824;
        int i21 = y() > 0 ? this.I[this.H] : 0;
        if (z) {
            O1();
        }
        boolean z2 = cVar.e == 1;
        int i22 = this.H;
        if (!z2) {
            i22 = J1(rVar, wVar, cVar.f222d) + K1(rVar, wVar, cVar.f222d);
        }
        int i23 = 0;
        while (i23 < this.H && cVar.b(wVar) && i22 > 0) {
            int i24 = cVar.f222d;
            int K1 = K1(rVar, wVar, i24);
            if (K1 <= this.H) {
                i22 -= K1;
                if (i22 < 0 || (c2 = cVar.c(rVar)) == null) {
                    break;
                }
                this.J[i23] = c2;
                i23++;
            } else {
                throw new IllegalArgumentException("Item at position " + i24 + " requires " + K1 + " spans but GridLayoutManager has only " + this.H + " spans.");
            }
        }
        if (i23 == 0) {
            bVar.b = true;
            return;
        }
        if (z2) {
            i5 = 0;
            i3 = 0;
            i2 = 1;
            i4 = i23;
        } else {
            i5 = i23 - 1;
            i3 = 0;
            i4 = -1;
            i2 = -1;
        }
        while (i5 != i4) {
            View view = this.J[i5];
            b bVar2 = (b) view.getLayoutParams();
            int K12 = K1(rVar, wVar, R(view));
            bVar2.f216f = K12;
            bVar2.e = i3;
            i3 += K12;
            i5 += i2;
        }
        float f2 = 0.0f;
        int i25 = 0;
        for (int i26 = 0; i26 < i23; i26++) {
            View view2 = this.J[i26];
            if (cVar.f228k == null) {
                if (z2) {
                    b(view2);
                } else {
                    c(view2, 0, false);
                }
            } else if (z2) {
                c(view2, -1, true);
            } else {
                c(view2, 0, true);
            }
            Rect rect = this.N;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.L(view2));
            }
            L1(view2, j2, false);
            int c3 = this.t.c(view2);
            if (c3 > i25) {
                i25 = c3;
            }
            float d2 = (((float) this.t.d(view2)) * 1.0f) / ((float) ((b) view2.getLayoutParams()).f216f);
            if (d2 > f2) {
                f2 = d2;
            }
        }
        if (z) {
            F1(Math.max(Math.round(f2 * ((float) this.H)), i21));
            i25 = 0;
            for (int i27 = 0; i27 < i23; i27++) {
                View view3 = this.J[i27];
                L1(view3, 1073741824, true);
                int c4 = this.t.c(view3);
                if (c4 > i25) {
                    i25 = c4;
                }
            }
        }
        for (int i28 = 0; i28 < i23; i28++) {
            View view4 = this.J[i28];
            if (this.t.c(view4) != i25) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect2 = bVar3.b;
                int i29 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i30 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int H1 = H1(bVar3.e, bVar3.f216f);
                if (this.r == 1) {
                    i20 = RecyclerView.l.z(H1, 1073741824, i30, ((ViewGroup.MarginLayoutParams) bVar3).width, false);
                    i19 = View.MeasureSpec.makeMeasureSpec(i25 - i29, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i25 - i30, 1073741824);
                    i19 = RecyclerView.l.z(H1, 1073741824, i29, ((ViewGroup.MarginLayoutParams) bVar3).height, false);
                    i20 = makeMeasureSpec;
                }
                M1(view4, i20, i19, true);
            }
        }
        bVar.a = i25;
        if (this.r == 1) {
            if (cVar.f223f == -1) {
                i9 = cVar.b;
                i18 = i9 - i25;
            } else {
                i18 = cVar.b;
                i9 = i25 + i18;
            }
            i6 = i18;
            i8 = 0;
            i7 = 0;
        } else {
            if (cVar.f223f == -1) {
                i17 = cVar.b;
                i16 = i17 - i25;
            } else {
                i16 = cVar.b;
                i17 = i25 + i16;
            }
            i7 = i16;
            i6 = 0;
            i8 = i17;
            i9 = 0;
        }
        int i31 = 0;
        while (i31 < i23) {
            View view5 = this.J[i31];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.r == 1) {
                if (s1()) {
                    i15 = O() + this.I[this.H - bVar4.e];
                    i14 = i15 - this.t.d(view5);
                } else {
                    i14 = this.I[bVar4.e] + O();
                    i15 = this.t.d(view5) + i14;
                }
                i13 = i9;
                i12 = i15;
                i11 = i14;
                i10 = i6;
            } else {
                int Q = Q() + this.I[bVar4.e];
                i10 = Q;
                i12 = i8;
                i11 = i7;
                i13 = this.t.d(view5) + Q;
            }
            a0(view5, i11, i10, i12, i13);
            if (bVar4.c() || bVar4.b()) {
                bVar.f219c = true;
            }
            bVar.f220d |= view5.hasFocusable();
            i31++;
            i9 = i13;
            i8 = i12;
            i7 = i11;
            i6 = i10;
        }
        Arrays.fill(this.J, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public RecyclerView.m u() {
        return this.r == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public void u0(RecyclerView.r rVar, RecyclerView.w wVar) {
        if (wVar.f278g) {
            int y = y();
            for (int i2 = 0; i2 < y; i2++) {
                b bVar = (b) x(i2).getLayoutParams();
                int a2 = bVar.a();
                this.K.put(a2, bVar.f216f);
                this.L.put(a2, bVar.e);
            }
        }
        super.u0(rVar, wVar);
        this.K.clear();
        this.L.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void u1(RecyclerView.r rVar, RecyclerView.w wVar, LinearLayoutManager.a aVar, int i2) {
        O1();
        if (wVar.b() > 0 && !wVar.f278g) {
            boolean z = i2 == 1;
            int J1 = J1(rVar, wVar, aVar.b);
            if (z) {
                while (J1 > 0) {
                    int i3 = aVar.b;
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    aVar.b = i4;
                    J1 = J1(rVar, wVar, i4);
                }
            } else {
                int b2 = wVar.b() - 1;
                int i5 = aVar.b;
                while (i5 < b2) {
                    int i6 = i5 + 1;
                    int J12 = J1(rVar, wVar, i6);
                    if (J12 <= J1) {
                        break;
                    }
                    i5 = i6;
                    J1 = J12;
                }
                aVar.b = i5;
            }
        }
        G1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m v(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public void v0(RecyclerView.w wVar) {
        this.B = null;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.C.d();
        this.G = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }
}
