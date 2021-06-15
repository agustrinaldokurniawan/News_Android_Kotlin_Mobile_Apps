package g.b.g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import g.b.d.a.a;

public class r extends RadioButton {
    public final i e;

    /* renamed from: f  reason: collision with root package name */
    public final e f2148f;

    /* renamed from: g  reason: collision with root package name */
    public final z f2149g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        w0.a(context);
        u0.a(this, getContext());
        i iVar = new i(this);
        this.e = iVar;
        iVar.b(attributeSet, i2);
        e eVar = new e(this);
        this.f2148f = eVar;
        eVar.d(attributeSet, i2);
        z zVar = new z(this);
        this.f2149g = zVar;
        zVar.e(attributeSet, i2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f2148f;
        if (eVar != null) {
            eVar.a();
        }
        z zVar = this.f2149g;
        if (zVar != null) {
            zVar.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.e;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2148f;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2148f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.e;
        if (iVar != null) {
            return iVar.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.e;
        if (iVar != null) {
            return iVar.f2102c;
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2148f;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f2148f;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(a.a(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.e;
        if (iVar == null) {
            return;
        }
        if (iVar.f2104f) {
            iVar.f2104f = false;
            return;
        }
        iVar.f2104f = true;
        iVar.a();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f2148f;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2148f;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.e;
        if (iVar != null) {
            iVar.b = colorStateList;
            iVar.f2103d = true;
            iVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.e;
        if (iVar != null) {
            iVar.f2102c = mode;
            iVar.e = true;
            iVar.a();
        }
    }
}
