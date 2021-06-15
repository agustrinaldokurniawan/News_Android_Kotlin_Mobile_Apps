package g.b.f.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import g.h.e.a.b;

public class a implements b {
    public CharSequence a;
    public CharSequence b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f1946c;

    /* renamed from: d  reason: collision with root package name */
    public char f1947d;
    public int e = 4096;

    /* renamed from: f  reason: collision with root package name */
    public char f1948f;

    /* renamed from: g  reason: collision with root package name */
    public int f1949g = 4096;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f1950h;

    /* renamed from: i  reason: collision with root package name */
    public Context f1951i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1952j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1953k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f1954l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f1955m = null;
    public boolean n = false;
    public boolean o = false;
    public int p = 16;

    public a(Context context, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1951i = context;
        this.a = charSequence;
    }

    @Override // g.h.e.a.b
    public b a(g.h.j.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // g.h.e.a.b
    public g.h.j.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f1950h;
        if (drawable == null) {
            return;
        }
        if (this.n || this.o) {
            this.f1950h = drawable;
            Drawable mutate = drawable.mutate();
            this.f1950h = mutate;
            if (this.n) {
                mutate.setTintList(this.f1954l);
            }
            if (this.o) {
                this.f1950h.setTintMode(this.f1955m);
            }
        }
    }

    @Override // g.h.e.a.b
    public boolean collapseActionView() {
        return false;
    }

    @Override // g.h.e.a.b
    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // g.h.e.a.b
    public View getActionView() {
        return null;
    }

    @Override // g.h.e.a.b
    public int getAlphabeticModifiers() {
        return this.f1949g;
    }

    public char getAlphabeticShortcut() {
        return this.f1948f;
    }

    @Override // g.h.e.a.b
    public CharSequence getContentDescription() {
        return this.f1952j;
    }

    public int getGroupId() {
        return 0;
    }

    public Drawable getIcon() {
        return this.f1950h;
    }

    @Override // g.h.e.a.b
    public ColorStateList getIconTintList() {
        return this.f1954l;
    }

    @Override // g.h.e.a.b
    public PorterDuff.Mode getIconTintMode() {
        return this.f1955m;
    }

    public Intent getIntent() {
        return this.f1946c;
    }

    public int getItemId() {
        return 16908332;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // g.h.e.a.b
    public int getNumericModifiers() {
        return this.e;
    }

    public char getNumericShortcut() {
        return this.f1947d;
    }

    public int getOrder() {
        return 0;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.a;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        return charSequence != null ? charSequence : this.a;
    }

    @Override // g.h.e.a.b
    public CharSequence getTooltipText() {
        return this.f1953k;
    }

    public boolean hasSubMenu() {
        return false;
    }

    @Override // g.h.e.a.b
    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.p & 1) != 0;
    }

    public boolean isChecked() {
        return (this.p & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.p & 16) != 0;
    }

    public boolean isVisible() {
        return (this.p & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // g.h.e.a.b, android.view.MenuItem
    public MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f1948f = Character.toLowerCase(c2);
        return this;
    }

    @Override // g.h.e.a.b
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f1948f = Character.toLowerCase(c2);
        this.f1949g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.p = (z ? 1 : 0) | (this.p & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.p = (z ? 2 : 0) | (this.p & -3);
        return this;
    }

    @Override // g.h.e.a.b
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1952j = charSequence;
        return this;
    }

    @Override // g.h.e.a.b
    /* renamed from: setContentDescription  reason: collision with other method in class */
    public b m2setContentDescription(CharSequence charSequence) {
        this.f1952j = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.p = (z ? 16 : 0) | (this.p & -17);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        Context context = this.f1951i;
        Object obj = g.h.c.a.a;
        this.f1950h = context.getDrawable(i2);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1950h = drawable;
        c();
        return this;
    }

    @Override // g.h.e.a.b
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1954l = colorStateList;
        this.n = true;
        c();
        return this;
    }

    @Override // g.h.e.a.b
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1955m = mode;
        this.o = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1946c = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f1947d = c2;
        return this;
    }

    @Override // g.h.e.a.b
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f1947d = c2;
        this.e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f1947d = c2;
        this.f1948f = Character.toLowerCase(c3);
        return this;
    }

    @Override // g.h.e.a.b
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f1947d = c2;
        this.e = KeyEvent.normalizeMetaState(i2);
        this.f1948f = Character.toLowerCase(c3);
        this.f1949g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // g.h.e.a.b
    public void setShowAsAction(int i2) {
    }

    @Override // g.h.e.a.b
    public MenuItem setShowAsActionFlags(int i2) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.a = this.f1951i.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    @Override // g.h.e.a.b
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1953k = charSequence;
        return this;
    }

    @Override // g.h.e.a.b
    /* renamed from: setTooltipText  reason: collision with other method in class */
    public b m3setTooltipText(CharSequence charSequence) {
        this.f1953k = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.p & 8;
        if (z) {
            i2 = 0;
        }
        this.p = i3 | i2;
        return this;
    }

    @Override // g.h.e.a.b, android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
