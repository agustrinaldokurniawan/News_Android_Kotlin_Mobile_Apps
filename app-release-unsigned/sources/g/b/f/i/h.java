package g.b.f.i;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.b.c.d;
import g.b.f.i.e;
import g.b.f.i.m;

public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {
    public g e;

    /* renamed from: f  reason: collision with root package name */
    public d f1997f;

    /* renamed from: g  reason: collision with root package name */
    public e f1998g;

    public h(g gVar) {
        this.e = gVar;
    }

    @Override // g.b.f.i.m.a
    public void a(g gVar, boolean z) {
        d dVar;
        if ((z || gVar == this.e) && (dVar = this.f1997f) != null) {
            dVar.dismiss();
        }
    }

    @Override // g.b.f.i.m.a
    public boolean b(g gVar) {
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        this.e.r(((e.a) this.f1998g.b()).getItem(i2), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        e eVar = this.f1998g;
        g gVar = this.e;
        m.a aVar = eVar.f1979i;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
    }

    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1997f.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1997f.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.e.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.e.performShortcut(i2, keyEvent, 0);
    }
}
