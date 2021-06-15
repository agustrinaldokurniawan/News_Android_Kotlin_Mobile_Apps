package d.a.a1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class m {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1806c = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1807d = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");
    public volatile int blockingTasksInBuffer = 0;
    public volatile int consumerIndex = 0;
    public final AtomicReferenceArray<h> e = new AtomicReferenceArray<>(128);
    public volatile Object lastScheduledTask = null;
    public volatile int producerIndex = 0;

    public final h a(h hVar, boolean z) {
        if (z) {
            return b(hVar);
        }
        h hVar2 = (h) a.getAndSet(this, hVar);
        if (hVar2 != null) {
            return b(hVar2);
        }
        return null;
    }

    public final h b(h hVar) {
        boolean z = true;
        if (hVar.f1802f.V() != 1) {
            z = false;
        }
        if (z) {
            f1807d.incrementAndGet(this);
        }
        if (c() == 127) {
            return hVar;
        }
        int i2 = this.producerIndex & 127;
        while (this.e.get(i2) != null) {
            Thread.yield();
        }
        this.e.lazySet(i2, hVar);
        b.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int d() {
        return this.lastScheduledTask != null ? c() + 1 : c();
    }

    public final h e() {
        h hVar = (h) a.getAndSet(this, null);
        return hVar != null ? hVar : f();
    }

    public final h f() {
        h andSet;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (f1806c.compareAndSet(this, i2, i2 + 1) && (andSet = this.e.getAndSet(i3, null)) != null) {
                boolean z = true;
                if (andSet.f1802f.V() != 1) {
                    z = false;
                }
                if (z) {
                    f1807d.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final long g(m mVar, boolean z) {
        h hVar;
        do {
            hVar = (h) mVar.lastScheduledTask;
            if (hVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (hVar.f1802f.V() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a2 = k.e.a() - hVar.e;
            long j2 = k.a;
            if (a2 < j2) {
                return j2 - a2;
            }
        } while (!a.compareAndSet(mVar, hVar, null));
        a(hVar, false);
        return -1;
    }
}
