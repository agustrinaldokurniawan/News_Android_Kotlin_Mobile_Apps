package g.b.f.i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tsuga.news.R;
import g.b.f.i.m;
import g.b.g.h0;
import g.b.g.o0;
import java.util.Objects;

public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {

    /* renamed from: f  reason: collision with root package name */
    public final Context f2022f;

    /* renamed from: g  reason: collision with root package name */
    public final g f2023g;

    /* renamed from: h  reason: collision with root package name */
    public final f f2024h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2025i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2026j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2027k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2028l;

    /* renamed from: m  reason: collision with root package name */
    public final o0 f2029m;
    public final ViewTreeObserver.OnGlobalLayoutListener n = new a();
    public final View.OnAttachStateChangeListener o = new b();
    public PopupWindow.OnDismissListener p;
    public View q;
    public View r;
    public m.a s;
    public ViewTreeObserver t;
    public boolean u;
    public boolean v;
    public int w;
    public int x = 0;
    public boolean y;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (q.this.b()) {
                q qVar = q.this;
                if (!qVar.f2029m.E) {
                    View view = qVar.r;
                    if (view == null || !view.isShown()) {
                        q.this.dismiss();
                    } else {
                        q.this.f2029m.f();
                    }
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
            ViewTreeObserver viewTreeObserver = q.this.t;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.t = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.t.removeGlobalOnLayoutListener(qVar.n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z) {
        this.f2022f = context;
        this.f2023g = gVar;
        this.f2025i = z;
        this.f2024h = new f(gVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f2027k = i2;
        this.f2028l = i3;
        Resources resources = context.getResources();
        this.f2026j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.q = view;
        this.f2029m = new o0(context, null, i2, i3);
        gVar.b(this, context);
    }

    @Override // g.b.f.i.m
    public void a(g gVar, boolean z) {
        if (gVar == this.f2023g) {
            dismiss();
            m.a aVar = this.s;
            if (aVar != null) {
                aVar.a(gVar, z);
            }
        }
    }

    @Override // g.b.f.i.p
    public boolean b() {
        return !this.u && this.f2029m.b();
    }

    @Override // g.b.f.i.m
    public boolean c() {
        return false;
    }

    @Override // g.b.f.i.p
    public void dismiss() {
        if (b()) {
            this.f2029m.dismiss();
        }
    }

    @Override // g.b.f.i.p
    public void f() {
        View view;
        boolean z = true;
        if (!b()) {
            if (this.u || (view = this.q) == null) {
                z = false;
            } else {
                this.r = view;
                this.f2029m.F.setOnDismissListener(this);
                o0 o0Var = this.f2029m;
                o0Var.w = this;
                o0Var.s(true);
                View view2 = this.r;
                boolean z2 = this.t == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.t = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.n);
                }
                view2.addOnAttachStateChangeListener(this.o);
                o0 o0Var2 = this.f2029m;
                o0Var2.v = view2;
                o0Var2.r = this.x;
                if (!this.v) {
                    this.w = k.m(this.f2024h, null, this.f2022f, this.f2026j);
                    this.v = true;
                }
                this.f2029m.r(this.w);
                this.f2029m.F.setInputMethodMode(2);
                o0 o0Var3 = this.f2029m;
                Rect rect = this.e;
                Objects.requireNonNull(o0Var3);
                o0Var3.D = rect != null ? new Rect(rect) : null;
                this.f2029m.f();
                h0 h0Var = this.f2029m.f2132i;
                h0Var.setOnKeyListener(this);
                if (this.y && this.f2023g.n != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f2022f).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) h0Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f2023g.n);
                    }
                    frameLayout.setEnabled(false);
                    h0Var.addHeaderView(frameLayout, null, false);
                }
                this.f2029m.o(this.f2024h);
                this.f2029m.f();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // g.b.f.i.m
    public void h(m.a aVar) {
        this.s = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    @Override // g.b.f.i.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i(g.b.f.i.r r10) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.f.i.q.i(g.b.f.i.r):boolean");
    }

    @Override // g.b.f.i.m
    public void j(boolean z) {
        this.v = false;
        f fVar = this.f2024h;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // g.b.f.i.p
    public ListView k() {
        return this.f2029m.f2132i;
    }

    @Override // g.b.f.i.k
    public void l(g gVar) {
    }

    @Override // g.b.f.i.k
    public void n(View view) {
        this.q = view;
    }

    @Override // g.b.f.i.k
    public void o(boolean z) {
        this.f2024h.f1983g = z;
    }

    public void onDismiss() {
        this.u = true;
        this.f2023g.c(true);
        ViewTreeObserver viewTreeObserver = this.t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.t = this.r.getViewTreeObserver();
            }
            this.t.removeGlobalOnLayoutListener(this.n);
            this.t = null;
        }
        this.r.removeOnAttachStateChangeListener(this.o);
        PopupWindow.OnDismissListener onDismissListener = this.p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.x = i2;
    }

    @Override // g.b.f.i.k
    public void q(int i2) {
        this.f2029m.f2135l = i2;
    }

    @Override // g.b.f.i.k
    public void r(PopupWindow.OnDismissListener onDismissListener) {
        this.p = onDismissListener;
    }

    @Override // g.b.f.i.k
    public void s(boolean z) {
        this.y = z;
    }

    @Override // g.b.f.i.k
    public void t(int i2) {
        o0 o0Var = this.f2029m;
        o0Var.f2136m = i2;
        o0Var.o = true;
    }
}
