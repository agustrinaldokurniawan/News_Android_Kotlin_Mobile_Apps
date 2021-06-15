package g.r;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class q implements Executor {
    public final Executor e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque<Runnable> f3002f = new ArrayDeque<>();

    /* renamed from: g  reason: collision with root package name */
    public Runnable f3003g;

    public class a implements Runnable {
        public final /* synthetic */ Runnable e;

        public a(Runnable runnable) {
            this.e = runnable;
        }

        public void run() {
            try {
                this.e.run();
            } finally {
                q.this.a();
            }
        }
    }

    public q(Executor executor) {
        this.e = executor;
    }

    public synchronized void a() {
        Runnable poll = this.f3002f.poll();
        this.f3003g = poll;
        if (poll != null) {
            this.e.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f3002f.offer(new a(runnable));
        if (this.f3003g == null) {
            a();
        }
    }
}
