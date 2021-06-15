package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tsuga.news.R;
import g.h.j.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ClockHandView extends View {
    public static final /* synthetic */ int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public ValueAnimator f1718f;

    /* renamed from: g  reason: collision with root package name */
    public float f1719g;

    /* renamed from: h  reason: collision with root package name */
    public float f1720h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1721i;

    /* renamed from: j  reason: collision with root package name */
    public int f1722j;

    /* renamed from: k  reason: collision with root package name */
    public final List<c> f1723k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final int f1724l;

    /* renamed from: m  reason: collision with root package name */
    public final float f1725m;
    public final Paint n;
    public final RectF o;
    public final int p;
    public float q;
    public boolean r;
    public double s;
    public int t;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ClockHandView clockHandView = ClockHandView.this;
            int i2 = ClockHandView.e;
            clockHandView.c(floatValue, true);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b(ClockHandView clockHandView) {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
        void a(float f2, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        Paint paint = new Paint();
        this.n = paint;
        this.o = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.e.a.a.b.f1170f, R.attr.materialClockStyle, 2131821254);
        this.t = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f1724l = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.p = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f1725m = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f, false);
        this.f1722j = ViewConfiguration.get(context).getScaledTouchSlop();
        AtomicInteger atomicInteger = o.a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(float f2, float f3) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f3 - ((float) (getHeight() / 2))), (double) (f2 - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public void b(float f2, boolean z) {
        ValueAnimator valueAnimator = this.f1718f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            c(f2, false);
            return;
        }
        float f3 = this.q;
        if (Math.abs(f3 - f2) > 180.0f) {
            if (f3 > 180.0f && f2 < 180.0f) {
                f2 += 360.0f;
            }
            if (f3 < 180.0f && f2 > 180.0f) {
                f3 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f3), Float.valueOf(f2));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        this.f1718f = ofFloat;
        ofFloat.setDuration(200L);
        this.f1718f.addUpdateListener(new a());
        this.f1718f.addListener(new b(this));
        this.f1718f.start();
    }

    public final void c(float f2, boolean z) {
        float f3 = f2 % 360.0f;
        this.q = f3;
        this.s = Math.toRadians((double) (f3 - 90.0f));
        float cos = (((float) this.t) * ((float) Math.cos(this.s))) + ((float) (getWidth() / 2));
        float sin = (((float) this.t) * ((float) Math.sin(this.s))) + ((float) (getHeight() / 2));
        RectF rectF = this.o;
        int i2 = this.f1724l;
        rectF.set(cos - ((float) i2), sin - ((float) i2), cos + ((float) i2), sin + ((float) i2));
        for (c cVar : this.f1723k) {
            cVar.a(f3, z);
        }
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f2 = (float) width;
        float f3 = (float) height;
        this.n.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.t) * ((float) Math.cos(this.s))) + f2, (((float) this.t) * ((float) Math.sin(this.s))) + f3, (float) this.f1724l, this.n);
        double sin = Math.sin(this.s);
        double cos = Math.cos(this.s);
        double d2 = (double) ((float) (this.t - this.f1724l));
        this.n.setStrokeWidth((float) this.p);
        canvas.drawLine(f2, f3, (float) (width + ((int) (cos * d2))), (float) (height + ((int) (d2 * sin))), this.n);
        canvas.drawCircle(f2, f3, this.f1725m, this.n);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        b(this.q, false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.f1719g = x;
            this.f1720h = y;
            this.f1721i = true;
            this.r = false;
            z2 = false;
            z = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i2 = (int) (x - this.f1719g);
            int i3 = (int) (y - this.f1720h);
            this.f1721i = (i3 * i3) + (i2 * i2) > this.f1722j;
            z2 = this.r;
            if (actionMasked == 1) {
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.r;
        float a2 = (float) a(x, y);
        boolean z5 = this.q != a2;
        if (!z || !z5) {
            if (z5 || z2) {
                b(a2, false);
            }
            this.r = z4 | z3;
            return true;
        }
        z3 = true;
        this.r = z4 | z3;
        return true;
    }
}
