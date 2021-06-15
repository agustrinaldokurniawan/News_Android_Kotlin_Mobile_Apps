package g.u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import g.u.h;

public abstract class a0 extends h {
    public static final String[] B = {"android:visibility:visibility", "android:visibility:parent"};
    public int C = 3;

    public static class a extends AnimatorListenerAdapter implements h.d {
        public final View a;
        public final int b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f3031c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f3032d;
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3033f = false;

        public a(View view, int i2, boolean z) {
            this.a = view;
            this.b = i2;
            this.f3031c = (ViewGroup) view.getParent();
            this.f3032d = z;
            g(true);
        }

        @Override // g.u.h.d
        public void a(h hVar) {
            g(false);
        }

        @Override // g.u.h.d
        public void b(h hVar) {
            g(true);
        }

        @Override // g.u.h.d
        public void c(h hVar) {
        }

        @Override // g.u.h.d
        public void d(h hVar) {
        }

        @Override // g.u.h.d
        public void e(h hVar) {
            f();
            hVar.A(this);
        }

        public final void f() {
            if (!this.f3033f) {
                s.a.f(this.a, this.b);
                ViewGroup viewGroup = this.f3031c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z) {
            ViewGroup viewGroup;
            if (this.f3032d && this.e != z && (viewGroup = this.f3031c) != null) {
                this.e = z;
                r.a(viewGroup, z);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f3033f = true;
        }

        public void onAnimationEnd(Animator animator) {
            f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f3033f) {
                s.a.f(this.a, this.b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f3033f) {
                s.a.f(this.a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public static class b {
        public boolean a;
        public boolean b;

        /* renamed from: c  reason: collision with root package name */
        public int f3034c;

        /* renamed from: d  reason: collision with root package name */
        public int f3035d;
        public ViewGroup e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f3036f;
    }

    public final void N(p pVar) {
        pVar.a.put("android:visibility:visibility", Integer.valueOf(pVar.b.getVisibility()));
        pVar.a.put("android:visibility:parent", pVar.b.getParent());
        int[] iArr = new int[2];
        pVar.b.getLocationOnScreen(iArr);
        pVar.a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r9 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0.e == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r0.f3034c == 0) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.u.a0.b O(g.u.p r8, g.u.p r9) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: g.u.a0.O(g.u.p, g.u.p):g.u.a0$b");
    }

    public abstract Animator P(ViewGroup viewGroup, View view, p pVar, p pVar2);

    @Override // g.u.h
    public void g(p pVar) {
        N(pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (O(r(r1, false), v(r1, false)).a != false) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01eb  */
    @Override // g.u.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator o(android.view.ViewGroup r22, g.u.p r23, g.u.p r24) {
        /*
        // Method dump skipped, instructions count: 682
        */
        throw new UnsupportedOperationException("Method not decompiled: g.u.a0.o(android.view.ViewGroup, g.u.p, g.u.p):android.animation.Animator");
    }

    @Override // g.u.h
    public String[] t() {
        return B;
    }

    @Override // g.u.h
    public boolean w(p pVar, p pVar2) {
        if (pVar == null && pVar2 == null) {
            return false;
        }
        if (pVar != null && pVar2 != null && pVar2.a.containsKey("android:visibility:visibility") != pVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b O = O(pVar, pVar2);
        if (O.a) {
            return O.f3034c == 0 || O.f3035d == 0;
        }
        return false;
    }
}
