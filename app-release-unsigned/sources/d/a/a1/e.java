package d.a.a1;

import d.a.f0;
import d.a.v;
import i.q.f;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class e extends f0 implements i, Executor {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1796f = AtomicIntegerFieldUpdater.newUpdater(e.class, "inFlightTasks");

    /* renamed from: g  reason: collision with root package name */
    public final ConcurrentLinkedQueue<Runnable> f1797g = new ConcurrentLinkedQueue<>();

    /* renamed from: h  reason: collision with root package name */
    public final c f1798h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1799i;
    public volatile int inFlightTasks = 0;

    /* renamed from: j  reason: collision with root package name */
    public final String f1800j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1801k;

    public e(c cVar, int i2, String str, int i3) {
        this.f1798h = cVar;
        this.f1799i = i2;
        this.f1800j = str;
        this.f1801k = i3;
    }

    @Override // d.a.a1.i
    public int V() {
        return this.f1801k;
    }

    @Override // d.a.a1.i
    public void b0() {
        Runnable poll = this.f1797g.poll();
        if (poll != null) {
            c cVar = this.f1798h;
            Objects.requireNonNull(cVar);
            try {
                cVar.f1791f.n(poll, this, true);
            } catch (RejectedExecutionException unused) {
                v.f1835l.m0(cVar.f1791f.c(poll, this));
            }
        } else {
            f1796f.decrementAndGet(this);
            Runnable poll2 = this.f1797g.poll();
            if (poll2 != null) {
                f0(poll2, true);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // d.a.s
    public void d0(f fVar, Runnable runnable) {
        f0(runnable, false);
    }

    public void execute(Runnable runnable) {
        f0(runnable, false);
    }

    public final void f0(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1796f;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f1799i) {
                c cVar = this.f1798h;
                Objects.requireNonNull(cVar);
                try {
                    cVar.f1791f.n(runnable, this, z);
                    return;
                } catch (RejectedExecutionException unused) {
                    v.f1835l.m0(cVar.f1791f.c(runnable, this));
                    return;
                }
            } else {
                this.f1797g.add(runnable);
                if (atomicIntegerFieldUpdater.decrementAndGet(this) < this.f1799i) {
                    runnable = this.f1797g.poll();
                } else {
                    return;
                }
            }
        } while (runnable != null);
    }

    @Override // d.a.s
    public String toString() {
        String str = this.f1800j;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f1798h + ']';
    }
}
