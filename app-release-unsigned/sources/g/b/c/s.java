package g.b.c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.tsuga.news.R;
import g.b.c.a;
import g.b.f.a;
import g.b.f.f;
import g.b.f.g;
import g.b.f.i.g;
import g.b.g.f0;
import g.h.j.o;
import g.h.j.u;
import g.h.j.v;
import g.h.j.w;
import g.h.j.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class s extends a implements ActionBarOverlayLayout.d {
    public static final Interpolator a = new AccelerateInterpolator();
    public static final Interpolator b = new DecelerateInterpolator();
    public final v A = new b();
    public final x B = new c();

    /* renamed from: c  reason: collision with root package name */
    public Context f1901c;

    /* renamed from: d  reason: collision with root package name */
    public Context f1902d;
    public ActionBarOverlayLayout e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContainer f1903f;

    /* renamed from: g  reason: collision with root package name */
    public f0 f1904g;

    /* renamed from: h  reason: collision with root package name */
    public ActionBarContextView f1905h;

    /* renamed from: i  reason: collision with root package name */
    public View f1906i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1907j;

    /* renamed from: k  reason: collision with root package name */
    public d f1908k;

    /* renamed from: l  reason: collision with root package name */
    public g.b.f.a f1909l;

    /* renamed from: m  reason: collision with root package name */
    public a.AbstractC0064a f1910m;
    public boolean n;
    public ArrayList<a.b> o = new ArrayList<>();
    public boolean p;
    public int q = 0;
    public boolean r = true;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v = true;
    public g w;
    public boolean x;
    public boolean y;
    public final v z = new a();

    public class a extends w {
        public a() {
        }

        @Override // g.h.j.v
        public void a(View view) {
            View view2;
            s sVar = s.this;
            if (sVar.r && (view2 = sVar.f1906i) != null) {
                view2.setTranslationY(0.0f);
                s.this.f1903f.setTranslationY(0.0f);
            }
            s.this.f1903f.setVisibility(8);
            s.this.f1903f.setTransitioning(false);
            s sVar2 = s.this;
            sVar2.w = null;
            a.AbstractC0064a aVar = sVar2.f1910m;
            if (aVar != null) {
                aVar.d(sVar2.f1909l);
                sVar2.f1909l = null;
                sVar2.f1910m = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = s.this.e;
            if (actionBarOverlayLayout != null) {
                AtomicInteger atomicInteger = o.a;
                actionBarOverlayLayout.requestApplyInsets();
            }
        }
    }

    public class b extends w {
        public b() {
        }

        @Override // g.h.j.v
        public void a(View view) {
            s sVar = s.this;
            sVar.w = null;
            sVar.f1903f.requestLayout();
        }
    }

    public class c implements x {
        public c() {
        }
    }

    public class d extends g.b.f.a implements g.a {

        /* renamed from: g  reason: collision with root package name */
        public final Context f1911g;

        /* renamed from: h  reason: collision with root package name */
        public final g.b.f.i.g f1912h;

        /* renamed from: i  reason: collision with root package name */
        public a.AbstractC0064a f1913i;

        /* renamed from: j  reason: collision with root package name */
        public WeakReference<View> f1914j;

        public d(Context context, a.AbstractC0064a aVar) {
            this.f1911g = context;
            this.f1913i = aVar;
            g.b.f.i.g gVar = new g.b.f.i.g(context);
            gVar.f1996m = 1;
            this.f1912h = gVar;
            gVar.f1989f = this;
        }

        @Override // g.b.f.i.g.a
        public boolean a(g.b.f.i.g gVar, MenuItem menuItem) {
            a.AbstractC0064a aVar = this.f1913i;
            if (aVar != null) {
                return aVar.b(this, menuItem);
            }
            return false;
        }

        @Override // g.b.f.i.g.a
        public void b(g.b.f.i.g gVar) {
            if (this.f1913i != null) {
                i();
                g.b.g.c cVar = s.this.f1905h.f2032h;
                if (cVar != null) {
                    cVar.n();
                }
            }
        }

        @Override // g.b.f.a
        public void c() {
            s sVar = s.this;
            if (sVar.f1908k == this) {
                boolean z = sVar.s;
                boolean z2 = sVar.t;
                boolean z3 = true;
                if (z || z2) {
                    z3 = false;
                }
                if (!z3) {
                    sVar.f1909l = this;
                    sVar.f1910m = this.f1913i;
                } else {
                    this.f1913i.d(this);
                }
                this.f1913i = null;
                s.this.e(false);
                ActionBarContextView actionBarContextView = s.this.f1905h;
                if (actionBarContextView.o == null) {
                    actionBarContextView.h();
                }
                s.this.f1904g.n().sendAccessibilityEvent(32);
                s sVar2 = s.this;
                sVar2.e.setHideOnContentScrollEnabled(sVar2.y);
                s.this.f1908k = null;
            }
        }

        @Override // g.b.f.a
        public View d() {
            WeakReference<View> weakReference = this.f1914j;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // g.b.f.a
        public Menu e() {
            return this.f1912h;
        }

        @Override // g.b.f.a
        public MenuInflater f() {
            return new f(this.f1911g);
        }

        @Override // g.b.f.a
        public CharSequence g() {
            return s.this.f1905h.getSubtitle();
        }

        @Override // g.b.f.a
        public CharSequence h() {
            return s.this.f1905h.getTitle();
        }

        @Override // g.b.f.a
        public void i() {
            if (s.this.f1908k == this) {
                this.f1912h.z();
                try {
                    this.f1913i.a(this, this.f1912h);
                } finally {
                    this.f1912h.y();
                }
            }
        }

        @Override // g.b.f.a
        public boolean j() {
            return s.this.f1905h.w;
        }

        @Override // g.b.f.a
        public void k(View view) {
            s.this.f1905h.setCustomView(view);
            this.f1914j = new WeakReference<>(view);
        }

        @Override // g.b.f.a
        public void l(int i2) {
            s.this.f1905h.setSubtitle(s.this.f1901c.getResources().getString(i2));
        }

        @Override // g.b.f.a
        public void m(CharSequence charSequence) {
            s.this.f1905h.setSubtitle(charSequence);
        }

        @Override // g.b.f.a
        public void n(int i2) {
            s.this.f1905h.setTitle(s.this.f1901c.getResources().getString(i2));
        }

        @Override // g.b.f.a
        public void o(CharSequence charSequence) {
            s.this.f1905h.setTitle(charSequence);
        }

        @Override // g.b.f.a
        public void p(boolean z) {
            this.f1917f = z;
            s.this.f1905h.setTitleOptional(z);
        }
    }

    public s(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        f(decorView);
        if (!z2) {
            this.f1906i = decorView.findViewById(16908290);
        }
    }

    public s(Dialog dialog) {
        new ArrayList();
        f(dialog.getWindow().getDecorView());
    }

    @Override // g.b.c.a
    public void a(boolean z2) {
        if (z2 != this.n) {
            this.n = z2;
            int size = this.o.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.o.get(i2).a(z2);
            }
        }
    }

    @Override // g.b.c.a
    public Context b() {
        if (this.f1902d == null) {
            TypedValue typedValue = new TypedValue();
            this.f1901c.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f1902d = new ContextThemeWrapper(this.f1901c, i2);
            } else {
                this.f1902d = this.f1901c;
            }
        }
        return this.f1902d;
    }

    @Override // g.b.c.a
    public void c() {
        if (!this.s) {
            this.s = true;
            h(false);
        }
    }

    @Override // g.b.c.a
    public void d(boolean z2) {
        if (!this.f1907j) {
            int i2 = z2 ? 4 : 0;
            int j2 = this.f1904g.j();
            this.f1907j = true;
            this.f1904g.v((i2 & 4) | (j2 & -5));
        }
    }

    public void e(boolean z2) {
        u uVar;
        u uVar2;
        if (z2) {
            if (!this.u) {
                this.u = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.e;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                h(false);
            }
        } else if (this.u) {
            this.u = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.e;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            h(false);
        }
        ActionBarContainer actionBarContainer = this.f1903f;
        AtomicInteger atomicInteger = o.a;
        if (actionBarContainer.isLaidOut()) {
            if (z2) {
                uVar = this.f1904g.q(4, 100);
                uVar2 = this.f1905h.e(0, 200);
            } else {
                uVar2 = this.f1904g.q(0, 200);
                uVar = this.f1905h.e(8, 100);
            }
            g.b.f.g gVar = new g.b.f.g();
            gVar.a.add(uVar);
            View view = uVar.a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = uVar2.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            gVar.a.add(uVar2);
            gVar.b();
        } else if (z2) {
            this.f1904g.k(4);
            this.f1905h.setVisibility(0);
        } else {
            this.f1904g.k(0);
            this.f1905h.setVisibility(8);
        }
    }

    public final void f(View view) {
        f0 f0Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof f0) {
            f0Var = (f0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            f0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder f2 = c.c.a.a.a.f("Can't make a decor toolbar out of ");
            f2.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(f2.toString());
        }
        this.f1904g = f0Var;
        this.f1905h = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f1903f = actionBarContainer;
        f0 f0Var2 = this.f1904g;
        if (f0Var2 == null || this.f1905h == null || actionBarContainer == null) {
            throw new IllegalStateException(s.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1901c = f0Var2.d();
        boolean z2 = (this.f1904g.j() & 4) != 0;
        if (z2) {
            this.f1907j = true;
        }
        Context context = this.f1901c;
        this.f1904g.o((context.getApplicationInfo().targetSdkVersion < 14) || z2);
        g(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f1901c.obtainStyledAttributes(null, g.b.b.a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.e;
            if (actionBarOverlayLayout2.f85m) {
                this.y = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f1903f;
            AtomicInteger atomicInteger = o.a;
            actionBarContainer2.setElevation((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void g(boolean z2) {
        this.p = z2;
        if (!z2) {
            this.f1904g.m(null);
            this.f1903f.setTabContainer(null);
        } else {
            this.f1903f.setTabContainer(null);
            this.f1904g.m(null);
        }
        boolean z3 = true;
        boolean z4 = this.f1904g.p() == 2;
        this.f1904g.u(!this.p && z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.e;
        if (this.p || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z3);
    }

    public final void h(boolean z2) {
        View view;
        View view2;
        View view3;
        if (this.u || (!this.s && !this.t)) {
            if (!this.v) {
                this.v = true;
                g.b.f.g gVar = this.w;
                if (gVar != null) {
                    gVar.a();
                }
                this.f1903f.setVisibility(0);
                if (this.q != 0 || (!this.x && !z2)) {
                    this.f1903f.setAlpha(1.0f);
                    this.f1903f.setTranslationY(0.0f);
                    if (this.r && (view2 = this.f1906i) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.A.a(null);
                } else {
                    this.f1903f.setTranslationY(0.0f);
                    float f2 = (float) (-this.f1903f.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.f1903f.getLocationInWindow(iArr);
                        f2 -= (float) iArr[1];
                    }
                    this.f1903f.setTranslationY(f2);
                    g.b.f.g gVar2 = new g.b.f.g();
                    u b2 = o.b(this.f1903f);
                    b2.g(0.0f);
                    b2.f(this.B);
                    if (!gVar2.e) {
                        gVar2.a.add(b2);
                    }
                    if (this.r && (view3 = this.f1906i) != null) {
                        view3.setTranslationY(f2);
                        u b3 = o.b(this.f1906i);
                        b3.g(0.0f);
                        if (!gVar2.e) {
                            gVar2.a.add(b3);
                        }
                    }
                    Interpolator interpolator = b;
                    boolean z3 = gVar2.e;
                    if (!z3) {
                        gVar2.f1942c = interpolator;
                    }
                    if (!z3) {
                        gVar2.b = 250;
                    }
                    v vVar = this.A;
                    if (!z3) {
                        gVar2.f1943d = vVar;
                    }
                    this.w = gVar2;
                    gVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.e;
                if (actionBarOverlayLayout != null) {
                    AtomicInteger atomicInteger = o.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
            }
        } else if (this.v) {
            this.v = false;
            g.b.f.g gVar3 = this.w;
            if (gVar3 != null) {
                gVar3.a();
            }
            if (this.q != 0 || (!this.x && !z2)) {
                this.z.a(null);
                return;
            }
            this.f1903f.setAlpha(1.0f);
            this.f1903f.setTransitioning(true);
            g.b.f.g gVar4 = new g.b.f.g();
            float f3 = (float) (-this.f1903f.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.f1903f.getLocationInWindow(iArr2);
                f3 -= (float) iArr2[1];
            }
            u b4 = o.b(this.f1903f);
            b4.g(f3);
            b4.f(this.B);
            if (!gVar4.e) {
                gVar4.a.add(b4);
            }
            if (this.r && (view = this.f1906i) != null) {
                u b5 = o.b(view);
                b5.g(f3);
                if (!gVar4.e) {
                    gVar4.a.add(b5);
                }
            }
            Interpolator interpolator2 = a;
            boolean z4 = gVar4.e;
            if (!z4) {
                gVar4.f1942c = interpolator2;
            }
            if (!z4) {
                gVar4.b = 250;
            }
            v vVar2 = this.z;
            if (!z4) {
                gVar4.f1943d = vVar2;
            }
            this.w = gVar4;
            gVar4.b();
        }
    }
}
