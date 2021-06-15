package d.a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public final class v extends b0 implements Runnable {
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    /* renamed from: k  reason: collision with root package name */
    public static final long f1834k;

    /* renamed from: l  reason: collision with root package name */
    public static final v f1835l;

    static {
        Long l2;
        v vVar = new v();
        f1835l = vVar;
        vVar.i0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f1834k = timeUnit.toNanos(l2.longValue());
    }

    @Override // d.a.c0
    public Thread k0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    public final synchronized void q0() {
        if (r0()) {
            debugStatus = 3;
            this._queue = null;
            this._delayed = null;
            notifyAll();
        }
    }

    public final boolean r0() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    public void run() {
        boolean z;
        w0 w0Var = w0.b;
        w0.a.set(this);
        try {
            synchronized (this) {
                if (r0()) {
                    z = false;
                } else {
                    z = true;
                    debugStatus = 1;
                    notifyAll();
                }
            }
            if (z) {
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long p0 = p0();
                    if (p0 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f1834k + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            q0();
                            if (!o0()) {
                                k0();
                                return;
                            }
                            return;
                        } else if (p0 > j3) {
                            p0 = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (p0 > 0) {
                        if (r0()) {
                            _thread = null;
                            q0();
                            if (!o0()) {
                                k0();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, p0);
                    }
                }
            }
        } finally {
            _thread = null;
            q0();
            if (!o0()) {
                k0();
            }
        }
    }
}
