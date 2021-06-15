package g.b.g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.tsuga.news.R;
import g.b.a;

public class o extends MultiAutoCompleteTextView {
    public static final int[] e = {16843126};

    /* renamed from: f  reason: collision with root package name */
    public final e f2138f;

    /* renamed from: g  reason: collision with root package name */
    public final z f2139g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        w0.a(context);
        u0.a(this, getContext());
        z0 q = z0.q(getContext(), attributeSet, e, R.attr.autoCompleteTextViewStyle, 0);
        if (q.o(0)) {
            setDropDownBackgroundDrawable(q.g(0));
        }
        q.b.recycle();
        e eVar = new e(this);
        this.f2138f = eVar;
        eVar.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        z zVar = new z(this);
        this.f2139g = zVar;
        zVar.e(attributeSet, R.attr.autoCompleteTextViewStyle);
        zVar.b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f2138f;
        if (eVar != null) {
            eVar.a();
        }
        z zVar = this.f2139g;
        if (zVar != null) {
            zVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2138f;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2138f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.e(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2138f;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f2138f;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(g.b.d.a.a.a(getContext(), i2));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f2138f;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2138f;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        z zVar = this.f2139g;
        if (zVar != null) {
            zVar.f(context, i2);
        }
    }
}
