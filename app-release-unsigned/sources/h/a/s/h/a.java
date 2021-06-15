package h.a.s.h;

import c.f.a.b;
import h.a.s.c.c;

public abstract class a<T, R> implements h.a.s.c.a<T>, c<R> {
    public final h.a.s.c.a<? super R> e;

    /* renamed from: f  reason: collision with root package name */
    public l.b.c f3261f;

    /* renamed from: g  reason: collision with root package name */
    public c<T> f3262g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3263h;

    /* renamed from: i  reason: collision with root package name */
    public int f3264i;

    public a(h.a.s.c.a<? super R> aVar) {
        this.e = aVar;
    }

    @Override // l.b.b
    public void a() {
        if (!this.f3263h) {
            this.f3263h = true;
            this.e.a();
        }
    }

    @Override // l.b.b
    public void b(Throwable th) {
        if (this.f3263h) {
            h.a.t.a.M(th);
            return;
        }
        this.f3263h = true;
        this.e.b(th);
    }

    @Override // l.b.c
    public void cancel() {
        this.f3261f.cancel();
    }

    @Override // h.a.s.c.e
    public void clear() {
        this.f3262g.clear();
    }

    public final void e(Throwable th) {
        b.h(th);
        this.f3261f.cancel();
        b(th);
    }

    @Override // l.b.c
    public void f(long j2) {
        this.f3261f.f(j2);
    }

    @Override // h.a.f, l.b.b
    public final void g(l.b.c cVar) {
        if (h.a.s.i.c.d(this.f3261f, cVar)) {
            this.f3261f = cVar;
            if (cVar instanceof c) {
                this.f3262g = (c) cVar;
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
        return this.f3262g.isEmpty();
    }

    public final int k(int i2) {
        c<T> cVar = this.f3262g;
        if (cVar == null || (i2 & 4) != 0) {
            return 0;
        }
        int j2 = cVar.j(i2);
        if (j2 != 0) {
            this.f3264i = j2;
        }
        return j2;
    }
}
