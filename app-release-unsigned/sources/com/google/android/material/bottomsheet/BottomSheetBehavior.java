package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.e.a.a.r.l;
import c.e.a.a.r.m;
import c.e.a.a.w.g;
import c.e.a.a.w.j;
import com.tsuga.news.R;
import g.h.j.o;
import g.h.j.z.b;
import g.j.b.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public boolean A;
    public int B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public WeakReference<V> G;
    public WeakReference<View> H;
    public final ArrayList<c> I = new ArrayList<>();
    public VelocityTracker J;
    public int K;
    public int L;
    public boolean M;
    public Map<View, Integer> N;
    public int O = -1;
    public final e.c P = new b();
    public int a = 0;
    public boolean b = true;

    /* renamed from: c  reason: collision with root package name */
    public float f1628c;

    /* renamed from: d  reason: collision with root package name */
    public int f1629d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public int f1630f;

    /* renamed from: g  reason: collision with root package name */
    public int f1631g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1632h;

    /* renamed from: i  reason: collision with root package name */
    public g f1633i;

    /* renamed from: j  reason: collision with root package name */
    public int f1634j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1635k;

    /* renamed from: l  reason: collision with root package name */
    public j f1636l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1637m;
    public BottomSheetBehavior<V>.e n = null;
    public ValueAnimator o;
    public int p;
    public int q;
    public int r;
    public float s = 0.5f;
    public int t;
    public float u = -1.0f;
    public boolean v;
    public boolean w;
    public boolean x = true;
    public int y = 4;
    public g.j.b.e z;

    public class a implements Runnable {
        public final /* synthetic */ View e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f1638f;

        public a(View view, int i2) {
            this.e = view;
            this.f1638f = i2;
        }

        public void run() {
            BottomSheetBehavior.this.L(this.e, this.f1638f);
        }
    }

    public class b extends e.c {
        public b() {
        }

        @Override // g.j.b.e.c
        public int a(View view, int i2, int i3) {
            return view.getLeft();
        }

        @Override // g.j.b.e.c
        public int b(View view, int i2, int i3) {
            int G = BottomSheetBehavior.this.G();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return g.h.b.d.g(i2, G, bottomSheetBehavior.v ? bottomSheetBehavior.F : bottomSheetBehavior.t);
        }

        @Override // g.j.b.e.c
        public int d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.v ? bottomSheetBehavior.F : bottomSheetBehavior.t;
        }

        @Override // g.j.b.e.c
        public void f(int i2) {
            if (i2 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.x) {
                    bottomSheetBehavior.K(1);
                }
            }
        }

        @Override // g.j.b.e.c
        public void g(View view, int i2, int i3, int i4, int i5) {
            BottomSheetBehavior.this.E(i3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.a.p) < java.lang.Math.abs(r8.getTop() - r7.a.r)) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
            if (java.lang.Math.abs(r9 - r7.a.r) < java.lang.Math.abs(r9 - r7.a.t)) goto L_0x00ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f0, code lost:
            if (r9 < java.lang.Math.abs(r9 - r10.t)) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0102, code lost:
            if (java.lang.Math.abs(r9 - r0) < java.lang.Math.abs(r9 - r7.a.t)) goto L_0x00ba;
         */
        @Override // g.j.b.e.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h(android.view.View r8, float r9, float r10) {
            /*
            // Method dump skipped, instructions count: 267
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.h(android.view.View, float, float):void");
        }

        @Override // g.j.b.e.c
        public boolean i(View view, int i2) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i3 = bottomSheetBehavior.y;
            if (i3 == 1 || bottomSheetBehavior.M) {
                return false;
            }
            if (i3 == 3 && bottomSheetBehavior.K == i2) {
                WeakReference<View> weakReference = bottomSheetBehavior.H;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.G;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public static abstract class c {
        public abstract void a(View view, float f2);

        public abstract void b(View view, int i2);
    }

    public static class d extends g.j.a.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public final int f1640g;

        /* renamed from: h  reason: collision with root package name */
        public int f1641h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1642i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1643j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1644k;

        public static class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new d[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1640g = parcel.readInt();
            this.f1641h = parcel.readInt();
            boolean z = false;
            this.f1642i = parcel.readInt() == 1;
            this.f1643j = parcel.readInt() == 1;
            this.f1644k = parcel.readInt() == 1 ? true : z;
        }

        public d(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f1640g = bottomSheetBehavior.y;
            this.f1641h = bottomSheetBehavior.f1629d;
            this.f1642i = bottomSheetBehavior.b;
            this.f1643j = bottomSheetBehavior.v;
            this.f1644k = bottomSheetBehavior.w;
        }

        @Override // g.j.a.a
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f2593f, i2);
            parcel.writeInt(this.f1640g);
            parcel.writeInt(this.f1641h);
            parcel.writeInt(this.f1642i ? 1 : 0);
            parcel.writeInt(this.f1643j ? 1 : 0);
            parcel.writeInt(this.f1644k ? 1 : 0);
        }
    }

    public class e implements Runnable {
        public final View e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1645f;

        /* renamed from: g  reason: collision with root package name */
        public int f1646g;

        public e(View view, int i2) {
            this.e = view;
            this.f1646g = i2;
        }

        public void run() {
            g.j.b.e eVar = BottomSheetBehavior.this.z;
            if (eVar == null || !eVar.i(true)) {
                BottomSheetBehavior.this.K(this.f1646g);
            } else {
                View view = this.e;
                AtomicInteger atomicInteger = o.a;
                view.postOnAnimation(this);
            }
            this.f1645f = false;
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        int i3;
        this.f1631g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.e.a.a.b.b);
        this.f1632h = obtainStyledAttributes.hasValue(11);
        boolean hasValue = obtainStyledAttributes.hasValue(1);
        if (hasValue) {
            D(context, attributeSet, hasValue, c.e.a.a.a.g(context, obtainStyledAttributes, 1));
        } else {
            D(context, attributeSet, hasValue, null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.o = ofFloat;
        ofFloat.setDuration(500L);
        this.o.addUpdateListener(new c.e.a.a.g.a(this));
        this.u = obtainStyledAttributes.getDimension(0, -1.0f);
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue == null || (i3 = peekValue.data) != -1) {
            I(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        } else {
            I(i3);
        }
        boolean z2 = obtainStyledAttributes.getBoolean(6, false);
        if (this.v != z2) {
            this.v = z2;
            if (!z2 && this.y == 5) {
                J(4);
            }
            P();
        }
        this.f1635k = obtainStyledAttributes.getBoolean(10, false);
        boolean z3 = obtainStyledAttributes.getBoolean(4, true);
        if (this.b != z3) {
            this.b = z3;
            if (this.G != null) {
                B();
            }
            K((!this.b || this.y != 6) ? this.y : 3);
            P();
        }
        this.w = obtainStyledAttributes.getBoolean(9, false);
        this.x = obtainStyledAttributes.getBoolean(2, true);
        this.a = obtainStyledAttributes.getInt(8, 0);
        float f2 = obtainStyledAttributes.getFloat(5, 0.5f);
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.s = f2;
        if (this.G != null) {
            this.r = (int) ((1.0f - f2) * ((float) this.F));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(3);
        if (peekValue2 == null || peekValue2.type != 16) {
            i2 = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            if (i2 < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            i2 = peekValue2.data;
            if (i2 < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.p = i2;
        obtainStyledAttributes.recycle();
        this.f1628c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.y == 1 && actionMasked == 0) {
            return true;
        }
        g.j.b.e eVar = this.z;
        if (eVar != null) {
            eVar.n(motionEvent);
        }
        if (actionMasked == 0) {
            this.K = -1;
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.J = null;
            }
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        if (this.z != null && actionMasked == 2 && !this.A) {
            float abs = Math.abs(((float) this.L) - motionEvent.getY());
            g.j.b.e eVar2 = this.z;
            if (abs > ((float) eVar2.f2605c)) {
                eVar2.b(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.A;
    }

    public final void B() {
        int C2 = C();
        if (this.b) {
            this.t = Math.max(this.F - C2, this.q);
        } else {
            this.t = this.F - C2;
        }
    }

    public final int C() {
        int i2;
        return this.e ? Math.min(Math.max(this.f1630f, this.F - ((this.E * 9) / 16)), this.D) : (this.f1635k || (i2 = this.f1634j) <= 0) ? this.f1629d : Math.max(this.f1629d, i2 + this.f1631g);
    }

    public final void D(Context context, AttributeSet attributeSet, boolean z2, ColorStateList colorStateList) {
        if (this.f1632h) {
            this.f1636l = j.b(context, attributeSet, R.attr.bottomSheetStyle, 2131821141).a();
            g gVar = new g(this.f1636l);
            this.f1633i = gVar;
            gVar.f1340g.b = new c.e.a.a.o.a(context);
            gVar.w();
            if (!z2 || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f1633i.setTint(typedValue.data);
                return;
            }
            this.f1633i.p(colorStateList);
        }
    }

    public void E(int i2) {
        float f2;
        float f3;
        V v2 = this.G.get();
        if (!(v2 == null || this.I.isEmpty())) {
            int i3 = this.t;
            if (i2 > i3 || i3 == G()) {
                int i4 = this.t;
                f2 = (float) (i4 - i2);
                f3 = (float) (this.F - i4);
            } else {
                int i5 = this.t;
                f2 = (float) (i5 - i2);
                f3 = (float) (i5 - G());
            }
            float f4 = f2 / f3;
            for (int i6 = 0; i6 < this.I.size(); i6++) {
                this.I.get(i6).a(v2, f4);
            }
        }
    }

    public View F(View view) {
        AtomicInteger atomicInteger = o.a;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View F2 = F(viewGroup.getChildAt(i2));
            if (F2 != null) {
                return F2;
            }
        }
        return null;
    }

    public int G() {
        return this.b ? this.q : this.p;
    }

    public final void H(V v2, b.a aVar, int i2) {
        o.m(v2, aVar, null, new c.e.a.a.g.c(this, i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void I(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = -1
            r2 = 0
            if (r4 != r1) goto L_0x000c
            boolean r4 = r3.e
            if (r4 != 0) goto L_0x0015
            r3.e = r0
            goto L_0x001f
        L_0x000c:
            boolean r1 = r3.e
            if (r1 != 0) goto L_0x0017
            int r1 = r3.f1629d
            if (r1 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = r2
            goto L_0x001f
        L_0x0017:
            r3.e = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.f1629d = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.S(r2)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.I(int):void");
    }

    public void J(int i2) {
        if (i2 != this.y) {
            if (this.G != null) {
                M(i2);
            } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.v && i2 == 5)) {
                this.y = i2;
            }
        }
    }

    public void K(int i2) {
        V v2;
        if (this.y != i2) {
            this.y = i2;
            WeakReference<V> weakReference = this.G;
            if (!(weakReference == null || (v2 = weakReference.get()) == null)) {
                if (i2 == 3) {
                    R(true);
                } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                    R(false);
                }
                Q(i2);
                for (int i3 = 0; i3 < this.I.size(); i3++) {
                    this.I.get(i3).b(v2, i2);
                }
                P();
            }
        }
    }

    public void L(View view, int i2) {
        int i3;
        int i4;
        if (i2 == 4) {
            i3 = this.t;
        } else if (i2 == 6) {
            int i5 = this.r;
            if (!this.b || i5 > (i4 = this.q)) {
                i3 = i5;
            } else {
                i2 = 3;
                i3 = i4;
            }
        } else if (i2 == 3) {
            i3 = G();
        } else if (!this.v || i2 != 5) {
            throw new IllegalArgumentException(c.c.a.a.a.l("Illegal state argument: ", i2));
        } else {
            i3 = this.F;
        }
        O(view, i2, i3, false);
    }

    public final void M(int i2) {
        V v2 = this.G.get();
        if (v2 != null) {
            ViewParent parent = v2.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                AtomicInteger atomicInteger = o.a;
                if (v2.isAttachedToWindow()) {
                    v2.post(new a(v2, i2));
                    return;
                }
            }
            L(v2, i2);
        }
    }

    public boolean N(View view, float f2) {
        if (this.w) {
            return true;
        }
        if (view.getTop() < this.t) {
            return false;
        }
        return Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.t)) / ((float) C()) > 0.5f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r7 != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r0.t(r5.getLeft(), r7) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void O(android.view.View r5, int r6, int r7, boolean r8) {
        /*
            r4 = this;
            g.j.b.e r0 = r4.z
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0030
            if (r8 == 0) goto L_0x0013
            int r8 = r5.getLeft()
            boolean r7 = r0.t(r8, r7)
            if (r7 == 0) goto L_0x0030
            goto L_0x002f
        L_0x0013:
            int r8 = r5.getLeft()
            r0.t = r5
            r3 = -1
            r0.f2606d = r3
            boolean r7 = r0.l(r8, r7, r2, r2)
            if (r7 != 0) goto L_0x002d
            int r8 = r0.b
            if (r8 != 0) goto L_0x002d
            android.view.View r8 = r0.t
            if (r8 == 0) goto L_0x002d
            r8 = 0
            r0.t = r8
        L_0x002d:
            if (r7 == 0) goto L_0x0030
        L_0x002f:
            r2 = r1
        L_0x0030:
            if (r2 == 0) goto L_0x0056
            r7 = 2
            r4.K(r7)
            r4.Q(r6)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$e r7 = r4.n
            if (r7 != 0) goto L_0x0044
            com.google.android.material.bottomsheet.BottomSheetBehavior$e r7 = new com.google.android.material.bottomsheet.BottomSheetBehavior$e
            r7.<init>(r5, r6)
            r4.n = r7
        L_0x0044:
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$e r7 = r4.n
            boolean r8 = r7.f1645f
            r7.f1646g = r6
            if (r8 != 0) goto L_0x0059
            java.util.concurrent.atomic.AtomicInteger r6 = g.h.j.o.a
            r5.postOnAnimation(r7)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$e r5 = r4.n
            r5.f1645f = r1
            goto L_0x0059
        L_0x0056:
            r4.K(r6)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.O(android.view.View, int, int, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P() {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.P():void");
    }

    public final void Q(int i2) {
        ValueAnimator valueAnimator;
        if (i2 != 2) {
            boolean z2 = i2 == 3;
            if (this.f1637m != z2) {
                this.f1637m = z2;
                if (this.f1633i != null && (valueAnimator = this.o) != null) {
                    if (valueAnimator.isRunning()) {
                        this.o.reverse();
                        return;
                    }
                    float f2 = z2 ? 0.0f : 1.0f;
                    this.o.setFloatValues(1.0f - f2, f2);
                    this.o.start();
                }
            }
        }
    }

    public final void R(boolean z2) {
        WeakReference<V> weakReference = this.G;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z2) {
                    if (this.N == null) {
                        this.N = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.G.get() && z2) {
                        this.N.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z2) {
                    this.N = null;
                }
            }
        }
    }

    public final void S(boolean z2) {
        V v2;
        if (this.G != null) {
            B();
            if (this.y == 4 && (v2 = this.G.get()) != null) {
                if (z2) {
                    M(this.y);
                } else {
                    v2.requestLayout();
                }
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void f(CoordinatorLayout.f fVar) {
        this.G = null;
        this.z = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void i() {
        this.G = null;
        this.z = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        g.j.b.e eVar;
        if (!v2.isShown() || !this.x) {
            this.A = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked == 0) {
            this.K = -1;
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.J = null;
            }
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.L = (int) motionEvent.getY();
            if (this.y != 2) {
                WeakReference<View> weakReference = this.H;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.p(view2, x2, this.L)) {
                    this.K = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.M = true;
                }
            }
            this.A = this.K == -1 && !coordinatorLayout.p(v2, x2, this.L);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.M = false;
            this.K = -1;
            if (this.A) {
                this.A = false;
                return false;
            }
        }
        if (!this.A && (eVar = this.z) != null && eVar.u(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.H;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.A && this.y != 1 && !coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.z != null && Math.abs(((float) this.L) - motionEvent.getY()) > ((float) this.z.f2605c);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        int i3;
        g gVar;
        AtomicInteger atomicInteger = o.a;
        if (coordinatorLayout.getFitsSystemWindows() && !v2.getFitsSystemWindows()) {
            v2.setFitsSystemWindows(true);
        }
        if (this.G == null) {
            this.f1630f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.f1635k && !this.e) {
                o.c.c(v2, new l(new c.e.a.a.g.b(this), new c.e.a.a.r.o(v2.getPaddingStart(), v2.getPaddingTop(), v2.getPaddingEnd(), v2.getPaddingBottom())));
                if (v2.isAttachedToWindow()) {
                    v2.requestApplyInsets();
                } else {
                    v2.addOnAttachStateChangeListener(new m());
                }
            }
            this.G = new WeakReference<>(v2);
            if (this.f1632h && (gVar = this.f1633i) != null) {
                v2.setBackground(gVar);
            }
            g gVar2 = this.f1633i;
            if (gVar2 != null) {
                float f2 = this.u;
                if (f2 == -1.0f) {
                    f2 = v2.getElevation();
                }
                gVar2.o(f2);
                boolean z2 = this.y == 3;
                this.f1637m = z2;
                this.f1633i.q(z2 ? 0.0f : 1.0f);
            }
            P();
            if (v2.getImportantForAccessibility() == 0) {
                v2.setImportantForAccessibility(1);
            }
        }
        if (this.z == null) {
            this.z = new g.j.b.e(coordinatorLayout.getContext(), coordinatorLayout, this.P);
        }
        int top = v2.getTop();
        coordinatorLayout.r(v2, i2);
        this.E = coordinatorLayout.getWidth();
        this.F = coordinatorLayout.getHeight();
        int height = v2.getHeight();
        this.D = height;
        this.q = Math.max(0, this.F - height);
        this.r = (int) ((1.0f - this.s) * ((float) this.F));
        B();
        int i4 = this.y;
        if (i4 == 3) {
            i3 = G();
        } else if (i4 == 6) {
            i3 = this.r;
        } else if (this.v && i4 == 5) {
            i3 = this.F;
        } else if (i4 == 4) {
            i3 = this.t;
        } else {
            if (i4 == 1 || i4 == 2) {
                v2.offsetTopAndBottom(top - v2.getTop());
            }
            this.H = new WeakReference<>(F(v2));
            return true;
        }
        v2.offsetTopAndBottom(i3);
        this.H = new WeakReference<>(F(v2));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean n(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.H;
        return (weakReference == null || view != weakReference.get() || this.y == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void p(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        int i5;
        if (i4 != 1) {
            WeakReference<View> weakReference = this.H;
            if (view == (weakReference != null ? weakReference.get() : null)) {
                int top = v2.getTop();
                int i6 = top - i3;
                if (i3 <= 0) {
                    if (i3 < 0 && !view.canScrollVertically(-1)) {
                        int i7 = this.t;
                        if (i6 > i7 && !this.v) {
                            iArr[1] = top - i7;
                            AtomicInteger atomicInteger = o.a;
                            v2.offsetTopAndBottom(-iArr[1]);
                            i5 = 4;
                            K(i5);
                        } else if (this.x) {
                            iArr[1] = i3;
                        } else {
                            return;
                        }
                    }
                    E(v2.getTop());
                    this.B = i3;
                    this.C = true;
                } else if (i6 < G()) {
                    iArr[1] = top - G();
                    AtomicInteger atomicInteger2 = o.a;
                    v2.offsetTopAndBottom(-iArr[1]);
                    i5 = 3;
                    K(i5);
                    E(v2.getTop());
                    this.B = i3;
                    this.C = true;
                } else if (this.x) {
                    iArr[1] = i3;
                } else {
                    return;
                }
                int i8 = -i3;
                AtomicInteger atomicInteger3 = o.a;
                v2.offsetTopAndBottom(i8);
                K(1);
                E(v2.getTop());
                this.B = i3;
                this.C = true;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f1629d = dVar.f1641h;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.b = dVar.f1642i;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.v = dVar.f1643j;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.w = dVar.f1644k;
            }
        }
        int i3 = dVar.f1640g;
        if (i3 == 1 || i3 == 2) {
            this.y = 4;
        } else {
            this.y = i3;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable v(CoordinatorLayout coordinatorLayout, V v2) {
        return new d((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean x(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.B = 0;
        this.C = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r4 > r6) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (java.lang.Math.abs(r4 - r3.q) < java.lang.Math.abs(r4 - r3.t)) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        if (r4 < java.lang.Math.abs(r4 - r3.t)) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        r4 = r3.p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.t)) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b0, code lost:
        if (java.lang.Math.abs(r4 - r3.r) < java.lang.Math.abs(r4 - r3.t)) goto L_0x00b2;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.z(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }
}
