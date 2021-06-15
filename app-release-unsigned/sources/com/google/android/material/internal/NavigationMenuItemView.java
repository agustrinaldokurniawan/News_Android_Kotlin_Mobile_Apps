package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import c.e.a.a.r.f;
import com.tsuga.news.R;
import g.b.f.i.i;
import g.b.f.i.n;
import g.b.g.k0;
import g.h.j.o;
import g.h.j.z.b;
import java.util.concurrent.atomic.AtomicInteger;

public class NavigationMenuItemView extends f implements n.a {
    public static final int[] z = {16842912};
    public int A;
    public boolean B;
    public boolean C;
    public final CheckedTextView D;
    public FrameLayout E;
    public i F;
    public ColorStateList G;
    public boolean H;
    public Drawable I;
    public final g.h.j.a J;

    public class a extends g.h.j.a {
        public a() {
        }

        @Override // g.h.j.a
        public void d(View view, b bVar) {
            this.b.onInitializeAccessibilityNodeInfo(view, bVar.b);
            bVar.b.setCheckable(NavigationMenuItemView.this.C);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.J = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.D = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        o.o(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.E == null) {
                this.E = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.E.removeAllViews();
            this.E.addView(view);
        }
    }

    @Override // g.b.f.i.n.a
    public void d(i iVar, int i2) {
        int i3;
        k0.a aVar;
        StateListDrawable stateListDrawable;
        this.F = iVar;
        int i4 = iVar.a;
        if (i4 > 0) {
            setId(i4);
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        boolean z2 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(z, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            AtomicInteger atomicInteger = o.a;
            setBackground(stateListDrawable);
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.e);
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.q);
        g.b.a.f(this, iVar.r);
        i iVar2 = this.F;
        if (!(iVar2.e == null && iVar2.getIcon() == null && this.F.getActionView() != null)) {
            z2 = false;
        }
        if (z2) {
            this.D.setVisibility(8);
            FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                aVar = (k0.a) frameLayout.getLayoutParams();
                i3 = -1;
            } else {
                return;
            }
        } else {
            this.D.setVisibility(0);
            FrameLayout frameLayout2 = this.E;
            if (frameLayout2 != null) {
                aVar = (k0.a) frameLayout2.getLayoutParams();
                i3 = -2;
            } else {
                return;
            }
        }
        ((LinearLayout.LayoutParams) aVar).width = i3;
        this.E.setLayoutParams(aVar);
    }

    @Override // g.b.f.i.n.a
    public i getItemData() {
        return this.F;
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        i iVar = this.F;
        if (iVar != null && iVar.isCheckable() && this.F.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, z);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.C != z2) {
            this.C = z2;
            this.J.h(this.D, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        this.D.setChecked(z2);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, 0, i2, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.H) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.G);
            }
            int i2 = this.A;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.B) {
            if (this.I == null) {
                Drawable drawable2 = getResources().getDrawable(R.drawable.navigation_empty_icon, getContext().getTheme());
                this.I = drawable2;
                if (drawable2 != null) {
                    int i3 = this.A;
                    drawable2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.I;
        }
        this.D.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.D.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.A = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.G = colorStateList;
        this.H = colorStateList != null;
        i iVar = this.F;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.D.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.B = z2;
    }

    public void setTextAppearance(int i2) {
        this.D.setTextAppearance(i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.D.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.D.setText(charSequence);
    }
}
