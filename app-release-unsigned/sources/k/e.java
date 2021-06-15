package k;

import i.s.c.h;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Objects;
import k.b0.b;

public final class e implements h, g, Cloneable, ByteChannel {
    public u e;

    /* renamed from: f  reason: collision with root package name */
    public long f3738f;

    public static final class a extends InputStream {
        public final /* synthetic */ e e;

        public a(e eVar) {
            this.e = eVar;
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(this.e.f3738f, (long) Integer.MAX_VALUE);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            e eVar = this.e;
            if (eVar.f3738f > 0) {
                return eVar.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            h.f(bArr, "sink");
            return this.e.f0(bArr, i2, i3);
        }

        public String toString() {
            return this.e + ".inputStream()";
        }
    }

    @Override // k.g
    public /* bridge */ /* synthetic */ g A(int i2) {
        v0(i2);
        return this;
    }

    @Override // k.g
    public /* bridge */ /* synthetic */ g E(int i2) {
        u0(i2);
        return this;
    }

    @Override // k.h
    public String J() {
        return w(Long.MAX_VALUE);
    }

    @Override // k.h
    public void M(long j2) {
        if (this.f3738f < j2) {
            throw new EOFException();
        }
    }

    @Override // k.g
    public /* bridge */ /* synthetic */ g N(String str) {
        w0(str);
        return this;
    }

    public final long Q() {
        long j2 = this.f3738f;
        if (j2 == 0) {
            return 0;
        }
        u uVar = this.e;
        if (uVar != null) {
            u uVar2 = uVar.f3766g;
            if (uVar2 != null) {
                int i2 = uVar2.f3763c;
                if (i2 < 8192 && uVar2.e) {
                    j2 -= (long) (i2 - uVar2.b);
                }
                return j2;
            }
            h.j();
            throw null;
        }
        h.j();
        throw null;
    }

    @Override // k.h
    public boolean R() {
        return this.f3738f == 0;
    }

    @Override // k.g
    public /* bridge */ /* synthetic */ g T(int i2) {
        r0(i2);
        return this;
    }

    public final e V(e eVar, long j2, long j3) {
        h.f(eVar, "out");
        h.a.t.a.i(this.f3738f, j2, j3);
        if (j3 != 0) {
            eVar.f3738f += j3;
            u uVar = this.e;
            while (uVar != null) {
                int i2 = uVar.f3763c;
                int i3 = uVar.b;
                if (j2 >= ((long) (i2 - i3))) {
                    j2 -= (long) (i2 - i3);
                    uVar = uVar.f3765f;
                } else {
                    while (j3 > 0) {
                        if (uVar != null) {
                            u c2 = uVar.c();
                            int i4 = c2.b + ((int) j2);
                            c2.b = i4;
                            c2.f3763c = Math.min(i4 + ((int) j3), c2.f3763c);
                            u uVar2 = eVar.e;
                            if (uVar2 == null) {
                                c2.f3766g = c2;
                                c2.f3765f = c2;
                                eVar.e = c2;
                            } else if (uVar2 != null) {
                                u uVar3 = uVar2.f3766g;
                                if (uVar3 != null) {
                                    uVar3.b(c2);
                                } else {
                                    h.j();
                                    throw null;
                                }
                            } else {
                                h.j();
                                throw null;
                            }
                            j3 -= (long) (c2.f3763c - c2.b);
                            uVar = uVar.f3765f;
                            j2 = 0;
                        } else {
                            h.j();
                            throw null;
                        }
                    }
                }
            }
            h.j();
            throw null;
        }
        return this;
    }

    @Override // k.h
    public byte[] W(long j2) {
        int i2 = 0;
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(c.c.a.a.a.n("byteCount: ", j2).toString());
        } else if (this.f3738f >= j2) {
            int i3 = (int) j2;
            byte[] bArr = new byte[i3];
            h.f(bArr, "sink");
            while (i2 < i3) {
                int f0 = f0(bArr, i2, i3 - i2);
                if (f0 != -1) {
                    i2 += f0;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
        if (r9 != r10) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
        r15.e = r7.a();
        k.v.a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        r7.b = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        if (r6 != false) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0077 A[SYNTHETIC] */
    @Override // k.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Y() {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.Y():long");
    }

    @Override // k.h
    public void a(long j2) {
        while (j2 > 0) {
            u uVar = this.e;
            if (uVar != null) {
                int min = (int) Math.min(j2, (long) (uVar.f3763c - uVar.b));
                long j3 = (long) min;
                this.f3738f -= j3;
                j2 -= j3;
                int i2 = uVar.b + min;
                uVar.b = i2;
                if (i2 == uVar.f3763c) {
                    this.e = uVar.a();
                    v.a(uVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // k.h
    public InputStream a0() {
        return new a(this);
    }

    public final byte b0(long j2) {
        h.a.t.a.i(this.f3738f, j2, 1);
        u uVar = this.e;
        if (uVar != null) {
            long j3 = this.f3738f;
            if (j3 - j2 < j2) {
                while (j3 > j2) {
                    uVar = uVar.f3766g;
                    if (uVar != null) {
                        j3 -= (long) (uVar.f3763c - uVar.b);
                    } else {
                        h.j();
                        throw null;
                    }
                }
                return uVar.a[(int) ((((long) uVar.b) + j2) - j3)];
            }
            long j4 = 0;
            while (true) {
                int i2 = uVar.f3763c;
                int i3 = uVar.b;
                long j5 = ((long) (i2 - i3)) + j4;
                if (j5 > j2) {
                    return uVar.a[(int) ((((long) i3) + j2) - j4)];
                }
                uVar = uVar.f3765f;
                if (uVar != null) {
                    j4 = j5;
                } else {
                    h.j();
                    throw null;
                }
            }
        } else {
            h.j();
            throw null;
        }
    }

    @Override // k.h
    public int c0(p pVar) {
        h.f(pVar, "options");
        int b = k.b0.a.b(this, pVar, false);
        if (b == -1) {
            return -1;
        }
        a((long) pVar.f3751f[b].d());
        return b;
    }

    @Override // java.lang.Object
    public Object clone() {
        e eVar = new e();
        if (this.f3738f != 0) {
            u uVar = this.e;
            if (uVar != null) {
                u c2 = uVar.c();
                eVar.e = c2;
                c2.f3766g = c2;
                c2.f3765f = c2;
                for (u uVar2 = uVar.f3765f; uVar2 != uVar; uVar2 = uVar2.f3765f) {
                    u uVar3 = c2.f3766g;
                    if (uVar3 == null) {
                        h.j();
                        throw null;
                    } else if (uVar2 != null) {
                        uVar3.b(uVar2.c());
                    } else {
                        h.j();
                        throw null;
                    }
                }
                eVar.f3738f = this.f3738f;
            } else {
                h.j();
                throw null;
            }
        }
        return eVar;
    }

    @Override // java.lang.AutoCloseable, k.x, k.z, java.io.Closeable, java.nio.channels.Channel
    public void close() {
    }

    @Override // k.h, k.g
    public e d() {
        return this;
    }

    public long d0(byte b, long j2, long j3) {
        u uVar;
        long j4 = 0;
        if (0 <= j2 && j3 >= j2) {
            long j5 = this.f3738f;
            if (j3 > j5) {
                j3 = j5;
            }
            if (!(j2 == j3 || (uVar = this.e) == null)) {
                if (j5 - j2 < j2) {
                    while (j5 > j2) {
                        uVar = uVar.f3766g;
                        if (uVar != null) {
                            j5 -= (long) (uVar.f3763c - uVar.b);
                        } else {
                            h.j();
                            throw null;
                        }
                    }
                    while (j5 < j3) {
                        byte[] bArr = uVar.a;
                        int min = (int) Math.min((long) uVar.f3763c, (((long) uVar.b) + j3) - j5);
                        for (int i2 = (int) ((((long) uVar.b) + j2) - j5); i2 < min; i2++) {
                            if (bArr[i2] == b) {
                                return ((long) (i2 - uVar.b)) + j5;
                            }
                        }
                        j5 += (long) (uVar.f3763c - uVar.b);
                        uVar = uVar.f3765f;
                        if (uVar != null) {
                            j2 = j5;
                        } else {
                            h.j();
                            throw null;
                        }
                    }
                } else {
                    while (true) {
                        long j6 = ((long) (uVar.f3763c - uVar.b)) + j4;
                        if (j6 > j2) {
                            while (j4 < j3) {
                                byte[] bArr2 = uVar.a;
                                int min2 = (int) Math.min((long) uVar.f3763c, (((long) uVar.b) + j3) - j4);
                                for (int i3 = (int) ((((long) uVar.b) + j2) - j4); i3 < min2; i3++) {
                                    if (bArr2[i3] == b) {
                                        return ((long) (i3 - uVar.b)) + j4;
                                    }
                                }
                                j4 += (long) (uVar.f3763c - uVar.b);
                                uVar = uVar.f3765f;
                                if (uVar != null) {
                                    j2 = j4;
                                } else {
                                    h.j();
                                    throw null;
                                }
                            }
                        } else {
                            uVar = uVar.f3765f;
                            if (uVar != null) {
                                j4 = j6;
                            } else {
                                h.j();
                                throw null;
                            }
                        }
                    }
                }
            }
            return -1;
        }
        StringBuilder f2 = c.c.a.a.a.f("size=");
        f2.append(this.f3738f);
        f2.append(" fromIndex=");
        f2.append(j2);
        f2.append(" toIndex=");
        f2.append(j3);
        throw new IllegalArgumentException(f2.toString().toString());
    }

    public long e0(i iVar, long j2) {
        int i2;
        int i3;
        h.f(iVar, "targetBytes");
        long j3 = 0;
        if (j2 >= 0) {
            u uVar = this.e;
            if (uVar == null) {
                return -1;
            }
            long j4 = this.f3738f;
            if (j4 - j2 < j2) {
                while (j4 > j2) {
                    uVar = uVar.f3766g;
                    if (uVar != null) {
                        j4 -= (long) (uVar.f3763c - uVar.b);
                    } else {
                        h.j();
                        throw null;
                    }
                }
                if (iVar.d() == 2) {
                    byte g2 = iVar.g(0);
                    byte g3 = iVar.g(1);
                    while (j4 < this.f3738f) {
                        byte[] bArr = uVar.a;
                        i3 = (int) ((((long) uVar.b) + j2) - j4);
                        int i4 = uVar.f3763c;
                        while (i3 < i4) {
                            byte b = bArr[i3];
                            if (!(b == g2 || b == g3)) {
                                i3++;
                            }
                        }
                        j4 += (long) (uVar.f3763c - uVar.b);
                        uVar = uVar.f3765f;
                        if (uVar != null) {
                            j2 = j4;
                        } else {
                            h.j();
                            throw null;
                        }
                    }
                    return -1;
                }
                byte[] f2 = iVar.f();
                while (j4 < this.f3738f) {
                    byte[] bArr2 = uVar.a;
                    i3 = (int) ((((long) uVar.b) + j2) - j4);
                    int i5 = uVar.f3763c;
                    while (i3 < i5) {
                        byte b2 = bArr2[i3];
                        for (byte b3 : f2) {
                            if (b2 != b3) {
                            }
                        }
                        i3++;
                    }
                    j4 += (long) (uVar.f3763c - uVar.b);
                    uVar = uVar.f3765f;
                    if (uVar != null) {
                        j2 = j4;
                    } else {
                        h.j();
                        throw null;
                    }
                }
                return -1;
                return ((long) (i3 - uVar.b)) + j4;
            }
            while (true) {
                long j5 = ((long) (uVar.f3763c - uVar.b)) + j3;
                if (j5 > j2) {
                    if (iVar.d() == 2) {
                        byte g4 = iVar.g(0);
                        byte g5 = iVar.g(1);
                        while (j3 < this.f3738f) {
                            byte[] bArr3 = uVar.a;
                            i2 = (int) ((((long) uVar.b) + j2) - j3);
                            int i6 = uVar.f3763c;
                            while (i2 < i6) {
                                byte b4 = bArr3[i2];
                                if (!(b4 == g4 || b4 == g5)) {
                                    i2++;
                                }
                            }
                            j3 += (long) (uVar.f3763c - uVar.b);
                            uVar = uVar.f3765f;
                            if (uVar != null) {
                                j2 = j3;
                            } else {
                                h.j();
                                throw null;
                            }
                        }
                        return -1;
                    }
                    byte[] f3 = iVar.f();
                    while (j3 < this.f3738f) {
                        byte[] bArr4 = uVar.a;
                        i2 = (int) ((((long) uVar.b) + j2) - j3);
                        int i7 = uVar.f3763c;
                        while (i2 < i7) {
                            byte b5 = bArr4[i2];
                            for (byte b6 : f3) {
                                if (b5 != b6) {
                                }
                            }
                            i2++;
                        }
                        j3 += (long) (uVar.f3763c - uVar.b);
                        uVar = uVar.f3765f;
                        if (uVar != null) {
                            j2 = j3;
                        } else {
                            h.j();
                            throw null;
                        }
                    }
                    return -1;
                    return ((long) (i2 - uVar.b)) + j3;
                }
                uVar = uVar.f3765f;
                if (uVar != null) {
                    j3 = j5;
                } else {
                    h.j();
                    throw null;
                }
            }
        } else {
            throw new IllegalArgumentException(c.c.a.a.a.n("fromIndex < 0: ", j2).toString());
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                long j2 = this.f3738f;
                e eVar = (e) obj;
                if (j2 == eVar.f3738f) {
                    if (j2 != 0) {
                        u uVar = this.e;
                        if (uVar != null) {
                            u uVar2 = eVar.e;
                            if (uVar2 != null) {
                                int i2 = uVar.b;
                                int i3 = uVar2.b;
                                long j3 = 0;
                                while (j3 < this.f3738f) {
                                    long min = (long) Math.min(uVar.f3763c - i2, uVar2.f3763c - i3);
                                    long j4 = 0;
                                    while (j4 < min) {
                                        int i4 = i2 + 1;
                                        int i5 = i3 + 1;
                                        if (uVar.a[i2] == uVar2.a[i3]) {
                                            j4++;
                                            i2 = i4;
                                            i3 = i5;
                                        }
                                    }
                                    if (i2 == uVar.f3763c) {
                                        u uVar3 = uVar.f3765f;
                                        if (uVar3 != null) {
                                            i2 = uVar3.b;
                                            uVar = uVar3;
                                        } else {
                                            h.j();
                                            throw null;
                                        }
                                    }
                                    if (i3 == uVar2.f3763c) {
                                        uVar2 = uVar2.f3765f;
                                        if (uVar2 != null) {
                                            i3 = uVar2.b;
                                        } else {
                                            h.j();
                                            throw null;
                                        }
                                    }
                                    j3 += min;
                                }
                            } else {
                                h.j();
                                throw null;
                            }
                        } else {
                            h.j();
                            throw null;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // k.h
    public boolean f(long j2) {
        return this.f3738f >= j2;
    }

    public int f0(byte[] bArr, int i2, int i3) {
        h.f(bArr, "sink");
        h.a.t.a.i((long) bArr.length, (long) i2, (long) i3);
        u uVar = this.e;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i3, uVar.f3763c - uVar.b);
        byte[] bArr2 = uVar.a;
        int i4 = uVar.b;
        i.o.e.b(bArr2, bArr, i2, i4, i4 + min);
        int i5 = uVar.b + min;
        uVar.b = i5;
        this.f3738f -= (long) min;
        if (i5 != uVar.f3763c) {
            return min;
        }
        this.e = uVar.a();
        v.a(uVar);
        return min;
    }

    @Override // k.g, k.x, java.io.Flushable
    public void flush() {
    }

    @Override // k.x, k.z
    public a0 g() {
        return a0.a;
    }

    public i g0() {
        return t(this.f3738f);
    }

    @Override // k.g
    public /* bridge */ /* synthetic */ g h(byte[] bArr) {
        o0(bArr);
        return this;
    }

    public short h0() {
        int readShort = readShort() & 65535;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public int hashCode() {
        u uVar = this.e;
        if (uVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = uVar.f3763c;
            for (int i4 = uVar.b; i4 < i3; i4++) {
                i2 = (i2 * 31) + uVar.a[i4];
            }
            uVar = uVar.f3765f;
            if (uVar == null) {
                h.j();
                throw null;
            }
        } while (uVar != this.e);
        return i2;
    }

    @Override // k.g
    public /* bridge */ /* synthetic */ g i(byte[] bArr, int i2, int i3) {
        p0(bArr, i2, i3);
        return this;
    }

    public String i0(long j2, Charset charset) {
        h.f(charset, "charset");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (!(i2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(c.c.a.a.a.n("byteCount: ", j2).toString());
        } else if (this.f3738f < j2) {
            throw new EOFException();
        } else if (i2 == 0) {
            return "";
        } else {
            u uVar = this.e;
            if (uVar != null) {
                int i3 = uVar.b;
                if (((long) i3) + j2 > ((long) uVar.f3763c)) {
                    return new String(W(j2), charset);
                }
                int i4 = (int) j2;
                String str = new String(uVar.a, i3, i4, charset);
                int i5 = uVar.b + i4;
                uVar.b = i5;
                this.f3738f -= j2;
                if (i5 == uVar.f3763c) {
                    this.e = uVar.a();
                    v.a(uVar);
                }
                return str;
            }
            h.j();
            throw null;
        }
    }

    public boolean isOpen() {
        return true;
    }

    public String j0() {
        return i0(this.f3738f, i.x.a.a);
    }

    public String k0(long j2) {
        return i0(j2, i.x.a.a);
    }

    @Override // k.x
    public void l(e eVar, long j2) {
        u uVar;
        u uVar2;
        h.f(eVar, "source");
        if (eVar != this) {
            h.a.t.a.i(eVar.f3738f, 0, j2);
            long j3 = j2;
            while (j3 > 0) {
                u uVar3 = eVar.e;
                if (uVar3 != null) {
                    int i2 = uVar3.f3763c;
                    if (uVar3 != null) {
                        if (j3 < ((long) (i2 - uVar3.b))) {
                            u uVar4 = this.e;
                            if (uVar4 == null) {
                                uVar = null;
                            } else if (uVar4 != null) {
                                uVar = uVar4.f3766g;
                            } else {
                                h.j();
                                throw null;
                            }
                            if (uVar != null && uVar.e) {
                                if ((((long) uVar.f3763c) + j3) - ((long) (uVar.f3764d ? 0 : uVar.b)) <= ((long) 8192)) {
                                    if (uVar3 != null) {
                                        uVar3.d(uVar, (int) j3);
                                        eVar.f3738f -= j3;
                                        this.f3738f += j3;
                                        return;
                                    }
                                    h.j();
                                    throw null;
                                }
                            }
                            if (uVar3 != null) {
                                int i3 = (int) j3;
                                Objects.requireNonNull(uVar3);
                                if (i3 > 0 && i3 <= uVar3.f3763c - uVar3.b) {
                                    if (i3 >= 1024) {
                                        uVar2 = uVar3.c();
                                    } else {
                                        uVar2 = v.b();
                                        byte[] bArr = uVar3.a;
                                        byte[] bArr2 = uVar2.a;
                                        int i4 = uVar3.b;
                                        i.o.e.c(bArr, bArr2, 0, i4, i4 + i3, 2);
                                    }
                                    uVar2.f3763c = uVar2.b + i3;
                                    uVar3.b += i3;
                                    u uVar5 = uVar3.f3766g;
                                    if (uVar5 != null) {
                                        uVar5.b(uVar2);
                                        eVar.e = uVar2;
                                    } else {
                                        h.j();
                                        throw null;
                                    }
                                } else {
                                    throw new IllegalArgumentException("byteCount out of range".toString());
                                }
                            } else {
                                h.j();
                                throw null;
                            }
                        }
                        u uVar6 = eVar.e;
                        if (uVar6 != null) {
                            long j4 = (long) (uVar6.f3763c - uVar6.b);
                            eVar.e = uVar6.a();
                            u uVar7 = this.e;
                            if (uVar7 == null) {
                                this.e = uVar6;
                                uVar6.f3766g = uVar6;
                                uVar6.f3765f = uVar6;
                            } else if (uVar7 != null) {
                                u uVar8 = uVar7.f3766g;
                                if (uVar8 != null) {
                                    uVar8.b(uVar6);
                                    u uVar9 = uVar6.f3766g;
                                    if (!(uVar9 != uVar6)) {
                                        throw new IllegalStateException("cannot compact".toString());
                                    } else if (uVar9 == null) {
                                        h.j();
                                        throw null;
                                    } else if (uVar9.e) {
                                        int i5 = uVar6.f3763c - uVar6.b;
                                        if (i5 <= (8192 - uVar9.f3763c) + (uVar9.f3764d ? 0 : uVar9.b)) {
                                            uVar6.d(uVar9, i5);
                                            uVar6.a();
                                            v.a(uVar6);
                                        }
                                    }
                                } else {
                                    h.j();
                                    throw null;
                                }
                            } else {
                                h.j();
                                throw null;
                            }
                            eVar.f3738f -= j4;
                            this.f3738f += j4;
                            j3 -= j4;
                        } else {
                            h.j();
                            throw null;
                        }
                    } else {
                        h.j();
                        throw null;
                    }
                } else {
                    h.j();
                    throw null;
                }
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public final i l0(int i2) {
        if (i2 == 0) {
            return i.e;
        }
        h.a.t.a.i(this.f3738f, 0, (long) i2);
        u uVar = this.e;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            if (uVar != null) {
                int i6 = uVar.f3763c;
                int i7 = uVar.b;
                if (i6 != i7) {
                    i4 += i6 - i7;
                    i5++;
                    uVar = uVar.f3765f;
                } else {
                    throw new AssertionError("s.limit == s.pos");
                }
            } else {
                h.j();
                throw null;
            }
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[(i5 * 2)];
        u uVar2 = this.e;
        int i8 = 0;
        while (i3 < i2) {
            if (uVar2 != null) {
                bArr[i8] = uVar2.a;
                i3 += uVar2.f3763c - uVar2.b;
                iArr[i8] = Math.min(i3, i2);
                iArr[i8 + i5] = uVar2.b;
                uVar2.f3764d = true;
                i8++;
                uVar2 = uVar2.f3765f;
            } else {
                h.j();
                throw null;
            }
        }
        return new w(bArr, iArr);
    }

    @Override // k.g
    public /* bridge */ /* synthetic */ g m(i iVar) {
        n0(iVar);
        return this;
    }

    public final u m0(int i2) {
        boolean z = true;
        if (i2 < 1 || i2 > 8192) {
            z = false;
        }
        if (z) {
            u uVar = this.e;
            if (uVar == null) {
                u b = v.b();
                this.e = b;
                b.f3766g = b;
                b.f3765f = b;
                return b;
            } else if (uVar != null) {
                u uVar2 = uVar.f3766g;
                if (uVar2 == null) {
                    h.j();
                    throw null;
                } else if (uVar2.f3763c + i2 <= 8192 && uVar2.e) {
                    return uVar2;
                } else {
                    u b2 = v.b();
                    uVar2.b(b2);
                    return b2;
                }
            } else {
                h.j();
                throw null;
            }
        } else {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
    }

    public e n0(i iVar) {
        h.f(iVar, "byteString");
        iVar.l(this, 0, iVar.d());
        return this;
    }

    @Override // k.h
    public long o(i iVar) {
        h.f(iVar, "targetBytes");
        return e0(iVar, 0);
    }

    public e o0(byte[] bArr) {
        h.f(bArr, "source");
        p0(bArr, 0, bArr.length);
        return this;
    }

    public e p0(byte[] bArr, int i2, int i3) {
        h.f(bArr, "source");
        long j2 = (long) i3;
        h.a.t.a.i((long) bArr.length, (long) i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            u m0 = m0(1);
            int min = Math.min(i4 - i2, 8192 - m0.f3763c);
            int i5 = i2 + min;
            i.o.e.b(bArr, m0.a, m0.f3763c, i2, i5);
            m0.f3763c += min;
            i2 = i5;
        }
        this.f3738f += j2;
        return this;
    }

    @Override // k.h
    public e q() {
        return this;
    }

    public long q0(z zVar) {
        h.f(zVar, "source");
        long j2 = 0;
        while (true) {
            long r = zVar.r(this, (long) 8192);
            if (r == -1) {
                return j2;
            }
            j2 += r;
        }
    }

    @Override // k.z
    public long r(e eVar, long j2) {
        h.f(eVar, "sink");
        if (j2 >= 0) {
            long j3 = this.f3738f;
            if (j3 == 0) {
                return -1;
            }
            if (j2 > j3) {
                j2 = j3;
            }
            eVar.l(this, j2);
            return j2;
        }
        throw new IllegalArgumentException(c.c.a.a.a.n("byteCount < 0: ", j2).toString());
    }

    public e r0(int i2) {
        u m0 = m0(1);
        byte[] bArr = m0.a;
        int i3 = m0.f3763c;
        m0.f3763c = i3 + 1;
        bArr[i3] = (byte) i2;
        this.f3738f++;
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        h.f(byteBuffer, "sink");
        u uVar = this.e;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), uVar.f3763c - uVar.b);
        byteBuffer.put(uVar.a, uVar.b, min);
        int i2 = uVar.b + min;
        uVar.b = i2;
        this.f3738f -= (long) min;
        if (i2 == uVar.f3763c) {
            this.e = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    @Override // k.h
    public byte readByte() {
        long j2 = this.f3738f;
        if (j2 != 0) {
            u uVar = this.e;
            if (uVar != null) {
                int i2 = uVar.b;
                int i3 = uVar.f3763c;
                int i4 = i2 + 1;
                byte b = uVar.a[i2];
                this.f3738f = j2 - 1;
                if (i4 == i3) {
                    this.e = uVar.a();
                    v.a(uVar);
                } else {
                    uVar.b = i4;
                }
                return b;
            }
            h.j();
            throw null;
        }
        throw new EOFException();
    }

    @Override // k.h
    public int readInt() {
        long j2 = this.f3738f;
        if (j2 >= 4) {
            u uVar = this.e;
            if (uVar != null) {
                int i2 = uVar.b;
                int i3 = uVar.f3763c;
                if (((long) (i3 - i2)) < 4) {
                    return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
                }
                byte[] bArr = uVar.a;
                int i4 = i2 + 1;
                int i5 = i4 + 1;
                int i6 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
                int i7 = i5 + 1;
                int i8 = i6 | ((bArr[i5] & 255) << 8);
                int i9 = i7 + 1;
                int i10 = i8 | (bArr[i7] & 255);
                this.f3738f = j2 - 4;
                if (i9 == i3) {
                    this.e = uVar.a();
                    v.a(uVar);
                } else {
                    uVar.b = i9;
                }
                return i10;
            }
            h.j();
            throw null;
        }
        throw new EOFException();
    }

    @Override // k.h
    public short readShort() {
        long j2 = this.f3738f;
        if (j2 >= 2) {
            u uVar = this.e;
            if (uVar != null) {
                int i2 = uVar.b;
                int i3 = uVar.f3763c;
                if (i3 - i2 < 2) {
                    return (short) (((readByte() & 255) << 8) | (readByte() & 255));
                }
                byte[] bArr = uVar.a;
                int i4 = i2 + 1;
                int i5 = i4 + 1;
                int i6 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
                this.f3738f = j2 - 2;
                if (i5 == i3) {
                    this.e = uVar.a();
                    v.a(uVar);
                } else {
                    uVar.b = i5;
                }
                return (short) i6;
            }
            h.j();
            throw null;
        }
        throw new EOFException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ef A[LOOP:0: B:67:0x00eb->B:69:0x00ef, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ff  */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k.e O(long r13) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.O(long):k.e");
    }

    @Override // k.h
    public i t(long j2) {
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(c.c.a.a.a.n("byteCount: ", j2).toString());
        } else if (this.f3738f < j2) {
            throw new EOFException();
        } else if (j2 < ((long) 4096)) {
            return new i(W(j2));
        } else {
            i l0 = l0((int) j2);
            a(j2);
            return l0;
        }
    }

    /* renamed from: t0 */
    public e p(long j2) {
        if (j2 == 0) {
            r0(48);
        } else {
            long j3 = (j2 >>> 1) | j2;
            long j4 = j3 | (j3 >>> 2);
            long j5 = j4 | (j4 >>> 4);
            long j6 = j5 | (j5 >>> 8);
            long j7 = j6 | (j6 >>> 16);
            long j8 = j7 | (j7 >>> 32);
            long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
            long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
            long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
            long j12 = j11 + (j11 >>> 8);
            long j13 = j12 + (j12 >>> 16);
            int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            u m0 = m0(i2);
            byte[] bArr = m0.a;
            int i3 = m0.f3763c;
            for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
                bArr[i4] = k.b0.a.a[(int) (15 & j2)];
                j2 >>>= 4;
            }
            m0.f3763c += i2;
            this.f3738f += (long) i2;
        }
        return this;
    }

    public String toString() {
        long j2 = this.f3738f;
        if (j2 <= ((long) Integer.MAX_VALUE)) {
            return l0((int) j2).toString();
        }
        StringBuilder f2 = c.c.a.a.a.f("size > Int.MAX_VALUE: ");
        f2.append(this.f3738f);
        throw new IllegalStateException(f2.toString().toString());
    }

    public e u0(int i2) {
        u m0 = m0(4);
        byte[] bArr = m0.a;
        int i3 = m0.f3763c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        m0.f3763c = i6 + 1;
        this.f3738f += 4;
        return this;
    }

    public e v0(int i2) {
        u m0 = m0(2);
        byte[] bArr = m0.a;
        int i3 = m0.f3763c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        m0.f3763c = i4 + 1;
        this.f3738f += 2;
        return this;
    }

    @Override // k.h
    public String w(long j2) {
        if (j2 >= 0) {
            long j3 = Long.MAX_VALUE;
            if (j2 != Long.MAX_VALUE) {
                j3 = j2 + 1;
            }
            byte b = (byte) 10;
            long d0 = d0(b, 0, j3);
            if (d0 != -1) {
                return k.b0.a.a(this, d0);
            }
            if (j3 < this.f3738f && b0(j3 - 1) == ((byte) 13) && b0(j3) == b) {
                return k.b0.a.a(this, j3);
            }
            e eVar = new e();
            V(eVar, 0, Math.min((long) 32, this.f3738f));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f3738f, j2) + " content=" + eVar.g0().e() + (char) 8230);
        }
        throw new IllegalArgumentException(c.c.a.a.a.n("limit < 0: ", j2).toString());
    }

    public e w0(String str) {
        h.f(str, "string");
        x0(str, 0, str.length());
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        h.f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            u m0 = m0(1);
            int min = Math.min(i2, 8192 - m0.f3763c);
            byteBuffer.get(m0.a, m0.f3763c, min);
            i2 -= min;
            m0.f3763c += min;
        }
        this.f3738f += (long) remaining;
        return remaining;
    }

    public e x0(String str, int i2, int i3) {
        long j2;
        long j3;
        char charAt;
        h.f(str, "string");
        if (i2 >= 0) {
            if (i3 >= i2) {
                if (i3 <= str.length()) {
                    while (i2 < i3) {
                        char charAt2 = str.charAt(i2);
                        if (charAt2 < 128) {
                            u m0 = m0(1);
                            byte[] bArr = m0.a;
                            int i4 = m0.f3763c - i2;
                            int min = Math.min(i3, 8192 - i4);
                            int i5 = i2 + 1;
                            bArr[i2 + i4] = (byte) charAt2;
                            while (true) {
                                i2 = i5;
                                if (i2 >= min || (charAt = str.charAt(i2)) >= 128) {
                                    int i6 = m0.f3763c;
                                    int i7 = (i4 + i2) - i6;
                                    m0.f3763c = i6 + i7;
                                    this.f3738f += (long) i7;
                                } else {
                                    i5 = i2 + 1;
                                    bArr[i2 + i4] = (byte) charAt;
                                }
                            }
                            int i62 = m0.f3763c;
                            int i72 = (i4 + i2) - i62;
                            m0.f3763c = i62 + i72;
                            this.f3738f += (long) i72;
                        } else {
                            if (charAt2 < 2048) {
                                u m02 = m0(2);
                                byte[] bArr2 = m02.a;
                                int i8 = m02.f3763c;
                                bArr2[i8] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i8 + 1] = (byte) ((charAt2 & '?') | 128);
                                m02.f3763c = i8 + 2;
                                j2 = this.f3738f;
                                j3 = 2;
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                u m03 = m0(3);
                                byte[] bArr3 = m03.a;
                                int i9 = m03.f3763c;
                                bArr3[i9] = (byte) ((charAt2 >> '\f') | 224);
                                bArr3[i9 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr3[i9 + 2] = (byte) ((charAt2 & '?') | 128);
                                m03.f3763c = i9 + 3;
                                j2 = this.f3738f;
                                j3 = 3;
                            } else {
                                int i10 = i2 + 1;
                                char charAt3 = i10 < i3 ? str.charAt(i10) : 0;
                                if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    r0(63);
                                    i2 = i10;
                                } else {
                                    int i11 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                                    u m04 = m0(4);
                                    byte[] bArr4 = m04.a;
                                    int i12 = m04.f3763c;
                                    bArr4[i12] = (byte) ((i11 >> 18) | 240);
                                    bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                                    bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                                    bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                                    m04.f3763c = i12 + 4;
                                    this.f3738f += 4;
                                    i2 += 2;
                                }
                            }
                            this.f3738f = j2 + j3;
                            i2++;
                        }
                    }
                    return this;
                }
                StringBuilder g2 = c.c.a.a.a.g("endIndex > string.length: ", i3, " > ");
                g2.append(str.length());
                throw new IllegalArgumentException(g2.toString().toString());
            }
            throw new IllegalArgumentException(c.c.a.a.a.m("endIndex < beginIndex: ", i3, " < ", i2).toString());
        }
        throw new IllegalArgumentException(c.c.a.a.a.l("beginIndex < 0: ", i2).toString());
    }

    public e y0(int i2) {
        long j2;
        long j3;
        String str;
        if (i2 < 128) {
            r0(i2);
        } else {
            if (i2 < 2048) {
                u m0 = m0(2);
                byte[] bArr = m0.a;
                int i3 = m0.f3763c;
                bArr[i3] = (byte) ((i2 >> 6) | 192);
                bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
                m0.f3763c = i3 + 2;
                j3 = this.f3738f;
                j2 = 2;
            } else if (55296 <= i2 && 57343 >= i2) {
                r0(63);
            } else if (i2 < 65536) {
                u m02 = m0(3);
                byte[] bArr2 = m02.a;
                int i4 = m02.f3763c;
                bArr2[i4] = (byte) ((i2 >> 12) | 224);
                bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | 128);
                bArr2[i4 + 2] = (byte) ((i2 & 63) | 128);
                m02.f3763c = i4 + 3;
                j3 = this.f3738f;
                j2 = 3;
            } else if (i2 <= 1114111) {
                u m03 = m0(4);
                byte[] bArr3 = m03.a;
                int i5 = m03.f3763c;
                bArr3[i5] = (byte) ((i2 >> 18) | 240);
                bArr3[i5 + 1] = (byte) (((i2 >> 12) & 63) | 128);
                bArr3[i5 + 2] = (byte) (((i2 >> 6) & 63) | 128);
                bArr3[i5 + 3] = (byte) ((i2 & 63) | 128);
                m03.f3763c = i5 + 4;
                j3 = this.f3738f;
                j2 = 4;
            } else {
                StringBuilder f2 = c.c.a.a.a.f("Unexpected code point: 0x");
                if (i2 != 0) {
                    char[] cArr = b.a;
                    int i6 = 0;
                    char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
                    while (i6 < 8 && cArr2[i6] == '0') {
                        i6++;
                    }
                    str = new String(cArr2, i6, 8 - i6);
                } else {
                    str = "0";
                }
                f2.append(str);
                throw new IllegalArgumentException(f2.toString());
            }
            this.f3738f = j3 + j2;
        }
        return this;
    }

    @Override // k.h
    public long z(x xVar) {
        h.f(xVar, "sink");
        long j2 = this.f3738f;
        if (j2 > 0) {
            ((e) xVar).l(this, j2);
        }
        return j2;
    }
}
