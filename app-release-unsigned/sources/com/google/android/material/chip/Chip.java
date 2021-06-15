package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import c.e.a.a.k.b;
import c.e.a.a.t.d;
import c.e.a.a.w.g;
import c.e.a.a.w.j;
import c.e.a.a.w.n;
import com.tsuga.news.R;
import g.b.g.g;
import g.h.j.o;
import g.h.j.z.b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Chip extends g implements b.a, n {

    /* renamed from: h  reason: collision with root package name */
    public static final Rect f1667h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f1668i = {16842913};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f1669j = {16842911};

    /* renamed from: k  reason: collision with root package name */
    public c.e.a.a.k.b f1670k;

    /* renamed from: l  reason: collision with root package name */
    public InsetDrawable f1671l;

    /* renamed from: m  reason: collision with root package name */
    public RippleDrawable f1672m;
    public View.OnClickListener n;
    public CompoundButton.OnCheckedChangeListener o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public final b w;
    public final Rect x = new Rect();
    public final RectF y = new RectF();
    public final d z = new a();

    public class a extends d {
        public a() {
        }

        @Override // c.e.a.a.t.d
        public void a(int i2) {
        }

        @Override // c.e.a.a.t.d
        public void b(Typeface typeface, boolean z) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            c.e.a.a.k.b bVar = chip.f1670k;
            if (bVar.K0) {
                charSequence = bVar.L;
            } else {
                charSequence = chip.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends g.j.b.a {
        public b(Chip chip) {
            super(chip);
        }

        @Override // g.j.b.a
        public void m(List<Integer> list) {
            boolean z = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.f1667h;
            if (chip.e()) {
                Chip chip2 = Chip.this;
                c.e.a.a.k.b bVar = chip2.f1670k;
                if (bVar != null && bVar.R) {
                    z = true;
                }
                if (z && chip2.n != null) {
                    list.add(1);
                }
            }
        }

        @Override // g.j.b.a
        public boolean p(int i2, int i3, Bundle bundle) {
            boolean z = false;
            if (i3 == 16) {
                if (i2 == 0) {
                    return Chip.this.performClick();
                }
                if (i2 == 1) {
                    Chip chip = Chip.this;
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.n;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    chip.w.u(1, 1);
                }
            }
            return z;
        }

        @Override // g.j.b.a
        public void q(g.h.j.z.b bVar) {
            bVar.b.setCheckable(Chip.this.f());
            bVar.b.setClickable(Chip.this.isClickable());
            if (Chip.this.f() || Chip.this.isClickable()) {
                bVar.b.setClassName(Chip.this.f() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                bVar.b.setClassName("android.view.View");
            }
            bVar.b.setText(Chip.this.getText());
        }

        @Override // g.j.b.a
        public void r(int i2, g.h.j.z.b bVar) {
            String str = "";
            if (i2 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        str = text;
                    }
                    objArr[0] = str;
                    closeIconContentDescription = context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim();
                }
                bVar.b.setContentDescription(closeIconContentDescription);
                bVar.b.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                bVar.a(b.a.a);
                bVar.b.setEnabled(Chip.this.isEnabled());
                return;
            }
            bVar.b.setContentDescription(str);
            bVar.b.setBoundsInParent(Chip.f1667h);
        }

        @Override // g.j.b.a
        public void s(int i2, boolean z) {
            if (i2 == 1) {
                Chip chip = Chip.this;
                chip.s = z;
                chip.refreshDrawableState();
            }
        }

        public int w(float f2, float f3) {
            Chip chip = Chip.this;
            Rect rect = Chip.f1667h;
            return (!chip.e() || !Chip.this.getCloseIconTouchBounds().contains(f2, f3)) ? 0 : 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x033d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r19, android.util.AttributeSet r20) {
        /*
        // Method dump skipped, instructions count: 877
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private RectF getCloseIconTouchBounds() {
        this.y.setEmpty();
        if (e() && this.n != null) {
            c.e.a.a.k.b bVar = this.f1670k;
            bVar.B(bVar.getBounds(), this.y);
        }
        return this.y;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.x.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.x;
    }

    private c.e.a.a.t.b getTextAppearance() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.r0.f1312f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.r != z2) {
            this.r = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.q != z2) {
            this.q = z2;
            refreshDrawableState();
        }
    }

    @Override // c.e.a.a.k.b.a
    public void a() {
        d(this.v);
        requestLayout();
        invalidateOutline();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r0.right == r7) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(int r10) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.d(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        b bVar = this.w;
        Objects.requireNonNull(bVar);
        boolean z2 = false;
        int i2 = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z3 = false;
                                while (i2 < repeatCount && bVar.n(i3, null)) {
                                    i2++;
                                    z3 = true;
                                }
                                z2 = z3;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i4 = bVar.o;
                    if (i4 != Integer.MIN_VALUE) {
                        bVar.p(i4, 16, null);
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = bVar.n(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = bVar.n(1, null);
            }
        }
        if (!z2 || this.w.o == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // g.b.g.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawableStateChanged() {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.drawableStateChanged():void");
    }

    public final boolean e() {
        c.e.a.a.k.b bVar = this.f1670k;
        return (bVar == null || bVar.E() == null) ? false : true;
    }

    public boolean f() {
        c.e.a.a.k.b bVar = this.f1670k;
        return bVar != null && bVar.X;
    }

    public final void g() {
        if (this.f1671l != null) {
            this.f1671l = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            int[] iArr = c.e.a.a.u.a.a;
            i();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1671l;
        return insetDrawable == null ? this.f1670k : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.Z;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.a0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.F;
        }
        return null;
    }

    public float getChipCornerRadius() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return Math.max(0.0f, bVar.D());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1670k;
    }

    public float getChipEndPadding() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.k0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar == null || (drawable = bVar.N) == null) {
            return null;
        }
        return drawable instanceof g.h.d.k.a ? ((g.h.d.k.a) drawable).a() : drawable;
    }

    public float getChipIconSize() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.P;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.O;
        }
        return null;
    }

    public float getChipMinHeight() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.G;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.d0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.I;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.J;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.E();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.W;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.j0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.V;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.i0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.U;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.J0;
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        b bVar = this.w;
        if (bVar.o == 1 || bVar.n == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public c.e.a.a.c.g getHideMotionSpec() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.c0;
        }
        return null;
    }

    public float getIconEndPadding() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.f0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.e0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.K;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        return this.f1670k.f1340g.a;
    }

    public c.e.a.a.c.g getShowMotionSpec() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.b0;
        }
        return null;
    }

    public float getTextEndPadding() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.h0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            return bVar.g0;
        }
        return 0.0f;
    }

    public final void h() {
        b bVar;
        if (e()) {
            c.e.a.a.k.b bVar2 = this.f1670k;
            if ((bVar2 != null && bVar2.R) && this.n != null) {
                bVar = this.w;
                o.o(this, bVar);
            }
        }
        bVar = null;
        o.o(this, bVar);
    }

    public final void i() {
        this.f1672m = new RippleDrawable(c.e.a.a.u.a.a(this.f1670k.K), getBackgroundDrawable(), null);
        this.f1670k.n0(false);
        RippleDrawable rippleDrawable = this.f1672m;
        AtomicInteger atomicInteger = o.a;
        setBackground(rippleDrawable);
        j();
    }

    public final void j() {
        c.e.a.a.k.b bVar;
        if (!TextUtils.isEmpty(getText()) && (bVar = this.f1670k) != null) {
            int C = (int) (bVar.C() + bVar.k0 + bVar.h0);
            c.e.a.a.k.b bVar2 = this.f1670k;
            int z2 = (int) (bVar2.z() + bVar2.d0 + bVar2.g0);
            if (this.f1671l != null) {
                Rect rect = new Rect();
                this.f1671l.getPadding(rect);
                z2 += rect.left;
                C += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            AtomicInteger atomicInteger = o.a;
            setPaddingRelative(z2, paddingTop, C, paddingBottom);
        }
    }

    public final void k() {
        TextPaint paint = getPaint();
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            paint.drawableState = bVar.getState();
        }
        c.e.a.a.t.b textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.c(getContext(), paint, this.z);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c.e.a.a.a.u(this, this.f1670k);
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f1668i);
        }
        if (f()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f1669j);
        }
        return onCreateDrawableState;
    }

    public void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        b bVar = this.w;
        int i3 = bVar.o;
        if (i3 != Integer.MIN_VALUE) {
            bVar.k(i3);
        }
        if (z2) {
            bVar.n(i2, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z2 = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z2 = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z2);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((f() || isClickable()) ? f() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i3 = -1;
            if (chipGroup.f1306g) {
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 >= chipGroup.getChildCount()) {
                        i5 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i4) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i4)) == this) {
                            break;
                        }
                        i5++;
                    }
                    i4++;
                }
                i2 = i5;
            } else {
                i2 = -1;
            }
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i3 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b.c.a(i3, 1, i2, 1, false, isChecked()).a);
        }
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.u != i2) {
            this.u = i2;
            j();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0040
            goto L_0x004c
        L_0x0021:
            boolean r0 = r5.q
            if (r0 == 0) goto L_0x004c
            if (r1 != 0) goto L_0x004a
            r5.setCloseIconPressed(r2)
            goto L_0x004a
        L_0x002b:
            boolean r0 = r5.q
            if (r0 == 0) goto L_0x0040
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.n
            if (r0 == 0) goto L_0x0039
            r0.onClick(r5)
        L_0x0039:
            com.google.android.material.chip.Chip$b r0 = r5.w
            r0.u(r3, r3)
            r0 = r3
            goto L_0x0041
        L_0x0040:
            r0 = r2
        L_0x0041:
            r5.setCloseIconPressed(r2)
            goto L_0x004d
        L_0x0045:
            if (r1 == 0) goto L_0x004c
            r5.setCloseIconPressed(r3)
        L_0x004a:
            r0 = r3
            goto L_0x004d
        L_0x004c:
            r0 = r2
        L_0x004d:
            if (r0 != 0) goto L_0x0055
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x0056
        L_0x0055:
            r2 = r3
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1672m) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // g.b.g.g
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1672m) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // g.b.g.g
    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.K(z2);
        }
    }

    public void setCheckableResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.K(bVar.l0.getResources().getBoolean(i2));
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar == null) {
            this.p = z2;
        } else if (bVar.X) {
            boolean isChecked = isChecked();
            super.setChecked(z2);
            if (isChecked != z2 && (onCheckedChangeListener = this.o) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z2);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.L(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.L(g.b.d.a.a.a(bVar.l0, i2));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.M(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            Context context = bVar.l0;
            ThreadLocal<TypedValue> threadLocal = g.b.d.a.a.a;
            bVar.M(context.getColorStateList(i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.N(bVar.l0.getResources().getBoolean(i2));
        }
    }

    public void setCheckedIconVisible(boolean z2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.N(z2);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null && bVar.F != colorStateList) {
            bVar.F = colorStateList;
            bVar.onStateChange(bVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            Context context = bVar.l0;
            ThreadLocal<TypedValue> threadLocal = g.b.d.a.a.a;
            bVar.O(context.getColorStateList(i2));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.P(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.P(bVar.l0.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(c.e.a.a.k.b bVar) {
        c.e.a.a.k.b bVar2 = this.f1670k;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.I0 = new WeakReference<>(null);
            }
            this.f1670k = bVar;
            bVar.K0 = false;
            Objects.requireNonNull(bVar);
            bVar.I0 = new WeakReference<>(this);
            d(this.v);
        }
    }

    public void setChipEndPadding(float f2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null && bVar.k0 != f2) {
            bVar.k0 = f2;
            bVar.invalidateSelf();
            bVar.I();
        }
    }

    public void setChipEndPaddingResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.Q(bVar.l0.getResources().getDimension(i2));
        }
    }

    public void setChipIcon(Drawable drawable) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.R(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.R(g.b.d.a.a.a(bVar.l0, i2));
        }
    }

    public void setChipIconSize(float f2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.S(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.S(bVar.l0.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.T(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            Context context = bVar.l0;
            ThreadLocal<TypedValue> threadLocal = g.b.d.a.a.a;
            bVar.T(context.getColorStateList(i2));
        }
    }

    public void setChipIconVisible(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.U(bVar.l0.getResources().getBoolean(i2));
        }
    }

    public void setChipIconVisible(boolean z2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.U(z2);
        }
    }

    public void setChipMinHeight(float f2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null && bVar.G != f2) {
            bVar.G = f2;
            bVar.invalidateSelf();
            bVar.I();
        }
    }

    public void setChipMinHeightResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.V(bVar.l0.getResources().getDimension(i2));
        }
    }

    public void setChipStartPadding(float f2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null && bVar.d0 != f2) {
            bVar.d0 = f2;
            bVar.invalidateSelf();
            bVar.I();
        }
    }

    public void setChipStartPaddingResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.W(bVar.l0.getResources().getDimension(i2));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.X(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            Context context = bVar.l0;
            ThreadLocal<TypedValue> threadLocal = g.b.d.a.a.a;
            bVar.X(context.getColorStateList(i2));
        }
    }

    public void setChipStrokeWidth(float f2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.Y(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.Y(bVar.l0.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.Z(drawable);
        }
        h();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null && bVar.W != charSequence) {
            g.h.h.a c2 = g.h.h.a.c();
            bVar.W = c2.d(charSequence, c2.f2512h, true);
            bVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.a0(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.a0(bVar.l0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.Z(g.b.d.a.a.a(bVar.l0, i2));
        }
        h();
    }

    public void setCloseIconSize(float f2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.b0(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.b0(bVar.l0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.c0(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.c0(bVar.l0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.e0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            Context context = bVar.l0;
            ThreadLocal<TypedValue> threadLocal = g.b.d.a.a.a;
            bVar.e0(context.getColorStateList(i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    public void setCloseIconVisible(boolean z2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.f0(z2);
        }
        h();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            g.b bVar2 = bVar.f1340g;
            if (bVar2.o != f2) {
                bVar2.o = f2;
                bVar.w();
            }
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1670k != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                c.e.a.a.k.b bVar = this.f1670k;
                if (bVar != null) {
                    bVar.J0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.t = z2;
        d(this.v);
    }

    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(c.e.a.a.c.g gVar) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.c0 = gVar;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.c0 = c.e.a.a.c.g.b(bVar.l0, i2);
        }
    }

    public void setIconEndPadding(float f2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.g0(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.g0(bVar.l0.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.h0(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.h0(bVar.l0.getResources().getDimension(i2));
        }
    }

    public void setLayoutDirection(int i2) {
        if (this.f1670k != null) {
            super.setLayoutDirection(i2);
        }
    }

    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.L0 = i2;
        }
    }

    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.o = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.n = onClickListener;
        h();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.i0(colorStateList);
        }
        if (!this.f1670k.G0) {
            i();
        }
    }

    public void setRippleColorResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            Context context = bVar.l0;
            ThreadLocal<TypedValue> threadLocal = g.b.d.a.a.a;
            bVar.i0(context.getColorStateList(i2));
            if (!this.f1670k.G0) {
                i();
            }
        }
    }

    @Override // c.e.a.a.w.n
    public void setShapeAppearanceModel(j jVar) {
        c.e.a.a.k.b bVar = this.f1670k;
        bVar.f1340g.a = jVar;
        bVar.invalidateSelf();
    }

    public void setShowMotionSpec(c.e.a.a.c.g gVar) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.b0 = gVar;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.b0 = c.e.a.a.c.g.b(bVar.l0, i2);
        }
    }

    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(bVar.K0 ? null : charSequence, bufferType);
            c.e.a.a.k.b bVar2 = this.f1670k;
            if (bVar2 != null) {
                bVar2.j0(charSequence);
            }
        }
    }

    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.k0(new c.e.a.a.t.b(bVar.l0, i2));
        }
        k();
    }

    public void setTextAppearance(c.e.a.a.t.b bVar) {
        c.e.a.a.k.b bVar2 = this.f1670k;
        if (bVar2 != null) {
            bVar2.k0(bVar);
        }
        k();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null && bVar.h0 != f2) {
            bVar.h0 = f2;
            bVar.invalidateSelf();
            bVar.I();
        }
    }

    public void setTextEndPaddingResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.l0(bVar.l0.getResources().getDimension(i2));
        }
    }

    public void setTextStartPadding(float f2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null && bVar.g0 != f2) {
            bVar.g0 = f2;
            bVar.invalidateSelf();
            bVar.I();
        }
    }

    public void setTextStartPaddingResource(int i2) {
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.m0(bVar.l0.getResources().getDimension(i2));
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        c.e.a.a.k.b bVar = this.f1670k;
        if (bVar != null) {
            bVar.k0(new c.e.a.a.t.b(bVar.l0, i2));
        }
        k();
    }
}
