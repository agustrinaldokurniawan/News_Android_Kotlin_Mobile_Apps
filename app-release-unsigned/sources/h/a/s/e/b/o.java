package h.a.s.e.b;

import h.a.f;
import h.a.m;
import java.util.concurrent.atomic.AtomicBoolean;
import l.b.b;
import l.b.c;

public final class o<T> extends a<T, T> {

    /* renamed from: g  reason: collision with root package name */
    public final m f3183g;

    public static final class a<T> extends AtomicBoolean implements f<T>, c {
        public final b<? super T> e;

        /* renamed from: f  reason: collision with root package name */
        public final m f3184f;

        /* renamed from: g  reason: collision with root package name */
        public c f3185g;

        /* renamed from: h.a.s.e.b.o$a$a  reason: collision with other inner class name */
        public final class RunnableC0109a implements Runnable {
            public RunnableC0109a() {
            }

            public void run() {
                a.this.f3185g.cancel();
            }
        }

        public a(b<? super T> bVar, m mVar) {
            this.e = bVar;
            this.f3184f = mVar;
        }

        @Override // l.b.b
        public void a() {
            if (!get()) {
                this.e.a();
            }
        }

        @Override // l.b.b
        public void b(Throwable th) {
            if (get()) {
                h.a.t.a.M(th);
            } else {
                this.e.b(th);
            }
        }

        @Override // l.b.b
        public void c(T t) {
            if (!get()) {
                this.e.c(t);
            }
        }

        @Override // l.b.c
        public void cancel() {
            if (compareAndSet(false, true)) {
                this.f3184f.b(new RunnableC0109a());
            }
        }

        @Override // l.b.c
        public void f(long j2) {
            this.f3185g.f(j2);
        }

        @Override // h.a.f, l.b.b
        public void g(c cVar) {
            if (h.a.s.i.c.d(this.f3185g, cVar)) {
                this.f3185g = cVar;
                this.e.g(this);
            }
        }
    }

    public o(h.a.c<T> cVar, m mVar) {
        super(cVar);
        this.f3183g = mVar;
    }

    @Override // h.a.c
    public void g(b<? super T> bVar) {
        this.f3094f.f(new a(bVar, this.f3183g));
    }
}
