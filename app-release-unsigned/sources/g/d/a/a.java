package g.d.a;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import java.util.Objects;

public class a extends FrameLayout {
    public static final d e = new b();

    /* renamed from: f  reason: collision with root package name */
    public boolean f2211f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2212g;

    public ColorStateList getCardBackgroundColor() {
        c cVar = null;
        e eVar = (e) cVar.c();
        throw null;
    }

    public float getCardElevation() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getMaxCardElevation() {
        c cVar = null;
        float f2 = ((e) cVar.c()).b;
        throw null;
    }

    public boolean getPreventCornerOverlap() {
        return this.f2212g;
    }

    public float getRadius() {
        c cVar = null;
        float f2 = ((e) cVar.c()).a;
        throw null;
    }

    public boolean getUseCompatPadding() {
        return this.f2211f;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        ColorStateList valueOf = ColorStateList.valueOf(i2);
        c cVar = null;
        e eVar = (e) cVar.c();
        Objects.requireNonNull(eVar);
        if (valueOf == null) {
            valueOf = ColorStateList.valueOf(0);
        }
        eVar.e = valueOf;
        valueOf.getColorForState(eVar.getState(), eVar.e.getDefaultColor());
        throw null;
    }

    public void setCardElevation(float f2) {
        throw null;
    }

    public void setMaxCardElevation(float f2) {
        ((b) e).b(null, f2);
        throw null;
    }

    public void setMinimumHeight(int i2) {
        super.setMinimumHeight(i2);
    }

    public void setMinimumWidth(int i2) {
        super.setMinimumWidth(i2);
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f2212g) {
            this.f2212g = z;
            c cVar = null;
            e eVar = (e) cVar.c();
            throw null;
        }
    }

    public void setRadius(float f2) {
        c cVar = null;
        e eVar = (e) cVar.c();
        throw null;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f2211f != z) {
            this.f2211f = z;
            c cVar = null;
            e eVar = (e) cVar.c();
            throw null;
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        c cVar = null;
        e eVar = (e) cVar.c();
        Objects.requireNonNull(eVar);
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        eVar.e = colorStateList;
        colorStateList.getColorForState(eVar.getState(), eVar.e.getDefaultColor());
        throw null;
    }
}
