package h.a.s.g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class g extends AtomicLong implements ThreadFactory {
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3238f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3239g;

    public static final class a extends Thread {
        public a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public g(String str) {
        this.e = str;
        this.f3238f = 5;
        this.f3239g = false;
    }

    public g(String str, int i2, boolean z) {
        this.e = str;
        this.f3238f = i2;
        this.f3239g = z;
    }

    public Thread newThread(Runnable runnable) {
        String str = this.e + '-' + incrementAndGet();
        Thread aVar = this.f3239g ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f3238f);
        aVar.setDaemon(true);
        return aVar;
    }

    public String toString() {
        return c.c.a.a.a.e(c.c.a.a.a.f("RxThreadFactory["), this.e, "]");
    }

    public g(String str, int i2) {
        this.e = str;
        this.f3238f = i2;
        this.f3239g = false;
    }
}
