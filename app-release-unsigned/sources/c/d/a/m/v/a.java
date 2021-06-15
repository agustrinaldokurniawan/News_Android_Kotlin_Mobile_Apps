package c.d.a.m.v;

import android.os.Process;
import c.d.a.m.m;
import c.d.a.m.v.q;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class a {
    public final boolean a;
    public final Map<m, b> b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ReferenceQueue<q<?>> f849c = new ReferenceQueue<>();

    /* renamed from: d  reason: collision with root package name */
    public q.a f850d;

    /* renamed from: c.d.a.m.v.a$a  reason: collision with other inner class name */
    public class ThreadFactoryC0015a implements ThreadFactory {

        /* renamed from: c.d.a.m.v.a$a$a  reason: collision with other inner class name */
        public class RunnableC0016a implements Runnable {
            public final /* synthetic */ Runnable e;

            public RunnableC0016a(ThreadFactoryC0015a aVar, Runnable runnable) {
                this.e = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.e.run();
            }
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0016a(this, runnable), "glide-active-resources");
        }
    }

    public static final class b extends WeakReference<q<?>> {
        public final m a;
        public final boolean b;

        /* renamed from: c  reason: collision with root package name */
        public w<?> f851c;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: c.d.a.m.v.w<Z> */
        public b(m mVar, q<?> qVar, ReferenceQueue<? super q<?>> referenceQueue, boolean z) {
            super(qVar, referenceQueue);
            w wVar;
            Objects.requireNonNull(mVar, "Argument must not be null");
            this.a = mVar;
            if (!qVar.e || !z) {
                wVar = (w<Z>) false;
            } else {
                w wVar2 = (w<Z>) qVar.f962g;
                Objects.requireNonNull(wVar2, "Argument must not be null");
                wVar = wVar2;
            }
            this.f851c = wVar;
            this.b = qVar.e;
        }
    }

    public a(boolean z) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0015a());
        this.a = z;
        newSingleThreadExecutor.execute(new b(this));
    }

    public synchronized void a(m mVar, q<?> qVar) {
        b put = this.b.put(mVar, new b(mVar, qVar, this.f849c, this.a));
        if (put != null) {
            put.f851c = null;
            put.clear();
        }
    }

    public void b(b bVar) {
        synchronized (this) {
            this.b.remove(bVar.a);
            if (bVar.b) {
                w<?> wVar = bVar.f851c;
                if (wVar != null) {
                    this.f850d.a(bVar.a, new q<>(wVar, true, false, bVar.a, this.f850d));
                }
            }
        }
    }
}
