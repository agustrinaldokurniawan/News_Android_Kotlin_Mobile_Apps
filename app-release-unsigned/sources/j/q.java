package j;

import i.s.c.h;
import j.n0.g.e;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;

public final class q {
    public ExecutorService a;
    public final ArrayDeque<e.a> b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque<e.a> f3703c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<e> f3704d = new ArrayDeque<>();

    public final <T> void a(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        c();
    }

    public final void b(e.a aVar) {
        h.f(aVar, "call");
        aVar.e.decrementAndGet();
        a(this.f3703c, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: j.q.c():boolean");
    }
}
