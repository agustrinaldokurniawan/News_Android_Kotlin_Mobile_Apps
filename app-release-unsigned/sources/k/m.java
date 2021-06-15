package k;

import c.c.a.a.a;
import i.s.c.h;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class m implements z {
    public byte e;

    /* renamed from: f  reason: collision with root package name */
    public final t f3743f;

    /* renamed from: g  reason: collision with root package name */
    public final Inflater f3744g;

    /* renamed from: h  reason: collision with root package name */
    public final n f3745h;

    /* renamed from: i  reason: collision with root package name */
    public final CRC32 f3746i = new CRC32();

    public m(z zVar) {
        h.f(zVar, "source");
        t tVar = new t(zVar);
        this.f3743f = tVar;
        Inflater inflater = new Inflater(true);
        this.f3744g = inflater;
        this.f3745h = new n(tVar, inflater);
    }

    public final void b(String str, int i2, int i3) {
        if (i3 != i2) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3));
            h.b(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    public final void c(e eVar, long j2, long j3) {
        u uVar = eVar.e;
        if (uVar != null) {
            do {
                int i2 = uVar.f3763c;
                int i3 = uVar.b;
                if (j2 >= ((long) (i2 - i3))) {
                    j2 -= (long) (i2 - i3);
                    uVar = uVar.f3765f;
                } else {
                    while (j3 > 0) {
                        int i4 = (int) (((long) uVar.b) + j2);
                        int min = (int) Math.min((long) (uVar.f3763c - i4), j3);
                        this.f3746i.update(uVar.a, i4, min);
                        j3 -= (long) min;
                        uVar = uVar.f3765f;
                        if (uVar != null) {
                            j2 = 0;
                        } else {
                            h.j();
                            throw null;
                        }
                    }
                    return;
                }
            } while (uVar != null);
            h.j();
            throw null;
        }
        h.j();
        throw null;
    }

    @Override // k.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3745h.close();
    }

    @Override // k.z
    public a0 g() {
        return this.f3743f.g();
    }

    @Override // k.z
    public long r(e eVar, long j2) {
        long j3;
        h.f(eVar, "sink");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        boolean z = false;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(a.n("byteCount < 0: ", j2).toString());
        } else if (i2 == 0) {
            return 0;
        } else {
            if (this.e == 0) {
                this.f3743f.M(10);
                byte b0 = this.f3743f.e.b0(3);
                boolean z2 = ((b0 >> 1) & 1) == 1;
                if (z2) {
                    c(this.f3743f.e, 0, 10);
                }
                t tVar = this.f3743f;
                tVar.M(2);
                b("ID1ID2", 8075, tVar.e.readShort());
                this.f3743f.a(8);
                if (((b0 >> 2) & 1) == 1) {
                    this.f3743f.M(2);
                    if (z2) {
                        c(this.f3743f.e, 0, 2);
                    }
                    long h0 = (long) this.f3743f.e.h0();
                    this.f3743f.M(h0);
                    if (z2) {
                        j3 = h0;
                        c(this.f3743f.e, 0, h0);
                    } else {
                        j3 = h0;
                    }
                    this.f3743f.a(j3);
                }
                if (((b0 >> 3) & 1) == 1) {
                    long b = this.f3743f.b((byte) 0, 0, Long.MAX_VALUE);
                    if (b != -1) {
                        if (z2) {
                            c(this.f3743f.e, 0, b + 1);
                        }
                        this.f3743f.a(b + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((b0 >> 4) & 1) == 1) {
                    z = true;
                }
                if (z) {
                    long b2 = this.f3743f.b((byte) 0, 0, Long.MAX_VALUE);
                    if (b2 != -1) {
                        if (z2) {
                            c(this.f3743f.e, 0, b2 + 1);
                        }
                        this.f3743f.a(b2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z2) {
                    t tVar2 = this.f3743f;
                    tVar2.M(2);
                    b("FHCRC", tVar2.e.h0(), (short) ((int) this.f3746i.getValue()));
                    this.f3746i.reset();
                }
                this.e = 1;
            }
            if (this.e == 1) {
                long j4 = eVar.f3738f;
                long r = this.f3745h.r(eVar, j2);
                if (r != -1) {
                    c(eVar, j4, r);
                    return r;
                }
                this.e = 2;
            }
            if (this.e == 2) {
                b("CRC", this.f3743f.e(), (int) this.f3746i.getValue());
                b("ISIZE", this.f3743f.e(), (int) this.f3744g.getBytesWritten());
                this.e = 3;
                if (!this.f3743f.R()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }
}
