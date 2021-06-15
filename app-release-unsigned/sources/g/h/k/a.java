package g.h.k;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import g.h.j.o;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a implements View.OnTouchListener {
    public static final int e = ViewConfiguration.getTapTimeout();

    /* renamed from: f  reason: collision with root package name */
    public final C0080a f2566f;

    /* renamed from: g  reason: collision with root package name */
    public final Interpolator f2567g = new AccelerateInterpolator();

    /* renamed from: h  reason: collision with root package name */
    public final View f2568h;

    /* renamed from: i  reason: collision with root package name */
    public Runnable f2569i;

    /* renamed from: j  reason: collision with root package name */
    public float[] f2570j = {0.0f, 0.0f};

    /* renamed from: k  reason: collision with root package name */
    public float[] f2571k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l  reason: collision with root package name */
    public int f2572l;

    /* renamed from: m  reason: collision with root package name */
    public int f2573m;
    public float[] n = {0.0f, 0.0f};
    public float[] o = {0.0f, 0.0f};
    public float[] p = {Float.MAX_VALUE, Float.MAX_VALUE};
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;

    /* renamed from: g.h.k.a$a  reason: collision with other inner class name */
    public static class C0080a {
        public int a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public float f2574c;

        /* renamed from: d  reason: collision with root package name */
        public float f2575d;
        public long e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public long f2576f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f2577g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f2578h = 0;

        /* renamed from: i  reason: collision with root package name */
        public long f2579i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f2580j;

        /* renamed from: k  reason: collision with root package name */
        public int f2581k;

        public final float a(long j2) {
            long j3 = this.e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.f2579i;
            if (j4 < 0 || j2 < j4) {
                return a.b(((float) (j2 - j3)) / ((float) this.a), 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f2580j;
            return (a.b(((float) (j2 - j4)) / ((float) this.f2581k), 0.0f, 1.0f) * f2) + (1.0f - f2);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.t) {
                if (aVar.r) {
                    aVar.r = false;
                    C0080a aVar2 = aVar.f2566f;
                    Objects.requireNonNull(aVar2);
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar2.e = currentAnimationTimeMillis;
                    aVar2.f2579i = -1;
                    aVar2.f2576f = currentAnimationTimeMillis;
                    aVar2.f2580j = 0.5f;
                    aVar2.f2577g = 0;
                    aVar2.f2578h = 0;
                }
                C0080a aVar3 = a.this.f2566f;
                if ((aVar3.f2579i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar3.f2579i + ((long) aVar3.f2581k)) || !a.this.e()) {
                    a.this.t = false;
                    return;
                }
                a aVar4 = a.this;
                if (aVar4.s) {
                    aVar4.s = false;
                    Objects.requireNonNull(aVar4);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar4.f2568h.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar3.f2576f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = aVar3.a(currentAnimationTimeMillis2);
                    aVar3.f2576f = currentAnimationTimeMillis2;
                    float f2 = ((float) (currentAnimationTimeMillis2 - aVar3.f2576f)) * ((a * 4.0f) + (-4.0f * a * a));
                    aVar3.f2577g = (int) (aVar3.f2574c * f2);
                    int i2 = (int) (f2 * aVar3.f2575d);
                    aVar3.f2578h = i2;
                    ((c) a.this).v.scrollListBy(i2);
                    View view = a.this.f2568h;
                    AtomicInteger atomicInteger = o.a;
                    view.postOnAnimation(this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public a(View view) {
        C0080a aVar = new C0080a();
        this.f2566f = aVar;
        this.f2568h = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.p;
        float f3 = ((float) ((int) ((1575.0f * f2) + 0.5f))) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.o;
        float f4 = ((float) ((int) ((f2 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        this.f2572l = 1;
        float[] fArr3 = this.f2571k;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f2570j;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.n;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f2573m = e;
        aVar.a = 500;
        aVar.b = 500;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f2570j
            r0 = r0[r4]
            float[] r1 = r3.f2571k
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0025
            android.view.animation.Interpolator r6 = r3.f2567g
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x002f
        L_0x0025:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0038
            android.view.animation.Interpolator r6 = r3.f2567g
            float r5 = r6.getInterpolation(r5)
        L_0x002f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L_0x0039
        L_0x0038:
            r5 = r2
        L_0x0039:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003e
            return r2
        L_0x003e:
            float[] r0 = r3.n
            r0 = r0[r4]
            float[] r1 = r3.o
            r1 = r1[r4]
            float[] r2 = r3.p
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x0053
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L_0x0053:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.k.a.a(int, float, float, float):float");
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f2572l;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                return f2 >= 0.0f ? 1.0f - (f2 / f3) : (!this.t || i2 != 1) ? 0.0f : 1.0f;
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
    }

    public final void d() {
        int i2 = 0;
        if (this.r) {
            this.t = false;
            return;
        }
        C0080a aVar = this.f2566f;
        Objects.requireNonNull(aVar);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - aVar.e);
        int i4 = aVar.b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.f2581k = i2;
        aVar.f2580j = aVar.a(currentAnimationTimeMillis);
        aVar.f2579i = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e() {
        /*
            r9 = this;
            g.h.k.a$a r0 = r9.f2566f
            float r1 = r0.f2575d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f2574c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            r4 = r9
            g.h.k.c r4 = (g.h.k.c) r4
            android.widget.ListView r4 = r4.v
            int r5 = r4.getCount()
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r1 = r3
            goto L_0x0051
        L_0x0023:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r5) goto L_0x0050
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = r2
        L_0x0051:
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r2 = r3
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.k.a.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.k.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
