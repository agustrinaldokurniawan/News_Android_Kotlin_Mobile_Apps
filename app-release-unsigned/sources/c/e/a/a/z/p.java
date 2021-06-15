package c.e.a.a.z;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import c.e.a.a.a0.a.a;
import c.e.a.a.b;
import c.e.a.a.r.k;
import com.google.android.material.textfield.TextInputLayout;
import com.tsuga.news.R;
import g.b.g.d;
import g.b.g.m0;
import java.util.Locale;

public class p extends d {

    /* renamed from: h  reason: collision with root package name */
    public final m0 f1438h;

    /* renamed from: i  reason: collision with root package name */
    public final AccessibilityManager f1439i;

    /* renamed from: j  reason: collision with root package name */
    public final Rect f1440j = new Rect();

    public p(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        Context context2 = getContext();
        TypedArray d2 = k.d(context2, attributeSet, b.f1175k, R.attr.autoCompleteTextViewStyle, 2131821074, new int[0]);
        if (d2.hasValue(0) && d2.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f1439i = (AccessibilityManager) context2.getSystemService("accessibility");
        m0 m0Var = new m0(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f1438h = m0Var;
        m0Var.s(true);
        m0Var.v = this;
        m0Var.F.setInputMethodMode(2);
        m0Var.o(getAdapter());
        m0Var.w = new o(this);
        d2.recycle();
    }

    public static void a(p pVar, Object obj) {
        pVar.setText(pVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public CharSequence getHint() {
        TextInputLayout b = b();
        return (b == null || !b.E) ? super.getHint() : b.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = b();
        if (b != null && b.E && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = b();
            int i4 = 0;
            if (!(adapter == null || b == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                m0 m0Var = this.f1438h;
                int min = Math.min(adapter.getCount(), Math.max(0, !m0Var.b() ? -1 : m0Var.f2132i.getSelectedItemPosition()) + 15);
                View view = null;
                int i5 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        view = null;
                        i4 = itemViewType;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                }
                Drawable i6 = this.f1438h.i();
                if (i6 != null) {
                    i6.getPadding(this.f1440j);
                    Rect rect = this.f1440j;
                    i5 += rect.left + rect.right;
                }
                i4 = b.getEndIconView().getMeasuredWidth() + i5;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i4), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f1438h.o(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f1439i;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f1438h.f();
        }
    }
}
