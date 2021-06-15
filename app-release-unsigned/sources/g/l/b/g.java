package g.l.b;

import android.view.View;
import android.view.ViewGroup;
import g.h.f.a;
import g.l.b.c;

public class g implements a.AbstractC0074a {
    public final /* synthetic */ View a;
    public final /* synthetic */ ViewGroup b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.b f2679c;

    public g(c cVar, View view, ViewGroup viewGroup, c.b bVar) {
        this.a = view;
        this.b = viewGroup;
        this.f2679c = bVar;
    }

    @Override // g.h.f.a.AbstractC0074a
    public void a() {
        this.a.clearAnimation();
        this.b.endViewTransition(this.a);
        this.f2679c.a();
    }
}
