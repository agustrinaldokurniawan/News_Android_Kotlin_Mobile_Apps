package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.tsuga.news.R;
import g.b.c.a;
import g.b.f.i.i;
import g.b.f.i.m;
import g.b.f.i.r;
import g.b.g.b0;
import g.b.g.b1;
import g.b.g.f0;
import g.b.g.f1;
import g.b.g.l;
import g.b.g.n;
import g.b.g.r0;
import g.b.g.z0;
import g.h.j.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Toolbar extends ViewGroup {
    public int A;
    public CharSequence B;
    public CharSequence C;
    public ColorStateList D;
    public ColorStateList E;
    public boolean F;
    public boolean G;
    public final ArrayList<View> H;
    public final ArrayList<View> I;
    public final int[] J;
    public f K;
    public final ActionMenuView.e L;
    public b1 M;
    public g.b.g.c N;
    public d O;
    public boolean P;
    public final Runnable Q;
    public ActionMenuView e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f106f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f107g;

    /* renamed from: h  reason: collision with root package name */
    public ImageButton f108h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f109i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f110j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f111k;

    /* renamed from: l  reason: collision with root package name */
    public ImageButton f112l;

    /* renamed from: m  reason: collision with root package name */
    public View f113m;
    public Context n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public r0 x;
    public int y;
    public int z;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Toolbar.this.v();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            d dVar = Toolbar.this.O;
            i iVar = dVar == null ? null : dVar.f114f;
            if (iVar != null) {
                iVar.collapseActionView();
            }
        }
    }

    public class d implements m {
        public g.b.f.i.g e;

        /* renamed from: f  reason: collision with root package name */
        public i f114f;

        public d() {
        }

        @Override // g.b.f.i.m
        public void a(g.b.f.i.g gVar, boolean z) {
        }

        @Override // g.b.f.i.m
        public boolean c() {
            return false;
        }

        @Override // g.b.f.i.m
        public void d(Context context, g.b.f.i.g gVar) {
            i iVar;
            g.b.f.i.g gVar2 = this.e;
            if (!(gVar2 == null || (iVar = this.f114f) == null)) {
                gVar2.d(iVar);
            }
            this.e = gVar;
        }

        @Override // g.b.f.i.m
        public boolean e(g.b.f.i.g gVar, i iVar) {
            View view = Toolbar.this.f113m;
            if (view instanceof g.b.f.b) {
                ((g.b.f.b) view).e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f113m);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f112l);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f113m = null;
            int size = toolbar3.I.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.I.get(size));
                } else {
                    toolbar3.I.clear();
                    this.f114f = null;
                    Toolbar.this.requestLayout();
                    iVar.C = false;
                    iVar.n.q(false);
                    return true;
                }
            }
        }

        @Override // g.b.f.i.m
        public boolean g(g.b.f.i.g gVar, i iVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.f112l.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f112l);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f112l);
            }
            Toolbar.this.f113m = iVar.getActionView();
            this.f114f = iVar;
            ViewParent parent2 = Toolbar.this.f113m.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f113m);
                }
                e h2 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                h2.a = 8388611 | (toolbar4.r & 112);
                h2.b = 2;
                toolbar4.f113m.setLayoutParams(h2);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f113m);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((e) childAt.getLayoutParams()).b == 2 || childAt == toolbar6.e)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.I.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            iVar.C = true;
            iVar.n.q(false);
            View view = Toolbar.this.f113m;
            if (view instanceof g.b.f.b) {
                ((g.b.f.b) view).c();
            }
            return true;
        }

        @Override // g.b.f.i.m
        public boolean i(r rVar) {
            return false;
        }

        @Override // g.b.f.i.m
        public void j(boolean z) {
            if (this.f114f != null) {
                g.b.f.i.g gVar = this.e;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (this.e.getItem(i2) == this.f114f) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (!z2) {
                    e(this.e, this.f114f);
                }
            }
        }
    }

    public static class e extends a.C0062a {
        public int b = 0;

        public e(int i2, int i3) {
            super(i2, i3);
            this.a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(e eVar) {
            super((a.C0062a) eVar);
            this.b = eVar.b;
        }

        public e(a.C0062a aVar) {
            super(aVar);
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends g.j.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public int f116g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f117h;

        public class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new g[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f116g = parcel.readInt();
            this.f117h = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // g.j.a.a
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f2593f, i2);
            parcel.writeInt(this.f116g);
            parcel.writeInt(this.f117h ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = 8388627;
        this.H = new ArrayList<>();
        this.I = new ArrayList<>();
        this.J = new int[2];
        this.L = new a();
        this.Q = new b();
        Context context2 = getContext();
        int[] iArr = g.b.b.w;
        z0 q2 = z0.q(context2, attributeSet, iArr, i2, 0);
        o.n(this, context, iArr, attributeSet, q2.b, i2, 0);
        this.p = q2.l(28, 0);
        this.q = q2.l(19, 0);
        this.A = q2.b.getInteger(0, this.A);
        this.r = q2.b.getInteger(2, 48);
        int e2 = q2.e(22, 0);
        e2 = q2.o(27) ? q2.e(27, e2) : e2;
        this.w = e2;
        this.v = e2;
        this.u = e2;
        this.t = e2;
        int e3 = q2.e(25, -1);
        if (e3 >= 0) {
            this.t = e3;
        }
        int e4 = q2.e(24, -1);
        if (e4 >= 0) {
            this.u = e4;
        }
        int e5 = q2.e(26, -1);
        if (e5 >= 0) {
            this.v = e5;
        }
        int e6 = q2.e(23, -1);
        if (e6 >= 0) {
            this.w = e6;
        }
        this.s = q2.f(13, -1);
        int e7 = q2.e(9, Integer.MIN_VALUE);
        int e8 = q2.e(5, Integer.MIN_VALUE);
        int f2 = q2.f(7, 0);
        int f3 = q2.f(8, 0);
        d();
        r0 r0Var = this.x;
        r0Var.f2154h = false;
        if (f2 != Integer.MIN_VALUE) {
            r0Var.e = f2;
            r0Var.a = f2;
        }
        if (f3 != Integer.MIN_VALUE) {
            r0Var.f2152f = f3;
            r0Var.b = f3;
        }
        if (!(e7 == Integer.MIN_VALUE && e8 == Integer.MIN_VALUE)) {
            r0Var.a(e7, e8);
        }
        this.y = q2.e(10, Integer.MIN_VALUE);
        this.z = q2.e(6, Integer.MIN_VALUE);
        this.f110j = q2.g(4);
        this.f111k = q2.n(3);
        CharSequence n2 = q2.n(21);
        if (!TextUtils.isEmpty(n2)) {
            setTitle(n2);
        }
        CharSequence n3 = q2.n(18);
        if (!TextUtils.isEmpty(n3)) {
            setSubtitle(n3);
        }
        this.n = getContext();
        setPopupTheme(q2.l(17, 0));
        Drawable g2 = q2.g(16);
        if (g2 != null) {
            setNavigationIcon(g2);
        }
        CharSequence n4 = q2.n(15);
        if (!TextUtils.isEmpty(n4)) {
            setNavigationContentDescription(n4);
        }
        Drawable g3 = q2.g(11);
        if (g3 != null) {
            setLogo(g3);
        }
        CharSequence n5 = q2.n(12);
        if (!TextUtils.isEmpty(n5)) {
            setLogoDescription(n5);
        }
        if (q2.o(29)) {
            setTitleTextColor(q2.c(29));
        }
        if (q2.o(20)) {
            setSubtitleTextColor(q2.c(20));
        }
        if (q2.o(14)) {
            getMenuInflater().inflate(q2.l(14, 0), getMenu());
        }
        q2.b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new g.b.f.f(getContext());
    }

    public final void a(List<View> list, int i2) {
        AtomicInteger atomicInteger = o.a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.b == 0 && u(childAt) && j(eVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.b == 0 && u(childAt2) && j(eVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e h2 = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        h2.b = 1;
        if (!z2 || this.f113m == null) {
            addView(view, h2);
            return;
        }
        view.setLayoutParams(h2);
        this.I.add(view);
    }

    public void c() {
        if (this.f112l == null) {
            l lVar = new l(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f112l = lVar;
            lVar.setImageDrawable(this.f110j);
            this.f112l.setContentDescription(this.f111k);
            e h2 = generateDefaultLayoutParams();
            h2.a = 8388611 | (this.r & 112);
            h2.b = 2;
            this.f112l.setLayoutParams(h2);
            this.f112l.setOnClickListener(new c());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.x == null) {
            this.x = new r0();
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.e;
        if (actionMenuView.t == null) {
            g.b.f.i.g gVar = (g.b.f.i.g) actionMenuView.getMenu();
            if (this.O == null) {
                this.O = new d();
            }
            this.e.setExpandedActionViewsExclusive(true);
            gVar.b(this.O, this.n);
        }
    }

    public final void f() {
        if (this.e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.e = actionMenuView;
            actionMenuView.setPopupTheme(this.o);
            this.e.setOnMenuItemClickListener(this.L);
            ActionMenuView actionMenuView2 = this.e;
            actionMenuView2.y = null;
            actionMenuView2.z = null;
            e h2 = generateDefaultLayoutParams();
            h2.a = 8388613 | (this.r & 112);
            this.e.setLayoutParams(h2);
            b(this.e, false);
        }
    }

    public final void g() {
        if (this.f108h == null) {
            this.f108h = new l(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e h2 = generateDefaultLayoutParams();
            h2.a = 8388611 | (this.r & 112);
            this.f108h.setLayoutParams(h2);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f112l;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f112l;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        r0 r0Var = this.x;
        if (r0Var != null) {
            return r0Var.f2153g ? r0Var.a : r0Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.z;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        r0 r0Var = this.x;
        if (r0Var != null) {
            return r0Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        r0 r0Var = this.x;
        if (r0Var != null) {
            return r0Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        r0 r0Var = this.x;
        if (r0Var != null) {
            return r0Var.f2153g ? r0Var.b : r0Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.y;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        g.b.f.i.g gVar;
        ActionMenuView actionMenuView = this.e;
        return actionMenuView != null && (gVar = actionMenuView.t) != null && gVar.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.z, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        AtomicInteger atomicInteger = o.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        AtomicInteger atomicInteger = o.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f109i;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f109i;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f108h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f108h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public g.b.g.c getOuterActionMenuPresenter() {
        return this.N;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.e.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.n;
    }

    public int getPopupTheme() {
        return this.o;
    }

    public CharSequence getSubtitle() {
        return this.C;
    }

    public final TextView getSubtitleTextView() {
        return this.f107g;
    }

    public CharSequence getTitle() {
        return this.B;
    }

    public int getTitleMarginBottom() {
        return this.w;
    }

    public int getTitleMarginEnd() {
        return this.u;
    }

    public int getTitleMarginStart() {
        return this.t;
    }

    public int getTitleMarginTop() {
        return this.v;
    }

    public final TextView getTitleTextView() {
        return this.f106f;
    }

    public f0 getWrapper() {
        if (this.M == null) {
            this.M = new b1(this, true);
        }
        return this.M;
    }

    /* renamed from: h */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: i */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0062a ? new e((a.C0062a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final int j(int i2) {
        AtomicInteger atomicInteger = o.a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    public final int k(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = eVar.a & 112;
        if (!(i4 == 16 || i4 == 48 || i4 == 80)) {
            i4 = this.A & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    public final int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public final int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public void n(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.I.contains(view);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Q);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.G = false;
        }
        if (!this.G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0297 A[LOOP:0: B:106:0x0295->B:107:0x0297, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b9 A[LOOP:1: B:109:0x02b7->B:110:0x02b9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02de A[LOOP:2: B:112:0x02dc->B:113:0x02de, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0333 A[LOOP:3: B:120:0x0331->B:121:0x0333, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
        // Method dump skipped, instructions count: 840
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.J;
        boolean z2 = true;
        int i11 = 0;
        if (f1.b(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (u(this.f108h)) {
            t(this.f108h, i2, 0, i3, 0, this.s);
            i6 = l(this.f108h) + this.f108h.getMeasuredWidth();
            i5 = Math.max(0, m(this.f108h) + this.f108h.getMeasuredHeight());
            i4 = View.combineMeasuredStates(0, this.f108h.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (u(this.f112l)) {
            t(this.f112l, i2, 0, i3, 0, this.s);
            i6 = l(this.f112l) + this.f112l.getMeasuredWidth();
            i5 = Math.max(i5, m(this.f112l) + this.f112l.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f112l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6) + 0;
        iArr[c3] = Math.max(0, currentContentInsetStart - i6);
        if (u(this.e)) {
            t(this.e, i2, max, i3, 0, this.s);
            i7 = l(this.e) + this.e.getMeasuredWidth();
            i5 = Math.max(i5, m(this.e) + this.e.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.e.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i7) + max;
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (u(this.f113m)) {
            max2 += s(this.f113m, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, m(this.f113m) + this.f113m.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f113m.getMeasuredState());
        }
        if (u(this.f109i)) {
            max2 += s(this.f109i, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, m(this.f109i) + this.f109i.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f109i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).b == 0 && u(childAt)) {
                max2 += s(childAt, i2, max2, i3, 0, iArr);
                i5 = Math.max(i5, m(childAt) + childAt.getMeasuredHeight());
                i4 = View.combineMeasuredStates(i4, childAt.getMeasuredState());
            }
        }
        int i13 = this.v + this.w;
        int i14 = this.t + this.u;
        if (u(this.f106f)) {
            s(this.f106f, i2, max2 + i14, i3, i13, iArr);
            int l2 = l(this.f106f) + this.f106f.getMeasuredWidth();
            i8 = m(this.f106f) + this.f106f.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i4, this.f106f.getMeasuredState());
            i9 = l2;
        } else {
            i8 = 0;
            i10 = i4;
            i9 = 0;
        }
        if (u(this.f107g)) {
            i9 = Math.max(i9, s(this.f107g, i2, max2 + i14, i3, i8 + i13, iArr));
            i8 = m(this.f107g) + this.f107g.getMeasuredHeight() + i8;
            i10 = View.combineMeasuredStates(i10, this.f107g.getMeasuredState());
        }
        int max3 = Math.max(i5, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i9, getSuggestedMinimumWidth()), i2, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (this.P) {
            int childCount2 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i15);
                if (u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i15++;
            }
        }
        z2 = false;
        if (!z2) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f2593f);
        ActionMenuView actionMenuView = this.e;
        g.b.f.i.g gVar2 = actionMenuView != null ? actionMenuView.t : null;
        int i2 = gVar.f116g;
        if (!(i2 == 0 || this.O == null || gVar2 == null || (findItem = gVar2.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f117h) {
            removeCallbacks(this.Q);
            post(this.Q);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.d()
            g.b.g.r0 r0 = r2.x
            r1 = 1
            if (r3 != r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            boolean r3 = r0.f2153g
            if (r1 != r3) goto L_0x0012
            goto L_0x0040
        L_0x0012:
            r0.f2153g = r1
            boolean r3 = r0.f2154h
            if (r3 == 0) goto L_0x0038
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x002a
            int r1 = r0.f2151d
            if (r1 == r3) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            int r1 = r0.e
        L_0x0023:
            r0.a = r1
            int r1 = r0.f2150c
            if (r1 == r3) goto L_0x003c
            goto L_0x003e
        L_0x002a:
            int r1 = r0.f2150c
            if (r1 == r3) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            int r1 = r0.e
        L_0x0031:
            r0.a = r1
            int r1 = r0.f2151d
            if (r1 == r3) goto L_0x003c
            goto L_0x003e
        L_0x0038:
            int r3 = r0.e
            r0.a = r3
        L_0x003c:
            int r1 = r0.f2152f
        L_0x003e:
            r0.b = r1
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    public Parcelable onSaveInstanceState() {
        i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.O;
        if (!(dVar == null || (iVar = dVar.f114f) == null)) {
            gVar.f116g = iVar.a;
        }
        gVar.f117h = p();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.F = false;
        }
        if (!this.F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.F = false;
        }
        return true;
    }

    public boolean p() {
        ActionMenuView actionMenuView = this.e;
        if (actionMenuView != null) {
            g.b.g.c cVar = actionMenuView.x;
            if (cVar != null && cVar.m()) {
                return true;
            }
        }
        return false;
    }

    public final int q(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int k2 = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k2, max + measuredWidth, view.getMeasuredHeight() + k2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + max;
    }

    public final int r(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int k2 = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k2, max, view.getMeasuredHeight() + k2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public final int s(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ImageButton imageButton = this.f112l;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(g.b.d.a.a.a(getContext(), i2));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f112l.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f112l;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f110j);
        }
    }

    public void setCollapsible(boolean z2) {
        this.P = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.z) {
            this.z = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.y) {
            this.y = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(g.b.d.a.a.a(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f109i == null) {
                this.f109i = new n(getContext(), null);
            }
            if (!o(this.f109i)) {
                b(this.f109i, true);
            }
        } else {
            ImageView imageView = this.f109i;
            if (imageView != null && o(imageView)) {
                removeView(this.f109i);
                this.I.remove(this.f109i);
            }
        }
        ImageView imageView2 = this.f109i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f109i == null) {
            this.f109i = new n(getContext(), null);
        }
        ImageView imageView = this.f109i;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f108h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(g.b.d.a.a.a(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f108h)) {
                b(this.f108h, true);
            }
        } else {
            ImageButton imageButton = this.f108h;
            if (imageButton != null && o(imageButton)) {
                removeView(this.f108h);
                this.I.remove(this.f108h);
            }
        }
        ImageButton imageButton2 = this.f108h;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f108h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.K = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.o != i2) {
            this.o = i2;
            if (i2 == 0) {
                this.n = getContext();
            } else {
                this.n = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f107g == null) {
                Context context = getContext();
                b0 b0Var = new b0(context, null);
                this.f107g = b0Var;
                b0Var.setSingleLine();
                this.f107g.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.q;
                if (i2 != 0) {
                    this.f107g.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.f107g.setTextColor(colorStateList);
                }
            }
            if (!o(this.f107g)) {
                b(this.f107g, true);
            }
        } else {
            TextView textView = this.f107g;
            if (textView != null && o(textView)) {
                removeView(this.f107g);
                this.I.remove(this.f107g);
            }
        }
        TextView textView2 = this.f107g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        TextView textView = this.f107g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f106f == null) {
                Context context = getContext();
                b0 b0Var = new b0(context, null);
                this.f106f = b0Var;
                b0Var.setSingleLine();
                this.f106f.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.p;
                if (i2 != 0) {
                    this.f106f.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.f106f.setTextColor(colorStateList);
                }
            }
            if (!o(this.f106f)) {
                b(this.f106f, true);
            }
        } else {
            TextView textView = this.f106f;
            if (textView != null && o(textView)) {
                removeView(this.f106f);
                this.I.remove(this.f106f);
            }
        }
        TextView textView2 = this.f106f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.w = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.u = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.t = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.v = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.D = colorStateList;
        TextView textView = this.f106f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void t(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean v() {
        ActionMenuView actionMenuView = this.e;
        if (actionMenuView != null) {
            g.b.g.c cVar = actionMenuView.x;
            if (cVar != null && cVar.n()) {
                return true;
            }
        }
        return false;
    }
}
