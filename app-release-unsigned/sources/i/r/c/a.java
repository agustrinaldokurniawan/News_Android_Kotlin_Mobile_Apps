package i.r.c;

import i.s.c.h;

public class a extends i.r.a {
    @Override // i.r.a
    public void a(Throwable th, Throwable th2) {
        h.e(th, "cause");
        h.e(th2, "exception");
        th.addSuppressed(th2);
    }
}
