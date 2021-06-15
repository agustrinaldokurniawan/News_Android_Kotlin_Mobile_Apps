package d.a.a1;

import d.a.a.o;
import g.f.c.g;
import i.s.c.h;
import i.t.c;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

public final class a implements Executor, Closeable {
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1774f = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1775g = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: h  reason: collision with root package name */
    public static final o f1776h = new o("NOT_IN_STACK");
    public volatile int _isTerminated;
    public volatile long controlState;

    /* renamed from: i  reason: collision with root package name */
    public final d f1777i;

    /* renamed from: j  reason: collision with root package name */
    public final d f1778j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicReferenceArray<C0057a> f1779k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1780l;

    /* renamed from: m  reason: collision with root package name */
    public final int f1781m;
    public final long n;
    public final String o;
    public volatile long parkedWorkersStack;

    /* renamed from: d.a.a1.a$a  reason: collision with other inner class name */
    public final class C0057a extends Thread {
        public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(C0057a.class, "workerCtl");

        /* renamed from: f  reason: collision with root package name */
        public final m f1782f = new m();

        /* renamed from: g  reason: collision with root package name */
        public int f1783g = 4;

        /* renamed from: h  reason: collision with root package name */
        public long f1784h;

        /* renamed from: i  reason: collision with root package name */
        public long f1785i;
        public volatile int indexInArray;

        /* renamed from: j  reason: collision with root package name */
        public int f1786j = c.f3319f.b();

        /* renamed from: k  reason: collision with root package name */
        public boolean f1787k;
        public volatile Object nextParkedWorker = a.f1776h;
        public volatile int workerCtl = 0;

        public C0057a(int i2) {
            setDaemon(true);
            d(i2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006a A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final d.a.a1.h a(boolean r10) {
            /*
            // Method dump skipped, instructions count: 135
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.a1.a.C0057a.a(boolean):d.a.a1.h");
        }

        public final int b(int i2) {
            int i3 = this.f1786j;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f1786j = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
        }

        public final h c() {
            d dVar;
            if (b(2) == 0) {
                h hVar = (h) a.this.f1777i.d();
                if (hVar != null) {
                    return hVar;
                }
                dVar = a.this.f1778j;
            } else {
                h hVar2 = (h) a.this.f1778j.d();
                if (hVar2 != null) {
                    return hVar2;
                }
                dVar = a.this.f1777i;
            }
            return (h) dVar.d();
        }

        public final void d(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.o);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final boolean e(int i2) {
            int i3 = this.f1783g;
            boolean z = true;
            if (i3 != 1) {
                z = false;
            }
            if (z) {
                a.f1774f.addAndGet(a.this, 4398046511104L);
            }
            if (i3 != i2) {
                this.f1783g = i2;
            }
            return z;
        }

        public final h f(boolean z) {
            long j2;
            long j3;
            int i2 = (int) (a.this.controlState & 2097151);
            if (i2 < 2) {
                return null;
            }
            int b = b(i2);
            long j4 = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                b++;
                if (b > i2) {
                    b = 1;
                }
                C0057a aVar = a.this.f1779k.get(b);
                if (aVar != null && aVar != this) {
                    m mVar = this.f1782f;
                    m mVar2 = aVar.f1782f;
                    if (z) {
                        Objects.requireNonNull(mVar);
                        int i4 = mVar2.consumerIndex;
                        int i5 = mVar2.producerIndex;
                        AtomicReferenceArray<h> atomicReferenceArray = mVar2.e;
                        while (true) {
                            if (i4 == i5) {
                                break;
                            }
                            int i6 = i4 & 127;
                            if (mVar2.blockingTasksInBuffer == 0) {
                                break;
                            }
                            h hVar = atomicReferenceArray.get(i6);
                            if (hVar != null) {
                                if ((hVar.f1802f.V() == 1) && atomicReferenceArray.compareAndSet(i6, hVar, null)) {
                                    m.f1807d.decrementAndGet(mVar2);
                                    mVar.a(hVar, false);
                                    j3 = -1;
                                    break;
                                }
                            }
                            i4++;
                        }
                        j3 = mVar.g(mVar2, true);
                        j2 = j3;
                    } else {
                        Objects.requireNonNull(mVar);
                        h f2 = mVar2.f();
                        if (f2 != null) {
                            mVar.a(f2, false);
                            j2 = -1;
                        } else {
                            j2 = mVar.g(mVar2, false);
                        }
                    }
                    if (j2 == -1) {
                        return this.f1782f.e();
                    }
                    if (j2 > 0) {
                        j4 = Math.min(j4, j2);
                    }
                }
            }
            if (j4 == Long.MAX_VALUE) {
                j4 = 0;
            }
            this.f1785i = j4;
            return null;
        }

        public void run() {
            loop0:
            while (true) {
                boolean z = false;
                while (a.this._isTerminated == 0 && this.f1783g != 5) {
                    h a = a(this.f1787k);
                    long j2 = -2097152;
                    if (a == null) {
                        this.f1787k = false;
                        if (this.f1785i == 0) {
                            Object obj = this.nextParkedWorker;
                            o oVar = a.f1776h;
                            if (obj != oVar) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (!(this.nextParkedWorker != a.f1776h) || a.this._isTerminated != 0 || this.f1783g == 5) {
                                        break;
                                    }
                                    e(3);
                                    Thread.interrupted();
                                    if (this.f1784h == 0) {
                                        this.f1784h = System.nanoTime() + a.this.n;
                                    }
                                    LockSupport.parkNanos(a.this.n);
                                    if (System.nanoTime() - this.f1784h >= 0) {
                                        this.f1784h = 0;
                                        synchronized (a.this.f1779k) {
                                            if (a.this._isTerminated == 0) {
                                                if (((int) (a.this.controlState & 2097151)) > a.this.f1780l) {
                                                    if (e.compareAndSet(this, -1, 1)) {
                                                        int i2 = this.indexInArray;
                                                        d(0);
                                                        a.this.K(this, i2, 0);
                                                        int andDecrement = (int) (a.f1774f.getAndDecrement(a.this) & 2097151);
                                                        if (andDecrement != i2) {
                                                            C0057a aVar = a.this.f1779k.get(andDecrement);
                                                            h.c(aVar);
                                                            C0057a aVar2 = aVar;
                                                            a.this.f1779k.set(i2, aVar2);
                                                            aVar2.d(i2);
                                                            a.this.K(aVar2, andDecrement, i2);
                                                        }
                                                        a.this.f1779k.set(andDecrement, null);
                                                        this.f1783g = 5;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                a aVar3 = a.this;
                                Objects.requireNonNull(aVar3);
                                if (this.nextParkedWorker == oVar) {
                                    while (true) {
                                        long j3 = aVar3.parkedWorkersStack;
                                        int i3 = this.indexInArray;
                                        this.nextParkedWorker = aVar3.f1779k.get((int) (j3 & 2097151));
                                        if (a.e.compareAndSet(aVar3, j3, ((2097152 + j3) & j2) | ((long) i3))) {
                                            break;
                                        }
                                        j2 = -2097152;
                                    }
                                }
                            }
                        } else if (!z) {
                            z = true;
                        } else {
                            e(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f1785i);
                            this.f1785i = 0;
                        }
                    } else {
                        this.f1785i = 0;
                        int V = a.f1802f.V();
                        this.f1784h = 0;
                        if (this.f1783g == 3) {
                            this.f1783g = 2;
                        }
                        if (V != 0 && e(2)) {
                            a.this.V();
                        }
                        a.this.Q(a);
                        if (V != 0) {
                            a.f1774f.addAndGet(a.this, -2097152);
                            if (this.f1783g != 5) {
                                this.f1783g = 4;
                            }
                        }
                    }
                }
            }
            e(5);
        }
    }

    public a(int i2, int i3, long j2, String str) {
        this.f1780l = i2;
        this.f1781m = i3;
        this.n = j2;
        this.o = str;
        if (i2 >= 1) {
            if (i3 >= i2) {
                if (i3 <= 2097150) {
                    if (j2 > 0) {
                        this.f1777i = new d();
                        this.f1778j = new d();
                        this.parkedWorkersStack = 0;
                        this.f1779k = new AtomicReferenceArray<>(i3 + 1);
                        this.controlState = ((long) i2) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(c.c.a.a.a.m("Max pool size ", i3, " should be greater than or equals to core pool size ", i2).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
    }

    public final void K(C0057a aVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & -2097152;
            if (i4 == i2) {
                i4 = i3 == 0 ? u(aVar) : i3;
            }
            if (i4 >= 0 && e.compareAndSet(this, j2, j3 | ((long) i4))) {
                return;
            }
        }
    }

    public final void Q(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    public final void V() {
        if (!d0() && !b0(this.controlState)) {
            d0();
        }
    }

    public final int b() {
        int i2;
        synchronized (this.f1779k) {
            if (this._isTerminated != 0) {
                i2 = -1;
            } else {
                long j2 = this.controlState;
                int i3 = (int) (j2 & 2097151);
                int i4 = i3 - ((int) ((j2 & 4398044413952L) >> 21));
                boolean z = false;
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 >= this.f1780l) {
                    return 0;
                }
                if (i3 >= this.f1781m) {
                    return 0;
                }
                int i5 = ((int) (this.controlState & 2097151)) + 1;
                if (i5 > 0 && this.f1779k.get(i5) == null) {
                    C0057a aVar = new C0057a(i5);
                    this.f1779k.set(i5, aVar);
                    if (i5 == ((int) (2097151 & f1774f.incrementAndGet(this)))) {
                        z = true;
                    }
                    if (z) {
                        aVar.start();
                        i2 = i4 + 1;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            return i2;
        }
    }

    public final boolean b0(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 < this.f1780l) {
            int b = b();
            if (b == 1 && this.f1780l > 1) {
                b();
            }
            if (b > 0) {
                return true;
            }
        }
        return false;
    }

    public final h c(Runnable runnable, i iVar) {
        long a = k.e.a();
        if (!(runnable instanceof h)) {
            return new j(runnable, a, iVar);
        }
        h hVar = (h) runnable;
        hVar.e = a;
        hVar.f1802f = iVar;
        return hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (r1 != null) goto L_0x007e;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a1.a.close():void");
    }

    public final boolean d0() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            C0057a aVar = this.f1779k.get((int) (2097151 & j2));
            if (aVar != null) {
                long j3 = (2097152 + j2) & -2097152;
                int u = u(aVar);
                if (u >= 0 && e.compareAndSet(this, j2, ((long) u) | j3)) {
                    aVar.nextParkedWorker = f1776h;
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                return false;
            }
            if (C0057a.e.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final C0057a e() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C0057a)) {
            currentThread = null;
        }
        C0057a aVar = (C0057a) currentThread;
        if (aVar == null || !h.a(a.this, this)) {
            return null;
        }
        return aVar;
    }

    public void execute(Runnable runnable) {
        n(runnable, g.e, false);
    }

    public final void n(Runnable runnable, i iVar, boolean z) {
        h hVar;
        h c2 = c(runnable, iVar);
        C0057a e2 = e();
        boolean z2 = true;
        if (e2 == null || e2.f1783g == 5 || (c2.f1802f.V() == 0 && e2.f1783g == 2)) {
            hVar = c2;
        } else {
            e2.f1787k = true;
            hVar = e2.f1782f.a(c2, z);
        }
        if (hVar != null) {
            if (!(hVar.f1802f.V() == 1 ? this.f1778j : this.f1777i).a(hVar)) {
                throw new RejectedExecutionException(c.c.a.a.a.e(new StringBuilder(), this.o, " was terminated"));
            }
        }
        if (!z || e2 == null) {
            z2 = false;
        }
        if (c2.f1802f.V() != 0) {
            long addAndGet = f1774f.addAndGet(this, 2097152);
            if (!z2 && !d0() && !b0(addAndGet)) {
                d0();
            }
        } else if (!z2) {
            V();
        }
    }

    public String toString() {
        String str;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int length = this.f1779k.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < length; i7++) {
            C0057a aVar = this.f1779k.get(i7);
            if (aVar != null) {
                int d2 = aVar.f1782f.d();
                int f2 = g.f(aVar.f1783g);
                if (f2 == 0) {
                    i2++;
                    sb = new StringBuilder();
                    sb.append(String.valueOf(d2));
                    str = "c";
                } else if (f2 == 1) {
                    i3++;
                    sb = new StringBuilder();
                    sb.append(String.valueOf(d2));
                    str = "b";
                } else if (f2 == 2) {
                    i4++;
                } else if (f2 == 3) {
                    i5++;
                    if (d2 > 0) {
                        sb = new StringBuilder();
                        sb.append(String.valueOf(d2));
                        str = "d";
                    }
                } else if (f2 == 4) {
                    i6++;
                }
                sb.append(str);
                arrayList.add(sb.toString());
            }
        }
        long j2 = this.controlState;
        return this.o + '@' + h.a.t.a.u(this) + '[' + "Pool Size {" + "core = " + this.f1780l + ", " + "max = " + this.f1781m + "}, " + "Worker States {" + "CPU = " + i2 + ", " + "blocking = " + i3 + ", " + "parked = " + i4 + ", " + "dormant = " + i5 + ", " + "terminated = " + i6 + "}, " + "running workers queues = " + arrayList + ", " + "global CPU queue size = " + this.f1777i.c() + ", " + "global blocking queue size = " + this.f1778j.c() + ", " + "Control State {" + "created workers= " + ((int) (2097151 & j2)) + ", " + "blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", " + "CPUs acquired = " + (this.f1780l - ((int) ((j2 & 9223367638808264704L) >> 42))) + "}]";
    }

    public final int u(C0057a aVar) {
        int i2;
        do {
            Object obj = aVar.nextParkedWorker;
            if (obj == f1776h) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            aVar = (C0057a) obj;
            i2 = aVar.indexInArray;
        } while (i2 == 0);
        return i2;
    }
}
