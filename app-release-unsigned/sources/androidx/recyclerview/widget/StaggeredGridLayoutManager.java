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
import g.q.c.n;
import g.q.c.o;
import g.q.c.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

public class StaggeredGridLayoutManager extends RecyclerView.l implements RecyclerView.v.b {
    public BitSet A;
    public int B;
    public int C;
    public d D;
    public int E;
    public boolean F;
    public boolean G;
    public e H;
    public int I;
    public final Rect J;
    public final b K;
    public boolean L;
    public int[] M;
    public final Runnable N;
    public int r = -1;
    public f[] s;
    public s t;
    public s u;
    public int v;
    public int w;
    public final n x;
    public boolean y;
    public boolean z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.a1();
        }
    }

    public class b {
        public int a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f301c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f302d;
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f303f;

        public b() {
            b();
        }

        public void a() {
            this.b = this.f301c ? StaggeredGridLayoutManager.this.t.g() : StaggeredGridLayoutManager.this.t.k();
        }

        public void b() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.f301c = false;
            this.f302d = false;
            this.e = false;
            int[] iArr = this.f303f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.m {
        public f e;

        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static class d {
        public int[] a;
        public List<a> b;

        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0001a();
            public int e;

            /* renamed from: f  reason: collision with root package name */
            public int f305f;

            /* renamed from: g  reason: collision with root package name */
            public int[] f306g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f307h;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            public class C0001a implements Parcelable.Creator<a> {
                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // android.os.Parcelable.Creator
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* Return type fixed from 'java.lang.Object[]' to match base method */
                @Override // android.os.Parcelable.Creator
                public a[] newArray(int i2) {
                    return new a[i2];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.e = parcel.readInt();
                this.f305f = parcel.readInt();
                this.f307h = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f306g = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder f2 = c.c.a.a.a.f("FullSpanItem{mPosition=");
                f2.append(this.e);
                f2.append(", mGapDir=");
                f2.append(this.f305f);
                f2.append(", mHasUnwantedGapAfter=");
                f2.append(this.f307h);
                f2.append(", mGapPerSpan=");
                f2.append(Arrays.toString(this.f306g));
                f2.append('}');
                return f2.toString();
            }

            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.e);
                parcel.writeInt(this.f305f);
                parcel.writeInt(this.f307h ? 1 : 0);
                int[] iArr = this.f306g;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f306g);
            }
        }

        public void a() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public void b(int i2) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i2, 10) + 1)];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i2 >= iArr.length) {
                int length = iArr.length;
                while (length <= i2) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public a c(int i2) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.b.get(size);
                if (aVar.e == i2) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r5 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.b
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r0 = r1
                goto L_0x0046
            L_0x0010:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.c(r5)
                if (r0 == 0) goto L_0x001b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.b
                r2.remove(r0)
            L_0x001b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.b
                int r0 = r0.size()
                r2 = 0
            L_0x0022:
                if (r2 >= r0) goto L_0x0034
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r3 = r3.e
                if (r3 < r5) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0034:
                r2 = r1
            L_0x0035:
                if (r2 == r1) goto L_0x000e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.b
                r3.remove(r2)
                int r0 = r0.e
            L_0x0046:
                if (r0 != r1) goto L_0x0052
                int[] r0 = r4.a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.a
                int r5 = r5.length
                return r5
            L_0x0052:
                int r0 = r0 + 1
                int[] r2 = r4.a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r4.a
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d.d(int):int");
        }

        public void e(int i2, int i3) {
            int[] iArr = this.a;
            if (iArr != null && i2 < iArr.length) {
                int i4 = i2 + i3;
                b(i4);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
                Arrays.fill(this.a, i2, i4, -1);
                List<a> list = this.b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.b.get(size);
                        int i5 = aVar.e;
                        if (i5 >= i2) {
                            aVar.e = i5 + i3;
                        }
                    }
                }
            }
        }

        public void f(int i2, int i3) {
            int[] iArr = this.a;
            if (iArr != null && i2 < iArr.length) {
                int i4 = i2 + i3;
                b(i4);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
                int[] iArr3 = this.a;
                Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
                List<a> list = this.b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.b.get(size);
                        int i5 = aVar.e;
                        if (i5 >= i2) {
                            if (i5 < i4) {
                                this.b.remove(size);
                            } else {
                                aVar.e = i5 - i3;
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f308f;

        /* renamed from: g  reason: collision with root package name */
        public int f309g;

        /* renamed from: h  reason: collision with root package name */
        public int[] f310h;

        /* renamed from: i  reason: collision with root package name */
        public int f311i;

        /* renamed from: j  reason: collision with root package name */
        public int[] f312j;

        /* renamed from: k  reason: collision with root package name */
        public List<d.a> f313k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f314l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f315m;
        public boolean n;

        public class a implements Parcelable.Creator<e> {
            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i2) {
                return new e[i2];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.e = parcel.readInt();
            this.f308f = parcel.readInt();
            int readInt = parcel.readInt();
            this.f309g = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f310h = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f311i = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f312j = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f314l = parcel.readInt() == 1;
            this.f315m = parcel.readInt() == 1;
            this.n = parcel.readInt() == 1 ? true : z;
            this.f313k = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f309g = eVar.f309g;
            this.e = eVar.e;
            this.f308f = eVar.f308f;
            this.f310h = eVar.f310h;
            this.f311i = eVar.f311i;
            this.f312j = eVar.f312j;
            this.f314l = eVar.f314l;
            this.f315m = eVar.f315m;
            this.n = eVar.n;
            this.f313k = eVar.f313k;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.e);
            parcel.writeInt(this.f308f);
            parcel.writeInt(this.f309g);
            if (this.f309g > 0) {
                parcel.writeIntArray(this.f310h);
            }
            parcel.writeInt(this.f311i);
            if (this.f311i > 0) {
                parcel.writeIntArray(this.f312j);
            }
            parcel.writeInt(this.f314l ? 1 : 0);
            parcel.writeInt(this.f315m ? 1 : 0);
            parcel.writeInt(this.n ? 1 : 0);
            parcel.writeList(this.f313k);
        }
    }

    public class f {
        public ArrayList<View> a = new ArrayList<>();
        public int b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f316c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f317d = 0;
        public final int e;

        public f(int i2) {
            this.e = i2;
        }

        public void a(View view) {
            c j2 = j(view);
            j2.e = this;
            this.a.add(view);
            this.f316c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (j2.c() || j2.b()) {
                this.f317d = StaggeredGridLayoutManager.this.t.c(view) + this.f317d;
            }
        }

        public void b() {
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            c j2 = j(view);
            this.f316c = StaggeredGridLayoutManager.this.t.b(view);
            Objects.requireNonNull(j2);
        }

        public void c() {
            View view = this.a.get(0);
            c j2 = j(view);
            this.b = StaggeredGridLayoutManager.this.t.e(view);
            Objects.requireNonNull(j2);
        }

        public void d() {
            this.a.clear();
            this.b = Integer.MIN_VALUE;
            this.f316c = Integer.MIN_VALUE;
            this.f317d = 0;
        }

        public int e() {
            int i2;
            int i3;
            if (StaggeredGridLayoutManager.this.y) {
                i3 = this.a.size() - 1;
                i2 = -1;
            } else {
                i3 = 0;
                i2 = this.a.size();
            }
            return g(i3, i2, true);
        }

        public int f() {
            int i2;
            int i3;
            if (StaggeredGridLayoutManager.this.y) {
                i3 = 0;
                i2 = this.a.size();
            } else {
                i3 = this.a.size() - 1;
                i2 = -1;
            }
            return g(i3, i2, true);
        }

        public int g(int i2, int i3, boolean z) {
            int k2 = StaggeredGridLayoutManager.this.t.k();
            int g2 = StaggeredGridLayoutManager.this.t.g();
            int i4 = i3 > i2 ? 1 : -1;
            while (i2 != i3) {
                View view = this.a.get(i2);
                int e2 = StaggeredGridLayoutManager.this.t.e(view);
                int b2 = StaggeredGridLayoutManager.this.t.b(view);
                boolean z2 = false;
                boolean z3 = !z ? e2 < g2 : e2 <= g2;
                if (!z ? b2 > k2 : b2 >= k2) {
                    z2 = true;
                }
                if (z3 && z2 && (e2 < k2 || b2 > g2)) {
                    return StaggeredGridLayoutManager.this.R(view);
                }
                i2 += i4;
            }
            return -1;
        }

        public int h(int i2) {
            int i3 = this.f316c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.a.size() == 0) {
                return i2;
            }
            b();
            return this.f316c;
        }

        public View i(int i2, int i3) {
            View view = null;
            if (i3 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.y && staggeredGridLayoutManager.R(view2) >= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.y && staggeredGridLayoutManager2.R(view2) <= i2) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i4 = 0;
                while (i4 < size2) {
                    View view3 = this.a.get(i4);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.y && staggeredGridLayoutManager3.R(view3) <= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.y && staggeredGridLayoutManager4.R(view3) >= i2) || !view3.hasFocusable()) {
                        break;
                    }
                    i4++;
                    view = view3;
                }
            }
            return view;
        }

        public c j(View view) {
            return (c) view.getLayoutParams();
        }

        public int k(int i2) {
            int i3 = this.b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.a.size() == 0) {
                return i2;
            }
            c();
            return this.b;
        }

        public void l() {
            int size = this.a.size();
            View remove = this.a.remove(size - 1);
            c j2 = j(remove);
            j2.e = null;
            if (j2.c() || j2.b()) {
                this.f317d -= StaggeredGridLayoutManager.this.t.c(remove);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.f316c = Integer.MIN_VALUE;
        }

        public void m() {
            View remove = this.a.remove(0);
            c j2 = j(remove);
            j2.e = null;
            if (this.a.size() == 0) {
                this.f316c = Integer.MIN_VALUE;
            }
            if (j2.c() || j2.b()) {
                this.f317d -= StaggeredGridLayoutManager.this.t.c(remove);
            }
            this.b = Integer.MIN_VALUE;
        }

        public void n(View view) {
            c j2 = j(view);
            j2.e = this;
            this.a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.f316c = Integer.MIN_VALUE;
            }
            if (j2.c() || j2.b()) {
                this.f317d = StaggeredGridLayoutManager.this.t.c(view) + this.f317d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.y = false;
        this.z = false;
        this.B = -1;
        this.C = Integer.MIN_VALUE;
        this.D = new d();
        this.E = 2;
        this.J = new Rect();
        this.K = new b();
        this.L = true;
        this.N = new a();
        RecyclerView.l.d S = RecyclerView.l.S(context, attributeSet, i2, i3);
        int i4 = S.a;
        if (i4 == 0 || i4 == 1) {
            d(null);
            if (i4 != this.v) {
                this.v = i4;
                s sVar = this.t;
                this.t = this.u;
                this.u = sVar;
                K0();
            }
            int i5 = S.b;
            d(null);
            if (i5 != this.r) {
                this.D.a();
                K0();
                this.r = i5;
                this.A = new BitSet(this.r);
                this.s = new f[this.r];
                for (int i6 = 0; i6 < this.r; i6++) {
                    this.s[i6] = new f(i6);
                }
                K0();
            }
            boolean z2 = S.f254c;
            d(null);
            e eVar = this.H;
            if (!(eVar == null || eVar.f314l == z2)) {
                eVar.f314l = z2;
            }
            this.y = z2;
            K0();
            this.x = new n();
            this.t = s.a(this, this.v);
            this.u = s.a(this, 1 - this.v);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public Parcelable A0() {
        int i2;
        int i3;
        int[] iArr;
        e eVar = this.H;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.f314l = this.y;
        eVar2.f315m = this.F;
        eVar2.n = this.G;
        d dVar = this.D;
        if (dVar == null || (iArr = dVar.a) == null) {
            eVar2.f311i = 0;
        } else {
            eVar2.f312j = iArr;
            eVar2.f311i = iArr.length;
            eVar2.f313k = dVar.b;
        }
        int i4 = -1;
        if (y() > 0) {
            eVar2.e = this.F ? k1() : j1();
            View f1 = this.z ? f1(true) : g1(true);
            if (f1 != null) {
                i4 = R(f1);
            }
            eVar2.f308f = i4;
            int i5 = this.r;
            eVar2.f309g = i5;
            eVar2.f310h = new int[i5];
            for (int i6 = 0; i6 < this.r; i6++) {
                if (this.F) {
                    i2 = this.s[i6].h(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.t.g();
                    } else {
                        eVar2.f310h[i6] = i2;
                    }
                } else {
                    i2 = this.s[i6].k(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.t.k();
                    } else {
                        eVar2.f310h[i6] = i2;
                    }
                }
                i2 -= i3;
                eVar2.f310h[i6] = i2;
            }
        } else {
            eVar2.e = -1;
            eVar2.f308f = -1;
            eVar2.f309g = 0;
        }
        return eVar2;
    }

    public final void A1(int i2, int i3) {
        for (int i4 = 0; i4 < this.r; i4++) {
            if (!this.s[i4].a.isEmpty()) {
                C1(this.s[i4], i2, i3);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void B0(int i2) {
        if (i2 == 0) {
            a1();
        }
    }

    public final void B1(int i2, RecyclerView.w wVar) {
        int i3;
        int i4;
        int i5;
        n nVar = this.x;
        boolean z2 = false;
        nVar.b = 0;
        nVar.f2938c = i2;
        RecyclerView.v vVar = this.f247g;
        if (!(vVar != null && vVar.e) || (i5 = wVar.a) == -1) {
            i4 = 0;
            i3 = 0;
        } else {
            if (this.z == (i5 < i2)) {
                i4 = this.t.l();
                i3 = 0;
            } else {
                i3 = this.t.l();
                i4 = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.n) {
            this.x.f2940f = this.t.k() - i3;
            this.x.f2941g = this.t.g() + i4;
        } else {
            this.x.f2941g = this.t.f() + i4;
            this.x.f2940f = -i3;
        }
        n nVar2 = this.x;
        nVar2.f2942h = false;
        nVar2.a = true;
        if (this.t.i() == 0 && this.t.f() == 0) {
            z2 = true;
        }
        nVar2.f2943i = z2;
    }

    public final void C1(f fVar, int i2, int i3) {
        int i4 = fVar.f317d;
        if (i2 == -1) {
            int i5 = fVar.b;
            if (i5 == Integer.MIN_VALUE) {
                fVar.c();
                i5 = fVar.b;
            }
            if (i5 + i4 > i3) {
                return;
            }
        } else {
            int i6 = fVar.f316c;
            if (i6 == Integer.MIN_VALUE) {
                fVar.b();
                i6 = fVar.f316c;
            }
            if (i6 - i4 < i3) {
                return;
            }
        }
        this.A.set(fVar.e, false);
    }

    public final int D1(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int L0(int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        return y1(i2, rVar, wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void M0(int i2) {
        e eVar = this.H;
        if (!(eVar == null || eVar.e == i2)) {
            eVar.f310h = null;
            eVar.f309g = 0;
            eVar.e = -1;
            eVar.f308f = -1;
        }
        this.B = i2;
        this.C = Integer.MIN_VALUE;
        K0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int N0(int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        return y1(i2, rVar, wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void Q0(Rect rect, int i2, int i3) {
        int i4;
        int i5;
        int P = P() + O();
        int N2 = N() + Q();
        if (this.v == 1) {
            i5 = RecyclerView.l.h(i3, rect.height() + N2, L());
            i4 = RecyclerView.l.h(i2, (this.w * this.r) + P, M());
        } else {
            i4 = RecyclerView.l.h(i2, rect.width() + P, M());
            i5 = RecyclerView.l.h(i3, (this.w * this.r) + N2, L());
        }
        this.b.setMeasuredDimension(i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean W() {
        return this.E != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void W0(RecyclerView recyclerView, RecyclerView.w wVar, int i2) {
        o oVar = new o(recyclerView.getContext());
        oVar.a = i2;
        X0(oVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean Y0() {
        return this.H == null;
    }

    public final int Z0(int i2) {
        if (y() == 0) {
            return this.z ? 1 : -1;
        }
        return (i2 < j1()) != this.z ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v.b
    public PointF a(int i2) {
        int Z0 = Z0(i2);
        PointF pointF = new PointF();
        if (Z0 == 0) {
            return null;
        }
        if (this.v == 0) {
            pointF.x = (float) Z0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) Z0;
        }
        return pointF;
    }

    public boolean a1() {
        int i2;
        if (!(y() == 0 || this.E == 0 || !this.f249i)) {
            if (this.z) {
                i2 = k1();
                j1();
            } else {
                i2 = j1();
                k1();
            }
            if (i2 == 0 && o1() != null) {
                this.D.a();
                this.f248h = true;
                K0();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void b0(int i2) {
        super.b0(i2);
        for (int i3 = 0; i3 < this.r; i3++) {
            f fVar = this.s[i3];
            int i4 = fVar.b;
            if (i4 != Integer.MIN_VALUE) {
                fVar.b = i4 + i2;
            }
            int i5 = fVar.f316c;
            if (i5 != Integer.MIN_VALUE) {
                fVar.f316c = i5 + i2;
            }
        }
    }

    public final int b1(RecyclerView.w wVar) {
        if (y() == 0) {
            return 0;
        }
        return g.q.a.d(wVar, this.t, g1(!this.L), f1(!this.L), this, this.L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void c0(int i2) {
        super.c0(i2);
        for (int i3 = 0; i3 < this.r; i3++) {
            f fVar = this.s[i3];
            int i4 = fVar.b;
            if (i4 != Integer.MIN_VALUE) {
                fVar.b = i4 + i2;
            }
            int i5 = fVar.f316c;
            if (i5 != Integer.MIN_VALUE) {
                fVar.f316c = i5 + i2;
            }
        }
    }

    public final int c1(RecyclerView.w wVar) {
        if (y() == 0) {
            return 0;
        }
        return g.q.a.e(wVar, this.t, g1(!this.L), f1(!this.L), this, this.L, this.z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void d(String str) {
        RecyclerView recyclerView;
        if (this.H == null && (recyclerView = this.b) != null) {
            recyclerView.i(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void d0(RecyclerView.d dVar, RecyclerView.d dVar2) {
        this.D.a();
        for (int i2 = 0; i2 < this.r; i2++) {
            this.s[i2].d();
        }
    }

    public final int d1(RecyclerView.w wVar) {
        if (y() == 0) {
            return 0;
        }
        return g.q.a.f(wVar, this.t, g1(!this.L), f1(!this.L), this, this.L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean e() {
        return this.v == 0;
    }

    public final int e1(RecyclerView.r rVar, n nVar, RecyclerView.w wVar) {
        int i2;
        f fVar;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z4;
        int i12;
        int i13;
        int i14;
        boolean z5 = false;
        this.A.set(0, this.r, true);
        if (this.x.f2943i) {
            i2 = nVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i2 = nVar.e == 1 ? nVar.f2941g + nVar.b : nVar.f2940f - nVar.b;
        }
        A1(nVar.e, i2);
        int g2 = this.z ? this.t.g() : this.t.k();
        Object[] objArr = null;
        while (true) {
            int i15 = nVar.f2938c;
            if (((i15 < 0 || i15 >= wVar.b()) ? z5 : true) && (this.x.f2943i || !this.A.isEmpty())) {
                View view = rVar.j(nVar.f2938c, z5, Long.MAX_VALUE).b;
                nVar.f2938c += nVar.f2939d;
                c cVar = (c) view.getLayoutParams();
                int a2 = cVar.a();
                int[] iArr = this.D.a;
                int i16 = (iArr == null || a2 >= iArr.length) ? -1 : iArr[a2];
                if (i16 == -1 ? true : z5) {
                    if (s1(nVar.e)) {
                        i14 = this.r - 1;
                        i13 = -1;
                        i12 = -1;
                    } else {
                        i13 = this.r;
                        int i17 = z5 ? 1 : 0;
                        Object[] objArr2 = z5 ? 1 : 0;
                        Object[] objArr3 = z5 ? 1 : 0;
                        i14 = i17;
                        i12 = 1;
                    }
                    f fVar2 = null;
                    if (nVar.e == 1) {
                        int k2 = this.t.k();
                        int i18 = Integer.MAX_VALUE;
                        while (i14 != i13) {
                            f fVar3 = this.s[i14];
                            int h2 = fVar3.h(k2);
                            if (h2 < i18) {
                                fVar2 = fVar3;
                                i18 = h2;
                            }
                            i14 += i12;
                        }
                    } else {
                        int g3 = this.t.g();
                        int i19 = Integer.MIN_VALUE;
                        while (i14 != i13) {
                            f fVar4 = this.s[i14];
                            int k3 = fVar4.k(g3);
                            if (k3 > i19) {
                                fVar2 = fVar4;
                                i19 = k3;
                            }
                            i14 += i12;
                        }
                    }
                    fVar = fVar2;
                    d dVar = this.D;
                    dVar.b(a2);
                    dVar.a[a2] = fVar.e;
                } else {
                    fVar = this.s[i16];
                }
                cVar.e = fVar;
                if (nVar.e == 1) {
                    z2 = false;
                    c(view, -1, false);
                } else {
                    z2 = false;
                    c(view, 0, false);
                }
                if (this.v == 1) {
                    int i20 = this.w;
                    int i21 = this.n;
                    int i22 = ((ViewGroup.MarginLayoutParams) cVar).width;
                    int i23 = z2 ? 1 : 0;
                    int i24 = z2 ? 1 : 0;
                    int i25 = z2 ? 1 : 0;
                    i4 = RecyclerView.l.z(i20, i21, i23, i22, z2);
                    i3 = RecyclerView.l.z(this.q, this.o, N() + Q(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
                    z3 = false;
                } else {
                    i4 = RecyclerView.l.z(this.p, this.n, P() + O(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
                    z3 = false;
                    i3 = RecyclerView.l.z(this.w, this.o, 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
                }
                q1(view, i4, i3, z3);
                if (nVar.e == 1) {
                    i6 = fVar.h(g2);
                    i5 = this.t.c(view) + i6;
                } else {
                    i5 = fVar.k(g2);
                    i6 = i5 - this.t.c(view);
                }
                int i26 = nVar.e;
                f fVar5 = cVar.e;
                if (i26 == 1) {
                    fVar5.a(view);
                } else {
                    fVar5.n(view);
                }
                if (!p1() || this.v != 1) {
                    i7 = this.u.k() + (fVar.e * this.w);
                    i8 = this.u.c(view) + i7;
                } else {
                    i8 = this.u.g() - (((this.r - 1) - fVar.e) * this.w);
                    i7 = i8 - this.u.c(view);
                }
                if (this.v == 1) {
                    i10 = i8;
                    i9 = i5;
                    i11 = i7;
                    i7 = i6;
                } else {
                    i9 = i8;
                    i10 = i5;
                    i11 = i6;
                }
                a0(view, i11, i7, i10, i9);
                C1(fVar, this.x.e, i2);
                u1(rVar, this.x);
                if (!this.x.f2942h || !view.hasFocusable()) {
                    z4 = false;
                } else {
                    BitSet bitSet = this.A;
                    int i27 = fVar.e;
                    z4 = false;
                    bitSet.set(i27, false);
                }
                z5 = z4;
                objArr = 1;
            }
        }
        if (objArr == null) {
            u1(rVar, this.x);
        }
        int k4 = this.x.e == -1 ? this.t.k() - m1(this.t.k()) : l1(this.t.g()) - this.t.g();
        if (k4 > 0) {
            return Math.min(nVar.b, k4);
        }
        int i28 = z5 ? 1 : 0;
        int i29 = z5 ? 1 : 0;
        int i30 = z5 ? 1 : 0;
        return i28;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f() {
        return this.v == 1;
    }

    public View f1(boolean z2) {
        int k2 = this.t.k();
        int g2 = this.t.g();
        View view = null;
        for (int y2 = y() - 1; y2 >= 0; y2--) {
            View x2 = x(y2);
            int e2 = this.t.e(x2);
            int b2 = this.t.b(x2);
            if (b2 > k2 && e2 < g2) {
                if (b2 <= g2 || !z2) {
                    return x2;
                }
                if (view == null) {
                    view = x2;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.m mVar) {
        return mVar instanceof c;
    }

    public View g1(boolean z2) {
        int k2 = this.t.k();
        int g2 = this.t.g();
        int y2 = y();
        View view = null;
        for (int i2 = 0; i2 < y2; i2++) {
            View x2 = x(i2);
            int e2 = this.t.e(x2);
            if (this.t.b(x2) > k2 && e2 < g2) {
                if (e2 >= k2 || !z2) {
                    return x2;
                }
                if (view == null) {
                    view = x2;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void h0(RecyclerView recyclerView, RecyclerView.r rVar) {
        g0();
        Runnable runnable = this.N;
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i2 = 0; i2 < this.r; i2++) {
            this.s[i2].d();
        }
        recyclerView.requestLayout();
    }

    public final void h1(RecyclerView.r rVar, RecyclerView.w wVar, boolean z2) {
        int g2;
        int l1 = l1(Integer.MIN_VALUE);
        if (l1 != Integer.MIN_VALUE && (g2 = this.t.g() - l1) > 0) {
            int i2 = g2 - (-y1(-g2, rVar, wVar));
            if (z2 && i2 > 0) {
                this.t.p(i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void i(int i2, int i3, RecyclerView.w wVar, RecyclerView.l.c cVar) {
        int i4;
        int i5;
        if (this.v != 0) {
            i2 = i3;
        }
        if (!(y() == 0 || i2 == 0)) {
            t1(i2, wVar);
            int[] iArr = this.M;
            if (iArr == null || iArr.length < this.r) {
                this.M = new int[this.r];
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.r; i7++) {
                n nVar = this.x;
                if (nVar.f2939d == -1) {
                    i5 = nVar.f2940f;
                    i4 = this.s[i7].k(i5);
                } else {
                    i5 = this.s[i7].h(nVar.f2941g);
                    i4 = this.x.f2941g;
                }
                int i8 = i5 - i4;
                if (i8 >= 0) {
                    this.M[i6] = i8;
                    i6++;
                }
            }
            Arrays.sort(this.M, 0, i6);
            for (int i9 = 0; i9 < i6; i9++) {
                int i10 = this.x.f2938c;
                if (i10 >= 0 && i10 < wVar.b()) {
                    ((m.b) cVar).a(this.x.f2938c, this.M[i9]);
                    n nVar2 = this.x;
                    nVar2.f2938c += nVar2.f2939d;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r8.v == 1) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r8.v == 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        if (p1() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0057, code lost:
        if (p1() == false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005f  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View i0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.r r11, androidx.recyclerview.widget.RecyclerView.w r12) {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.i0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    public final void i1(RecyclerView.r rVar, RecyclerView.w wVar, boolean z2) {
        int k2;
        int m1 = m1(Integer.MAX_VALUE);
        if (m1 != Integer.MAX_VALUE && (k2 = m1 - this.t.k()) > 0) {
            int y1 = k2 - y1(k2, rVar, wVar);
            if (z2 && y1 > 0) {
                this.t.p(-y1);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.r rVar = this.b.f235i;
        k0(accessibilityEvent);
        if (y() > 0) {
            View g1 = g1(false);
            View f1 = f1(false);
            if (g1 != null && f1 != null) {
                int R = R(g1);
                int R2 = R(f1);
                if (R < R2) {
                    accessibilityEvent.setFromIndex(R);
                    accessibilityEvent.setToIndex(R2);
                    return;
                }
                accessibilityEvent.setFromIndex(R2);
                accessibilityEvent.setToIndex(R);
            }
        }
    }

    public int j1() {
        if (y() == 0) {
            return 0;
        }
        return R(x(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int k(RecyclerView.w wVar) {
        return b1(wVar);
    }

    public int k1() {
        int y2 = y();
        if (y2 == 0) {
            return 0;
        }
        return R(x(y2 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int l(RecyclerView.w wVar) {
        return c1(wVar);
    }

    public final int l1(int i2) {
        int h2 = this.s[0].h(i2);
        for (int i3 = 1; i3 < this.r; i3++) {
            int h3 = this.s[i3].h(i2);
            if (h3 > h2) {
                h2 = h3;
            }
        }
        return h2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int m(RecyclerView.w wVar) {
        return d1(wVar);
    }

    public final int m1(int i2) {
        int k2 = this.s[0].k(i2);
        for (int i3 = 1; i3 < this.r; i3++) {
            int k3 = this.s[i3].k(i2);
            if (k3 < k2) {
                k2 = k3;
            }
        }
        return k2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int n(RecyclerView.w wVar) {
        return b1(wVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n1(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.z
            if (r0 == 0) goto L_0x0009
            int r0 = r6.k1()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.j1()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.D
            r4.d(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.f(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.D
            r7.e(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.f(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.e(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.z
            if (r7 == 0) goto L_0x004d
            int r7 = r6.j1()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.k1()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.K0()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.n1(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int o(RecyclerView.w wVar) {
        return c1(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void o0(RecyclerView recyclerView, int i2, int i3) {
        n1(i2, i3, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        if (r10 == r11) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c5, code lost:
        if (r10 == r11) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0090 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View o1() {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o1():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int p(RecyclerView.w wVar) {
        return d1(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void p0(RecyclerView recyclerView) {
        this.D.a();
        K0();
    }

    public boolean p1() {
        return K() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void q0(RecyclerView recyclerView, int i2, int i3, int i4) {
        n1(i2, i3, 8);
    }

    public final void q1(View view, int i2, int i3, boolean z2) {
        Rect rect = this.J;
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.L(view));
        }
        c cVar = (c) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect2 = this.J;
        int D1 = D1(i2, i4 + rect2.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect2.right);
        int i5 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect3 = this.J;
        int D12 = D1(i3, i5 + rect3.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect3.bottom);
        if (z2 ? V0(view, D1, D12, cVar) : T0(view, D1, D12, cVar)) {
            view.measure(D1, D12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void r0(RecyclerView recyclerView, int i2, int i3) {
        n1(i2, i3, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03f4, code lost:
        if (a1() != false) goto L_0x03f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r1(androidx.recyclerview.widget.RecyclerView.r r12, androidx.recyclerview.widget.RecyclerView.w r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 1046
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r1(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, boolean):void");
    }

    public final boolean s1(int i2) {
        if (this.v == 0) {
            return (i2 == -1) != this.z;
        }
        return ((i2 == -1) == this.z) == p1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void t0(RecyclerView recyclerView, int i2, int i3, Object obj) {
        n1(i2, i3, 4);
    }

    public void t1(int i2, RecyclerView.w wVar) {
        int i3;
        int i4;
        if (i2 > 0) {
            i4 = k1();
            i3 = 1;
        } else {
            i3 = -1;
            i4 = j1();
        }
        this.x.a = true;
        B1(i4, wVar);
        z1(i3);
        n nVar = this.x;
        nVar.f2938c = i4 + nVar.f2939d;
        nVar.b = Math.abs(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m u() {
        return this.v == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void u0(RecyclerView.r rVar, RecyclerView.w wVar) {
        r1(rVar, wVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r6.e == -1) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u1(androidx.recyclerview.widget.RecyclerView.r r5, g.q.c.n r6) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.u1(androidx.recyclerview.widget.RecyclerView$r, g.q.c.n):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m v(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void v0(RecyclerView.w wVar) {
        this.B = -1;
        this.C = Integer.MIN_VALUE;
        this.H = null;
        this.K.b();
    }

    public final void v1(RecyclerView.r rVar, int i2) {
        for (int y2 = y() - 1; y2 >= 0; y2--) {
            View x2 = x(y2);
            if (this.t.e(x2) >= i2 && this.t.o(x2) >= i2) {
                c cVar = (c) x2.getLayoutParams();
                Objects.requireNonNull(cVar);
                if (cVar.e.a.size() != 1) {
                    cVar.e.l();
                    G0(x2, rVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void w1(RecyclerView.r rVar, int i2) {
        while (y() > 0) {
            View x2 = x(0);
            if (this.t.b(x2) <= i2 && this.t.n(x2) <= i2) {
                c cVar = (c) x2.getLayoutParams();
                Objects.requireNonNull(cVar);
                if (cVar.e.a.size() != 1) {
                    cVar.e.m();
                    G0(x2, rVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void x1() {
        this.z = (this.v == 1 || !p1()) ? this.y : !this.y;
    }

    public int y1(int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (y() == 0 || i2 == 0) {
            return 0;
        }
        t1(i2, wVar);
        int e1 = e1(rVar, this.x, wVar);
        if (this.x.b >= e1) {
            i2 = i2 < 0 ? -e1 : e1;
        }
        this.t.p(-i2);
        this.F = this.z;
        n nVar = this.x;
        nVar.b = 0;
        u1(rVar, nVar);
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void z0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.H = eVar;
            if (this.B != -1) {
                eVar.f310h = null;
                eVar.f309g = 0;
                eVar.e = -1;
                eVar.f308f = -1;
                eVar.f310h = null;
                eVar.f309g = 0;
                eVar.f311i = 0;
                eVar.f312j = null;
                eVar.f313k = null;
            }
            K0();
        }
    }

    public final void z1(int i2) {
        n nVar = this.x;
        nVar.e = i2;
        int i3 = 1;
        if (this.z != (i2 == -1)) {
            i3 = -1;
        }
        nVar.f2939d = i3;
    }
}
