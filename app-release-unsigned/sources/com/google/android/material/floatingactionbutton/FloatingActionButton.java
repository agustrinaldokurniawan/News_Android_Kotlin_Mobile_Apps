package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.e.a.a.c.j;
import c.e.a.a.q.d;
import c.e.a.a.q.f;
import c.e.a.a.q.g;
import c.e.a.a.r.p;
import c.e.a.a.w.n;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.tsuga.news.R;
import g.h.j.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class FloatingActionButton extends p implements c.e.a.a.p.a, n, CoordinatorLayout.b {

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f1681f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1682g;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f1683h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f1684i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f1685j;

    /* renamed from: k  reason: collision with root package name */
    public int f1686k;

    /* renamed from: l  reason: collision with root package name */
    public int f1687l;

    /* renamed from: m  reason: collision with root package name */
    public int f1688m;
    public boolean n;
    public d o;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;
        public boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.e.a.a.b.f1172h);
            this.b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        public boolean B(FloatingActionButton floatingActionButton, Rect rect) {
            Objects.requireNonNull(floatingActionButton);
            floatingActionButton.getLeft();
            throw null;
        }

        public final boolean C(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (this.b && fVar.f157f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        public final boolean D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!C(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            c.e.a.a.r.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.i(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        public final boolean E(View view, FloatingActionButton floatingActionButton) {
            if (!C(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.i(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return B((FloatingActionButton) view, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void f(CoordinatorLayout.f fVar) {
            if (fVar.f159h == 0) {
                fVar.f159h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) {
                    E(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> e = coordinatorLayout.e(floatingActionButton);
            int size = e.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = e.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) && E(view2, floatingActionButton)) {
                        break;
                    }
                } else if (D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.r(floatingActionButton, i2);
            return true;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    public class b implements c.e.a.a.v.b {
        public b() {
        }
    }

    public class c<T extends FloatingActionButton> implements d.e {
        public final j<T> a;

        public c(j<T> jVar) {
            this.a = jVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: c.e.a.a.c.j<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // c.e.a.a.q.d.e
        public void a() {
            this.a.a(FloatingActionButton.this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: c.e.a.a.c.j<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // c.e.a.a.q.d.e
        public void b() {
            this.a.b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && ((c) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    private d getImpl() {
        if (this.o == null) {
            this.o = new g(this, new b());
        }
        return this.o;
    }

    @Override // c.e.a.a.p.a
    public boolean a() {
        throw null;
    }

    public void d(Animator.AnimatorListener animatorListener) {
        d impl = getImpl();
        if (impl.x == null) {
            impl.x = new ArrayList<>();
        }
        impl.x.add(null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().i(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        d impl = getImpl();
        if (impl.w == null) {
            impl.w = new ArrayList<>();
        }
        impl.w.add(animatorListener);
    }

    public void f(j<? extends FloatingActionButton> jVar) {
        d impl = getImpl();
        c cVar = new c(null);
        if (impl.y == null) {
            impl.y = new ArrayList<>();
        }
        impl.y.add(cVar);
    }

    @Deprecated
    public boolean g(Rect rect) {
        AtomicInteger atomicInteger = o.a;
        if (!isLaidOut()) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        throw null;
    }

    public ColorStateList getBackgroundTintList() {
        return this.f1681f;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f1682g;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().c();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f1287l;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f1288m;
    }

    public Drawable getContentBackground() {
        Objects.requireNonNull(getImpl());
        return null;
    }

    public int getCustomSize() {
        return this.f1687l;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public c.e.a.a.c.g getHideMotionSpec() {
        return getImpl().s;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f1685j;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f1685j;
    }

    public c.e.a.a.w.j getShapeAppearanceModel() {
        c.e.a.a.w.j jVar = getImpl().f1283h;
        Objects.requireNonNull(jVar);
        return jVar;
    }

    public c.e.a.a.c.g getShowMotionSpec() {
        return getImpl().r;
    }

    public int getSize() {
        return this.f1686k;
    }

    public int getSizeDimension() {
        return h(this.f1686k);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f1683h;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f1684i;
    }

    public boolean getUseCompatPadding() {
        return this.n;
    }

    public final int h(int i2) {
        int i3 = this.f1687l;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? h(1) : h(0);
        }
        return resources.getDimensionPixelSize(i2 != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
    }

    public void i(a aVar, boolean z) {
        d impl = getImpl();
        c.e.a.a.q.a aVar2 = aVar == null ? null : new c.e.a.a.q.a(this, aVar);
        if (!impl.e()) {
            Animator animator = impl.q;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.p()) {
                c.e.a.a.c.g gVar = impl.s;
                if (gVar == null) {
                    if (impl.p == null) {
                        impl.p = c.e.a.a.c.g.b(impl.z.getContext(), R.animator.design_fab_hide_motion_spec);
                    }
                    gVar = impl.p;
                    Objects.requireNonNull(gVar);
                }
                AnimatorSet a2 = impl.a(gVar, 0.0f, 0.0f, 0.0f);
                a2.addListener(new c.e.a.a.q.b(impl, z, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.x;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
                return;
            }
            impl.z.b(z ? 8 : 4, z);
            if (aVar2 != null) {
                aVar2.a.a(aVar2.b);
            }
        }
    }

    public boolean j() {
        return getImpl().e();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().g();
    }

    public boolean k() {
        return getImpl().f();
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f1683h;
            if (colorStateList == null) {
                drawable.clearColorFilter();
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f1684i;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(g.b.g.j.c(colorForState, mode));
        }
    }

    public void m(a aVar, boolean z) {
        d impl = getImpl();
        c.e.a.a.q.a aVar2 = aVar == null ? null : new c.e.a.a.q.a(this, aVar);
        if (!impl.f()) {
            Animator animator = impl.q;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.p()) {
                if (impl.z.getVisibility() != 0) {
                    impl.z.setAlpha(0.0f);
                    impl.z.setScaleY(0.0f);
                    impl.z.setScaleX(0.0f);
                    impl.m(0.0f);
                }
                c.e.a.a.c.g gVar = impl.r;
                if (gVar == null) {
                    if (impl.o == null) {
                        impl.o = c.e.a.a.c.g.b(impl.z.getContext(), R.animator.design_fab_show_motion_spec);
                    }
                    gVar = impl.o;
                    Objects.requireNonNull(gVar);
                }
                AnimatorSet a2 = impl.a(gVar, 1.0f, 1.0f, 1.0f);
                a2.addListener(new c.e.a.a.q.c(impl, z, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.w;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
                return;
            }
            impl.z.b(0, z);
            impl.z.setAlpha(1.0f);
            impl.z.setScaleY(1.0f);
            impl.z.setScaleX(1.0f);
            impl.m(1.0f);
            if (aVar2 != null) {
                aVar2.a.b(aVar2.b);
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        Objects.requireNonNull(impl);
        if (!(impl instanceof g)) {
            ViewTreeObserver viewTreeObserver = impl.z.getViewTreeObserver();
            if (impl.F == null) {
                impl.F = new f(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.F);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.z.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.F;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.F = null;
        }
    }

    public void onMeasure(int i2, int i3) {
        this.f1688m = (getSizeDimension() + 0) / 2;
        getImpl().s();
        throw null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c.e.a.a.y.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c.e.a.a.y.a aVar = (c.e.a.a.y.a) parcelable;
        super.onRestoreInstanceState(aVar.f2593f);
        Objects.requireNonNull(aVar.f1406g.getOrDefault("expandableWidgetHelper", null));
        throw null;
    }

    public Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        g.j.a.a aVar = g.j.a.a.e;
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            g(null);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1681f != colorStateList) {
            this.f1681f = colorStateList;
            Objects.requireNonNull(getImpl());
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1682g != mode) {
            this.f1682g = mode;
            Objects.requireNonNull(getImpl());
        }
    }

    public void setCompatElevation(float f2) {
        d impl = getImpl();
        if (impl.f1286k != f2) {
            impl.f1286k = f2;
            impl.j(f2, impl.f1287l, impl.f1288m);
        }
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        d impl = getImpl();
        if (impl.f1287l != f2) {
            impl.f1287l = f2;
            impl.j(impl.f1286k, f2, impl.f1288m);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        d impl = getImpl();
        if (impl.f1288m != f2) {
            impl.f1288m = f2;
            impl.j(impl.f1286k, impl.f1287l, f2);
        }
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i2 != this.f1687l) {
            this.f1687l = i2;
            requestLayout();
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        Objects.requireNonNull(getImpl());
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f1284i) {
            getImpl().f1284i = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i2) {
        throw null;
    }

    public void setHideMotionSpec(c.e.a.a.c.g gVar) {
        getImpl().s = gVar;
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(c.e.a.a.c.g.b(getContext(), i2));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            impl.m(impl.u);
            if (this.f1683h != null) {
                l();
            }
        }
    }

    public void setImageResource(int i2) {
        throw null;
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f1685j != colorStateList) {
            this.f1685j = colorStateList;
            getImpl().n(this.f1685j);
        }
    }

    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().k();
    }

    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().k();
    }

    public void setShadowPaddingEnabled(boolean z) {
        d impl = getImpl();
        impl.f1285j = z;
        impl.s();
        throw null;
    }

    @Override // c.e.a.a.w.n
    public void setShapeAppearanceModel(c.e.a.a.w.j jVar) {
        getImpl().f1283h = jVar;
    }

    public void setShowMotionSpec(c.e.a.a.c.g gVar) {
        getImpl().r = gVar;
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(c.e.a.a.c.g.b(getContext(), i2));
    }

    public void setSize(int i2) {
        this.f1687l = 0;
        if (i2 != this.f1686k) {
            this.f1686k = i2;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f1683h != colorStateList) {
            this.f1683h = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f1684i != mode) {
            this.f1684i = mode;
            l();
        }
    }

    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().l();
    }

    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().l();
    }

    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.n != z) {
            this.n = z;
            getImpl().h();
        }
    }

    @Override // c.e.a.a.r.p
    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }
}
