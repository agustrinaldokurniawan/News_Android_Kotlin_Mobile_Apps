package c.b.a;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class u<T> {
    public static Executor a = Executors.newCachedThreadPool();
    public final Set<o<T>> b = new LinkedHashSet(1);

    /* renamed from: c  reason: collision with root package name */
    public final Set<o<Throwable>> f716c = new LinkedHashSet(1);

    /* renamed from: d  reason: collision with root package name */
    public final Handler f717d = new Handler(Looper.getMainLooper());
    public volatile s<T> e = null;

    public class a extends FutureTask<s<T>> {
        public a(Callable<s<T>> callable) {
            super(callable);
        }

        public void done() {
            if (!isCancelled()) {
                try {
                    u.this.c((s) get());
                } catch (InterruptedException | ExecutionException e2) {
                    u.this.c(new s<>(e2));
                }
            }
        }
    }

    public u(Callable<s<T>> callable, boolean z) {
        if (z) {
            try {
                c(callable.call());
            } catch (Throwable th) {
                c(new s<>(th));
            }
        } else {
            a.execute(new a(callable));
        }
    }

    public synchronized u<T> a(o<Throwable> oVar) {
        if (!(this.e == null || this.e.b == null)) {
            oVar.a(this.e.b);
        }
        this.f716c.add(oVar);
        return this;
    }

    public synchronized u<T> b(o<T> oVar) {
        if (!(this.e == null || this.e.a == null)) {
            oVar.a(this.e.a);
        }
        this.b.add(oVar);
        return this;
    }

    public final void c(s<T> sVar) {
        if (this.e == null) {
            this.e = sVar;
            this.f717d.post(new t(this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
