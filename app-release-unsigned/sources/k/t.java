package k;

import i.s.c.h;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class t implements h {
    public final e e = new e();

    /* renamed from: f  reason: collision with root package name */
    public boolean f3761f;

    /* renamed from: g  reason: collision with root package name */
    public final z f3762g;

    public t(z zVar) {
        h.f(zVar, "source");
        this.f3762g = zVar;
    }

    @Override // k.h
    public String J() {
        return w(Long.MAX_VALUE);
    }

    @Override // k.h
    public void M(long j2) {
        if (!f(j2)) {
            throw new EOFException();
        }
    }

    @Override // k.h
    public boolean R() {
        if (!this.f3761f) {
            return this.e.R() && this.f3762g.r(this.e, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.h
    public byte[] W(long j2) {
        if (f(j2)) {
            return this.e.W(j2);
        }
        throw new EOFException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    @Override // k.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Y() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: k.t.Y():long");
    }

    @Override // k.h
    public void a(long j2) {
        if (!this.f3761f) {
            while (j2 > 0) {
                e eVar = this.e;
                if (eVar.f3738f == 0 && this.f3762g.r(eVar, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j2, this.e.f3738f);
                this.e.a(min);
                j2 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.h
    public InputStream a0() {
        return new a(this);
    }

    public long b(byte b, long j2, long j3) {
        boolean z = true;
        if (!this.f3761f) {
            if (0 > j2 || j3 < j2) {
                z = false;
            }
            if (z) {
                while (j2 < j3) {
                    long d0 = this.e.d0(b, j2, j3);
                    if (d0 != -1) {
                        return d0;
                    }
                    e eVar = this.e;
                    long j4 = eVar.f3738f;
                    if (j4 >= j3 || this.f3762g.r(eVar, (long) 8192) == -1) {
                        return -1;
                    }
                    j2 = Math.max(j2, j4);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public h c() {
        r rVar = new r(this);
        h.f(rVar, "$this$buffer");
        return new t(rVar);
    }

    @Override // k.h
    public int c0(p pVar) {
        h.f(pVar, "options");
        if (!this.f3761f) {
            while (true) {
                int b = k.b0.a.b(this.e, pVar, true);
                if (b == -2) {
                    if (this.f3762g.r(this.e, (long) 8192) == -1) {
                        break;
                    }
                } else if (b != -1) {
                    this.e.a((long) pVar.f3751f[b].d());
                    return b;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.z, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        if (!this.f3761f) {
            this.f3761f = true;
            this.f3762g.close();
            e eVar = this.e;
            eVar.a(eVar.f3738f);
        }
    }

    @Override // k.h
    public e d() {
        return this.e;
    }

    public int e() {
        M(4);
        int readInt = this.e.readInt();
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // k.h
    public boolean f(long j2) {
        e eVar;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(c.c.a.a.a.n("byteCount < 0: ", j2).toString());
        } else if (!this.f3761f) {
            do {
                eVar = this.e;
                if (eVar.f3738f >= j2) {
                    return true;
                }
            } while (this.f3762g.r(eVar, (long) 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // k.z
    public a0 g() {
        return this.f3762g.g();
    }

    public boolean isOpen() {
        return !this.f3761f;
    }

    @Override // k.h
    public long o(i iVar) {
        h.f(iVar, "targetBytes");
        h.f(iVar, "targetBytes");
        if (!this.f3761f) {
            long j2 = 0;
            while (true) {
                long e0 = this.e.e0(iVar, j2);
                if (e0 != -1) {
                    return e0;
                }
                e eVar = this.e;
                long j3 = eVar.f3738f;
                if (this.f3762g.r(eVar, (long) 8192) == -1) {
                    return -1;
                }
                j2 = Math.max(j2, j3);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // k.h
    public e q() {
        return this.e;
    }

    @Override // k.z
    public long r(e eVar, long j2) {
        h.f(eVar, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(c.c.a.a.a.n("byteCount < 0: ", j2).toString());
        } else if (!this.f3761f) {
            e eVar2 = this.e;
            if (eVar2.f3738f == 0 && this.f3762g.r(eVar2, (long) 8192) == -1) {
                return -1;
            }
            return this.e.r(eVar, Math.min(j2, this.e.f3738f));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        h.f(byteBuffer, "sink");
        e eVar = this.e;
        if (eVar.f3738f == 0 && this.f3762g.r(eVar, (long) 8192) == -1) {
            return -1;
        }
        return this.e.read(byteBuffer);
    }

    @Override // k.h
    public byte readByte() {
        M(1);
        return this.e.readByte();
    }

    @Override // k.h
    public int readInt() {
        M(4);
        return this.e.readInt();
    }

    @Override // k.h
    public short readShort() {
        M(2);
        return this.e.readShort();
    }

    @Override // k.h
    public i t(long j2) {
        if (f(j2)) {
            return this.e.t(j2);
        }
        throw new EOFException();
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("buffer(");
        f2.append(this.f3762g);
        f2.append(')');
        return f2.toString();
    }

    @Override // k.h
    public String w(long j2) {
        if (j2 >= 0) {
            long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
            byte b = (byte) 10;
            long b2 = b(b, 0, j3);
            if (b2 != -1) {
                return k.b0.a.a(this.e, b2);
            }
            if (j3 < Long.MAX_VALUE && f(j3) && this.e.b0(j3 - 1) == ((byte) 13) && f(1 + j3) && this.e.b0(j3) == b) {
                return k.b0.a.a(this.e, j3);
            }
            e eVar = new e();
            e eVar2 = this.e;
            eVar2.V(eVar, 0, Math.min((long) 32, eVar2.f3738f));
            throw new EOFException("\\n not found: limit=" + Math.min(this.e.f3738f, j2) + " content=" + eVar.g0().e() + "…");
        }
        throw new IllegalArgumentException(c.c.a.a.a.n("limit < 0: ", j2).toString());
    }

    @Override // k.h
    public long z(x xVar) {
        h.f(xVar, "sink");
        long j2 = 0;
        while (this.f3762g.r(this.e, (long) 8192) != -1) {
            long Q = this.e.Q();
            if (Q > 0) {
                j2 += Q;
                ((e) xVar).l(this.e, Q);
            }
        }
        e eVar = this.e;
        long j3 = eVar.f3738f;
        if (j3 <= 0) {
            return j2;
        }
        long j4 = j2 + j3;
        ((e) xVar).l(eVar, j3);
        return j4;
    }

    public static final class a extends InputStream {
        public final /* synthetic */ t e;

        public a(t tVar) {
            this.e = tVar;
        }

        @Override // java.io.InputStream
        public int available() {
            t tVar = this.e;
            if (!tVar.f3761f) {
                return (int) Math.min(tVar.e.f3738f, (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() {
            this.e.close();
        }

        @Override // java.io.InputStream
        public int read() {
            t tVar = this.e;
            if (!tVar.f3761f) {
                e eVar = tVar.e;
                if (eVar.f3738f == 0 && tVar.f3762g.r(eVar, (long) 8192) == -1) {
                    return -1;
                }
                return this.e.e.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return this.e + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            h.f(bArr, "data");
            if (!this.e.f3761f) {
                h.a.t.a.i((long) bArr.length, (long) i2, (long) i3);
                t tVar = this.e;
                e eVar = tVar.e;
                if (eVar.f3738f == 0 && tVar.f3762g.r(eVar, (long) 8192) == -1) {
                    return -1;
                }
                return this.e.e.f0(bArr, i2, i3);
            }
            throw new IOException("closed");
        }
    }
}
