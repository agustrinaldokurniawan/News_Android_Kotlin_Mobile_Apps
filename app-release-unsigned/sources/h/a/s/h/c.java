package h.a.s.h;

import h.a.f;
import h.a.r.a;
import h.a.r.b;
import java.util.concurrent.atomic.AtomicReference;

public final class c<T> extends AtomicReference<l.b.c> implements f<T>, l.b.c, h.a.p.c {
    public final b<? super T> e;

    /* renamed from: f  reason: collision with root package name */
    public final b<? super Throwable> f3269f;

    /* renamed from: g  reason: collision with root package name */
    public final a f3270g;

    /* renamed from: h  reason: collision with root package name */
    public final b<? super l.b.c> f3271h;

    public c(b<? super T> bVar, b<? super Throwable> bVar2, a aVar, b<? super l.b.c> bVar3) {
        this.e = bVar;
        this.f3269f = bVar2;
        this.f3270g = aVar;
        this.f3271h = bVar3;
    }

    @Override // l.b.b
    public void a() {
        Object obj = get();
        h.a.s.i.c cVar = h.a.s.i.c.CANCELLED;
        if (obj != cVar) {
            lazySet(cVar);
            try {
                this.f3270g.run();
            } catch (Throwable th) {
                c.f.a.b.h(th);
                h.a.t.a.M(th);
            }
        }
    }

    @Override // l.b.b
    public void b(Throwable th) {
        Object obj = get();
        h.a.s.i.c cVar = h.a.s.i.c.CANCELLED;
        if (obj != cVar) {
            lazySet(cVar);
            try {
                this.f3269f.a(th);
            } catch (Throwable th2) {
                c.f.a.b.h(th2);
                h.a.t.a.M(new h.a.q.a(th, th2));
            }
        } else {
            h.a.t.a.M(th);
        }
    }

    @Override // l.b.b
    public void c(T t) {
        if (!d()) {
            try {
                this.e.a(t);
            } catch (Throwable th) {
                c.f.a.b.h(th);
                ((l.b.c) get()).cancel();
                b(th);
            }
        }
    }

    @Override // l.b.c
    public void cancel() {
        h.a.s.i.c.a(this);
    }

    public boolean d() {
        return get() == h.a.s.i.c.CANCELLED;
    }

    @Override // h.a.p.c
    public void e() {
        h.a.s.i.c.a(this);
    }

    @Override // l.b.c
    public void f(long j2) {
        ((l.b.c) get()).f(j2);
    }

    @Override // h.a.f, l.b.b
    public void g(l.b.c cVar) {
        if (h.a.s.i.c.b(this, cVar)) {
            try {
                this.f3271h.a(this);
            } catch (Throwable th) {
                c.f.a.b.h(th);
                cVar.cancel();
                b(th);
            }
        }
    }
}
