package h.a.s.e.b;

import h.a.c;
import h.a.j;
import h.a.l;
import l.b.b;

public final class e<T> extends c<T> {

    /* renamed from: f  reason: collision with root package name */
    public final j<T> f3129f;

    public static final class a<T> implements l<T>, l.b.c {
        public final b<? super T> e;

        /* renamed from: f  reason: collision with root package name */
        public h.a.p.c f3130f;

        public a(b<? super T> bVar) {
            this.e = bVar;
        }

        @Override // h.a.l
        public void a() {
            this.e.a();
        }

        @Override // h.a.l
        public void b(Throwable th) {
            this.e.b(th);
        }

        @Override // h.a.l
        public void c(T t) {
            this.e.c(t);
        }

        @Override // l.b.c
        public void cancel() {
            this.f3130f.e();
        }

        @Override // h.a.l
        public void d(h.a.p.c cVar) {
            this.f3130f = cVar;
            this.e.g(this);
        }

        @Override // l.b.c
        public void f(long j2) {
        }
    }

    public e(j<T> jVar) {
        this.f3129f = jVar;
    }

    @Override // h.a.c
    public void g(b<? super T> bVar) {
        this.f3129f.e(new a(bVar));
    }
}
