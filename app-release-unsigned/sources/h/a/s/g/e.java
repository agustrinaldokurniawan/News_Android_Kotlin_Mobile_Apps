package h.a.s.g;

import h.a.m;
import java.util.concurrent.ThreadFactory;

public final class e extends m {
    public static final g a = new g("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    public final ThreadFactory b = a;

    @Override // h.a.m
    public m.b a() {
        return new f(this.b);
    }
}
