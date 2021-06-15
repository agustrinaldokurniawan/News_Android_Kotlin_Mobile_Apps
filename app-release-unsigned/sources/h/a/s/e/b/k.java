package h.a.s.e.b;

import h.a.f;
import java.util.concurrent.atomic.AtomicLong;
import l.b.b;
import l.b.c;

public final class k<T> extends a<T, T> {

    public static final class a<T> extends AtomicLong implements f<T>, c {
        public final b<? super T> e;

        /* renamed from: f  reason: collision with root package name */
        public c f3162f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f3163g;

        public a(b<? super T> bVar) {
            this.e = bVar;
        }

        @Override // l.b.b
        public void a() {
            if (!this.f3163g) {
                this.f3163g = true;
                this.e.a();
            }
        }

        @Override // l.b.b
        public void b(Throwable th) {
            if (this.f3163g) {
                h.a.t.a.M(th);
                return;
            }
            this.f3163g = true;
            this.e.b(th);
        }

        @Override // l.b.b
        public void c(T t) {
            if (!this.f3163g) {
                if (get() != 0) {
                    this.e.c(t);
                    c.f.a.b.d(this, 1);
                    return;
                }
                b(new h.a.q.b("could not emit value due to lack of requests"));
            }
        }

        @Override // l.b.c
        public void cancel() {
            this.f3162f.cancel();
        }

        @Override // l.b.c
        public void f(long j2) {
            if (h.a.s.i.c.c(j2)) {
                c.f.a.b.a(this, j2);
            }
        }

        @Override // h.a.f, l.b.b
        public void g(c cVar) {
            if (h.a.s.i.c.d(this.f3162f, cVar)) {
                this.f3162f = cVar;
                this.e.g(this);
                cVar.f(Long.MAX_VALUE);
            }
        }
    }

    public k(h.a.c<T> cVar) {
        super(cVar);
    }

    @Override // h.a.c
    public void g(b<? super T> bVar) {
        this.f3094f.f(new a(bVar));
    }
}
