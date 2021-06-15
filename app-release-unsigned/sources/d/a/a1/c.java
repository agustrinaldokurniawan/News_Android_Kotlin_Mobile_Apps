package d.a.a1;

import d.a.f0;
import d.a.v;
import i.q.f;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class c extends f0 {

    /* renamed from: f  reason: collision with root package name */
    public a f1791f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1792g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1793h;

    /* renamed from: i  reason: collision with root package name */
    public final long f1794i;

    /* renamed from: j  reason: collision with root package name */
    public final String f1795j;

    public c(int i2, int i3, String str, int i4) {
        i2 = (i4 & 1) != 0 ? k.b : i2;
        i3 = (i4 & 2) != 0 ? k.f1804c : i3;
        String str2 = (i4 & 4) != 0 ? "DefaultDispatcher" : null;
        long j2 = k.f1805d;
        this.f1792g = i2;
        this.f1793h = i3;
        this.f1794i = j2;
        this.f1795j = str2;
        this.f1791f = new a(i2, i3, j2, str2);
    }

    @Override // d.a.s
    public void d0(f fVar, Runnable runnable) {
        try {
            a aVar = this.f1791f;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.e;
            aVar.n(runnable, g.e, false);
        } catch (RejectedExecutionException unused) {
            v.f1835l.m0(runnable);
        }
    }
}
