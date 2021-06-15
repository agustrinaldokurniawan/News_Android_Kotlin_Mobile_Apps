package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.tsuga.news.R;
import g.q.c.a;
import g.q.c.a0;
import g.q.c.b;
import g.q.c.b0;
import g.q.c.k;
import g.q.c.m;
import g.q.c.x;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class RecyclerView extends ViewGroup implements g.h.j.f {
    public static final int[] e = {16843830};

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f232f;

    /* renamed from: g  reason: collision with root package name */
    public static final Interpolator f233g = new b();
    public boolean A;
    public final List<z> A0;
    public boolean B;
    public Runnable B0;
    public int C;
    public boolean C0;
    public boolean D;
    public int D0;
    public boolean E;
    public int E0;
    public boolean F;
    public final b0.b F0;
    public int G;
    public final AccessibilityManager H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public h M;
    public EdgeEffect N;
    public EdgeEffect O;
    public EdgeEffect P;
    public EdgeEffect Q;
    public i R;
    public int S;
    public int T;
    public VelocityTracker U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public n d0;
    public final int e0;
    public final int f0;
    public float g0;

    /* renamed from: h  reason: collision with root package name */
    public final t f234h;
    public float h0;

    /* renamed from: i  reason: collision with root package name */
    public final r f235i;
    public boolean i0;

    /* renamed from: j  reason: collision with root package name */
    public u f236j;
    public final y j0;

    /* renamed from: k  reason: collision with root package name */
    public g.q.c.a f237k;
    public g.q.c.m k0;

    /* renamed from: l  reason: collision with root package name */
    public g.q.c.b f238l;
    public m.b l0;

    /* renamed from: m  reason: collision with root package name */
    public final b0 f239m;
    public final w m0;
    public boolean n;
    public p n0;
    public final Rect o;
    public List<p> o0;
    public final Rect p;
    public boolean p0;
    public final RectF q;
    public boolean q0;
    public d r;
    public i.b r0;
    public l s;
    public boolean s0;
    public s t;
    public g.q.c.x t0;
    public final List<s> u;
    public g u0;
    public final ArrayList<k> v;
    public final int[] v0;
    public final ArrayList<o> w;
    public g.h.j.g w0;
    public o x;
    public final int[] x0;
    public boolean y;
    public final int[] y0;
    public boolean z;
    public final int[] z0;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            i iVar = RecyclerView.this.R;
            if (iVar != null) {
                g.q.c.k kVar = (g.q.c.k) iVar;
                boolean z = !kVar.f2909i.isEmpty();
                boolean z2 = !kVar.f2911k.isEmpty();
                boolean z3 = !kVar.f2912l.isEmpty();
                boolean z4 = !kVar.f2910j.isEmpty();
                if (z || z2 || z4 || z3) {
                    Iterator<z> it = kVar.f2909i.iterator();
                    while (it.hasNext()) {
                        z next = it.next();
                        View view = next.b;
                        ViewPropertyAnimator animate = view.animate();
                        kVar.r.add(next);
                        animate.setDuration(kVar.f242d).alpha(0.0f).setListener(new g.q.c.f(kVar, next, animate, view)).start();
                    }
                    kVar.f2909i.clear();
                    if (z2) {
                        ArrayList<k.b> arrayList = new ArrayList<>();
                        arrayList.addAll(kVar.f2911k);
                        kVar.n.add(arrayList);
                        kVar.f2911k.clear();
                        g.q.c.c cVar = new g.q.c.c(kVar, arrayList);
                        if (z) {
                            View view2 = arrayList.get(0).a.b;
                            long j2 = kVar.f242d;
                            AtomicInteger atomicInteger = g.h.j.o.a;
                            view2.postOnAnimationDelayed(cVar, j2);
                        } else {
                            cVar.run();
                        }
                    }
                    if (z3) {
                        ArrayList<k.a> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(kVar.f2912l);
                        kVar.o.add(arrayList2);
                        kVar.f2912l.clear();
                        g.q.c.d dVar = new g.q.c.d(kVar, arrayList2);
                        if (z) {
                            View view3 = arrayList2.get(0).a.b;
                            long j3 = kVar.f242d;
                            AtomicInteger atomicInteger2 = g.h.j.o.a;
                            view3.postOnAnimationDelayed(dVar, j3);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z4) {
                        ArrayList<z> arrayList3 = new ArrayList<>();
                        arrayList3.addAll(kVar.f2910j);
                        kVar.f2913m.add(arrayList3);
                        kVar.f2910j.clear();
                        g.q.c.e eVar = new g.q.c.e(kVar, arrayList3);
                        if (z || z2 || z3) {
                            long j4 = 0;
                            long j5 = z ? kVar.f242d : 0;
                            long j6 = z2 ? kVar.e : 0;
                            if (z3) {
                                j4 = kVar.f243f;
                            }
                            View view4 = arrayList3.get(0).b;
                            AtomicInteger atomicInteger3 = g.h.j.o.a;
                            view4.postOnAnimationDelayed(eVar, Math.max(j6, j4) + j5);
                        } else {
                            eVar.run();
                        }
                    }
                }
            }
            RecyclerView.this.s0 = false;
        }
    }

    public class b implements Interpolator {
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    public class c implements b0.b {
        public c() {
        }

        public void a(z zVar, i.c cVar, i.c cVar2) {
            boolean z;
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            Objects.requireNonNull(recyclerView);
            zVar.t(false);
            g.q.c.y yVar = (g.q.c.y) recyclerView.R;
            Objects.requireNonNull(yVar);
            if (cVar == null || ((i2 = cVar.a) == (i3 = cVar2.a) && cVar.b == cVar2.b)) {
                g.q.c.k kVar = (g.q.c.k) yVar;
                kVar.n(zVar);
                zVar.b.setAlpha(0.0f);
                kVar.f2910j.add(zVar);
                z = true;
            } else {
                z = yVar.i(zVar, i2, cVar.b, i3, cVar2.b);
            }
            if (z) {
                recyclerView.Z();
            }
        }

        public void b(z zVar, i.c cVar, i.c cVar2) {
            boolean z;
            RecyclerView.this.f235i.k(zVar);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f(zVar);
            zVar.t(false);
            g.q.c.y yVar = (g.q.c.y) recyclerView.R;
            Objects.requireNonNull(yVar);
            int i2 = cVar.a;
            int i3 = cVar.b;
            View view = zVar.b;
            int left = cVar2 == null ? view.getLeft() : cVar2.a;
            int top = cVar2 == null ? view.getTop() : cVar2.b;
            if (zVar.m() || (i2 == left && i3 == top)) {
                g.q.c.k kVar = (g.q.c.k) yVar;
                kVar.n(zVar);
                kVar.f2909i.add(zVar);
                z = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z = yVar.i(zVar, i2, i3, left, top);
            }
            if (z) {
                recyclerView.Z();
            }
        }
    }

    public static abstract class d<VH extends z> {
        public final e a = new e();
        public boolean b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f240c = 1;

        public abstract int a();

        public long b(int i2) {
            return -1;
        }

        public abstract void c(VH vh, int i2);

        public abstract VH d(ViewGroup viewGroup, int i2);
    }

    public static class e extends Observable<f> {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).a();
            }
        }
    }

    public static abstract class f {
        public void a() {
        }
    }

    public interface g {
        int a(int i2, int i3);
    }

    public static class h {
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class i {
        public b a = null;
        public ArrayList<a> b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public long f241c = 120;

        /* renamed from: d  reason: collision with root package name */
        public long f242d = 120;
        public long e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f243f = 250;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {
            public int a;
            public int b;
        }

        public static int b(z zVar) {
            int i2 = zVar.f298k & 14;
            if (zVar.k()) {
                return 4;
            }
            if ((i2 & 4) != 0) {
                return i2;
            }
            int i3 = zVar.e;
            int e2 = zVar.e();
            return (i3 == -1 || e2 == -1 || i3 == e2) ? i2 : i2 | 2048;
        }

        public abstract boolean a(z zVar, z zVar2, c cVar, c cVar2);

        public final void c(z zVar) {
            b bVar = this.a;
            if (bVar != null) {
                j jVar = (j) bVar;
                Objects.requireNonNull(jVar);
                boolean z = true;
                zVar.t(true);
                if (zVar.f296i != null && zVar.f297j == null) {
                    zVar.f296i = null;
                }
                zVar.f297j = null;
                if (!((zVar.f298k & 16) != 0)) {
                    RecyclerView recyclerView = RecyclerView.this;
                    View view = zVar.b;
                    recyclerView.l0();
                    g.q.c.b bVar2 = recyclerView.f238l;
                    int indexOfChild = ((g.q.c.v) bVar2.a).a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        bVar2.l(view);
                    } else if (bVar2.b.d(indexOfChild)) {
                        bVar2.b.f(indexOfChild);
                        bVar2.l(view);
                        ((g.q.c.v) bVar2.a).c(indexOfChild);
                    } else {
                        z = false;
                    }
                    if (z) {
                        z K = RecyclerView.K(view);
                        recyclerView.f235i.k(K);
                        recyclerView.f235i.h(K);
                    }
                    recyclerView.n0(!z);
                    if (!z && zVar.o()) {
                        RecyclerView.this.removeDetachedView(zVar.b, false);
                    }
                }
            }
        }

        public final void d() {
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.b.get(i2).a();
            }
            this.b.clear();
        }

        public abstract void e(z zVar);

        public abstract void f();

        public abstract boolean g();

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/recyclerview/widget/RecyclerView$w;Landroidx/recyclerview/widget/RecyclerView$z;ILjava/util/List<Ljava/lang/Object;>;)Landroidx/recyclerview/widget/RecyclerView$i$c; */
        public c h(z zVar) {
            c cVar = new c();
            View view = zVar.b;
            cVar.a = view.getLeft();
            cVar.b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }
    }

    public class j implements i.b {
        public j() {
        }
    }

    public static abstract class k {
        public void d(Canvas canvas, RecyclerView recyclerView, w wVar) {
        }

        public void e(Canvas canvas, RecyclerView recyclerView, w wVar) {
        }
    }

    public static abstract class l {
        public g.q.c.b a;
        public RecyclerView b;

        /* renamed from: c  reason: collision with root package name */
        public final a0.b f244c;

        /* renamed from: d  reason: collision with root package name */
        public final a0.b f245d;
        public a0 e;

        /* renamed from: f  reason: collision with root package name */
        public a0 f246f;

        /* renamed from: g  reason: collision with root package name */
        public v f247g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f248h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f249i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f250j = true;

        /* renamed from: k  reason: collision with root package name */
        public boolean f251k = true;

        /* renamed from: l  reason: collision with root package name */
        public int f252l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f253m;
        public int n;
        public int o;
        public int p;
        public int q;

        public class a implements a0.b {
            public a() {
            }

            @Override // g.q.c.a0.b
            public View a(int i2) {
                return l.this.x(i2);
            }

            @Override // g.q.c.a0.b
            public int b() {
                l lVar = l.this;
                return lVar.p - lVar.P();
            }

            @Override // g.q.c.a0.b
            public int c() {
                return l.this.O();
            }

            @Override // g.q.c.a0.b
            public int d(View view) {
                return l.this.G(view) + ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).rightMargin;
            }

            @Override // g.q.c.a0.b
            public int e(View view) {
                return l.this.D(view) - ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).leftMargin;
            }
        }

        public class b implements a0.b {
            public b() {
            }

            @Override // g.q.c.a0.b
            public View a(int i2) {
                return l.this.x(i2);
            }

            @Override // g.q.c.a0.b
            public int b() {
                l lVar = l.this;
                return lVar.q - lVar.N();
            }

            @Override // g.q.c.a0.b
            public int c() {
                return l.this.Q();
            }

            @Override // g.q.c.a0.b
            public int d(View view) {
                return l.this.B(view) + ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).bottomMargin;
            }

            @Override // g.q.c.a0.b
            public int e(View view) {
                return l.this.H(view) - ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).topMargin;
            }
        }

        public interface c {
        }

        public static class d {
            public int a;
            public int b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f254c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f255d;
        }

        public l() {
            a aVar = new a();
            this.f244c = aVar;
            b bVar = new b();
            this.f245d = bVar;
            this.e = new a0(aVar);
            this.f246f = new a0(bVar);
        }

        public static d S(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.q.b.a, i2, i3);
            dVar.a = obtainStyledAttributes.getInt(0, 1);
            dVar.b = obtainStyledAttributes.getInt(10, 1);
            dVar.f254c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f255d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static boolean Y(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        public static int h(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int z(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0020
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001e
            L_0x001c:
                r5 = r3
                goto L_0x0031
            L_0x001e:
                if (r7 != r1) goto L_0x0022
            L_0x0020:
                r7 = r4
                goto L_0x0031
            L_0x0022:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r7 = r4
                r5 = r6
                goto L_0x0031
            L_0x002c:
                r7 = r4
                r5 = r2
                goto L_0x0031
            L_0x002f:
                r5 = r6
                r7 = r5
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.z(int, int, int, int, boolean):int");
        }

        public int A(r rVar, w wVar) {
            return -1;
        }

        public Parcelable A0() {
            return null;
        }

        public int B(View view) {
            return view.getBottom() + ((m) view.getLayoutParams()).b.bottom;
        }

        public void B0(int i2) {
        }

        public void C(View view, Rect rect) {
            int[] iArr = RecyclerView.e;
            m mVar = (m) view.getLayoutParams();
            Rect rect2 = mVar.b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) mVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) mVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) mVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x006e A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean C0(int r11) {
            /*
            // Method dump skipped, instructions count: 123
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.C0(int):boolean");
        }

        public int D(View view) {
            return view.getLeft() - ((m) view.getLayoutParams()).b.left;
        }

        public boolean D0() {
            return false;
        }

        public int E(View view) {
            Rect rect = ((m) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void E0(r rVar) {
            for (int y = y() - 1; y >= 0; y--) {
                if (!RecyclerView.K(x(y)).u()) {
                    H0(y, rVar);
                }
            }
        }

        public int F(View view) {
            Rect rect = ((m) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void F0(r rVar) {
            int size = rVar.a.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                View view = rVar.a.get(i2).b;
                z K = RecyclerView.K(view);
                if (!K.u()) {
                    K.t(false);
                    if (K.o()) {
                        this.b.removeDetachedView(view, false);
                    }
                    i iVar = this.b.R;
                    if (iVar != null) {
                        iVar.e(K);
                    }
                    K.t(true);
                    z K2 = RecyclerView.K(view);
                    K2.o = null;
                    K2.p = false;
                    K2.d();
                    rVar.h(K2);
                }
            }
            rVar.a.clear();
            ArrayList<z> arrayList = rVar.b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.b.invalidate();
            }
        }

        public int G(View view) {
            return view.getRight() + ((m) view.getLayoutParams()).b.right;
        }

        public void G0(View view, r rVar) {
            g.q.c.b bVar = this.a;
            int indexOfChild = ((g.q.c.v) bVar.a).a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (bVar.b.f(indexOfChild)) {
                    bVar.l(view);
                }
                ((g.q.c.v) bVar.a).c(indexOfChild);
            }
            rVar.g(view);
        }

        public int H(View view) {
            return view.getTop() - ((m) view.getLayoutParams()).b.top;
        }

        public void H0(int i2, r rVar) {
            View x = x(i2);
            I0(i2);
            rVar.g(x);
        }

        public View I() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.f2891c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void I0(int i2) {
            g.q.c.b bVar;
            int f2;
            View a2;
            if (x(i2) != null && (a2 = ((g.q.c.v) bVar.a).a((f2 = (bVar = this.a).f(i2)))) != null) {
                if (bVar.b.f(f2)) {
                    bVar.l(a2);
                }
                ((g.q.c.v) bVar.a).c(f2);
            }
        }

        public int J() {
            RecyclerView recyclerView = this.b;
            d adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.a();
            }
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
            if (r1 == false) goto L_0x00bf;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean J0(androidx.recyclerview.widget.RecyclerView r19, android.view.View r20, android.graphics.Rect r21, boolean r22, boolean r23) {
            /*
            // Method dump skipped, instructions count: 213
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.J0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public int K() {
            RecyclerView recyclerView = this.b;
            AtomicInteger atomicInteger = g.h.j.o.a;
            return recyclerView.getLayoutDirection();
        }

        public void K0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int L() {
            RecyclerView recyclerView = this.b;
            AtomicInteger atomicInteger = g.h.j.o.a;
            return recyclerView.getMinimumHeight();
        }

        public int L0(int i2, r rVar, w wVar) {
            return 0;
        }

        public int M() {
            RecyclerView recyclerView = this.b;
            AtomicInteger atomicInteger = g.h.j.o.a;
            return recyclerView.getMinimumWidth();
        }

        public void M0(int i2) {
        }

        public int N() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int N0(int i2, r rVar, w wVar) {
            return 0;
        }

        public int O() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void O0(RecyclerView recyclerView) {
            P0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int P() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void P0(int i2, int i3) {
            this.p = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.n = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.e;
            }
            this.q = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.o = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.e;
            }
        }

        public int Q() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public void Q0(Rect rect, int i2, int i3) {
            int P = P() + O() + rect.width();
            int N = N() + Q() + rect.height();
            this.b.setMeasuredDimension(h(i2, P, M()), h(i3, N, L()));
        }

        public int R(View view) {
            return ((m) view.getLayoutParams()).a();
        }

        public void R0(int i2, int i3) {
            int y = y();
            if (y == 0) {
                this.b.o(i2, i3);
                return;
            }
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MIN_VALUE;
            for (int i8 = 0; i8 < y; i8++) {
                View x = x(i8);
                Rect rect = this.b.o;
                C(x, rect);
                int i9 = rect.left;
                if (i9 < i5) {
                    i5 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i6) {
                    i6 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i7) {
                    i7 = i12;
                }
            }
            this.b.o.set(i5, i6, i4, i7);
            Q0(this.b.o, i2, i3);
        }

        public void S0(RecyclerView recyclerView) {
            int i2;
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                i2 = 0;
                this.p = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.f238l;
                this.p = recyclerView.getWidth();
                i2 = recyclerView.getHeight();
            }
            this.q = i2;
            this.n = 1073741824;
            this.o = 1073741824;
        }

        public int T(r rVar, w wVar) {
            return -1;
        }

        public boolean T0(View view, int i2, int i3, m mVar) {
            return view.isLayoutRequested() || !this.f250j || !Y(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) mVar).width) || !Y(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) mVar).height);
        }

        public int U() {
            return 0;
        }

        public boolean U0() {
            return false;
        }

        public void V(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((m) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.b.q;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean V0(View view, int i2, int i3, m mVar) {
            return !this.f250j || !Y(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) mVar).width) || !Y(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) mVar).height);
        }

        public boolean W() {
            return false;
        }

        public void W0(RecyclerView recyclerView, w wVar, int i2) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public boolean X() {
            return false;
        }

        public void X0(v vVar) {
            v vVar2 = this.f247g;
            if (!(vVar2 == null || vVar == vVar2 || !vVar2.e)) {
                vVar2.d();
            }
            this.f247g = vVar;
            RecyclerView recyclerView = this.b;
            recyclerView.j0.c();
            if (vVar.f270h) {
                StringBuilder f2 = c.c.a.a.a.f("An instance of ");
                f2.append(vVar.getClass().getSimpleName());
                f2.append(" was started more than once. Each instance of");
                f2.append(vVar.getClass().getSimpleName());
                f2.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", f2.toString());
            }
            vVar.b = recyclerView;
            vVar.f266c = this;
            int i2 = vVar.a;
            if (i2 != -1) {
                recyclerView.m0.a = i2;
                vVar.e = true;
                vVar.f267d = true;
                vVar.f268f = recyclerView.s.t(i2);
                vVar.b.j0.a();
                vVar.f270h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public boolean Y0() {
            return false;
        }

        public boolean Z(View view, boolean z) {
            boolean z2 = this.e.b(view, 24579) && this.f246f.b(view, 24579);
            return z ? z2 : !z2;
        }

        public void a0(View view, int i2, int i3, int i4, int i5) {
            m mVar = (m) view.getLayoutParams();
            Rect rect = mVar.b;
            view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) mVar).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) mVar).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) mVar).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) mVar).bottomMargin);
        }

        public void b(View view) {
            c(view, -1, false);
        }

        public void b0(int i2) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int e2 = recyclerView.f238l.e();
                for (int i3 = 0; i3 < e2; i3++) {
                    recyclerView.f238l.d(i3).offsetLeftAndRight(i2);
                }
            }
        }

        public final void c(View view, int i2, boolean z) {
            z K = RecyclerView.K(view);
            if (z || K.m()) {
                this.b.f239m.a(K);
            } else {
                this.b.f239m.f(K);
            }
            m mVar = (m) view.getLayoutParams();
            if (K.v() || K.n()) {
                if (K.n()) {
                    K.o.k(K);
                } else {
                    K.d();
                }
                this.a.b(view, i2, view.getLayoutParams(), false);
            } else {
                int i3 = -1;
                if (view.getParent() == this.b) {
                    int j2 = this.a.j(view);
                    if (i2 == -1) {
                        i2 = this.a.e();
                    }
                    if (j2 == -1) {
                        StringBuilder f2 = c.c.a.a.a.f("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        f2.append(this.b.indexOfChild(view));
                        throw new IllegalStateException(c.c.a.a.a.j(this.b, f2));
                    } else if (j2 != i2) {
                        l lVar = this.b.s;
                        View x = lVar.x(j2);
                        if (x != null) {
                            lVar.x(j2);
                            lVar.r(j2);
                            m mVar2 = (m) x.getLayoutParams();
                            z K2 = RecyclerView.K(x);
                            if (K2.m()) {
                                lVar.b.f239m.a(K2);
                            } else {
                                lVar.b.f239m.f(K2);
                            }
                            lVar.a.b(x, i2, mVar2, K2.m());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j2 + lVar.b.toString());
                        }
                    }
                } else {
                    this.a.a(view, i2, false);
                    mVar.f256c = true;
                    v vVar = this.f247g;
                    if (vVar != null && vVar.e) {
                        Objects.requireNonNull(vVar.b);
                        z K3 = RecyclerView.K(view);
                        if (K3 != null) {
                            i3 = K3.f();
                        }
                        if (i3 == vVar.a) {
                            vVar.f268f = view;
                        }
                    }
                }
            }
            if (mVar.f257d) {
                K.b.invalidate();
                mVar.f257d = false;
            }
        }

        public void c0(int i2) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int e2 = recyclerView.f238l.e();
                for (int i3 = 0; i3 < e2; i3++) {
                    recyclerView.f238l.d(i3).offsetTopAndBottom(i2);
                }
            }
        }

        public void d(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.i(str);
            }
        }

        public void d0(d dVar, d dVar2) {
        }

        public boolean e() {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/recyclerview/widget/RecyclerView;Ljava/util/ArrayList<Landroid/view/View;>;II)Z */
        public boolean e0() {
            return false;
        }

        public boolean f() {
            return false;
        }

        public void f0() {
        }

        public boolean g(m mVar) {
            return mVar != null;
        }

        @Deprecated
        public void g0() {
        }

        public void h0(RecyclerView recyclerView, r rVar) {
            g0();
        }

        public void i(int i2, int i3, w wVar, c cVar) {
        }

        public View i0(View view, int i2, r rVar, w wVar) {
            return null;
        }

        public void j(int i2, c cVar) {
        }

        public void j0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            r rVar = recyclerView.f235i;
            w wVar = recyclerView.m0;
            k0(accessibilityEvent);
        }

        public int k(w wVar) {
            return 0;
        }

        public void k0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                d dVar = this.b.r;
                if (dVar != null) {
                    accessibilityEvent.setItemCount(dVar.a());
                }
            }
        }

        public int l(w wVar) {
            return 0;
        }

        public void l0(View view, g.h.j.z.b bVar) {
            z K = RecyclerView.K(view);
            if (K != null && !K.m() && !this.a.k(K.b)) {
                RecyclerView recyclerView = this.b;
                m0(recyclerView.f235i, recyclerView.m0, view, bVar);
            }
        }

        public int m(w wVar) {
            return 0;
        }

        public void m0(r rVar, w wVar, View view, g.h.j.z.b bVar) {
        }

        public int n(w wVar) {
            return 0;
        }

        public View n0() {
            return null;
        }

        public int o(w wVar) {
            return 0;
        }

        public void o0(RecyclerView recyclerView, int i2, int i3) {
        }

        public int p(w wVar) {
            return 0;
        }

        public void p0(RecyclerView recyclerView) {
        }

        public void q(r rVar) {
            int y = y();
            while (true) {
                y--;
                if (y >= 0) {
                    View x = x(y);
                    z K = RecyclerView.K(x);
                    if (!K.u()) {
                        if (!K.k() || K.m() || this.b.r.b) {
                            x(y);
                            r(y);
                            rVar.i(x);
                            this.b.f239m.f(K);
                        } else {
                            I0(y);
                            rVar.h(K);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public void q0(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public final void r(int i2) {
            this.a.c(i2);
        }

        public void r0(RecyclerView recyclerView, int i2, int i3) {
        }

        public View s(View view) {
            View C;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (C = recyclerView.C(view)) == null || this.a.f2891c.contains(C)) {
                return null;
            }
            return C;
        }

        public void s0() {
        }

        public View t(int i2) {
            int y = y();
            for (int i3 = 0; i3 < y; i3++) {
                View x = x(i3);
                z K = RecyclerView.K(x);
                if (K != null && K.f() == i2 && !K.u() && (this.b.m0.f278g || !K.m())) {
                    return x;
                }
            }
            return null;
        }

        public void t0(RecyclerView recyclerView, int i2, int i3, Object obj) {
            s0();
        }

        public abstract m u();

        public void u0(r rVar, w wVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public m v(Context context, AttributeSet attributeSet) {
            return new m(context, attributeSet);
        }

        public void v0(w wVar) {
        }

        public m w(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof m ? new m((m) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new m((ViewGroup.MarginLayoutParams) layoutParams) : new m(layoutParams);
        }

        public void w0(int i2, int i3) {
            this.b.o(i2, i3);
        }

        public View x(int i2) {
            g.q.c.b bVar = this.a;
            if (bVar == null) {
                return null;
            }
            return ((g.q.c.v) bVar.a).a(bVar.f(i2));
        }

        @Deprecated
        public boolean x0(RecyclerView recyclerView) {
            v vVar = this.f247g;
            return (vVar != null && vVar.e) || recyclerView.O();
        }

        public int y() {
            g.q.c.b bVar = this.a;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public boolean y0(RecyclerView recyclerView, View view, View view2) {
            return x0(recyclerView);
        }

        public void z0(Parcelable parcelable) {
        }
    }

    public static class m extends ViewGroup.MarginLayoutParams {
        public z a;
        public final Rect b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public boolean f256c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f257d = false;

        public m(int i2, int i3) {
            super(i2, i3);
        }

        public m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public m(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public m(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public m(m mVar) {
            super((ViewGroup.LayoutParams) mVar);
        }

        public int a() {
            return this.a.f();
        }

        public boolean b() {
            return this.a.p();
        }

        public boolean c() {
            return this.a.m();
        }
    }

    public static abstract class n {
    }

    public interface o {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z);
    }

    public static abstract class p {
        public void a(RecyclerView recyclerView, int i2) {
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    public static class q {
        public SparseArray<a> a = new SparseArray<>();
        public int b = 0;

        public static class a {
            public final ArrayList<z> a = new ArrayList<>();
            public int b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f258c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f259d = 0;
        }

        public final a a(int i2) {
            a aVar = this.a.get(i2);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.a.put(i2, aVar2);
            return aVar2;
        }

        public long b(long j2, long j3) {
            if (j2 == 0) {
                return j3;
            }
            return (j3 / 4) + ((j2 / 4) * 3);
        }
    }

    public final class r {
        public final ArrayList<z> a;
        public ArrayList<z> b = null;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<z> f260c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final List<z> f261d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f262f;

        /* renamed from: g  reason: collision with root package name */
        public q f263g;

        public r() {
            ArrayList<z> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.f261d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f262f = 2;
        }

        public void a(z zVar, boolean z) {
            RecyclerView.k(zVar);
            View view = zVar.b;
            g.q.c.x xVar = RecyclerView.this.t0;
            if (xVar != null) {
                x.a aVar = xVar.e;
                g.h.j.o.o(view, aVar instanceof x.a ? aVar.e.remove(view) : null);
            }
            if (z) {
                s sVar = RecyclerView.this.t;
                if (sVar != null) {
                    sVar.a(zVar);
                }
                int size = RecyclerView.this.u.size();
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView.this.u.get(i2).a(zVar);
                }
                RecyclerView recyclerView = RecyclerView.this;
                d dVar = recyclerView.r;
                if (recyclerView.m0 != null) {
                    recyclerView.f239m.g(zVar);
                }
            }
            zVar.t = null;
            zVar.s = null;
            q d2 = d();
            Objects.requireNonNull(d2);
            int i3 = zVar.f294g;
            ArrayList<z> arrayList = d2.a(i3).a;
            if (d2.a.get(i3).b > arrayList.size()) {
                zVar.r();
                arrayList.add(zVar);
            }
        }

        public void b() {
            this.a.clear();
            e();
        }

        public int c(int i2) {
            if (i2 < 0 || i2 >= RecyclerView.this.m0.b()) {
                StringBuilder g2 = c.c.a.a.a.g("invalid position ", i2, ". State item count is ");
                g2.append(RecyclerView.this.m0.b());
                throw new IndexOutOfBoundsException(c.c.a.a.a.j(RecyclerView.this, g2));
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.m0.f278g) {
                return i2;
            }
            return recyclerView.f237k.f(i2, 0);
        }

        public q d() {
            if (this.f263g == null) {
                this.f263g = new q();
            }
            return this.f263g;
        }

        public void e() {
            for (int size = this.f260c.size() - 1; size >= 0; size--) {
                f(size);
            }
            this.f260c.clear();
            int[] iArr = RecyclerView.e;
            m.b bVar = RecyclerView.this.l0;
            int[] iArr2 = bVar.f2934c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            bVar.f2935d = 0;
        }

        public void f(int i2) {
            a(this.f260c.get(i2), true);
            this.f260c.remove(i2);
        }

        public void g(View view) {
            z K = RecyclerView.K(view);
            if (K.o()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (K.n()) {
                K.o.k(K);
            } else if (K.v()) {
                K.d();
            }
            h(K);
            if (RecyclerView.this.R != null && !K.l()) {
                RecyclerView.this.R.e(K);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0092  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h(androidx.recyclerview.widget.RecyclerView.z r7) {
            /*
            // Method dump skipped, instructions count: 251
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r.h(androidx.recyclerview.widget.RecyclerView$z):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void i(android.view.View r5) {
            /*
            // Method dump skipped, instructions count: 134
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r.i(android.view.View):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:102:0x01e5, code lost:
            if (r7.f294g != 0) goto L_0x01fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x0447, code lost:
            if (r7.k() == false) goto L_0x047f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x047d, code lost:
            if ((r10 == 0 || r10 + r8 < r18) == false) goto L_0x047f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x0247  */
        /* JADX WARNING: Removed duplicated region for block: B:212:0x040f  */
        /* JADX WARNING: Removed duplicated region for block: B:220:0x0439  */
        /* JADX WARNING: Removed duplicated region for block: B:229:0x0466  */
        /* JADX WARNING: Removed duplicated region for block: B:239:0x048e  */
        /* JADX WARNING: Removed duplicated region for block: B:240:0x0490  */
        /* JADX WARNING: Removed duplicated region for block: B:242:0x0493  */
        /* JADX WARNING: Removed duplicated region for block: B:248:0x04b6  */
        /* JADX WARNING: Removed duplicated region for block: B:262:0x04ff  */
        /* JADX WARNING: Removed duplicated region for block: B:275:0x052f  */
        /* JADX WARNING: Removed duplicated region for block: B:278:0x0538  */
        /* JADX WARNING: Removed duplicated region for block: B:282:0x0543  */
        /* JADX WARNING: Removed duplicated region for block: B:283:0x054a  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x008f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.z j(int r16, boolean r17, long r18) {
            /*
            // Method dump skipped, instructions count: 1437
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r.j(int, boolean, long):androidx.recyclerview.widget.RecyclerView$z");
        }

        public void k(z zVar) {
            (zVar.p ? this.b : this.a).remove(zVar);
            zVar.o = null;
            zVar.p = false;
            zVar.d();
        }

        public void l() {
            l lVar = RecyclerView.this.s;
            this.f262f = this.e + (lVar != null ? lVar.f252l : 0);
            for (int size = this.f260c.size() - 1; size >= 0 && this.f260c.size() > this.f262f; size--) {
                f(size);
            }
        }
    }

    public interface s {
        void a(z zVar);
    }

    public class t extends f {
        public t() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public void a() {
            RecyclerView.this.i(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m0.f277f = true;
            recyclerView.b0(true);
            if (!RecyclerView.this.f237k.g()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    public static class u extends g.j.a.a {
        public static final Parcelable.Creator<u> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public Parcelable f265g;

        public class a implements Parcelable.ClassLoaderCreator<u> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new u(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new u[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public u createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new u(parcel, classLoader);
            }
        }

        public u(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f265g = parcel.readParcelable(classLoader == null ? l.class.getClassLoader() : classLoader);
        }

        public u(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // g.j.a.a
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f2593f, i2);
            parcel.writeParcelable(this.f265g, 0);
        }
    }

    public static abstract class v {
        public int a = -1;
        public RecyclerView b;

        /* renamed from: c  reason: collision with root package name */
        public l f266c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f267d;
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public View f268f;

        /* renamed from: g  reason: collision with root package name */
        public final a f269g = new a(0, 0);

        /* renamed from: h  reason: collision with root package name */
        public boolean f270h;

        public static class a {
            public int a;
            public int b;

            /* renamed from: c  reason: collision with root package name */
            public int f271c;

            /* renamed from: d  reason: collision with root package name */
            public int f272d = -1;
            public Interpolator e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f273f = false;

            /* renamed from: g  reason: collision with root package name */
            public int f274g = 0;

            public a(int i2, int i3) {
                this.a = i2;
                this.b = i3;
                this.f271c = Integer.MIN_VALUE;
                this.e = null;
            }

            public void a(RecyclerView recyclerView) {
                int i2 = this.f272d;
                if (i2 >= 0) {
                    this.f272d = -1;
                    recyclerView.P(i2);
                    this.f273f = false;
                } else if (this.f273f) {
                    Interpolator interpolator = this.e;
                    if (interpolator == null || this.f271c >= 1) {
                        int i3 = this.f271c;
                        if (i3 >= 1) {
                            recyclerView.j0.b(this.a, this.b, i3, interpolator);
                            int i4 = this.f274g + 1;
                            this.f274g = i4;
                            if (i4 > 10) {
                                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                            }
                            this.f273f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else {
                    this.f274g = 0;
                }
            }

            public void b(int i2, int i3, int i4, Interpolator interpolator) {
                this.a = i2;
                this.b = i3;
                this.f271c = i4;
                this.e = interpolator;
                this.f273f = true;
            }
        }

        public interface b {
            PointF a(int i2);
        }

        public PointF a(int i2) {
            l lVar = this.f266c;
            if (lVar instanceof b) {
                return ((b) lVar).a(i2);
            }
            StringBuilder f2 = c.c.a.a.a.f("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            f2.append(b.class.getCanonicalName());
            Log.w("RecyclerView", f2.toString());
            return null;
        }

        public void b(int i2, int i3) {
            PointF a2;
            RecyclerView recyclerView = this.b;
            int i4 = -1;
            if (this.a == -1 || recyclerView == null) {
                d();
            }
            if (this.f267d && this.f268f == null && this.f266c != null && (a2 = a(this.a)) != null) {
                float f2 = a2.x;
                if (!(f2 == 0.0f && a2.y == 0.0f)) {
                    recyclerView.h0((int) Math.signum(f2), (int) Math.signum(a2.y), null);
                }
            }
            boolean z = false;
            this.f267d = false;
            View view = this.f268f;
            if (view != null) {
                Objects.requireNonNull(this.b);
                z K = RecyclerView.K(view);
                if (K != null) {
                    i4 = K.f();
                }
                if (i4 == this.a) {
                    c(this.f268f, recyclerView.m0, this.f269g);
                    this.f269g.a(recyclerView);
                    d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f268f = null;
                }
            }
            if (this.e) {
                w wVar = recyclerView.m0;
                a aVar = this.f269g;
                g.q.c.o oVar = (g.q.c.o) this;
                if (oVar.b.s.y() == 0) {
                    oVar.d();
                } else {
                    int i5 = oVar.o;
                    int i6 = i5 - i2;
                    if (i5 * i6 <= 0) {
                        i6 = 0;
                    }
                    oVar.o = i6;
                    int i7 = oVar.p;
                    int i8 = i7 - i3;
                    if (i7 * i8 <= 0) {
                        i8 = 0;
                    }
                    oVar.p = i8;
                    if (i6 == 0 && i8 == 0) {
                        PointF a3 = oVar.a(oVar.a);
                        if (a3 != null) {
                            float f3 = a3.x;
                            if (!(f3 == 0.0f && a3.y == 0.0f)) {
                                float f4 = a3.y;
                                float sqrt = (float) Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
                                float f5 = a3.x / sqrt;
                                a3.x = f5;
                                float f6 = a3.y / sqrt;
                                a3.y = f6;
                                oVar.f2946k = a3;
                                oVar.o = (int) (f5 * 10000.0f);
                                oVar.p = (int) (f6 * 10000.0f);
                                aVar.b((int) (((float) oVar.o) * 1.2f), (int) (((float) oVar.p) * 1.2f), (int) (((float) oVar.g(10000)) * 1.2f), oVar.f2944i);
                            }
                        }
                        aVar.f272d = oVar.a;
                        oVar.d();
                    }
                }
                a aVar2 = this.f269g;
                if (aVar2.f272d >= 0) {
                    z = true;
                }
                aVar2.a(recyclerView);
                if (z && this.e) {
                    this.f267d = true;
                    recyclerView.j0.a();
                }
            }
        }

        public abstract void c(View view, w wVar, a aVar);

        public final void d() {
            if (this.e) {
                this.e = false;
                g.q.c.o oVar = (g.q.c.o) this;
                oVar.p = 0;
                oVar.o = 0;
                oVar.f2946k = null;
                this.b.m0.a = -1;
                this.f268f = null;
                this.a = -1;
                this.f267d = false;
                l lVar = this.f266c;
                if (lVar.f247g == this) {
                    lVar.f247g = null;
                }
                this.f266c = null;
                this.b = null;
            }
        }
    }

    public static class w {
        public int a = -1;
        public int b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f275c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f276d = 1;
        public int e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f277f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f278g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f279h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f280i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f281j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f282k = false;

        /* renamed from: l  reason: collision with root package name */
        public int f283l;

        /* renamed from: m  reason: collision with root package name */
        public long f284m;
        public int n;

        public void a(int i2) {
            if ((this.f276d & i2) == 0) {
                StringBuilder f2 = c.c.a.a.a.f("Layout state should be one of ");
                f2.append(Integer.toBinaryString(i2));
                f2.append(" but it is ");
                f2.append(Integer.toBinaryString(this.f276d));
                throw new IllegalStateException(f2.toString());
            }
        }

        public int b() {
            return this.f278g ? this.b - this.f275c : this.e;
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("State{mTargetPosition=");
            f2.append(this.a);
            f2.append(", mData=");
            f2.append((Object) null);
            f2.append(", mItemCount=");
            f2.append(this.e);
            f2.append(", mIsMeasuring=");
            f2.append(this.f280i);
            f2.append(", mPreviousLayoutItemCount=");
            f2.append(this.b);
            f2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            f2.append(this.f275c);
            f2.append(", mStructureChanged=");
            f2.append(this.f277f);
            f2.append(", mInPreLayout=");
            f2.append(this.f278g);
            f2.append(", mRunSimpleAnimations=");
            f2.append(this.f281j);
            f2.append(", mRunPredictiveAnimations=");
            f2.append(this.f282k);
            f2.append('}');
            return f2.toString();
        }
    }

    public static abstract class x {
    }

    public class y implements Runnable {
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f285f;

        /* renamed from: g  reason: collision with root package name */
        public OverScroller f286g;

        /* renamed from: h  reason: collision with root package name */
        public Interpolator f287h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f288i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f289j = false;

        public y() {
            Interpolator interpolator = RecyclerView.f233g;
            this.f287h = interpolator;
            this.f286g = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public void a() {
            if (this.f288i) {
                this.f289j = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            AtomicInteger atomicInteger = g.h.j.o.a;
            recyclerView.postOnAnimation(this);
        }

        public void b(int i2, int i3, int i4, Interpolator interpolator) {
            if (i4 == Integer.MIN_VALUE) {
                int abs = Math.abs(i2);
                int abs2 = Math.abs(i3);
                boolean z = abs > abs2;
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    abs = abs2;
                }
                i4 = Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
            }
            if (interpolator == null) {
                interpolator = RecyclerView.f233g;
            }
            if (this.f287h != interpolator) {
                this.f287h = interpolator;
                this.f286g = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f285f = 0;
            this.e = 0;
            RecyclerView.this.setScrollState(2);
            this.f286g.startScroll(0, 0, i2, i3, i4);
            a();
        }

        public void c() {
            RecyclerView.this.removeCallbacks(this);
            this.f286g.abortAnimation();
        }

        public void run() {
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.s == null) {
                c();
                return;
            }
            this.f289j = false;
            this.f288i = true;
            recyclerView.n();
            OverScroller overScroller = this.f286g;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.e;
                int i5 = currY - this.f285f;
                this.e = currX;
                this.f285f = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.z0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.t(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.z0;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.r != null) {
                    int[] iArr3 = recyclerView3.z0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.h0(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.z0;
                    i2 = iArr4[0];
                    i3 = iArr4[1];
                    i4 -= i2;
                    i5 -= i3;
                    v vVar = recyclerView4.s.f247g;
                    if (vVar != null && !vVar.f267d && vVar.e) {
                        int b = recyclerView4.m0.b();
                        if (b == 0) {
                            vVar.d();
                        } else {
                            if (vVar.a >= b) {
                                vVar.a = b - 1;
                            }
                            vVar.b(i2, i3);
                        }
                    }
                } else {
                    i3 = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.v.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.z0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.u(i2, i3, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.z0;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (!(i2 == 0 && i3 == 0)) {
                    recyclerView6.v(i2, i3);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                v vVar2 = recyclerView7.s.f247g;
                if ((vVar2 != null && vVar2.f267d) || !z) {
                    a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    g.q.c.m mVar = recyclerView8.k0;
                    if (mVar != null) {
                        mVar.a(recyclerView8, i2, i3);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        Objects.requireNonNull(recyclerView9);
                        if (i8 < 0) {
                            recyclerView9.x();
                            if (recyclerView9.N.isFinished()) {
                                recyclerView9.N.onAbsorb(-i8);
                            }
                        } else if (i8 > 0) {
                            recyclerView9.y();
                            if (recyclerView9.P.isFinished()) {
                                recyclerView9.P.onAbsorb(i8);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.z();
                            if (recyclerView9.O.isFinished()) {
                                recyclerView9.O.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.w();
                            if (recyclerView9.Q.isFinished()) {
                                recyclerView9.Q.onAbsorb(currVelocity);
                            }
                        }
                        if (!(i8 == 0 && currVelocity == 0)) {
                            AtomicInteger atomicInteger = g.h.j.o.a;
                            recyclerView9.postInvalidateOnAnimation();
                        }
                    }
                    int[] iArr7 = RecyclerView.e;
                    m.b bVar = RecyclerView.this.l0;
                    int[] iArr8 = bVar.f2934c;
                    if (iArr8 != null) {
                        Arrays.fill(iArr8, -1);
                    }
                    bVar.f2935d = 0;
                }
            }
            v vVar3 = RecyclerView.this.s.f247g;
            if (vVar3 != null && vVar3.f267d) {
                vVar3.b(0, 0);
            }
            this.f288i = false;
            if (this.f289j) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView10 = RecyclerView.this;
                AtomicInteger atomicInteger2 = g.h.j.o.a;
                recyclerView10.postOnAnimation(this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.o0(1);
        }
    }

    public static abstract class z {
        public static final List<Object> a = Collections.emptyList();
        public final View b;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<RecyclerView> f291c;

        /* renamed from: d  reason: collision with root package name */
        public int f292d = -1;
        public int e = -1;

        /* renamed from: f  reason: collision with root package name */
        public long f293f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f294g = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f295h = -1;

        /* renamed from: i  reason: collision with root package name */
        public z f296i = null;

        /* renamed from: j  reason: collision with root package name */
        public z f297j = null;

        /* renamed from: k  reason: collision with root package name */
        public int f298k;

        /* renamed from: l  reason: collision with root package name */
        public List<Object> f299l = null;

        /* renamed from: m  reason: collision with root package name */
        public List<Object> f300m = null;
        public int n = 0;
        public r o = null;
        public boolean p = false;
        public int q = 0;
        public int r = -1;
        public RecyclerView s;
        public d<? extends z> t;

        public z(View view) {
            if (view != null) {
                this.b = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f298k) == 0) {
                if (this.f299l == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f299l = arrayList;
                    this.f300m = Collections.unmodifiableList(arrayList);
                }
                this.f299l.add(obj);
            }
        }

        public void b(int i2) {
            this.f298k = i2 | this.f298k;
        }

        public void c() {
            this.e = -1;
            this.f295h = -1;
        }

        public void d() {
            this.f298k &= -33;
        }

        public final int e() {
            RecyclerView recyclerView = this.s;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.H(this);
        }

        public final int f() {
            int i2 = this.f295h;
            return i2 == -1 ? this.f292d : i2;
        }

        public List<Object> g() {
            if ((this.f298k & 1024) != 0) {
                return a;
            }
            List<Object> list = this.f299l;
            return (list == null || list.size() == 0) ? a : this.f300m;
        }

        public boolean h(int i2) {
            return (i2 & this.f298k) != 0;
        }

        public boolean i() {
            return (this.b.getParent() == null || this.b.getParent() == this.s) ? false : true;
        }

        public boolean j() {
            return (this.f298k & 1) != 0;
        }

        public boolean k() {
            return (this.f298k & 4) != 0;
        }

        public final boolean l() {
            if ((this.f298k & 16) == 0) {
                View view = this.b;
                AtomicInteger atomicInteger = g.h.j.o.a;
                if (!view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        public boolean m() {
            return (this.f298k & 8) != 0;
        }

        public boolean n() {
            return this.o != null;
        }

        public boolean o() {
            return (this.f298k & 256) != 0;
        }

        public boolean p() {
            return (this.f298k & 2) != 0;
        }

        public void q(int i2, boolean z) {
            if (this.e == -1) {
                this.e = this.f292d;
            }
            if (this.f295h == -1) {
                this.f295h = this.f292d;
            }
            if (z) {
                this.f295h += i2;
            }
            this.f292d += i2;
            if (this.b.getLayoutParams() != null) {
                ((m) this.b.getLayoutParams()).f256c = true;
            }
        }

        public void r() {
            this.f298k = 0;
            this.f292d = -1;
            this.e = -1;
            this.f293f = -1;
            this.f295h = -1;
            this.n = 0;
            this.f296i = null;
            this.f297j = null;
            List<Object> list = this.f299l;
            if (list != null) {
                list.clear();
            }
            this.f298k &= -1025;
            this.q = 0;
            this.r = -1;
            RecyclerView.k(this);
        }

        public void s(int i2, int i3) {
            this.f298k = (i2 & i3) | (this.f298k & (~i3));
        }

        public final void t(boolean z) {
            int i2;
            int i3 = this.n;
            int i4 = z ? i3 - 1 : i3 + 1;
            this.n = i4;
            if (i4 < 0) {
                this.n = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i4 == 1) {
                i2 = this.f298k | 16;
            } else if (z && i4 == 0) {
                i2 = this.f298k & -17;
            } else {
                return;
            }
            this.f298k = i2;
        }

        public String toString() {
            StringBuilder h2 = c.c.a.a.a.h(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            h2.append(Integer.toHexString(hashCode()));
            h2.append(" position=");
            h2.append(this.f292d);
            h2.append(" id=");
            h2.append(this.f293f);
            h2.append(", oldPos=");
            h2.append(this.e);
            h2.append(", pLpos:");
            h2.append(this.f295h);
            StringBuilder sb = new StringBuilder(h2.toString());
            if (n()) {
                sb.append(" scrap ");
                sb.append(this.p ? "[changeScrap]" : "[attachedScrap]");
            }
            if (k()) {
                sb.append(" invalid");
            }
            if (!j()) {
                sb.append(" unbound");
            }
            boolean z = true;
            if ((this.f298k & 2) != 0) {
                sb.append(" update");
            }
            if (m()) {
                sb.append(" removed");
            }
            if (u()) {
                sb.append(" ignored");
            }
            if (o()) {
                sb.append(" tmpDetached");
            }
            if (!l()) {
                StringBuilder f2 = c.c.a.a.a.f(" not recyclable(");
                f2.append(this.n);
                f2.append(")");
                sb.append(f2.toString());
            }
            if ((this.f298k & 512) == 0 && !k()) {
                z = false;
            }
            if (z) {
                sb.append(" undefined adapter position");
            }
            if (this.b.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public boolean u() {
            return (this.f298k & 128) != 0;
        }

        public boolean v() {
            return (this.f298k & 32) != 0;
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        f232f = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        StringBuilder sb;
        Constructor<? extends U> constructor;
        this.f234h = new t();
        this.f235i = new r();
        this.f239m = new b0();
        this.o = new Rect();
        this.p = new Rect();
        this.q = new RectF();
        this.u = new ArrayList();
        this.v = new ArrayList<>();
        this.w = new ArrayList<>();
        this.C = 0;
        this.I = false;
        this.J = false;
        this.K = 0;
        this.L = 0;
        this.M = new h();
        this.R = new g.q.c.k();
        this.S = 0;
        this.T = -1;
        this.g0 = Float.MIN_VALUE;
        this.h0 = Float.MIN_VALUE;
        this.i0 = true;
        this.j0 = new y();
        this.l0 = new m.b();
        this.m0 = new w();
        this.p0 = false;
        this.q0 = false;
        this.r0 = new j();
        this.s0 = false;
        char c2 = 2;
        this.v0 = new int[2];
        this.x0 = new int[2];
        this.y0 = new int[2];
        this.z0 = new int[2];
        this.A0 = new ArrayList();
        this.B0 = new a();
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = new c();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.c0 = viewConfiguration.getScaledTouchSlop();
        Method method = g.h.j.t.a;
        int i3 = Build.VERSION.SDK_INT;
        this.g0 = i3 >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : g.h.j.t.a(viewConfiguration, context);
        this.h0 = i3 >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : g.h.j.t.a(viewConfiguration, context);
        this.e0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.R.a = this.r0;
        this.f237k = new g.q.c.a(new g.q.c.w(this));
        this.f238l = new g.q.c.b(new g.q.c.v(this));
        AtomicInteger atomicInteger = g.h.j.o.a;
        if ((i3 >= 26 ? getImportantForAutofill() : 0) == 0 && i3 >= 26) {
            setImportantForAutofill(8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.H = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new g.q.c.x(this));
        int[] iArr = g.q.b.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        g.h.j.o.n(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.n = obtainStyledAttributes.getBoolean(1, true);
        boolean z2 = obtainStyledAttributes.getBoolean(3, false);
        this.A = z2;
        int i4 = 4;
        if (z2) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(c.c.a.a.a.j(this, c.c.a.a.a.f("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            new g.q.c.l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            i4 = 4;
            c2 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    sb = new StringBuilder();
                    sb.append(context.getPackageName());
                    sb.append(trim);
                    trim = sb.toString();
                } else if (!trim.contains(".")) {
                    sb = new StringBuilder();
                    sb.append(RecyclerView.class.getPackage().getName());
                    sb.append('.');
                    sb.append(trim);
                    trim = sb.toString();
                }
                try {
                    Class<? extends U> asSubclass = Class.forName(trim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(l.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f232f);
                        Object[] objArr2 = new Object[i4];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c2] = Integer.valueOf(i2);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e3);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((l) constructor.newInstance(objArr));
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e7);
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e8);
                }
            }
        }
        int[] iArr2 = e;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        g.h.j.o.n(this, context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
        boolean z3 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
    }

    public static RecyclerView F(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView F2 = F(viewGroup.getChildAt(i2));
            if (F2 != null) {
                return F2;
            }
        }
        return null;
    }

    public static z K(View view) {
        if (view == null) {
            return null;
        }
        return ((m) view.getLayoutParams()).a;
    }

    private g.h.j.g getScrollingChildHelper() {
        if (this.w0 == null) {
            this.w0 = new g.h.j.g(this);
        }
        return this.w0;
    }

    public static void k(z zVar) {
        WeakReference<RecyclerView> weakReference = zVar.f291c;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                View view = (View) viewParent;
                while (true) {
                    if (view == null) {
                        zVar.f291c = null;
                        return;
                    } else if (view != zVar.b) {
                        viewParent = view.getParent();
                        if (!(viewParent instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public String A() {
        StringBuilder f2 = c.c.a.a.a.f(" ");
        f2.append(super.toString());
        f2.append(", adapter:");
        f2.append(this.r);
        f2.append(", layout:");
        f2.append(this.s);
        f2.append(", context:");
        f2.append(getContext());
        return f2.toString();
    }

    public final void B(w wVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.j0.f286g;
            overScroller.getFinalX();
            overScroller.getCurrX();
            Objects.requireNonNull(wVar);
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        Objects.requireNonNull(wVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View C(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C(android.view.View):android.view.View");
    }

    public final boolean D(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.w.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = this.w.get(i2);
            if (oVar.a(this, motionEvent) && action != 3) {
                this.x = oVar;
                return true;
            }
        }
        return false;
    }

    public final void E(int[] iArr) {
        int e2 = this.f238l.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < e2; i4++) {
            z K2 = K(this.f238l.d(i4));
            if (!K2.u()) {
                int f2 = K2.f();
                if (f2 < i2) {
                    i2 = f2;
                }
                if (f2 > i3) {
                    i3 = f2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public z G(int i2) {
        z zVar = null;
        if (this.I) {
            return null;
        }
        int h2 = this.f238l.h();
        for (int i3 = 0; i3 < h2; i3++) {
            z K2 = K(this.f238l.g(i3));
            if (K2 != null && !K2.m() && H(K2) == i2) {
                if (!this.f238l.k(K2.b)) {
                    return K2;
                }
                zVar = K2;
            }
        }
        return zVar;
    }

    public int H(z zVar) {
        if (!zVar.h(524) && zVar.j()) {
            g.q.c.a aVar = this.f237k;
            int i2 = zVar.f292d;
            int size = aVar.b.size();
            for (int i3 = 0; i3 < size; i3++) {
                a.b bVar = aVar.b.get(i3);
                int i4 = bVar.a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = bVar.b;
                        if (i5 <= i2) {
                            int i6 = bVar.f2888d;
                            if (i5 + i6 <= i2) {
                                i2 -= i6;
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 == 8) {
                        int i7 = bVar.b;
                        if (i7 == i2) {
                            i2 = bVar.f2888d;
                        } else {
                            if (i7 < i2) {
                                i2--;
                            }
                            if (bVar.f2888d <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (bVar.b <= i2) {
                    i2 += bVar.f2888d;
                }
            }
            return i2;
        }
        return -1;
    }

    public long I(z zVar) {
        if (this.r.b) {
            return zVar.f293f;
        }
        return (long) zVar.f292d;
    }

    public z J(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return K(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public Rect L(View view) {
        m mVar = (m) view.getLayoutParams();
        if (!mVar.f256c) {
            return mVar.b;
        }
        if (this.m0.f278g && (mVar.b() || mVar.a.k())) {
            return mVar.b;
        }
        Rect rect = mVar.b;
        rect.set(0, 0, 0, 0);
        int size = this.v.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.o.set(0, 0, 0, 0);
            Rect rect2 = this.o;
            Objects.requireNonNull(this.v.get(i2));
            ((m) view.getLayoutParams()).a();
            rect2.set(0, 0, 0, 0);
            int i3 = rect.left;
            Rect rect3 = this.o;
            rect.left = i3 + rect3.left;
            rect.top += rect3.top;
            rect.right += rect3.right;
            rect.bottom += rect3.bottom;
        }
        mVar.f256c = false;
        return rect;
    }

    public boolean M() {
        return !this.B || this.I || this.f237k.g();
    }

    public void N() {
        this.Q = null;
        this.O = null;
        this.P = null;
        this.N = null;
    }

    public boolean O() {
        return this.K > 0;
    }

    public void P(int i2) {
        if (this.s != null) {
            setScrollState(2);
            this.s.M0(i2);
            awakenScrollBars();
        }
    }

    public void Q() {
        int h2 = this.f238l.h();
        for (int i2 = 0; i2 < h2; i2++) {
            ((m) this.f238l.g(i2).getLayoutParams()).f256c = true;
        }
        r rVar = this.f235i;
        int size = rVar.f260c.size();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = (m) rVar.f260c.get(i3).b.getLayoutParams();
            if (mVar != null) {
                mVar.f256c = true;
            }
        }
    }

    public void R(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int h2 = this.f238l.h();
        for (int i5 = 0; i5 < h2; i5++) {
            z K2 = K(this.f238l.g(i5));
            if (K2 != null && !K2.u()) {
                int i6 = K2.f292d;
                if (i6 >= i4) {
                    K2.q(-i3, z2);
                } else if (i6 >= i2) {
                    K2.b(8);
                    K2.q(-i3, z2);
                    K2.f292d = i2 - 1;
                }
                this.m0.f277f = true;
            }
        }
        r rVar = this.f235i;
        int size = rVar.f260c.size();
        while (true) {
            size--;
            if (size >= 0) {
                z zVar = rVar.f260c.get(size);
                if (zVar != null) {
                    int i7 = zVar.f292d;
                    if (i7 >= i4) {
                        zVar.q(-i3, z2);
                    } else if (i7 >= i2) {
                        zVar.b(8);
                        rVar.f(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void S() {
    }

    public void T() {
    }

    public void U() {
        this.K++;
    }

    public void V(boolean z2) {
        int i2;
        boolean z3 = true;
        int i3 = this.K - 1;
        this.K = i3;
        if (i3 < 1) {
            this.K = 0;
            if (z2) {
                int i4 = this.G;
                this.G = 0;
                if (i4 != 0) {
                    AccessibilityManager accessibilityManager = this.H;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z3 = false;
                    }
                    if (z3) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        obtain.setContentChangeTypes(i4);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.A0.size() - 1; size >= 0; size--) {
                    z zVar = this.A0.get(size);
                    if (zVar.b.getParent() == this && !zVar.u() && (i2 = zVar.r) != -1) {
                        View view = zVar.b;
                        AtomicInteger atomicInteger = g.h.j.o.a;
                        view.setImportantForAccessibility(i2);
                        zVar.r = -1;
                    }
                }
                this.A0.clear();
            }
        }
    }

    public final void W(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.T) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.T = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.a0 = x2;
            this.V = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.b0 = y2;
            this.W = y2;
        }
    }

    public void X() {
    }

    public void Y() {
    }

    public void Z() {
        if (!this.s0 && this.y) {
            Runnable runnable = this.B0;
            AtomicInteger atomicInteger = g.h.j.o.a;
            postOnAnimation(runnable);
            this.s0 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007d, code lost:
        if ((r6.R != null && r6.s.Y0()) != false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a0() {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.a0():void");
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        l lVar = this.s;
        if (lVar == null || !lVar.e0()) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void b0(boolean z2) {
        this.J = z2 | this.J;
        this.I = true;
        int h2 = this.f238l.h();
        for (int i2 = 0; i2 < h2; i2++) {
            z K2 = K(this.f238l.g(i2));
            if (K2 != null && !K2.u()) {
                K2.b(6);
            }
        }
        Q();
        r rVar = this.f235i;
        int size = rVar.f260c.size();
        for (int i3 = 0; i3 < size; i3++) {
            z zVar = rVar.f260c.get(i3);
            if (zVar != null) {
                zVar.b(6);
                zVar.a(null);
            }
        }
        d dVar = RecyclerView.this.r;
        if (dVar == null || !dVar.b) {
            rVar.e();
        }
    }

    public void c0(z zVar, i.c cVar) {
        zVar.s(0, 8192);
        if (this.m0.f279h && zVar.p() && !zVar.m() && !zVar.u()) {
            this.f239m.b.j(I(zVar), zVar);
        }
        this.f239m.c(zVar, cVar);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof m) && this.s.g((m) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        l lVar = this.s;
        if (lVar != null && lVar.e()) {
            return this.s.k(this.m0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        l lVar = this.s;
        if (lVar != null && lVar.e()) {
            return this.s.l(this.m0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        l lVar = this.s;
        if (lVar != null && lVar.e()) {
            return this.s.m(this.m0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        l lVar = this.s;
        if (lVar != null && lVar.f()) {
            return this.s.n(this.m0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        l lVar = this.s;
        if (lVar != null && lVar.f()) {
            return this.s.o(this.m0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        l lVar = this.s;
        if (lVar != null && lVar.f()) {
            return this.s.p(this.m0);
        }
        return 0;
    }

    public void d0() {
        i iVar = this.R;
        if (iVar != null) {
            iVar.f();
        }
        l lVar = this.s;
        if (lVar != null) {
            lVar.E0(this.f235i);
            this.s.F0(this.f235i);
        }
        this.f235i.b();
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().e(i2, i3, i4, i5, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z2;
        float f2;
        float f3;
        super.draw(canvas);
        int size = this.v.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.v.get(i2).e(canvas, this, this.m0);
        }
        EdgeEffect edgeEffect = this.N;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.n ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.N;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.O;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.n) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.O;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.P;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.n ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.P;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.Q;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.n) {
                f3 = (float) (getPaddingRight() + (-getWidth()));
                f2 = (float) (getPaddingBottom() + (-getHeight()));
            } else {
                f3 = (float) (-getWidth());
                f2 = (float) (-getHeight());
            }
            canvas.translate(f3, f2);
            EdgeEffect edgeEffect8 = this.Q;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.R == null || this.v.size() <= 0 || !this.R.g()) {
            z4 = z2;
        }
        if (z4) {
            AtomicInteger atomicInteger = g.h.j.o.a;
            postInvalidateOnAnimation();
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.o.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof m) {
            m mVar = (m) layoutParams;
            if (!mVar.f256c) {
                Rect rect = mVar.b;
                Rect rect2 = this.o;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.o);
            offsetRectIntoDescendantCoords(view, this.o);
        }
        this.s.J0(this, view, this.o, !this.B, view2 == null);
    }

    public final void f(z zVar) {
        View view = zVar.b;
        boolean z2 = view.getParent() == this;
        this.f235i.k(J(view));
        if (zVar.o()) {
            this.f238l.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        g.q.c.b bVar = this.f238l;
        if (!z2) {
            bVar.a(view, -1, true);
            return;
        }
        int indexOfChild = ((g.q.c.v) bVar.a).a.indexOfChild(view);
        if (indexOfChild >= 0) {
            bVar.b.h(indexOfChild);
            bVar.i(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public final void f0() {
        VelocityTracker velocityTracker = this.U;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        o0(0);
        EdgeEffect edgeEffect = this.N;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.N.isFinished();
        }
        EdgeEffect edgeEffect2 = this.O;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.P;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.P.isFinished();
        }
        EdgeEffect edgeEffect4 = this.Q;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.Q.isFinished();
        }
        if (z2) {
            AtomicInteger atomicInteger = g.h.j.o.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x016a, code lost:
        if (r3 > 0) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0184, code lost:
        if (r6 > 0) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0187, code lost:
        if (r3 < 0) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x018a, code lost:
        if (r6 < 0) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0192, code lost:
        if ((r6 * r2) <= 0) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x019a, code lost:
        if ((r6 * r2) >= 0) goto L_0x019d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
        // Method dump skipped, instructions count: 422
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public void g(k kVar) {
        l lVar = this.s;
        if (lVar != null) {
            lVar.d("Cannot add item decoration during a scroll  or layout");
        }
        if (this.v.isEmpty()) {
            setWillNotDraw(false);
        }
        this.v.add(kVar);
        Q();
        requestLayout();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g0(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.g0(int, int, android.view.MotionEvent, int):boolean");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        l lVar = this.s;
        if (lVar != null) {
            return lVar.u();
        }
        throw new IllegalStateException(c.c.a.a.a.j(this, c.c.a.a.a.f("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l lVar = this.s;
        if (lVar != null) {
            return lVar.v(getContext(), attributeSet);
        }
        throw new IllegalStateException(c.c.a.a.a.j(this, c.c.a.a.a.f("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l lVar = this.s;
        if (lVar != null) {
            return lVar.w(layoutParams);
        }
        throw new IllegalStateException(c.c.a.a.a.j(this, c.c.a.a.a.f("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public d getAdapter() {
        return this.r;
    }

    public int getBaseline() {
        l lVar = this.s;
        if (lVar == null) {
            return super.getBaseline();
        }
        Objects.requireNonNull(lVar);
        return -1;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        g gVar = this.u0;
        return gVar == null ? super.getChildDrawingOrder(i2, i3) : gVar.a(i2, i3);
    }

    public boolean getClipToPadding() {
        return this.n;
    }

    public g.q.c.x getCompatAccessibilityDelegate() {
        return this.t0;
    }

    public h getEdgeEffectFactory() {
        return this.M;
    }

    public i getItemAnimator() {
        return this.R;
    }

    public int getItemDecorationCount() {
        return this.v.size();
    }

    public l getLayoutManager() {
        return this.s;
    }

    public int getMaxFlingVelocity() {
        return this.f0;
    }

    public int getMinFlingVelocity() {
        return this.e0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public n getOnFlingListener() {
        return this.d0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.i0;
    }

    public q getRecycledViewPool() {
        return this.f235i.d();
    }

    public int getScrollState() {
        return this.S;
    }

    public void h(p pVar) {
        if (this.o0 == null) {
            this.o0 = new ArrayList();
        }
        this.o0.add(pVar);
    }

    public void h0(int i2, int i3, int[] iArr) {
        z zVar;
        l0();
        U();
        int i4 = g.h.f.b.a;
        Trace.beginSection("RV Scroll");
        B(this.m0);
        int L0 = i2 != 0 ? this.s.L0(i2, this.f235i, this.m0) : 0;
        int N0 = i3 != 0 ? this.s.N0(i3, this.f235i, this.m0) : 0;
        Trace.endSection();
        int e2 = this.f238l.e();
        for (int i5 = 0; i5 < e2; i5++) {
            View d2 = this.f238l.d(i5);
            z J2 = J(d2);
            if (!(J2 == null || (zVar = J2.f297j) == null)) {
                View view = zVar.b;
                int left = d2.getLeft();
                int top = d2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        V(true);
        n0(false);
        if (iArr != null) {
            iArr[0] = L0;
            iArr[1] = N0;
        }
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().h(0);
    }

    public void i(String str) {
        if (O()) {
            if (str == null) {
                throw new IllegalStateException(c.c.a.a.a.j(this, c.c.a.a.a.f("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.L > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(c.c.a.a.a.j(this, c.c.a.a.a.f(""))));
        }
    }

    public void i0(int i2) {
        if (!this.E) {
            p0();
            l lVar = this.s;
            if (lVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            lVar.M0(i2);
            awakenScrollBars();
        }
    }

    public boolean isAttachedToWindow() {
        return this.y;
    }

    public final boolean isLayoutSuppressed() {
        return this.E;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2528d;
    }

    public final void j() {
        f0();
        setScrollState(0);
    }

    public boolean j0(z zVar, int i2) {
        if (O()) {
            zVar.r = i2;
            this.A0.add(zVar);
            return false;
        }
        View view = zVar.b;
        AtomicInteger atomicInteger = g.h.j.o.a;
        view.setImportantForAccessibility(i2);
        return true;
    }

    public void k0(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        l lVar = this.s;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.E) {
            int i5 = 0;
            if (!lVar.e()) {
                i2 = 0;
            }
            if (!this.s.f()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (i4 == Integer.MIN_VALUE || i4 > 0) {
                    if (z2) {
                        if (i2 != 0) {
                            i5 = 1;
                        }
                        if (i3 != 0) {
                            i5 |= 2;
                        }
                        m0(i5, 1);
                    }
                    this.j0.b(i2, i3, i4, interpolator);
                    return;
                }
                scrollBy(i2, i3);
            }
        }
    }

    public void l() {
        int h2 = this.f238l.h();
        for (int i2 = 0; i2 < h2; i2++) {
            z K2 = K(this.f238l.g(i2));
            if (!K2.u()) {
                K2.c();
            }
        }
        r rVar = this.f235i;
        int size = rVar.f260c.size();
        for (int i3 = 0; i3 < size; i3++) {
            rVar.f260c.get(i3).c();
        }
        int size2 = rVar.a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            rVar.a.get(i4).c();
        }
        ArrayList<z> arrayList = rVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                rVar.b.get(i5).c();
            }
        }
    }

    public void l0() {
        int i2 = this.C + 1;
        this.C = i2;
        if (i2 == 1 && !this.E) {
            this.D = false;
        }
    }

    public void m(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.N;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.N.onRelease();
            z2 = this.N.isFinished();
        }
        EdgeEffect edgeEffect2 = this.P;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.P.onRelease();
            z2 |= this.P.isFinished();
        }
        EdgeEffect edgeEffect3 = this.O;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.O.onRelease();
            z2 |= this.O.isFinished();
        }
        EdgeEffect edgeEffect4 = this.Q;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.Q.onRelease();
            z2 |= this.Q.isFinished();
        }
        if (z2) {
            AtomicInteger atomicInteger = g.h.j.o.a;
            postInvalidateOnAnimation();
        }
    }

    public boolean m0(int i2, int i3) {
        return getScrollingChildHelper().i(i2, i3);
    }

    public void n() {
        if (!this.B || this.I) {
            int i2 = g.h.f.b.a;
            Trace.beginSection("RV FullInvalidate");
            q();
            Trace.endSection();
        } else if (this.f237k.g()) {
            Objects.requireNonNull(this.f237k);
            if (this.f237k.g()) {
                int i3 = g.h.f.b.a;
                Trace.beginSection("RV FullInvalidate");
                q();
                Trace.endSection();
            }
        }
    }

    public void n0(boolean z2) {
        if (this.C < 1) {
            this.C = 1;
        }
        if (!z2 && !this.E) {
            this.D = false;
        }
        if (this.C == 1) {
            if (z2 && this.D && !this.E && this.s != null && this.r != null) {
                q();
            }
            if (!this.E) {
                this.D = false;
            }
        }
        this.C--;
    }

    public void o(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        AtomicInteger atomicInteger = g.h.j.o.a;
        setMeasuredDimension(l.h(i2, paddingRight, getMinimumWidth()), l.h(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void o0(int i2) {
        getScrollingChildHelper().j(i2);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = 0;
        this.y = true;
        this.B = this.B && !isLayoutRequested();
        l lVar = this.s;
        if (lVar != null) {
            lVar.f249i = true;
            lVar.f0();
        }
        this.s0 = false;
        ThreadLocal<g.q.c.m> threadLocal = g.q.c.m.e;
        g.q.c.m mVar = threadLocal.get();
        this.k0 = mVar;
        if (mVar == null) {
            this.k0 = new g.q.c.m();
            AtomicInteger atomicInteger = g.h.j.o.a;
            Display display = getDisplay();
            float f2 = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f2 = refreshRate;
                }
            }
            g.q.c.m mVar2 = this.k0;
            mVar2.f2932i = (long) (1.0E9f / f2);
            threadLocal.set(mVar2);
        }
        this.k0.f2930g.add(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.R;
        if (iVar != null) {
            iVar.f();
        }
        p0();
        this.y = false;
        l lVar = this.s;
        if (lVar != null) {
            r rVar = this.f235i;
            lVar.f249i = false;
            lVar.h0(this, rVar);
        }
        this.A0.clear();
        removeCallbacks(this.B0);
        Objects.requireNonNull(this.f239m);
        do {
        } while (b0.a.a.b() != null);
        g.q.c.m mVar = this.k0;
        if (mVar != null) {
            mVar.f2930g.remove(this);
            this.k0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.v.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.v.get(i2).d(canvas, this, this.m0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x00bd */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        if (this.E) {
            return false;
        }
        this.x = null;
        if (D(motionEvent)) {
            j();
            return true;
        }
        l lVar = this.s;
        if (lVar == null) {
            return false;
        }
        boolean e2 = lVar.e();
        boolean f2 = this.s.f();
        if (this.U == null) {
            this.U = VelocityTracker.obtain();
        }
        this.U.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.F) {
                this.F = false;
            }
            this.T = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.a0 = x2;
            this.V = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.b0 = y2;
            this.W = y2;
            if (this.S == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                o0(1);
            }
            int[] iArr = this.y0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (f2) {
                boolean z2 = e2 ? 1 : 0;
                char c2 = e2 ? 1 : 0;
                e2 = z2 | true;
            }
            int i2 = e2 ? 1 : 0;
            int i3 = e2 ? 1 : 0;
            int i4 = e2 ? 1 : 0;
            m0(i2, 0);
        } else if (actionMasked == 1) {
            this.U.clear();
            o0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.T);
            if (findPointerIndex < 0) {
                StringBuilder f3 = c.c.a.a.a.f("Error processing scroll; pointer index for id ");
                f3.append(this.T);
                f3.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", f3.toString());
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.S != 1) {
                int i5 = x3 - this.V;
                int i6 = y3 - this.W;
                if (!e2 || Math.abs(i5) <= this.c0) {
                    objArr = null;
                } else {
                    this.a0 = x3;
                    objArr = 1;
                }
                if (f2 && Math.abs(i6) > this.c0) {
                    this.b0 = y3;
                    objArr = 1;
                }
                if (objArr != null) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            j();
        } else if (actionMasked == 5) {
            this.T = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.a0 = x4;
            this.V = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.b0 = y4;
            this.W = y4;
        } else if (actionMasked == 6) {
            W(motionEvent);
        }
        return this.S == 1;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = g.h.f.b.a;
        Trace.beginSection("RV OnLayout");
        q();
        Trace.endSection();
        this.B = true;
    }

    public void onMeasure(int i2, int i3) {
        l lVar = this.s;
        if (lVar == null) {
            o(i2, i3);
            return;
        }
        boolean z2 = false;
        if (lVar.W()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.s.w0(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.C0 = z2;
            if (!z2 && this.r != null) {
                if (this.m0.f276d == 1) {
                    r();
                }
                this.s.P0(i2, i3);
                this.m0.f280i = true;
                s();
                this.s.R0(i2, i3);
                if (this.s.U0()) {
                    this.s.P0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.m0.f280i = true;
                    s();
                    this.s.R0(i2, i3);
                }
                this.D0 = getMeasuredWidth();
                this.E0 = getMeasuredHeight();
            }
        } else if (this.z) {
            this.s.w0(i2, i3);
        } else {
            w wVar = this.m0;
            if (wVar.f282k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            d dVar = this.r;
            if (dVar != null) {
                wVar.e = dVar.a();
            } else {
                wVar.e = 0;
            }
            l0();
            this.s.w0(i2, i3);
            n0(false);
            this.m0.f278g = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (O()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof u)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        u uVar = (u) parcelable;
        this.f236j = uVar;
        super.onRestoreInstanceState(uVar.f2593f);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        u uVar = new u(super.onSaveInstanceState());
        u uVar2 = this.f236j;
        if (uVar2 != null) {
            uVar.f265g = uVar2.f265g;
        } else {
            l lVar = this.s;
            uVar.f265g = lVar != null ? lVar.A0() : null;
        }
        return uVar;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            N();
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:54:0x00f6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:203:0x032f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:206:0x0334 */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0321, code lost:
        if (r3 < r8) goto L_0x0324;
     */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
        // Method dump skipped, instructions count: 1000
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(View view) {
        z K2 = K(view);
        T();
        d dVar = this.r;
        if (dVar != null && K2 != null) {
            Objects.requireNonNull(dVar);
        }
    }

    public void p0() {
        v vVar;
        setScrollState(0);
        this.j0.c();
        l lVar = this.s;
        if (lVar != null && (vVar = lVar.f247g) != null) {
            vVar.d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x031a, code lost:
        if (r15.f238l.k(getFocusedChild()) == false) goto L_0x03de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q() {
        /*
        // Method dump skipped, instructions count: 1000
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q():void");
    }

    public final void r() {
        int id;
        View C2;
        this.m0.a(1);
        B(this.m0);
        this.m0.f280i = false;
        l0();
        b0 b0Var = this.f239m;
        b0Var.a.clear();
        b0Var.b.a();
        U();
        a0();
        View focusedChild = (!this.i0 || !hasFocus() || this.r == null) ? null : getFocusedChild();
        z J2 = (focusedChild == null || (C2 = C(focusedChild)) == null) ? null : J(C2);
        long j2 = -1;
        if (J2 == null) {
            w wVar = this.m0;
            wVar.f284m = -1;
            wVar.f283l = -1;
            wVar.n = -1;
        } else {
            w wVar2 = this.m0;
            if (this.r.b) {
                j2 = J2.f293f;
            }
            wVar2.f284m = j2;
            wVar2.f283l = this.I ? -1 : J2.m() ? J2.e : J2.e();
            w wVar3 = this.m0;
            View view = J2.b;
            loop0:
            while (true) {
                id = view.getId();
                while (true) {
                    if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                        wVar3.n = id;
                    } else {
                        view = ((ViewGroup) view).getFocusedChild();
                        if (view.getId() != -1) {
                        }
                    }
                }
            }
            wVar3.n = id;
        }
        w wVar4 = this.m0;
        wVar4.f279h = wVar4.f281j && this.q0;
        this.q0 = false;
        this.p0 = false;
        wVar4.f278g = wVar4.f282k;
        wVar4.e = this.r.a();
        E(this.v0);
        if (this.m0.f281j) {
            int e2 = this.f238l.e();
            for (int i2 = 0; i2 < e2; i2++) {
                z K2 = K(this.f238l.d(i2));
                if (!K2.u() && (!K2.k() || this.r.b)) {
                    i iVar = this.R;
                    i.b(K2);
                    K2.g();
                    this.f239m.c(K2, iVar.h(K2));
                    if (this.m0.f279h && K2.p() && !K2.m() && !K2.u() && !K2.k()) {
                        this.f239m.b.j(I(K2), K2);
                    }
                }
            }
        }
        if (this.m0.f282k) {
            int h2 = this.f238l.h();
            for (int i3 = 0; i3 < h2; i3++) {
                z K3 = K(this.f238l.g(i3));
                if (!K3.u() && K3.e == -1) {
                    K3.e = K3.f292d;
                }
            }
            w wVar5 = this.m0;
            boolean z2 = wVar5.f277f;
            wVar5.f277f = false;
            this.s.u0(this.f235i, wVar5);
            this.m0.f277f = z2;
            for (int i4 = 0; i4 < this.f238l.e(); i4++) {
                z K4 = K(this.f238l.d(i4));
                if (!K4.u()) {
                    b0.a orDefault = this.f239m.a.getOrDefault(K4, null);
                    if (!((orDefault == null || (orDefault.b & 4) == 0) ? false : true)) {
                        i.b(K4);
                        boolean h3 = K4.h(8192);
                        i iVar2 = this.R;
                        K4.g();
                        i.c h4 = iVar2.h(K4);
                        if (h3) {
                            c0(K4, h4);
                        } else {
                            b0 b0Var2 = this.f239m;
                            b0.a orDefault2 = b0Var2.a.getOrDefault(K4, null);
                            if (orDefault2 == null) {
                                orDefault2 = b0.a.a();
                                b0Var2.a.put(K4, orDefault2);
                            }
                            orDefault2.b |= 2;
                            orDefault2.f2892c = h4;
                        }
                    }
                }
            }
        }
        l();
        V(true);
        n0(false);
        this.m0.f276d = 2;
    }

    public void removeDetachedView(View view, boolean z2) {
        z K2 = K(view);
        if (K2 != null) {
            if (K2.o()) {
                K2.f298k &= -257;
            } else if (!K2.u()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(K2);
                throw new IllegalArgumentException(c.c.a.a.a.j(this, sb));
            }
        }
        view.clearAnimation();
        p(view);
        super.removeDetachedView(view, z2);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.s.y0(this, view, view2) && view2 != null) {
            e0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.s.J0(this, view, rect, z2, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.w.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.w.get(i2).c(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.C != 0 || this.E) {
            this.D = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        l0();
        U();
        this.m0.a(6);
        this.f237k.c();
        this.m0.e = this.r.a();
        this.m0.f275c = 0;
        if (this.f236j != null) {
            d dVar = this.r;
            int f2 = g.f.c.g.f(dVar.f240c);
            if (f2 == 1 ? dVar.a() > 0 : f2 != 2) {
                Parcelable parcelable = this.f236j.f265g;
                if (parcelable != null) {
                    this.s.z0(parcelable);
                }
                this.f236j = null;
            }
        }
        w wVar = this.m0;
        wVar.f278g = false;
        this.s.u0(this.f235i, wVar);
        w wVar2 = this.m0;
        wVar2.f277f = false;
        wVar2.f281j = wVar2.f281j && this.R != null;
        wVar2.f276d = 4;
        V(true);
        n0(false);
    }

    public void scrollBy(int i2, int i3) {
        l lVar = this.s;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.E) {
            boolean e2 = lVar.e();
            boolean f2 = this.s.f();
            if (e2 || f2) {
                if (!e2) {
                    i2 = 0;
                }
                if (!f2) {
                    i3 = 0;
                }
                g0(i2, i3, null, 0);
            }
        }
    }

    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i2 = 0;
        if (O()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (contentChangeTypes != 0) {
                i2 = contentChangeTypes;
            }
            this.G |= i2;
            i2 = 1;
        }
        if (i2 == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(g.q.c.x xVar) {
        this.t0 = xVar;
        g.h.j.o.o(this, xVar);
    }

    public void setAdapter(d dVar) {
        setLayoutFrozen(false);
        d dVar2 = this.r;
        if (dVar2 != null) {
            dVar2.a.unregisterObserver(this.f234h);
            Objects.requireNonNull(this.r);
        }
        d0();
        g.q.c.a aVar = this.f237k;
        aVar.l(aVar.b);
        aVar.l(aVar.f2885c);
        d dVar3 = this.r;
        this.r = dVar;
        if (dVar != null) {
            dVar.a.registerObserver(this.f234h);
        }
        l lVar = this.s;
        if (lVar != null) {
            lVar.d0(dVar3, this.r);
        }
        r rVar = this.f235i;
        d dVar4 = this.r;
        rVar.b();
        q d2 = rVar.d();
        Objects.requireNonNull(d2);
        if (dVar3 != null) {
            d2.b--;
        }
        if (d2.b == 0) {
            for (int i2 = 0; i2 < d2.a.size(); i2++) {
                d2.a.valueAt(i2).a.clear();
            }
        }
        if (dVar4 != null) {
            d2.b++;
        }
        this.m0.f277f = true;
        b0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(g gVar) {
        if (gVar != this.u0) {
            this.u0 = gVar;
            setChildrenDrawingOrderEnabled(gVar != null);
        }
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.n) {
            N();
        }
        this.n = z2;
        super.setClipToPadding(z2);
        if (this.B) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(h hVar) {
        Objects.requireNonNull(hVar);
        this.M = hVar;
        N();
    }

    public void setHasFixedSize(boolean z2) {
        this.z = z2;
    }

    public void setItemAnimator(i iVar) {
        i iVar2 = this.R;
        if (iVar2 != null) {
            iVar2.f();
            this.R.a = null;
        }
        this.R = iVar;
        if (iVar != null) {
            iVar.a = this.r0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        r rVar = this.f235i;
        rVar.e = i2;
        rVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(l lVar) {
        if (lVar != this.s) {
            p0();
            if (this.s != null) {
                i iVar = this.R;
                if (iVar != null) {
                    iVar.f();
                }
                this.s.E0(this.f235i);
                this.s.F0(this.f235i);
                this.f235i.b();
                if (this.y) {
                    l lVar2 = this.s;
                    r rVar = this.f235i;
                    lVar2.f249i = false;
                    lVar2.h0(this, rVar);
                }
                this.s.S0(null);
                this.s = null;
            } else {
                this.f235i.b();
            }
            g.q.c.b bVar = this.f238l;
            b.a aVar = bVar.b;
            aVar.a = 0;
            b.a aVar2 = aVar.b;
            if (aVar2 != null) {
                aVar2.g();
            }
            int size = bVar.f2891c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                g.q.c.v vVar = (g.q.c.v) bVar.a;
                Objects.requireNonNull(vVar);
                z K2 = K(bVar.f2891c.get(size));
                if (K2 != null) {
                    vVar.a.j0(K2, K2.q);
                    K2.q = 0;
                }
                bVar.f2891c.remove(size);
            }
            g.q.c.v vVar2 = (g.q.c.v) bVar.a;
            int b2 = vVar2.b();
            for (int i2 = 0; i2 < b2; i2++) {
                View a2 = vVar2.a(i2);
                vVar2.a.p(a2);
                a2.clearAnimation();
            }
            vVar2.a.removeAllViews();
            this.s = lVar;
            if (lVar != null) {
                if (lVar.b == null) {
                    lVar.S0(this);
                    if (this.y) {
                        l lVar3 = this.s;
                        lVar3.f249i = true;
                        lVar3.f0();
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(lVar);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(c.c.a.a.a.j(lVar.b, sb));
                }
            }
            this.f235i.l();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z2) {
        g.h.j.g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f2528d) {
            View view = scrollingChildHelper.f2527c;
            AtomicInteger atomicInteger = g.h.j.o.a;
            view.stopNestedScroll();
        }
        scrollingChildHelper.f2528d = z2;
    }

    public void setOnFlingListener(n nVar) {
        this.d0 = nVar;
    }

    @Deprecated
    public void setOnScrollListener(p pVar) {
        this.n0 = pVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.i0 = z2;
    }

    public void setRecycledViewPool(q qVar) {
        r rVar = this.f235i;
        q qVar2 = rVar.f263g;
        if (qVar2 != null) {
            qVar2.b--;
        }
        rVar.f263g = qVar;
        if (qVar != null && RecyclerView.this.getAdapter() != null) {
            rVar.f263g.b++;
        }
    }

    @Deprecated
    public void setRecyclerListener(s sVar) {
        this.t = sVar;
    }

    public void setScrollState(int i2) {
        v vVar;
        if (i2 != this.S) {
            this.S = i2;
            if (i2 != 2) {
                this.j0.c();
                l lVar = this.s;
                if (!(lVar == null || (vVar = lVar.f247g) == null)) {
                    vVar.d();
                }
            }
            l lVar2 = this.s;
            if (lVar2 != null) {
                lVar2.B0(i2);
            }
            X();
            p pVar = this.n0;
            if (pVar != null) {
                pVar.a(this, i2);
            }
            List<p> list = this.o0;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        this.o0.get(size).a(this, i2);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        int i3;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                i3 = viewConfiguration.getScaledPagingTouchSlop();
                this.c0 = i3;
            }
        }
        i3 = viewConfiguration.getScaledTouchSlop();
        this.c0 = i3;
    }

    public void setViewCacheExtension(x xVar) {
        Objects.requireNonNull(this.f235i);
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().i(i2, 0);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().j(0);
    }

    public final void suppressLayout(boolean z2) {
        if (z2 != this.E) {
            i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.E = false;
                if (!(!this.D || this.s == null || this.r == null)) {
                    requestLayout();
                }
                this.D = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.E = true;
            this.F = true;
            p0();
        }
    }

    public boolean t(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    public final void u(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().f(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void v(int i2, int i3) {
        this.L++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        Y();
        p pVar = this.n0;
        if (pVar != null) {
            pVar.b(this, i2, i3);
        }
        List<p> list = this.o0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.o0.get(size).b(this, i2, i3);
            }
        }
        this.L--;
    }

    public void w() {
        int i2;
        int i3;
        if (this.Q == null) {
            EdgeEffect a2 = this.M.a(this);
            this.Q = a2;
            if (this.n) {
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i3 = getMeasuredWidth();
                i2 = getMeasuredHeight();
            }
            a2.setSize(i3, i2);
        }
    }

    public void x() {
        int i2;
        int i3;
        if (this.N == null) {
            EdgeEffect a2 = this.M.a(this);
            this.N = a2;
            if (this.n) {
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i3 = getMeasuredHeight();
                i2 = getMeasuredWidth();
            }
            a2.setSize(i3, i2);
        }
    }

    public void y() {
        int i2;
        int i3;
        if (this.P == null) {
            EdgeEffect a2 = this.M.a(this);
            this.P = a2;
            if (this.n) {
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i3 = getMeasuredHeight();
                i2 = getMeasuredWidth();
            }
            a2.setSize(i3, i2);
        }
    }

    public void z() {
        int i2;
        int i3;
        if (this.O == null) {
            EdgeEffect a2 = this.M.a(this);
            this.O = a2;
            if (this.n) {
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i3 = getMeasuredWidth();
                i2 = getMeasuredHeight();
            }
            a2.setSize(i3, i2);
        }
    }
}
