package g.b.g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.tsuga.news.R;
import g.b.b;
import g.b.f.i.g;
import g.b.f.i.i;
import g.b.f.i.m;
import g.h.j.o;
import g.h.j.u;
import g.h.j.w;
import java.util.Objects;

public class b1 implements f0 {
    public Toolbar a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public View f2045c;

    /* renamed from: d  reason: collision with root package name */
    public View f2046d;
    public Drawable e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f2047f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f2048g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2049h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f2050i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f2051j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f2052k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f2053l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2054m;
    public c n;
    public int o = 0;
    public Drawable p;

    public class a extends w {
        public boolean a = false;
        public final /* synthetic */ int b;

        public a(int i2) {
            this.b = i2;
        }

        @Override // g.h.j.v
        public void a(View view) {
            if (!this.a) {
                b1.this.a.setVisibility(this.b);
            }
        }

        @Override // g.h.j.v, g.h.j.w
        public void b(View view) {
            b1.this.a.setVisibility(0);
        }

        @Override // g.h.j.v, g.h.j.w
        public void c(View view) {
            this.a = true;
        }
    }

    public b1(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.a = toolbar;
        this.f2050i = toolbar.getTitle();
        this.f2051j = toolbar.getSubtitle();
        this.f2049h = this.f2050i != null;
        this.f2048g = toolbar.getNavigationIcon();
        String str = null;
        z0 q = z0.q(toolbar.getContext(), null, b.a, R.attr.actionBarStyle, 0);
        int i2 = 15;
        this.p = q.g(15);
        if (z) {
            CharSequence n2 = q.n(27);
            if (!TextUtils.isEmpty(n2)) {
                this.f2049h = true;
                this.f2050i = n2;
                if ((this.b & 8) != 0) {
                    this.a.setTitle(n2);
                }
            }
            CharSequence n3 = q.n(25);
            if (!TextUtils.isEmpty(n3)) {
                this.f2051j = n3;
                if ((this.b & 8) != 0) {
                    this.a.setSubtitle(n3);
                }
            }
            Drawable g2 = q.g(20);
            if (g2 != null) {
                this.f2047f = g2;
                y();
            }
            Drawable g3 = q.g(17);
            if (g3 != null) {
                this.e = g3;
                y();
            }
            if (this.f2048g == null && (drawable = this.p) != null) {
                this.f2048g = drawable;
                x();
            }
            v(q.j(10, 0));
            int l2 = q.l(9, 0);
            if (l2 != 0) {
                View inflate = LayoutInflater.from(this.a.getContext()).inflate(l2, (ViewGroup) this.a, false);
                View view = this.f2046d;
                if (!(view == null || (this.b & 16) == 0)) {
                    this.a.removeView(view);
                }
                this.f2046d = inflate;
                if (!(inflate == null || (this.b & 16) == 0)) {
                    this.a.addView(inflate);
                }
                v(this.b | 16);
            }
            int k2 = q.k(13, 0);
            if (k2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = k2;
                this.a.setLayoutParams(layoutParams);
            }
            int e2 = q.e(7, -1);
            int e3 = q.e(3, -1);
            if (e2 >= 0 || e3 >= 0) {
                Toolbar toolbar2 = this.a;
                int max = Math.max(e2, 0);
                int max2 = Math.max(e3, 0);
                toolbar2.d();
                toolbar2.x.a(max, max2);
            }
            int l3 = q.l(28, 0);
            if (l3 != 0) {
                Toolbar toolbar3 = this.a;
                Context context = toolbar3.getContext();
                toolbar3.p = l3;
                TextView textView = toolbar3.f106f;
                if (textView != null) {
                    textView.setTextAppearance(context, l3);
                }
            }
            int l4 = q.l(26, 0);
            if (l4 != 0) {
                Toolbar toolbar4 = this.a;
                Context context2 = toolbar4.getContext();
                toolbar4.q = l4;
                TextView textView2 = toolbar4.f107g;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, l4);
                }
            }
            int l5 = q.l(22, 0);
            if (l5 != 0) {
                this.a.setPopupTheme(l5);
            }
        } else {
            if (this.a.getNavigationIcon() != null) {
                this.p = this.a.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.b = i2;
        }
        q.b.recycle();
        if (R.string.abc_action_bar_up_description != this.o) {
            this.o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                int i3 = this.o;
                this.f2052k = i3 != 0 ? d().getString(i3) : str;
                w();
            }
        }
        this.f2052k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a1(this));
    }

    @Override // g.b.g.f0
    public void a(Menu menu, m.a aVar) {
        i iVar;
        if (this.n == null) {
            c cVar = new c(this.a.getContext());
            this.n = cVar;
            Objects.requireNonNull(cVar);
        }
        c cVar2 = this.n;
        cVar2.f1959i = aVar;
        Toolbar toolbar = this.a;
        g gVar = (g) menu;
        if (gVar != null || toolbar.e != null) {
            toolbar.f();
            g gVar2 = toolbar.e.t;
            if (gVar2 != gVar) {
                if (gVar2 != null) {
                    gVar2.u(toolbar.N);
                    gVar2.u(toolbar.O);
                }
                if (toolbar.O == null) {
                    toolbar.O = new Toolbar.d();
                }
                cVar2.u = true;
                if (gVar != null) {
                    gVar.b(cVar2, toolbar.n);
                    gVar.b(toolbar.O, toolbar.n);
                } else {
                    cVar2.d(toolbar.n, null);
                    Toolbar.d dVar = toolbar.O;
                    g gVar3 = dVar.e;
                    if (!(gVar3 == null || (iVar = dVar.f114f) == null)) {
                        gVar3.d(iVar);
                    }
                    dVar.e = null;
                    cVar2.j(true);
                    toolbar.O.j(true);
                }
                toolbar.e.setPopupTheme(toolbar.o);
                toolbar.e.setPresenter(cVar2);
                toolbar.N = cVar2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // g.b.g.f0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.e
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            g.b.g.c r0 = r0.x
            if (r0 == 0) goto L_0x001e
            g.b.g.c$c r3 = r0.z
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = r2
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = r1
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.g.b1.b():boolean");
    }

    @Override // g.b.g.f0
    public boolean c() {
        return this.a.p();
    }

    @Override // g.b.g.f0
    public void collapseActionView() {
        Toolbar.d dVar = this.a.O;
        i iVar = dVar == null ? null : dVar.f114f;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    @Override // g.b.g.f0
    public Context d() {
        return this.a.getContext();
    }

    @Override // g.b.g.f0
    public boolean e() {
        ActionMenuView actionMenuView = this.a.e;
        if (actionMenuView != null) {
            c cVar = actionMenuView.x;
            if (cVar != null && cVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // g.b.g.f0
    public boolean f() {
        return this.a.v();
    }

    @Override // g.b.g.f0
    public void g() {
        this.f2054m = true;
    }

    @Override // g.b.g.f0
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // g.b.g.f0
    public boolean h() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.e) != null && actionMenuView.w;
    }

    @Override // g.b.g.f0
    public void i() {
        c cVar;
        ActionMenuView actionMenuView = this.a.e;
        if (actionMenuView != null && (cVar = actionMenuView.x) != null) {
            cVar.b();
        }
    }

    @Override // g.b.g.f0
    public int j() {
        return this.b;
    }

    @Override // g.b.g.f0
    public void k(int i2) {
        this.a.setVisibility(i2);
    }

    @Override // g.b.g.f0
    public void l(int i2) {
        this.f2047f = i2 != 0 ? g.b.d.a.a.a(d(), i2) : null;
        y();
    }

    @Override // g.b.g.f0
    public void m(s0 s0Var) {
        Toolbar toolbar;
        View view = this.f2045c;
        if (view != null && view.getParent() == (toolbar = this.a)) {
            toolbar.removeView(this.f2045c);
        }
        this.f2045c = null;
    }

    @Override // g.b.g.f0
    public ViewGroup n() {
        return this.a;
    }

    @Override // g.b.g.f0
    public void o(boolean z) {
    }

    @Override // g.b.g.f0
    public int p() {
        return 0;
    }

    @Override // g.b.g.f0
    public u q(int i2, long j2) {
        u b2 = o.b(this.a);
        b2.a(i2 == 0 ? 1.0f : 0.0f);
        b2.c(j2);
        a aVar = new a(i2);
        View view = b2.a.get();
        if (view != null) {
            b2.e(view, aVar);
        }
        return b2;
    }

    @Override // g.b.g.f0
    public void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // g.b.g.f0
    public boolean s() {
        Toolbar.d dVar = this.a.O;
        return (dVar == null || dVar.f114f == null) ? false : true;
    }

    @Override // g.b.g.f0
    public void setIcon(int i2) {
        this.e = i2 != 0 ? g.b.d.a.a.a(d(), i2) : null;
        y();
    }

    @Override // g.b.g.f0
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        y();
    }

    @Override // g.b.g.f0
    public void setWindowCallback(Window.Callback callback) {
        this.f2053l = callback;
    }

    @Override // g.b.g.f0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f2049h) {
            this.f2050i = charSequence;
            if ((this.b & 8) != 0) {
                this.a.setTitle(charSequence);
            }
        }
    }

    @Override // g.b.g.f0
    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // g.b.g.f0
    public void u(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // g.b.g.f0
    public void v(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    w();
                }
                x();
            }
            if ((i3 & 3) != 0) {
                y();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.f2050i);
                    toolbar = this.a;
                    charSequence = this.f2051j;
                } else {
                    charSequence = null;
                    this.a.setTitle((CharSequence) null);
                    toolbar = this.a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) != 0 && (view = this.f2046d) != null) {
                if ((i2 & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    public final void w() {
        if ((this.b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f2052k)) {
            this.a.setNavigationContentDescription(this.o);
        } else {
            this.a.setNavigationContentDescription(this.f2052k);
        }
    }

    public final void x() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.b & 4) != 0) {
            toolbar = this.a;
            drawable = this.f2048g;
            if (drawable == null) {
                drawable = this.p;
            }
        } else {
            toolbar = this.a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void y() {
        Drawable drawable;
        int i2 = this.b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f2047f) == null) {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }
}
