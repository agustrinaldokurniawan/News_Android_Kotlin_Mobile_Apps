package k;

import h.a.t.a;
import i.s.c.h;
import java.io.OutputStream;

public final class q implements x {
    public final OutputStream e;

    /* renamed from: f  reason: collision with root package name */
    public final a0 f3753f;

    public q(OutputStream outputStream, a0 a0Var) {
        h.f(outputStream, "out");
        h.f(a0Var, "timeout");
        this.e = outputStream;
        this.f3753f = a0Var;
    }

    @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.e.close();
    }

    @Override // k.x, java.io.Flushable
    public void flush() {
        this.e.flush();
    }

    @Override // k.x
    public a0 g() {
        return this.f3753f;
    }

    @Override // k.x
    public void l(e eVar, long j2) {
        h.f(eVar, "source");
        a.i(eVar.f3738f, 0, j2);
        while (j2 > 0) {
            this.f3753f.f();
            u uVar = eVar.e;
            if (uVar != null) {
                int min = (int) Math.min(j2, (long) (uVar.f3763c - uVar.b));
                this.e.write(uVar.a, uVar.b, min);
                int i2 = uVar.b + min;
                uVar.b = i2;
                long j3 = (long) min;
                j2 -= j3;
                eVar.f3738f -= j3;
                if (i2 == uVar.f3763c) {
                    eVar.e = uVar.a();
                    v.a(uVar);
                }
            } else {
                h.j();
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("sink(");
        f2.append(this.e);
        f2.append(')');
        return f2.toString();
    }
}
