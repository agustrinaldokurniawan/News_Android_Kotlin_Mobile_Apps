package h.a.s.e.a;

import h.a.a;
import h.a.b;
import h.a.s.a.e;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends AtomicReference<h.a.p.c> implements b, h.a.p.c, Runnable {
    public final b e;

    /* renamed from: f  reason: collision with root package name */
    public final e f3092f = new e();

    /* renamed from: g  reason: collision with root package name */
    public final a f3093g;

    public c(b bVar, a aVar) {
        this.e = bVar;
        this.f3093g = aVar;
    }

    @Override // h.a.b
    public void a() {
        this.e.a();
    }

    @Override // h.a.b
    public void b(Throwable th) {
        this.e.b(th);
    }

    @Override // h.a.b
    public void d(h.a.p.c cVar) {
        h.a.s.a.b.d(this, cVar);
    }

    @Override // h.a.p.c
    public void e() {
        h.a.s.a.b.a(this);
        this.f3092f.e();
    }

    public void run() {
        this.f3093g.a(this);
    }
}
