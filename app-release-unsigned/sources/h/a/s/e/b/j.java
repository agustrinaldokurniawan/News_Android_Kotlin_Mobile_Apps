package h.a.s.e.b;

import h.a.f;
import h.a.r.b;
import java.util.concurrent.atomic.AtomicLong;
import l.b.c;

public final class j<T> extends a<T, T> implements b<T> {

    /* renamed from: g  reason: collision with root package name */
    public final b<? super T> f3158g = this;

    public static final class a<T> extends AtomicLong implements f<T>, c {
        public final l.b.b<? super T> e;

        /* renamed from: f  reason: collision with root package name */
        public final b<? super T> f3159f;

        /* renamed from: g  reason: collision with root package name */
        public c f3160g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3161h;

        public a(l.b.b<? super T> bVar, b<? super T> bVar2) {
            this.e = bVar;
            this.f3159f = bVar2;
        }

        @Override // l.b.b
        public void a() {
            if (!this.f3161h) {
                this.f3161h = true;
                this.e.a();
            }
        }

        @Override // l.b.b
        public void b(Throwable th) {
            if (this.f3161h) {
                h.a.t.a.M(th);
                return;
            }
            this.f3161h = true;
            this.e.b(th);
        }

        @Override // l.b.b
        public void c(T t) {
            if (!this.f3161h) {
                if (get() != 0) {
                    this.e.c(t);
                    c.f.a.b.d(this, 1);
                    return;
                }
                try {
                    this.f3159f.a(t);
                } catch (Throwable th) {
                    c.f.a.b.h(th);
                    this.f3160g.cancel();
                    b(th);
                }
            }
        }

        @Override // l.b.c
        public void cancel() {
            this.f3160g.cancel();
        }

        @Override // l.b.c
        public void f(long j2) {
            if (h.a.s.i.c.c(j2)) {
                c.f.a.b.a(this, j2);
            }
        }

        @Override // h.a.f, l.b.b
        public void g(c cVar) {
            if (h.a.s.i.c.d(this.f3160g, cVar)) {
                this.f3160g = cVar;
                this.e.g(this);
                cVar.f(Long.MAX_VALUE);
            }
        }
    }

    public j(h.a.c<T> cVar) {
        super(cVar);
    }

    @Override // h.a.r.b
    public void a(T t) {
    }

    @Override // h.a.c
    public void g(l.b.b<? super T> bVar) {
        this.f3094f.f(new a(bVar, this.f3158g));
    }
}
