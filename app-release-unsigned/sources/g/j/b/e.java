package g.j.b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import g.h.j.o;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class e {
    public static final Interpolator a = new a();
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f2605c;

    /* renamed from: d  reason: collision with root package name */
    public int f2606d = -1;
    public float[] e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f2607f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f2608g;

    /* renamed from: h  reason: collision with root package name */
    public float[] f2609h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f2610i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f2611j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f2612k;

    /* renamed from: l  reason: collision with root package name */
    public int f2613l;

    /* renamed from: m  reason: collision with root package name */
    public VelocityTracker f2614m;
    public float n;
    public float o;
    public int p;
    public final int q;
    public OverScroller r;
    public final c s;
    public View t;
    public boolean u;
    public final ViewGroup v;
    public final Runnable w = new b();

    public class a implements Interpolator {
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            e.this.s(0);
        }
    }

    public static abstract class c {
        public abstract int a(View view, int i2, int i3);

        public abstract int b(View view, int i2, int i3);

        public int c(View view) {
            return 0;
        }

        public int d(View view) {
            return 0;
        }

        public void e(View view, int i2) {
        }

        public abstract void f(int i2);

        public abstract void g(View view, int i2, int i3, int i4, int i5);

        public abstract void h(View view, float f2, float f3);

        public abstract boolean i(View view, int i2);
    }

    public e(Context context, ViewGroup viewGroup, c cVar) {
        if (cVar != null) {
            this.v = viewGroup;
            this.s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.q = i2;
            this.p = i2;
            this.f2605c = viewConfiguration.getScaledTouchSlop();
            this.n = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.o = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, a);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    public void a() {
        this.f2606d = -1;
        float[] fArr = this.e;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2607f, 0.0f);
            Arrays.fill(this.f2608g, 0.0f);
            Arrays.fill(this.f2609h, 0.0f);
            Arrays.fill(this.f2610i, 0);
            Arrays.fill(this.f2611j, 0);
            Arrays.fill(this.f2612k, 0);
            this.f2613l = 0;
        }
        VelocityTracker velocityTracker = this.f2614m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2614m = null;
        }
    }

    public void b(View view, int i2) {
        if (view.getParent() == this.v) {
            this.t = view;
            this.f2606d = i2;
            this.s.e(view, i2);
            s(1);
            return;
        }
        StringBuilder f2 = c.c.a.a.a.f("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        f2.append(this.v);
        f2.append(")");
        throw new IllegalArgumentException(f2.toString());
    }

    public final boolean c(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.f2610i[i2] & i3) != i3 || (0 & i3) == 0 || (this.f2612k[i2] & i3) == i3 || (this.f2611j[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f2605c;
        if (abs <= ((float) i4) && abs2 <= ((float) i4)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            Objects.requireNonNull(this.s);
        }
        return (this.f2611j[i2] & i3) == 0 && abs > ((float) this.f2605c);
    }

    public final boolean d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.s.c(view) > 0;
        boolean z2 = this.s.d(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f2605c) : z2 && Math.abs(f3) > ((float) this.f2605c);
        }
        float f4 = f3 * f3;
        int i2 = this.f2605c;
        return f4 + (f2 * f2) > ((float) (i2 * i2));
    }

    public final float e(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    public final int f(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        return abs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    public final void g(int i2) {
        float[] fArr = this.e;
        if (fArr != null) {
            int i3 = this.f2613l;
            boolean z = true;
            int i4 = 1 << i2;
            if ((i4 & i3) == 0) {
                z = false;
            }
            if (z) {
                fArr[i2] = 0.0f;
                this.f2607f[i2] = 0.0f;
                this.f2608g[i2] = 0.0f;
                this.f2609h[i2] = 0.0f;
                this.f2610i[i2] = 0;
                this.f2611j[i2] = 0;
                this.f2612k[i2] = 0;
                this.f2613l = (~i4) & i3;
            }
        }
    }

    public final int h(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.v.getWidth();
        float f2 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width)) - 0.5f) * 0.47123894f))) * f2) + f2;
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f), 600);
    }

    public boolean i(boolean z) {
        if (this.b == 2) {
            boolean computeScrollOffset = this.r.computeScrollOffset();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                View view = this.t;
                AtomicInteger atomicInteger = o.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.t;
                AtomicInteger atomicInteger2 = o.a;
                view2.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.s.g(this.t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                this.r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.v.post(this.w);
                } else {
                    s(0);
                }
            }
        }
        if (this.b == 2) {
            return true;
        }
        return false;
    }

    public final void j(float f2, float f3) {
        this.u = true;
        this.s.h(this.t, f2, f3);
        this.u = false;
        if (this.b == 1) {
            s(0);
        }
    }

    public View k(int i2, int i3) {
        for (int childCount = this.v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.v;
            Objects.requireNonNull(this.s);
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean l(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.r.abortAnimation();
            s(0);
            return false;
        }
        View view = this.t;
        int f6 = f(i4, (int) this.o, (int) this.n);
        int f7 = f(i5, (int) this.o, (int) this.n);
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(f6);
        int abs4 = Math.abs(f7);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (f6 != 0) {
            f2 = (float) abs3;
            f3 = (float) i8;
        } else {
            f2 = (float) abs;
            f3 = (float) i9;
        }
        float f8 = f2 / f3;
        if (f7 != 0) {
            f5 = (float) abs4;
            f4 = (float) i8;
        } else {
            f5 = (float) abs2;
            f4 = (float) i9;
        }
        int h2 = h(i6, f6, this.s.c(view));
        float h3 = ((float) h(i7, f7, this.s.d(view))) * (f5 / f4);
        this.r.startScroll(left, top, i6, i7, (int) (h3 + (((float) h2) * f8)));
        s(2);
        return true;
    }

    public final boolean m(int i2) {
        if ((this.f2613l & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public void n(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2614m == null) {
            this.f2614m = VelocityTracker.obtain();
        }
        this.f2614m.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.b != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i3 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i3);
                            if (m(pointerId)) {
                                float x = motionEvent.getX(i3);
                                float y = motionEvent.getY(i3);
                                float f2 = x - this.e[pointerId];
                                float f3 = y - this.f2607f[pointerId];
                                p(f2, f3, pointerId);
                                if (this.b != 1) {
                                    View k2 = k((int) x, (int) y);
                                    if (d(k2, f2, f3) && v(k2, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i3++;
                        }
                    } else if (m(this.f2606d)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f2606d);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f2608g;
                        int i4 = this.f2606d;
                        int i5 = (int) (x2 - fArr[i4]);
                        int i6 = (int) (y2 - this.f2609h[i4]);
                        int left = this.t.getLeft() + i5;
                        int top = this.t.getTop() + i6;
                        int left2 = this.t.getLeft();
                        int top2 = this.t.getTop();
                        if (i5 != 0) {
                            left = this.s.a(this.t, left, i5);
                            AtomicInteger atomicInteger = o.a;
                            this.t.offsetLeftAndRight(left - left2);
                        }
                        if (i6 != 0) {
                            top = this.s.b(this.t, top, i6);
                            AtomicInteger atomicInteger2 = o.a;
                            this.t.offsetTopAndBottom(top - top2);
                        }
                        if (!(i5 == 0 && i6 == 0)) {
                            this.s.g(this.t, left, top, left - left2, top - top2);
                        }
                    } else {
                        return;
                    }
                    r(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        q(x3, y3, pointerId2);
                        if (this.b == 0) {
                            v(k((int) x3, (int) y3), pointerId2);
                            if ((this.f2610i[pointerId2] & 0) == 0) {
                                return;
                            }
                        } else {
                            int i7 = (int) x3;
                            int i8 = (int) y3;
                            View view = this.t;
                            if (view != null && i7 >= view.getLeft() && i7 < view.getRight() && i8 >= view.getTop() && i8 < view.getBottom()) {
                                i3 = 1;
                            }
                            if (i3 != 0) {
                                v(this.t, pointerId2);
                                return;
                            }
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.b == 1 && pointerId3 == this.f2606d) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i3 >= pointerCount2) {
                                    i2 = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i3);
                                if (pointerId4 != this.f2606d) {
                                    View k3 = k((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                                    View view2 = this.t;
                                    if (k3 == view2 && v(view2, pointerId4)) {
                                        i2 = this.f2606d;
                                        break;
                                    }
                                }
                                i3++;
                            }
                            if (i2 == -1) {
                                o();
                            }
                        }
                        g(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.b == 1) {
                    j(0.0f, 0.0f);
                }
            } else if (this.b == 1) {
                o();
            }
            a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View k4 = k((int) x4, (int) y4);
        q(x4, y4, pointerId5);
        v(k4, pointerId5);
        if ((this.f2610i[pointerId5] & 0) == 0) {
            return;
        }
        Objects.requireNonNull(this.s);
    }

    public final void o() {
        this.f2614m.computeCurrentVelocity(1000, this.n);
        j(e(this.f2614m.getXVelocity(this.f2606d), this.o, this.n), e(this.f2614m.getYVelocity(this.f2606d), this.o, this.n));
    }

    public final void p(float f2, float f3, int i2) {
        int i3 = 1;
        if (!c(f2, f3, i2, 1)) {
            i3 = 0;
        }
        if (c(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (c(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (c(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.f2611j;
            iArr[i2] = iArr[i2] | i3;
            Objects.requireNonNull(this.s);
        }
    }

    public final void q(float f2, float f3, int i2) {
        float[] fArr = this.e;
        int i3 = 0;
        if (fArr == null || fArr.length <= i2) {
            int i4 = i2 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2607f;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2608g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2609h;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2610i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2611j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2612k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.e = fArr2;
            this.f2607f = fArr3;
            this.f2608g = fArr4;
            this.f2609h = fArr5;
            this.f2610i = iArr;
            this.f2611j = iArr2;
            this.f2612k = iArr3;
        }
        float[] fArr9 = this.e;
        this.f2608g[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.f2607f;
        this.f2609h[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.f2610i;
        int i5 = (int) f2;
        int i6 = (int) f3;
        if (i5 < this.v.getLeft() + this.p) {
            i3 = 1;
        }
        if (i6 < this.v.getTop() + this.p) {
            i3 |= 4;
        }
        if (i5 > this.v.getRight() - this.p) {
            i3 |= 2;
        }
        if (i6 > this.v.getBottom() - this.p) {
            i3 |= 8;
        }
        iArr7[i2] = i3;
        this.f2613l |= 1 << i2;
    }

    public final void r(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (m(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f2608g[pointerId] = x;
                this.f2609h[pointerId] = y;
            }
        }
    }

    public void s(int i2) {
        this.v.removeCallbacks(this.w);
        if (this.b != i2) {
            this.b = i2;
            this.s.f(i2);
            if (this.b == 0) {
                this.t = null;
            }
        }
    }

    public boolean t(int i2, int i3) {
        if (this.u) {
            return l(i2, i3, (int) this.f2614m.getXVelocity(this.f2606d), (int) this.f2614m.getYVelocity(this.f2606d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean u(android.view.MotionEvent r17) {
        /*
        // Method dump skipped, instructions count: 313
        */
        throw new UnsupportedOperationException("Method not decompiled: g.j.b.e.u(android.view.MotionEvent):boolean");
    }

    public boolean v(View view, int i2) {
        if (view == this.t && this.f2606d == i2) {
            return true;
        }
        if (view == null || !this.s.i(view, i2)) {
            return false;
        }
        this.f2606d = i2;
        b(view, i2);
        return true;
    }
}
