package g.b.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.tsuga.news.R;
import g.a.d.a;
import g.b.f.a;
import g.b.g.e1;
import g.e.c;
import g.h.b.d;
import g.l.b.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class g extends p implements h {
    public i q;

    public g() {
        this.f30h.b.b("androidx:appcompat", new e(this));
        f fVar = new f(this);
        a aVar = this.f28f;
        if (aVar.b != null) {
            fVar.a(aVar.b);
        }
        aVar.a.add(fVar);
    }

    @Override // androidx.activity.ComponentActivity
    private void l() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.activity.ComponentActivity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        q().c(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(q().d(context));
    }

    public void closeOptionsMenu() {
        r();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // g.h.b.e
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        r();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // g.b.c.h
    public void f(g.b.f.a aVar) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
        return (T) q().e(i2);
    }

    public MenuInflater getMenuInflater() {
        return q().g();
    }

    public Resources getResources() {
        int i2 = e1.a;
        return super.getResources();
    }

    @Override // g.b.c.h
    public void h(g.b.f.a aVar) {
    }

    @Override // g.b.c.h
    public g.b.f.a i(a.AbstractC0064a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        q().j();
    }

    @Override // g.l.b.p
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        q().k(configuration);
    }

    public void onContentChanged() {
    }

    @Override // g.l.b.p
    public void onDestroy() {
        super.onDestroy();
        q().m();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // g.l.b.p
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        a r = r();
        if (menuItem.getItemId() != 16908332 || r == null || (((s) r).f1904g.j() & 4) == 0) {
            return false;
        }
        return v();
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // g.l.b.p
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        q().n(bundle);
    }

    @Override // g.l.b.p
    public void onPostResume() {
        super.onPostResume();
        q().o();
    }

    @Override // g.l.b.p
    public void onStart() {
        super.onStart();
        q().q();
    }

    @Override // g.l.b.p
    public void onStop() {
        super.onStop();
        q().r();
    }

    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        q().y(charSequence);
    }

    public void openOptionsMenu() {
        r();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // g.l.b.p
    public void p() {
        q().j();
    }

    public i q() {
        if (this.q == null) {
            c<WeakReference<i>> cVar = i.e;
            this.q = new j(this, null, this, this);
        }
        return this.q;
    }

    public a r() {
        return q().h();
    }

    public Intent s() {
        return d.k(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i2) {
        l();
        q().u(i2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        l();
        q().v(view);
    }

    @Override // androidx.activity.ComponentActivity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        q().w(view, layoutParams);
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int i2) {
        super.setTheme(i2);
        q().x(i2);
    }

    public void t() {
    }

    public void u() {
    }

    public boolean v() {
        Intent k2 = d.k(this);
        if (k2 == null) {
            return false;
        }
        if (shouldUpRecreateTask(k2)) {
            ArrayList arrayList = new ArrayList();
            Intent s = s();
            if (s == null) {
                s = d.k(this);
            }
            if (s != null) {
                ComponentName component = s.getComponent();
                if (component == null) {
                    component = s.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                while (true) {
                    try {
                        Intent l2 = d.l(this, component);
                        if (l2 == null) {
                            break;
                        }
                        arrayList.add(size, l2);
                        component = l2.getComponent();
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e);
                    }
                }
                arrayList.add(s);
            }
            u();
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                Object obj = g.h.c.a.a;
                startActivities(intentArr, null);
                try {
                    int i2 = g.h.b.a.b;
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(k2);
            return true;
        }
    }
}
