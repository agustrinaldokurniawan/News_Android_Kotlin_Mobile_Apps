package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import g.b.f.i.g;
import g.b.f.i.i;
import g.b.f.i.n;
import g.b.f.i.p;
import g.b.g.b0;
import g.b.g.c;
import g.b.g.j0;

public class ActionMenuItemView extends b0 implements n.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: j  reason: collision with root package name */
    public i f56j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f57k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f58l;

    /* renamed from: m  reason: collision with root package name */
    public g.b f59m;
    public j0 n;
    public b o;
    public boolean p = e();
    public boolean q;
    public int r;
    public int s;
    public int t;

    public class a extends j0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // g.b.g.j0
        public p b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.o;
            if (bVar == null || (aVar = c.this.y) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // g.b.g.j0
        public boolean c() {
            p b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f59m;
            return bVar != null && bVar.a(actionMenuItemView.f56j) && (b = b()) != null && b.b();
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.b.b.f1855c, 0, 0);
        this.r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.s = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return c();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return c() && this.f56j.getIcon() == null;
    }

    public boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // g.b.f.i.n.a
    public void d(i iVar, int i2) {
        this.f56j = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitleCondensed());
        setId(iVar.a);
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.n == null) {
            this.n = new a();
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f57k);
        if (this.f58l != null) {
            if (!((this.f56j.y & 4) == 4) || (!this.p && !this.q)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f57k : null);
        CharSequence charSequence2 = this.f56j.q;
        if (TextUtils.isEmpty(charSequence2)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f56j.e;
            }
        }
        setContentDescription(charSequence2);
        CharSequence charSequence3 = this.f56j.r;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z3) {
                charSequence = this.f56j.e;
            }
            g.b.a.f(this, charSequence);
            return;
        }
        g.b.a.f(this, charSequence3);
    }

    @Override // g.b.f.i.n.a
    public i getItemData() {
        return this.f56j;
    }

    public void onClick(View view) {
        g.b bVar = this.f59m;
        if (bVar != null) {
            bVar.a(this.f56j);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.p = e();
        f();
    }

    @Override // g.b.g.b0
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean c2 = c();
        if (c2 && (i4 = this.s) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.r) : this.r;
        if (mode != 1073741824 && this.r > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!c2 && this.f58l != null) {
            super.setPadding((getMeasuredWidth() - this.f58l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        j0 j0Var;
        if (!this.f56j.hasSubMenu() || (j0Var = this.n) == null || !j0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.q != z) {
            this.q = z;
            i iVar = this.f56j;
            if (iVar != null) {
                iVar.n.p();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f58l = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.t;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(g.b bVar) {
        this.f59m = bVar;
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.s = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.o = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f57k = charSequence;
        f();
    }
}
