package k;

import i.s.c.h;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class a0 {
    public static final a0 a = new a();
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public long f3728c;

    /* renamed from: d  reason: collision with root package name */
    public long f3729d;

    public static final class a extends a0 {
        @Override // k.a0
        public a0 d(long j2) {
            return this;
        }

        @Override // k.a0
        public void f() {
        }

        @Override // k.a0
        public a0 g(long j2, TimeUnit timeUnit) {
            h.f(timeUnit, "unit");
            return this;
        }
    }

    public a0 a() {
        this.b = false;
        return this;
    }

    public a0 b() {
        this.f3729d = 0;
        return this;
    }

    public long c() {
        if (this.b) {
            return this.f3728c;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public a0 d(long j2) {
        this.b = true;
        this.f3728c = j2;
        return this;
    }

    public boolean e() {
        return this.b;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.b && this.f3728c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public a0 g(long j2, TimeUnit timeUnit) {
        h.f(timeUnit, "unit");
        if (j2 >= 0) {
            this.f3729d = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(c.c.a.a.a.n("timeout < 0: ", j2).toString());
    }
}
