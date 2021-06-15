package c.d.a.m.v;

import c.d.a.m.v.i;
import c.d.a.m.v.q;
import c.d.a.q.g;
import c.d.a.q.h;
import c.d.a.s.k.a;
import c.d.a.s.k.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class m<R> implements i.a<R>, a.d {
    public static final c e = new c();
    public q<?> A;
    public i<R> B;
    public volatile boolean C;
    public boolean D;

    /* renamed from: f  reason: collision with root package name */
    public final e f944f = new e();

    /* renamed from: g  reason: collision with root package name */
    public final c.d.a.s.k.d f945g = new d.b();

    /* renamed from: h  reason: collision with root package name */
    public final q.a f946h;

    /* renamed from: i  reason: collision with root package name */
    public final g.h.i.c<m<?>> f947i;

    /* renamed from: j  reason: collision with root package name */
    public final c f948j;

    /* renamed from: k  reason: collision with root package name */
    public final n f949k;

    /* renamed from: l  reason: collision with root package name */
    public final c.d.a.m.v.e0.a f950l;

    /* renamed from: m  reason: collision with root package name */
    public final c.d.a.m.v.e0.a f951m;
    public final c.d.a.m.v.e0.a n;
    public final c.d.a.m.v.e0.a o;
    public final AtomicInteger p = new AtomicInteger();
    public c.d.a.m.m q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public w<?> v;
    public c.d.a.m.a w;
    public boolean x;
    public r y;
    public boolean z;

    public class a implements Runnable {
        public final g e;

        public a(g gVar) {
            this.e = gVar;
        }

        public void run() {
            h hVar = (h) this.e;
            hVar.f1138c.a();
            synchronized (hVar.f1139d) {
                synchronized (m.this) {
                    if (m.this.f944f.e.contains(new d(this.e, c.d.a.s.e.b))) {
                        m mVar = m.this;
                        g gVar = this.e;
                        Objects.requireNonNull(mVar);
                        try {
                            ((h) gVar).o(mVar.y, 5);
                        } catch (Throwable th) {
                            throw new c(th);
                        }
                    }
                    m.this.d();
                }
            }
        }
    }

    public class b implements Runnable {
        public final g e;

        public b(g gVar) {
            this.e = gVar;
        }

        public void run() {
            h hVar = (h) this.e;
            hVar.f1138c.a();
            synchronized (hVar.f1139d) {
                synchronized (m.this) {
                    if (m.this.f944f.e.contains(new d(this.e, c.d.a.s.e.b))) {
                        m.this.A.a();
                        m mVar = m.this;
                        g gVar = this.e;
                        Objects.requireNonNull(mVar);
                        try {
                            ((h) gVar).p(mVar.A, mVar.w, mVar.D);
                            m.this.h(this.e);
                        } catch (Throwable th) {
                            throw new c(th);
                        }
                    }
                    m.this.d();
                }
            }
        }
    }

    public static class c {
    }

    public static final class d {
        public final g a;
        public final Executor b;

        public d(g gVar, Executor executor) {
            this.a = gVar;
            this.b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {
        public final List<d> e = new ArrayList(2);

        public boolean isEmpty() {
            return this.e.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.e.iterator();
        }
    }

    public m(c.d.a.m.v.e0.a aVar, c.d.a.m.v.e0.a aVar2, c.d.a.m.v.e0.a aVar3, c.d.a.m.v.e0.a aVar4, n nVar, q.a aVar5, g.h.i.c<m<?>> cVar) {
        c cVar2 = e;
        this.f950l = aVar;
        this.f951m = aVar2;
        this.n = aVar3;
        this.o = aVar4;
        this.f949k = nVar;
        this.f946h = aVar5;
        this.f947i = cVar;
        this.f948j = cVar2;
    }

    @Override // c.d.a.s.k.a.d
    public c.d.a.s.k.d a() {
        return this.f945g;
    }

    public synchronized void b(g gVar, Executor executor) {
        Runnable runnable;
        this.f945g.a();
        this.f944f.e.add(new d(gVar, executor));
        boolean z2 = true;
        if (this.x) {
            e(1);
            runnable = new b(gVar);
        } else if (this.z) {
            e(1);
            runnable = new a(gVar);
        } else {
            if (this.C) {
                z2 = false;
            }
            g.q.a.c(z2, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(runnable);
    }

    public void c() {
        if (!f()) {
            this.C = true;
            i<R> iVar = this.B;
            iVar.I = true;
            g gVar = iVar.G;
            if (gVar != null) {
                gVar.cancel();
            }
            n nVar = this.f949k;
            c.d.a.m.m mVar = this.q;
            l lVar = (l) nVar;
            synchronized (lVar) {
                t tVar = lVar.b;
                Objects.requireNonNull(tVar);
                Map<c.d.a.m.m, m<?>> a2 = tVar.a(this.u);
                if (equals(a2.get(mVar))) {
                    a2.remove(mVar);
                }
            }
        }
    }

    public void d() {
        q<?> qVar;
        synchronized (this) {
            this.f945g.a();
            g.q.a.c(f(), "Not yet complete!");
            int decrementAndGet = this.p.decrementAndGet();
            g.q.a.c(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                qVar = this.A;
                g();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.e();
        }
    }

    public synchronized void e(int i2) {
        q<?> qVar;
        g.q.a.c(f(), "Not yet complete!");
        if (this.p.getAndAdd(i2) == 0 && (qVar = this.A) != null) {
            qVar.a();
        }
    }

    public final boolean f() {
        return this.z || this.x || this.C;
    }

    public final synchronized void g() {
        boolean a2;
        if (this.q != null) {
            this.f944f.e.clear();
            this.q = null;
            this.A = null;
            this.v = null;
            this.z = false;
            this.C = false;
            this.x = false;
            this.D = false;
            i<R> iVar = this.B;
            i.e eVar = iVar.f915k;
            synchronized (eVar) {
                eVar.a = true;
                a2 = eVar.a(false);
            }
            if (a2) {
                iVar.l();
            }
            this.B = null;
            this.y = null;
            this.w = null;
            this.f947i.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void h(g gVar) {
        boolean z2;
        this.f945g.a();
        this.f944f.e.remove(new d(gVar, c.d.a.s.e.b));
        if (this.f944f.isEmpty()) {
            c();
            if (!this.x) {
                if (!this.z) {
                    z2 = false;
                    if (z2 && this.p.get() == 0) {
                        g();
                    }
                }
            }
            z2 = true;
            g();
        }
    }

    public void i(i<?> iVar) {
        (this.s ? this.n : this.t ? this.o : this.f951m).f896g.execute(iVar);
    }
}
