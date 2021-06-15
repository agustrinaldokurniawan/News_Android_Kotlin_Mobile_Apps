package g.b.c;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import g.e.c;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class i {
    public static final c<WeakReference<i>> e = new c<>();

    /* renamed from: f  reason: collision with root package name */
    public static final Object f1867f = new Object();

    public static void s(i iVar) {
        synchronized (f1867f) {
            Iterator<WeakReference<i>> it = e.iterator();
            while (it.hasNext()) {
                i iVar2 = it.next().get();
                if (iVar2 == iVar || iVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public Context d(Context context) {
        return context;
    }

    public abstract <T extends View> T e(int i2);

    public int f() {
        return -100;
    }

    public abstract MenuInflater g();

    public abstract a h();

    public abstract void i();

    public abstract void j();

    public abstract void k(Configuration configuration);

    public abstract void l(Bundle bundle);

    public abstract void m();

    public abstract void n(Bundle bundle);

    public abstract void o();

    public abstract void p(Bundle bundle);

    public abstract void q();

    public abstract void r();

    public abstract boolean t(int i2);

    public abstract void u(int i2);

    public abstract void v(View view);

    public abstract void w(View view, ViewGroup.LayoutParams layoutParams);

    public void x(int i2) {
    }

    public abstract void y(CharSequence charSequence);
}
