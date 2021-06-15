package k;

import h.a.t.a;
import i.s.c.h;
import java.io.IOException;
import java.io.InputStream;

public final class o implements z {
    public final InputStream e;

    /* renamed from: f  reason: collision with root package name */
    public final a0 f3750f;

    public o(InputStream inputStream, a0 a0Var) {
        h.f(inputStream, "input");
        h.f(a0Var, "timeout");
        this.e = inputStream;
        this.f3750f = a0Var;
    }

    @Override // k.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.e.close();
    }

    @Override // k.z
    public a0 g() {
        return this.f3750f;
    }

    @Override // k.z
    public long r(e eVar, long j2) {
        h.f(eVar, "sink");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 == 0) {
            return 0;
        }
        if (i2 >= 0) {
            try {
                this.f3750f.f();
                u m0 = eVar.m0(1);
                int read = this.e.read(m0.a, m0.f3763c, (int) Math.min(j2, (long) (8192 - m0.f3763c)));
                if (read != -1) {
                    m0.f3763c += read;
                    long j3 = (long) read;
                    eVar.f3738f += j3;
                    return j3;
                } else if (m0.b != m0.f3763c) {
                    return -1;
                } else {
                    eVar.e = m0.a();
                    v.a(m0);
                    return -1;
                }
            } catch (AssertionError e2) {
                if (a.B(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        } else {
            throw new IllegalArgumentException(c.c.a.a.a.n("byteCount < 0: ", j2).toString());
        }
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("source(");
        f2.append(this.e);
        f2.append(')');
        return f2.toString();
    }
}
