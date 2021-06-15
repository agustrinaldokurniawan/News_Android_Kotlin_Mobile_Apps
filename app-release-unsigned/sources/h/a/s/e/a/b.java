package h.a.s.e.a;

import h.a.m;
import h.a.p.c;
import java.util.concurrent.atomic.AtomicReference;

public final class b extends AtomicReference<c> implements h.a.b, c, Runnable {
    public final h.a.b e;

    /* renamed from: f  reason: collision with root package name */
    public final m f3090f;

    /* renamed from: g  reason: collision with root package name */
    public Throwable f3091g;

    public b(h.a.b bVar, m mVar) {
        this.e = bVar;
        this.f3090f = mVar;
    }

    @Override // h.a.b
    public void a() {
        h.a.s.a.b.c(this, this.f3090f.b(this));
    }

    @Override // h.a.b
    public void b(Throwable th) {
        this.f3091g = th;
        h.a.s.a.b.c(this, this.f3090f.b(this));
    }

    @Override // h.a.b
    public void d(c cVar) {
        if (h.a.s.a.b.d(this, cVar)) {
            this.e.d(this);
        }
    }

    @Override // h.a.p.c
    public void e() {
        h.a.s.a.b.a(this);
    }

    public void run() {
        Throwable th = this.f3091g;
        if (th != null) {
            this.f3091g = null;
            this.e.b(th);
            return;
        }
        this.e.a();
    }
}
