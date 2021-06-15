package k;

import h.a.t.a;
import i.s.c.h;
import java.io.IOException;

public final class c implements x {
    public final /* synthetic */ b e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f3736f;

    public c(b bVar, x xVar) {
        this.e = bVar;
        this.f3736f = xVar;
    }

    @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b bVar = this.e;
        bVar.h();
        try {
            this.f3736f.close();
            if (bVar.i()) {
                throw bVar.j(null);
            }
        } catch (IOException e2) {
            if (!bVar.i()) {
                throw e2;
            }
            throw bVar.j(e2);
        } finally {
            bVar.i();
        }
    }

    @Override // k.x, java.io.Flushable
    public void flush() {
        b bVar = this.e;
        bVar.h();
        try {
            this.f3736f.flush();
            if (bVar.i()) {
                throw bVar.j(null);
            }
        } catch (IOException e2) {
            if (!bVar.i()) {
                throw e2;
            }
            throw bVar.j(e2);
        } finally {
            bVar.i();
        }
    }

    @Override // k.x
    public a0 g() {
        return this.e;
    }

    @Override // k.x
    public void l(e eVar, long j2) {
        h.f(eVar, "source");
        a.i(eVar.f3738f, 0, j2);
        while (true) {
            long j3 = 0;
            if (j2 > 0) {
                u uVar = eVar.e;
                if (uVar != null) {
                    while (true) {
                        if (j3 >= ((long) 65536)) {
                            break;
                        }
                        j3 += (long) (uVar.f3763c - uVar.b);
                        if (j3 >= j2) {
                            j3 = j2;
                            break;
                        }
                        uVar = uVar.f3765f;
                        if (uVar == null) {
                            h.j();
                            throw null;
                        }
                    }
                    b bVar = this.e;
                    bVar.h();
                    try {
                        this.f3736f.l(eVar, j3);
                        if (!bVar.i()) {
                            j2 -= j3;
                        } else {
                            throw bVar.j(null);
                        }
                    } catch (IOException e2) {
                        if (!bVar.i()) {
                            throw e2;
                        }
                        throw bVar.j(e2);
                    } finally {
                        bVar.i();
                    }
                } else {
                    h.j();
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("AsyncTimeout.sink(");
        f2.append(this.f3736f);
        f2.append(')');
        return f2.toString();
    }
}
