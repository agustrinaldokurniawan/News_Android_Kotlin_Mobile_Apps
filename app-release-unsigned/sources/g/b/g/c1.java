package g.b.g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.tsuga.news.R;
import g.h.j.o;
import g.h.j.t;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

public class c1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static c1 e;

    /* renamed from: f  reason: collision with root package name */
    public static c1 f2071f;

    /* renamed from: g  reason: collision with root package name */
    public final View f2072g;

    /* renamed from: h  reason: collision with root package name */
    public final CharSequence f2073h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2074i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f2075j = new a();

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f2076k = new b();

    /* renamed from: l  reason: collision with root package name */
    public int f2077l;

    /* renamed from: m  reason: collision with root package name */
    public int f2078m;
    public d1 n;
    public boolean o;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            c1.this.d(false);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            c1.this.b();
        }
    }

    public c1(View view, CharSequence charSequence) {
        this.f2072g = view;
        this.f2073h = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = t.a;
        this.f2074i = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void c(c1 c1Var) {
        c1 c1Var2 = e;
        if (c1Var2 != null) {
            c1Var2.f2072g.removeCallbacks(c1Var2.f2075j);
        }
        e = c1Var;
        if (c1Var != null) {
            c1Var.f2072g.postDelayed(c1Var.f2075j, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        this.f2077l = Integer.MAX_VALUE;
        this.f2078m = Integer.MAX_VALUE;
    }

    public void b() {
        if (f2071f == this) {
            f2071f = null;
            d1 d1Var = this.n;
            if (d1Var != null) {
                d1Var.a();
                this.n = null;
                a();
                this.f2072g.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (e == this) {
            c(null);
        }
        this.f2072g.removeCallbacks(this.f2076k);
    }

    public void d(boolean z) {
        int i2;
        int i3;
        long j2;
        View view = this.f2072g;
        AtomicInteger atomicInteger = o.a;
        if (view.isAttachedToWindow()) {
            c(null);
            c1 c1Var = f2071f;
            if (c1Var != null) {
                c1Var.b();
            }
            f2071f = this;
            this.o = z;
            d1 d1Var = new d1(this.f2072g.getContext());
            this.n = d1Var;
            View view2 = this.f2072g;
            int i4 = this.f2077l;
            int i5 = this.f2078m;
            boolean z2 = this.o;
            CharSequence charSequence = this.f2073h;
            if (d1Var.b.getParent() != null) {
                d1Var.a();
            }
            d1Var.f2082c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = d1Var.f2083d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = d1Var.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                i4 = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = d1Var.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                i2 = i5 + dimensionPixelOffset2;
                i3 = i5 - dimensionPixelOffset2;
            } else {
                i2 = view2.getHeight();
                i3 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = d1Var.a.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(d1Var.e);
                Rect rect = d1Var.e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = d1Var.a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    d1Var.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(d1Var.f2085g);
                view2.getLocationOnScreen(d1Var.f2084f);
                int[] iArr = d1Var.f2084f;
                int i6 = iArr[0];
                int[] iArr2 = d1Var.f2085g;
                iArr[0] = i6 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                d1Var.b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = d1Var.b.getMeasuredHeight();
                int[] iArr3 = d1Var.f2084f;
                int i7 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
                int i8 = iArr3[1] + i2 + dimensionPixelOffset3;
                if (!z2 ? measuredHeight + i8 > d1Var.e.height() : i7 >= 0) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i8;
                }
            }
            ((WindowManager) d1Var.a.getSystemService("window")).addView(d1Var.b, d1Var.f2083d);
            this.f2072g.addOnAttachStateChangeListener(this);
            if (this.o) {
                j2 = 2500;
            } else {
                j2 = ((this.f2072g.getWindowSystemUiVisibility() & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f2072g.removeCallbacks(this.f2076k);
            this.f2072g.postDelayed(this.f2076k, j2);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.n != null && this.o) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2072g.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                a();
                b();
            }
        } else if (this.f2072g.isEnabled() && this.n == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f2077l) > this.f2074i || Math.abs(y - this.f2078m) > this.f2074i) {
                this.f2077l = x;
                this.f2078m = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c(this);
            }
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f2077l = view.getWidth() / 2;
        this.f2078m = view.getHeight() / 2;
        d(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
