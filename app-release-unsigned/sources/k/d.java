package k;

import c.c.a.a.a;
import i.s.c.h;
import java.io.IOException;

public final class d implements z {
    public final /* synthetic */ b e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ z f3737f;

    public d(b bVar, z zVar) {
        this.e = bVar;
        this.f3737f = zVar;
    }

    @Override // k.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b bVar = this.e;
        bVar.h();
        try {
            this.f3737f.close();
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

    @Override // k.z
    public a0 g() {
        return this.e;
    }

    @Override // k.z
    public long r(e eVar, long j2) {
        h.f(eVar, "sink");
        b bVar = this.e;
        bVar.h();
        try {
            long r = this.f3737f.r(eVar, j2);
            if (!bVar.i()) {
                return r;
            }
            throw bVar.j(null);
        } catch (IOException e2) {
            if (!bVar.i()) {
                throw e2;
            }
            throw bVar.j(e2);
        } finally {
            bVar.i();
        }
    }

    public String toString() {
        StringBuilder f2 = a.f("AsyncTimeout.source(");
        f2.append(this.f3737f);
        f2.append(')');
        return f2.toString();
    }
}
