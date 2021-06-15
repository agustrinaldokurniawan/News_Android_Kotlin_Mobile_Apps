package h.a.s.g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

public final class j {
    public static final boolean a;
    public static final int b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference<ScheduledExecutorService> f3247c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    public static final Map<ScheduledThreadPoolExecutor, Object> f3248d = new ConcurrentHashMap();

    public static final class a implements Runnable {
        public void run() {
            Iterator it = new ArrayList(j.f3248d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    j.f3248d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026 A[SYNTHETIC, Splitter:B:10:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[LOOP:0: B:19:0x0039->B:24:0x0064, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    static {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.s.g.j.<clinit>():void");
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            f3248d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }
}
