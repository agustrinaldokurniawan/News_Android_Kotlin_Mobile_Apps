package j;

import i.s.c.h;
import j.n0.f.d;
import j.n0.g.j;
import java.util.concurrent.TimeUnit;

public final class l {
    public final j a;

    public l() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        h.f(timeUnit, "timeUnit");
        j jVar = new j(d.a, 5, 5, timeUnit);
        h.f(jVar, "delegate");
        this.a = jVar;
    }
}
