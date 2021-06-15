package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.e.a.a.b;
import com.tsuga.news.R;
import g.h.j.o;
import java.util.concurrent.atomic.AtomicInteger;

public class SnackbarContentLayout extends LinearLayout {
    public TextView e;

    /* renamed from: f  reason: collision with root package name */
    public Button f1696f;

    /* renamed from: g  reason: collision with root package name */
    public int f1697g;

    /* renamed from: h  reason: collision with root package name */
    public int f1698h;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.y);
        this.f1697g = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f1698h = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }

    public final boolean a(int i2, int i3, int i4) {
        boolean z;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z = true;
        } else {
            z = false;
        }
        if (this.e.getPaddingTop() == i3 && this.e.getPaddingBottom() == i4) {
            return z;
        }
        TextView textView = this.e;
        AtomicInteger atomicInteger = o.a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i3, textView.getPaddingEnd(), i4);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        return true;
    }

    public Button getActionView() {
        return this.f1696f;
    }

    public TextView getMessageView() {
        return this.e;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.e = (TextView) findViewById(R.id.snackbar_text);
        this.f1696f = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (a(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (a(0, r0, r0) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f1698h = i2;
    }
}
