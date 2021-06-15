package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import g.q.c.m;
import g.q.c.o;
import g.q.c.s;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.l implements RecyclerView.v.b {
    public int A;
    public d B;
    public final a C;
    public final b D;
    public int E;
    public int[] F;
    public int r;
    public c s;
    public s t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public static class a {
        public s a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f217c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f218d;
        public boolean e;

        public a() {
            d();
        }

        public void a() {
            this.f217c = this.f218d ? this.a.g() : this.a.k();
        }

        public void b(View view, int i2) {
            if (this.f218d) {
                this.f217c = this.a.m() + this.a.b(view);
            } else {
                this.f217c = this.a.e(view);
            }
            this.b = i2;
        }

        public void c(View view, int i2) {
            int i3;
            int m2 = this.a.m();
            if (m2 >= 0) {
                b(view, i2);
                return;
            }
            this.b = i2;
            if (this.f218d) {
                int g2 = (this.a.g() - m2) - this.a.b(view);
                this.f217c = this.a.g() - g2;
                if (g2 > 0) {
                    int c2 = this.f217c - this.a.c(view);
                    int k2 = this.a.k();
                    int min = c2 - (Math.min(this.a.e(view) - k2, 0) + k2);
                    if (min < 0) {
                        i3 = Math.min(g2, -min) + this.f217c;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                int e2 = this.a.e(view);
                int k3 = e2 - this.a.k();
                this.f217c = e2;
                if (k3 > 0) {
                    int g3 = (this.a.g() - Math.min(0, (this.a.g() - m2) - this.a.b(view))) - (this.a.c(view) + e2);
                    if (g3 < 0) {
                        i3 = this.f217c - Math.min(k3, -g3);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f217c = i3;
        }

        public void d() {
            this.b = -1;
            this.f217c = Integer.MIN_VALUE;
            this.f218d = false;
            this.e = false;
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("AnchorInfo{mPosition=");
            f2.append(this.b);
            f2.append(", mCoordinate=");
            f2.append(this.f217c);
            f2.append(", mLayoutFromEnd=");
            f2.append(this.f218d);
            f2.append(", mValid=");
            f2.append(this.e);
            f2.append('}');
            return f2.toString();
        }
    }

    public static class b {
        public int a;
        public boolean b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f219c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f220d;
    }

    public static class c {
        public boolean a = true;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f221c;

        /* renamed from: d  reason: collision with root package name */
        public int f222d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f223f;

        /* renamed from: g  reason: collision with root package name */
        public int f224g;

        /* renamed from: h  reason: collision with root package name */
        public int f225h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f226i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f227j;

        /* renamed from: k  reason: collision with root package name */
        public List<RecyclerView.z> f228k = null;

        /* renamed from: l  reason: collision with root package name */
        public boolean f229l;

        public void a(View view) {
            int i2;
            int a2;
            int size = this.f228k.size();
            View view2 = null;
            int i3 = Integer.MAX_VALUE;
            for (int i4 = 0; i4 < size; i4++) {
                View view3 = this.f228k.get(i4).b;
                RecyclerView.m mVar = (RecyclerView.m) view3.getLayoutParams();
                if (view3 != view && !mVar.c() && (a2 = (mVar.a() - this.f222d) * this.e) >= 0 && a2 < i3) {
                    view2 = view3;
                    if (a2 == 0) {
                        break;
                    }
                    i3 = a2;
                }
            }
            if (view2 == null) {
                i2 = -1;
            } else {
                i2 = ((RecyclerView.m) view2.getLayoutParams()).a();
            }
            this.f222d = i2;
        }

        public boolean b(RecyclerView.w wVar) {
            int i2 = this.f222d;
            return i2 >= 0 && i2 < wVar.b();
        }

        public View c(RecyclerView.r rVar) {
            List<RecyclerView.z> list = this.f228k;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    View view = this.f228k.get(i2).b;
                    RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
                    if (!mVar.c() && this.f222d == mVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = rVar.j(this.f222d, false, Long.MAX_VALUE).b;
            this.f222d += this.e;
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f230f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f231g;

        public class a implements Parcelable.Creator<d> {
            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i2) {
                return new d[i2];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.e = parcel.readInt();
            this.f230f = parcel.readInt();
            this.f231g = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.e = dVar.e;
            this.f230f = dVar.f230f;
            this.f231g = dVar.f231g;
        }

        public int describeContents() {
            return 0;
        }

        public boolean j() {
            return this.e >= 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.e);
            parcel.writeInt(this.f230f);
            parcel.writeInt(this.f231g ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i2, boolean z2) {
        this.r = 1;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = true;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        this.C = new a();
        this.D = new b();
        this.E = 2;
        this.F = new int[2];
        A1(i2);
        d(null);
        if (z2 != this.v) {
            this.v = z2;
            K0();
        }
    }

    public LinearLayoutManager(Context context) {
        this(1, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public Parcelable A0() {
        d dVar = this.B;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (y() > 0) {
            f1();
            boolean z2 = this.u ^ this.w;
            dVar2.f231g = z2;
            if (z2) {
                View q1 = q1();
                dVar2.f230f = this.t.g() - this.t.b(q1);
                dVar2.e = R(q1);
            } else {
                View r1 = r1();
                dVar2.e = R(r1);
                dVar2.f230f = this.t.e(r1) - this.t.k();
            }
        } else {
            dVar2.e = -1;
        }
        return dVar2;
    }

    public void A1(int i2) {
        if (i2 == 0 || i2 == 1) {
            d(null);
            if (i2 != this.r || this.t == null) {
                s a2 = s.a(this, i2);
                this.t = a2;
                this.C.a = a2;
                this.r = i2;
                K0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(c.c.a.a.a.l("invalid orientation:", i2));
    }

    public void B1(boolean z2) {
        d(null);
        if (this.x != z2) {
            this.x = z2;
            K0();
        }
    }

    public final void C1(int i2, int i3, boolean z2, RecyclerView.w wVar) {
        int i4;
        this.s.f229l = x1();
        this.s.f223f = i2;
        int[] iArr = this.F;
        boolean z3 = false;
        iArr[0] = 0;
        int i5 = 1;
        iArr[1] = 0;
        Z0(wVar, iArr);
        int max = Math.max(0, this.F[0]);
        int max2 = Math.max(0, this.F[1]);
        if (i2 == 1) {
            z3 = true;
        }
        c cVar = this.s;
        int i6 = z3 ? max2 : max;
        cVar.f225h = i6;
        if (!z3) {
            max = max2;
        }
        cVar.f226i = max;
        if (z3) {
            cVar.f225h = this.t.h() + i6;
            View q1 = q1();
            c cVar2 = this.s;
            if (this.w) {
                i5 = -1;
            }
            cVar2.e = i5;
            int R = R(q1);
            c cVar3 = this.s;
            cVar2.f222d = R + cVar3.e;
            cVar3.b = this.t.b(q1);
            i4 = this.t.b(q1) - this.t.g();
        } else {
            View r1 = r1();
            c cVar4 = this.s;
            cVar4.f225h = this.t.k() + cVar4.f225h;
            c cVar5 = this.s;
            if (!this.w) {
                i5 = -1;
            }
            cVar5.e = i5;
            int R2 = R(r1);
            c cVar6 = this.s;
            cVar5.f222d = R2 + cVar6.e;
            cVar6.b = this.t.e(r1);
            i4 = (-this.t.e(r1)) + this.t.k();
        }
        c cVar7 = this.s;
        cVar7.f221c = i3;
        if (z2) {
            cVar7.f221c = i3 - i4;
        }
        cVar7.f224g = i4;
    }

    public final void D1(int i2, int i3) {
        this.s.f221c = this.t.g() - i3;
        c cVar = this.s;
        cVar.e = this.w ? -1 : 1;
        cVar.f222d = i2;
        cVar.f223f = 1;
        cVar.b = i3;
        cVar.f224g = Integer.MIN_VALUE;
    }

    public final void E1(int i2, int i3) {
        this.s.f221c = i3 - this.t.k();
        c cVar = this.s;
        cVar.f222d = i2;
        cVar.e = this.w ? 1 : -1;
        cVar.f223f = -1;
        cVar.b = i3;
        cVar.f224g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int L0(int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (this.r == 1) {
            return 0;
        }
        return z1(i2, rVar, wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void M0(int i2) {
        this.z = i2;
        this.A = Integer.MIN_VALUE;
        d dVar = this.B;
        if (dVar != null) {
            dVar.e = -1;
        }
        K0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int N0(int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (this.r == 0) {
            return 0;
        }
        return z1(i2, rVar, wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean U0() {
        boolean z2;
        if (this.o == 1073741824 || this.n == 1073741824) {
            return false;
        }
        int y2 = y();
        int i2 = 0;
        while (true) {
            if (i2 >= y2) {
                z2 = false;
                break;
            }
            ViewGroup.LayoutParams layoutParams = x(i2).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z2 = true;
                break;
            }
            i2++;
        }
        return z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean W() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void W0(RecyclerView recyclerView, RecyclerView.w wVar, int i2) {
        o oVar = new o(recyclerView.getContext());
        oVar.a = i2;
        X0(oVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean Y0() {
        return this.B == null && this.u == this.x;
    }

    public void Z0(RecyclerView.w wVar, int[] iArr) {
        int i2;
        int l2 = wVar.a != -1 ? this.t.l() : 0;
        if (this.s.f223f == -1) {
            i2 = 0;
        } else {
            i2 = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v.b
    public PointF a(int i2) {
        if (y() == 0) {
            return null;
        }
        boolean z2 = false;
        int i3 = 1;
        if (i2 < R(x(0))) {
            z2 = true;
        }
        if (z2 != this.w) {
            i3 = -1;
        }
        return this.r == 0 ? new PointF((float) i3, 0.0f) : new PointF(0.0f, (float) i3);
    }

    public void a1(RecyclerView.w wVar, c cVar, RecyclerView.l.c cVar2) {
        int i2 = cVar.f222d;
        if (i2 >= 0 && i2 < wVar.b()) {
            ((m.b) cVar2).a(i2, Math.max(0, cVar.f224g));
        }
    }

    public final int b1(RecyclerView.w wVar) {
        if (y() == 0) {
            return 0;
        }
        f1();
        return g.q.a.d(wVar, this.t, i1(!this.y, true), h1(!this.y, true), this, this.y);
    }

    public final int c1(RecyclerView.w wVar) {
        if (y() == 0) {
            return 0;
        }
        f1();
        return g.q.a.e(wVar, this.t, i1(!this.y, true), h1(!this.y, true), this, this.y, this.w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void d(String str) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.b) != null) {
            recyclerView.i(str);
        }
    }

    public final int d1(RecyclerView.w wVar) {
        if (y() == 0) {
            return 0;
        }
        f1();
        return g.q.a.f(wVar, this.t, i1(!this.y, true), h1(!this.y, true), this, this.y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean e() {
        return this.r == 0;
    }

    public int e1(int i2) {
        if (i2 == 1) {
            return (this.r != 1 && s1()) ? 1 : -1;
        }
        if (i2 == 2) {
            return (this.r != 1 && s1()) ? -1 : 1;
        }
        if (i2 == 17) {
            return this.r == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i2 == 33) {
            return this.r == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i2 == 66) {
            return this.r == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i2 != 130) {
            return Integer.MIN_VALUE;
        }
        return this.r == 1 ? 1 : Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f() {
        return this.r == 1;
    }

    public void f1() {
        if (this.s == null) {
            this.s = new c();
        }
    }

    public int g1(RecyclerView.r rVar, c cVar, RecyclerView.w wVar, boolean z2) {
        int i2 = cVar.f221c;
        int i3 = cVar.f224g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                cVar.f224g = i3 + i2;
            }
            v1(rVar, cVar);
        }
        int i4 = cVar.f221c + cVar.f225h;
        b bVar = this.D;
        while (true) {
            if ((!cVar.f229l && i4 <= 0) || !cVar.b(wVar)) {
                break;
            }
            bVar.a = 0;
            bVar.b = false;
            bVar.f219c = false;
            bVar.f220d = false;
            t1(rVar, wVar, cVar, bVar);
            if (!bVar.b) {
                int i5 = cVar.b;
                int i6 = bVar.a;
                cVar.b = (cVar.f223f * i6) + i5;
                if (!bVar.f219c || cVar.f228k != null || !wVar.f278g) {
                    cVar.f221c -= i6;
                    i4 -= i6;
                }
                int i7 = cVar.f224g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    cVar.f224g = i8;
                    int i9 = cVar.f221c;
                    if (i9 < 0) {
                        cVar.f224g = i8 + i9;
                    }
                    v1(rVar, cVar);
                }
                if (z2 && bVar.f220d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - cVar.f221c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void h0(RecyclerView recyclerView, RecyclerView.r rVar) {
        g0();
    }

    public View h1(boolean z2, boolean z3) {
        int y2;
        int i2;
        if (this.w) {
            y2 = 0;
            i2 = y();
        } else {
            y2 = y() - 1;
            i2 = -1;
        }
        return m1(y2, i2, z2, z3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void i(int i2, int i3, RecyclerView.w wVar, RecyclerView.l.c cVar) {
        if (this.r != 0) {
            i2 = i3;
        }
        if (y() != 0 && i2 != 0) {
            f1();
            C1(i2 > 0 ? 1 : -1, Math.abs(i2), true, wVar);
            a1(wVar, this.s, cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public View i0(View view, int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        int e1;
        View view2;
        y1();
        if (y() == 0 || (e1 = e1(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        f1();
        C1(e1, (int) (((float) this.t.l()) * 0.33333334f), false, wVar);
        c cVar = this.s;
        cVar.f224g = Integer.MIN_VALUE;
        cVar.a = false;
        g1(rVar, cVar, wVar, true);
        if (e1 == -1) {
            if (this.w) {
                view2 = l1(y() - 1, -1);
            } else {
                view2 = l1(0, y());
            }
        } else if (this.w) {
            view2 = l1(0, y());
        } else {
            view2 = l1(y() - 1, -1);
        }
        View r1 = e1 == -1 ? r1() : q1();
        if (!r1.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return r1;
    }

    public View i1(boolean z2, boolean z3) {
        int i2;
        int y2;
        if (this.w) {
            i2 = y() - 1;
            y2 = -1;
        } else {
            i2 = 0;
            y2 = y();
        }
        return m1(i2, y2, z2, z3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(int i2, RecyclerView.l.c cVar) {
        boolean z2;
        int i3;
        d dVar = this.B;
        int i4 = -1;
        if (dVar == null || !dVar.j()) {
            y1();
            z2 = this.w;
            i3 = this.z;
            if (i3 == -1) {
                i3 = z2 ? i2 - 1 : 0;
            }
        } else {
            d dVar2 = this.B;
            z2 = dVar2.f231g;
            i3 = dVar2.e;
        }
        if (!z2) {
            i4 = 1;
        }
        for (int i5 = 0; i5 < this.E && i3 >= 0 && i3 < i2; i5++) {
            ((m.b) cVar).a(i3, 0);
            i3 += i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.r rVar = this.b.f235i;
        k0(accessibilityEvent);
        if (y() > 0) {
            accessibilityEvent.setFromIndex(j1());
            accessibilityEvent.setToIndex(k1());
        }
    }

    public int j1() {
        View m1 = m1(0, y(), false, true);
        if (m1 == null) {
            return -1;
        }
        return R(m1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int k(RecyclerView.w wVar) {
        return b1(wVar);
    }

    public int k1() {
        View m1 = m1(y() - 1, -1, false, true);
        if (m1 == null) {
            return -1;
        }
        return R(m1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int l(RecyclerView.w wVar) {
        return c1(wVar);
    }

    public View l1(int i2, int i3) {
        int i4;
        int i5;
        f1();
        if ((i3 > i2 ? 1 : i3 < i2 ? (char) 65535 : 0) == 0) {
            return x(i2);
        }
        if (this.t.e(x(i2)) < this.t.k()) {
            i5 = 16644;
            i4 = 16388;
        } else {
            i5 = 4161;
            i4 = 4097;
        }
        return (this.r == 0 ? this.e : this.f246f).a(i2, i3, i5, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int m(RecyclerView.w wVar) {
        return d1(wVar);
    }

    public View m1(int i2, int i3, boolean z2, boolean z3) {
        f1();
        int i4 = 320;
        int i5 = z2 ? 24579 : 320;
        if (!z3) {
            i4 = 0;
        }
        return (this.r == 0 ? this.e : this.f246f).a(i2, i3, i5, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int n(RecyclerView.w wVar) {
        return b1(wVar);
    }

    public View n1(RecyclerView.r rVar, RecyclerView.w wVar, boolean z2, boolean z3) {
        int i2;
        int i3;
        f1();
        int y2 = y();
        int i4 = -1;
        if (z3) {
            i3 = y() - 1;
            i2 = -1;
        } else {
            i4 = y2;
            i3 = 0;
            i2 = 1;
        }
        int b2 = wVar.b();
        int k2 = this.t.k();
        int g2 = this.t.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i3 != i4) {
            View x2 = x(i3);
            int R = R(x2);
            int e = this.t.e(x2);
            int b3 = this.t.b(x2);
            if (R >= 0 && R < b2) {
                if (!((RecyclerView.m) x2.getLayoutParams()).c()) {
                    boolean z4 = b3 <= k2 && e < k2;
                    boolean z5 = e >= g2 && b3 > g2;
                    if (!z4 && !z5) {
                        return x2;
                    }
                    if (z2) {
                        if (!z5) {
                            if (view != null) {
                            }
                            view = x2;
                        }
                    } else if (!z4) {
                        if (view != null) {
                        }
                        view = x2;
                    }
                    view2 = x2;
                } else if (view3 == null) {
                    view3 = x2;
                }
            }
            i3 += i2;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int o(RecyclerView.w wVar) {
        return c1(wVar);
    }

    public final int o1(int i2, RecyclerView.r rVar, RecyclerView.w wVar, boolean z2) {
        int g2;
        int g3 = this.t.g() - i2;
        if (g3 <= 0) {
            return 0;
        }
        int i3 = -z1(-g3, rVar, wVar);
        int i4 = i2 + i3;
        if (!z2 || (g2 = this.t.g() - i4) <= 0) {
            return i3;
        }
        this.t.p(g2);
        return g2 + i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int p(RecyclerView.w wVar) {
        return d1(wVar);
    }

    public final int p1(int i2, RecyclerView.r rVar, RecyclerView.w wVar, boolean z2) {
        int k2;
        int k3 = i2 - this.t.k();
        if (k3 <= 0) {
            return 0;
        }
        int i3 = -z1(k3, rVar, wVar);
        int i4 = i2 + i3;
        if (!z2 || (k2 = i4 - this.t.k()) <= 0) {
            return i3;
        }
        this.t.p(-k2);
        return i3 - k2;
    }

    public final View q1() {
        return x(this.w ? 0 : y() - 1);
    }

    public final View r1() {
        return x(this.w ? y() - 1 : 0);
    }

    public boolean s1() {
        return K() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public View t(int i2) {
        int y2 = y();
        if (y2 == 0) {
            return null;
        }
        int R = i2 - R(x(0));
        if (R >= 0 && R < y2) {
            View x2 = x(R);
            if (R(x2) == i2) {
                return x2;
            }
        }
        return super.t(i2);
    }

    public void t1(RecyclerView.r rVar, RecyclerView.w wVar, c cVar, b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View c2 = cVar.c(rVar);
        if (c2 == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.m mVar = (RecyclerView.m) c2.getLayoutParams();
        if (cVar.f228k == null) {
            if (this.w == (cVar.f223f == -1)) {
                c(c2, -1, false);
            } else {
                c(c2, 0, false);
            }
        } else {
            if (this.w == (cVar.f223f == -1)) {
                c(c2, -1, true);
            } else {
                c(c2, 0, true);
            }
        }
        RecyclerView.m mVar2 = (RecyclerView.m) c2.getLayoutParams();
        Rect L = this.b.L(c2);
        int z2 = RecyclerView.l.z(this.p, this.n, P() + O() + ((ViewGroup.MarginLayoutParams) mVar2).leftMargin + ((ViewGroup.MarginLayoutParams) mVar2).rightMargin + L.left + L.right + 0, ((ViewGroup.MarginLayoutParams) mVar2).width, e());
        int z3 = RecyclerView.l.z(this.q, this.o, N() + Q() + ((ViewGroup.MarginLayoutParams) mVar2).topMargin + ((ViewGroup.MarginLayoutParams) mVar2).bottomMargin + L.top + L.bottom + 0, ((ViewGroup.MarginLayoutParams) mVar2).height, f());
        if (T0(c2, z2, z3, mVar2)) {
            c2.measure(z2, z3);
        }
        bVar.a = this.t.c(c2);
        if (this.r == 1) {
            if (s1()) {
                i6 = this.p - P();
                i5 = i6 - this.t.d(c2);
            } else {
                i5 = O();
                i6 = this.t.d(c2) + i5;
            }
            int i7 = cVar.f223f;
            int i8 = cVar.b;
            if (i7 == -1) {
                i2 = i8;
                i3 = i6;
                i4 = i8 - bVar.a;
            } else {
                i4 = i8;
                i3 = i6;
                i2 = bVar.a + i8;
            }
        } else {
            int Q = Q();
            int d2 = this.t.d(c2) + Q;
            int i9 = cVar.f223f;
            int i10 = cVar.b;
            if (i9 == -1) {
                i3 = i10;
                i4 = Q;
                i2 = d2;
                i5 = i10 - bVar.a;
            } else {
                i4 = Q;
                i3 = bVar.a + i10;
                i2 = d2;
                i5 = i10;
            }
        }
        a0(c2, i5, i4, i3, i2);
        if (mVar.c() || mVar.b()) {
            bVar.f219c = true;
        }
        bVar.f220d = c2.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m u() {
        return new RecyclerView.m(-2, -2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0175  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u0(androidx.recyclerview.widget.RecyclerView.r r17, androidx.recyclerview.widget.RecyclerView.w r18) {
        /*
        // Method dump skipped, instructions count: 1041
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.u0(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):void");
    }

    public void u1(RecyclerView.r rVar, RecyclerView.w wVar, a aVar, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void v0(RecyclerView.w wVar) {
        this.B = null;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.C.d();
    }

    public final void v1(RecyclerView.r rVar, c cVar) {
        if (cVar.a && !cVar.f229l) {
            int i2 = cVar.f224g;
            int i3 = cVar.f226i;
            if (cVar.f223f == -1) {
                int y2 = y();
                if (i2 >= 0) {
                    int f2 = (this.t.f() - i2) + i3;
                    if (this.w) {
                        for (int i4 = 0; i4 < y2; i4++) {
                            View x2 = x(i4);
                            if (this.t.e(x2) < f2 || this.t.o(x2) < f2) {
                                w1(rVar, 0, i4);
                                return;
                            }
                        }
                        return;
                    }
                    int i5 = y2 - 1;
                    for (int i6 = i5; i6 >= 0; i6--) {
                        View x3 = x(i6);
                        if (this.t.e(x3) < f2 || this.t.o(x3) < f2) {
                            w1(rVar, i5, i6);
                            return;
                        }
                    }
                }
            } else if (i2 >= 0) {
                int i7 = i2 - i3;
                int y3 = y();
                if (this.w) {
                    int i8 = y3 - 1;
                    for (int i9 = i8; i9 >= 0; i9--) {
                        View x4 = x(i9);
                        if (this.t.b(x4) > i7 || this.t.n(x4) > i7) {
                            w1(rVar, i8, i9);
                            return;
                        }
                    }
                    return;
                }
                for (int i10 = 0; i10 < y3; i10++) {
                    View x5 = x(i10);
                    if (this.t.b(x5) > i7 || this.t.n(x5) > i7) {
                        w1(rVar, 0, i10);
                        return;
                    }
                }
            }
        }
    }

    public final void w1(RecyclerView.r rVar, int i2, int i3) {
        if (i2 != i3) {
            if (i3 > i2) {
                for (int i4 = i3 - 1; i4 >= i2; i4--) {
                    H0(i4, rVar);
                }
                return;
            }
            while (i2 > i3) {
                H0(i2, rVar);
                i2--;
            }
        }
    }

    public boolean x1() {
        return this.t.i() == 0 && this.t.f() == 0;
    }

    public final void y1() {
        this.w = (this.r == 1 || !s1()) ? this.v : !this.v;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void z0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.B = dVar;
            if (this.z != -1) {
                dVar.e = -1;
            }
            K0();
        }
    }

    public int z1(int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (y() == 0 || i2 == 0) {
            return 0;
        }
        f1();
        this.s.a = true;
        int i3 = i2 > 0 ? 1 : -1;
        int abs = Math.abs(i2);
        C1(i3, abs, true, wVar);
        c cVar = this.s;
        int g1 = g1(rVar, cVar, wVar, false) + cVar.f224g;
        if (g1 < 0) {
            return 0;
        }
        if (abs > g1) {
            i2 = i3 * g1;
        }
        this.t.p(-i2);
        this.s.f227j = i2;
        return i2;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.r = 1;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = true;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        this.C = new a();
        this.D = new b();
        this.E = 2;
        this.F = new int[2];
        RecyclerView.l.d S = RecyclerView.l.S(context, attributeSet, i2, i3);
        A1(S.a);
        boolean z2 = S.f254c;
        d(null);
        if (z2 != this.v) {
            this.v = z2;
            K0();
        }
        B1(S.f255d);
    }
}
