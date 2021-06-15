package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.tsuga.news.R;
import g.h.j.j;
import g.h.j.k;
import g.h.j.o;
import g.h.j.y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class CoordinatorLayout extends ViewGroup implements g.h.j.h, g.h.j.i {
    public static final String e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f147f = {Context.class, AttributeSet.class};

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<c>>> f148g = new ThreadLocal<>();

    /* renamed from: h  reason: collision with root package name */
    public static final Comparator<View> f149h = new i();

    /* renamed from: i  reason: collision with root package name */
    public static final g.h.i.c<Rect> f150i = new g.h.i.e(12);
    public ViewGroup.OnHierarchyChangeListener A;
    public k B;
    public final j C = new j();

    /* renamed from: j  reason: collision with root package name */
    public final List<View> f151j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final g.g.b.a<View> f152k = new g.g.b.a<>();

    /* renamed from: l  reason: collision with root package name */
    public final List<View> f153l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public final List<View> f154m = new ArrayList();
    public Paint n;
    public final int[] o = new int[2];
    public final int[] p = new int[2];
    public boolean q;
    public boolean r;
    public int[] s;
    public View t;
    public View u;
    public g v;
    public boolean w;
    public y x;
    public boolean y;
    public Drawable z;

    public class a implements k {
        public a() {
        }

        @Override // g.h.j.k
        public y a(View view, y yVar) {
            c cVar;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.x, yVar)) {
                coordinatorLayout.x = yVar;
                boolean z = true;
                boolean z2 = yVar.d() > 0;
                coordinatorLayout.y = z2;
                if (z2 || coordinatorLayout.getBackground() != null) {
                    z = false;
                }
                coordinatorLayout.setWillNotDraw(z);
                if (!yVar.f()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = coordinatorLayout.getChildAt(i2);
                        AtomicInteger atomicInteger = o.a;
                        if (childAt.getFitsSystemWindows() && (cVar = ((f) childAt.getLayoutParams()).a) != null) {
                            yVar = cVar.e(yVar);
                            if (yVar.f()) {
                                break;
                            }
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return yVar;
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;)I */
        public int b() {
            return -16777216;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;)F */
        public float c() {
            return 0.0f;
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Lg/h/j/y;)Lg/h/j/y; */
        public y e(y yVar) {
            return yVar;
        }

        public void f(f fVar) {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void h(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void i() {
        }

        public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v, int i2) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4, int i5) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;FFZ)Z */
        public boolean m() {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;II[I)V */
        @Deprecated
        public void o() {
        }

        public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
            if (i4 == 0) {
                o();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;IIII)V */
        @Deprecated
        public void q() {
        }

        public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
            if (i6 == 0) {
                q();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;Landroid/view/View;I)V */
        @Deprecated
        public void s() {
        }

        public boolean t(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable v(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;Landroid/view/View;I)Z */
        @Deprecated
        public boolean w() {
            return false;
        }

        public boolean x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
            if (i3 == 0) {
                return w();
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;)V */
        @Deprecated
        public void y() {
        }

        public void z(CoordinatorLayout coordinatorLayout, V v, View view, int i2) {
            if (i2 == 0) {
                y();
            }
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.A;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.A;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {
        public c a;
        public boolean b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f155c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f156d = 0;
        public int e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f157f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f158g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f159h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f160i;

        /* renamed from: j  reason: collision with root package name */
        public int f161j;

        /* renamed from: k  reason: collision with root package name */
        public View f162k;

        /* renamed from: l  reason: collision with root package name */
        public View f163l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f164m;
        public boolean n;
        public boolean o;
        public boolean p;
        public final Rect q = new Rect();

        public f(int i2, int i3) {
            super(i2, i3);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v12, resolved type: java.lang.Class<?> */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c cVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.g.a.b);
            this.f155c = obtainStyledAttributes.getInteger(0, 0);
            this.f157f = obtainStyledAttributes.getResourceId(1, -1);
            this.f156d = obtainStyledAttributes.getInteger(2, 0);
            this.e = obtainStyledAttributes.getInteger(6, -1);
            this.f158g = obtainStyledAttributes.getInt(5, 0);
            this.f159h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.e;
                if (TextUtils.isEmpty(string)) {
                    cVar = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.e;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.f148g;
                        Map<String, Constructor<c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f147f);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVar = constructor.newInstance(context, attributeSet);
                    } catch (Exception e2) {
                        throw new RuntimeException(c.c.a.a.a.q("Could not inflate Behavior subclass ", string), e2);
                    }
                }
                this.a = cVar;
            }
            obtainStyledAttributes.recycle();
            c cVar2 = this.a;
            if (cVar2 != null) {
                cVar2.f(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
        }

        public boolean a(int i2) {
            if (i2 == 0) {
                return this.n;
            }
            if (i2 != 1) {
                return false;
            }
            return this.o;
        }

        public void b(int i2, boolean z) {
            if (i2 == 0) {
                this.n = z;
            } else if (i2 == 1) {
                this.o = z;
            }
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.q(0);
            return true;
        }
    }

    public static class h extends g.j.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public SparseArray<Parcelable> f165g;

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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f165g = new SparseArray<>(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                this.f165g.append(iArr[i2], readParcelableArray[i2]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // g.j.a.a
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f2593f, i2);
            SparseArray<Parcelable> sparseArray = this.f165g;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = this.f165g.keyAt(i3);
                parcelableArr[i3] = this.f165g.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }
    }

    public static class i implements Comparator<View> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            AtomicInteger atomicInteger = o.a;
            float z = view.getZ();
            float z2 = view2.getZ();
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        e = r0 != null ? r0.getName() : null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = g.g.a.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.s = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.s.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = this.s;
                iArr2[i2] = (int) (((float) iArr2[i2]) * f2);
            }
        }
        this.z = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new e());
        AtomicInteger atomicInteger = o.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect b2 = f150i.b();
        return b2 == null ? new Rect() : b2;
    }

    public final void b(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    public void c(View view, boolean z2, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            g(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // g.h.j.h
    public void d(View view, View view2, int i2, int i3) {
        c cVar;
        j jVar = this.C;
        if (i3 == 1) {
            jVar.b = i2;
        } else {
            jVar.a = i2;
        }
        this.u = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            f fVar = (f) getChildAt(i4).getLayoutParams();
            if (fVar.a(i3) && (cVar = fVar.a) != null && i3 == 0) {
                cVar.s();
            }
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.a;
        if (cVar != null) {
            float c2 = cVar.c();
            if (c2 > 0.0f) {
                if (this.n == null) {
                    this.n = new Paint();
                }
                this.n.setColor(fVar.a.b());
                Paint paint = this.n;
                int round = Math.round(c2 * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = 255;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.n);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.z;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public List<View> e(View view) {
        g.g.b.a<View> aVar = this.f152k;
        int i2 = aVar.b.f2251k;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList<T> l2 = aVar.b.l(i3);
            if (l2 != null && l2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aVar.b.h(i3));
            }
        }
        this.f154m.clear();
        if (arrayList != null) {
            this.f154m.addAll(arrayList);
        }
        return this.f154m;
    }

    public List<View> f(View view) {
        ArrayList<T> orDefault = this.f152k.b.getOrDefault(view, null);
        this.f154m.clear();
        if (orDefault != null) {
            this.f154m.addAll(orDefault);
        }
        return this.f154m;
    }

    public void g(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = g.g.b.b.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = g.g.b.b.a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.g.b.b.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = g.g.b.b.b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f151j);
    }

    public final y getLastWindowInsets() {
        return this.x;
    }

    public int getNestedScrollAxes() {
        return this.C.a();
    }

    public Drawable getStatusBarBackground() {
        return this.z;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int i5 = fVar.f155c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = fVar.f156d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        int width = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            width -= i3 / 2;
        } else if (i7 != 5) {
            width -= i3;
        }
        if (i8 == 16) {
            height -= i4 / 2;
        } else if (i8 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    @Override // g.h.j.h
    public void i(View view, int i2) {
        j jVar = this.C;
        if (i2 == 1) {
            jVar.b = 0;
        } else {
            jVar.a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i2)) {
                c cVar = fVar.a;
                if (cVar != null) {
                    cVar.z(this, childAt, view, i2);
                }
                fVar.b(i2, false);
                fVar.p = false;
            }
        }
        this.u = null;
    }

    @Override // g.h.j.h
    public void j(View view, int i2, int i3, int[] iArr, int i4) {
        c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i4) && (cVar = fVar.a) != null) {
                    int[] iArr2 = this.o;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.p(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.o;
                    i5 = i2 > 0 ? Math.max(i5, iArr3[0]) : Math.min(i5, iArr3[0]);
                    int[] iArr4 = this.o;
                    i6 = i3 > 0 ? Math.max(i6, iArr4[1]) : Math.min(i6, iArr4[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z2) {
            q(1);
        }
    }

    public final int k(int i2) {
        StringBuilder sb;
        int[] iArr = this.s;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i2);
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i2);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public f l(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c cVar = fVar.a;
                if (cVar != behavior) {
                    if (cVar != null) {
                        cVar.i();
                    }
                    fVar.a = behavior;
                    fVar.b = true;
                    if (behavior != null) {
                        behavior.f(fVar);
                    }
                }
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        c cVar2 = (c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        c cVar3 = fVar.a;
                        if (cVar3 != cVar2) {
                            if (cVar3 != null) {
                                cVar3.i();
                            }
                            fVar.a = cVar2;
                            fVar.b = true;
                            if (cVar2 != null) {
                                cVar2.f(fVar);
                            }
                        }
                    } catch (Exception e2) {
                        StringBuilder f2 = c.c.a.a.a.f("Default behavior class ");
                        f2.append(dVar.value().getName());
                        f2.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", f2.toString(), e2);
                    }
                }
            }
            fVar.b = true;
        }
        return fVar;
    }

    @Override // g.h.j.i
    public void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c cVar;
        boolean z2;
        int i7;
        int childCount = getChildCount();
        boolean z3 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i6) && (cVar = fVar.a) != null) {
                    int[] iArr2 = this.o;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.r(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.o;
                    i8 = i4 > 0 ? Math.max(i8, iArr3[0]) : Math.min(i8, iArr3[0]);
                    if (i5 > 0) {
                        z2 = true;
                        i7 = Math.max(i9, this.o[1]);
                    } else {
                        z2 = true;
                        i7 = Math.min(i9, this.o[1]);
                    }
                    i9 = i7;
                    z3 = z2;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z3) {
            q(1);
        }
    }

    @Override // g.h.j.h
    public void n(View view, int i2, int i3, int i4, int i5, int i6) {
        m(view, i2, i3, i4, i5, 0, this.p);
    }

    @Override // g.h.j.h
    public boolean o(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.a;
                if (cVar != null) {
                    boolean x2 = cVar.x(this, childAt, view, view2, i2, i3);
                    z2 |= x2;
                    fVar.b(i3, x2);
                } else {
                    fVar.b(i3, false);
                }
            }
        }
        return z2;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.w) {
            if (this.v == null) {
                this.v = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.v);
        }
        if (this.x == null) {
            AtomicInteger atomicInteger = o.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.r = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.w && this.v != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.v);
        }
        View view = this.u;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.r = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.y && this.z != null) {
            y yVar = this.x;
            int d2 = yVar != null ? yVar.d() : 0;
            if (d2 > 0) {
                this.z.setBounds(0, 0, getWidth(), d2);
                this.z.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean t2 = t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            v(true);
        }
        return t2;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        c cVar;
        AtomicInteger atomicInteger = o.a;
        int layoutDirection = getLayoutDirection();
        int size = this.f151j.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f151j.get(i6);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).a) == null || !cVar.k(this, view, layoutDirection))) {
                r(view, layoutDirection);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0180, code lost:
        if (r0.l(r30, r20, r8, r21, r23, 0) == false) goto L_0x0190;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
        // Method dump skipped, instructions count: 494
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        c cVar;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.a) != null) {
                    z3 |= cVar.m();
                }
            }
        }
        if (z3) {
            q(1);
        }
        return z3;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.a) != null) {
                    z2 |= cVar.n(this, childAt, view, f2, f3);
                }
            }
        }
        return z2;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        j(view, i2, i3, iArr, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        m(view, i2, i3, i4, i5, 0, this.p);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        d(view, view2, i2, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f2593f);
        SparseArray<Parcelable> sparseArray = hVar.f165g;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = l(childAt).a;
            if (!(id == -1 || cVar == null || (parcelable2 = sparseArray.get(id)) == null)) {
                cVar.u(this, childAt, parcelable2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable v2;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).a;
            if (!(id == -1 || cVar == null || (v2 = cVar.v(this, childAt)) == null)) {
                sparseArray.append(id, v2);
            }
        }
        hVar.f165g = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return o(view, view2, i2, 0);
    }

    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.t
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.t(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.t
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.t
            boolean r6 = r6.A(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = r5
        L_0x002a:
            android.view.View r7 = r0.t
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.v(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(View view, int i2, int i3) {
        Rect a2 = a();
        g(view, a2);
        try {
            return a2.contains(i2, i3);
        } finally {
            a2.setEmpty();
            f150i.a(a2);
        }
    }

    public final void q(int i2) {
        int i3;
        Rect rect;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        Rect rect2;
        int i11;
        int i12;
        int i13;
        f fVar;
        c cVar;
        AtomicInteger atomicInteger = o.a;
        int layoutDirection = getLayoutDirection();
        int size = this.f151j.size();
        Rect a2 = a();
        Rect a3 = a();
        Rect a4 = a();
        int i14 = 0;
        while (i14 < size) {
            View view = this.f151j.get(i14);
            f fVar2 = (f) view.getLayoutParams();
            if (i2 == 0 && view.getVisibility() == 8) {
                i4 = size;
                rect = a4;
                i3 = i14;
            } else {
                int i15 = 0;
                while (i15 < i14) {
                    if (fVar2.f163l == this.f151j.get(i15)) {
                        f fVar3 = (f) view.getLayoutParams();
                        if (fVar3.f162k != null) {
                            Rect a5 = a();
                            Rect a6 = a();
                            Rect a7 = a();
                            g(fVar3.f162k, a5);
                            c(view, false, a6);
                            int measuredWidth = view.getMeasuredWidth();
                            i13 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            i12 = i14;
                            i11 = i15;
                            rect2 = a4;
                            fVar = fVar2;
                            h(layoutDirection, a5, a7, fVar3, measuredWidth, measuredHeight);
                            boolean z5 = (a7.left == a6.left && a7.top == a6.top) ? false : true;
                            b(fVar3, a7, measuredWidth, measuredHeight);
                            int i16 = a7.left - a6.left;
                            int i17 = a7.top - a6.top;
                            if (i16 != 0) {
                                AtomicInteger atomicInteger2 = o.a;
                                view.offsetLeftAndRight(i16);
                            }
                            if (i17 != 0) {
                                AtomicInteger atomicInteger3 = o.a;
                                view.offsetTopAndBottom(i17);
                            }
                            if (z5 && (cVar = fVar3.a) != null) {
                                cVar.g(this, view, fVar3.f162k);
                            }
                            a5.setEmpty();
                            g.h.i.c<Rect> cVar2 = f150i;
                            cVar2.a(a5);
                            a6.setEmpty();
                            cVar2.a(a6);
                            a7.setEmpty();
                            cVar2.a(a7);
                            i15 = i11 + 1;
                            fVar2 = fVar;
                            size = i13;
                            i14 = i12;
                            a4 = rect2;
                        }
                    }
                    i11 = i15;
                    i13 = size;
                    rect2 = a4;
                    i12 = i14;
                    fVar = fVar2;
                    i15 = i11 + 1;
                    fVar2 = fVar;
                    size = i13;
                    i14 = i12;
                    a4 = rect2;
                }
                i3 = i14;
                c(view, true, a3);
                if (fVar2.f158g != 0 && !a3.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar2.f158g, layoutDirection);
                    int i18 = absoluteGravity & 112;
                    if (i18 == 48) {
                        a2.top = Math.max(a2.top, a3.bottom);
                    } else if (i18 == 80) {
                        a2.bottom = Math.max(a2.bottom, getHeight() - a3.top);
                    }
                    int i19 = absoluteGravity & 7;
                    if (i19 == 3) {
                        a2.left = Math.max(a2.left, a3.right);
                    } else if (i19 == 5) {
                        a2.right = Math.max(a2.right, getWidth() - a3.left);
                    }
                }
                if (fVar2.f159h != 0 && view.getVisibility() == 0) {
                    AtomicInteger atomicInteger4 = o.a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        f fVar4 = (f) view.getLayoutParams();
                        c cVar3 = fVar4.a;
                        Rect a8 = a();
                        Rect a9 = a();
                        a9.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar3 == null || !cVar3.a(this, view, a8)) {
                            a8.set(a9);
                        } else if (!a9.contains(a8)) {
                            StringBuilder f2 = c.c.a.a.a.f("Rect should be within the child's bounds. Rect:");
                            f2.append(a8.toShortString());
                            f2.append(" | Bounds:");
                            f2.append(a9.toShortString());
                            throw new IllegalArgumentException(f2.toString());
                        }
                        a9.setEmpty();
                        g.h.i.c<Rect> cVar4 = f150i;
                        cVar4.a(a9);
                        if (!a8.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar4.f159h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i9 = (a8.top - ((ViewGroup.MarginLayoutParams) fVar4).topMargin) - fVar4.f161j) >= (i10 = a2.top)) {
                                z3 = false;
                            } else {
                                x(view, i10 - i9);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a8.bottom) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin) + fVar4.f161j) < (i8 = a2.bottom)) {
                                x(view, height - i8);
                                z3 = true;
                            }
                            if (!z3) {
                                x(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i6 = (a8.left - ((ViewGroup.MarginLayoutParams) fVar4).leftMargin) - fVar4.f160i) >= (i7 = a2.left)) {
                                z4 = false;
                            } else {
                                w(view, i7 - i6);
                                z4 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a8.right) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin) + fVar4.f160i) < (i5 = a2.right)) {
                                w(view, width - i5);
                                z4 = true;
                            }
                            if (!z4) {
                                w(view, 0);
                            }
                        }
                        a8.setEmpty();
                        cVar4.a(a8);
                    }
                }
                if (i2 != 2) {
                    rect = a4;
                    rect.set(((f) view.getLayoutParams()).q);
                    if (rect.equals(a3)) {
                        i4 = size;
                    } else {
                        ((f) view.getLayoutParams()).q.set(a3);
                    }
                } else {
                    rect = a4;
                }
                i4 = size;
                for (int i20 = i3 + 1; i20 < i4; i20++) {
                    View view2 = this.f151j.get(i20);
                    f fVar5 = (f) view2.getLayoutParams();
                    c cVar5 = fVar5.a;
                    if (cVar5 != null && cVar5.d(this, view2, view)) {
                        if (i2 != 0 || !fVar5.p) {
                            if (i2 != 2) {
                                z2 = cVar5.g(this, view2, view);
                            } else {
                                cVar5.h(this, view2, view);
                                z2 = true;
                            }
                            if (i2 == 1) {
                                fVar5.p = z2;
                            }
                        } else {
                            fVar5.p = false;
                        }
                    }
                }
            }
            i14 = i3 + 1;
            size = i4;
            a4 = rect;
        }
        a2.setEmpty();
        g.h.i.c<Rect> cVar6 = f150i;
        cVar6.a(a2);
        a3.setEmpty();
        cVar6.a(a3);
        a4.setEmpty();
        cVar6.a(a4);
    }

    public void r(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f162k;
        int i3 = 0;
        if (view2 == null && fVar.f157f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect a2 = a();
            Rect a3 = a();
            try {
                g(view2, a2);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                h(i2, a2, a3, fVar2, measuredWidth, measuredHeight);
                b(fVar2, a3, measuredWidth, measuredHeight);
                view.layout(a3.left, a3.top, a3.right, a3.bottom);
            } finally {
                a2.setEmpty();
                g.h.i.c<Rect> cVar = f150i;
                cVar.a(a2);
                a3.setEmpty();
                cVar.a(a3);
            }
        } else {
            int i4 = fVar.e;
            if (i4 >= 0) {
                f fVar3 = (f) view.getLayoutParams();
                int i5 = fVar3.f155c;
                if (i5 == 0) {
                    i5 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
                int i6 = absoluteGravity & 7;
                int i7 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i2 == 1) {
                    i4 = width - i4;
                }
                int k2 = k(i4) - measuredWidth2;
                if (i6 == 1) {
                    k2 += measuredWidth2 / 2;
                } else if (i6 == 5) {
                    k2 += measuredWidth2;
                }
                if (i7 == 16) {
                    i3 = 0 + (measuredHeight2 / 2);
                } else if (i7 == 80) {
                    i3 = measuredHeight2 + 0;
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, Math.min(k2, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            f fVar4 = (f) view.getLayoutParams();
            Rect a4 = a();
            a4.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin);
            if (this.x != null) {
                AtomicInteger atomicInteger = o.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    a4.left = this.x.b() + a4.left;
                    a4.top = this.x.d() + a4.top;
                    a4.right -= this.x.c();
                    a4.bottom -= this.x.a();
                }
            }
            Rect a5 = a();
            int i8 = fVar4.f155c;
            if ((i8 & 7) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            Gravity.apply(i8, view.getMeasuredWidth(), view.getMeasuredHeight(), a4, a5, i2);
            view.layout(a5.left, a5.top, a5.right, a5.bottom);
            a4.setEmpty();
            g.h.i.c<Rect> cVar2 = f150i;
            cVar2.a(a4);
            a5.setEmpty();
            cVar2.a(a5);
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        c cVar = ((f) view.getLayoutParams()).a;
        if (cVar == null || !cVar.t(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2 && !this.q) {
            v(false);
            this.q = true;
        }
    }

    public void s(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        y();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.z;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.z = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.z.setState(getDrawableState());
                }
                Drawable drawable4 = this.z;
                AtomicInteger atomicInteger = o.a;
                drawable4.setLayoutDirection(getLayoutDirection());
                this.z.setVisible(getVisibility() == 0, false);
                this.z.setCallback(this);
            }
            AtomicInteger atomicInteger2 = o.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            Context context = getContext();
            Object obj = g.h.c.a.a;
            drawable = context.getDrawable(i2);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.z;
        if (drawable != null && drawable.isVisible() != z2) {
            this.z.setVisible(z2, false);
        }
    }

    public final boolean t(MotionEvent motionEvent, int i2) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f153l;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator<View> comparator = f149h;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z3 = false;
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = list.get(i4);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.a;
            boolean z5 = true;
            if (!(z3 || z4) || actionMasked == 0) {
                if (!z3 && cVar != null) {
                    if (i2 == 0) {
                        z3 = cVar.j(this, view, motionEvent);
                    } else if (i2 == 1) {
                        z3 = cVar.A(this, view, motionEvent);
                    }
                    if (z3) {
                        this.t = view;
                    }
                }
                c cVar2 = fVar.a;
                if (cVar2 == null) {
                    fVar.f164m = false;
                }
                boolean z6 = fVar.f164m;
                if (z6) {
                    z2 = true;
                } else {
                    z2 = (cVar2 != null && cVar2.c() > 0.0f) | z6;
                    fVar.f164m = z2;
                }
                if (!z2 || z6) {
                    z5 = false;
                }
                if (z2 && !z5) {
                    break;
                }
                z4 = z5;
            } else if (cVar != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    cVar.j(this, view, motionEvent2);
                } else if (i2 == 1) {
                    cVar.A(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r5 != false) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0163 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
        // Method dump skipped, instructions count: 447
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c cVar = ((f) childAt.getLayoutParams()).a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    cVar.j(this, childAt, obtain);
                } else {
                    cVar.A(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).f164m = false;
        }
        this.t = null;
        this.q = false;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.z;
    }

    public final void w(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f160i;
        if (i3 != i2) {
            AtomicInteger atomicInteger = o.a;
            view.offsetLeftAndRight(i2 - i3);
            fVar.f160i = i2;
        }
    }

    public final void x(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f161j;
        if (i3 != i2) {
            AtomicInteger atomicInteger = o.a;
            view.offsetTopAndBottom(i2 - i3);
            fVar.f161j = i2;
        }
    }

    public final void y() {
        AtomicInteger atomicInteger = o.a;
        if (getFitsSystemWindows()) {
            if (this.B == null) {
                this.B = new a();
            }
            o.c.c(this, this.B);
            setSystemUiVisibility(1280);
            return;
        }
        o.c.c(this, null);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }
}
