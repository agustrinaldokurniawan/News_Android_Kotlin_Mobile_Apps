package h.a.s.h;

import h.a.f;
import h.a.s.c.c;
import h.a.t.a;

public abstract class b<T, R> implements f<T>, c<R> {
    public final l.b.b<? super R> e;

    /* renamed from: f  reason: collision with root package name */
    public l.b.c f3265f;

    /* renamed from: g  reason: collision with root package name */
    public c<T> f3266g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3267h;

    /* renamed from: i  reason: collision with root package name */
    public int f3268i;

    public b(l.b.b<? super R> bVar) {
        this.e = bVar;
    }

    @Override // l.b.b
    public void a() {
        if (!this.f3267h) {
            this.f3267h = true;
            this.e.a();
        }
    }

    @Override // l.b.b
    public void b(Throwable th) {
        if (this.f3267h) {
            a.M(th);
            return;
        }
        this.f3267h = true;
        this.e.b(th);
    }

    @Override // l.b.c
    public void cancel() {
        this.f3265f.cancel();
    }

    @Override // h.a.s.c.e
    public void clear() {
        this.f3266g.clear();
    }

    public final void e(Throwable th) {
        c.f.a.b.h(th);
        this.f3265f.cancel();
        b(th);
    }

    @Override // l.b.c
    public void f(long j2) {
        this.f3265f.f(j2);
    }

    @Override // h.a.f, l.b.b
    public final void g(l.b.c cVar) {
        if (h.a.s.i.c.d(this.f3265f, cVar)) {
            this.f3265f = cVar;
            if (cVar instanceof c) {
                this.f3266g = (c) cVar;
            }
            this.e.g(this);
        }
    }

    @Override // h.a.s.c.e
    public final boolean i(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // h.a.s.c.e
    public boolean isEmpty() {
        return this.f3266g.isEmpty();
    }

    public final int k(int i2) {
        c<T> cVar = this.f3266g;
        if (cVar == null || (i2 & 4) != 0) {
            return 0;
        }
        int j2 = cVar.j(i2);
        if (j2 != 0) {
            this.f3268i = j2;
        }
        return j2;
    }
}
