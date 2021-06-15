package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import c.e.a.a.b;
import c.e.a.a.b0.c;
import com.google.android.material.timepicker.ClockHandView;
import com.tsuga.news.R;
import g.h.j.a;
import g.h.j.o;
import g.h.j.z.b;
import java.util.Arrays;

public class ClockFaceView extends c implements ClockHandView.c {
    public final ClockHandView A;
    public final Rect B = new Rect();
    public final RectF C = new RectF();
    public final SparseArray<TextView> D;
    public final a E;
    public final int[] F;
    public final float[] G;
    public final int H;
    public String[] I;
    public float J;
    public final ColorStateList K;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.D = sparseArray;
        this.G = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.e, R.attr.materialClockStyle, 2131821254);
        Resources resources = getResources();
        ColorStateList g2 = c.e.a.a.a.g(context, obtainStyledAttributes, 1);
        this.K = g2;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.A = clockHandView;
        this.H = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = g2.getColorForState(new int[]{16842913}, g2.getDefaultColor());
        this.F = new int[]{colorForState, colorForState, g2.getDefaultColor()};
        clockHandView.f1723k.add(this);
        ThreadLocal<TypedValue> threadLocal = g.b.d.a.a.a;
        int defaultColor = context.getColorStateList(R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList g3 = c.e.a.a.a.g(context, obtainStyledAttributes, 0);
        setBackgroundColor(g3 != null ? g3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new c.e.a.a.b0.a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.E = new c.e.a.a.b0.b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.I = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i2 = 0; i2 < Math.max(this.I.length, size); i2++) {
            TextView textView = this.D.get(i2);
            if (i2 >= this.I.length) {
                removeView(textView);
                this.D.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.D.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.I[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                o.o(textView, this.E);
                textView.setTextColor(this.K);
            }
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void a(float f2, boolean z) {
        if (Math.abs(this.J - f2) > 0.001f) {
            this.J = f2;
            l();
        }
    }

    public final void l() {
        RectF rectF = this.A.o;
        for (int i2 = 0; i2 < this.D.size(); i2++) {
            TextView textView = this.D.get(i2);
            if (textView != null) {
                textView.getDrawingRect(this.B);
                this.B.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.B);
                this.C.set(this.B);
                textView.getPaint().setShader(!RectF.intersects(rectF, this.C) ? null : new RadialGradient(rectF.centerX() - this.C.left, rectF.centerY() - this.C.top, 0.5f * rectF.width(), this.F, this.G, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0078b.a(1, this.I.length, false, 1).a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        l();
    }
}
