package c.e.a.a.r;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import c.e.a.a.t.a;
import g.h.h.d;
import g.h.j.o;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class c {
    public float A;
    public float B;
    public int[] C;
    public boolean D;
    public final TextPaint E;
    public final TextPaint F;
    public TimeInterpolator G;
    public TimeInterpolator H;
    public float I;
    public float J;
    public float K;
    public ColorStateList L;
    public float M;
    public StaticLayout N;
    public float O;
    public float P;
    public float Q;
    public CharSequence R;
    public final View a;
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public float f1295c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f1296d;
    public final Rect e;

    /* renamed from: f  reason: collision with root package name */
    public final RectF f1297f;

    /* renamed from: g  reason: collision with root package name */
    public int f1298g = 16;

    /* renamed from: h  reason: collision with root package name */
    public int f1299h = 16;

    /* renamed from: i  reason: collision with root package name */
    public float f1300i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f1301j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f1302k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f1303l;

    /* renamed from: m  reason: collision with root package name */
    public float f1304m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public a v;
    public CharSequence w;
    public CharSequence x;
    public boolean y;
    public Bitmap z;

    public c(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.E = textPaint;
        this.F = new TextPaint(textPaint);
        this.e = new Rect();
        this.f1296d = new Rect();
        this.f1297f = new RectF();
    }

    public static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i3)) * f2) + (((float) Color.alpha(i2)) * f3)), (int) ((((float) Color.red(i3)) * f2) + (((float) Color.red(i2)) * f3)), (int) ((((float) Color.green(i3)) * f2) + (((float) Color.green(i2)) * f3)), (int) ((((float) Color.blue(i3)) * f2) + (((float) Color.blue(i2)) * f3)));
    }

    public static float i(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        TimeInterpolator timeInterpolator2 = c.e.a.a.c.a.a;
        return c.c.a.a.a.a(f3, f2, f4, f2);
    }

    public static boolean l(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    public float b() {
        if (this.w == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.F;
        textPaint.setTextSize(this.f1301j);
        textPaint.setTypeface(this.s);
        textPaint.setLetterSpacing(this.M);
        TextPaint textPaint2 = this.F;
        CharSequence charSequence = this.w;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    public final boolean c(CharSequence charSequence) {
        View view = this.a;
        AtomicInteger atomicInteger = o.a;
        boolean z2 = true;
        if (view.getLayoutDirection() != 1) {
            z2 = false;
        }
        return ((d.c) (z2 ? d.f2518d : d.f2517c)).b(charSequence, 0, charSequence.length());
    }

    public final void d(float f2) {
        int i2;
        TextPaint textPaint;
        TextPaint textPaint2;
        this.f1297f.left = i((float) this.f1296d.left, (float) this.e.left, f2, this.G);
        this.f1297f.top = i(this.f1304m, this.n, f2, this.G);
        this.f1297f.right = i((float) this.f1296d.right, (float) this.e.right, f2, this.G);
        this.f1297f.bottom = i((float) this.f1296d.bottom, (float) this.e.bottom, f2, this.G);
        this.q = i(this.o, this.p, f2, this.G);
        this.r = i(this.f1304m, this.n, f2, this.G);
        p(i(this.f1300i, this.f1301j, f2, this.H));
        TimeInterpolator timeInterpolator = c.e.a.a.c.a.b;
        this.O = 1.0f - i(0.0f, 1.0f, 1.0f - f2, timeInterpolator);
        View view = this.a;
        AtomicInteger atomicInteger = o.a;
        view.postInvalidateOnAnimation();
        this.P = i(1.0f, 0.0f, f2, timeInterpolator);
        this.a.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f1303l;
        ColorStateList colorStateList2 = this.f1302k;
        if (colorStateList != colorStateList2) {
            textPaint = this.E;
            i2 = a(h(colorStateList2), g(), f2);
        } else {
            textPaint = this.E;
            i2 = g();
        }
        textPaint.setColor(i2);
        float f3 = this.M;
        if (f3 != 0.0f) {
            textPaint2 = this.E;
            f3 = i(0.0f, f3, f2, timeInterpolator);
        } else {
            textPaint2 = this.E;
        }
        textPaint2.setLetterSpacing(f3);
        this.E.setShadowLayer(i(0.0f, this.I, f2, null), i(0.0f, this.J, f2, null), i(0.0f, this.K, f2, null), a(h(null), h(this.L), f2));
        this.a.postInvalidateOnAnimation();
    }

    public final void e(float f2) {
        float f3;
        boolean z2;
        StaticLayout staticLayout;
        if (this.w != null) {
            float width = (float) this.e.width();
            float width2 = (float) this.f1296d.width();
            if (Math.abs(f2 - this.f1301j) < 0.001f) {
                f3 = this.f1301j;
                this.A = 1.0f;
                Typeface typeface = this.u;
                Typeface typeface2 = this.s;
                if (typeface != typeface2) {
                    this.u = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f4 = this.f1300i;
                Typeface typeface3 = this.u;
                Typeface typeface4 = this.t;
                if (typeface3 != typeface4) {
                    this.u = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (Math.abs(f2 - f4) < 0.001f) {
                    this.A = 1.0f;
                } else {
                    this.A = f2 / this.f1300i;
                }
                float f5 = this.f1301j / this.f1300i;
                width = width2 * f5 > width ? Math.min(width / f5, width2) : width2;
                f3 = f4;
            }
            if (width > 0.0f) {
                z2 = this.B != f3 || this.D || z2;
                this.B = f3;
                this.D = false;
            }
            if (this.x == null || z2) {
                this.E.setTextSize(this.B);
                this.E.setTypeface(this.u);
                this.E.setLinearText(this.A != 1.0f);
                boolean c2 = c(this.w);
                this.y = c2;
                try {
                    CharSequence charSequence = this.w;
                    TextPaint textPaint = this.E;
                    int length = charSequence.length();
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    int max = Math.max(0, (int) width);
                    CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, (float) max, truncateAt);
                    int min = Math.min(ellipsize.length(), length);
                    if (c2) {
                        alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                    StaticLayout.Builder obtain = StaticLayout.Builder.obtain(ellipsize, 0, min, textPaint, max);
                    obtain.setAlignment(alignment2);
                    obtain.setIncludePad(false);
                    obtain.setTextDirection(c2 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
                    if (truncateAt != null) {
                        obtain.setEllipsize(truncateAt);
                    }
                    obtain.setMaxLines(1);
                    staticLayout = obtain.build();
                } catch (h e2) {
                    Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
                    staticLayout = null;
                }
                Objects.requireNonNull(staticLayout);
                this.N = staticLayout;
                this.x = staticLayout.getText();
            }
        }
    }

    public float f() {
        TextPaint textPaint = this.F;
        textPaint.setTextSize(this.f1301j);
        textPaint.setTypeface(this.s);
        textPaint.setLetterSpacing(this.M);
        return -this.F.ascent();
    }

    public int g() {
        return h(this.f1303l);
    }

    public final int h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.C;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public void j() {
        this.b = this.e.width() > 0 && this.e.height() > 0 && this.f1296d.width() > 0 && this.f1296d.height() > 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k() {
        /*
        // Method dump skipped, instructions count: 301
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.a.r.c.k():void");
    }

    public void m(ColorStateList colorStateList) {
        if (this.f1303l != colorStateList) {
            this.f1303l = colorStateList;
            k();
        }
    }

    public void n(int i2) {
        if (this.f1299h != i2) {
            this.f1299h = i2;
            k();
        }
    }

    public void o(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f1295c) {
            this.f1295c = f2;
            d(f2);
        }
    }

    public final void p(float f2) {
        e(f2);
        View view = this.a;
        AtomicInteger atomicInteger = o.a;
        view.postInvalidateOnAnimation();
    }

    public void q(Typeface typeface) {
        boolean z2;
        a aVar = this.v;
        boolean z3 = true;
        if (aVar != null) {
            aVar.f1318c = true;
        }
        if (this.s != typeface) {
            this.s = typeface;
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.t != typeface) {
            this.t = typeface;
        } else {
            z3 = false;
        }
        if (z2 || z3) {
            k();
        }
    }
}
