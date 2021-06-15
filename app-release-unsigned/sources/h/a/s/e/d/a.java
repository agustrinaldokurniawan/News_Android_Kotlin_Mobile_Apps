package h.a.s.e.d;

import h.a.b;
import h.a.j;
import h.a.k;
import h.a.l;
import h.a.p.c;

public final class a<T> extends h.a.a {
    public final k<T> a;

    /* renamed from: h.a.s.e.d.a$a  reason: collision with other inner class name */
    public static final class C0110a<T> implements l<T>, c {
        public final b e;

        /* renamed from: f  reason: collision with root package name */
        public c f3186f;

        public C0110a(b bVar) {
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
        }

        @Override // h.a.l
        public void d(c cVar) {
            this.f3186f = cVar;
            this.e.d(this);
        }

        @Override // h.a.p.c
        public void e() {
            this.f3186f.e();
        }
    }

    public a(k<T> kVar) {
        this.a = kVar;
    }

    @Override // h.a.a
    public void b(b bVar) {
        ((j) this.a).e(new C0110a(bVar));
    }
}
