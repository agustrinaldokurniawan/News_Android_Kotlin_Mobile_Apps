package h.a;

import h.a.s.e.b.g;
import h.a.s.e.b.h;
import h.a.s.e.b.m;
import h.a.s.e.b.n;
import h.a.s.e.b.o;
import h.a.s.h.d;
import java.util.Objects;
import l.b.a;
import l.b.b;

public abstract class c<T> implements a<T> {
    public static final int e = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @Override // l.b.a
    public final void b(b<? super T> bVar) {
        if (bVar instanceof f) {
            f((f) bVar);
        } else {
            f(new d(bVar));
        }
    }

    public final <R> c<R> c(h.a.r.c<? super T, ? extends R> cVar) {
        return new g(this, cVar);
    }

    public final c<T> d(m mVar) {
        int i2 = e;
        h.a.s.b.b.a(i2, "bufferSize");
        return new h(this, mVar, false, i2);
    }

    public final h.a.p.c e(h.a.r.b<? super T> bVar, h.a.r.b<? super Throwable> bVar2, h.a.r.a aVar, h.a.r.b<? super l.b.c> bVar3) {
        Objects.requireNonNull(bVar, "onNext is null");
        Objects.requireNonNull(bVar2, "onError is null");
        h.a.s.h.c cVar = new h.a.s.h.c(bVar, bVar2, aVar, bVar3);
        f(cVar);
        return cVar;
    }

    public final void f(f<? super T> fVar) {
        Objects.requireNonNull(fVar, "s is null");
        try {
            g(fVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            c.f.a.b.h(th);
            h.a.t.a.M(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void g(b<? super T> bVar);

    public final c<T> h(m mVar) {
        Objects.requireNonNull(mVar, "scheduler is null");
        return new m(this, mVar, !(this instanceof h.a.s.e.b.b));
    }

    public final c<T> i(long j2) {
        if (j2 >= 0) {
            return new n(this, j2);
        }
        throw new IllegalArgumentException(c.c.a.a.a.n("count >= 0 required but it was ", j2));
    }

    public final c<T> j(m mVar) {
        Objects.requireNonNull(mVar, "scheduler is null");
        return new o(this, mVar);
    }
}
