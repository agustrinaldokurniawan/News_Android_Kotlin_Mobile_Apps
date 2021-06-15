package c.b.a.f0;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import c.b.a.g;

public class d extends a implements Choreographer.FrameCallback {

    /* renamed from: g  reason: collision with root package name */
    public float f655g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f656h = false;

    /* renamed from: i  reason: collision with root package name */
    public long f657i = 0;

    /* renamed from: j  reason: collision with root package name */
    public float f658j = 0.0f;

    /* renamed from: k  reason: collision with root package name */
    public int f659k = 0;

    /* renamed from: l  reason: collision with root package name */
    public float f660l = -2.14748365E9f;

    /* renamed from: m  reason: collision with root package name */
    public float f661m = 2.14748365E9f;
    public g n;
    public boolean o = false;

    public void cancel() {
        for (Animator.AnimatorListener animatorListener : this.f654f) {
            animatorListener.onAnimationCancel(this);
        }
        l();
    }

    public void doFrame(long j2) {
        k();
        g gVar = this.n;
        if (gVar != null && this.o) {
            long j3 = this.f657i;
            long j4 = 0;
            if (j3 != 0) {
                j4 = j2 - j3;
            }
            float abs = ((float) j4) / ((1.0E9f / gVar.f674m) / Math.abs(this.f655g));
            float f2 = this.f658j;
            if (j()) {
                abs = -abs;
            }
            float f3 = f2 + abs;
            this.f658j = f3;
            float i2 = i();
            float h2 = h();
            PointF pointF = f.a;
            boolean z = !(f3 >= i2 && f3 <= h2);
            this.f658j = f.b(this.f658j, i(), h());
            this.f657i = j2;
            d();
            if (z) {
                if (getRepeatCount() == -1 || this.f659k < getRepeatCount()) {
                    for (Animator.AnimatorListener animatorListener : this.f654f) {
                        animatorListener.onAnimationRepeat(this);
                    }
                    this.f659k++;
                    if (getRepeatMode() == 2) {
                        this.f656h = !this.f656h;
                        this.f655g = -this.f655g;
                    } else {
                        this.f658j = j() ? h() : i();
                    }
                    this.f657i = j2;
                } else {
                    this.f658j = this.f655g < 0.0f ? i() : h();
                    l();
                    a(j());
                }
            }
            if (this.n != null) {
                float f4 = this.f658j;
                if (f4 < this.f660l || f4 > this.f661m) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f660l), Float.valueOf(this.f661m), Float.valueOf(this.f658j)));
                }
            }
            c.b.a.d.a("LottieValueAnimator#doFrame");
        }
    }

    public void f() {
        l();
        a(j());
    }

    public float g() {
        g gVar = this.n;
        if (gVar == null) {
            return 0.0f;
        }
        float f2 = this.f658j;
        float f3 = gVar.f672k;
        return (f2 - f3) / (gVar.f673l - f3);
    }

    public float getAnimatedFraction() {
        float f2;
        float i2;
        if (this.n == null) {
            return 0.0f;
        }
        if (j()) {
            f2 = h();
            i2 = this.f658j;
        } else {
            f2 = this.f658j;
            i2 = i();
        }
        return (f2 - i2) / (h() - i());
    }

    public Object getAnimatedValue() {
        return Float.valueOf(g());
    }

    public long getDuration() {
        g gVar = this.n;
        if (gVar == null) {
            return 0;
        }
        return (long) gVar.b();
    }

    public float h() {
        g gVar = this.n;
        if (gVar == null) {
            return 0.0f;
        }
        float f2 = this.f661m;
        return f2 == 2.14748365E9f ? gVar.f673l : f2;
    }

    public float i() {
        g gVar = this.n;
        if (gVar == null) {
            return 0.0f;
        }
        float f2 = this.f660l;
        return f2 == -2.14748365E9f ? gVar.f672k : f2;
    }

    public boolean isRunning() {
        return this.o;
    }

    public final boolean j() {
        return this.f655g < 0.0f;
    }

    public void k() {
        if (this.o) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void l() {
        Choreographer.getInstance().removeFrameCallback(this);
        this.o = false;
    }

    public void m(float f2) {
        if (this.f658j != f2) {
            this.f658j = f.b(f2, i(), h());
            this.f657i = 0;
            d();
        }
    }

    public void o(float f2, float f3) {
        float f4;
        if (f2 <= f3) {
            g gVar = this.n;
            float f5 = gVar == null ? -3.4028235E38f : gVar.f672k;
            if (gVar == null) {
                f4 = Float.MAX_VALUE;
            } else {
                f4 = gVar.f673l;
            }
            this.f660l = f.b(f2, f5, f4);
            this.f661m = f.b(f3, f5, f4);
            m((float) ((int) f.b(this.f658j, f2, f3)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f2), Float.valueOf(f3)));
    }

    public void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 != 2 && this.f656h) {
            this.f656h = false;
            this.f655g = -this.f655g;
        }
    }
}
