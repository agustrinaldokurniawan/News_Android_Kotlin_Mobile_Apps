package c.e.a.a.k;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import c.e.a.a.r.i;
import c.e.a.a.t.c;
import c.e.a.a.t.d;
import c.e.a.a.w.g;
import c.e.a.a.w.j;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class b extends g implements Drawable.Callback, i.b {
    public static final int[] C = {16842910};
    public static final ShapeDrawable D = new ShapeDrawable(new OvalShape());
    public int A0 = 255;
    public ColorFilter B0;
    public PorterDuffColorFilter C0;
    public ColorStateList D0;
    public ColorStateList E;
    public PorterDuff.Mode E0 = PorterDuff.Mode.SRC_IN;
    public ColorStateList F;
    public int[] F0;
    public float G;
    public boolean G0;
    public float H = -1.0f;
    public ColorStateList H0;
    public ColorStateList I;
    public WeakReference<a> I0 = new WeakReference<>(null);
    public float J;
    public TextUtils.TruncateAt J0;
    public ColorStateList K;
    public boolean K0;
    public CharSequence L;
    public int L0;
    public boolean M;
    public boolean M0;
    public Drawable N;
    public ColorStateList O;
    public float P;
    public boolean Q;
    public boolean R;
    public Drawable S;
    public Drawable T;
    public ColorStateList U;
    public float V;
    public CharSequence W;
    public boolean X;
    public boolean Y;
    public Drawable Z;
    public ColorStateList a0;
    public c.e.a.a.c.g b0;
    public c.e.a.a.c.g c0;
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public final Context l0;
    public final Paint m0 = new Paint(1);
    public final Paint.FontMetrics n0 = new Paint.FontMetrics();
    public final RectF o0 = new RectF();
    public final PointF p0 = new PointF();
    public final Path q0 = new Path();
    public final i r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    public interface a {
        void a();
    }

    public b(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(j.b(context, attributeSet, i2, i3).a());
        this.f1340g.b = new c.e.a.a.o.a(context);
        w();
        this.l0 = context;
        i iVar = new i(this);
        this.r0 = iVar;
        this.L = "";
        iVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = C;
        setState(iArr);
        d0(iArr);
        this.K0 = true;
        int[] iArr2 = c.e.a.a.u.a.a;
        D.setTint(-1);
    }

    public static boolean G(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean H(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (q0()) {
            float f2 = this.k0 + this.j0;
            if (getLayoutDirection() == 0) {
                float f3 = ((float) rect.right) - f2;
                rectF.right = f3;
                rectF.left = f3 - this.V;
            } else {
                float f4 = ((float) rect.left) + f2;
                rectF.left = f4;
                rectF.right = f4 + this.V;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.V;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    public final void B(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (q0()) {
            float f2 = this.k0 + this.j0 + this.V + this.i0 + this.h0;
            if (getLayoutDirection() == 0) {
                float f3 = (float) rect.right;
                rectF.right = f3;
                rectF.left = f3 - f2;
            } else {
                int i2 = rect.left;
                rectF.left = (float) i2;
                rectF.right = ((float) i2) + f2;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    public float C() {
        if (q0()) {
            return this.i0 + this.V + this.j0;
        }
        return 0.0f;
    }

    public float D() {
        return this.M0 ? l() : this.H;
    }

    public Drawable E() {
        Drawable drawable = this.S;
        if (drawable != null) {
            return drawable instanceof g.h.d.k.a ? ((g.h.d.k.a) drawable).a() : drawable;
        }
        return null;
    }

    public final float F() {
        Drawable drawable = this.y0 ? this.Z : this.N;
        float f2 = this.P;
        return (f2 > 0.0f || drawable == null) ? f2 : (float) drawable.getIntrinsicWidth();
    }

    public void I() {
        a aVar = this.I0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public final boolean J(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.E;
        int e = e(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.s0) : 0);
        boolean z3 = true;
        if (this.s0 != e) {
            this.s0 = e;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.F;
        int e2 = e(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.t0) : 0);
        if (this.t0 != e2) {
            this.t0 = e2;
            onStateChange = true;
        }
        int a2 = g.h.d.a.a(e2, e);
        if ((this.u0 != a2) || (this.f1340g.f1348d == null)) {
            this.u0 = a2;
            p(ColorStateList.valueOf(a2));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.I;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.v0) : 0;
        if (this.v0 != colorForState) {
            this.v0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.H0 == null || !c.e.a.a.u.a.b(iArr)) ? 0 : this.H0.getColorForState(iArr, this.w0);
        if (this.w0 != colorForState2) {
            this.w0 = colorForState2;
            if (this.G0) {
                onStateChange = true;
            }
        }
        c.e.a.a.t.b bVar = this.r0.f1312f;
        int colorForState3 = (bVar == null || (colorStateList = bVar.a) == null) ? 0 : colorStateList.getColorForState(iArr, this.x0);
        if (this.x0 != colorForState3) {
            this.x0 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (state[i2] == 16842912) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        z = false;
        boolean z4 = z && this.X;
        if (this.y0 == z4 || this.Z == null) {
            z2 = false;
        } else {
            float z5 = z();
            this.y0 = z4;
            if (z5 != z()) {
                onStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.D0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.z0) : 0;
        if (this.z0 != colorForState4) {
            this.z0 = colorForState4;
            this.C0 = c.e.a.a.a.v(this, this.D0, this.E0);
        } else {
            z3 = onStateChange;
        }
        if (H(this.N)) {
            z3 |= this.N.setState(iArr);
        }
        if (H(this.Z)) {
            z3 |= this.Z.setState(iArr);
        }
        if (H(this.S)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z3 |= this.S.setState(iArr3);
        }
        int[] iArr4 = c.e.a.a.u.a.a;
        if (H(this.T)) {
            z3 |= this.T.setState(iArr2);
        }
        if (z3) {
            invalidateSelf();
        }
        if (z2) {
            I();
        }
        return z3;
    }

    public void K(boolean z) {
        if (this.X != z) {
            this.X = z;
            float z2 = z();
            if (!z && this.y0) {
                this.y0 = false;
            }
            float z3 = z();
            invalidateSelf();
            if (z2 != z3) {
                I();
            }
        }
    }

    public void L(Drawable drawable) {
        if (this.Z != drawable) {
            float z = z();
            this.Z = drawable;
            float z2 = z();
            r0(this.Z);
            x(this.Z);
            invalidateSelf();
            if (z != z2) {
                I();
            }
        }
    }

    public void M(ColorStateList colorStateList) {
        if (this.a0 != colorStateList) {
            this.a0 = colorStateList;
            if (this.Y && this.Z != null && this.X) {
                this.Z.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void N(boolean z) {
        if (this.Y != z) {
            boolean o02 = o0();
            this.Y = z;
            boolean o03 = o0();
            if (o02 != o03) {
                if (o03) {
                    x(this.Z);
                } else {
                    r0(this.Z);
                }
                invalidateSelf();
                I();
            }
        }
    }

    public void O(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    public void P(float f2) {
        if (this.H != f2) {
            this.H = f2;
            this.f1340g.a = this.f1340g.a.e(f2);
            invalidateSelf();
        }
    }

    public void Q(float f2) {
        if (this.k0 != f2) {
            this.k0 = f2;
            invalidateSelf();
            I();
        }
    }

    public void R(Drawable drawable) {
        Drawable drawable2 = this.N;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof g.h.d.k.a) {
            drawable2 = ((g.h.d.k.a) drawable2).a();
        }
        if (drawable2 != drawable) {
            float z = z();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.N = drawable3;
            float z2 = z();
            r0(drawable2);
            if (p0()) {
                x(this.N);
            }
            invalidateSelf();
            if (z != z2) {
                I();
            }
        }
    }

    public void S(float f2) {
        if (this.P != f2) {
            float z = z();
            this.P = f2;
            float z2 = z();
            invalidateSelf();
            if (z != z2) {
                I();
            }
        }
    }

    public void T(ColorStateList colorStateList) {
        this.Q = true;
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (p0()) {
                this.N.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void U(boolean z) {
        if (this.M != z) {
            boolean p02 = p0();
            this.M = z;
            boolean p03 = p0();
            if (p02 != p03) {
                if (p03) {
                    x(this.N);
                } else {
                    r0(this.N);
                }
                invalidateSelf();
                I();
            }
        }
    }

    public void V(float f2) {
        if (this.G != f2) {
            this.G = f2;
            invalidateSelf();
            I();
        }
    }

    public void W(float f2) {
        if (this.d0 != f2) {
            this.d0 = f2;
            invalidateSelf();
            I();
        }
    }

    public void X(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (this.M0) {
                t(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void Y(float f2) {
        if (this.J != f2) {
            this.J = f2;
            this.m0.setStrokeWidth(f2);
            if (this.M0) {
                this.f1340g.f1355l = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public void Z(Drawable drawable) {
        Drawable E2 = E();
        if (E2 != drawable) {
            float C2 = C();
            this.S = drawable != null ? drawable.mutate() : null;
            int[] iArr = c.e.a.a.u.a.a;
            this.T = new RippleDrawable(c.e.a.a.u.a.a(this.K), this.S, D);
            float C3 = C();
            r0(E2);
            if (q0()) {
                x(this.S);
            }
            invalidateSelf();
            if (C2 != C3) {
                I();
            }
        }
    }

    @Override // c.e.a.a.r.i.b
    public void a() {
        I();
        invalidateSelf();
    }

    public void a0(float f2) {
        if (this.j0 != f2) {
            this.j0 = f2;
            invalidateSelf();
            if (q0()) {
                I();
            }
        }
    }

    public void b0(float f2) {
        if (this.V != f2) {
            this.V = f2;
            invalidateSelf();
            if (q0()) {
                I();
            }
        }
    }

    public void c0(float f2) {
        if (this.i0 != f2) {
            this.i0 = f2;
            invalidateSelf();
            if (q0()) {
                I();
            }
        }
    }

    public boolean d0(int[] iArr) {
        if (Arrays.equals(this.F0, iArr)) {
            return false;
        }
        this.F0 = iArr;
        if (q0()) {
            return J(getState(), iArr);
        }
        return false;
    }

    @Override // c.e.a.a.w.g
    public void draw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i2 = this.A0) != 0) {
            int saveLayerAlpha = i2 < 255 ? canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2) : 0;
            if (!this.M0) {
                this.m0.setColor(this.s0);
                this.m0.setStyle(Paint.Style.FILL);
                this.o0.set(bounds);
                canvas.drawRoundRect(this.o0, D(), D(), this.m0);
            }
            if (!this.M0) {
                this.m0.setColor(this.t0);
                this.m0.setStyle(Paint.Style.FILL);
                Paint paint = this.m0;
                ColorFilter colorFilter = this.B0;
                if (colorFilter == null) {
                    colorFilter = this.C0;
                }
                paint.setColorFilter(colorFilter);
                this.o0.set(bounds);
                canvas.drawRoundRect(this.o0, D(), D(), this.m0);
            }
            if (this.M0) {
                super.draw(canvas);
            }
            if (this.J > 0.0f && !this.M0) {
                this.m0.setColor(this.v0);
                this.m0.setStyle(Paint.Style.STROKE);
                if (!this.M0) {
                    Paint paint2 = this.m0;
                    ColorFilter colorFilter2 = this.B0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.C0;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.o0;
                float f3 = this.J / 2.0f;
                rectF.set(((float) bounds.left) + f3, ((float) bounds.top) + f3, ((float) bounds.right) - f3, ((float) bounds.bottom) - f3);
                float f4 = this.H - (this.J / 2.0f);
                canvas.drawRoundRect(this.o0, f4, f4, this.m0);
            }
            this.m0.setColor(this.w0);
            this.m0.setStyle(Paint.Style.FILL);
            this.o0.set(bounds);
            if (!this.M0) {
                canvas.drawRoundRect(this.o0, D(), D(), this.m0);
            } else {
                c(new RectF(bounds), this.q0);
                g(canvas, this.m0, this.q0, this.f1340g.a, h());
            }
            if (p0()) {
                y(bounds, this.o0);
                RectF rectF2 = this.o0;
                float f5 = rectF2.left;
                float f6 = rectF2.top;
                canvas.translate(f5, f6);
                this.N.setBounds(0, 0, (int) this.o0.width(), (int) this.o0.height());
                this.N.draw(canvas);
                canvas.translate(-f5, -f6);
            }
            if (o0()) {
                y(bounds, this.o0);
                RectF rectF3 = this.o0;
                float f7 = rectF3.left;
                float f8 = rectF3.top;
                canvas.translate(f7, f8);
                this.Z.setBounds(0, 0, (int) this.o0.width(), (int) this.o0.height());
                this.Z.draw(canvas);
                canvas.translate(-f7, -f8);
            }
            if (!this.K0 || this.L == null) {
                i3 = saveLayerAlpha;
                i4 = 0;
                i5 = 255;
            } else {
                PointF pointF = this.p0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.L != null) {
                    float z = z() + this.d0 + this.g0;
                    if (getLayoutDirection() == 0) {
                        pointF.x = ((float) bounds.left) + z;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - z;
                        align = Paint.Align.RIGHT;
                    }
                    this.r0.a.getFontMetrics(this.n0);
                    Paint.FontMetrics fontMetrics = this.n0;
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF4 = this.o0;
                rectF4.setEmpty();
                if (this.L != null) {
                    float z2 = z() + this.d0 + this.g0;
                    float C2 = C() + this.k0 + this.h0;
                    if (getLayoutDirection() == 0) {
                        rectF4.left = ((float) bounds.left) + z2;
                        f2 = ((float) bounds.right) - C2;
                    } else {
                        rectF4.left = ((float) bounds.left) + C2;
                        f2 = ((float) bounds.right) - z2;
                    }
                    rectF4.right = f2;
                    rectF4.top = (float) bounds.top;
                    rectF4.bottom = (float) bounds.bottom;
                }
                i iVar = this.r0;
                if (iVar.f1312f != null) {
                    iVar.a.drawableState = getState();
                    i iVar2 = this.r0;
                    iVar2.f1312f.c(this.l0, iVar2.a, iVar2.b);
                }
                this.r0.a.setTextAlign(align);
                boolean z3 = Math.round(this.r0.a(this.L.toString())) > Math.round(this.o0.width());
                if (z3) {
                    i6 = canvas.save();
                    canvas.clipRect(this.o0);
                } else {
                    i6 = 0;
                }
                CharSequence charSequence = this.L;
                if (z3 && this.J0 != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.r0.a, this.o0.width(), this.J0);
                }
                int length = charSequence.length();
                PointF pointF2 = this.p0;
                i3 = saveLayerAlpha;
                i4 = 0;
                i5 = 255;
                canvas.drawText(charSequence, 0, length, pointF2.x, pointF2.y, this.r0.a);
                if (z3) {
                    canvas.restoreToCount(i6);
                }
            }
            if (q0()) {
                A(bounds, this.o0);
                RectF rectF5 = this.o0;
                float f9 = rectF5.left;
                float f10 = rectF5.top;
                canvas.translate(f9, f10);
                this.S.setBounds(i4, i4, (int) this.o0.width(), (int) this.o0.height());
                int[] iArr = c.e.a.a.u.a.a;
                this.T.setBounds(this.S.getBounds());
                this.T.jumpToCurrentState();
                this.T.draw(canvas);
                canvas.translate(-f9, -f10);
            }
            if (this.A0 < i5) {
                canvas.restoreToCount(i3);
            }
        }
    }

    public void e0(ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (q0()) {
                this.S.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void f0(boolean z) {
        if (this.R != z) {
            boolean q02 = q0();
            this.R = z;
            boolean q03 = q0();
            if (q02 != q03) {
                if (q03) {
                    x(this.S);
                } else {
                    r0(this.S);
                }
                invalidateSelf();
                I();
            }
        }
    }

    public void g0(float f2) {
        if (this.f0 != f2) {
            float z = z();
            this.f0 = f2;
            float z2 = z();
            invalidateSelf();
            if (z != z2) {
                I();
            }
        }
    }

    public int getAlpha() {
        return this.A0;
    }

    public ColorFilter getColorFilter() {
        return this.B0;
    }

    public int getIntrinsicHeight() {
        return (int) this.G;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(C() + this.r0.a(this.L.toString()) + z() + this.d0 + this.g0 + this.h0 + this.k0), this.L0);
    }

    @Override // c.e.a.a.w.g
    public int getOpacity() {
        return -3;
    }

    @Override // c.e.a.a.w.g
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.M0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.H);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.G, this.H);
        }
        outline.setAlpha(((float) this.A0) / 255.0f);
    }

    public void h0(float f2) {
        if (this.e0 != f2) {
            float z = z();
            this.e0 = f2;
            float z2 = z();
            invalidateSelf();
            if (z != z2) {
                I();
            }
        }
    }

    public void i0(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            this.H0 = this.G0 ? c.e.a.a.u.a.a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // c.e.a.a.w.g
    public boolean isStateful() {
        ColorStateList colorStateList;
        if (!G(this.E) && !G(this.F) && !G(this.I) && (!this.G0 || !G(this.H0))) {
            c.e.a.a.t.b bVar = this.r0.f1312f;
            if (!((bVar == null || (colorStateList = bVar.a) == null || !colorStateList.isStateful()) ? false : true)) {
                if (!(this.Y && this.Z != null && this.X) && !H(this.N) && !H(this.Z) && !G(this.D0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void j0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.L, charSequence)) {
            this.L = charSequence;
            this.r0.f1311d = true;
            invalidateSelf();
            I();
        }
    }

    public void k0(c.e.a.a.t.b bVar) {
        i iVar = this.r0;
        Context context = this.l0;
        if (iVar.f1312f != bVar) {
            iVar.f1312f = bVar;
            if (bVar != null) {
                TextPaint textPaint = iVar.a;
                d dVar = iVar.b;
                bVar.a();
                bVar.d(textPaint, bVar.n);
                bVar.b(context, new c(bVar, textPaint, dVar));
                i.b bVar2 = iVar.e.get();
                if (bVar2 != null) {
                    iVar.a.drawableState = bVar2.getState();
                }
                bVar.c(context, iVar.a, iVar.b);
                iVar.f1311d = true;
            }
            i.b bVar3 = iVar.e.get();
            if (bVar3 != null) {
                bVar3.a();
                bVar3.onStateChange(bVar3.getState());
            }
        }
    }

    public void l0(float f2) {
        if (this.h0 != f2) {
            this.h0 = f2;
            invalidateSelf();
            I();
        }
    }

    public void m0(float f2) {
        if (this.g0 != f2) {
            this.g0 = f2;
            invalidateSelf();
            I();
        }
    }

    public void n0(boolean z) {
        if (this.G0 != z) {
            this.G0 = z;
            this.H0 = z ? c.e.a.a.u.a.a(this.K) : null;
            onStateChange(getState());
        }
    }

    public final boolean o0() {
        return this.Y && this.Z != null && this.y0;
    }

    public boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (p0()) {
            onLayoutDirectionChanged |= this.N.setLayoutDirection(i2);
        }
        if (o0()) {
            onLayoutDirectionChanged |= this.Z.setLayoutDirection(i2);
        }
        if (q0()) {
            onLayoutDirectionChanged |= this.S.setLayoutDirection(i2);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (p0()) {
            onLevelChange |= this.N.setLevel(i2);
        }
        if (o0()) {
            onLevelChange |= this.Z.setLevel(i2);
        }
        if (q0()) {
            onLevelChange |= this.S.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // c.e.a.a.w.g, c.e.a.a.r.i.b
    public boolean onStateChange(int[] iArr) {
        if (this.M0) {
            super.onStateChange(iArr);
        }
        return J(iArr, this.F0);
    }

    public final boolean p0() {
        return this.M && this.N != null;
    }

    public final boolean q0() {
        return this.R && this.S != null;
    }

    public final void r0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // c.e.a.a.w.g
    public void setAlpha(int i2) {
        if (this.A0 != i2) {
            this.A0 = i2;
            invalidateSelf();
        }
    }

    @Override // c.e.a.a.w.g
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.B0 != colorFilter) {
            this.B0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // c.e.a.a.w.g
    public void setTintList(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            this.D0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // c.e.a.a.w.g
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.E0 != mode) {
            this.E0 = mode;
            this.C0 = c.e.a.a.a.v(this, this.D0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (p0()) {
            visible |= this.N.setVisible(z, z2);
        }
        if (o0()) {
            visible |= this.Z.setVisible(z, z2);
        }
        if (q0()) {
            visible |= this.S.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void x(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.S) {
                if (drawable.isStateful()) {
                    drawable.setState(this.F0);
                }
                drawable.setTintList(this.U);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.N;
            if (drawable == drawable2 && this.Q) {
                drawable2.setTintList(this.O);
            }
        }
    }

    public final void y(Rect rect, RectF rectF) {
        float f2;
        rectF.setEmpty();
        if (p0() || o0()) {
            float f3 = this.d0 + this.e0;
            float F2 = F();
            if (getLayoutDirection() == 0) {
                float f4 = ((float) rect.left) + f3;
                rectF.left = f4;
                rectF.right = f4 + F2;
            } else {
                float f5 = ((float) rect.right) - f3;
                rectF.right = f5;
                rectF.left = f5 - F2;
            }
            Drawable drawable = this.y0 ? this.Z : this.N;
            float f6 = this.P;
            if (f6 <= 0.0f && drawable != null) {
                f6 = (float) Math.ceil((double) TypedValue.applyDimension(1, (float) 24, this.l0.getResources().getDisplayMetrics()));
                if (((float) drawable.getIntrinsicHeight()) <= f6) {
                    f2 = (float) drawable.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f2 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f2;
                }
            }
            f2 = f6;
            float exactCenterY2 = rect.exactCenterY() - (f2 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f2;
        }
    }

    public float z() {
        if (!p0() && !o0()) {
            return 0.0f;
        }
        return F() + this.e0 + this.f0;
    }
}
