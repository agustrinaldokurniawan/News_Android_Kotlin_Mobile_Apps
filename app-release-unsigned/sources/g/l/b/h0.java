package g.l.b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment$5;
import com.tsuga.news.R;
import g.h.j.o;
import g.l.b.m;
import g.l.b.x0;
import g.n.e;
import g.n.j;
import g.n.v;
import g.n.w;
import g.s.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class h0 {
    public final a0 a;
    public final i0 b;

    /* renamed from: c  reason: collision with root package name */
    public final m f2691c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2692d = false;
    public int e = -1;

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View e;

        public a(h0 h0Var, View view) {
            this.e = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.e.removeOnAttachStateChangeListener(this);
            View view2 = this.e;
            AtomicInteger atomicInteger = o.a;
            view2.requestApplyInsets();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public h0(a0 a0Var, i0 i0Var, m mVar) {
        this.a = a0Var;
        this.b = i0Var;
        this.f2691c = mVar;
    }

    public h0(a0 a0Var, i0 i0Var, m mVar, g0 g0Var) {
        this.a = a0Var;
        this.b = i0Var;
        this.f2691c = mVar;
        mVar.f2715h = null;
        mVar.f2716i = null;
        mVar.v = 0;
        mVar.s = false;
        mVar.p = false;
        m mVar2 = mVar.f2719l;
        mVar.f2720m = mVar2 != null ? mVar2.f2717j : null;
        mVar.f2719l = null;
        Bundle bundle = g0Var.q;
        mVar.f2714g = bundle == null ? new Bundle() : bundle;
    }

    public h0(a0 a0Var, i0 i0Var, ClassLoader classLoader, x xVar, g0 g0Var) {
        this.a = a0Var;
        this.b = i0Var;
        m a2 = xVar.a(classLoader, g0Var.e);
        this.f2691c = a2;
        Bundle bundle = g0Var.n;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.u0(g0Var.n);
        a2.f2717j = g0Var.f2680f;
        a2.r = g0Var.f2681g;
        a2.t = true;
        a2.A = g0Var.f2682h;
        a2.B = g0Var.f2683i;
        a2.C = g0Var.f2684j;
        a2.F = g0Var.f2685k;
        a2.q = g0Var.f2686l;
        a2.E = g0Var.f2687m;
        a2.D = g0Var.o;
        a2.R = e.b.values()[g0Var.p];
        Bundle bundle2 = g0Var.q;
        a2.f2714g = bundle2 == null ? new Bundle() : bundle2;
        if (b0.O(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public void a() {
        if (b0.O(3)) {
            StringBuilder f2 = c.c.a.a.a.f("moveto ACTIVITY_CREATED: ");
            f2.append(this.f2691c);
            Log.d("FragmentManager", f2.toString());
        }
        m mVar = this.f2691c;
        Bundle bundle = mVar.f2714g;
        mVar.y.V();
        mVar.f2713f = 3;
        mVar.H = false;
        mVar.I();
        if (mVar.H) {
            if (b0.O(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + mVar);
            }
            View view = mVar.J;
            if (view != null) {
                Bundle bundle2 = mVar.f2714g;
                SparseArray<Parcelable> sparseArray = mVar.f2715h;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    mVar.f2715h = null;
                }
                if (mVar.J != null) {
                    v0 v0Var = mVar.T;
                    v0Var.f2780g.a(mVar.f2716i);
                    mVar.f2716i = null;
                }
                mVar.H = false;
                mVar.h0(bundle2);
                if (!mVar.H) {
                    throw new z0(c.c.a.a.a.p("Fragment ", mVar, " did not call through to super.onViewStateRestored()"));
                } else if (mVar.J != null) {
                    mVar.T.d(e.a.ON_CREATE);
                }
            }
            mVar.f2714g = null;
            b0 b0Var = mVar.y;
            b0Var.B = false;
            b0Var.C = false;
            b0Var.J.f2677i = false;
            b0Var.w(4);
            a0 a0Var = this.a;
            m mVar2 = this.f2691c;
            a0Var.a(mVar2, mVar2.f2714g, false);
            return;
        }
        throw new z0(c.c.a.a.a.p("Fragment ", mVar, " did not call through to super.onActivityCreated()"));
    }

    public void b() {
        View view;
        View view2;
        i0 i0Var = this.b;
        m mVar = this.f2691c;
        Objects.requireNonNull(i0Var);
        ViewGroup viewGroup = mVar.I;
        int i2 = -1;
        if (viewGroup != null) {
            int indexOf = i0Var.a.indexOf(mVar);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= i0Var.a.size()) {
                            break;
                        }
                        m mVar2 = i0Var.a.get(indexOf);
                        if (mVar2.I == viewGroup && (view = mVar2.J) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    m mVar3 = i0Var.a.get(i3);
                    if (mVar3.I == viewGroup && (view2 = mVar3.J) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        m mVar4 = this.f2691c;
        mVar4.I.addView(mVar4.J, i2);
    }

    public void c() {
        if (b0.O(3)) {
            StringBuilder f2 = c.c.a.a.a.f("moveto ATTACHED: ");
            f2.append(this.f2691c);
            Log.d("FragmentManager", f2.toString());
        }
        m mVar = this.f2691c;
        m mVar2 = mVar.f2719l;
        h0 h0Var = null;
        if (mVar2 != null) {
            h0 h2 = this.b.h(mVar2.f2717j);
            if (h2 != null) {
                m mVar3 = this.f2691c;
                mVar3.f2720m = mVar3.f2719l.f2717j;
                mVar3.f2719l = null;
                h0Var = h2;
            } else {
                StringBuilder f3 = c.c.a.a.a.f("Fragment ");
                f3.append(this.f2691c);
                f3.append(" declared target fragment ");
                f3.append(this.f2691c.f2719l);
                f3.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(f3.toString());
            }
        } else {
            String str = mVar.f2720m;
            if (str != null && (h0Var = this.b.h(str)) == null) {
                StringBuilder f4 = c.c.a.a.a.f("Fragment ");
                f4.append(this.f2691c);
                f4.append(" declared target fragment ");
                throw new IllegalStateException(c.c.a.a.a.e(f4, this.f2691c.f2720m, " that does not belong to this FragmentManager!"));
            }
        }
        if (h0Var != null) {
            h0Var.k();
        }
        m mVar4 = this.f2691c;
        b0 b0Var = mVar4.w;
        mVar4.x = b0Var.q;
        mVar4.z = b0Var.s;
        this.a.g(mVar4, false);
        m mVar5 = this.f2691c;
        Iterator<m.d> it = mVar5.W.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        mVar5.W.clear();
        mVar5.y.b(mVar5.x, mVar5.d(), mVar5);
        mVar5.f2713f = 0;
        mVar5.H = false;
        mVar5.L(mVar5.x.f2798f);
        if (mVar5.H) {
            b0 b0Var2 = mVar5.w;
            Iterator<f0> it2 = b0Var2.o.iterator();
            while (it2.hasNext()) {
                it2.next().e(b0Var2, mVar5);
            }
            b0 b0Var3 = mVar5.y;
            b0Var3.B = false;
            b0Var3.C = false;
            b0Var3.J.f2677i = false;
            b0Var3.w(0);
            this.a.b(this.f2691c, false);
            return;
        }
        throw new z0(c.c.a.a.a.p("Fragment ", mVar5, " did not call through to super.onAttach()"));
    }

    public int d() {
        x0.d dVar;
        x0.d.b bVar;
        m mVar = this.f2691c;
        if (mVar.w == null) {
            return mVar.f2713f;
        }
        int i2 = this.e;
        int ordinal = mVar.R.ordinal();
        if (ordinal == 1) {
            i2 = Math.min(i2, 0);
        } else if (ordinal == 2) {
            i2 = Math.min(i2, 1);
        } else if (ordinal == 3) {
            i2 = Math.min(i2, 5);
        } else if (ordinal != 4) {
            i2 = Math.min(i2, -1);
        }
        m mVar2 = this.f2691c;
        if (mVar2.r) {
            if (mVar2.s) {
                i2 = Math.max(this.e, 2);
                View view = this.f2691c.J;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = this.e < 4 ? Math.min(i2, mVar2.f2713f) : Math.min(i2, 1);
            }
        }
        if (!this.f2691c.p) {
            i2 = Math.min(i2, 1);
        }
        m mVar3 = this.f2691c;
        ViewGroup viewGroup = mVar3.I;
        x0.d.b bVar2 = null;
        if (viewGroup != null) {
            x0 g2 = x0.g(viewGroup, mVar3.u().M());
            Objects.requireNonNull(g2);
            x0.d d2 = g2.d(this.f2691c);
            if (d2 != null) {
                bVar = d2.b;
            } else {
                m mVar4 = this.f2691c;
                Iterator<x0.d> it = g2.f2782c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        dVar = null;
                        break;
                    }
                    dVar = it.next();
                    if (dVar.f2787c.equals(mVar4) && !dVar.f2789f) {
                        break;
                    }
                }
                if (dVar != null) {
                    bVar = dVar.b;
                }
            }
            bVar2 = bVar;
        }
        if (bVar2 == x0.d.b.ADDING) {
            i2 = Math.min(i2, 6);
        } else if (bVar2 == x0.d.b.REMOVING) {
            i2 = Math.max(i2, 3);
        } else {
            m mVar5 = this.f2691c;
            if (mVar5.q) {
                i2 = mVar5.F() ? Math.min(i2, 1) : Math.min(i2, -1);
            }
        }
        m mVar6 = this.f2691c;
        if (mVar6.K && mVar6.f2713f < 5) {
            i2 = Math.min(i2, 4);
        }
        if (b0.O(2)) {
            StringBuilder g3 = c.c.a.a.a.g("computeExpectedState() of ", i2, " for ");
            g3.append(this.f2691c);
            Log.v("FragmentManager", g3.toString());
        }
        return i2;
    }

    public void e() {
        if (b0.O(3)) {
            StringBuilder f2 = c.c.a.a.a.f("moveto CREATED: ");
            f2.append(this.f2691c);
            Log.d("FragmentManager", f2.toString());
        }
        m mVar = this.f2691c;
        if (!mVar.Q) {
            this.a.h(mVar, mVar.f2714g, false);
            m mVar2 = this.f2691c;
            Bundle bundle = mVar2.f2714g;
            mVar2.y.V();
            mVar2.f2713f = 1;
            mVar2.H = false;
            mVar2.S.a(new Fragment$5(mVar2));
            mVar2.V.a(bundle);
            mVar2.O(bundle);
            mVar2.Q = true;
            if (mVar2.H) {
                mVar2.S.e(e.a.ON_CREATE);
                a0 a0Var = this.a;
                m mVar3 = this.f2691c;
                a0Var.c(mVar3, mVar3.f2714g, false);
                return;
            }
            throw new z0(c.c.a.a.a.p("Fragment ", mVar2, " did not call through to super.onCreate()"));
        }
        mVar.q0(mVar.f2714g);
        this.f2691c.f2713f = 1;
    }

    public void f() {
        String str;
        if (!this.f2691c.r) {
            if (b0.O(3)) {
                StringBuilder f2 = c.c.a.a.a.f("moveto CREATE_VIEW: ");
                f2.append(this.f2691c);
                Log.d("FragmentManager", f2.toString());
            }
            m mVar = this.f2691c;
            LayoutInflater k0 = mVar.k0(mVar.f2714g);
            ViewGroup viewGroup = null;
            m mVar2 = this.f2691c;
            ViewGroup viewGroup2 = mVar2.I;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i2 = mVar2.B;
                if (i2 != 0) {
                    if (i2 != -1) {
                        viewGroup = (ViewGroup) mVar2.w.r.f(i2);
                        if (viewGroup == null) {
                            m mVar3 = this.f2691c;
                            if (!mVar3.t) {
                                try {
                                    str = mVar3.z().getResourceName(this.f2691c.B);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                StringBuilder f3 = c.c.a.a.a.f("No view found for id 0x");
                                f3.append(Integer.toHexString(this.f2691c.B));
                                f3.append(" (");
                                f3.append(str);
                                f3.append(") for fragment ");
                                f3.append(this.f2691c);
                                throw new IllegalArgumentException(f3.toString());
                            }
                        }
                    } else {
                        StringBuilder f4 = c.c.a.a.a.f("Cannot create fragment ");
                        f4.append(this.f2691c);
                        f4.append(" for a container view with no id");
                        throw new IllegalArgumentException(f4.toString());
                    }
                }
            }
            m mVar4 = this.f2691c;
            mVar4.I = viewGroup;
            mVar4.i0(k0, viewGroup, mVar4.f2714g);
            View view = this.f2691c.J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                m mVar5 = this.f2691c;
                mVar5.J.setTag(R.id.fragment_container_view_tag, mVar5);
                if (viewGroup != null) {
                    b();
                }
                m mVar6 = this.f2691c;
                if (mVar6.D) {
                    mVar6.J.setVisibility(8);
                }
                View view2 = this.f2691c.J;
                AtomicInteger atomicInteger = o.a;
                if (view2.isAttachedToWindow()) {
                    this.f2691c.J.requestApplyInsets();
                } else {
                    View view3 = this.f2691c.J;
                    view3.addOnAttachStateChangeListener(new a(this, view3));
                }
                m mVar7 = this.f2691c;
                mVar7.g0(mVar7.J, mVar7.f2714g);
                mVar7.y.w(2);
                a0 a0Var = this.a;
                m mVar8 = this.f2691c;
                a0Var.m(mVar8, mVar8.J, mVar8.f2714g, false);
                int visibility = this.f2691c.J.getVisibility();
                this.f2691c.f().n = this.f2691c.J.getAlpha();
                m mVar9 = this.f2691c;
                if (mVar9.I != null && visibility == 0) {
                    View findFocus = mVar9.J.findFocus();
                    if (findFocus != null) {
                        this.f2691c.f().o = findFocus;
                        if (b0.O(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f2691c);
                        }
                    }
                    this.f2691c.J.setAlpha(0.0f);
                }
            }
            this.f2691c.f2713f = 2;
        }
    }

    public void g() {
        m d2;
        if (b0.O(3)) {
            StringBuilder f2 = c.c.a.a.a.f("movefrom CREATED: ");
            f2.append(this.f2691c);
            Log.d("FragmentManager", f2.toString());
        }
        m mVar = this.f2691c;
        boolean z = true;
        boolean z2 = mVar.q && !mVar.F();
        if (z2 || this.b.f2695c.c(this.f2691c)) {
            y<?> yVar = this.f2691c.x;
            if (yVar instanceof w) {
                z = this.b.f2695c.f2676h;
            } else {
                Context context = yVar.f2798f;
                if (context instanceof Activity) {
                    z = true ^ ((Activity) context).isChangingConfigurations();
                }
            }
            if (z2 || z) {
                e0 e0Var = this.b.f2695c;
                m mVar2 = this.f2691c;
                Objects.requireNonNull(e0Var);
                if (b0.O(3)) {
                    Log.d("FragmentManager", "Clearing non-config state for " + mVar2);
                }
                e0 e0Var2 = e0Var.e.get(mVar2.f2717j);
                if (e0Var2 != null) {
                    e0Var2.a();
                    e0Var.e.remove(mVar2.f2717j);
                }
                v vVar = e0Var.f2674f.get(mVar2.f2717j);
                if (vVar != null) {
                    vVar.a();
                    e0Var.f2674f.remove(mVar2.f2717j);
                }
            }
            m mVar3 = this.f2691c;
            mVar3.y.o();
            mVar3.S.e(e.a.ON_DESTROY);
            mVar3.f2713f = 0;
            mVar3.H = false;
            mVar3.Q = false;
            mVar3.S();
            if (mVar3.H) {
                this.a.d(this.f2691c, false);
                Iterator it = ((ArrayList) this.b.f()).iterator();
                while (it.hasNext()) {
                    h0 h0Var = (h0) it.next();
                    if (h0Var != null) {
                        m mVar4 = h0Var.f2691c;
                        if (this.f2691c.f2717j.equals(mVar4.f2720m)) {
                            mVar4.f2719l = this.f2691c;
                            mVar4.f2720m = null;
                        }
                    }
                }
                m mVar5 = this.f2691c;
                String str = mVar5.f2720m;
                if (str != null) {
                    mVar5.f2719l = this.b.d(str);
                }
                this.b.k(this);
                return;
            }
            throw new z0(c.c.a.a.a.p("Fragment ", mVar3, " did not call through to super.onDestroy()"));
        }
        String str2 = this.f2691c.f2720m;
        if (!(str2 == null || (d2 = this.b.d(str2)) == null || !d2.F)) {
            this.f2691c.f2719l = d2;
        }
        this.f2691c.f2713f = 0;
    }

    public void h() {
        View view;
        if (b0.O(3)) {
            StringBuilder f2 = c.c.a.a.a.f("movefrom CREATE_VIEW: ");
            f2.append(this.f2691c);
            Log.d("FragmentManager", f2.toString());
        }
        m mVar = this.f2691c;
        ViewGroup viewGroup = mVar.I;
        if (!(viewGroup == null || (view = mVar.J) == null)) {
            viewGroup.removeView(view);
        }
        this.f2691c.j0();
        this.a.n(this.f2691c, false);
        m mVar2 = this.f2691c;
        mVar2.I = null;
        mVar2.J = null;
        mVar2.T = null;
        mVar2.U.h(null);
        this.f2691c.s = false;
    }

    public void i() {
        if (b0.O(3)) {
            StringBuilder f2 = c.c.a.a.a.f("movefrom ATTACHED: ");
            f2.append(this.f2691c);
            Log.d("FragmentManager", f2.toString());
        }
        m mVar = this.f2691c;
        mVar.f2713f = -1;
        mVar.H = false;
        mVar.U();
        mVar.P = null;
        if (mVar.H) {
            b0 b0Var = mVar.y;
            if (!b0Var.D) {
                b0Var.o();
                mVar.y = new c0();
            }
            this.a.e(this.f2691c, false);
            m mVar2 = this.f2691c;
            mVar2.f2713f = -1;
            mVar2.x = null;
            mVar2.z = null;
            mVar2.w = null;
            if ((mVar2.q && !mVar2.F()) || this.b.f2695c.c(this.f2691c)) {
                if (b0.O(3)) {
                    StringBuilder f3 = c.c.a.a.a.f("initState called for fragment: ");
                    f3.append(this.f2691c);
                    Log.d("FragmentManager", f3.toString());
                }
                m mVar3 = this.f2691c;
                Objects.requireNonNull(mVar3);
                mVar3.S = new j(mVar3);
                mVar3.V = new b(mVar3);
                mVar3.f2717j = UUID.randomUUID().toString();
                mVar3.p = false;
                mVar3.q = false;
                mVar3.r = false;
                mVar3.s = false;
                mVar3.t = false;
                mVar3.v = 0;
                mVar3.w = null;
                mVar3.y = new c0();
                mVar3.x = null;
                mVar3.A = 0;
                mVar3.B = 0;
                mVar3.C = null;
                mVar3.D = false;
                mVar3.E = false;
                return;
            }
            return;
        }
        throw new z0(c.c.a.a.a.p("Fragment ", mVar, " did not call through to super.onDetach()"));
    }

    public void j() {
        m mVar = this.f2691c;
        if (mVar.r && mVar.s && !mVar.u) {
            if (b0.O(3)) {
                StringBuilder f2 = c.c.a.a.a.f("moveto CREATE_VIEW: ");
                f2.append(this.f2691c);
                Log.d("FragmentManager", f2.toString());
            }
            m mVar2 = this.f2691c;
            mVar2.i0(mVar2.k0(mVar2.f2714g), null, this.f2691c.f2714g);
            View view = this.f2691c.J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                m mVar3 = this.f2691c;
                mVar3.J.setTag(R.id.fragment_container_view_tag, mVar3);
                m mVar4 = this.f2691c;
                if (mVar4.D) {
                    mVar4.J.setVisibility(8);
                }
                m mVar5 = this.f2691c;
                mVar5.g0(mVar5.J, mVar5.f2714g);
                mVar5.y.w(2);
                a0 a0Var = this.a;
                m mVar6 = this.f2691c;
                a0Var.m(mVar6, mVar6.J, mVar6.f2714g, false);
                this.f2691c.f2713f = 2;
            }
        }
    }

    public void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        x0.d.b bVar = x0.d.b.NONE;
        if (!this.f2692d) {
            boolean z = false;
            boolean z2 = true;
            try {
                while (true) {
                    int d2 = d();
                    m mVar = this.f2691c;
                    int i2 = mVar.f2713f;
                    if (d2 == i2) {
                        if (mVar.N) {
                            if (!(mVar.J == null || (viewGroup = mVar.I) == null)) {
                                x0 g2 = x0.g(viewGroup, mVar.u().M());
                                if (this.f2691c.D) {
                                    Objects.requireNonNull(g2);
                                    if (b0.O(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f2691c);
                                    }
                                    g2.a(x0.d.c.GONE, bVar, this);
                                } else {
                                    Objects.requireNonNull(g2);
                                    if (b0.O(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.f2691c);
                                    }
                                    g2.a(x0.d.c.VISIBLE, bVar, this);
                                }
                            }
                            m mVar2 = this.f2691c;
                            b0 b0Var = mVar2.w;
                            if (b0Var != null && mVar2.p && b0Var.P(mVar2)) {
                                b0Var.A = z2;
                            }
                            m mVar3 = this.f2691c;
                            mVar3.N = z;
                            mVar3.W();
                        }
                        this.f2692d = z;
                        return;
                    } else if (d2 > i2) {
                        switch (i2 + 1) {
                            case 0:
                                c();
                                continue;
                            case 1:
                                e();
                                continue;
                            case 2:
                                j();
                                f();
                                continue;
                            case 3:
                                a();
                                continue;
                            case 4:
                                if (!(mVar.J == null || (viewGroup3 = mVar.I) == null)) {
                                    x0 g3 = x0.g(viewGroup3, mVar.u().M());
                                    x0.d.c b2 = x0.d.c.b(this.f2691c.J.getVisibility());
                                    Objects.requireNonNull(g3);
                                    if (b0.O(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.f2691c);
                                    }
                                    g3.a(b2, x0.d.b.ADDING, this);
                                }
                                this.f2691c.f2713f = 4;
                                continue;
                            case 5:
                                p();
                                continue;
                            case 6:
                                mVar.f2713f = 6;
                                continue;
                            case 7:
                                n();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i2 - 1) {
                            case -1:
                                i();
                                continue;
                            case 0:
                                g();
                                continue;
                            case 1:
                                h();
                                this.f2691c.f2713f = z2 ? 1 : 0;
                                continue;
                            case 2:
                                mVar.s = z;
                                mVar.f2713f = 2;
                                continue;
                            case 3:
                                if (b0.O(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f2691c);
                                }
                                m mVar4 = this.f2691c;
                                if (mVar4.J != null && mVar4.f2715h == null) {
                                    o();
                                }
                                m mVar5 = this.f2691c;
                                if (!(mVar5.J == null || (viewGroup2 = mVar5.I) == null)) {
                                    x0 g4 = x0.g(viewGroup2, mVar5.u().M());
                                    Objects.requireNonNull(g4);
                                    if (b0.O(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f2691c);
                                    }
                                    g4.a(x0.d.c.REMOVED, x0.d.b.REMOVING, this);
                                }
                                this.f2691c.f2713f = 3;
                                continue;
                            case 4:
                                q();
                                continue;
                            case 5:
                                mVar.f2713f = 5;
                                continue;
                            case 6:
                                l();
                                continue;
                            default:
                                continue;
                        }
                    }
                }
            } finally {
                this.f2692d = z;
            }
        } else if (b0.O(2)) {
            StringBuilder f2 = c.c.a.a.a.f("Ignoring re-entrant call to moveToExpectedState() for ");
            f2.append(this.f2691c);
            Log.v("FragmentManager", f2.toString());
        }
    }

    public void l() {
        if (b0.O(3)) {
            StringBuilder f2 = c.c.a.a.a.f("movefrom RESUMED: ");
            f2.append(this.f2691c);
            Log.d("FragmentManager", f2.toString());
        }
        m mVar = this.f2691c;
        mVar.y.w(5);
        if (mVar.J != null) {
            mVar.T.d(e.a.ON_PAUSE);
        }
        mVar.S.e(e.a.ON_PAUSE);
        mVar.f2713f = 6;
        mVar.H = false;
        mVar.H = true;
        this.a.f(this.f2691c, false);
    }

    public void m(ClassLoader classLoader) {
        Bundle bundle = this.f2691c.f2714g;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            m mVar = this.f2691c;
            mVar.f2715h = mVar.f2714g.getSparseParcelableArray("android:view_state");
            m mVar2 = this.f2691c;
            mVar2.f2716i = mVar2.f2714g.getBundle("android:view_registry_state");
            m mVar3 = this.f2691c;
            mVar3.f2720m = mVar3.f2714g.getString("android:target_state");
            m mVar4 = this.f2691c;
            if (mVar4.f2720m != null) {
                mVar4.n = mVar4.f2714g.getInt("android:target_req_state", 0);
            }
            m mVar5 = this.f2691c;
            Objects.requireNonNull(mVar5);
            mVar5.L = mVar5.f2714g.getBoolean("android:user_visible_hint", true);
            m mVar6 = this.f2691c;
            if (!mVar6.L) {
                mVar6.K = true;
            }
        }
    }

    public void n() {
        boolean z;
        if (b0.O(3)) {
            StringBuilder f2 = c.c.a.a.a.f("moveto RESUMED: ");
            f2.append(this.f2691c);
            Log.d("FragmentManager", f2.toString());
        }
        m mVar = this.f2691c;
        m.b bVar = mVar.M;
        View view = bVar == null ? null : bVar.o;
        if (view != null) {
            if (view != mVar.J) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else if (parent == this.f2691c.J) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            z = true;
            if (z) {
                boolean requestFocus = view.requestFocus();
                if (b0.O(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    sb.append(requestFocus ? "succeeded" : "failed");
                    sb.append(" on Fragment ");
                    sb.append(this.f2691c);
                    sb.append(" resulting in focused view ");
                    sb.append(this.f2691c.J.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        this.f2691c.v0(null);
        m mVar2 = this.f2691c;
        mVar2.y.V();
        mVar2.y.C(true);
        mVar2.f2713f = 7;
        mVar2.H = false;
        mVar2.H = true;
        j jVar = mVar2.S;
        e.a aVar = e.a.ON_RESUME;
        jVar.e(aVar);
        if (mVar2.J != null) {
            mVar2.T.d(aVar);
        }
        b0 b0Var = mVar2.y;
        b0Var.B = false;
        b0Var.C = false;
        b0Var.J.f2677i = false;
        b0Var.w(7);
        this.a.i(this.f2691c, false);
        m mVar3 = this.f2691c;
        mVar3.f2714g = null;
        mVar3.f2715h = null;
        mVar3.f2716i = null;
    }

    public void o() {
        if (this.f2691c.J != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f2691c.J.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f2691c.f2715h = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f2691c.T.f2780g.b(bundle);
            if (!bundle.isEmpty()) {
                this.f2691c.f2716i = bundle;
            }
        }
    }

    public void p() {
        if (b0.O(3)) {
            StringBuilder f2 = c.c.a.a.a.f("moveto STARTED: ");
            f2.append(this.f2691c);
            Log.d("FragmentManager", f2.toString());
        }
        m mVar = this.f2691c;
        mVar.y.V();
        mVar.y.C(true);
        mVar.f2713f = 5;
        mVar.H = false;
        mVar.e0();
        if (mVar.H) {
            j jVar = mVar.S;
            e.a aVar = e.a.ON_START;
            jVar.e(aVar);
            if (mVar.J != null) {
                mVar.T.d(aVar);
            }
            b0 b0Var = mVar.y;
            b0Var.B = false;
            b0Var.C = false;
            b0Var.J.f2677i = false;
            b0Var.w(5);
            this.a.k(this.f2691c, false);
            return;
        }
        throw new z0(c.c.a.a.a.p("Fragment ", mVar, " did not call through to super.onStart()"));
    }

    public void q() {
        if (b0.O(3)) {
            StringBuilder f2 = c.c.a.a.a.f("movefrom STARTED: ");
            f2.append(this.f2691c);
            Log.d("FragmentManager", f2.toString());
        }
        m mVar = this.f2691c;
        b0 b0Var = mVar.y;
        b0Var.C = true;
        b0Var.J.f2677i = true;
        b0Var.w(4);
        if (mVar.J != null) {
            mVar.T.d(e.a.ON_STOP);
        }
        mVar.S.e(e.a.ON_STOP);
        mVar.f2713f = 4;
        mVar.H = false;
        mVar.f0();
        if (mVar.H) {
            this.a.l(this.f2691c, false);
            return;
        }
        throw new z0(c.c.a.a.a.p("Fragment ", mVar, " did not call through to super.onStop()"));
    }
}
