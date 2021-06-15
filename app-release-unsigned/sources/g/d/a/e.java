package g.d.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class e extends Drawable {
    public float a;
    public float b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2213c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2214d;
    public ColorStateList e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuffColorFilter f2215f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2216g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f2217h;

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        int i2 = rect.left;
        throw null;
    }

    public void draw(Canvas canvas) {
        if (this.f2215f == null) {
            float f2 = this.a;
            canvas.drawRoundRect(null, f2, f2, null);
            return;
        }
        throw null;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(null, this.a);
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2216g;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.e) != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
        throw null;
    }

    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.e;
        colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        throw null;
    }

    public void setAlpha(int i2) {
        throw null;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2216g = colorStateList;
        this.f2215f = a(colorStateList, this.f2217h);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f2217h = mode;
        this.f2215f = a(this.f2216g, mode);
        invalidateSelf();
    }
}
