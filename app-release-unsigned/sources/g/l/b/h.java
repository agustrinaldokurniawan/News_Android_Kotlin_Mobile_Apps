package g.l.b;

import g.e.a;
import g.l.b.x0;

public class h implements Runnable {
    public final /* synthetic */ x0.d e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x0.d f2688f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f2689g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f2690h;

    public h(c cVar, x0.d dVar, x0.d dVar2, boolean z, a aVar) {
        this.e = dVar;
        this.f2688f = dVar2;
        this.f2689g = z;
        this.f2690h = aVar;
    }

    public void run() {
        q0.c(this.e.f2787c, this.f2688f.f2787c, this.f2689g, this.f2690h, false);
    }
}
