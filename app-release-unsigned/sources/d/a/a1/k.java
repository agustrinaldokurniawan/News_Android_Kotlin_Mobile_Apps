package d.a.a1;

import d.a.a.p;
import h.a.t.a;
import i.u.d;
import java.util.concurrent.TimeUnit;

public final class k {
    public static final long a = a.Y("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);
    public static final int b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f1804c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f1805d = TimeUnit.SECONDS.toNanos(a.Y("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));
    public static l e = f.a;

    static {
        a.X("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
        int i2 = p.a;
        int X = a.X("kotlinx.coroutines.scheduler.core.pool.size", i2 < 2 ? 2 : i2, 1, 0, 8, null);
        b = X;
        f1804c = a.X("kotlinx.coroutines.scheduler.max.pool.size", d.a(i2 * 128, X, 2097150), 0, 2097150, 4, null);
    }
}
