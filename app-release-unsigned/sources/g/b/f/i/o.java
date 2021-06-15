package g.b.f.i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import g.e.h;
import g.h.e.a.a;
import g.h.e.a.b;
import g.h.e.a.c;

public class o extends c implements Menu {

    /* renamed from: d  reason: collision with root package name */
    public final a f2021d;

    public o(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f2021d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return c(this.f2021d.add(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return c(this.f2021d.add(i2, i3, i4, i5));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return c(this.f2021d.add(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return c(this.f2021d.add(charSequence));
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f2021d.addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr[i6] = c(menuItemArr2[i6]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return d(this.f2021d.addSubMenu(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return d(this.f2021d.addSubMenu(i2, i3, i4, i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return d(this.f2021d.addSubMenu(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f2021d.addSubMenu(charSequence));
    }

    public void clear() {
        h<b, MenuItem> hVar = this.b;
        if (hVar != null) {
            hVar.clear();
        }
        h<c, SubMenu> hVar2 = this.f1963c;
        if (hVar2 != null) {
            hVar2.clear();
        }
        this.f2021d.clear();
    }

    public void close() {
        this.f2021d.close();
    }

    public MenuItem findItem(int i2) {
        return c(this.f2021d.findItem(i2));
    }

    public MenuItem getItem(int i2) {
        return c(this.f2021d.getItem(i2));
    }

    public boolean hasVisibleItems() {
        return this.f2021d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f2021d.isShortcutKey(i2, keyEvent);
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return this.f2021d.performIdentifierAction(i2, i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return this.f2021d.performShortcut(i2, keyEvent, i3);
    }

    public void removeGroup(int i2) {
        if (this.b != null) {
            int i3 = 0;
            while (true) {
                h<b, MenuItem> hVar = this.b;
                if (i3 >= hVar.f2251k) {
                    break;
                }
                if (hVar.h(i3).getGroupId() == i2) {
                    this.b.j(i3);
                    i3--;
                }
                i3++;
            }
        }
        this.f2021d.removeGroup(i2);
    }

    public void removeItem(int i2) {
        if (this.b != null) {
            int i3 = 0;
            while (true) {
                h<b, MenuItem> hVar = this.b;
                if (i3 >= hVar.f2251k) {
                    break;
                } else if (hVar.h(i3).getItemId() == i2) {
                    this.b.j(i3);
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.f2021d.removeItem(i2);
    }

    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        this.f2021d.setGroupCheckable(i2, z, z2);
    }

    public void setGroupEnabled(int i2, boolean z) {
        this.f2021d.setGroupEnabled(i2, z);
    }

    public void setGroupVisible(int i2, boolean z) {
        this.f2021d.setGroupVisible(i2, z);
    }

    public void setQwertyMode(boolean z) {
        this.f2021d.setQwertyMode(z);
    }

    public int size() {
        return this.f2021d.size();
    }
}
