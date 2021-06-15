package h.a.s.e.b;

import h.a.f;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l.b.b;
import l.b.c;

public final class l<T> extends a<T, T> {

    public static final class a<T> extends AtomicInteger implements f<T>, c {
        public final b<? super T> e;

        /* renamed from: f  reason: collision with root package name */
        public c f3164f;

        /* renamed from: g  reason: collision with root package name */
        public volatile boolean f3165g;

        /* renamed from: h  reason: collision with root package name */
        public Throwable f3166h;

        /* renamed from: i  reason: collision with root package name */
        public volatile boolean f3167i;

        /* renamed from: j  reason: collision with root package name */
        public final AtomicLong f3168j = new AtomicLong();

        /* renamed from: k  reason: collision with root package name */
        public final AtomicReference<T> f3169k = new AtomicReference<>();

        public a(b<? super T> bVar) {
            this.e = bVar;
        }

        @Override // l.b.b
        public void a() {
            this.f3165g = true;
            e();
        }

        @Override // l.b.b
        public void b(Throwable th) {
            this.f3166h = th;
            this.f3165g = true;
            e();
        }

        @Override // l.b.b
        public void c(T t) {
            this.f3169k.lazySet(t);
            e();
        }

        @Override // l.b.c
        public void cancel() {
            if (!this.f3167i) {
                this.f3167i = true;
                this.f3164f.cancel();
                if (getAndIncrement() == 0) {
                    this.f3169k.lazySet(null);
                }
            }
        }

        public boolean d(boolean z, boolean z2, b<?> bVar, AtomicReference<T> atomicReference) {
            if (this.f3167i) {
                atomicReference.lazySet(null);
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.f3166h;
                if (th != null) {
                    atomicReference.lazySet(null);
                    bVar.b(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    bVar.a();
                    return true;
                }
            }
        }

        public void e() {
            boolean z;
            if (getAndIncrement() == 0) {
                b<? super T> bVar = this.e;
                AtomicLong atomicLong = this.f3168j;
                AtomicReference<T> atomicReference = this.f3169k;
                int i2 = 1;
                do {
                    long j2 = 0;
                    while (true) {
                        z = false;
                        if (j2 == atomicLong.get()) {
                            break;
                        }
                        boolean z2 = this.f3165g;
                        T andSet = atomicReference.getAndSet(null);
                        boolean z3 = andSet == null;
                        if (!d(z2, z3, bVar, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            bVar.c(andSet);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 == atomicLong.get()) {
                        boolean z4 = this.f3165g;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (d(z4, z, bVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j2 != 0) {
                        c.f.a.b.d(atomicLong, j2);
                    }
                    i2 = addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        @Override // l.b.c
        public void f(long j2) {
            if (h.a.s.i.c.c(j2)) {
                c.f.a.b.a(this.f3168j, j2);
                e();
            }
        }

        @Override // h.a.f, l.b.b
        public void g(c cVar) {
            if (h.a.s.i.c.d(this.f3164f, cVar)) {
                this.f3164f = cVar;
                this.e.g(this);
                cVar.f(Long.MAX_VALUE);
            }
        }
    }

    public l(h.a.c<T> cVar) {
        super(cVar);
    }

    @Override // h.a.c
    public void g(b<? super T> bVar) {
        this.f3094f.f(new a(bVar));
    }
}
