package g.n;

import androidx.lifecycle.LiveData;
import java.util.concurrent.atomic.AtomicReference;
import l.b.b;
import l.b.c;

public class m<T> extends LiveData<T> {

    /* renamed from: l  reason: collision with root package name */
    public final l.b.a<T> f2817l;

    /* renamed from: m  reason: collision with root package name */
    public final AtomicReference<m<T>.a> f2818m = new AtomicReference<>();

    public final class a extends AtomicReference<c> implements b<T> {

        /* renamed from: g.n.m$a$a  reason: collision with other inner class name */
        public class RunnableC0087a implements Runnable {
            public final /* synthetic */ Throwable e;

            public RunnableC0087a(a aVar, Throwable th) {
                this.e = th;
            }

            public void run() {
                throw new RuntimeException("LiveData does not handle errors. Errors from publishers should be handled upstream and propagated as state", this.e);
            }
        }

        public a() {
        }

        @Override // l.b.b
        public void a() {
            m.this.f2818m.compareAndSet(this, null);
        }

        @Override // l.b.b
        public void b(Throwable th) {
            m.this.f2818m.compareAndSet(this, null);
            g.c.a.a.a d2 = g.c.a.a.a.d();
            RunnableC0087a aVar = new RunnableC0087a(this, th);
            if (!d2.b()) {
                d2.c(aVar);
            } else {
                aVar.run();
                throw null;
            }
        }

        @Override // l.b.b
        public void c(T t) {
            boolean z;
            m mVar = m.this;
            synchronized (mVar.b) {
                z = mVar.f191g == LiveData.a;
                mVar.f191g = t;
            }
            if (z) {
                g.c.a.a.a.d().f2198c.c(mVar.f195k);
            }
        }

        @Override // l.b.b
        public void g(c cVar) {
            if (compareAndSet(null, cVar)) {
                cVar.f(Long.MAX_VALUE);
            } else {
                cVar.cancel();
            }
        }
    }

    public m(l.b.a<T> aVar) {
        this.f2817l = aVar;
    }

    @Override // androidx.lifecycle.LiveData
    public void e() {
        m<T>.a aVar = new a();
        this.f2818m.set(aVar);
        this.f2817l.b(aVar);
    }

    @Override // androidx.lifecycle.LiveData
    public void f() {
        c cVar;
        m<T>.a andSet = this.f2818m.getAndSet(null);
        if (andSet != null && (cVar = (c) andSet.get()) != null) {
            cVar.cancel();
        }
    }
}
