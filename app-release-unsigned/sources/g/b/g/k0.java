package g.b.g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import g.b.b;
import g.h.j.o;

public class k0 extends ViewGroup {
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public int f2120f;

    /* renamed from: g  reason: collision with root package name */
    public int f2121g;

    /* renamed from: h  reason: collision with root package name */
    public int f2122h;

    /* renamed from: i  reason: collision with root package name */
    public int f2123i;

    /* renamed from: j  reason: collision with root package name */
    public int f2124j;

    /* renamed from: k  reason: collision with root package name */
    public float f2125k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2126l;

    /* renamed from: m  reason: collision with root package name */
    public int[] f2127m;
    public int[] n;
    public Drawable o;
    public int p;
    public int q;
    public int r;
    public int s;

    public static class a extends LinearLayout.LayoutParams {
        public a(int i2, int i3) {
            super(i2, i3);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public k0(Context context) {
        this(context, null);
    }

    public k0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public k0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int resourceId;
        this.e = true;
        this.f2120f = -1;
        this.f2121g = 0;
        this.f2123i = 8388659;
        int[] iArr = b.f1864m;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        o.n(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        int i3 = obtainStyledAttributes.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = obtainStyledAttributes.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z = obtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f2125k = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f2120f = obtainStyledAttributes.getInt(3, -1);
        this.f2126l = obtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable((!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) ? obtainStyledAttributes.getDrawable(5) : g.b.d.a.a.a(context, resourceId));
        this.r = obtainStyledAttributes.getInt(8, 0);
        this.s = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void f(Canvas canvas, int i2) {
        this.o.setBounds(getPaddingLeft() + this.s, i2, (getWidth() - getPaddingRight()) - this.s, this.q + i2);
        this.o.draw(canvas);
    }

    public void g(Canvas canvas, int i2) {
        this.o.setBounds(i2, getPaddingTop() + this.s, this.p + i2, (getHeight() - getPaddingBottom()) - this.s);
        this.o.draw(canvas);
    }

    public int getBaseline() {
        int i2;
        if (this.f2120f < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f2120f;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.f2121g;
                if (this.f2122h == 1 && (i2 = this.f2123i & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2124j) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2124j;
                    }
                }
                return i4 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
            } else if (this.f2120f == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2120f;
    }

    public Drawable getDividerDrawable() {
        return this.o;
    }

    public int getDividerPadding() {
        return this.s;
    }

    public int getDividerWidth() {
        return this.p;
    }

    public int getGravity() {
        return this.f2123i;
    }

    public int getOrientation() {
        return this.f2122h;
    }

    public int getShowDividers() {
        return this.r;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2125k;
    }

    /* renamed from: h */
    public a generateDefaultLayoutParams() {
        int i2 = this.f2122h;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* renamed from: i */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* renamed from: j */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int k() {
        return 0;
    }

    public int l() {
        return 0;
    }

    public int m() {
        return 0;
    }

    public boolean n(int i2) {
        if (i2 == 0) {
            return (this.r & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.r & 4) != 0;
        }
        if ((this.r & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public void o(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        if (this.o != null) {
            int i5 = 0;
            if (this.f2122h == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i5 < virtualChildCount) {
                    View childAt = getChildAt(i5);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !n(i5))) {
                        f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.q);
                    }
                    i5++;
                }
                if (n(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.q : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean b = f1.b(this);
            while (i5 < virtualChildCount2) {
                View childAt3 = getChildAt(i5);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !n(i5))) {
                    a aVar = (a) childAt3.getLayoutParams();
                    g(canvas, b ? childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.p);
                }
                i5++;
            }
            if (n(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (b) {
                        i4 = childAt4.getLeft();
                        i3 = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    } else {
                        i2 = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                        g(canvas, i2);
                    }
                } else if (b) {
                    i2 = getPaddingLeft();
                    g(canvas, i2);
                } else {
                    i4 = getWidth();
                    i3 = getPaddingRight();
                }
                i2 = (i4 - i3) - this.p;
                g(canvas, i2);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
        // Method dump skipped, instructions count: 490
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.g.k0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02c9, code lost:
        if (r13 < 0) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0760, code lost:
        if (r7 < 0) goto L_0x0762;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0627  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x06ed  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x070a  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x08b5  */
    /* JADX WARNING: Removed duplicated region for block: B:421:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r39, int r40) {
        /*
        // Method dump skipped, instructions count: 2294
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.g.k0.onMeasure(int, int):void");
    }

    public int p() {
        return 0;
    }

    public void setBaselineAligned(boolean z) {
        this.e = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            StringBuilder f2 = c.c.a.a.a.f("base aligned child index out of range (0, ");
            f2.append(getChildCount());
            f2.append(")");
            throw new IllegalArgumentException(f2.toString());
        }
        this.f2120f = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.o) {
            this.o = drawable;
            boolean z = false;
            if (drawable != null) {
                this.p = drawable.getIntrinsicWidth();
                this.q = drawable.getIntrinsicHeight();
            } else {
                this.p = 0;
                this.q = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.s = i2;
    }

    public void setGravity(int i2) {
        if (this.f2123i != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f2123i = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f2123i;
        if ((8388615 & i4) != i3) {
            this.f2123i = i3 | (-8388616 & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f2126l = z;
    }

    public void setOrientation(int i2) {
        if (this.f2122h != i2) {
            this.f2122h = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.r) {
            requestLayout();
        }
        this.r = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f2123i;
        if ((i4 & 112) != i3) {
            this.f2123i = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f2125k = Math.max(0.0f, f2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
