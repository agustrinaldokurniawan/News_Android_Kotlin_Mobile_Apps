package g.h.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import g.h.j.e;
import g.n.e;
import g.n.i;
import g.n.j;
import g.n.r;

public class e extends Activity implements i, e.a {
    public j e = new j(this);

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !g.h.j.e.a(decorView, keyEvent)) {
            return g.h.j.e.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !g.h.j.e.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // g.h.j.e.a
    public boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r.c(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        j jVar = this.e;
        e.b bVar = e.b.CREATED;
        jVar.d("markState");
        jVar.d("setCurrentState");
        jVar.g(bVar);
        super.onSaveInstanceState(bundle);
    }
}
