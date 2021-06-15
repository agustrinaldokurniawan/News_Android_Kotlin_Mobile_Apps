package c.e.a.a.z;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import c.e.a.a.r.j;
import c.e.a.a.w.g;
import c.e.a.a.w.j;
import com.google.android.material.textfield.TextInputLayout;
import com.tsuga.news.R;
import java.util.Objects;

public class h extends m {

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f1413d = new a();
    public final View.OnFocusChangeListener e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.e f1414f = new c(this.a);

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.f f1415g = new d();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout.g f1416h = new e();

    /* renamed from: i  reason: collision with root package name */
    public boolean f1417i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1418j = false;

    /* renamed from: k  reason: collision with root package name */
    public long f1419k = Long.MAX_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public StateListDrawable f1420l;

    /* renamed from: m  reason: collision with root package name */
    public g f1421m;
    public AccessibilityManager n;
    public ValueAnimator o;
    public ValueAnimator p;

    public class a extends j {

        /* renamed from: c.e.a.a.z.h$a$a  reason: collision with other inner class name */
        public class RunnableC0045a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView e;

            public RunnableC0045a(AutoCompleteTextView autoCompleteTextView) {
                this.e = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.e.isPopupShowing();
                h.f(h.this, isPopupShowing);
                h.this.f1417i = isPopupShowing;
            }
        }

        public a() {
        }

        @Override // c.e.a.a.r.j
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView d2 = h.d(h.this.a.getEditText());
            if (h.this.n.isTouchExplorationEnabled() && h.e(d2) && !h.this.f1425c.hasFocus()) {
                d2.dismissDropDown();
            }
            d2.post(new RunnableC0045a(d2));
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        public void onFocusChange(View view, boolean z) {
            h.this.a.setEndIconActivated(z);
            if (!z) {
                h.f(h.this, false);
                h.this.f1417i = false;
            }
        }
    }

    public class c extends TextInputLayout.e {
        public c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // g.h.j.a, com.google.android.material.textfield.TextInputLayout.e
        public void d(View view, g.h.j.z.b bVar) {
            boolean z;
            super.d(view, bVar);
            if (!h.e(h.this.a.getEditText())) {
                bVar.b.setClassName(Spinner.class.getName());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                z = bVar.b.isShowingHintText();
            } else {
                Bundle f2 = bVar.f();
                z = f2 != null && (f2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
            }
            if (z) {
                bVar.k(null);
            }
        }

        @Override // g.h.j.a
        public void e(View view, AccessibilityEvent accessibilityEvent) {
            this.b.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView d2 = h.d(h.this.a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && h.this.n.isTouchExplorationEnabled() && !h.e(h.this.a.getEditText())) {
                h.g(h.this, d2);
            }
        }
    }

    public class d implements TextInputLayout.f {
        public d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0104  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0107  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
        @Override // com.google.android.material.textfield.TextInputLayout.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.google.android.material.textfield.TextInputLayout r12) {
            /*
            // Method dump skipped, instructions count: 283
            */
            throw new UnsupportedOperationException("Method not decompiled: c.e.a.a.z.h.d.a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    public class e implements TextInputLayout.g {

        public class a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView e;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.e = autoCompleteTextView;
            }

            public void run() {
                this.e.removeTextChangedListener(h.this.f1413d);
            }
        }

        public e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i2 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == h.this.e) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public void onClick(View view) {
            h.g(h.this, (AutoCompleteTextView) h.this.a.getEditText());
        }
    }

    public h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public static AutoCompleteTextView d(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static boolean e(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static void f(h hVar, boolean z) {
        if (hVar.f1418j != z) {
            hVar.f1418j = z;
            hVar.p.cancel();
            hVar.o.start();
        }
    }

    public static void g(h hVar, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(hVar);
        if (autoCompleteTextView != null) {
            if (hVar.i()) {
                hVar.f1417i = false;
            }
            if (!hVar.f1417i) {
                boolean z = hVar.f1418j;
                boolean z2 = !z;
                if (z != z2) {
                    hVar.f1418j = z2;
                    hVar.p.cancel();
                    hVar.o.start();
                }
                if (hVar.f1418j) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            hVar.f1417i = false;
        }
    }

    @Override // c.e.a.a.z.m
    public void a() {
        float dimensionPixelOffset = (float) this.b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        g h2 = h(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        g h3 = h(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f1421m = h2;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f1420l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, h2);
        this.f1420l.addState(new int[0], h3);
        this.a.setEndIconDrawable(g.b.d.a.a.a(this.b, R.drawable.mtrl_dropdown_arrow));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.a.setEndIconOnClickListener(new f());
        this.a.a(this.f1415g);
        TextInputLayout textInputLayout2 = this.a;
        textInputLayout2.j0.add(this.f1416h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = c.e.a.a.c.a.a;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) 67);
        ofFloat.addUpdateListener(new i(this));
        this.p = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) 50);
        ofFloat2.addUpdateListener(new i(this));
        this.o = ofFloat2;
        ofFloat2.addListener(new l(this));
        this.n = (AccessibilityManager) this.b.getSystemService("accessibility");
    }

    @Override // c.e.a.a.z.m
    public boolean b(int i2) {
        return i2 != 0;
    }

    public final g h(float f2, float f3, float f4, int i2) {
        j.b bVar = new j.b();
        bVar.e = new c.e.a.a.w.a(f2);
        bVar.f1368f = new c.e.a.a.w.a(f2);
        bVar.f1370h = new c.e.a.a.w.a(f3);
        bVar.f1369g = new c.e.a.a.w.a(f3);
        c.e.a.a.w.j a2 = bVar.a();
        Context context = this.b;
        String str = g.e;
        int s = c.e.a.a.a.s(context, R.attr.colorSurface, g.class.getSimpleName());
        g gVar = new g();
        gVar.f1340g.b = new c.e.a.a.o.a(context);
        gVar.w();
        gVar.p(ColorStateList.valueOf(s));
        g.b bVar2 = gVar.f1340g;
        if (bVar2.o != f4) {
            bVar2.o = f4;
            gVar.w();
        }
        gVar.f1340g.a = a2;
        gVar.invalidateSelf();
        g.b bVar3 = gVar.f1340g;
        if (bVar3.f1352i == null) {
            bVar3.f1352i = new Rect();
        }
        gVar.f1340g.f1352i.set(0, i2, 0, i2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final boolean i() {
        long currentTimeMillis = System.currentTimeMillis() - this.f1419k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }
}
