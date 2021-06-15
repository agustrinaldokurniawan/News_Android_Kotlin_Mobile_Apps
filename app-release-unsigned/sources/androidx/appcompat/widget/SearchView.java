package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsuga.news.R;
import g.b.g.f1;
import g.b.g.k0;
import g.b.g.t0;
import g.b.g.z0;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class SearchView extends k0 implements g.b.f.b {
    public static final n t = (Build.VERSION.SDK_INT < 29 ? new n() : null);
    public final ImageView A;
    public final ImageView B;
    public final View C;
    public p D;
    public Rect E;
    public Rect F;
    public int[] G;
    public int[] H;
    public final ImageView I;
    public final Drawable J;
    public final int K;
    public final int L;
    public final Intent M;
    public final Intent N;
    public final CharSequence O;
    public l P;
    public k Q;
    public View.OnFocusChangeListener R;
    public m S;
    public View.OnClickListener T;
    public boolean U;
    public boolean V;
    public g.i.a.a W;
    public boolean a0;
    public CharSequence b0;
    public boolean c0;
    public boolean d0;
    public int e0;
    public boolean f0;
    public CharSequence g0;
    public CharSequence h0;
    public boolean i0;
    public int j0;
    public SearchableInfo k0;
    public Bundle l0;
    public final Runnable m0;
    public Runnable n0;
    public final WeakHashMap<String, Drawable.ConstantState> o0;
    public final View.OnClickListener p0;
    public View.OnKeyListener q0;
    public final TextView.OnEditorActionListener r0;
    public final AdapterView.OnItemClickListener s0;
    public final AdapterView.OnItemSelectedListener t0;
    public final SearchAutoComplete u;
    public TextWatcher u0;
    public final View v;
    public final View w;
    public final View x;
    public final ImageView y;
    public final ImageView z;

    public static class SearchAutoComplete extends g.b.g.d {

        /* renamed from: h  reason: collision with root package name */
        public int f97h = getThreshold();

        /* renamed from: i  reason: collision with root package name */
        public SearchView f98i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f99j;

        /* renamed from: k  reason: collision with root package name */
        public final Runnable f100k = new a();

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f99j) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f99j = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            n nVar = SearchView.t;
            Objects.requireNonNull(nVar);
            n.a();
            Method method = nVar.f101c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        public boolean enoughToFilter() {
            return this.f97h <= 0 || super.enoughToFilter();
        }

        @Override // g.b.g.d
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f99j) {
                removeCallbacks(this.f100k);
                post(this.f100k);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i2, Rect rect) {
            super.onFocusChanged(z, i2, rect);
            SearchView searchView = this.f98i;
            searchView.G(searchView.V);
            searchView.post(searchView.m0);
            if (searchView.u.hasFocus()) {
                searchView.s();
            }
        }

        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f98i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f98i.hasFocus() && getVisibility() == 0) {
                boolean z2 = true;
                this.f99j = true;
                Context context = getContext();
                n nVar = SearchView.t;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z2 = false;
                }
                if (z2) {
                    a();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f99j = false;
                removeCallbacks(this.f100k);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f99j = false;
                removeCallbacks(this.f100k);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f99j = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f98i = searchView;
        }

        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f97h = i2;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.u.getText();
            searchView.h0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.F(z);
            searchView.H(!z);
            searchView.B();
            searchView.E();
            if (searchView.P != null && !TextUtils.equals(charSequence, searchView.g0)) {
                searchView.P.a(charSequence.toString());
            }
            searchView.g0 = charSequence.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            SearchView.this.C();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            g.i.a.a aVar = SearchView.this.W;
            if (aVar instanceof t0) {
                aVar.b(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.R;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            SearchView searchView = SearchView.this;
            if (searchView.C.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.w.getPaddingLeft();
                Rect rect = new Rect();
                boolean b = f1.b(searchView);
                int dimensionPixelSize = searchView.U ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                searchView.u.getDropDownBackground().getPadding(rect);
                searchView.u.setDropDownHorizontalOffset(b ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.u.setDropDownWidth((((searchView.C.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.y) {
                searchView.y();
            } else if (view == searchView.A) {
                searchView.u();
            } else if (view == searchView.z) {
                searchView.z();
            } else if (view == searchView.B) {
                SearchableInfo searchableInfo = searchView.k0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.M);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.r(searchView.N, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchView.u) {
                searchView.s();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.k0 == null) {
                return false;
            }
            if (searchView.u.isPopupShowing() && SearchView.this.u.getListSelection() != -1) {
                return SearchView.this.A(i2, keyEvent);
            }
            if ((TextUtils.getTrimmedLength(SearchView.this.u.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.t(0, null, searchView2.u.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.z();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.v(i2);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.w(i2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean a();
    }

    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    public interface m {
        boolean a(int i2);

        boolean b(int i2);
    }

    public static class n {
        public Method a = null;
        public Method b = null;

        /* renamed from: c  reason: collision with root package name */
        public Method f101c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public n() {
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f101c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class o extends g.j.a.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public boolean f102g;

        public class a implements Parcelable.ClassLoaderCreator<o> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new o[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f102g = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("SearchView.SavedState{");
            f2.append(Integer.toHexString(System.identityHashCode(this)));
            f2.append(" isIconified=");
            f2.append(this.f102g);
            f2.append("}");
            return f2.toString();
        }

        @Override // g.j.a.a
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f2593f, i2);
            parcel.writeValue(Boolean.valueOf(this.f102g));
        }
    }

    public static class p extends TouchDelegate {
        public final View a;
        public final Rect b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public final Rect f103c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        public final Rect f104d = new Rect();
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f105f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.f104d.set(rect);
            Rect rect3 = this.f104d;
            int i2 = this.e;
            rect3.inset(-i2, -i2);
            this.f103c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
            // Method dump skipped, instructions count: 113
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new int[2];
        this.H = new int[2];
        this.m0 = new b();
        this.n0 = new c();
        this.o0 = new WeakHashMap<>();
        f fVar = new f();
        this.p0 = fVar;
        this.q0 = new g();
        h hVar = new h();
        this.r0 = hVar;
        i iVar = new i();
        this.s0 = iVar;
        j jVar = new j();
        this.t0 = jVar;
        this.u0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.b.b.t, i2, 0);
        z0 z0Var = new z0(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(z0Var.l(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.u = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.v = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.w = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.x = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.y = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.z = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.A = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.B = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.I = imageView5;
        Drawable g2 = z0Var.g(10);
        AtomicInteger atomicInteger = g.h.j.o.a;
        findViewById.setBackground(g2);
        findViewById2.setBackground(z0Var.g(14));
        imageView.setImageDrawable(z0Var.g(13));
        imageView2.setImageDrawable(z0Var.g(7));
        imageView3.setImageDrawable(z0Var.g(4));
        imageView4.setImageDrawable(z0Var.g(16));
        imageView5.setImageDrawable(z0Var.g(13));
        this.J = z0Var.g(12);
        g.b.a.f(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.K = z0Var.l(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.L = z0Var.l(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.u0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.q0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(z0Var.a(8, true));
        int f2 = z0Var.f(1, -1);
        if (f2 != -1) {
            setMaxWidth(f2);
        }
        this.O = z0Var.n(6);
        this.b0 = z0Var.n(11);
        int j2 = z0Var.j(3, -1);
        if (j2 != -1) {
            setImeOptions(j2);
        }
        int j3 = z0Var.j(2, -1);
        if (j3 != -1) {
            setInputType(j3);
        }
        setFocusable(z0Var.a(0, true));
        obtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.M = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.N = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.C = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        G(this.U);
        D();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.u.setText(charSequence);
        this.u.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public boolean A(int i2, KeyEvent keyEvent) {
        if (this.k0 != null && this.W != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return v(this.u.getListSelection());
            }
            if (i2 == 21 || i2 == 22) {
                this.u.setSelection(i2 == 21 ? 0 : this.u.length());
                this.u.setListSelection(0);
                this.u.clearListSelection();
                this.u.a();
                return true;
            } else if (i2 != 19 || this.u.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    public final void B() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.u.getText());
        int i2 = 0;
        if (!z3 && (!this.U || this.i0)) {
            z2 = false;
        }
        ImageView imageView = this.A;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.A.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void C() {
        int[] iArr = this.u.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.w.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void D() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.u;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.U && this.J != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            this.J.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.J), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void E() {
        int i2 = 0;
        if (!((this.a0 || this.f0) && !this.V) || !(this.z.getVisibility() == 0 || this.B.getVisibility() == 0)) {
            i2 = 8;
        }
        this.x.setVisibility(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.f0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.a0
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.f0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.V
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.f0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.z
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.F(boolean):void");
    }

    public final void G(boolean z2) {
        this.V = z2;
        int i2 = 0;
        int i3 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.u.getText());
        this.y.setVisibility(i3);
        F(z3);
        this.v.setVisibility(z2 ? 8 : 0);
        if (this.I.getDrawable() == null || this.U) {
            i2 = 8;
        }
        this.I.setVisibility(i2);
        B();
        H(!z3);
        E();
    }

    public final void H(boolean z2) {
        int i2 = 8;
        if (this.f0 && !this.V && z2) {
            this.z.setVisibility(8);
            i2 = 0;
        }
        this.B.setVisibility(i2);
    }

    @Override // g.b.f.b
    public void c() {
        if (!this.i0) {
            this.i0 = true;
            int imeOptions = this.u.getImeOptions();
            this.j0 = imeOptions;
            this.u.setImeOptions(imeOptions | 33554432);
            this.u.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.d0 = true;
        super.clearFocus();
        this.u.clearFocus();
        this.u.setImeVisibility(false);
        this.d0 = false;
    }

    @Override // g.b.f.b
    public void e() {
        this.u.setText("");
        SearchAutoComplete searchAutoComplete = this.u;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.h0 = "";
        clearFocus();
        G(true);
        this.u.setImeOptions(this.j0);
        this.i0 = false;
    }

    public int getImeOptions() {
        return this.u.getImeOptions();
    }

    public int getInputType() {
        return this.u.getInputType();
    }

    public int getMaxWidth() {
        return this.e0;
    }

    public CharSequence getQuery() {
        return this.u.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.b0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.k0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.O : getContext().getText(this.k0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.L;
    }

    public int getSuggestionRowLayout() {
        return this.K;
    }

    public g.i.a.a getSuggestionsAdapter() {
        return this.W;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.m0);
        post(this.n0);
        super.onDetachedFromWindow();
    }

    @Override // g.b.g.k0
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            SearchAutoComplete searchAutoComplete = this.u;
            Rect rect = this.E;
            searchAutoComplete.getLocationInWindow(this.G);
            getLocationInWindow(this.H);
            int[] iArr = this.G;
            int i6 = iArr[1];
            int[] iArr2 = this.H;
            int i7 = i6 - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            Rect rect2 = this.F;
            Rect rect3 = this.E;
            rect2.set(rect3.left, 0, rect3.right, i5 - i3);
            p pVar = this.D;
            if (pVar == null) {
                p pVar2 = new p(this.F, this.E, this.u);
                this.D = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.F, this.E);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 <= 0) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    @Override // g.b.g.k0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.V
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r4, r5)
            return
        L_0x0008:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002a
            if (r0 == 0) goto L_0x0020
            if (r0 == r2) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            int r0 = r3.e0
            if (r0 <= 0) goto L_0x0037
            goto L_0x002e
        L_0x0020:
            int r4 = r3.e0
            if (r4 <= 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            int r4 = r3.getPreferredWidth()
            goto L_0x0037
        L_0x002a:
            int r0 = r3.e0
            if (r0 <= 0) goto L_0x002f
        L_0x002e:
            goto L_0x0033
        L_0x002f:
            int r0 = r3.getPreferredWidth()
        L_0x0033:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0037:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x0049
            if (r0 == 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            int r5 = r3.getPreferredHeight()
            goto L_0x0051
        L_0x0049:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0051:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.f2593f);
        G(oVar.f102g);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f102g = this.V;
        return oVar;
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.m0);
    }

    public final Intent q(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.h0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.l0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.k0.getSearchActivity());
        return intent;
    }

    public final Intent r(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.l0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i2 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (this.d0 || !isFocusable()) {
            return false;
        }
        if (this.V) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.u.requestFocus(i2, rect);
        if (requestFocus) {
            G(false);
        }
        return requestFocus;
    }

    public void s() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.u.refreshAutoCompleteResults();
            return;
        }
        n nVar = t;
        SearchAutoComplete searchAutoComplete = this.u;
        Objects.requireNonNull(nVar);
        n.a();
        Method method = nVar.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        n nVar2 = t;
        SearchAutoComplete searchAutoComplete2 = this.u;
        Objects.requireNonNull(nVar2);
        n.a();
        Method method2 = nVar2.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.l0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            u();
        } else {
            y();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.U != z2) {
            this.U = z2;
            G(z2);
            D();
        }
    }

    public void setImeOptions(int i2) {
        this.u.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.u.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.e0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.Q = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.R = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.P = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.T = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.S = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.b0 = charSequence;
        D();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.c0 = z2;
        g.i.a.a aVar = this.W;
        if (aVar instanceof t0) {
            ((t0) aVar).v = z2 ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.a0 = z2;
        G(this.V);
    }

    public void setSuggestionsAdapter(g.i.a.a aVar) {
        this.W = aVar;
        this.u.setAdapter(aVar);
    }

    public void t(int i2, String str, String str2) {
        getContext().startActivity(q("android.intent.action.SEARCH", null, null, str2, i2, null));
    }

    public void u() {
        if (!TextUtils.isEmpty(this.u.getText())) {
            this.u.setText("");
            this.u.requestFocus();
            this.u.setImeVisibility(true);
        } else if (this.U) {
            k kVar = this.Q;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                G(true);
            }
        }
    }

    public boolean v(int i2) {
        int i3;
        String h2;
        m mVar = this.S;
        if (mVar != null && mVar.b(i2)) {
            return false;
        }
        Cursor cursor = this.W.f2586g;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                int i4 = t0.p;
                String h3 = t0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h3 == null) {
                    h3 = this.k0.getSuggestIntentAction();
                }
                if (h3 == null) {
                    h3 = "android.intent.action.SEARCH";
                }
                String h4 = t0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h4 == null) {
                    h4 = this.k0.getSuggestIntentData();
                }
                if (!(h4 == null || (h2 = t0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    h4 = h4 + "/" + Uri.encode(h2);
                }
                intent = q(h3, h4 == null ? null : Uri.parse(h4), t0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), t0.h(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
            } catch (RuntimeException e2) {
                try {
                    i3 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i3 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        this.u.setImeVisibility(false);
        this.u.dismissDropDown();
        return true;
    }

    public boolean w(int i2) {
        CharSequence c2;
        m mVar = this.S;
        if (mVar != null && mVar.a(i2)) {
            return false;
        }
        Editable text = this.u.getText();
        Cursor cursor = this.W.f2586g;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i2) || (c2 = this.W.c(cursor)) == null) {
            setQuery(text);
            return true;
        }
        setQuery(c2);
        return true;
    }

    public void x(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void y() {
        G(false);
        this.u.requestFocus();
        this.u.setImeVisibility(true);
        View.OnClickListener onClickListener = this.T;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void z() {
        Editable text = this.u.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            l lVar = this.P;
            if (lVar == null || !lVar.b(text.toString())) {
                if (this.k0 != null) {
                    t(0, null, text.toString());
                }
                this.u.setImeVisibility(false);
                this.u.dismissDropDown();
            }
        }
    }
}
