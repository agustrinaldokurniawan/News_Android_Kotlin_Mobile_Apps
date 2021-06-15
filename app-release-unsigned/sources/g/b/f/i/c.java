package g.b.f.i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import g.e.h;
import g.h.e.a.b;

public abstract class c {
    public final Context a;
    public h<b, MenuItem> b;

    /* renamed from: c  reason: collision with root package name */
    public h<g.h.e.a.c, SubMenu> f1963c;

    public c(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.b == null) {
            this.b = new h<>();
        }
        MenuItem orDefault = this.b.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        j jVar = new j(this.a, bVar);
        this.b.put(bVar, jVar);
        return jVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof g.h.e.a.c)) {
            return subMenu;
        }
        g.h.e.a.c cVar = (g.h.e.a.c) subMenu;
        if (this.f1963c == null) {
            this.f1963c = new h<>();
        }
        SubMenu subMenu2 = this.f1963c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.a, cVar);
        this.f1963c.put(cVar, sVar);
        return sVar;
    }
}
