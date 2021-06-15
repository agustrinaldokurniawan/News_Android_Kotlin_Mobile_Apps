package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.tsuga.news.R;
import g.b.c.s;
import g.b.f.g;
import g.b.f.i.m;
import g.b.g.e0;
import g.b.g.f0;
import g.h.j.h;
import g.h.j.i;
import g.h.j.j;
import g.h.j.o;
import g.h.j.y;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements e0, h, i {
    public static final int[] e = {R.attr.actionBarSize, 16842841};
    public y A;
    public y B;
    public y C;
    public d D;
    public OverScroller E;
    public ViewPropertyAnimator F;
    public final AnimatorListenerAdapter G;
    public final Runnable H;
    public final Runnable I;
    public final j J;

    /* renamed from: f  reason: collision with root package name */
    public int f78f;

    /* renamed from: g  reason: collision with root package name */
    public int f79g = 0;

    /* renamed from: h  reason: collision with root package name */
    public ContentFrameLayout f80h;

    /* renamed from: i  reason: collision with root package name */
    public ActionBarContainer f81i;

    /* renamed from: j  reason: collision with root package name */
    public f0 f82j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f83k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f84l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f85m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public final Rect s = new Rect();
    public final Rect t = new Rect();
    public final Rect u = new Rect();
    public final Rect v = new Rect();
    public final Rect w = new Rect();
    public final Rect x = new Rect();
    public final Rect y = new Rect();
    public y z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = null;
            actionBarOverlayLayout.p = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = null;
            actionBarOverlayLayout.p = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = actionBarOverlayLayout.f81i.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.G);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = actionBarOverlayLayout.f81i.animate().translationY((float) (-ActionBarOverlayLayout.this.f81i.getHeight())).setListener(ActionBarOverlayLayout.this.G);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        y yVar = y.a;
        this.z = yVar;
        this.A = yVar;
        this.B = yVar;
        this.C = yVar;
        this.G = new a();
        this.H = new b();
        this.I = new c();
        r(context);
        this.J = new j();
    }

    @Override // g.b.g.e0
    public void a(Menu menu, m.a aVar) {
        s();
        this.f82j.a(menu, aVar);
    }

    @Override // g.b.g.e0
    public boolean b() {
        s();
        return this.f82j.b();
    }

    @Override // g.b.g.e0
    public boolean c() {
        s();
        return this.f82j.c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // g.h.j.h
    public void d(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f83k != null && !this.f84l) {
            if (this.f81i.getVisibility() == 0) {
                i2 = (int) (this.f81i.getTranslationY() + ((float) this.f81i.getBottom()) + 0.5f);
            } else {
                i2 = 0;
            }
            this.f83k.setBounds(0, i2, getWidth(), this.f83k.getIntrinsicHeight() + i2);
            this.f83k.draw(canvas);
        }
    }

    @Override // g.b.g.e0
    public boolean e() {
        s();
        return this.f82j.e();
    }

    @Override // g.b.g.e0
    public boolean f() {
        s();
        return this.f82j.f();
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // g.b.g.e0
    public void g() {
        s();
        this.f82j.g();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f81i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.J.a();
    }

    public CharSequence getTitle() {
        s();
        return this.f82j.getTitle();
    }

    @Override // g.b.g.e0
    public boolean h() {
        s();
        return this.f82j.h();
    }

    @Override // g.h.j.h
    public void i(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // g.h.j.h
    public void j(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // g.b.g.e0
    public void k(int i2) {
        s();
        if (i2 == 2) {
            this.f82j.r();
        } else if (i2 == 5) {
            this.f82j.t();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    @Override // g.b.g.e0
    public void l() {
        s();
        this.f82j.i();
    }

    @Override // g.h.j.i
    public void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // g.h.j.h
    public void n(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // g.h.j.h
    public boolean o(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        y i2 = y.i(windowInsets, this);
        boolean p2 = p(this.f81i, new Rect(i2.b(), i2.d(), i2.c(), i2.a()), true, true, false, true);
        Rect rect = this.s;
        AtomicInteger atomicInteger = o.a;
        o.c.b(this, i2, rect);
        Rect rect2 = this.s;
        y i3 = i2.b.i(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.z = i3;
        boolean z2 = true;
        if (!this.A.equals(i3)) {
            this.A = this.z;
            p2 = true;
        }
        if (!this.t.equals(this.s)) {
            this.t.set(this.s);
        } else {
            z2 = p2;
        }
        if (z2) {
            requestLayout();
        }
        return i2.b.a().b.c().b.b().g();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        AtomicInteger atomicInteger = o.a;
        requestApplyInsets();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        y yVar;
        s();
        measureChildWithMargins(this.f81i, i2, 0, i3, 0);
        e eVar = (e) this.f81i.getLayoutParams();
        int max = Math.max(0, this.f81i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f81i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f81i.getMeasuredState());
        AtomicInteger atomicInteger = o.a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            i4 = this.f78f;
            if (this.n && this.f81i.getTabContainer() != null) {
                i4 += this.f78f;
            }
        } else {
            i4 = this.f81i.getVisibility() != 8 ? this.f81i.getMeasuredHeight() : 0;
        }
        this.u.set(this.s);
        y yVar2 = this.z;
        this.B = yVar2;
        if (this.f85m || z2) {
            g.h.d.b a2 = g.h.d.b.a(yVar2.b(), this.B.d() + i4, this.B.c(), this.B.a() + 0);
            y yVar3 = this.B;
            int i5 = Build.VERSION.SDK_INT;
            y.d cVar = i5 >= 30 ? new y.c(yVar3) : i5 >= 29 ? new y.b(yVar3) : new y.a(yVar3);
            cVar.d(a2);
            yVar = cVar.b();
        } else {
            Rect rect = this.u;
            rect.top += i4;
            rect.bottom += 0;
            yVar = yVar2.b.i(0, i4, 0, 0);
        }
        this.B = yVar;
        p(this.f80h, this.u, true, true, true, true);
        if (!this.C.equals(this.B)) {
            y yVar4 = this.B;
            this.C = yVar4;
            o.c(this.f80h, yVar4);
        }
        measureChildWithMargins(this.f80h, i2, 0, i3, 0);
        e eVar2 = (e) this.f80h.getLayoutParams();
        int max3 = Math.max(max, this.f80h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f80h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f80h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        boolean z3 = false;
        if (!this.o || !z2) {
            return false;
        }
        this.E.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.E.getFinalY() > this.f81i.getHeight()) {
            z3 = true;
        }
        if (z3) {
            q();
            this.I.run();
        } else {
            q();
            this.H.run();
        }
        this.p = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.q + i3;
        this.q = i6;
        setActionBarHideOffset(i6);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        s sVar;
        g gVar;
        this.J.a = i2;
        this.q = getActionBarHideOffset();
        q();
        d dVar = this.D;
        if (dVar != null && (gVar = (sVar = (s) dVar).w) != null) {
            gVar.a();
            sVar.w = null;
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f81i.getVisibility() != 0) {
            return false;
        }
        return this.o;
    }

    public void onStopNestedScroll(View view) {
        if (this.o && !this.p) {
            if (this.q <= this.f81i.getHeight()) {
                q();
                postDelayed(this.H, 600);
            } else {
                q();
                postDelayed(this.I, 600);
            }
        }
        d dVar = this.D;
        if (dVar != null) {
            Objects.requireNonNull((s) dVar);
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        s();
        int i3 = this.r ^ i2;
        this.r = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        d dVar = this.D;
        if (dVar != null) {
            ((s) dVar).r = !z3;
            if (z2 || !z3) {
                s sVar = (s) dVar;
                if (sVar.t) {
                    sVar.t = false;
                    sVar.h(true);
                }
            } else {
                s sVar2 = (s) dVar;
                if (!sVar2.t) {
                    sVar2.t = true;
                    sVar2.h(true);
                }
            }
        }
        if ((i3 & 256) != 0 && this.D != null) {
            AtomicInteger atomicInteger = o.a;
            requestApplyInsets();
        }
    }

    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f79g = i2;
        d dVar = this.D;
        if (dVar != null) {
            ((s) dVar).q = i2;
        }
    }

    public final boolean p(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        e eVar = (e) view.getLayoutParams();
        if (!z2 || ((ViewGroup.MarginLayoutParams) eVar).leftMargin == (i5 = rect.left)) {
            z6 = false;
        } else {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i5;
            z6 = true;
        }
        if (z3 && ((ViewGroup.MarginLayoutParams) eVar).topMargin != (i4 = rect.top)) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i4;
            z6 = true;
        }
        if (z5 && ((ViewGroup.MarginLayoutParams) eVar).rightMargin != (i3 = rect.right)) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i3;
            z6 = true;
        }
        if (!z4 || ((ViewGroup.MarginLayoutParams) eVar).bottomMargin == (i2 = rect.bottom)) {
            return z6;
        }
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i2;
        return true;
    }

    public void q() {
        removeCallbacks(this.H);
        removeCallbacks(this.I);
        ViewPropertyAnimator viewPropertyAnimator = this.F;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(e);
        boolean z2 = false;
        this.f78f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f83k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f84l = z2;
        this.E = new OverScroller(context);
    }

    public void s() {
        f0 f0Var;
        if (this.f80h == null) {
            this.f80h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f81i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof f0) {
                f0Var = (f0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                f0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder f2 = c.c.a.a.a.f("Can't make a decor toolbar out of ");
                f2.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(f2.toString());
            }
            this.f82j = f0Var;
        }
    }

    public void setActionBarHideOffset(int i2) {
        q();
        this.f81i.setTranslationY((float) (-Math.max(0, Math.min(i2, this.f81i.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.D = dVar;
        if (getWindowToken() != null) {
            ((s) this.D).q = this.f79g;
            int i2 = this.r;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                AtomicInteger atomicInteger = o.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.n = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.o) {
            this.o = z2;
            if (!z2) {
                q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        s();
        this.f82j.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f82j.setIcon(drawable);
    }

    public void setLogo(int i2) {
        s();
        this.f82j.l(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.f85m = z2;
        this.f84l = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // g.b.g.e0
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f82j.setWindowCallback(callback);
    }

    @Override // g.b.g.e0
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f82j.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
