package g.b.f.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import g.h.j.b;
import java.lang.reflect.Method;

public class j extends c implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    public final g.h.e.a.b f2009d;
    public Method e;

    public class a extends g.h.j.b {
        public final ActionProvider b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.b = actionProvider;
        }

        @Override // g.h.j.b
        public boolean a() {
            return this.b.hasSubMenu();
        }

        @Override // g.h.j.b
        public View c() {
            return this.b.onCreateActionView();
        }

        @Override // g.h.j.b
        public boolean e() {
            return this.b.onPerformDefaultAction();
        }

        @Override // g.h.j.b
        public void f(SubMenu subMenu) {
            this.b.onPrepareSubMenu(j.this.d(subMenu));
        }
    }

    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        public b.a f2011d;

        public b(j jVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // g.h.j.b
        public boolean b() {
            return this.b.isVisible();
        }

        @Override // g.h.j.b
        public View d(MenuItem menuItem) {
            return this.b.onCreateActionView(menuItem);
        }

        @Override // g.h.j.b
        public boolean g() {
            return this.b.overridesItemVisibility();
        }

        @Override // g.h.j.b
        public void h(b.a aVar) {
            this.f2011d = aVar;
            this.b.setVisibilityListener(this);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            b.a aVar = this.f2011d;
            if (aVar != null) {
                g gVar = i.this.n;
                gVar.f1992i = true;
                gVar.q(true);
            }
        }
    }

    public static class c extends FrameLayout implements g.b.f.b {
        public final CollapsibleActionView e;

        public c(View view) {
            super(view.getContext());
            this.e = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // g.b.f.b
        public void c() {
            this.e.onActionViewExpanded();
        }

        @Override // g.b.f.b
        public void e() {
            this.e.onActionViewCollapsed();
        }
    }

    public class d implements MenuItem.OnActionExpandListener {
        public final MenuItem.OnActionExpandListener a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.a.onMenuItemActionCollapse(j.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.a.onMenuItemActionExpand(j.this.c(menuItem));
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {
        public final MenuItem.OnMenuItemClickListener a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.a.onMenuItemClick(j.this.c(menuItem));
        }
    }

    public j(Context context, g.h.e.a.b bVar) {
        super(context);
        if (bVar != null) {
            this.f2009d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f2009d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f2009d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        g.h.j.b b2 = this.f2009d.b();
        if (b2 instanceof a) {
            return ((a) b2).b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f2009d.getActionView();
        return actionView instanceof c ? (View) ((c) actionView).e : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f2009d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f2009d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f2009d.getContentDescription();
    }

    public int getGroupId() {
        return this.f2009d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f2009d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f2009d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2009d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f2009d.getIntent();
    }

    public int getItemId() {
        return this.f2009d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2009d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f2009d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f2009d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f2009d.getOrder();
    }

    public SubMenu getSubMenu() {
        return d(this.f2009d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f2009d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f2009d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f2009d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f2009d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f2009d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f2009d.isCheckable();
    }

    public boolean isChecked() {
        return this.f2009d.isChecked();
    }

    public boolean isEnabled() {
        return this.f2009d.isEnabled();
    }

    public boolean isVisible() {
        return this.f2009d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, this.a, actionProvider);
        g.h.e.a.b bVar2 = this.f2009d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
        this.f2009d.setActionView(i2);
        View actionView = this.f2009d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f2009d.setActionView(new c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f2009d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f2009d.setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f2009d.setAlphabeticShortcut(c2, i2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f2009d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f2009d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f2009d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f2009d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f2009d.setIcon(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2009d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2009d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2009d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2009d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f2009d.setNumericShortcut(c2);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f2009d.setNumericShortcut(c2, i2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2009d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2009d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f2009d.setShortcut(c2, c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f2009d.setShortcut(c2, c3, i2, i3);
        return this;
    }

    public void setShowAsAction(int i2) {
        this.f2009d.setShowAsAction(i2);
    }

    public MenuItem setShowAsActionFlags(int i2) {
        this.f2009d.setShowAsActionFlags(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f2009d.setTitle(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2009d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2009d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f2009d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f2009d.setVisible(z);
    }
}
