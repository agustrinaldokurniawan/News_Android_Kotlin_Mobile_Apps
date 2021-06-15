package h.a.s.e.b;

import h.a.f;
import h.a.m;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l.b.b;
import l.b.c;

public final class m<T> extends a<T, T> {

    /* renamed from: g  reason: collision with root package name */
    public final h.a.m f3170g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3171h;

    public static final class a<T> extends AtomicReference<Thread> implements f<T>, c, Runnable {
        public final b<? super T> e;

        /* renamed from: f  reason: collision with root package name */
        public final m.b f3172f;

        /* renamed from: g  reason: collision with root package name */
        public final AtomicReference<c> f3173g = new AtomicReference<>();

        /* renamed from: h  reason: collision with root package name */
        public final AtomicLong f3174h = new AtomicLong();

        /* renamed from: i  reason: collision with root package name */
        public final boolean f3175i;

        /* renamed from: j  reason: collision with root package name */
        public l.b.a<T> f3176j;

        /* renamed from: h.a.s.e.b.m$a$a  reason: collision with other inner class name */
        public static final class RunnableC0108a implements Runnable {
            public final c e;

            /* renamed from: f  reason: collision with root package name */
            public final long f3177f;

            public RunnableC0108a(c cVar, long j2) {
                this.e = cVar;
                this.f3177f = j2;
            }

            public void run() {
                this.e.f(this.f3177f);
            }
        }

        public a(b<? super T> bVar, m.b bVar2, l.b.a<T> aVar, boolean z) {
            this.e = bVar;
            this.f3172f = bVar2;
            this.f3176j = aVar;
            this.f3175i = !z;
        }

        @Override // l.b.b
        public void a() {
            this.e.a();
            this.f3172f.e();
        }

        @Override // l.b.b
        public void b(Throwable th) {
            this.e.b(th);
            this.f3172f.e();
        }

        @Override // l.b.b
        public void c(T t) {
            this.e.c(t);
        }

        @Override // l.b.c
        public void cancel() {
            h.a.s.i.c.a(this.f3173g);
            this.f3172f.e();
        }

        public void d(long j2, c cVar) {
            if (this.f3175i || Thread.currentThread() == get()) {
                cVar.f(j2);
            } else {
                this.f3172f.b(new RunnableC0108a(cVar, j2));
            }
        }

        @Override // l.b.c
        public void f(long j2) {
            if (h.a.s.i.c.c(j2)) {
                c cVar = this.f3173g.get();
                if (cVar != null) {
                    d(j2, cVar);
                    return;
                }
                c.f.a.b.a(this.f3174h, j2);
                c cVar2 = this.f3173g.get();
                if (cVar2 != null) {
                    long andSet = this.f3174h.getAndSet(0);
                    if (andSet != 0) {
                        d(andSet, cVar2);
                    }
                }
            }
        }

        @Override // h.a.f, l.b.b
        public void g(c cVar) {
            if (h.a.s.i.c.b(this.f3173g, cVar)) {
                long andSet = this.f3174h.getAndSet(0);
                if (andSet != 0) {
                    d(andSet, cVar);
                }
            }
        }

        public void run() {
            lazySet(Thread.currentThread());
            l.b.a<T> aVar = this.f3176j;
            this.f3176j = null;
            aVar.b(this);
        }
    }

    public m(h.a.c<T> cVar, h.a.m mVar, boolean z) {
        super(cVar);
        this.f3170g = mVar;
        this.f3171h = z;
    }

    @Override // h.a.c
    public void g(b<? super T> bVar) {
        m.b a2 = this.f3170g.a();
        a aVar = new a(bVar, a2, this.f3094f, this.f3171h);
        bVar.g(aVar);
        a2.b(aVar);
    }
}
