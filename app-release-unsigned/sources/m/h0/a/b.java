package m.h0.a;

import h.a.j;
import h.a.l;
import h.a.p.c;
import m.a0;
import m.d;

public final class b<T> extends j<a0<T>> {
    public final d<T> e;

    public static final class a implements c {
        public final d<?> e;

        /* renamed from: f  reason: collision with root package name */
        public volatile boolean f3826f;

        public a(d<?> dVar) {
            this.e = dVar;
        }

        @Override // h.a.p.c
        public void e() {
            this.f3826f = true;
            this.e.cancel();
        }
    }

    public b(d<T> dVar) {
        this.e = dVar;
    }

    @Override // h.a.j
    public void f(l<? super a0<T>> lVar) {
        boolean z;
        Throwable th;
        d<T> n = this.e.n();
        a aVar = new a(n);
        lVar.d(aVar);
        if (!aVar.f3826f) {
            try {
                a0<T> c2 = n.c();
                if (!aVar.f3826f) {
                    lVar.c(c2);
                }
                if (!aVar.f3826f) {
                    try {
                        lVar.a();
                    } catch (Throwable th2) {
                        th = th2;
                        z = true;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
                c.f.a.b.h(th);
                if (z) {
                    h.a.t.a.M(th);
                } else if (!aVar.f3826f) {
                    try {
                        lVar.b(th);
                    } catch (Throwable th4) {
                        c.f.a.b.h(th4);
                        h.a.t.a.M(new h.a.q.a(th, th4));
                    }
                }
            }
        }
    }
}
