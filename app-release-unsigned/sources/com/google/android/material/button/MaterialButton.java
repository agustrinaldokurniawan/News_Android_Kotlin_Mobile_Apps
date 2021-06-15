package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import c.e.a.a.r.k;
import c.e.a.a.w.g;
import c.e.a.a.w.j;
import c.e.a.a.w.n;
import com.tsuga.news.R;
import g.b.g.f;
import g.h.j.o;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class MaterialButton extends f implements Checkable, n {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1648g = {16842911};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f1649h = {16842912};

    /* renamed from: i  reason: collision with root package name */
    public final c.e.a.a.h.a f1650i;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashSet<a> f1651j = new LinkedHashSet<>();

    /* renamed from: k  reason: collision with root package name */
    public b f1652k;

    /* renamed from: l  reason: collision with root package name */
    public PorterDuff.Mode f1653l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f1654m;
    public Drawable n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    public interface b {
    }

    public static class c extends g.j.a.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public boolean f1655g;

        public static class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new c[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f1655g = parcel.readInt() != 1 ? false : true;
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // g.j.a.a
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f2593f, i2);
            parcel.writeInt(this.f1655g ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(c.e.a.a.a0.a.a.a(context, attributeSet, R.attr.materialButtonStyle, 2131821170), attributeSet, R.attr.materialButtonStyle);
        boolean z = false;
        this.s = false;
        this.t = false;
        Context context2 = getContext();
        TypedArray d2 = k.d(context2, attributeSet, c.e.a.a.b.f1176l, R.attr.materialButtonStyle, 2131821170, new int[0]);
        this.r = d2.getDimensionPixelSize(12, 0);
        this.f1653l = c.e.a.a.a.o(d2.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f1654m = c.e.a.a.a.g(getContext(), d2, 14);
        this.n = c.e.a.a.a.i(getContext(), d2, 10);
        this.u = d2.getInteger(11, 1);
        this.o = d2.getDimensionPixelSize(13, 0);
        c.e.a.a.h.a aVar = new c.e.a.a.h.a(this, j.b(context2, attributeSet, R.attr.materialButtonStyle, 2131821170).a());
        this.f1650i = aVar;
        aVar.f1208c = d2.getDimensionPixelOffset(1, 0);
        aVar.f1209d = d2.getDimensionPixelOffset(2, 0);
        aVar.e = d2.getDimensionPixelOffset(3, 0);
        aVar.f1210f = d2.getDimensionPixelOffset(4, 0);
        if (d2.hasValue(8)) {
            int dimensionPixelSize = d2.getDimensionPixelSize(8, -1);
            aVar.f1211g = dimensionPixelSize;
            aVar.e(aVar.b.e((float) dimensionPixelSize));
            aVar.p = true;
        }
        aVar.f1212h = d2.getDimensionPixelSize(20, 0);
        aVar.f1213i = c.e.a.a.a.o(d2.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f1214j = c.e.a.a.a.g(getContext(), d2, 6);
        aVar.f1215k = c.e.a.a.a.g(getContext(), d2, 19);
        aVar.f1216l = c.e.a.a.a.g(getContext(), d2, 16);
        aVar.q = d2.getBoolean(5, false);
        aVar.s = d2.getDimensionPixelSize(9, 0);
        AtomicInteger atomicInteger = o.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (d2.hasValue(0)) {
            aVar.o = true;
            setSupportBackgroundTintList(aVar.f1214j);
            setSupportBackgroundTintMode(aVar.f1213i);
        } else {
            aVar.g();
        }
        setPaddingRelative(paddingStart + aVar.f1208c, paddingTop + aVar.e, paddingEnd + aVar.f1209d, paddingBottom + aVar.f1210f);
        d2.recycle();
        setCompoundDrawablePadding(this.r);
        g(this.n != null ? true : z);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public boolean a() {
        c.e.a.a.h.a aVar = this.f1650i;
        return aVar != null && aVar.q;
    }

    public final boolean b() {
        int i2 = this.u;
        return i2 == 3 || i2 == 4;
    }

    public final boolean c() {
        int i2 = this.u;
        return i2 == 1 || i2 == 2;
    }

    public final boolean d() {
        int i2 = this.u;
        return i2 == 16 || i2 == 32;
    }

    public final boolean e() {
        c.e.a.a.h.a aVar = this.f1650i;
        return aVar != null && !aVar.o;
    }

    public final void f() {
        if (c()) {
            setCompoundDrawablesRelative(this.n, null, null, null);
        } else if (b()) {
            setCompoundDrawablesRelative(null, null, this.n, null);
        } else if (d()) {
            setCompoundDrawablesRelative(null, this.n, null, null);
        }
    }

    public final void g(boolean z) {
        Drawable drawable = this.n;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.n = mutate;
            mutate.setTintList(this.f1654m);
            PorterDuff.Mode mode = this.f1653l;
            if (mode != null) {
                this.n.setTintMode(mode);
            }
            int i2 = this.o;
            if (i2 == 0) {
                i2 = this.n.getIntrinsicWidth();
            }
            int i3 = this.o;
            if (i3 == 0) {
                i3 = this.n.getIntrinsicHeight();
            }
            Drawable drawable2 = this.n;
            int i4 = this.p;
            int i5 = this.q;
            drawable2.setBounds(i4, i5, i2 + i4, i3 + i5);
        }
        if (z) {
            f();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = false;
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((c() && drawable3 != this.n) || ((b() && drawable5 != this.n) || (d() && drawable4 != this.n))) {
            z2 = true;
        }
        if (z2) {
            f();
        }
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.f1650i.f1211g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.n;
    }

    public int getIconGravity() {
        return this.u;
    }

    public int getIconPadding() {
        return this.r;
    }

    public int getIconSize() {
        return this.o;
    }

    public ColorStateList getIconTint() {
        return this.f1654m;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1653l;
    }

    public int getInsetBottom() {
        return this.f1650i.f1210f;
    }

    public int getInsetTop() {
        return this.f1650i.e;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f1650i.f1216l;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        if (e()) {
            return this.f1650i.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f1650i.f1215k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f1650i.f1212h;
        }
        return 0;
    }

    @Override // g.b.g.f
    public ColorStateList getSupportBackgroundTintList() {
        if (e()) {
            return this.f1650i.f1214j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // g.b.g.f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (e()) {
            return this.f1650i.f1213i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void h(int i2, int i3) {
        if (this.n != null && getLayout() != null) {
            if (c() || b()) {
                this.q = 0;
                int i4 = this.u;
                boolean z = true;
                if (i4 == 1 || i4 == 3) {
                    this.p = 0;
                } else {
                    int i5 = this.o;
                    if (i5 == 0) {
                        i5 = this.n.getIntrinsicWidth();
                    }
                    int textWidth = i2 - getTextWidth();
                    AtomicInteger atomicInteger = o.a;
                    int paddingEnd = ((((textWidth - getPaddingEnd()) - i5) - this.r) - getPaddingStart()) / 2;
                    boolean z2 = getLayoutDirection() == 1;
                    if (this.u != 4) {
                        z = false;
                    }
                    if (z2 != z) {
                        paddingEnd = -paddingEnd;
                    }
                    if (this.p != paddingEnd) {
                        this.p = paddingEnd;
                        g(false);
                        return;
                    }
                    return;
                }
            } else if (d()) {
                this.p = 0;
                if (this.u == 16) {
                    this.q = 0;
                } else {
                    int i6 = this.o;
                    if (i6 == 0) {
                        i6 = this.n.getIntrinsicHeight();
                    }
                    int textHeight = (((((i3 - getTextHeight()) - getPaddingTop()) - i6) - this.r) - getPaddingBottom()) / 2;
                    if (this.q != textHeight) {
                        this.q = textHeight;
                        g(false);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            g(false);
        }
    }

    public boolean isChecked() {
        return this.s;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            c.e.a.a.a.u(this, this.f1650i.b());
        }
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f1648g);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f1649h);
        }
        return onCreateDrawableState;
    }

    @Override // g.b.g.f
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // g.b.g.f
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // g.b.g.f
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f2593f);
        setChecked(cVar.f1655g);
    }

    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f1655g = this.s;
        return cVar;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        h(i2, i3);
    }

    @Override // g.b.g.f
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (e()) {
            c.e.a.a.h.a aVar = this.f1650i;
            if (aVar.b() != null) {
                aVar.b().setTint(i2);
                return;
            }
            return;
        }
        super.setBackgroundColor(i2);
    }

    @Override // g.b.g.f
    public void setBackgroundDrawable(Drawable drawable) {
        if (e()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                c.e.a.a.h.a aVar = this.f1650i;
                aVar.o = true;
                aVar.a.setSupportBackgroundTintList(aVar.f1214j);
                aVar.a.setSupportBackgroundTintMode(aVar.f1213i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // g.b.g.f
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? g.b.d.a.a.a(getContext(), i2) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (e()) {
            this.f1650i.q = z;
        }
    }

    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.s != z) {
            this.s = z;
            refreshDrawableState();
            if (!this.t) {
                this.t = true;
                Iterator<a> it = this.f1651j.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.s);
                }
                this.t = false;
            }
        }
    }

    public void setCornerRadius(int i2) {
        if (e()) {
            c.e.a.a.h.a aVar = this.f1650i;
            if (!aVar.p || aVar.f1211g != i2) {
                aVar.f1211g = i2;
                aVar.p = true;
                aVar.e(aVar.b.e((float) i2));
            }
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        if (e()) {
            g b2 = this.f1650i.b();
            g.b bVar = b2.f1340g;
            if (bVar.o != f2) {
                bVar.o = f2;
                b2.w();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.n != drawable) {
            this.n = drawable;
            g(true);
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.u != i2) {
            this.u = i2;
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.r != i2) {
            this.r = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? g.b.d.a.a.a(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.o != i2) {
            this.o = i2;
            g(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1654m != colorStateList) {
            this.f1654m = colorStateList;
            g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1653l != mode) {
            this.f1653l = mode;
            g(false);
        }
    }

    public void setIconTintResource(int i2) {
        Context context = getContext();
        ThreadLocal<TypedValue> threadLocal = g.b.d.a.a.a;
        setIconTint(context.getColorStateList(i2));
    }

    public void setInsetBottom(int i2) {
        c.e.a.a.h.a aVar = this.f1650i;
        aVar.f(aVar.e, i2);
    }

    public void setInsetTop(int i2) {
        c.e.a.a.h.a aVar = this.f1650i;
        aVar.f(i2, aVar.f1210f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f1652k = bVar;
    }

    public void setPressed(boolean z) {
        b bVar = this.f1652k;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            c.e.a.a.h.a aVar = this.f1650i;
            if (aVar.f1216l != colorStateList) {
                aVar.f1216l = colorStateList;
                if (aVar.a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) aVar.a.getBackground()).setColor(c.e.a.a.u.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (e()) {
            Context context = getContext();
            ThreadLocal<TypedValue> threadLocal = g.b.d.a.a.a;
            setRippleColor(context.getColorStateList(i2));
        }
    }

    @Override // c.e.a.a.w.n
    public void setShapeAppearanceModel(j jVar) {
        if (e()) {
            this.f1650i.e(jVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (e()) {
            c.e.a.a.h.a aVar = this.f1650i;
            aVar.n = z;
            aVar.h();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            c.e.a.a.h.a aVar = this.f1650i;
            if (aVar.f1215k != colorStateList) {
                aVar.f1215k = colorStateList;
                aVar.h();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (e()) {
            Context context = getContext();
            ThreadLocal<TypedValue> threadLocal = g.b.d.a.a.a;
            setStrokeColor(context.getColorStateList(i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (e()) {
            c.e.a.a.h.a aVar = this.f1650i;
            if (aVar.f1212h != i2) {
                aVar.f1212h = i2;
                aVar.h();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // g.b.g.f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (e()) {
            c.e.a.a.h.a aVar = this.f1650i;
            if (aVar.f1214j != colorStateList) {
                aVar.f1214j = colorStateList;
                if (aVar.b() != null) {
                    aVar.b().setTintList(aVar.f1214j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // g.b.g.f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (e()) {
            c.e.a.a.h.a aVar = this.f1650i;
            if (aVar.f1213i != mode) {
                aVar.f1213i = mode;
                if (aVar.b() != null && aVar.f1213i != null) {
                    aVar.b().setTintMode(aVar.f1213i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void toggle() {
        setChecked(!this.s);
    }
}
