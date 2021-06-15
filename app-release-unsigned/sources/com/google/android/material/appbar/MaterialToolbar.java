package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import c.e.a.a.a0.a.a;
import c.e.a.a.b;
import c.e.a.a.r.k;
import c.e.a.a.w.g;
import com.tsuga.news.R;
import g.h.j.o;
import java.util.concurrent.atomic.AtomicInteger;

public class MaterialToolbar extends Toolbar {
    public Integer R;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, 2131821259), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        int i2 = 0;
        TypedArray d2 = k.d(context2, attributeSet, b.u, R.attr.toolbarStyle, 2131821259, new int[0]);
        if (d2.hasValue(0)) {
            setNavigationIconTint(d2.getColor(0, -1));
        }
        d2.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.p(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i2));
            gVar.f1340g.b = new c.e.a.a.o.a(context2);
            gVar.w();
            AtomicInteger atomicInteger = o.a;
            gVar.o(getElevation());
            setBackground(gVar);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            c.e.a.a.a.u(this, (g) background);
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        c.e.a.a.a.t(this, f2);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        Integer num;
        if (!(drawable == null || (num = this.R) == null)) {
            drawable.setTint(num.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.R = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }
}
