package g.b.f.i;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.tsuga.news.R;
import g.b.f.i.m;
import g.b.g.n0;
import g.b.g.o0;
import g.h.j.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;
    public m.a B;
    public ViewTreeObserver C;
    public PopupWindow.OnDismissListener D;
    public boolean E;

    /* renamed from: f  reason: collision with root package name */
    public final Context f1964f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1965g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1966h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1967i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f1968j;

    /* renamed from: k  reason: collision with root package name */
    public final Handler f1969k;

    /* renamed from: l  reason: collision with root package name */
    public final List<g> f1970l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public final List<C0065d> f1971m = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener n = new a();
    public final View.OnAttachStateChangeListener o = new b();
    public final n0 p = new c();
    public int q;
    public int r;
    public View s;
    public View t;
    public int u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public boolean z;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (d.this.b() && d.this.f1971m.size() > 0 && !d.this.f1971m.get(0).a.E) {
                View view = d.this.t;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0065d dVar : d.this.f1971m) {
                    dVar.a.f();
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.C = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.C.removeGlobalOnLayoutListener(dVar.n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements n0 {

        public class a implements Runnable {
            public final /* synthetic */ C0065d e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ MenuItem f1972f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ g f1973g;

            public a(C0065d dVar, MenuItem menuItem, g gVar) {
                this.e = dVar;
                this.f1972f = menuItem;
                this.f1973g = gVar;
            }

            public void run() {
                C0065d dVar = this.e;
                if (dVar != null) {
                    d.this.E = true;
                    dVar.b.c(false);
                    d.this.E = false;
                }
                if (this.f1972f.isEnabled() && this.f1972f.hasSubMenu()) {
                    this.f1973g.r(this.f1972f, 4);
                }
            }
        }

        public c() {
        }

        @Override // g.b.g.n0
        public void e(g gVar, MenuItem menuItem) {
            C0065d dVar = null;
            d.this.f1969k.removeCallbacksAndMessages(null);
            int size = d.this.f1971m.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (gVar == d.this.f1971m.get(i2).b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                int i3 = i2 + 1;
                if (i3 < d.this.f1971m.size()) {
                    dVar = d.this.f1971m.get(i3);
                }
                d.this.f1969k.postAtTime(new a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        @Override // g.b.g.n0
        public void h(g gVar, MenuItem menuItem) {
            d.this.f1969k.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: g.b.f.i.d$d  reason: collision with other inner class name */
    public static class C0065d {
        public final o0 a;
        public final g b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1975c;

        public C0065d(o0 o0Var, g gVar, int i2) {
            this.a = o0Var;
            this.b = gVar;
            this.f1975c = i2;
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z2) {
        int i4 = 0;
        this.q = 0;
        this.r = 0;
        this.f1964f = context;
        this.s = view;
        this.f1966h = i2;
        this.f1967i = i3;
        this.f1968j = z2;
        this.z = false;
        AtomicInteger atomicInteger = o.a;
        this.u = view.getLayoutDirection() != 1 ? 1 : i4;
        Resources resources = context.getResources();
        this.f1965g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1969k = new Handler();
    }

    @Override // g.b.f.i.m
    public void a(g gVar, boolean z2) {
        int i2;
        int size = this.f1971m.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (gVar == this.f1971m.get(i3).b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int i4 = i3 + 1;
            if (i4 < this.f1971m.size()) {
                this.f1971m.get(i4).b.c(false);
            }
            C0065d remove = this.f1971m.remove(i3);
            remove.b.u(this);
            if (this.E) {
                remove.a.F.setExitTransition(null);
                remove.a.F.setAnimationStyle(0);
            }
            remove.a.dismiss();
            int size2 = this.f1971m.size();
            if (size2 > 0) {
                i2 = this.f1971m.get(size2 - 1).f1975c;
            } else {
                View view = this.s;
                AtomicInteger atomicInteger = o.a;
                i2 = view.getLayoutDirection() == 1 ? 0 : 1;
            }
            this.u = i2;
            if (size2 == 0) {
                dismiss();
                m.a aVar = this.B;
                if (aVar != null) {
                    aVar.a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.C;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.C.removeGlobalOnLayoutListener(this.n);
                    }
                    this.C = null;
                }
                this.t.removeOnAttachStateChangeListener(this.o);
                this.D.onDismiss();
            } else if (z2) {
                this.f1971m.get(0).b.c(false);
            }
        }
    }

    @Override // g.b.f.i.p
    public boolean b() {
        return this.f1971m.size() > 0 && this.f1971m.get(0).a.b();
    }

    @Override // g.b.f.i.m
    public boolean c() {
        return false;
    }

    @Override // g.b.f.i.p
    public void dismiss() {
        int size = this.f1971m.size();
        if (size > 0) {
            C0065d[] dVarArr = (C0065d[]) this.f1971m.toArray(new C0065d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0065d dVar = dVarArr[i2];
                if (dVar.a.b()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // g.b.f.i.p
    public void f() {
        if (!b()) {
            for (g gVar : this.f1970l) {
                v(gVar);
            }
            this.f1970l.clear();
            View view = this.s;
            this.t = view;
            if (view != null) {
                boolean z2 = this.C == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.C = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.n);
                }
                this.t.addOnAttachStateChangeListener(this.o);
            }
        }
    }

    @Override // g.b.f.i.m
    public void h(m.a aVar) {
        this.B = aVar;
    }

    @Override // g.b.f.i.m
    public boolean i(r rVar) {
        for (C0065d dVar : this.f1971m) {
            if (rVar == dVar.b) {
                dVar.a.f2132i.requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        rVar.b(this, this.f1964f);
        if (b()) {
            v(rVar);
        } else {
            this.f1970l.add(rVar);
        }
        m.a aVar = this.B;
        if (aVar != null) {
            aVar.b(rVar);
        }
        return true;
    }

    @Override // g.b.f.i.m
    public void j(boolean z2) {
        for (C0065d dVar : this.f1971m) {
            ListAdapter adapter = dVar.a.f2132i.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f) adapter).notifyDataSetChanged();
        }
    }

    @Override // g.b.f.i.p
    public ListView k() {
        if (this.f1971m.isEmpty()) {
            return null;
        }
        List<C0065d> list = this.f1971m;
        return list.get(list.size() - 1).a.f2132i;
    }

    @Override // g.b.f.i.k
    public void l(g gVar) {
        gVar.b(this, this.f1964f);
        if (b()) {
            v(gVar);
        } else {
            this.f1970l.add(gVar);
        }
    }

    @Override // g.b.f.i.k
    public void n(View view) {
        if (this.s != view) {
            this.s = view;
            int i2 = this.q;
            AtomicInteger atomicInteger = o.a;
            this.r = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // g.b.f.i.k
    public void o(boolean z2) {
        this.z = z2;
    }

    public void onDismiss() {
        C0065d dVar;
        int size = this.f1971m.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1971m.get(i2);
            if (!dVar.a.b()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.b.c(false);
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // g.b.f.i.k
    public void p(int i2) {
        if (this.q != i2) {
            this.q = i2;
            View view = this.s;
            AtomicInteger atomicInteger = o.a;
            this.r = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // g.b.f.i.k
    public void q(int i2) {
        this.v = true;
        this.x = i2;
    }

    @Override // g.b.f.i.k
    public void r(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    @Override // g.b.f.i.k
    public void s(boolean z2) {
        this.A = z2;
    }

    @Override // g.b.f.i.k
    public void t(int i2) {
        this.w = true;
        this.y = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0142, code lost:
        if (((r9.getWidth() + r11[0]) + r4) > r10.right) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0148, code lost:
        if ((r11[0] - r4) < 0) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014c, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(g.b.f.i.g r17) {
        /*
        // Method dump skipped, instructions count: 527
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.f.i.d.v(g.b.f.i.g):void");
    }
}
