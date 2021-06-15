package h.a.s.g;

import h.a.m;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class d extends m {
    public static final g a;
    public static final g b;

    /* renamed from: c  reason: collision with root package name */
    public static final long f3223c = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeUnit f3224d = TimeUnit.SECONDS;
    public static final c e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f3225f;

    /* renamed from: g  reason: collision with root package name */
    public final ThreadFactory f3226g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<a> f3227h;

    public static final class a implements Runnable {
        public final long e;

        /* renamed from: f  reason: collision with root package name */
        public final ConcurrentLinkedQueue<c> f3228f;

        /* renamed from: g  reason: collision with root package name */
        public final h.a.p.b f3229g;

        /* renamed from: h  reason: collision with root package name */
        public final ScheduledExecutorService f3230h;

        /* renamed from: i  reason: collision with root package name */
        public final Future<?> f3231i;

        /* renamed from: j  reason: collision with root package name */
        public final ThreadFactory f3232j;

        public a(long j2, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j2) : 0;
            this.e = nanos;
            this.f3228f = new ConcurrentLinkedQueue<>();
            this.f3229g = new h.a.p.b();
            this.f3232j = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, d.b);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f3230h = scheduledExecutorService;
            this.f3231i = scheduledFuture;
        }

        public void run() {
            if (!this.f3228f.isEmpty()) {
                long nanoTime = System.nanoTime();
                Iterator<c> it = this.f3228f.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.f3236g > nanoTime) {
                        return;
                    }
                    if (this.f3228f.remove(next) && this.f3229g.a(next)) {
                        next.e();
                    }
                }
            }
        }
    }

    public static final class b extends m.b {
        public final h.a.p.b e;

        /* renamed from: f  reason: collision with root package name */
        public final a f3233f;

        /* renamed from: g  reason: collision with root package name */
        public final c f3234g;

        /* renamed from: h  reason: collision with root package name */
        public final AtomicBoolean f3235h = new AtomicBoolean();

        public b(a aVar) {
            c cVar;
            c cVar2;
            this.f3233f = aVar;
            this.e = new h.a.p.b();
            if (aVar.f3229g.f3081f) {
                cVar = d.e;
            } else {
                while (true) {
                    if (aVar.f3228f.isEmpty()) {
                        cVar2 = new c(aVar.f3232j);
                        aVar.f3229g.c(cVar2);
                        break;
                    }
                    cVar2 = aVar.f3228f.poll();
                    if (cVar2 != null) {
                        break;
                    }
                }
                cVar = cVar2;
            }
            this.f3234g = cVar;
        }

        @Override // h.a.m.b
        public h.a.p.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
            return this.e.f3081f ? h.a.s.a.c.INSTANCE : this.f3234g.d(runnable, j2, timeUnit, this.e);
        }

        @Override // h.a.p.c
        public void e() {
            if (this.f3235h.compareAndSet(false, true)) {
                this.e.e();
                a aVar = this.f3233f;
                c cVar = this.f3234g;
                Objects.requireNonNull(aVar);
                cVar.f3236g = System.nanoTime() + aVar.e;
                aVar.f3228f.offer(cVar);
            }
        }
    }

    public static final class c extends f {

        /* renamed from: g  reason: collision with root package name */
        public long f3236g = 0;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new g("RxCachedThreadSchedulerShutdown"));
        e = cVar;
        cVar.e();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        g gVar = new g("RxCachedThreadScheduler", max);
        a = gVar;
        b = new g("RxCachedWorkerPoolEvictor", max);
        a aVar = new a(0, null, gVar);
        f3225f = aVar;
        aVar.f3229g.e();
        Future<?> future = aVar.f3231i;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar.f3230h;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public d() {
        g gVar = a;
        this.f3226g = gVar;
        a aVar = f3225f;
        AtomicReference<a> atomicReference = new AtomicReference<>(aVar);
        this.f3227h = atomicReference;
        a aVar2 = new a(f3223c, f3224d, gVar);
        if (!atomicReference.compareAndSet(aVar, aVar2)) {
            aVar2.f3229g.e();
            Future<?> future = aVar2.f3231i;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = aVar2.f3230h;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    @Override // h.a.m
    public m.b a() {
        return new b(this.f3227h.get());
    }
}
