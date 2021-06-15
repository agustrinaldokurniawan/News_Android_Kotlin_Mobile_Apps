package j.n0.j;

import c.c.a.a.a;
import i.s.c.h;
import j.n0.c;
import j.n0.j.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.e;
import k.g;

public final class p implements Closeable {
    public static final Logger e = Logger.getLogger(e.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public final e f3669f;

    /* renamed from: g  reason: collision with root package name */
    public int f3670g = 16384;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3671h;

    /* renamed from: i  reason: collision with root package name */
    public final d.b f3672i;

    /* renamed from: j  reason: collision with root package name */
    public final g f3673j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f3674k;

    public p(g gVar, boolean z) {
        h.f(gVar, "sink");
        this.f3673j = gVar;
        this.f3674k = z;
        e eVar = new e();
        this.f3669f = eVar;
        this.f3672i = new d.b(0, false, eVar, 3);
    }

    public final synchronized void K(boolean z, int i2, int i3) {
        if (!this.f3671h) {
            e(0, 8, 6, z ? 1 : 0);
            this.f3673j.E(i2);
            this.f3673j.E(i3);
            this.f3673j.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void Q(int i2, b bVar) {
        h.f(bVar, "errorCode");
        if (!this.f3671h) {
            if (bVar.f3576m != -1) {
                e(i2, 4, 3, 0);
                this.f3673j.E(bVar.f3576m);
                this.f3673j.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void V(int i2, long j2) {
        if (!this.f3671h) {
            if (j2 != 0 && j2 <= 2147483647L) {
                e(i2, 4, 8, 0);
                this.f3673j.E((int) j2);
                this.f3673j.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void b(t tVar) {
        h.f(tVar, "peerSettings");
        if (!this.f3671h) {
            int i2 = this.f3670g;
            int i3 = tVar.a;
            if ((i3 & 32) != 0) {
                i2 = tVar.b[5];
            }
            this.f3670g = i2;
            int i4 = i3 & 2;
            int i5 = -1;
            if ((i4 != 0 ? tVar.b[1] : -1) != -1) {
                d.b bVar = this.f3672i;
                if (i4 != 0) {
                    i5 = tVar.b[1];
                }
                bVar.f3593h = i5;
                int min = Math.min(i5, 16384);
                int i6 = bVar.f3589c;
                if (i6 != min) {
                    if (min < i6) {
                        bVar.a = Math.min(bVar.a, min);
                    }
                    bVar.b = true;
                    bVar.f3589c = min;
                    int i7 = bVar.f3592g;
                    if (min < i7) {
                        if (min == 0) {
                            bVar.a();
                        } else {
                            bVar.b(i7 - min);
                        }
                    }
                }
            }
            e(0, 0, 4, 1);
            this.f3673j.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void b0(int i2, long j2) {
        while (j2 > 0) {
            long min = Math.min((long) this.f3670g, j2);
            j2 -= min;
            e(i2, (int) min, 9, j2 == 0 ? 4 : 0);
            this.f3673j.l(this.f3669f, min);
        }
    }

    public final synchronized void c(boolean z, int i2, e eVar, int i3) {
        if (!this.f3671h) {
            e(i2, i3, 0, z ? 1 : 0);
            if (i3 > 0) {
                g gVar = this.f3673j;
                if (eVar != null) {
                    gVar.l(eVar, (long) i3);
                } else {
                    h.j();
                    throw null;
                }
            }
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f3671h = true;
        this.f3673j.close();
    }

    public final void e(int i2, int i3, int i4, int i5) {
        Logger logger = e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.e.b(false, i2, i3, i4, i5));
        }
        boolean z = true;
        if (i3 <= this.f3670g) {
            if ((((int) 2147483648L) & i2) != 0) {
                z = false;
            }
            if (z) {
                g gVar = this.f3673j;
                byte[] bArr = c.a;
                h.f(gVar, "$this$writeMedium");
                gVar.T((i3 >>> 16) & 255);
                gVar.T((i3 >>> 8) & 255);
                gVar.T(i3 & 255);
                this.f3673j.T(i4 & 255);
                this.f3673j.T(i5 & 255);
                this.f3673j.E(i2 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(a.l("reserved bit set: ", i2).toString());
        }
        StringBuilder f2 = a.f("FRAME_SIZE_ERROR length > ");
        f2.append(this.f3670g);
        f2.append(": ");
        f2.append(i3);
        throw new IllegalArgumentException(f2.toString().toString());
    }

    public final synchronized void flush() {
        if (!this.f3671h) {
            this.f3673j.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void n(int i2, b bVar, byte[] bArr) {
        h.f(bVar, "errorCode");
        h.f(bArr, "debugData");
        if (!this.f3671h) {
            boolean z = false;
            if (bVar.f3576m != -1) {
                e(0, bArr.length + 8, 7, 0);
                this.f3673j.E(i2);
                this.f3673j.E(bVar.f3576m);
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.f3673j.h(bArr);
                }
                this.f3673j.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void u(boolean z, int i2, List<c> list) {
        h.f(list, "headerBlock");
        if (!this.f3671h) {
            this.f3672i.e(list);
            long j2 = this.f3669f.f3738f;
            long min = Math.min((long) this.f3670g, j2);
            int i3 = (j2 > min ? 1 : (j2 == min ? 0 : -1));
            int i4 = i3 == 0 ? 4 : 0;
            if (z) {
                i4 |= 1;
            }
            e(i2, (int) min, 1, i4);
            this.f3673j.l(this.f3669f, min);
            if (i3 > 0) {
                b0(i2, j2 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
