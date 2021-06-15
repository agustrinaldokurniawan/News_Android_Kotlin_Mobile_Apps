package g.b.f.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import g.h.e.a.b;
import g.h.j.b;
import java.util.Objects;

public final class i implements b {
    public g.h.j.b A;
    public MenuItem.OnActionExpandListener B;
    public boolean C = false;
    public ContextMenu.ContextMenuInfo D;
    public final int a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1999c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2000d;
    public CharSequence e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f2001f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f2002g;

    /* renamed from: h  reason: collision with root package name */
    public char f2003h;

    /* renamed from: i  reason: collision with root package name */
    public int f2004i = 4096;

    /* renamed from: j  reason: collision with root package name */
    public char f2005j;

    /* renamed from: k  reason: collision with root package name */
    public int f2006k = 4096;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f2007l;

    /* renamed from: m  reason: collision with root package name */
    public int f2008m = 0;
    public g n;
    public r o;
    public MenuItem.OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public ColorStateList s = null;
    public PorterDuff.Mode t = null;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public int x = 16;
    public int y = 0;
    public View z;

    public class a implements b.a {
        public a() {
        }
    }

    public i(g gVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.n = gVar;
        this.a = i3;
        this.b = i2;
        this.f1999c = i4;
        this.f2000d = i5;
        this.e = charSequence;
        this.y = i6;
    }

    public static void c(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    @Override // g.h.e.a.b
    public g.h.e.a.b a(g.h.j.b bVar) {
        g.h.j.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.a = null;
        }
        this.z = null;
        this.A = bVar;
        this.n.q(true);
        g.h.j.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    @Override // g.h.e.a.b
    public g.h.j.b b() {
        return this.A;
    }

    @Override // g.h.e.a.b
    public boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.u || this.v)) {
            drawable = drawable.mutate();
            if (this.u) {
                drawable.setTintList(this.s);
            }
            if (this.v) {
                drawable.setTintMode(this.t);
            }
            this.w = false;
        }
        return drawable;
    }

    public char e() {
        return this.n.n() ? this.f2005j : this.f2003h;
    }

    @Override // g.h.e.a.b
    public boolean expandActionView() {
        if (!f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.f(this);
        }
        return false;
    }

    public boolean f() {
        g.h.j.b bVar;
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null && (bVar = this.A) != null) {
            this.z = bVar.d(this);
        }
        return this.z != null;
    }

    public boolean g() {
        return (this.x & 32) == 32;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // g.h.e.a.b
    public View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        g.h.j.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View d2 = bVar.d(this);
        this.z = d2;
        return d2;
    }

    @Override // g.h.e.a.b
    public int getAlphabeticModifiers() {
        return this.f2006k;
    }

    public char getAlphabeticShortcut() {
        return this.f2005j;
    }

    @Override // g.h.e.a.b
    public CharSequence getContentDescription() {
        return this.q;
    }

    public int getGroupId() {
        return this.b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f2007l;
        if (drawable != null) {
            return d(drawable);
        }
        int i2 = this.f2008m;
        if (i2 == 0) {
            return null;
        }
        Drawable a2 = g.b.d.a.a.a(this.n.b, i2);
        this.f2008m = 0;
        this.f2007l = a2;
        return d(a2);
    }

    @Override // g.h.e.a.b
    public ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // g.h.e.a.b
    public PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    public Intent getIntent() {
        return this.f2002g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    @Override // g.h.e.a.b
    public int getNumericModifiers() {
        return this.f2004i;
    }

    public char getNumericShortcut() {
        return this.f2003h;
    }

    public int getOrder() {
        return this.f1999c;
    }

    public SubMenu getSubMenu() {
        return this.o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2001f;
        return charSequence != null ? charSequence : this.e;
    }

    @Override // g.h.e.a.b
    public CharSequence getTooltipText() {
        return this.r;
    }

    public boolean h() {
        return (this.x & 4) != 0;
    }

    public boolean hasSubMenu() {
        return this.o != null;
    }

    public g.h.e.a.b i(View view) {
        int i2;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i2 = this.a) > 0) {
            view.setId(i2);
        }
        this.n.p();
        return this;
    }

    @Override // g.h.e.a.b
    public boolean isActionViewExpanded() {
        return this.C;
    }

    public boolean isCheckable() {
        return (this.x & 1) == 1;
    }

    public boolean isChecked() {
        return (this.x & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.x & 16) != 0;
    }

    public boolean isVisible() {
        g.h.j.b bVar = this.A;
        return (bVar == null || !bVar.g()) ? (this.x & 8) == 0 : (this.x & 8) == 0 && this.A.b();
    }

    public void j(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 2 : 0) | (i2 & -3);
        this.x = i3;
        if (i2 != i3) {
            this.n.q(false);
        }
    }

    public void k(boolean z2) {
        this.x = z2 ? this.x | 32 : this.x & -33;
    }

    public boolean l(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 0 : 8) | (i2 & -9);
        this.x = i3;
        return i2 != i3;
    }

    public boolean m() {
        return this.n.o() && e() != 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // g.h.e.a.b, android.view.MenuItem
    public MenuItem setActionView(int i2) {
        Context context = this.n.b;
        i(LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // g.h.e.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        i(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2005j == c2) {
            return this;
        }
        this.f2005j = Character.toLowerCase(c2);
        this.n.q(false);
        return this;
    }

    @Override // g.h.e.a.b
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f2005j == c2 && this.f2006k == i2) {
            return this;
        }
        this.f2005j = Character.toLowerCase(c2);
        this.f2006k = KeyEvent.normalizeMetaState(i2);
        this.n.q(false);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 1 : 0) | (i2 & -2);
        this.x = i3;
        if (i2 != i3) {
            this.n.q(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        if ((this.x & 4) != 0) {
            g gVar = this.n;
            Objects.requireNonNull(gVar);
            int groupId = getGroupId();
            int size = gVar.f1990g.size();
            gVar.z();
            for (int i2 = 0; i2 < size; i2++) {
                i iVar = gVar.f1990g.get(i2);
                if (iVar.b == groupId && iVar.h() && iVar.isCheckable()) {
                    iVar.j(iVar == this);
                }
            }
            gVar.y();
        } else {
            j(z2);
        }
        return this;
    }

    @Override // g.h.e.a.b
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.n.q(false);
        return this;
    }

    @Override // g.h.e.a.b
    /* renamed from: setContentDescription  reason: collision with other method in class */
    public g.h.e.a.b m4setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.n.q(false);
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        this.x = z2 ? this.x | 16 : this.x & -17;
        this.n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f2007l = null;
        this.f2008m = i2;
        this.w = true;
        this.n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2008m = 0;
        this.f2007l = drawable;
        this.w = true;
        this.n.q(false);
        return this;
    }

    @Override // g.h.e.a.b
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.w = true;
        this.n.q(false);
        return this;
    }

    @Override // g.h.e.a.b
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.v = true;
        this.w = true;
        this.n.q(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2002g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        if (this.f2003h == c2) {
            return this;
        }
        this.f2003h = c2;
        this.n.q(false);
        return this;
    }

    @Override // g.h.e.a.b
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f2003h == c2 && this.f2004i == i2) {
            return this;
        }
        this.f2003h = c2;
        this.f2004i = KeyEvent.normalizeMetaState(i2);
        this.n.q(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f2003h = c2;
        this.f2005j = Character.toLowerCase(c3);
        this.n.q(false);
        return this;
    }

    @Override // g.h.e.a.b
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f2003h = c2;
        this.f2004i = KeyEvent.normalizeMetaState(i2);
        this.f2005j = Character.toLowerCase(c3);
        this.f2006k = KeyEvent.normalizeMetaState(i3);
        this.n.q(false);
        return this;
    }

    @Override // g.h.e.a.b
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.y = i2;
            this.n.p();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // g.h.e.a.b
    public MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        setTitle(this.n.b.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.q(false);
        r rVar = this.o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2001f = charSequence;
        this.n.q(false);
        return this;
    }

    @Override // g.h.e.a.b
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.n.q(false);
        return this;
    }

    @Override // g.h.e.a.b
    /* renamed from: setTooltipText  reason: collision with other method in class */
    public g.h.e.a.b m5setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.n.q(false);
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        if (l(z2)) {
            g gVar = this.n;
            gVar.f1992i = true;
            gVar.q(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
