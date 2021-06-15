package k;

import i.s.c.f;
import i.s.c.h;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class b extends a0 {
    public static final long e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f3730f;

    /* renamed from: g  reason: collision with root package name */
    public static b f3731g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f3732h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public boolean f3733i;

    /* renamed from: j  reason: collision with root package name */
    public b f3734j;

    /* renamed from: k  reason: collision with root package name */
    public long f3735k;

    public static final class a {
        public a(f fVar) {
        }

        public final b a() {
            b bVar = b.f3731g;
            if (bVar != null) {
                b bVar2 = bVar.f3734j;
                long nanoTime = System.nanoTime();
                if (bVar2 == null) {
                    b.class.wait(b.e);
                    b bVar3 = b.f3731g;
                    if (bVar3 == null) {
                        h.j();
                        throw null;
                    } else if (bVar3.f3734j != null || System.nanoTime() - nanoTime < b.f3730f) {
                        return null;
                    } else {
                        return b.f3731g;
                    }
                } else {
                    long j2 = bVar2.f3735k - nanoTime;
                    if (j2 > 0) {
                        long j3 = j2 / 1000000;
                        b.class.wait(j3, (int) (j2 - (1000000 * j3)));
                        return null;
                    }
                    b bVar4 = b.f3731g;
                    if (bVar4 != null) {
                        bVar4.f3734j = bVar2.f3734j;
                        bVar2.f3734j = null;
                        return bVar2;
                    }
                    h.j();
                    throw null;
                }
            } else {
                h.j();
                throw null;
            }
        }
    }

    /* renamed from: k.b$b  reason: collision with other inner class name */
    public static final class C0128b extends Thread {
        public C0128b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
            r1.k();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<k.b> r0 = k.b.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                k.b$a r1 = k.b.f3732h     // Catch:{ all -> 0x0019 }
                k.b r1 = r1.a()     // Catch:{ all -> 0x0019 }
                k.b r2 = k.b.f3731g     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0012
                r1 = 0
                k.b.f3731g = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)
                return
            L_0x0012:
                monitor-exit(r0)
                if (r1 == 0) goto L_0x0000
                r1.k()
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: k.b.C0128b.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        e = millis;
        f3730f = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e A[LOOP:0: B:22:0x004e->B:27:0x005a, LOOP_START, PHI: r0 
      PHI: (r0v8 k.b) = (r0v6 k.b), (r0v9 k.b) binds: [B:21:0x004c, B:27:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b.h():void");
    }

    public final boolean i() {
        boolean z = false;
        if (!this.f3733i) {
            return false;
        }
        this.f3733i = false;
        synchronized (b.class) {
            b bVar = f3731g;
            while (true) {
                if (bVar == null) {
                    z = true;
                    break;
                }
                b bVar2 = bVar.f3734j;
                if (bVar2 == this) {
                    bVar.f3734j = this.f3734j;
                    this.f3734j = null;
                    break;
                }
                bVar = bVar2;
            }
        }
        return z;
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
