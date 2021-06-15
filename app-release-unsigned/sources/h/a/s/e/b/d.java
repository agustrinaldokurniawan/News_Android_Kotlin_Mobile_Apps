package h.a.s.e.b;

import h.a.f;
import h.a.h;
import h.a.i;
import h.a.r.c;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l.b.b;

public final class d<T, R> extends a<T, R> {

    /* renamed from: g  reason: collision with root package name */
    public final c<? super T, ? extends i<? extends R>> f3118g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3119h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3120i;

    public static final class a<T, R> extends AtomicInteger implements f<T>, l.b.c {
        public final b<? super R> e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f3121f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3122g;

        /* renamed from: h  reason: collision with root package name */
        public final AtomicLong f3123h = new AtomicLong();

        /* renamed from: i  reason: collision with root package name */
        public final h.a.p.b f3124i = new h.a.p.b();

        /* renamed from: j  reason: collision with root package name */
        public final AtomicInteger f3125j = new AtomicInteger(1);

        /* renamed from: k  reason: collision with root package name */
        public final h.a.s.j.a f3126k = new h.a.s.j.a();

        /* renamed from: l  reason: collision with root package name */
        public final c<? super T, ? extends i<? extends R>> f3127l;

        /* renamed from: m  reason: collision with root package name */
        public final AtomicReference<h.a.s.f.c<R>> f3128m = new AtomicReference<>();
        public l.b.c n;
        public volatile boolean o;

        /* renamed from: h.a.s.e.b.d$a$a  reason: collision with other inner class name */
        public final class C0107a extends AtomicReference<h.a.p.c> implements h<R>, h.a.p.c {
            public C0107a() {
            }

            @Override // h.a.h
            public void a() {
                a aVar = a.this;
                aVar.f3124i.a(this);
                if (aVar.get() == 0) {
                    boolean z = false;
                    if (aVar.compareAndSet(0, 1)) {
                        if (aVar.f3125j.decrementAndGet() == 0) {
                            z = true;
                        }
                        h.a.s.f.c<R> cVar = aVar.f3128m.get();
                        if (!z || (cVar != null && !cVar.isEmpty())) {
                            if (aVar.f3122g != Integer.MAX_VALUE) {
                                aVar.n.f(1);
                            }
                            if (aVar.decrementAndGet() != 0) {
                                aVar.i();
                                return;
                            }
                            return;
                        }
                        Throwable b = aVar.f3126k.b();
                        b<? super R> bVar = aVar.e;
                        if (b != null) {
                            bVar.b(b);
                            return;
                        } else {
                            bVar.a();
                            return;
                        }
                    }
                }
                aVar.f3125j.decrementAndGet();
                if (aVar.f3122g != Integer.MAX_VALUE) {
                    aVar.n.f(1);
                }
                aVar.e();
            }

            @Override // h.a.h
            public void b(Throwable th) {
                a aVar = a.this;
                aVar.f3124i.a(this);
                if (aVar.f3126k.a(th)) {
                    if (!aVar.f3121f) {
                        aVar.n.cancel();
                        aVar.f3124i.e();
                    } else if (aVar.f3122g != Integer.MAX_VALUE) {
                        aVar.n.f(1);
                    }
                    aVar.f3125j.decrementAndGet();
                    aVar.e();
                    return;
                }
                h.a.t.a.M(th);
            }

            @Override // h.a.h
            public void c(R r) {
                a aVar = a.this;
                aVar.f3124i.a(this);
                if (aVar.get() == 0) {
                    boolean z = false;
                    if (aVar.compareAndSet(0, 1)) {
                        if (aVar.f3125j.decrementAndGet() == 0) {
                            z = true;
                        }
                        if (aVar.f3123h.get() != 0) {
                            aVar.e.c(r);
                            h.a.s.f.c<R> cVar = aVar.f3128m.get();
                            if (!z || (cVar != null && !cVar.isEmpty())) {
                                c.f.a.b.d(aVar.f3123h, 1);
                                if (aVar.f3122g != Integer.MAX_VALUE) {
                                    aVar.n.f(1);
                                }
                            } else {
                                Throwable b = aVar.f3126k.b();
                                if (b != null) {
                                    aVar.e.b(b);
                                    return;
                                } else {
                                    aVar.e.a();
                                    return;
                                }
                            }
                        } else {
                            h.a.s.f.c<R> j2 = aVar.j();
                            synchronized (j2) {
                                j2.i(r);
                            }
                        }
                        if (aVar.decrementAndGet() == 0) {
                            return;
                        }
                        aVar.i();
                    }
                }
                h.a.s.f.c<R> j3 = aVar.j();
                synchronized (j3) {
                    j3.i(r);
                }
                aVar.f3125j.decrementAndGet();
                if (aVar.getAndIncrement() != 0) {
                    return;
                }
                aVar.i();
            }

            @Override // h.a.h
            public void d(h.a.p.c cVar) {
                h.a.s.a.b.d(this, cVar);
            }

            @Override // h.a.p.c
            public void e() {
                h.a.s.a.b.a(this);
            }
        }

        public a(b<? super R> bVar, c<? super T, ? extends i<? extends R>> cVar, boolean z, int i2) {
            this.e = bVar;
            this.f3127l = cVar;
            this.f3121f = z;
            this.f3122g = i2;
        }

        @Override // l.b.b
        public void a() {
            this.f3125j.decrementAndGet();
            e();
        }

        @Override // l.b.b
        public void b(Throwable th) {
            this.f3125j.decrementAndGet();
            if (this.f3126k.a(th)) {
                if (!this.f3121f) {
                    this.f3124i.e();
                }
                e();
                return;
            }
            h.a.t.a.M(th);
        }

        @Override // l.b.b
        public void c(T t) {
            try {
                Object a = this.f3127l.a(t);
                Objects.requireNonNull(a, "The mapper returned a null MaybeSource");
                i iVar = (i) a;
                this.f3125j.getAndIncrement();
                C0107a aVar = new C0107a();
                if (!this.o && this.f3124i.c(aVar)) {
                    iVar.a(aVar);
                }
            } catch (Throwable th) {
                c.f.a.b.h(th);
                this.n.cancel();
                b(th);
            }
        }

        @Override // l.b.c
        public void cancel() {
            this.o = true;
            this.n.cancel();
            this.f3124i.e();
        }

        public void d() {
            h.a.s.f.c<R> cVar = this.f3128m.get();
            if (cVar != null) {
                cVar.clear();
            }
        }

        public void e() {
            if (getAndIncrement() == 0) {
                i();
            }
        }

        @Override // l.b.c
        public void f(long j2) {
            if (h.a.s.i.c.c(j2)) {
                c.f.a.b.a(this.f3123h, j2);
                e();
            }
        }

        @Override // h.a.f, l.b.b
        public void g(l.b.c cVar) {
            if (h.a.s.i.c.d(this.n, cVar)) {
                this.n = cVar;
                this.e.g(this);
                int i2 = this.f3122g;
                cVar.f(i2 == Integer.MAX_VALUE ? Long.MAX_VALUE : (long) i2);
            }
        }

        public void i() {
            int i2;
            boolean z;
            b<? super R> bVar = this.e;
            AtomicInteger atomicInteger = this.f3125j;
            AtomicReference<h.a.s.f.c<R>> atomicReference = this.f3128m;
            int i3 = 1;
            loop0:
            do {
                long j2 = this.f3123h.get();
                long j3 = 0;
                while (true) {
                    i2 = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
                    z = false;
                    if (i2 != 0) {
                        if (!this.o) {
                            if (!this.f3121f && ((Throwable) this.f3126k.get()) != null) {
                                break loop0;
                            }
                            boolean z2 = atomicInteger.get() == 0;
                            h.a.s.f.c<R> cVar = atomicReference.get();
                            R d2 = cVar != null ? cVar.d() : null;
                            boolean z3 = d2 == null;
                            if (z2 && z3) {
                                Throwable b = this.f3126k.b();
                                if (b != null) {
                                    bVar.b(b);
                                    return;
                                } else {
                                    bVar.a();
                                    return;
                                }
                            } else if (z3) {
                                break;
                            } else {
                                bVar.c(d2);
                                j3++;
                            }
                        } else {
                            d();
                            return;
                        }
                    } else {
                        break;
                    }
                }
                if (i2 == 0) {
                    if (this.o) {
                        d();
                        return;
                    } else if (this.f3121f || ((Throwable) this.f3126k.get()) == null) {
                        boolean z4 = atomicInteger.get() == 0;
                        h.a.s.f.c<R> cVar2 = atomicReference.get();
                        if (cVar2 == null || cVar2.isEmpty()) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable b2 = this.f3126k.b();
                            if (b2 != null) {
                                bVar.b(b2);
                                return;
                            } else {
                                bVar.a();
                                return;
                            }
                        }
                    } else {
                        Throwable b3 = this.f3126k.b();
                        d();
                        bVar.b(b3);
                        return;
                    }
                }
                if (j3 != 0) {
                    c.f.a.b.d(this.f3123h, j3);
                    if (this.f3122g != Integer.MAX_VALUE) {
                        this.n.f(j3);
                    }
                }
                i3 = addAndGet(-i3);
            } while (i3 != 0);
        }

        public h.a.s.f.c<R> j() {
            h.a.s.f.c<R> cVar;
            do {
                h.a.s.f.c<R> cVar2 = this.f3128m.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new h.a.s.f.c<>(h.a.c.e);
            } while (!this.f3128m.compareAndSet(null, cVar));
            return cVar;
        }
    }

    public d(h.a.c<T> cVar, c<? super T, ? extends i<? extends R>> cVar2, boolean z, int i2) {
        super(cVar);
        this.f3118g = cVar2;
        this.f3119h = z;
        this.f3120i = i2;
    }

    @Override // h.a.c
    public void g(b<? super R> bVar) {
        this.f3094f.f(new a(bVar, this.f3118g, this.f3119h, this.f3120i));
    }
}
