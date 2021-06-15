package g.b.f;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import g.b.f.a;
import g.b.f.i.j;
import g.b.f.i.o;
import g.e.h;
import g.h.e.a.b;
import java.util.ArrayList;

public class e extends ActionMode {
    public final Context a;
    public final a b;

    public static class a implements a.AbstractC0064a {
        public final ActionMode.Callback a;
        public final Context b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f1926c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final h<Menu, Menu> f1927d = new h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        @Override // g.b.f.a.AbstractC0064a
        public boolean a(a aVar, Menu menu) {
            return this.a.onPrepareActionMode(e(aVar), f(menu));
        }

        @Override // g.b.f.a.AbstractC0064a
        public boolean b(a aVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(aVar), new j(this.b, (b) menuItem));
        }

        @Override // g.b.f.a.AbstractC0064a
        public boolean c(a aVar, Menu menu) {
            return this.a.onCreateActionMode(e(aVar), f(menu));
        }

        @Override // g.b.f.a.AbstractC0064a
        public void d(a aVar) {
            this.a.onDestroyActionMode(e(aVar));
        }

        public ActionMode e(a aVar) {
            int size = this.f1926c.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = this.f1926c.get(i2);
                if (eVar != null && eVar.b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.b, aVar);
            this.f1926c.add(eVar2);
            return eVar2;
        }

        public final Menu f(Menu menu) {
            Menu orDefault = this.f1927d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            o oVar = new o(this.b, (g.h.e.a.a) menu);
            this.f1927d.put(menu, oVar);
            return oVar;
        }
    }

    public e(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
    }

    public void finish() {
        this.b.c();
    }

    public View getCustomView() {
        return this.b.d();
    }

    public Menu getMenu() {
        return new o(this.a, (g.h.e.a.a) this.b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    public CharSequence getSubtitle() {
        return this.b.g();
    }

    public Object getTag() {
        return this.b.e;
    }

    public CharSequence getTitle() {
        return this.b.h();
    }

    public boolean getTitleOptionalHint() {
        return this.b.f1917f;
    }

    public void invalidate() {
        this.b.i();
    }

    public boolean isTitleOptional() {
        return this.b.j();
    }

    public void setCustomView(View view) {
        this.b.k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i2) {
        this.b.l(i2);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.m(charSequence);
    }

    public void setTag(Object obj) {
        this.b.e = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i2) {
        this.b.n(i2);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.b.p(z);
    }
}
