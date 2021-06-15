package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import g.b.g.i0;

public class FitWindowsFrameLayout extends FrameLayout {
    public i0 e;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        i0 i0Var = this.e;
        if (i0Var != null) {
            i0Var.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(i0 i0Var) {
        this.e = i0Var;
    }
}
