package d.a;

import d.a.a.k;
import d.a.a.o;
import d.a.a.q;
import d.a.a.r;
import i.q.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public abstract class b0 extends c0 {

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1808i = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_queue");

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1809j = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_delayed");
    public volatile Object _delayed = null;
    public volatile int _isCompleted = 0;
    public volatile Object _queue = null;

    public static abstract class a implements Runnable, Comparable<a>, y, r {
        public Object e;

        /* renamed from: f  reason: collision with root package name */
        public int f1810f;

        /* renamed from: g  reason: collision with root package name */
        public long f1811g;

        @Override // d.a.a.r
        public void a(int i2) {
            this.f1810f = i2;
        }

        @Override // d.a.a.r
        public void b(q<?> qVar) {
            if (this.e != d0.a) {
                this.e = qVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // d.a.a.r
        public q<?> c() {
            Object obj = this.e;
            if (!(obj instanceof q)) {
                obj = null;
            }
            return (q) obj;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public int compareTo(a aVar) {
            int i2 = ((this.f1811g - aVar.f1811g) > 0 ? 1 : ((this.f1811g - aVar.f1811g) == 0 ? 0 : -1));
            if (i2 > 0) {
                return 1;
            }
            return i2 < 0 ? -1 : 0;
        }

        @Override // d.a.a.r
        public int d() {
            return this.f1810f;
        }

        @Override // d.a.y
        public final synchronized void e() {
            Object obj = this.e;
            o oVar = d0.a;
            if (obj != oVar) {
                if (!(obj instanceof b)) {
                    obj = null;
                }
                b bVar = (b) obj;
                if (bVar != null) {
                    synchronized (bVar) {
                        if (c() != null) {
                            bVar.c(d());
                        }
                    }
                }
                this.e = oVar;
            }
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("Delayed[nanos=");
            f2.append(this.f1811g);
            f2.append(']');
            return f2.toString();
        }
    }

    public static final class b extends q<a> {
        public long b;

        public b(long j2) {
            this.b = j2;
        }
    }

    @Override // d.a.s
    public final void d0(f fVar, Runnable runnable) {
        m0(runnable);
    }

    public final void m0(Runnable runnable) {
        if (n0(runnable)) {
            Thread k0 = k0();
            if (Thread.currentThread() != k0) {
                LockSupport.unpark(k0);
                return;
            }
            return;
        }
        v.f1835l.m0(runnable);
    }

    public final boolean n0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                if (f1808i.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof k) {
                k kVar = (k) obj;
                int a2 = kVar.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    f1808i.compareAndSet(this, obj, kVar.d());
                } else if (a2 == 2) {
                    return false;
                }
            } else if (obj == d0.b) {
                return false;
            } else {
                k kVar2 = new k(8, true);
                kVar2.a((Runnable) obj);
                kVar2.a(runnable);
                if (f1808i.compareAndSet(this, obj, kVar2)) {
                    return true;
                }
            }
        }
    }

    public boolean o0() {
        d.a.a.b<w<?>> bVar = this.f1773h;
        if (!(bVar == null || bVar.b == bVar.f1755c)) {
            return false;
        }
        b bVar2 = (b) this._delayed;
        if (bVar2 != null) {
            if (!(bVar2._size == 0)) {
                return false;
            }
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof k) {
            return ((k) obj).c();
        }
        return obj == d0.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long p0() {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.b0.p0():long");
    }

    @Override // d.a.a0
    public void shutdown() {
        r c2;
        w0 w0Var = w0.b;
        w0.a.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (f1808i.compareAndSet(this, null, d0.b)) {
                    break;
                }
            } else if (obj instanceof k) {
                ((k) obj).b();
                break;
            } else if (obj == d0.b) {
                break;
            } else {
                k kVar = new k(8, true);
                kVar.a((Runnable) obj);
                if (f1808i.compareAndSet(this, obj, kVar)) {
                    break;
                }
            }
        }
        do {
        } while (p0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) this._delayed;
            if (bVar != null) {
                synchronized (bVar) {
                    c2 = bVar._size > 0 ? bVar.c(0) : null;
                }
                a aVar = (a) c2;
                if (aVar != null) {
                    l0(nanoTime, aVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
