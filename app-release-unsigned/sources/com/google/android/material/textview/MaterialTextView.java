package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import c.e.a.a.a0.a.a;
import c.e.a.a.b;
import com.tsuga.news.R;
import g.b.g.b0;

public class MaterialTextView extends b0 {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        boolean z = true;
        if (c.e.a.a.a.r(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = b.t;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int e = e(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (!(e == -1 ? false : z)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    c(theme, resourceId);
                }
            }
        }
    }

    public static int e(Context context, TypedArray typedArray, int... iArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < iArr.length && i2 < 0; i3++) {
            int i4 = iArr[i3];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i4, typedValue) || typedValue.type != 2) {
                i2 = typedArray.getDimensionPixelSize(i4, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i2 = dimensionPixelSize;
            }
        }
        return i2;
    }

    public final void c(Resources.Theme theme, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i2, b.s);
        int e = e(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (e >= 0) {
            setLineHeight(e);
        }
    }

    @Override // g.b.g.b0
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (c.e.a.a.a.r(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            c(context.getTheme(), i2);
        }
    }
}
