package g.b.g;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import g.b.f.i.p;
import g.h.j.o;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

public class m0 implements p {
    public static Method e;

    /* renamed from: f  reason: collision with root package name */
    public static Method f2129f;
    public final a A = new a();
    public final Handler B;
    public final Rect C = new Rect();
    public Rect D;
    public boolean E;
    public PopupWindow F;

    /* renamed from: g  reason: collision with root package name */
    public Context f2130g;

    /* renamed from: h  reason: collision with root package name */
    public ListAdapter f2131h;

    /* renamed from: i  reason: collision with root package name */
    public h0 f2132i;

    /* renamed from: j  reason: collision with root package name */
    public int f2133j = -2;

    /* renamed from: k  reason: collision with root package name */
    public int f2134k = -2;

    /* renamed from: l  reason: collision with root package name */
    public int f2135l;

    /* renamed from: m  reason: collision with root package name */
    public int f2136m;
    public int n = 1002;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r = 0;
    public int s = Integer.MAX_VALUE;
    public int t = 0;
    public DataSetObserver u;
    public View v;
    public AdapterView.OnItemClickListener w;
    public final e x = new e();
    public final d y = new d();
    public final c z = new c();

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            h0 h0Var = m0.this.f2132i;
            if (h0Var != null) {
                h0Var.setListSelectionHidden(true);
                h0Var.requestLayout();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            if (m0.this.b()) {
                m0.this.f();
            }
        }

        public void onInvalidated() {
            m0.this.dismiss();
        }
    }

    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i2) {
            boolean z = true;
            if (i2 == 1) {
                if (m0.this.F.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && m0.this.F.getContentView() != null) {
                    m0 m0Var = m0.this;
                    m0Var.B.removeCallbacks(m0Var.x);
                    m0.this.x.run();
                }
            }
        }
    }

    public class d implements View.OnTouchListener {
        public d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = m0.this.F) != null && popupWindow.isShowing() && x >= 0 && x < m0.this.F.getWidth() && y >= 0 && y < m0.this.F.getHeight()) {
                m0 m0Var = m0.this;
                m0Var.B.postDelayed(m0Var.x, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                m0 m0Var2 = m0.this;
                m0Var2.B.removeCallbacks(m0Var2.x);
                return false;
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public void run() {
            h0 h0Var = m0.this.f2132i;
            if (h0Var != null) {
                AtomicInteger atomicInteger = o.a;
                if (h0Var.isAttachedToWindow() && m0.this.f2132i.getCount() > m0.this.f2132i.getChildCount()) {
                    int childCount = m0.this.f2132i.getChildCount();
                    m0 m0Var = m0.this;
                    if (childCount <= m0Var.s) {
                        m0Var.F.setInputMethodMode(2);
                        m0.this.f();
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                e = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2129f = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public m0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f2130g = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.b.b.n, i2, i3);
        this.f2135l = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2136m = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.o = true;
        }
        obtainStyledAttributes.recycle();
        p pVar = new p(context, attributeSet, i2, i3);
        this.F = pVar;
        pVar.setInputMethodMode(1);
    }

    public void a(int i2) {
        this.f2135l = i2;
    }

    @Override // g.b.f.i.p
    public boolean b() {
        return this.F.isShowing();
    }

    public int c() {
        return this.f2135l;
    }

    @Override // g.b.f.i.p
    public void dismiss() {
        this.F.dismiss();
        this.F.setContentView(null);
        this.f2132i = null;
        this.B.removeCallbacks(this.x);
    }

    @Override // g.b.f.i.p
    public void f() {
        int i2;
        int i3;
        h0 h0Var;
        int i4;
        if (this.f2132i == null) {
            h0 q2 = q(this.f2130g, !this.E);
            this.f2132i = q2;
            q2.setAdapter(this.f2131h);
            this.f2132i.setOnItemClickListener(this.w);
            this.f2132i.setFocusable(true);
            this.f2132i.setFocusableInTouchMode(true);
            this.f2132i.setOnItemSelectedListener(new l0(this));
            this.f2132i.setOnScrollListener(this.z);
            this.F.setContentView(this.f2132i);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.F.getContentView();
        }
        Drawable background = this.F.getBackground();
        int i5 = 0;
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.o) {
                this.f2136m = -i6;
            }
        } else {
            this.C.setEmpty();
            i2 = 0;
        }
        int maxAvailableHeight = this.F.getMaxAvailableHeight(this.v, this.f2136m, this.F.getInputMethodMode() == 2);
        if (this.f2133j == -1) {
            i3 = maxAvailableHeight + i2;
        } else {
            int i7 = this.f2134k;
            if (i7 != -2) {
                i4 = 1073741824;
                if (i7 == -1) {
                    int i8 = this.f2130g.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.C;
                    i7 = i8 - (rect2.left + rect2.right);
                }
            } else {
                int i9 = this.f2130g.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.C;
                i7 = i9 - (rect3.left + rect3.right);
                i4 = Integer.MIN_VALUE;
            }
            int a2 = this.f2132i.a(View.MeasureSpec.makeMeasureSpec(i7, i4), maxAvailableHeight - 0, -1);
            i3 = a2 + (a2 > 0 ? this.f2132i.getPaddingBottom() + this.f2132i.getPaddingTop() + i2 + 0 : 0);
        }
        boolean z2 = this.F.getInputMethodMode() == 2;
        this.F.setWindowLayoutType(this.n);
        if (this.F.isShowing()) {
            View view = this.v;
            AtomicInteger atomicInteger = o.a;
            if (view.isAttachedToWindow()) {
                int i10 = this.f2134k;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = this.v.getWidth();
                }
                int i11 = this.f2133j;
                if (i11 == -1) {
                    if (!z2) {
                        i3 = -1;
                    }
                    if (z2) {
                        this.F.setWidth(this.f2134k == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        PopupWindow popupWindow = this.F;
                        if (this.f2134k == -1) {
                            i5 = -1;
                        }
                        popupWindow.setWidth(i5);
                        this.F.setHeight(-1);
                    }
                } else if (i11 != -2) {
                    i3 = i11;
                }
                this.F.setOutsideTouchable(true);
                this.F.update(this.v, this.f2135l, this.f2136m, i10 < 0 ? -1 : i10, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i12 = this.f2134k;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = this.v.getWidth();
        }
        int i13 = this.f2133j;
        if (i13 == -1) {
            i3 = -1;
        } else if (i13 != -2) {
            i3 = i13;
        }
        this.F.setWidth(i12);
        this.F.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = e;
            if (method != null) {
                try {
                    method.invoke(this.F, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.F.setIsClippedToScreen(true);
        }
        this.F.setOutsideTouchable(true);
        this.F.setTouchInterceptor(this.y);
        if (this.q) {
            this.F.setOverlapAnchor(this.p);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2129f;
            if (method2 != null) {
                try {
                    method2.invoke(this.F, this.D);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.F.setEpicenterBounds(this.D);
        }
        this.F.showAsDropDown(this.v, this.f2135l, this.f2136m, this.r);
        this.f2132i.setSelection(-1);
        if ((!this.E || this.f2132i.isInTouchMode()) && (h0Var = this.f2132i) != null) {
            h0Var.setListSelectionHidden(true);
            h0Var.requestLayout();
        }
        if (!this.E) {
            this.B.post(this.A);
        }
    }

    public int g() {
        if (!this.o) {
            return 0;
        }
        return this.f2136m;
    }

    public Drawable i() {
        return this.F.getBackground();
    }

    @Override // g.b.f.i.p
    public ListView k() {
        return this.f2132i;
    }

    public void m(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public void n(int i2) {
        this.f2136m = i2;
        this.o = true;
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.u;
        if (dataSetObserver == null) {
            this.u = new b();
        } else {
            ListAdapter listAdapter2 = this.f2131h;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2131h = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.u);
        }
        h0 h0Var = this.f2132i;
        if (h0Var != null) {
            h0Var.setAdapter(this.f2131h);
        }
    }

    public h0 q(Context context, boolean z2) {
        return new h0(context, z2);
    }

    public void r(int i2) {
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            this.f2134k = rect.left + rect.right + i2;
            return;
        }
        this.f2134k = i2;
    }

    public void s(boolean z2) {
        this.E = z2;
        this.F.setFocusable(z2);
    }
}
