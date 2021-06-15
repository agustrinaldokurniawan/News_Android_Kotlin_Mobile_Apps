package g.b.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import g.b.a;
import g.h.b.d;
import g.h.d.c;
import g.h.d.j;
import g.h.h.b;
import g.h.k.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class b0 extends TextView implements b {
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final z f2041f;

    /* renamed from: g  reason: collision with root package name */
    public final y f2042g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2043h;

    /* renamed from: i  reason: collision with root package name */
    public Future<g.h.h.b> f2044i;

    public b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        w0.a(context);
        this.f2043h = false;
        u0.a(this, getContext());
        e eVar = new e(this);
        this.e = eVar;
        eVar.d(attributeSet, i2);
        z zVar = new z(this);
        this.f2041f = zVar;
        zVar.e(attributeSet, i2);
        zVar.b();
        this.f2042g = new y(this);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.e;
        if (eVar != null) {
            eVar.a();
        }
        z zVar = this.f2041f;
        if (zVar != null) {
            zVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        z zVar = this.f2041f;
        if (zVar != null) {
            return Math.round(zVar.f2190i.f2065h);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.a) {
            return super.getAutoSizeMinTextSize();
        }
        z zVar = this.f2041f;
        if (zVar != null) {
            return Math.round(zVar.f2190i.f2064g);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.a) {
            return super.getAutoSizeStepGranularity();
        }
        z zVar = this.f2041f;
        if (zVar != null) {
            return Math.round(zVar.f2190i.f2063f);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        z zVar = this.f2041f;
        return zVar != null ? zVar.f2190i.f2066i : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        z zVar = this.f2041f;
        if (zVar != null) {
            return zVar.f2190i.f2062d;
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        x0 x0Var = this.f2041f.f2189h;
        if (x0Var != null) {
            return x0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        x0 x0Var = this.f2041f.f2189h;
        if (x0Var != null) {
            return x0Var.b;
        }
        return null;
    }

    public CharSequence getText() {
        Future<g.h.h.b> future = this.f2044i;
        if (future != null) {
            try {
                this.f2044i = null;
                d.z(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        y yVar;
        return (Build.VERSION.SDK_INT >= 28 || (yVar = this.f2042g) == null) ? super.getTextClassifier() : yVar.a();
    }

    public b.a getTextMetricsParamsCompat() {
        return d.o(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2041f.g(this, onCreateInputConnection, editorInfo);
        a.e(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        z zVar = this.f2041f;
        if (zVar != null && !g.h.k.b.a) {
            zVar.f2190i.a();
        }
    }

    public void onMeasure(int i2, int i3) {
        Future<g.h.h.b> future = this.f2044i;
        if (future != null) {
            try {
                this.f2044i = null;
                d.z(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i2, i3);
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        z zVar = this.f2041f;
        if (zVar != null && !g.h.k.b.a && zVar.d()) {
            this.f2041f.f2190i.a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (g.h.k.b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        z zVar = this.f2041f;
        if (zVar != null) {
            zVar.h(i2, i3, i4, i5);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (g.h.k.b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        z zVar = this.f2041f;
        if (zVar != null) {
            zVar.i(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (g.h.k.b.a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        z zVar = this.f2041f;
        if (zVar != null) {
            zVar.j(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.e;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.e;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        z zVar = this.f2041f;
        if (zVar != null) {
            zVar.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        z zVar = this.f2041f;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a = i2 != 0 ? g.b.d.a.a.a(context, i2) : null;
        Drawable a2 = i3 != 0 ? g.b.d.a.a.a(context, i3) : null;
        Drawable a3 = i4 != 0 ? g.b.d.a.a.a(context, i4) : null;
        if (i5 != 0) {
            drawable = g.b.d.a.a.a(context, i5);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(a, a2, a3, drawable);
        z zVar = this.f2041f;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a = i2 != 0 ? g.b.d.a.a.a(context, i2) : null;
        Drawable a2 = i3 != 0 ? g.b.d.a.a.a(context, i3) : null;
        Drawable a3 = i4 != 0 ? g.b.d.a.a.a(context, i4) : null;
        if (i5 != 0) {
            drawable = g.b.d.a.a.a(context, i5);
        }
        setCompoundDrawablesWithIntrinsicBounds(a, a2, a3, drawable);
        z zVar = this.f2041f;
        if (zVar != null) {
            zVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d.C(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            d.w(this, i2);
        }
    }

    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            d.x(this, i2);
        }
    }

    public void setLineHeight(int i2) {
        d.y(this, i2);
    }

    public void setPrecomputedText(g.h.h.b bVar) {
        d.z(this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f2041f.k(colorStateList);
        this.f2041f.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f2041f.l(mode);
        this.f2041f.b();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        z zVar = this.f2041f;
        if (zVar != null) {
            zVar.f(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT >= 28 || (yVar = this.f2042g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            yVar.b = textClassifier;
        }
    }

    public void setTextFuture(Future<g.h.h.b> future) {
        this.f2044i = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic = aVar.b;
        int i2 = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i2 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        getPaint().set(aVar.a);
        setBreakStrategy(aVar.f2515c);
        setHyphenationFrequency(aVar.f2516d);
    }

    public void setTextSize(int i2, float f2) {
        boolean z = g.h.k.b.a;
        if (z) {
            super.setTextSize(i2, f2);
            return;
        }
        z zVar = this.f2041f;
        if (zVar != null && !z && !zVar.d()) {
            zVar.f2190i.f(i2, f2);
        }
    }

    public void setTypeface(Typeface typeface, int i2) {
        if (!this.f2043h) {
            Typeface typeface2 = null;
            if (typeface != null && i2 > 0) {
                Context context = getContext();
                j jVar = c.a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i2);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.f2043h = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i2);
            } finally {
                this.f2043h = false;
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        z zVar = this.f2041f;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        z zVar = this.f2041f;
        if (zVar != null) {
            zVar.b();
        }
    }
}
