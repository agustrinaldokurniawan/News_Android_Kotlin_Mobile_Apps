package g.c.a.a;

import java.util.concurrent.Executor;

public class a extends c {
    public static volatile a a;
    public static final Executor b = new ExecutorC0068a();

    /* renamed from: c  reason: collision with root package name */
    public c f2198c;

    /* renamed from: d  reason: collision with root package name */
    public c f2199d;

    /* renamed from: g.c.a.a.a$a  reason: collision with other inner class name */
    public static class ExecutorC0068a implements Executor {
        public void execute(Runnable runnable) {
            a.d().f2198c.a(runnable);
        }
    }

    public a() {
        b bVar = new b();
        this.f2199d = bVar;
        this.f2198c = bVar;
    }

    public static a d() {
        if (a != null) {
            return a;
        }
        synchronized (a.class) {
            if (a == null) {
                a = new a();
            }
        }
        return a;
    }

    @Override // g.c.a.a.c
    public void a(Runnable runnable) {
        this.f2198c.a(runnable);
    }

    @Override // g.c.a.a.c
    public boolean b() {
        return this.f2198c.b();
    }

    @Override // g.c.a.a.c
    public void c(Runnable runnable) {
        this.f2198c.c(runnable);
    }
}
