package c.e.a.a.x;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c.e.a.a.b;
import com.tsuga.news.R;
import g.h.j.o;
import java.util.concurrent.atomic.AtomicInteger;

public class d extends FrameLayout {
    public static final View.OnTouchListener e = new a();

    /* renamed from: f  reason: collision with root package name */
    public c f1398f;

    /* renamed from: g  reason: collision with root package name */
    public b f1399g;

    /* renamed from: h  reason: collision with root package name */
    public int f1400h;

    /* renamed from: i  reason: collision with root package name */
    public final float f1401i;

    /* renamed from: j  reason: collision with root package name */
    public final float f1402j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f1403k;

    /* renamed from: l  reason: collision with root package name */
    public PorterDuff.Mode f1404l;

    public static class a implements View.OnTouchListener {
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(c.e.a.a.a0.a.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, b.y);
        if (obtainStyledAttributes.hasValue(6)) {
            AtomicInteger atomicInteger = o.a;
            setElevation((float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f1400h = obtainStyledAttributes.getInt(2, 0);
        this.f1401i = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(c.e.a.a.a.g(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(c.e.a.a.a.o(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f1402j = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(e);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(c.e.a.a.a.m(c.e.a.a.a.f(this, R.attr.colorSurface), c.e.a.a.a.f(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
            ColorStateList colorStateList = this.f1403k;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            AtomicInteger atomicInteger2 = o.a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f1402j;
    }

    public int getAnimationMode() {
        return this.f1400h;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f1401i;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f1399g;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        AtomicInteger atomicInteger = o.a;
        requestApplyInsets();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f1399g;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        c cVar = this.f1398f;
        if (cVar != null) {
            cVar.a(this, i2, i3, i4, i5);
        }
    }

    public void setAnimationMode(int i2) {
        this.f1400h = i2;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f1403k == null)) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f1403k);
            drawable.setTintMode(this.f1404l);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f1403k = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f1404l);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f1404l = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setOnAttachStateChangeListener(b bVar) {
        this.f1399g = bVar;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : e);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(c cVar) {
        this.f1398f = cVar;
    }
}
