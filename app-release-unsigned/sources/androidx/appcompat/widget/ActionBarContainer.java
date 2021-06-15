package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tsuga.news.R;
import g.b.g.b;
import g.b.g.s0;
import g.h.j.o;
import java.util.concurrent.atomic.AtomicInteger;

public class ActionBarContainer extends FrameLayout {
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public View f69f;

    /* renamed from: g  reason: collision with root package name */
    public View f70g;

    /* renamed from: h  reason: collision with root package name */
    public View f71h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f72i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f73j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f74k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f75l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f76m;
    public int n;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        AtomicInteger atomicInteger = o.a;
        setBackground(bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.b.b.a);
        boolean z = false;
        this.f72i = obtainStyledAttributes.getDrawable(0);
        this.f73j = obtainStyledAttributes.getDrawable(2);
        this.n = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f75l = true;
            this.f74k = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f75l ? this.f72i == null && this.f73j == null : this.f74k == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f72i;
        if (drawable != null && drawable.isStateful()) {
            this.f72i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f73j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f73j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f74k;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f74k.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f69f;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f72i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f73j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f74k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f70g = findViewById(R.id.action_bar);
        this.f71h = findViewById(R.id.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.e || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f72i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f72i);
        }
        this.f72i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f70g;
            if (view != null) {
                this.f72i.setBounds(view.getLeft(), this.f70g.getTop(), this.f70g.getRight(), this.f70g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f75l ? !(this.f72i == null && this.f73j == null) : this.f74k != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f74k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f74k);
        }
        this.f74k = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f75l && (drawable2 = this.f74k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f75l ? this.f72i == null && this.f73j == null : this.f74k == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f73j;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f73j);
        }
        this.f73j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f76m && (drawable2 = this.f73j) != null) {
                drawable2.setBounds(this.f69f.getLeft(), this.f69f.getTop(), this.f69f.getRight(), this.f69f.getBottom());
            }
        }
        boolean z = true;
        if (!this.f75l ? !(this.f72i == null && this.f73j == null) : this.f74k != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(s0 s0Var) {
        View view = this.f69f;
        if (view != null) {
            removeView(view);
        }
        this.f69f = s0Var;
        if (s0Var != null) {
            addView(s0Var);
            ViewGroup.LayoutParams layoutParams = s0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            s0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.e = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f72i;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f73j;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f74k;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f72i && !this.f75l) || (drawable == this.f73j && this.f76m) || ((drawable == this.f74k && this.f75l) || super.verifyDrawable(drawable));
    }
}
