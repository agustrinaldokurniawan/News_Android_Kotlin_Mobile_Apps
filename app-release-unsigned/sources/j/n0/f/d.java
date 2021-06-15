package j.n0.f;

import i.s.c.f;
import i.s.c.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class d {
    public static final d a;
    public static final Logger b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f3478c = new b(null);

    /* renamed from: d  reason: collision with root package name */
    public int f3479d = 10000;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public long f3480f;

    /* renamed from: g  reason: collision with root package name */
    public final List<c> f3481g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List<c> f3482h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f3483i = new RunnableC0123d(this);

    /* renamed from: j  reason: collision with root package name */
    public final a f3484j;

    public interface a {
        void a(d dVar);

        void b(d dVar, long j2);

        long c();

        void execute(Runnable runnable);
    }

    public static final class b {
        public b(f fVar) {
        }
    }

    public static final class c implements a {
        public final ThreadPoolExecutor a;

        public c(ThreadFactory threadFactory) {
            h.f(threadFactory, "threadFactory");
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // j.n0.f.d.a
        public void a(d dVar) {
            h.f(dVar, "taskRunner");
            dVar.notify();
        }

        @Override // j.n0.f.d.a
        public void b(d dVar, long j2) {
            h.f(dVar, "taskRunner");
            long j3 = j2 / 1000000;
            long j4 = j2 - (1000000 * j3);
            if (j3 > 0 || j2 > 0) {
                dVar.wait(j3, (int) j4);
            }
        }

        @Override // j.n0.f.d.a
        public long c() {
            return System.nanoTime();
        }

        @Override // j.n0.f.d.a
        public void execute(Runnable runnable) {
            h.f(runnable, "runnable");
            this.a.execute(runnable);
        }
    }

    /* renamed from: j.n0.f.d$d  reason: collision with other inner class name */
    public static final class RunnableC0123d implements Runnable {
        public final /* synthetic */ d e;

        public RunnableC0123d(d dVar) {
            this.e = dVar;
        }

        public void run() {
            a c2;
            while (true) {
                synchronized (this.e) {
                    c2 = this.e.c();
                }
                if (c2 != null) {
                    c cVar = c2.a;
                    if (cVar != null) {
                        long j2 = -1;
                        b bVar = d.f3478c;
                        boolean isLoggable = d.b.isLoggable(Level.FINE);
                        if (isLoggable) {
                            j2 = cVar.e.f3484j.c();
                            h.a.t.a.a(c2, cVar, "starting");
                        }
                        try {
                            d.a(this.e, c2);
                            if (isLoggable) {
                                long c3 = cVar.e.f3484j.c() - j2;
                                StringBuilder f2 = c.c.a.a.a.f("finished run in ");
                                f2.append(h.a.t.a.s(c3));
                                h.a.t.a.a(c2, cVar, f2.toString());
                            }
                        } catch (Throwable th) {
                            if (isLoggable) {
                                long c4 = cVar.e.f3484j.c() - j2;
                                StringBuilder f3 = c.c.a.a.a.f("failed a run in ");
                                f3.append(h.a.t.a.s(c4));
                                h.a.t.a.a(c2, cVar, f3.toString());
                            }
                            throw th;
                        }
                    } else {
                        h.j();
                        throw null;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        String str = j.n0.c.f3472g + " TaskRunner";
        h.f(str, "name");
        a = new d(new c(new j.n0.b(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        h.b(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        b = logger;
    }

    public d(a aVar) {
        h.f(aVar, "backend");
        this.f3484j = aVar;
    }

    public static final void a(d dVar, a aVar) {
        Objects.requireNonNull(dVar);
        byte[] bArr = j.n0.c.a;
        Thread currentThread = Thread.currentThread();
        h.b(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(aVar.f3473c);
        try {
            long a2 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a2);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j2) {
        byte[] bArr = j.n0.c.a;
        c cVar = aVar.a;
        if (cVar != null) {
            if (cVar.b == aVar) {
                boolean z = cVar.f3476d;
                cVar.f3476d = false;
                cVar.b = null;
                this.f3481g.remove(cVar);
                if (j2 != -1 && !z && !cVar.a) {
                    cVar.d(aVar, j2, true);
                }
                if (!cVar.f3475c.isEmpty()) {
                    this.f3482h.add(cVar);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        h.j();
        throw null;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00a6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j.n0.f.a c() {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.f.d.c():j.n0.f.a");
    }

    public final void d() {
        for (int size = this.f3481g.size() - 1; size >= 0; size--) {
            this.f3481g.get(size).b();
        }
        for (int size2 = this.f3482h.size() - 1; size2 >= 0; size2--) {
            c cVar = this.f3482h.get(size2);
            cVar.b();
            if (cVar.f3475c.isEmpty()) {
                this.f3482h.remove(size2);
            }
        }
    }

    public final void e(c cVar) {
        h.f(cVar, "taskQueue");
        byte[] bArr = j.n0.c.a;
        if (cVar.b == null) {
            if (!cVar.f3475c.isEmpty()) {
                List<c> list = this.f3482h;
                h.f(list, "$this$addIfAbsent");
                if (!list.contains(cVar)) {
                    list.add(cVar);
                }
            } else {
                this.f3482h.remove(cVar);
            }
        }
        if (this.e) {
            this.f3484j.a(this);
        } else {
            this.f3484j.execute(this.f3483i);
        }
    }

    public final c f() {
        int i2;
        synchronized (this) {
            i2 = this.f3479d;
            this.f3479d = i2 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i2);
        return new c(this, sb.toString());
    }
}
