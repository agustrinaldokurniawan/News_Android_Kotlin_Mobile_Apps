package k;

import c.c.a.a.a;
import i.s.c.h;
import java.nio.ByteBuffer;

public final class s implements g {
    public final e e = new e();

    /* renamed from: f  reason: collision with root package name */
    public boolean f3759f;

    /* renamed from: g  reason: collision with root package name */
    public final x f3760g;

    public s(x xVar) {
        h.f(xVar, "sink");
        this.f3760g = xVar;
    }

    @Override // k.g
    public g A(int i2) {
        if (!this.f3759f) {
            this.e.v0(i2);
            b();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public g E(int i2) {
        if (!this.f3759f) {
            this.e.u0(i2);
            b();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public g N(String str) {
        h.f(str, "string");
        if (!this.f3759f) {
            this.e.w0(str);
            b();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public g O(long j2) {
        if (!this.f3759f) {
            this.e.O(j2);
            b();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public g T(int i2) {
        if (!this.f3759f) {
            this.e.r0(i2);
            b();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public g b() {
        if (!this.f3759f) {
            long Q = this.e.Q();
            if (Q > 0) {
                this.f3760g.l(this.e, Q);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.x, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        if (!this.f3759f) {
            Throwable th = null;
            try {
                e eVar = this.e;
                long j2 = eVar.f3738f;
                if (j2 > 0) {
                    this.f3760g.l(eVar, j2);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f3760g.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f3759f = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // k.g
    public e d() {
        return this.e;
    }

    @Override // k.x, k.g, java.io.Flushable
    public void flush() {
        if (!this.f3759f) {
            e eVar = this.e;
            long j2 = eVar.f3738f;
            if (j2 > 0) {
                this.f3760g.l(eVar, j2);
            }
            this.f3760g.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.x
    public a0 g() {
        return this.f3760g.g();
    }

    @Override // k.g
    public g h(byte[] bArr) {
        h.f(bArr, "source");
        if (!this.f3759f) {
            this.e.o0(bArr);
            b();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public g i(byte[] bArr, int i2, int i3) {
        h.f(bArr, "source");
        if (!this.f3759f) {
            this.e.p0(bArr, i2, i3);
            b();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f3759f;
    }

    @Override // k.x
    public void l(e eVar, long j2) {
        h.f(eVar, "source");
        if (!this.f3759f) {
            this.e.l(eVar, j2);
            b();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public g m(i iVar) {
        h.f(iVar, "byteString");
        if (!this.f3759f) {
            this.e.n0(iVar);
            b();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public g p(long j2) {
        if (!this.f3759f) {
            this.e.p(j2);
            return b();
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        StringBuilder f2 = a.f("buffer(");
        f2.append(this.f3760g);
        f2.append(')');
        return f2.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        h.f(byteBuffer, "source");
        if (!this.f3759f) {
            int write = this.e.write(byteBuffer);
            b();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }
}
