package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.tsuga.news.R;
import g.h.j.o;
import g.h.j.y;
import g.l.a;
import g.l.b.b0;
import g.l.b.h0;
import g.l.b.m;
import java.util.ArrayList;
import java.util.Iterator;

public final class FragmentContainerView extends FrameLayout {
    public ArrayList<View> e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<View> f185f;

    /* renamed from: g  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f186g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f187h = true;

    public FragmentContainerView(Context context) {
        super(context);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
            }
        }
    }

    public final void a(View view) {
        ArrayList<View> arrayList = this.f185f;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.e == null) {
                this.e = new ArrayList<>();
            }
            this.e.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof m ? (m) tag : null) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof m ? (m) tag : null) != null) {
            return super.addViewInLayout(view, i2, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        y i2 = y.i(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f186g;
        y h2 = onApplyWindowInsetsListener != null ? y.h(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : o.j(this, i2);
        if (!h2.f()) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                o.c(getChildAt(i3), h2);
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.f187h && this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                super.drawChild(canvas, this.e.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList<View> arrayList;
        if (!this.f187h || (arrayList = this.e) == null || arrayList.size() <= 0 || !this.e.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f185f;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.e;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f187h = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    public void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i2) {
        a(getChildAt(i2));
        super.removeViewAt(i2);
    }

    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    public void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f187h = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f186g = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f185f == null) {
                this.f185f = new ArrayList<>();
            }
            this.f185f.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, b0 b0Var) {
        super(context, attributeSet);
        View view;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        m H = b0Var.H(id);
        if (classAttribute != null && H == null) {
            if (id <= 0) {
                throw new IllegalStateException(c.c.a.a.a.c("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? c.c.a.a.a.q(" with tag ", string) : ""));
            }
            m a = b0Var.K().a(context.getClassLoader(), classAttribute);
            a.Y(context, attributeSet, null);
            g.l.b.a aVar = new g.l.b.a(b0Var);
            aVar.p = true;
            a.I = this;
            aVar.d(getId(), a, string, 1);
            if (!aVar.f2699g) {
                aVar.f2700h = false;
                aVar.q.D(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = ((ArrayList) b0Var.f2642c.f()).iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            m mVar = h0Var.f2691c;
            if (mVar.B == getId() && (view = mVar.J) != null && view.getParent() == null) {
                mVar.I = this;
                h0Var.b();
            }
        }
    }
}
