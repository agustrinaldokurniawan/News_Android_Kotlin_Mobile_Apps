package g.l.b;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.tsuga.news.R;
import g.l.b.b0;
import g.n.e;
import g.n.i;
import g.n.j;
import g.n.o;
import g.n.v;
import g.n.w;
import g.o.a.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class m implements ComponentCallbacks, View.OnCreateContextMenuListener, i, w, g.s.c {
    public static final Object e = new Object();
    public int A;
    public int B;
    public String C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G = true;
    public boolean H;
    public ViewGroup I;
    public View J;
    public boolean K;
    public boolean L = true;
    public b M;
    public boolean N;
    public float O;
    public LayoutInflater P;
    public boolean Q;
    public e.b R = e.b.RESUMED;
    public j S;
    public v0 T;
    public o<i> U = new o<>();
    public g.s.b V;
    public final ArrayList<d> W;

    /* renamed from: f  reason: collision with root package name */
    public int f2713f = -1;

    /* renamed from: g  reason: collision with root package name */
    public Bundle f2714g;

    /* renamed from: h  reason: collision with root package name */
    public SparseArray<Parcelable> f2715h;

    /* renamed from: i  reason: collision with root package name */
    public Bundle f2716i;

    /* renamed from: j  reason: collision with root package name */
    public String f2717j = UUID.randomUUID().toString();

    /* renamed from: k  reason: collision with root package name */
    public Bundle f2718k;

    /* renamed from: l  reason: collision with root package name */
    public m f2719l;

    /* renamed from: m  reason: collision with root package name */
    public String f2720m = null;
    public int n;
    public Boolean o = null;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public b0 w;
    public y<?> x;
    public b0 y = new c0();
    public m z;

    public class a extends v {
        public a() {
        }

        @Override // g.l.b.v
        public View f(int i2) {
            View view = m.this.J;
            if (view != null) {
                return view.findViewById(i2);
            }
            StringBuilder f2 = c.c.a.a.a.f("Fragment ");
            f2.append(m.this);
            f2.append(" does not have a view");
            throw new IllegalStateException(f2.toString());
        }

        @Override // g.l.b.v
        public boolean h() {
            return m.this.J != null;
        }
    }

    public static class b {
        public View a;
        public Animator b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2721c;

        /* renamed from: d  reason: collision with root package name */
        public int f2722d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f2723f;

        /* renamed from: g  reason: collision with root package name */
        public int f2724g;

        /* renamed from: h  reason: collision with root package name */
        public int f2725h;

        /* renamed from: i  reason: collision with root package name */
        public ArrayList<String> f2726i;

        /* renamed from: j  reason: collision with root package name */
        public ArrayList<String> f2727j;

        /* renamed from: k  reason: collision with root package name */
        public Object f2728k;

        /* renamed from: l  reason: collision with root package name */
        public Object f2729l;

        /* renamed from: m  reason: collision with root package name */
        public Object f2730m;
        public float n = 1.0f;
        public View o = null;
        public e p;
        public boolean q;

        public b() {
            Object obj = m.e;
            this.f2728k = obj;
            this.f2729l = obj;
            this.f2730m = obj;
        }
    }

    public static class c extends RuntimeException {
        public c(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class d {
        public abstract void a();
    }

    public interface e {
    }

    public m() {
        new AtomicInteger();
        this.W = new ArrayList<>();
        this.S = new j(this);
        this.V = new g.s.b(this);
    }

    public Object A() {
        b bVar = this.M;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f2728k;
        if (obj != e) {
            return obj;
        }
        m();
        return null;
    }

    public void A0() {
        if (this.M != null) {
            Objects.requireNonNull(f());
        }
    }

    public Object B() {
        b bVar = this.M;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    public Object C() {
        b bVar = this.M;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f2730m;
        if (obj != e) {
            return obj;
        }
        B();
        return null;
    }

    public final String D(int i2) {
        return z().getString(i2);
    }

    public i E() {
        v0 v0Var = this.T;
        if (v0Var != null) {
            return v0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final boolean F() {
        return this.v > 0;
    }

    public boolean G() {
        b bVar = this.M;
        return false;
    }

    public final boolean H() {
        m mVar = this.z;
        return mVar != null && (mVar.q || mVar.H());
    }

    @Deprecated
    public void I() {
        this.H = true;
    }

    @Deprecated
    public void J(int i2, int i3, Intent intent) {
        if (b0.O(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    @Deprecated
    public void K() {
        this.H = true;
    }

    public void L(Context context) {
        this.H = true;
        y<?> yVar = this.x;
        if ((yVar == null ? null : yVar.e) != null) {
            this.H = false;
            K();
        }
    }

    @Deprecated
    public void M(m mVar) {
    }

    public boolean N() {
        return false;
    }

    public void O(Bundle bundle) {
        Parcelable parcelable;
        boolean z2 = true;
        this.H = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.y.a0(parcelable);
            this.y.m();
        }
        b0 b0Var = this.y;
        if (b0Var.p < 1) {
            z2 = false;
        }
        if (!z2) {
            b0Var.m();
        }
    }

    public Animation P() {
        return null;
    }

    public Animator Q() {
        return null;
    }

    public View R(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void S() {
        this.H = true;
    }

    public void T() {
        this.H = true;
    }

    public void U() {
        this.H = true;
    }

    public LayoutInflater V(Bundle bundle) {
        return s();
    }

    public void W() {
    }

    @Deprecated
    public void X() {
        this.H = true;
    }

    public void Y(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.H = true;
        y<?> yVar = this.x;
        if ((yVar == null ? null : yVar.e) != null) {
            this.H = false;
            X();
        }
    }

    public void Z() {
    }

    @Override // g.n.i
    public g.n.e a() {
        return this.S;
    }

    public void a0() {
    }

    public void b0(boolean z2) {
    }

    @Override // g.s.c
    public final g.s.a c() {
        return this.V.b;
    }

    @Deprecated
    public void c0() {
    }

    public v d() {
        return new a();
    }

    public void d0(Bundle bundle) {
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.A));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.B));
        printWriter.print(" mTag=");
        printWriter.println(this.C);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2713f);
        printWriter.print(" mWho=");
        printWriter.print(this.f2717j);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.p);
        printWriter.print(" mRemoving=");
        printWriter.print(this.q);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.r);
        printWriter.print(" mInLayout=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.D);
        printWriter.print(" mDetached=");
        printWriter.print(this.E);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.G);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.L);
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.w);
        }
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.x);
        }
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.z);
        }
        if (this.f2718k != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2718k);
        }
        if (this.f2714g != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2714g);
        }
        if (this.f2715h != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2715h);
        }
        if (this.f2716i != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2716i);
        }
        m mVar = this.f2719l;
        if (mVar == null) {
            b0 b0Var = this.w;
            mVar = (b0Var == null || (str2 = this.f2720m) == null) ? null : b0Var.f2642c.d(str2);
        }
        if (mVar != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(mVar);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.n);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(v());
        if (l() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(l());
        }
        if (o() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(o());
        }
        if (w() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(w());
        }
        if (x() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(x());
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.J);
        }
        if (i() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(i());
        }
        if (k() != null) {
            g.o.a.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.y + ":");
        this.y.y(c.c.a.a.a.q(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public void e0() {
        this.H = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final b f() {
        if (this.M == null) {
            this.M = new b();
        }
        return this.M;
    }

    public void f0() {
        this.H = true;
    }

    @Override // g.n.w
    public v g() {
        if (this.w == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (t() != 1) {
            e0 e0Var = this.w.J;
            v vVar = e0Var.f2674f.get(this.f2717j);
            if (vVar != null) {
                return vVar;
            }
            v vVar2 = new v();
            e0Var.f2674f.put(this.f2717j, vVar2);
            return vVar2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public void g0(View view, Bundle bundle) {
    }

    public final p h() {
        y<?> yVar = this.x;
        if (yVar == null) {
            return null;
        }
        return (p) yVar.e;
    }

    public void h0(Bundle bundle) {
        this.H = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public View i() {
        b bVar = this.M;
        if (bVar == null) {
            return null;
        }
        return bVar.a;
    }

    public void i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.y.V();
        boolean z2 = true;
        this.u = true;
        this.T = new v0(this, g());
        View R2 = R(layoutInflater, viewGroup, bundle);
        this.J = R2;
        if (R2 != null) {
            this.T.e();
            this.J.setTag(R.id.view_tree_lifecycle_owner, this.T);
            this.J.setTag(R.id.view_tree_view_model_store_owner, this.T);
            this.J.setTag(R.id.view_tree_saved_state_registry_owner, this.T);
            this.U.h(this.T);
            return;
        }
        if (this.T.f2779f == null) {
            z2 = false;
        }
        if (!z2) {
            this.T = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final b0 j() {
        if (this.x != null) {
            return this.y;
        }
        throw new IllegalStateException(c.c.a.a.a.p("Fragment ", this, " has not been attached yet."));
    }

    public void j0() {
        this.y.w(1);
        if (this.J != null) {
            v0 v0Var = this.T;
            v0Var.e();
            if (v0Var.f2779f.b.compareTo(e.b.CREATED) >= 0) {
                this.T.d(e.a.ON_DESTROY);
            }
        }
        this.f2713f = 1;
        this.H = false;
        T();
        if (this.H) {
            b.C0088b bVar = ((g.o.a.b) g.o.a.a.b(this)).b;
            int k2 = bVar.f2822d.k();
            for (int i2 = 0; i2 < k2; i2++) {
                Objects.requireNonNull(bVar.f2822d.l(i2));
            }
            this.u = false;
            return;
        }
        throw new z0(c.c.a.a.a.p("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public Context k() {
        y<?> yVar = this.x;
        if (yVar == null) {
            return null;
        }
        return yVar.f2798f;
    }

    public LayoutInflater k0(Bundle bundle) {
        LayoutInflater V2 = V(bundle);
        this.P = V2;
        return V2;
    }

    public int l() {
        b bVar = this.M;
        if (bVar == null) {
            return 0;
        }
        return bVar.f2722d;
    }

    public void l0() {
        onLowMemory();
        this.y.p();
    }

    public Object m() {
        b bVar = this.M;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    public boolean m0(Menu menu) {
        if (!this.D) {
            return false | this.y.v(menu);
        }
        return false;
    }

    public void n() {
        b bVar = this.M;
        if (bVar != null) {
            Objects.requireNonNull(bVar);
        }
    }

    public final p n0() {
        p h2 = h();
        if (h2 != null) {
            return h2;
        }
        throw new IllegalStateException(c.c.a.a.a.p("Fragment ", this, " not attached to an activity."));
    }

    public int o() {
        b bVar = this.M;
        if (bVar == null) {
            return 0;
        }
        return bVar.e;
    }

    public final Context o0() {
        Context k2 = k();
        if (k2 != null) {
            return k2;
        }
        throw new IllegalStateException(c.c.a.a.a.p("Fragment ", this, " not attached to a context."));
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        n0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.H = true;
    }

    public Object p() {
        b bVar = this.M;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    public final View p0() {
        View view = this.J;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(c.c.a.a.a.p("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void q() {
        b bVar = this.M;
        if (bVar != null) {
            Objects.requireNonNull(bVar);
        }
    }

    public void q0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.y.a0(parcelable);
            this.y.m();
        }
    }

    public final LayoutInflater r() {
        LayoutInflater layoutInflater = this.P;
        return layoutInflater == null ? k0(null) : layoutInflater;
    }

    public void r0(View view) {
        f().a = view;
    }

    @Deprecated
    public LayoutInflater s() {
        y<?> yVar = this.x;
        if (yVar != null) {
            LayoutInflater j2 = yVar.j();
            j2.setFactory2(this.y.f2644f);
            return j2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void s0(int i2, int i3, int i4, int i5) {
        if (this.M != null || i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0) {
            f().f2722d = i2;
            f().e = i3;
            f().f2723f = i4;
            f().f2724g = i5;
        }
    }

    public final int t() {
        e.b bVar = this.R;
        return (bVar == e.b.INITIALIZED || this.z == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.z.t());
    }

    public void t0(Animator animator) {
        f().b = animator;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f2717j);
        if (this.A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.A));
        }
        if (this.C != null) {
            sb.append(" tag=");
            sb.append(this.C);
        }
        sb.append(")");
        return sb.toString();
    }

    public final b0 u() {
        b0 b0Var = this.w;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException(c.c.a.a.a.p("Fragment ", this, " not associated with a fragment manager."));
    }

    public void u0(Bundle bundle) {
        b0 b0Var = this.w;
        if (b0Var != null) {
            if (b0Var == null ? false : b0Var.S()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f2718k = bundle;
    }

    public boolean v() {
        b bVar = this.M;
        if (bVar == null) {
            return false;
        }
        return bVar.f2721c;
    }

    public void v0(View view) {
        f().o = null;
    }

    public int w() {
        b bVar = this.M;
        if (bVar == null) {
            return 0;
        }
        return bVar.f2723f;
    }

    public void w0(boolean z2) {
        f().q = z2;
    }

    public int x() {
        b bVar = this.M;
        if (bVar == null) {
            return 0;
        }
        return bVar.f2724g;
    }

    public void x0(e eVar) {
        f();
        e eVar2 = this.M.p;
        if (eVar != eVar2) {
            if (eVar != null && eVar2 != null) {
                throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
            } else if (eVar != null) {
                ((b0.n) eVar).f2656c++;
            }
        }
    }

    public Object y() {
        b bVar = this.M;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f2729l;
        if (obj != e) {
            return obj;
        }
        p();
        return null;
    }

    public void y0(boolean z2) {
        if (this.M != null) {
            f().f2721c = z2;
        }
    }

    public final Resources z() {
        return o0().getResources();
    }

    public void z0(@SuppressLint({"UnknownNullness"}) Intent intent) {
        y<?> yVar = this.x;
        if (yVar != null) {
            Context context = yVar.f2798f;
            Object obj = g.h.c.a.a;
            context.startActivity(intent, null);
            return;
        }
        throw new IllegalStateException(c.c.a.a.a.p("Fragment ", this, " not attached to Activity"));
    }
}
