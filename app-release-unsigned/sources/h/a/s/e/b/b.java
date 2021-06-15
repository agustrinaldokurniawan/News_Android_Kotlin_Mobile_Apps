package h.a.s.e.b;

import g.r.m;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class b<T> extends h.a.c<T> {

    /* renamed from: f  reason: collision with root package name */
    public final h.a.e<T> f3095f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3096g;

    public static abstract class a<T> extends AtomicLong implements h.a.d<T>, l.b.c {
        public final l.b.b<? super T> e;

        /* renamed from: f  reason: collision with root package name */
        public final h.a.s.a.e f3097f = new h.a.s.a.e();

        public a(l.b.b<? super T> bVar) {
            this.e = bVar;
        }

        public void a() {
            if (!d()) {
                try {
                    this.e.a();
                } finally {
                    h.a.s.a.b.a(this.f3097f);
                }
            }
        }

        /* JADX INFO: finally extract failed */
        public boolean b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (d()) {
                return false;
            }
            try {
                this.e.b(th);
                h.a.s.a.b.a(this.f3097f);
                return true;
            } catch (Throwable th2) {
                h.a.s.a.b.a(this.f3097f);
                throw th2;
            }
        }

        @Override // l.b.c
        public final void cancel() {
            h.a.s.a.b.a(this.f3097f);
            g();
        }

        public final boolean d() {
            return this.f3097f.a();
        }

        public void e() {
        }

        @Override // l.b.c
        public final void f(long j2) {
            if (h.a.s.i.c.c(j2)) {
                c.f.a.b.a(this, j2);
                e();
            }
        }

        public void g() {
        }

        public boolean h(Throwable th) {
            return b(th);
        }

        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    /* renamed from: h.a.s.e.b.b$b  reason: collision with other inner class name */
    public static final class C0106b<T> extends a<T> {

        /* renamed from: g  reason: collision with root package name */
        public final h.a.s.f.c<T> f3098g;

        /* renamed from: h  reason: collision with root package name */
        public Throwable f3099h;

        /* renamed from: i  reason: collision with root package name */
        public volatile boolean f3100i;

        /* renamed from: j  reason: collision with root package name */
        public final AtomicInteger f3101j = new AtomicInteger();

        public C0106b(l.b.b<? super T> bVar, int i2) {
            super(bVar);
            this.f3098g = new h.a.s.f.c<>(i2);
        }

        @Override // h.a.d
        public void c(T t) {
            if (!this.f3100i && !d()) {
                this.f3098g.i(t);
                i();
            }
        }

        @Override // h.a.s.e.b.b.a
        public void e() {
            i();
        }

        @Override // h.a.s.e.b.b.a
        public void g() {
            if (this.f3101j.getAndIncrement() == 0) {
                this.f3098g.clear();
            }
        }

        @Override // h.a.s.e.b.b.a
        public boolean h(Throwable th) {
            if (this.f3100i || d()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f3099h = th;
            this.f3100i = true;
            i();
            return true;
        }

        public void i() {
            int i2;
            if (this.f3101j.getAndIncrement() == 0) {
                l.b.b<? super T> bVar = this.e;
                h.a.s.f.c<T> cVar = this.f3098g;
                int i3 = 1;
                do {
                    long j2 = get();
                    long j3 = 0;
                    while (true) {
                        i2 = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
                        if (i2 == 0) {
                            break;
                        } else if (d()) {
                            cVar.clear();
                            return;
                        } else {
                            boolean z = this.f3100i;
                            T d2 = cVar.d();
                            boolean z2 = d2 == null;
                            if (z && z2) {
                                Throwable th = this.f3099h;
                                if (th != null) {
                                    b(th);
                                    return;
                                } else {
                                    a();
                                    return;
                                }
                            } else if (z2) {
                                break;
                            } else {
                                bVar.c(d2);
                                j3++;
                            }
                        }
                    }
                    if (i2 == 0) {
                        if (d()) {
                            cVar.clear();
                            return;
                        }
                        boolean z3 = this.f3100i;
                        boolean isEmpty = cVar.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.f3099h;
                            if (th2 != null) {
                                b(th2);
                                return;
                            } else {
                                a();
                                return;
                            }
                        }
                    }
                    if (j3 != 0) {
                        c.f.a.b.d(this, j3);
                    }
                    i3 = this.f3101j.addAndGet(-i3);
                } while (i3 != 0);
            }
        }
    }

    public static final class c<T> extends g<T> {
        public c(l.b.b<? super T> bVar) {
            super(bVar);
        }

        @Override // h.a.s.e.b.b.g
        public void i() {
        }
    }

    public static final class d<T> extends g<T> {
        public d(l.b.b<? super T> bVar) {
            super(bVar);
        }

        @Override // h.a.s.e.b.b.g
        public void i() {
            h.a.q.b bVar = new h.a.q.b("create: could not emit value due to lack of requests");
            if (!h(bVar)) {
                h.a.t.a.M(bVar);
            }
        }
    }

    public static final class e<T> extends a<T> {

        /* renamed from: g  reason: collision with root package name */
        public final AtomicReference<T> f3102g = new AtomicReference<>();

        /* renamed from: h  reason: collision with root package name */
        public Throwable f3103h;

        /* renamed from: i  reason: collision with root package name */
        public volatile boolean f3104i;

        /* renamed from: j  reason: collision with root package name */
        public final AtomicInteger f3105j = new AtomicInteger();

        public e(l.b.b<? super T> bVar) {
            super(bVar);
        }

        @Override // h.a.d
        public void c(T t) {
            if (!this.f3104i && !d()) {
                this.f3102g.set(t);
                i();
            }
        }

        @Override // h.a.s.e.b.b.a
        public void e() {
            i();
        }

        @Override // h.a.s.e.b.b.a
        public void g() {
            if (this.f3105j.getAndIncrement() == 0) {
                this.f3102g.lazySet(null);
            }
        }

        @Override // h.a.s.e.b.b.a
        public boolean h(Throwable th) {
            if (this.f3104i || d()) {
                return false;
            }
            if (th == null) {
                NullPointerException nullPointerException = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (!h(nullPointerException)) {
                    h.a.t.a.M(nullPointerException);
                }
            }
            this.f3103h = th;
            this.f3104i = true;
            i();
            return true;
        }

        public void i() {
            int i2;
            boolean z;
            if (this.f3105j.getAndIncrement() == 0) {
                l.b.b<? super T> bVar = this.e;
                AtomicReference<T> atomicReference = this.f3102g;
                int i3 = 1;
                do {
                    long j2 = get();
                    long j3 = 0;
                    while (true) {
                        i2 = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
                        z = false;
                        if (i2 == 0) {
                            break;
                        } else if (d()) {
                            atomicReference.lazySet(null);
                            return;
                        } else {
                            boolean z2 = this.f3104i;
                            T andSet = atomicReference.getAndSet(null);
                            boolean z3 = andSet == null;
                            if (z2 && z3) {
                                Throwable th = this.f3103h;
                                if (th != null) {
                                    b(th);
                                    return;
                                } else {
                                    a();
                                    return;
                                }
                            } else if (z3) {
                                break;
                            } else {
                                bVar.c(andSet);
                                j3++;
                            }
                        }
                    }
                    if (i2 == 0) {
                        if (d()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z4 = this.f3104i;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.f3103h;
                            if (th2 != null) {
                                b(th2);
                                return;
                            } else {
                                a();
                                return;
                            }
                        }
                    }
                    if (j3 != 0) {
                        c.f.a.b.d(this, j3);
                    }
                    i3 = this.f3105j.addAndGet(-i3);
                } while (i3 != 0);
            }
        }
    }

    public static final class f<T> extends a<T> {
        public f(l.b.b<? super T> bVar) {
            super(bVar);
        }

        @Override // h.a.d
        public void c(T t) {
            long j2;
            if (!d()) {
                this.e.c(t);
                do {
                    j2 = get();
                    if (j2 == 0) {
                        return;
                    }
                } while (!compareAndSet(j2, j2 - 1));
            }
        }
    }

    public static abstract class g<T> extends a<T> {
        public g(l.b.b<? super T> bVar) {
            super(bVar);
        }

        @Override // h.a.d
        public final void c(T t) {
            if (!d()) {
                if (get() != 0) {
                    this.e.c(t);
                    c.f.a.b.d(this, 1);
                    return;
                }
                i();
            }
        }

        public abstract void i();
    }

    /* JADX WARN: Incorrect types in method signature: (Lh/a/e<TT;>;Ljava/lang/Object;)V */
    public b(h.a.e eVar, int i2) {
        this.f3095f = eVar;
        this.f3096g = i2;
    }

    @Override // h.a.c
    public void g(l.b.b<? super T> bVar) {
        int f2 = g.f.c.g.f(this.f3096g);
        a bVar2 = f2 != 0 ? f2 != 1 ? f2 != 3 ? f2 != 4 ? new C0106b(bVar, h.a.c.e) : new e(bVar) : new c(bVar) : new d(bVar) : new f(bVar);
        bVar.g(bVar2);
        try {
            ((m) this.f3095f).a(bVar2);
        } catch (Throwable th) {
            c.f.a.b.h(th);
            if (!bVar2.h(th)) {
                h.a.t.a.M(th);
            }
        }
    }
}
