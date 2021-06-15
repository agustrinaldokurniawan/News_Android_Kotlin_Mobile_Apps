package g.f.d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import g.f.c.i.k;

public abstract class j extends b {

    /* renamed from: l  reason: collision with root package name */
    public boolean f2450l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2451m;

    public j(Context context) {
        super(context);
    }

    @Override // g.f.d.b
    public void f(AttributeSet attributeSet) {
        super.f(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 6) {
                    this.f2450l = true;
                } else if (index == 13) {
                    this.f2451m = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void l(k kVar, int i2, int i3) {
    }

    @Override // g.f.d.b
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f2450l || this.f2451m) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.f2398f; i2++) {
                View d2 = constraintLayout.d(this.e[i2]);
                if (d2 != null) {
                    if (this.f2450l) {
                        d2.setVisibility(visibility);
                    }
                    if (this.f2451m && elevation > 0.0f) {
                        d2.setTranslationZ(d2.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        d();
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        d();
    }
}
