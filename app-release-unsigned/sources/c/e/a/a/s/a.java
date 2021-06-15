package c.e.a.a.s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c.e.a.a.b;
import c.e.a.a.r.k;
import com.tsuga.news.R;
import g.b.g.r;

public class a extends r {

    /* renamed from: h  reason: collision with root package name */
    public static final int[][] f1315h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f1316i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1317j;

    public a(Context context, AttributeSet attributeSet) {
        super(c.e.a.a.a0.a.a.a(context, attributeSet, R.attr.radioButtonStyle, 2131821195), attributeSet, R.attr.radioButtonStyle);
        Context context2 = getContext();
        TypedArray d2 = k.d(context2, attributeSet, b.q, R.attr.radioButtonStyle, 2131821195, new int[0]);
        if (d2.hasValue(0)) {
            setButtonTintList(c.e.a.a.a.g(context2, d2, 0));
        }
        this.f1317j = d2.getBoolean(1, false);
        d2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1316i == null) {
            int f2 = c.e.a.a.a.f(this, R.attr.colorControlActivated);
            int f3 = c.e.a.a.a.f(this, R.attr.colorOnSurface);
            int f4 = c.e.a.a.a.f(this, R.attr.colorSurface);
            int[][] iArr = f1315h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = c.e.a.a.a.m(f4, f2, 1.0f);
            iArr2[1] = c.e.a.a.a.m(f4, f3, 0.54f);
            iArr2[2] = c.e.a.a.a.m(f4, f3, 0.38f);
            iArr2[3] = c.e.a.a.a.m(f4, f3, 0.38f);
            this.f1316i = new ColorStateList(iArr, iArr2);
        }
        return this.f1316i;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1317j && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f1317j = z;
        setButtonTintList(z ? getMaterialThemeColorsTintList() : null);
    }
}
