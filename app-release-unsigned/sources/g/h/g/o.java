package g.h.g;

import android.os.Handler;
import java.util.concurrent.Callable;

public class o<T> implements Runnable {
    public Callable<T> e;

    /* renamed from: f  reason: collision with root package name */
    public g.h.i.a<T> f2505f;

    /* renamed from: g  reason: collision with root package name */
    public Handler f2506g;

    public class a implements Runnable {
        public final /* synthetic */ g.h.i.a e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f2507f;

        public a(o oVar, g.h.i.a aVar, Object obj) {
            this.e = aVar;
            this.f2507f = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: g.h.i.a */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            this.e.a(this.f2507f);
        }
    }

    public o(Handler handler, Callable<T> callable, g.h.i.a<T> aVar) {
        this.e = callable;
        this.f2505f = aVar;
        this.f2506g = handler;
    }

    public void run() {
        T t;
        try {
            t = this.e.call();
        } catch (Exception unused) {
            t = null;
        }
        this.f2506g.post(new a(this, this.f2505f, t));
    }
}
