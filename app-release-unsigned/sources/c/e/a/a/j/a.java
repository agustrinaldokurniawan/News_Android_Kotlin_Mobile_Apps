package c.e.a.a.j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c.e.a.a.b;
import c.e.a.a.r.k;
import com.tsuga.news.R;
import g.b.g.g;

public class a extends g {

    /* renamed from: h  reason: collision with root package name */
    public static final int[][] f1223h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f1224i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1225j;

    public a(Context context, AttributeSet attributeSet) {
        super(c.e.a.a.a0.a.a.a(context, attributeSet, R.attr.checkboxStyle, 2131821194), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray d2 = k.d(context2, attributeSet, b.p, R.attr.checkboxStyle, 2131821194, new int[0]);
        if (d2.hasValue(0)) {
            setButtonTintList(c.e.a.a.a.g(context2, d2, 0));
        }
        this.f1225j = d2.getBoolean(1, false);
        d2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1224i == null) {
            int[][] iArr = f1223h;
            int[] iArr2 = new int[iArr.length];
            int f2 = c.e.a.a.a.f(this, R.attr.colorControlActivated);
            int f3 = c.e.a.a.a.f(this, R.attr.colorSurface);
            int f4 = c.e.a.a.a.f(this, R.attr.colorOnSurface);
            iArr2[0] = c.e.a.a.a.m(f3, f2, 1.0f);
            iArr2[1] = c.e.a.a.a.m(f3, f4, 0.54f);
            iArr2[2] = c.e.a.a.a.m(f3, f4, 0.38f);
            iArr2[3] = c.e.a.a.a.m(f3, f4, 0.38f);
            this.f1224i = new ColorStateList(iArr, iArr2);
        }
        return this.f1224i;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1225j && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f1225j = z;
        setButtonTintList(z ? getMaterialThemeColorsTintList() : null);
    }
}
