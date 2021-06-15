package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.e.a.a.w.j;
import c.e.a.a.z.m;
import c.e.a.a.z.n;
import com.google.android.material.internal.CheckableImageButton;
import com.tsuga.news.R;
import g.b.g.b0;
import g.b.g.g0;
import g.h.j.o;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class TextInputLayout extends LinearLayout {
    public CharSequence A;
    public ColorStateList A0;
    public final TextView B;
    public int B0;
    public boolean C;
    public int C0;
    public CharSequence D;
    public int D0;
    public boolean E;
    public int E0;
    public c.e.a.a.w.g F;
    public int F0;
    public c.e.a.a.w.g G;
    public boolean G0;
    public j H;
    public final c.e.a.a.r.c H0;
    public final int I;
    public boolean I0;
    public int J;
    public boolean J0;
    public int K;
    public ValueAnimator K0;
    public int L;
    public boolean L0;
    public int M;
    public boolean M0;
    public int N;
    public int O;
    public int P;
    public final Rect Q = new Rect();
    public final Rect R = new Rect();
    public final RectF S = new RectF();
    public Typeface T;
    public final CheckableImageButton U;
    public ColorStateList V;
    public boolean W;
    public PorterDuff.Mode a0;
    public boolean b0;
    public Drawable c0;
    public int d0;
    public final FrameLayout e;
    public View.OnLongClickListener e0;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f1701f;
    public final LinkedHashSet<f> f0 = new LinkedHashSet<>();

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f1702g;
    public int g0 = 0;

    /* renamed from: h  reason: collision with root package name */
    public final FrameLayout f1703h;
    public final SparseArray<m> h0;

    /* renamed from: i  reason: collision with root package name */
    public EditText f1704i;
    public final CheckableImageButton i0;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1705j;
    public final LinkedHashSet<g> j0;

    /* renamed from: k  reason: collision with root package name */
    public final n f1706k = new n(this);
    public ColorStateList k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1707l;
    public boolean l0;

    /* renamed from: m  reason: collision with root package name */
    public int f1708m;
    public PorterDuff.Mode m0;
    public boolean n;
    public boolean n0;
    public TextView o;
    public Drawable o0;
    public int p;
    public int p0;
    public int q;
    public Drawable q0;
    public CharSequence r;
    public View.OnLongClickListener r0;
    public boolean s;
    public View.OnLongClickListener s0;
    public TextView t;
    public final CheckableImageButton t0;
    public ColorStateList u;
    public ColorStateList u0;
    public int v;
    public ColorStateList v0;
    public ColorStateList w;
    public ColorStateList w0;
    public ColorStateList x;
    public int x0;
    public CharSequence y;
    public int y0;
    public final TextView z;
    public int z0;

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.y(!textInputLayout.M0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f1707l) {
                textInputLayout2.t(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.s) {
                textInputLayout3.z(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            TextInputLayout.this.i0.performClick();
            TextInputLayout.this.i0.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            TextInputLayout.this.f1704i.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.H0.o(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends g.h.j.a {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f1709d;

        public e(TextInputLayout textInputLayout) {
            this.f1709d = textInputLayout;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
            if (r3 != null) goto L_0x0088;
         */
        @Override // g.h.j.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(android.view.View r14, g.h.j.z.b r15) {
            /*
            // Method dump skipped, instructions count: 235
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e.d(android.view.View, g.h.j.z.b):void");
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i2);
    }

    public static class h extends g.j.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f1710g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1711h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f1712i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f1713j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f1714k;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new h[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1710g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1711h = parcel.readInt() != 1 ? false : true;
            this.f1712i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1713j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1714k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("TextInputLayout.SavedState{");
            f2.append(Integer.toHexString(System.identityHashCode(this)));
            f2.append(" error=");
            f2.append((Object) this.f1710g);
            f2.append(" hint=");
            f2.append((Object) this.f1712i);
            f2.append(" helperText=");
            f2.append((Object) this.f1713j);
            f2.append(" placeholderText=");
            f2.append((Object) this.f1714k);
            f2.append("}");
            return f2.toString();
        }

        @Override // g.j.a.a
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f2593f, i2);
            TextUtils.writeToParcel(this.f1710g, parcel, i2);
            parcel.writeInt(this.f1711h ? 1 : 0);
            TextUtils.writeToParcel(this.f1712i, parcel, i2);
            TextUtils.writeToParcel(this.f1713j, parcel, i2);
            TextUtils.writeToParcel(this.f1714k, parcel, i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x05bb  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x05cc  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0599  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r32, android.util.AttributeSet r33) {
        /*
        // Method dump skipped, instructions count: 1574
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private m getEndIconDelegate() {
        m mVar = this.h0.get(this.g0);
        return mVar != null ? mVar : this.h0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.t0.getVisibility() == 0) {
            return this.t0;
        }
        if (!j() || !k()) {
            return null;
        }
        return this.i0;
    }

    public static void n(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                n((ViewGroup) childAt, z2);
            }
        }
    }

    public static void q(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        AtomicInteger atomicInteger = o.a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = false;
        int i2 = 1;
        boolean z3 = onLongClickListener != null;
        if (hasOnClickListeners || z3) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z3);
        if (!z2) {
            i2 = 2;
        }
        checkableImageButton.setImportantForAccessibility(i2);
    }

    private void setEditText(EditText editText) {
        if (this.f1704i == null) {
            if (this.g0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f1704i = editText;
            l();
            setTextInputAccessibilityDelegate(new e(this));
            this.H0.q(this.f1704i.getTypeface());
            c.e.a.a.r.c cVar = this.H0;
            float textSize = this.f1704i.getTextSize();
            if (cVar.f1300i != textSize) {
                cVar.f1300i = textSize;
                cVar.k();
            }
            int gravity = this.f1704i.getGravity();
            this.H0.n((gravity & -113) | 48);
            c.e.a.a.r.c cVar2 = this.H0;
            if (cVar2.f1298g != gravity) {
                cVar2.f1298g = gravity;
                cVar2.k();
            }
            this.f1704i.addTextChangedListener(new a());
            if (this.v0 == null) {
                this.v0 = this.f1704i.getHintTextColors();
            }
            if (this.C) {
                if (TextUtils.isEmpty(this.D)) {
                    CharSequence hint = this.f1704i.getHint();
                    this.f1705j = hint;
                    setHint(hint);
                    this.f1704i.setHint((CharSequence) null);
                }
                this.E = true;
            }
            if (this.o != null) {
                t(this.f1704i.getText().length());
            }
            w();
            this.f1706k.b();
            this.f1701f.bringToFront();
            this.f1702g.bringToFront();
            this.f1703h.bringToFront();
            this.t0.bringToFront();
            Iterator<f> it = this.f0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            A();
            D();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            y(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z2) {
        int i2 = 0;
        this.t0.setVisibility(z2 ? 0 : 8);
        FrameLayout frameLayout = this.f1703h;
        if (z2) {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        D();
        if (!j()) {
            v();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.D)) {
            this.D = charSequence;
            c.e.a.a.r.c cVar = this.H0;
            if (charSequence == null || !TextUtils.equals(cVar.w, charSequence)) {
                cVar.w = charSequence;
                cVar.x = null;
                Bitmap bitmap = cVar.z;
                if (bitmap != null) {
                    bitmap.recycle();
                    cVar.z = null;
                }
                cVar.k();
            }
            if (!this.G0) {
                m();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.s != z2) {
            if (z2) {
                b0 b0Var = new b0(getContext(), null);
                this.t = b0Var;
                b0Var.setId(R.id.textinput_placeholder);
                TextView textView = this.t;
                AtomicInteger atomicInteger = o.a;
                textView.setAccessibilityLiveRegion(1);
                setPlaceholderTextAppearance(this.v);
                setPlaceholderTextColor(this.u);
                TextView textView2 = this.t;
                if (textView2 != null) {
                    this.e.addView(textView2);
                    this.t.setVisibility(0);
                }
            } else {
                TextView textView3 = this.t;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                this.t = null;
            }
            this.s = z2;
        }
    }

    public final void A() {
        if (this.f1704i != null) {
            int i2 = 0;
            if (!(this.U.getVisibility() == 0)) {
                EditText editText = this.f1704i;
                AtomicInteger atomicInteger = o.a;
                i2 = editText.getPaddingStart();
            }
            TextView textView = this.z;
            int compoundPaddingTop = this.f1704i.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = this.f1704i.getCompoundPaddingBottom();
            AtomicInteger atomicInteger2 = o.a;
            textView.setPaddingRelative(i2, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void B() {
        this.z.setVisibility((this.y == null || this.G0) ? 8 : 0);
        v();
    }

    public final void C(boolean z2, boolean z3) {
        int defaultColor = this.A0.getDefaultColor();
        int colorForState = this.A0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.A0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z2) {
            this.O = colorForState2;
        } else if (z3) {
            this.O = colorForState;
        } else {
            this.O = defaultColor;
        }
    }

    public final void D() {
        if (this.f1704i != null) {
            int i2 = 0;
            if (!k()) {
                if (!(this.t0.getVisibility() == 0)) {
                    EditText editText = this.f1704i;
                    AtomicInteger atomicInteger = o.a;
                    i2 = editText.getPaddingEnd();
                }
            }
            TextView textView = this.B;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = this.f1704i.getPaddingTop();
            int paddingBottom = this.f1704i.getPaddingBottom();
            AtomicInteger atomicInteger2 = o.a;
            textView.setPaddingRelative(dimensionPixelSize, paddingTop, i2, paddingBottom);
        }
    }

    public final void E() {
        int visibility = this.B.getVisibility();
        int i2 = 0;
        boolean z2 = this.A != null && !this.G0;
        TextView textView = this.B;
        if (!z2) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        if (visibility != this.B.getVisibility()) {
            getEndIconDelegate().c(z2);
        }
        v();
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void F() {
        /*
        // Method dump skipped, instructions count: 254
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.F():void");
    }

    public void a(f fVar) {
        this.f0.add(fVar);
        if (this.f1704i != null) {
            fVar.a(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.e.addView(view, layoutParams2);
            this.e.setLayoutParams(layoutParams);
            x();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    public void b(float f2) {
        if (this.H0.f1295c != f2) {
            if (this.K0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.K0 = valueAnimator;
                valueAnimator.setInterpolator(c.e.a.a.c.a.b);
                this.K0.setDuration(167L);
                this.K0.addUpdateListener(new d());
            }
            this.K0.setFloatValues(this.H0.f1295c, f2);
            this.K0.start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.c():void");
    }

    public final void d() {
        e(this.i0, this.l0, this.k0, this.n0, this.m0);
    }

    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f1704i;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f1705j != null) {
            boolean z2 = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.f1704i.setHint(this.f1705j);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
            } finally {
                this.f1704i.setHint(hint);
                this.E = z2;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i2);
            onProvideAutofillVirtualStructure(viewStructure, i2);
            viewStructure.setChildCount(this.e.getChildCount());
            for (int i3 = 0; i3 < this.e.getChildCount(); i3++) {
                View childAt = this.e.getChildAt(i3);
                ViewStructure newChild = viewStructure.newChild(i3);
                childAt.dispatchProvideAutofillStructure(newChild, i2);
                if (childAt == this.f1704i) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.M0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.M0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.C) {
            c.e.a.a.r.c cVar = this.H0;
            Objects.requireNonNull(cVar);
            int save = canvas.save();
            if (cVar.x != null && cVar.b) {
                cVar.N.getLineLeft(0);
                cVar.E.setTextSize(cVar.B);
                float f2 = cVar.q;
                float f3 = cVar.r;
                float f4 = cVar.A;
                if (f4 != 1.0f) {
                    canvas.scale(f4, f4, f2, f3);
                }
                canvas.translate(f2, f3);
                cVar.N.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        c.e.a.a.w.g gVar = this.G;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.L;
            this.G.draw(canvas);
        }
    }

    public void drawableStateChanged() {
        boolean z2;
        boolean z3;
        ColorStateList colorStateList;
        if (!this.L0) {
            boolean z4 = true;
            this.L0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            c.e.a.a.r.c cVar = this.H0;
            if (cVar != null) {
                cVar.C = drawableState;
                ColorStateList colorStateList2 = cVar.f1303l;
                if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = cVar.f1302k) != null && colorStateList.isStateful())) {
                    cVar.k();
                    z3 = true;
                } else {
                    z3 = false;
                }
                z2 = z3 | false;
            } else {
                z2 = false;
            }
            if (this.f1704i != null) {
                AtomicInteger atomicInteger = o.a;
                if (!isLaidOut() || !isEnabled()) {
                    z4 = false;
                }
                y(z4, false);
            }
            w();
            F();
            if (z2) {
                invalidate();
            }
            this.L0 = false;
        }
    }

    public final void e(CheckableImageButton checkableImageButton, boolean z2, ColorStateList colorStateList, boolean z3, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z2 || z3)) {
            drawable = drawable.mutate();
            if (z2) {
                drawable.setTintList(colorStateList);
            }
            if (z3) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public final int f() {
        float f2;
        if (!this.C) {
            return 0;
        }
        int i2 = this.J;
        if (i2 == 0 || i2 == 1) {
            f2 = this.H0.f();
        } else if (i2 != 2) {
            return 0;
        } else {
            f2 = this.H0.f() / 2.0f;
        }
        return (int) f2;
    }

    public final boolean g() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof c.e.a.a.z.g);
    }

    public int getBaseline() {
        EditText editText = this.f1704i;
        if (editText == null) {
            return super.getBaseline();
        }
        return f() + getPaddingTop() + editText.getBaseline();
    }

    public c.e.a.a.w.g getBoxBackground() {
        int i2 = this.J;
        if (i2 == 1 || i2 == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.P;
    }

    public int getBoxBackgroundMode() {
        return this.J;
    }

    public float getBoxCornerRadiusBottomEnd() {
        c.e.a.a.w.g gVar = this.F;
        return gVar.f1340g.a.f1361h.a(gVar.h());
    }

    public float getBoxCornerRadiusBottomStart() {
        c.e.a.a.w.g gVar = this.F;
        return gVar.f1340g.a.f1360g.a(gVar.h());
    }

    public float getBoxCornerRadiusTopEnd() {
        c.e.a.a.w.g gVar = this.F;
        return gVar.f1340g.a.f1359f.a(gVar.h());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.F.l();
    }

    public int getBoxStrokeColor() {
        return this.z0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.A0;
    }

    public int getBoxStrokeWidth() {
        return this.M;
    }

    public int getBoxStrokeWidthFocused() {
        return this.N;
    }

    public int getCounterMaxLength() {
        return this.f1708m;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f1707l || !this.n || (textView = this.o) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.w;
    }

    public ColorStateList getCounterTextColor() {
        return this.w;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.v0;
    }

    public EditText getEditText() {
        return this.f1704i;
    }

    public CharSequence getEndIconContentDescription() {
        return this.i0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.i0.getDrawable();
    }

    public int getEndIconMode() {
        return this.g0;
    }

    public CheckableImageButton getEndIconView() {
        return this.i0;
    }

    public CharSequence getError() {
        n nVar = this.f1706k;
        if (nVar.f1433k) {
            return nVar.f1432j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1706k.f1435m;
    }

    public int getErrorCurrentTextColors() {
        return this.f1706k.g();
    }

    public Drawable getErrorIconDrawable() {
        return this.t0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f1706k.g();
    }

    public CharSequence getHelperText() {
        n nVar = this.f1706k;
        if (nVar.q) {
            return nVar.p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f1706k.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.H0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.H0.g();
    }

    public ColorStateList getHintTextColor() {
        return this.w0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.i0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.i0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.s) {
            return this.r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.u;
    }

    public CharSequence getPrefixText() {
        return this.y;
    }

    public ColorStateList getPrefixTextColor() {
        return this.z.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.z;
    }

    public CharSequence getStartIconContentDescription() {
        return this.U.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.U.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.A;
    }

    public ColorStateList getSuffixTextColor() {
        return this.B.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.B;
    }

    public Typeface getTypeface() {
        return this.T;
    }

    public final int h(int i2, boolean z2) {
        int compoundPaddingLeft = this.f1704i.getCompoundPaddingLeft() + i2;
        return (this.y == null || z2) ? compoundPaddingLeft : (compoundPaddingLeft - this.z.getMeasuredWidth()) + this.z.getPaddingLeft();
    }

    public final int i(int i2, boolean z2) {
        int compoundPaddingRight = i2 - this.f1704i.getCompoundPaddingRight();
        return (this.y == null || !z2) ? compoundPaddingRight : compoundPaddingRight + (this.z.getMeasuredWidth() - this.z.getPaddingRight());
    }

    public final boolean j() {
        return this.g0 != 0;
    }

    public boolean k() {
        return this.f1703h.getVisibility() == 0 && this.i0.getVisibility() == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l() {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.l():void");
    }

    public final void m() {
        float f2;
        float f3;
        float f4;
        if (g()) {
            RectF rectF = this.S;
            c.e.a.a.r.c cVar = this.H0;
            int width = this.f1704i.getWidth();
            int gravity = this.f1704i.getGravity();
            boolean c2 = cVar.c(cVar.w);
            cVar.y = c2;
            if (gravity == 17 || (gravity & 7) == 1) {
                f4 = ((float) width) / 2.0f;
                f3 = cVar.b() / 2.0f;
            } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? !c2 : c2) {
                f4 = (float) cVar.e.right;
                f3 = cVar.b();
            } else {
                f2 = (float) cVar.e.left;
                rectF.left = f2;
                Rect rect = cVar.e;
                rectF.top = (float) rect.top;
                rectF.right = (gravity != 17 || (gravity & 7) == 1) ? (((float) width) / 2.0f) + (cVar.b() / 2.0f) : ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? !cVar.y : cVar.y) ? (float) rect.right : cVar.b() + f2;
                float f5 = cVar.f() + ((float) cVar.e.top);
                rectF.bottom = f5;
                float f6 = rectF.left;
                float f7 = (float) this.I;
                rectF.left = f6 - f7;
                rectF.top -= f7;
                rectF.right += f7;
                rectF.bottom = f5 + f7;
                rectF.offset((float) (-getPaddingLeft()), (float) (-getPaddingTop()));
                c.e.a.a.z.g gVar = (c.e.a.a.z.g) this.F;
                Objects.requireNonNull(gVar);
                gVar.x(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
            f2 = f4 - f3;
            rectF.left = f2;
            Rect rect2 = cVar.e;
            rectF.top = (float) rect2.top;
            rectF.right = (gravity != 17 || (gravity & 7) == 1) ? (((float) width) / 2.0f) + (cVar.b() / 2.0f) : ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? !cVar.y : cVar.y) ? (float) rect2.right : cVar.b() + f2;
            float f52 = cVar.f() + ((float) cVar.e.top);
            rectF.bottom = f52;
            float f62 = rectF.left;
            float f72 = (float) this.I;
            rectF.left = f62 - f72;
            rectF.top -= f72;
            rectF.right += f72;
            rectF.bottom = f52 + f72;
            rectF.offset((float) (-getPaddingLeft()), (float) (-getPaddingTop()));
            c.e.a.a.z.g gVar2 = (c.e.a.a.z.g) this.F;
            Objects.requireNonNull(gVar2);
            gVar2.x(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public void o() {
        p(this.i0, this.k0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 386
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        EditText editText;
        int max;
        super.onMeasure(i2, i3);
        boolean z2 = false;
        if (this.f1704i != null && this.f1704i.getMeasuredHeight() < (max = Math.max(this.f1702g.getMeasuredHeight(), this.f1701f.getMeasuredHeight()))) {
            this.f1704i.setMinimumHeight(max);
            z2 = true;
        }
        boolean v2 = v();
        if (z2 || v2) {
            this.f1704i.post(new c());
        }
        if (!(this.t == null || (editText = this.f1704i) == null)) {
            this.t.setGravity(editText.getGravity());
            this.t.setPadding(this.f1704i.getCompoundPaddingLeft(), this.f1704i.getCompoundPaddingTop(), this.f1704i.getCompoundPaddingRight(), this.f1704i.getCompoundPaddingBottom());
        }
        A();
        D();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f2593f);
        setError(hVar.f1710g);
        if (hVar.f1711h) {
            this.i0.post(new b());
        }
        setHint(hVar.f1712i);
        setHelperText(hVar.f1713j);
        setPlaceholderText(hVar.f1714k);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f1706k.e()) {
            hVar.f1710g = getError();
        }
        hVar.f1711h = j() && this.i0.isChecked();
        hVar.f1712i = getHint();
        hVar.f1713j = getHelperText();
        hVar.f1714k = getPlaceholderText();
        return hVar;
    }

    public final void p(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public void r(TextView textView, int i2) {
        boolean z2 = true;
        try {
            textView.setTextAppearance(i2);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z2 = false;
            }
        } catch (Exception unused) {
        }
        if (z2) {
            textView.setTextAppearance(2131820851);
            Context context = getContext();
            Object obj = g.h.c.a.a;
            textView.setTextColor(context.getColor(R.color.design_error));
        }
    }

    public final void s() {
        if (this.o != null) {
            EditText editText = this.f1704i;
            t(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.P != i2) {
            this.P = i2;
            this.B0 = i2;
            this.D0 = i2;
            this.E0 = i2;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        Context context = getContext();
        Object obj = g.h.c.a.a;
        setBoxBackgroundColor(context.getColor(i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.B0 = defaultColor;
        this.P = defaultColor;
        this.C0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.D0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.E0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 != this.J) {
            this.J = i2;
            if (this.f1704i != null) {
                l();
            }
        }
    }

    public void setBoxStrokeColor(int i2) {
        if (this.z0 != i2) {
            this.z0 = i2;
            F();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.x0 = colorStateList.getDefaultColor();
            this.F0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.y0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.z0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            F();
        }
        this.z0 = defaultColor;
        F();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            F();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.M = i2;
        F();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.N = i2;
        F();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f1707l != z2) {
            if (z2) {
                b0 b0Var = new b0(getContext(), null);
                this.o = b0Var;
                b0Var.setId(R.id.textinput_counter);
                Typeface typeface = this.T;
                if (typeface != null) {
                    this.o.setTypeface(typeface);
                }
                this.o.setMaxLines(1);
                this.f1706k.a(this.o, 2);
                ((ViewGroup.MarginLayoutParams) this.o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                u();
                s();
            } else {
                this.f1706k.j(this.o, 2);
                this.o = null;
            }
            this.f1707l = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f1708m != i2) {
            if (i2 <= 0) {
                i2 = -1;
            }
            this.f1708m = i2;
            if (this.f1707l) {
                s();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.p != i2) {
            this.p = i2;
            u();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.x != colorStateList) {
            this.x = colorStateList;
            u();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.q != i2) {
            this.q = i2;
            u();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            u();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.v0 = colorStateList;
        this.w0 = colorStateList;
        if (this.f1704i != null) {
            y(false, false);
        }
    }

    public void setEnabled(boolean z2) {
        n(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.i0.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.i0.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i2) {
        setEndIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.i0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i2) {
        setEndIconDrawable(i2 != 0 ? g.b.d.a.a.a(getContext(), i2) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.i0.setImageDrawable(drawable);
        o();
    }

    public void setEndIconMode(int i2) {
        int i3 = this.g0;
        this.g0 = i2;
        Iterator<g> it = this.j0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i3);
        }
        setEndIconVisible(i2 != 0);
        if (getEndIconDelegate().b(this.J)) {
            getEndIconDelegate().a();
            d();
            return;
        }
        StringBuilder f2 = c.c.a.a.a.f("The current box background mode ");
        f2.append(this.J);
        f2.append(" is not supported by the end icon mode ");
        f2.append(i2);
        throw new IllegalStateException(f2.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.i0;
        View.OnLongClickListener onLongClickListener = this.r0;
        checkableImageButton.setOnClickListener(onClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.r0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.i0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.k0 != colorStateList) {
            this.k0 = colorStateList;
            this.l0 = true;
            d();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.m0 != mode) {
            this.m0 = mode;
            this.n0 = true;
            d();
        }
    }

    public void setEndIconVisible(boolean z2) {
        if (k() != z2) {
            this.i0.setVisibility(z2 ? 0 : 8);
            D();
            v();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f1706k.f1433k) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            n nVar = this.f1706k;
            nVar.c();
            nVar.f1432j = charSequence;
            nVar.f1434l.setText(charSequence);
            int i2 = nVar.f1430h;
            if (i2 != 1) {
                nVar.f1431i = 1;
            }
            nVar.l(i2, nVar.f1431i, nVar.k(nVar.f1434l, charSequence));
            return;
        }
        this.f1706k.i();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        n nVar = this.f1706k;
        nVar.f1435m = charSequence;
        TextView textView = nVar.f1434l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        n nVar = this.f1706k;
        if (nVar.f1433k != z2) {
            nVar.c();
            if (z2) {
                b0 b0Var = new b0(nVar.a, null);
                nVar.f1434l = b0Var;
                b0Var.setId(R.id.textinput_error);
                nVar.f1434l.setTextAlignment(5);
                Typeface typeface = nVar.u;
                if (typeface != null) {
                    nVar.f1434l.setTypeface(typeface);
                }
                int i2 = nVar.n;
                nVar.n = i2;
                TextView textView = nVar.f1434l;
                if (textView != null) {
                    nVar.b.r(textView, i2);
                }
                ColorStateList colorStateList = nVar.o;
                nVar.o = colorStateList;
                TextView textView2 = nVar.f1434l;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = nVar.f1435m;
                nVar.f1435m = charSequence;
                TextView textView3 = nVar.f1434l;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                nVar.f1434l.setVisibility(4);
                TextView textView4 = nVar.f1434l;
                AtomicInteger atomicInteger = o.a;
                textView4.setAccessibilityLiveRegion(1);
                nVar.a(nVar.f1434l, 0);
            } else {
                nVar.i();
                nVar.j(nVar.f1434l, 0);
                nVar.f1434l = null;
                nVar.b.w();
                nVar.b.F();
            }
            nVar.f1433k = z2;
        }
    }

    public void setErrorIconDrawable(int i2) {
        setErrorIconDrawable(i2 != 0 ? g.b.d.a.a.a(getContext(), i2) : null);
        p(this.t0, this.u0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.t0;
        View.OnLongClickListener onLongClickListener = this.s0;
        checkableImageButton.setOnClickListener(onClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.s0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.t0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.u0 = colorStateList;
        Drawable drawable = this.t0.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (this.t0.getDrawable() != drawable) {
            this.t0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.t0.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (this.t0.getDrawable() != drawable) {
            this.t0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i2) {
        n nVar = this.f1706k;
        nVar.n = i2;
        TextView textView = nVar.f1434l;
        if (textView != null) {
            nVar.b.r(textView, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        n nVar = this.f1706k;
        nVar.o = colorStateList;
        TextView textView = nVar.f1434l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.I0 != z2) {
            this.I0 = z2;
            y(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.f1706k.q) {
                setHelperTextEnabled(true);
            }
            n nVar = this.f1706k;
            nVar.c();
            nVar.p = charSequence;
            nVar.r.setText(charSequence);
            int i2 = nVar.f1430h;
            if (i2 != 2) {
                nVar.f1431i = 2;
            }
            nVar.l(i2, nVar.f1431i, nVar.k(nVar.r, charSequence));
        } else if (this.f1706k.q) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        n nVar = this.f1706k;
        nVar.t = colorStateList;
        TextView textView = nVar.r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z2) {
        n nVar = this.f1706k;
        if (nVar.q != z2) {
            nVar.c();
            if (z2) {
                b0 b0Var = new b0(nVar.a, null);
                nVar.r = b0Var;
                b0Var.setId(R.id.textinput_helper_text);
                nVar.r.setTextAlignment(5);
                Typeface typeface = nVar.u;
                if (typeface != null) {
                    nVar.r.setTypeface(typeface);
                }
                nVar.r.setVisibility(4);
                TextView textView = nVar.r;
                AtomicInteger atomicInteger = o.a;
                textView.setAccessibilityLiveRegion(1);
                int i2 = nVar.s;
                nVar.s = i2;
                TextView textView2 = nVar.r;
                if (textView2 != null) {
                    textView2.setTextAppearance(i2);
                }
                ColorStateList colorStateList = nVar.t;
                nVar.t = colorStateList;
                TextView textView3 = nVar.r;
                if (!(textView3 == null || colorStateList == null)) {
                    textView3.setTextColor(colorStateList);
                }
                nVar.a(nVar.r, 1);
            } else {
                nVar.c();
                int i3 = nVar.f1430h;
                if (i3 == 2) {
                    nVar.f1431i = 0;
                }
                nVar.l(i3, nVar.f1431i, nVar.k(nVar.r, null));
                nVar.j(nVar.r, 1);
                nVar.r = null;
                nVar.b.w();
                nVar.b.F();
            }
            nVar.q = z2;
        }
    }

    public void setHelperTextTextAppearance(int i2) {
        n nVar = this.f1706k;
        nVar.s = i2;
        TextView textView = nVar.r;
        if (textView != null) {
            textView.setTextAppearance(i2);
        }
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.J0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.C) {
            this.C = z2;
            if (!z2) {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.f1704i.getHint())) {
                    this.f1704i.setHint(this.D);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f1704i.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.f1704i.setHint((CharSequence) null);
                }
                this.E = true;
            }
            if (this.f1704i != null) {
                x();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        c.e.a.a.r.c cVar = this.H0;
        c.e.a.a.t.b bVar = new c.e.a.a.t.b(cVar.a.getContext(), i2);
        ColorStateList colorStateList = bVar.a;
        if (colorStateList != null) {
            cVar.f1303l = colorStateList;
        }
        float f2 = bVar.f1326k;
        if (f2 != 0.0f) {
            cVar.f1301j = f2;
        }
        ColorStateList colorStateList2 = bVar.b;
        if (colorStateList2 != null) {
            cVar.L = colorStateList2;
        }
        cVar.J = bVar.f1321f;
        cVar.K = bVar.f1322g;
        cVar.I = bVar.f1323h;
        cVar.M = bVar.f1325j;
        c.e.a.a.t.a aVar = cVar.v;
        if (aVar != null) {
            aVar.f1318c = true;
        }
        c.e.a.a.r.b bVar2 = new c.e.a.a.r.b(cVar);
        bVar.a();
        cVar.v = new c.e.a.a.t.a(bVar2, bVar.n);
        bVar.b(cVar.a.getContext(), cVar.v);
        cVar.k();
        this.w0 = this.H0.f1303l;
        if (this.f1704i != null) {
            y(false, false);
            x();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.w0 != colorStateList) {
            if (this.v0 == null) {
                c.e.a.a.r.c cVar = this.H0;
                if (cVar.f1303l != colorStateList) {
                    cVar.f1303l = colorStateList;
                    cVar.k();
                }
            }
            this.w0 = colorStateList;
            if (this.f1704i != null) {
                y(false, false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.i0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? g.b.d.a.a.a(getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.i0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        if (z2 && this.g0 != 1) {
            setEndIconMode(1);
        } else if (!z2) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.k0 = colorStateList;
        this.l0 = true;
        d();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.m0 = mode;
        this.n0 = true;
        d();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int i2 = 0;
        if (!this.s || !TextUtils.isEmpty(charSequence)) {
            if (!this.s) {
                setPlaceholderTextEnabled(true);
            }
            this.r = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        EditText editText = this.f1704i;
        if (editText != null) {
            i2 = editText.getText().length();
        }
        z(i2);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.v = i2;
        TextView textView = this.t;
        if (textView != null) {
            textView.setTextAppearance(i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            TextView textView = this.t;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.z.setText(charSequence);
        B();
    }

    public void setPrefixTextAppearance(int i2) {
        this.z.setTextAppearance(i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z2) {
        this.U.setCheckable(z2);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.U.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? g.b.d.a.a.a(getContext(), i2) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.U.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            p(this.U, this.V);
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.U;
        View.OnLongClickListener onLongClickListener = this.e0;
        checkableImageButton.setOnClickListener(onClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.e0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.U;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            this.W = true;
            e(this.U, true, colorStateList, this.b0, this.a0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.a0 != mode) {
            this.a0 = mode;
            this.b0 = true;
            e(this.U, this.W, this.V, true, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        int i2 = 0;
        if ((this.U.getVisibility() == 0) != z2) {
            CheckableImageButton checkableImageButton = this.U;
            if (!z2) {
                i2 = 8;
            }
            checkableImageButton.setVisibility(i2);
            A();
            v();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.A = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.B.setText(charSequence);
        E();
    }

    public void setSuffixTextAppearance(int i2) {
        this.B.setTextAppearance(i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f1704i;
        if (editText != null) {
            o.o(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.T) {
            this.T = typeface;
            this.H0.q(typeface);
            n nVar = this.f1706k;
            if (typeface != nVar.u) {
                nVar.u = typeface;
                TextView textView = nVar.f1434l;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = nVar.r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.o;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    public void t(int i2) {
        boolean z2 = this.n;
        int i3 = this.f1708m;
        String str = null;
        if (i3 == -1) {
            this.o.setText(String.valueOf(i2));
            this.o.setContentDescription(null);
            this.n = false;
        } else {
            this.n = i2 > i3;
            Context context = getContext();
            this.o.setContentDescription(context.getString(this.n ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i2), Integer.valueOf(this.f1708m)));
            if (z2 != this.n) {
                u();
            }
            g.h.h.a c2 = g.h.h.a.c();
            TextView textView = this.o;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i2), Integer.valueOf(this.f1708m));
            g.h.h.c cVar = c2.f2512h;
            if (string != null) {
                str = c2.d(string, cVar, true).toString();
            }
            textView.setText(str);
        }
        if (this.f1704i != null && z2 != this.n) {
            y(false, false);
            F();
            w();
        }
    }

    public final void u() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.o;
        if (textView != null) {
            r(textView, this.n ? this.p : this.q);
            if (!this.n && (colorStateList2 = this.w) != null) {
                this.o.setTextColor(colorStateList2);
            }
            if (this.n && (colorStateList = this.x) != null) {
                this.o.setTextColor(colorStateList);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v() {
        /*
        // Method dump skipped, instructions count: 295
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.v():boolean");
    }

    public void w() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f1704i;
        if (editText != null && this.J == 0 && (background = editText.getBackground()) != null) {
            if (g0.a(background)) {
                background = background.mutate();
            }
            if (this.f1706k.e()) {
                currentTextColor = this.f1706k.g();
            } else if (!this.n || (textView = this.o) == null) {
                background.clearColorFilter();
                this.f1704i.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(g.b.g.j.c(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void x() {
        if (this.J != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            int f2 = f();
            if (f2 != layoutParams.topMargin) {
                layoutParams.topMargin = f2;
                this.e.requestLayout();
            }
        }
    }

    public final void y(boolean z2, boolean z3) {
        c.e.a.a.r.c cVar;
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f1704i;
        int i2 = 0;
        boolean z4 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f1704i;
        boolean z5 = editText2 != null && editText2.hasFocus();
        boolean e2 = this.f1706k.e();
        ColorStateList colorStateList2 = this.v0;
        if (colorStateList2 != null) {
            c.e.a.a.r.c cVar2 = this.H0;
            if (cVar2.f1303l != colorStateList2) {
                cVar2.f1303l = colorStateList2;
                cVar2.k();
            }
            c.e.a.a.r.c cVar3 = this.H0;
            ColorStateList colorStateList3 = this.v0;
            if (cVar3.f1302k != colorStateList3) {
                cVar3.f1302k = colorStateList3;
                cVar3.k();
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.v0;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.F0) : this.F0;
            this.H0.m(ColorStateList.valueOf(colorForState));
            c.e.a.a.r.c cVar4 = this.H0;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (cVar4.f1302k != valueOf) {
                cVar4.f1302k = valueOf;
                cVar4.k();
            }
        } else if (e2) {
            c.e.a.a.r.c cVar5 = this.H0;
            TextView textView2 = this.f1706k.f1434l;
            cVar5.m(textView2 != null ? textView2.getTextColors() : null);
        } else {
            if (this.n && (textView = this.o) != null) {
                cVar = this.H0;
                colorStateList = textView.getTextColors();
            } else if (z5 && (colorStateList = this.w0) != null) {
                cVar = this.H0;
            }
            cVar.m(colorStateList);
        }
        if (z4 || !this.I0 || (isEnabled() && z5)) {
            if (z3 || this.G0) {
                ValueAnimator valueAnimator = this.K0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.K0.cancel();
                }
                if (!z2 || !this.J0) {
                    this.H0.o(1.0f);
                } else {
                    b(1.0f);
                }
                this.G0 = false;
                if (g()) {
                    m();
                }
                EditText editText3 = this.f1704i;
                if (editText3 != null) {
                    i2 = editText3.getText().length();
                }
                z(i2);
                B();
                E();
            }
        } else if (z3 || !this.G0) {
            ValueAnimator valueAnimator2 = this.K0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.K0.cancel();
            }
            if (!z2 || !this.J0) {
                this.H0.o(0.0f);
            } else {
                b(0.0f);
            }
            if (g() && (!((c.e.a.a.z.g) this.F).D.isEmpty()) && g()) {
                ((c.e.a.a.z.g) this.F).x(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.G0 = true;
            TextView textView3 = this.t;
            if (textView3 != null && this.s) {
                textView3.setText((CharSequence) null);
                this.t.setVisibility(4);
            }
            B();
            E();
        }
    }

    public final void z(int i2) {
        if (i2 != 0 || this.G0) {
            TextView textView = this.t;
            if (textView != null && this.s) {
                textView.setText((CharSequence) null);
                this.t.setVisibility(4);
                return;
            }
            return;
        }
        TextView textView2 = this.t;
        if (textView2 != null && this.s) {
            textView2.setText(this.r);
            this.t.setVisibility(0);
            this.t.bringToFront();
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.t0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f1706k.f1433k);
    }
}
