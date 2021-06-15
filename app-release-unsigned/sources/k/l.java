package k;

import i.s.c.h;
import java.util.concurrent.TimeUnit;

public class l extends a0 {
    public a0 e;

    public l(a0 a0Var) {
        h.f(a0Var, "delegate");
        this.e = a0Var;
    }

    @Override // k.a0
    public a0 a() {
        return this.e.a();
    }

    @Override // k.a0
    public a0 b() {
        return this.e.b();
    }

    @Override // k.a0
    public long c() {
        return this.e.c();
    }

    @Override // k.a0
    public a0 d(long j2) {
        return this.e.d(j2);
    }

    @Override // k.a0
    public boolean e() {
        return this.e.e();
    }

    @Override // k.a0
    public void f() {
        this.e.f();
    }

    @Override // k.a0
    public a0 g(long j2, TimeUnit timeUnit) {
        h.f(timeUnit, "unit");
        return this.e.g(j2, timeUnit);
    }
}
