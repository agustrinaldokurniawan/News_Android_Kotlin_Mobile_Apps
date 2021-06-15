package h.a.s.h;

import h.a.f;
import h.a.s.j.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l.b.b;
import l.b.c;

public class d<T> extends AtomicInteger implements f<T>, c {
    public final b<? super T> e;

    /* renamed from: f  reason: collision with root package name */
    public final a f3272f = new a();

    /* renamed from: g  reason: collision with root package name */
    public final AtomicLong f3273g = new AtomicLong();

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<c> f3274h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f3275i = new AtomicBoolean();

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f3276j;

    public d(b<? super T> bVar) {
        this.e = bVar;
    }

    @Override // l.b.b
    public void a() {
        this.f3276j = true;
        b<? super T> bVar = this.e;
        a aVar = this.f3272f;
        if (getAndIncrement() == 0) {
            Throwable b = aVar.b();
            if (b != null) {
                bVar.b(b);
            } else {
                bVar.a();
            }
        }
    }

    @Override // l.b.b
    public void b(Throwable th) {
        this.f3276j = true;
        b<? super T> bVar = this.e;
        a aVar = this.f3272f;
        if (!aVar.a(th)) {
            h.a.t.a.M(th);
        } else if (getAndIncrement() == 0) {
            bVar.b(aVar.b());
        }
    }

    @Override // l.b.b
    public void c(T t) {
        b<? super T> bVar = this.e;
        a aVar = this.f3272f;
        if (get() == 0 && compareAndSet(0, 1)) {
            bVar.c(t);
            if (decrementAndGet() != 0) {
                Throwable b = aVar.b();
                if (b != null) {
                    bVar.b(b);
                } else {
                    bVar.a();
                }
            }
        }
    }

    @Override // l.b.c
    public void cancel() {
        if (!this.f3276j) {
            h.a.s.i.c.a(this.f3274h);
        }
    }

    @Override // l.b.c
    public void f(long j2) {
        if (j2 <= 0) {
            cancel();
            b(new IllegalArgumentException(c.c.a.a.a.n("§3.9 violated: positive request amount required but it was ", j2)));
            return;
        }
        AtomicReference<c> atomicReference = this.f3274h;
        AtomicLong atomicLong = this.f3273g;
        c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.f(j2);
        } else if (h.a.s.i.c.c(j2)) {
            c.f.a.b.a(atomicLong, j2);
            c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    cVar2.f(andSet);
                }
            }
        }
    }

    @Override // h.a.f, l.b.b
    public void g(c cVar) {
        if (this.f3275i.compareAndSet(false, true)) {
            this.e.g(this);
            AtomicReference<c> atomicReference = this.f3274h;
            AtomicLong atomicLong = this.f3273g;
            if (h.a.s.i.c.b(atomicReference, cVar)) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    cVar.f(andSet);
                    return;
                }
                return;
            }
            return;
        }
        cVar.cancel();
        cancel();
        b(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }
}
