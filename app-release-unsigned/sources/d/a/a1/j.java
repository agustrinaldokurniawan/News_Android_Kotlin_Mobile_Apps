package d.a.a1;

import c.c.a.a.a;

public final class j extends h {

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f1803g;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f1803g = runnable;
    }

    public void run() {
        try {
            this.f1803g.run();
        } finally {
            this.f1802f.b0();
        }
    }

    public String toString() {
        StringBuilder f2 = a.f("Task[");
        f2.append(h.a.t.a.t(this.f1803g));
        f2.append('@');
        f2.append(h.a.t.a.u(this.f1803g));
        f2.append(", ");
        f2.append(this.e);
        f2.append(", ");
        f2.append(this.f1802f);
        f2.append(']');
        return f2.toString();
    }
}
