package g.r;

import g.t.a.f;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class p {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final j b;

    /* renamed from: c  reason: collision with root package name */
    public volatile f f3001c;

    public p(j jVar) {
        this.b = jVar;
    }

    public f a() {
        this.b.a();
        if (!this.a.compareAndSet(false, true)) {
            return b();
        }
        if (this.f3001c == null) {
            this.f3001c = b();
        }
        return this.f3001c;
    }

    public final f b() {
        String c2 = c();
        j jVar = this.b;
        jVar.a();
        jVar.b();
        return jVar.f2977d.P().D(c2);
    }

    public abstract String c();

    public void d(f fVar) {
        if (fVar == this.f3001c) {
            this.a.set(false);
        }
    }
}
