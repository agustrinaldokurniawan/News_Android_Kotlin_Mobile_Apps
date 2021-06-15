package h.a.o.a;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import h.a.m;
import h.a.p.c;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class b extends m {
    public final Handler a;

    public static final class a extends m.b {
        public final Handler e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f3077f;

        /* renamed from: g  reason: collision with root package name */
        public volatile boolean f3078g;

        public a(Handler handler, boolean z) {
            this.e = handler;
            this.f3077f = z;
        }

        @Override // h.a.m.b
        @SuppressLint({"NewApi"})
        public c c(Runnable runnable, long j2, TimeUnit timeUnit) {
            h.a.s.a.c cVar = h.a.s.a.c.INSTANCE;
            Objects.requireNonNull(runnable, "run == null");
            Objects.requireNonNull(timeUnit, "unit == null");
            if (this.f3078g) {
                return cVar;
            }
            Handler handler = this.e;
            RunnableC0103b bVar = new RunnableC0103b(handler, runnable);
            Message obtain = Message.obtain(handler, bVar);
            obtain.obj = this;
            if (this.f3077f) {
                obtain.setAsynchronous(true);
            }
            this.e.sendMessageDelayed(obtain, timeUnit.toMillis(j2));
            if (!this.f3078g) {
                return bVar;
            }
            this.e.removeCallbacks(bVar);
            return cVar;
        }

        @Override // h.a.p.c
        public void e() {
            this.f3078g = true;
            this.e.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: h.a.o.a.b$b  reason: collision with other inner class name */
    public static final class RunnableC0103b implements Runnable, c {
        public final Handler e;

        /* renamed from: f  reason: collision with root package name */
        public final Runnable f3079f;

        /* renamed from: g  reason: collision with root package name */
        public volatile boolean f3080g;

        public RunnableC0103b(Handler handler, Runnable runnable) {
            this.e = handler;
            this.f3079f = runnable;
        }

        @Override // h.a.p.c
        public void e() {
            this.e.removeCallbacks(this);
            this.f3080g = true;
        }

        public void run() {
            try {
                this.f3079f.run();
            } catch (Throwable th) {
                h.a.t.a.M(th);
            }
        }
    }

    public b(Handler handler, boolean z) {
        this.a = handler;
    }

    @Override // h.a.m
    public m.b a() {
        return new a(this.a, false);
    }

    @Override // h.a.m
    @SuppressLint({"NewApi"})
    public c c(Runnable runnable, long j2, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run == null");
        Objects.requireNonNull(timeUnit, "unit == null");
        Handler handler = this.a;
        RunnableC0103b bVar = new RunnableC0103b(handler, runnable);
        this.a.sendMessageDelayed(Message.obtain(handler, bVar), timeUnit.toMillis(j2));
        return bVar;
    }
}
