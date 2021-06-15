package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import g.h.j.o;
import g.h.j.z.b;
import g.j.b.e;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public e a;
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public int f1616c = 2;

    /* renamed from: d  reason: collision with root package name */
    public float f1617d = 0.5f;
    public float e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f1618f = 0.5f;

    /* renamed from: g  reason: collision with root package name */
    public final e.c f1619g = new a();

    public class a extends e.c {
        public int a;
        public int b = -1;

        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
            if (r5 != false) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
            if (r5 != false) goto L_0x0014;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
            r5 = r2.a;
            r3 = r3.getWidth() + r5;
         */
        @Override // g.j.b.e.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r5 = g.h.j.o.a
                int r5 = r3.getLayoutDirection()
                r0 = 1
                if (r5 != r0) goto L_0x000b
                r5 = r0
                goto L_0x000c
            L_0x000b:
                r5 = 0
            L_0x000c:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f1616c
                if (r1 != 0) goto L_0x0026
                if (r5 == 0) goto L_0x001e
            L_0x0014:
                int r5 = r2.a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.a
                goto L_0x0039
            L_0x001e:
                int r5 = r2.a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0039
            L_0x0026:
                if (r1 != r0) goto L_0x002b
                if (r5 == 0) goto L_0x0014
                goto L_0x001e
            L_0x002b:
                int r5 = r2.a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0039:
                int r4 = java.lang.Math.max(r5, r4)
                int r3 = java.lang.Math.min(r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // g.j.b.e.c
        public int b(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // g.j.b.e.c
        public int c(View view) {
            return view.getWidth();
        }

        @Override // g.j.b.e.c
        public void e(View view, int i2) {
            this.b = i2;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // g.j.b.e.c
        public void f(int i2) {
            Objects.requireNonNull(SwipeDismissBehavior.this);
        }

        @Override // g.j.b.e.c
        public void g(View view, int i2, int i3, int i4, int i5) {
            float width = (((float) view.getWidth()) * SwipeDismissBehavior.this.e) + ((float) this.a);
            float width2 = (((float) view.getWidth()) * SwipeDismissBehavior.this.f1618f) + ((float) this.a);
            float f2 = (float) i2;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.C(0.0f, 1.0f - ((f2 - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.a) >= java.lang.Math.round(((float) r8.getWidth()) * r7.f1620c.f1617d)) goto L_0x002c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0084  */
        @Override // g.j.b.e.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h(android.view.View r8, float r9, float r10) {
            /*
            // Method dump skipped, instructions count: 140
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.h(android.view.View, float, float):void");
        }

        @Override // g.j.b.e.c
        public boolean i(View view, int i2) {
            int i3 = this.b;
            return (i3 == -1 || i3 == i2) && SwipeDismissBehavior.this.B(view);
        }
    }

    public class b implements Runnable {
        public final View e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f1621f;

        public b(View view, boolean z) {
            this.e = view;
            this.f1621f = z;
        }

        public void run() {
            e eVar = SwipeDismissBehavior.this.a;
            if (eVar != null && eVar.i(true)) {
                View view = this.e;
                AtomicInteger atomicInteger = o.a;
                view.postOnAnimation(this);
            } else if (this.f1621f) {
                Objects.requireNonNull(SwipeDismissBehavior.this);
            }
        }
    }

    public static float C(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        e eVar = this.a;
        if (eVar == null) {
            return false;
        }
        eVar.n(motionEvent);
        return true;
    }

    public boolean B(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.p(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (!z) {
            return false;
        }
        if (this.a == null) {
            this.a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1619g);
        }
        return this.a.u(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i2) {
        AtomicInteger atomicInteger = o.a;
        if (v.getImportantForAccessibility() == 0) {
            v.setImportantForAccessibility(1);
            o.l(1048576, v);
            o.i(v, 0);
            if (B(v)) {
                o.m(v, b.a.f2559f, null, new c.e.a.a.e.a(this));
            }
        }
        return false;
    }
}
