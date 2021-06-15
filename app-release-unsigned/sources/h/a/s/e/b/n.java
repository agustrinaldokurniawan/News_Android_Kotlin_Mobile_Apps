package h.a.s.e.b;

import h.a.f;
import java.util.concurrent.atomic.AtomicBoolean;
import l.b.b;
import l.b.c;

public final class n<T> extends a<T, T> {

    /* renamed from: g  reason: collision with root package name */
    public final long f3178g;

    public static final class a<T> extends AtomicBoolean implements f<T>, c {
        public final b<? super T> e;

        /* renamed from: f  reason: collision with root package name */
        public final long f3179f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f3180g;

        /* renamed from: h  reason: collision with root package name */
        public c f3181h;

        /* renamed from: i  reason: collision with root package name */
        public long f3182i;

        public a(b<? super T> bVar, long j2) {
            this.e = bVar;
            this.f3179f = j2;
            this.f3182i = j2;
        }

        @Override // l.b.b
        public void a() {
            if (!this.f3180g) {
                this.f3180g = true;
                this.e.a();
            }
        }

        @Override // l.b.b
        public void b(Throwable th) {
            if (!this.f3180g) {
                this.f3180g = true;
                this.f3181h.cancel();
                this.e.b(th);
                return;
            }
            h.a.t.a.M(th);
        }

        @Override // l.b.b
        public void c(T t) {
            if (!this.f3180g) {
                long j2 = this.f3182i;
                long j3 = j2 - 1;
                this.f3182i = j3;
                if (j2 > 0) {
                    boolean z = j3 == 0;
                    this.e.c(t);
                    if (z) {
                        this.f3181h.cancel();
                        a();
                    }
                }
            }
        }

        @Override // l.b.c
        public void cancel() {
            this.f3181h.cancel();
        }

        @Override // l.b.c
        public void f(long j2) {
            if (h.a.s.i.c.c(j2)) {
                if (get() || !compareAndSet(false, true) || j2 < this.f3179f) {
                    this.f3181h.f(j2);
                } else {
                    this.f3181h.f(Long.MAX_VALUE);
                }
            }
        }

        @Override // h.a.f, l.b.b
        public void g(c cVar) {
            if (h.a.s.i.c.d(this.f3181h, cVar)) {
                this.f3181h = cVar;
                if (this.f3179f == 0) {
                    cVar.cancel();
                    this.f3180g = true;
                    b<? super T> bVar = this.e;
                    bVar.g(h.a.s.i.b.INSTANCE);
                    bVar.a();
                    return;
                }
                this.e.g(this);
            }
        }
    }

    public n(h.a.c<T> cVar, long j2) {
        super(cVar);
        this.f3178g = j2;
    }

    @Override // h.a.c
    public void g(b<? super T> bVar) {
        this.f3094f.f(new a(bVar, this.f3178g));
    }
}
