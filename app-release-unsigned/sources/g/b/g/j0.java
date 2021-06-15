package g.b.g;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import g.b.f.i.p;

public abstract class j0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2109f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2110g;

    /* renamed from: h  reason: collision with root package name */
    public final View f2111h;

    /* renamed from: i  reason: collision with root package name */
    public Runnable f2112i;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f2113j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2114k;

    /* renamed from: l  reason: collision with root package name */
    public int f2115l;

    /* renamed from: m  reason: collision with root package name */
    public final int[] f2116m = new int[2];

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ViewParent parent = j0.this.f2111h.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            j0 j0Var = j0.this;
            j0Var.a();
            View view = j0Var.f2111h;
            if (view.isEnabled() && !view.isLongClickable() && j0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                j0Var.f2114k = true;
            }
        }
    }

    public j0(View view) {
        this.f2111h = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.e = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2109f = tapTimeout;
        this.f2110g = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        Runnable runnable = this.f2113j;
        if (runnable != null) {
            this.f2111h.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f2112i;
        if (runnable2 != null) {
            this.f2111h.removeCallbacks(runnable2);
        }
    }

    public abstract p b();

    public abstract boolean c();

    public boolean d() {
        p b2 = b();
        if (b2 == null || !b2.b()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r4 != 3) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.g.j0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f2114k = false;
        this.f2115l = -1;
        Runnable runnable = this.f2112i;
        if (runnable != null) {
            this.f2111h.removeCallbacks(runnable);
        }
    }
}
