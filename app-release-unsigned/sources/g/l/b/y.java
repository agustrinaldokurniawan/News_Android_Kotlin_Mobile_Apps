package g.l.b;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import g.h.b.d;

public abstract class y<E> extends v {
    public final Activity e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f2798f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f2799g;

    /* renamed from: h  reason: collision with root package name */
    public final b0 f2800h = new c0();

    public y(p pVar) {
        Handler handler = new Handler();
        this.e = pVar;
        d.e(pVar, "context == null");
        this.f2798f = pVar;
        d.e(handler, "handler == null");
        this.f2799g = handler;
    }

    public abstract E i();

    public abstract LayoutInflater j();

    public abstract boolean k(m mVar);

    public abstract void l();
}
