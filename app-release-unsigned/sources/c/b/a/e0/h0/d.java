package c.b.a.e0.h0;

import c.b.a.e0.h0.c;
import c.c.a.a.a;
import java.io.EOFException;
import java.util.Objects;
import k.e;
import k.h;
import k.i;

public final class d extends c {

    /* renamed from: j  reason: collision with root package name */
    public static final i f643j = i.c("'\\");

    /* renamed from: k  reason: collision with root package name */
    public static final i f644k = i.c("\"\\");

    /* renamed from: l  reason: collision with root package name */
    public static final i f645l = i.c("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: m  reason: collision with root package name */
    public static final i f646m = i.c("\n\r");
    public static final i n = i.c("*/");
    public final h o;
    public final e p;
    public int q = 0;
    public long r;
    public int s;
    public String t;

    public d(h hVar) {
        Objects.requireNonNull(hVar, "source == null");
        this.o = hVar;
        this.p = hVar.q();
        g0(6);
    }

    @Override // c.b.a.e0.h0.c
    public boolean K() {
        int i2 = this.q;
        if (i2 == 0) {
            i2 = m0();
        }
        return (i2 == 2 || i2 == 4 || i2 == 18) ? false : true;
    }

    @Override // c.b.a.e0.h0.c
    public boolean Q() {
        int i2 = this.q;
        if (i2 == 0) {
            i2 = m0();
        }
        if (i2 == 5) {
            this.q = 0;
            int[] iArr = this.f634i;
            int i3 = this.f631f - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.q = 0;
            int[] iArr2 = this.f634i;
            int i4 = this.f631f - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            StringBuilder f2 = a.f("Expected a boolean but was ");
            f2.append(f0());
            f2.append(" at path ");
            f2.append(u());
            throw new a(f2.toString());
        }
    }

    @Override // c.b.a.e0.h0.c
    public double V() {
        double parseDouble;
        String str;
        i iVar;
        int i2 = this.q;
        if (i2 == 0) {
            i2 = m0();
        }
        if (i2 == 16) {
            this.q = 0;
            int[] iArr = this.f634i;
            int i3 = this.f631f - 1;
            iArr[i3] = iArr[i3] + 1;
            return (double) this.r;
        }
        if (i2 == 17) {
            str = this.p.k0((long) this.s);
        } else {
            if (i2 == 9) {
                iVar = f644k;
            } else if (i2 == 8) {
                iVar = f643j;
            } else if (i2 == 10) {
                str = r0();
            } else {
                if (i2 != 11) {
                    StringBuilder f2 = a.f("Expected a double but was ");
                    f2.append(f0());
                    f2.append(" at path ");
                    f2.append(u());
                    throw new a(f2.toString());
                }
                this.q = 11;
                parseDouble = Double.parseDouble(this.t);
                if (!Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                    throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + u());
                }
                this.t = null;
                this.q = 0;
                int[] iArr2 = this.f634i;
                int i4 = this.f631f - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseDouble;
            }
            str = q0(iVar);
        }
        this.t = str;
        this.q = 11;
        try {
            parseDouble = Double.parseDouble(this.t);
            if (!Double.isNaN(parseDouble)) {
            }
            throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + u());
        } catch (NumberFormatException unused) {
            StringBuilder f3 = a.f("Expected a double but was ");
            f3.append(this.t);
            f3.append(" at path ");
            f3.append(u());
            throw new a(f3.toString());
        }
    }

    @Override // c.b.a.e0.h0.c
    public void b() {
        int i2 = this.q;
        if (i2 == 0) {
            i2 = m0();
        }
        if (i2 == 3) {
            g0(1);
            this.f634i[this.f631f - 1] = 0;
            this.q = 0;
            return;
        }
        StringBuilder f2 = a.f("Expected BEGIN_ARRAY but was ");
        f2.append(f0());
        f2.append(" at path ");
        f2.append(u());
        throw new a(f2.toString());
    }

    @Override // c.b.a.e0.h0.c
    public int b0() {
        int i2 = this.q;
        if (i2 == 0) {
            i2 = m0();
        }
        if (i2 == 16) {
            long j2 = this.r;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.q = 0;
                int[] iArr = this.f634i;
                int i4 = this.f631f - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            StringBuilder f2 = a.f("Expected an int but was ");
            f2.append(this.r);
            f2.append(" at path ");
            f2.append(u());
            throw new a(f2.toString());
        }
        if (i2 == 17) {
            this.t = this.p.k0((long) this.s);
        } else if (i2 == 9 || i2 == 8) {
            String q0 = q0(i2 == 9 ? f644k : f643j);
            this.t = q0;
            try {
                int parseInt = Integer.parseInt(q0);
                this.q = 0;
                int[] iArr2 = this.f634i;
                int i5 = this.f631f - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i2 != 11) {
            StringBuilder f3 = a.f("Expected an int but was ");
            f3.append(f0());
            f3.append(" at path ");
            f3.append(u());
            throw new a(f3.toString());
        }
        this.q = 11;
        try {
            double parseDouble = Double.parseDouble(this.t);
            int i6 = (int) parseDouble;
            if (((double) i6) == parseDouble) {
                this.t = null;
                this.q = 0;
                int[] iArr3 = this.f634i;
                int i7 = this.f631f - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            StringBuilder f4 = a.f("Expected an int but was ");
            f4.append(this.t);
            f4.append(" at path ");
            f4.append(u());
            throw new a(f4.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder f5 = a.f("Expected an int but was ");
            f5.append(this.t);
            f5.append(" at path ");
            f5.append(u());
            throw new a(f5.toString());
        }
    }

    @Override // c.b.a.e0.h0.c
    public void c() {
        int i2 = this.q;
        if (i2 == 0) {
            i2 = m0();
        }
        if (i2 == 1) {
            g0(3);
            this.q = 0;
            return;
        }
        StringBuilder f2 = a.f("Expected BEGIN_OBJECT but was ");
        f2.append(f0());
        f2.append(" at path ");
        f2.append(u());
        throw new a(f2.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.q = 0;
        this.f632g[0] = 8;
        this.f631f = 1;
        e eVar = this.p;
        eVar.a(eVar.f3738f);
        this.o.close();
    }

    @Override // c.b.a.e0.h0.c
    public String d0() {
        String str;
        i iVar;
        int i2 = this.q;
        if (i2 == 0) {
            i2 = m0();
        }
        if (i2 == 14) {
            str = r0();
        } else {
            if (i2 == 13) {
                iVar = f644k;
            } else if (i2 == 12) {
                iVar = f643j;
            } else if (i2 == 15) {
                str = this.t;
            } else {
                StringBuilder f2 = a.f("Expected a name but was ");
                f2.append(f0());
                f2.append(" at path ");
                f2.append(u());
                throw new a(f2.toString());
            }
            str = q0(iVar);
        }
        this.q = 0;
        this.f633h[this.f631f - 1] = str;
        return str;
    }

    @Override // c.b.a.e0.h0.c
    public void e() {
        int i2 = this.q;
        if (i2 == 0) {
            i2 = m0();
        }
        if (i2 == 4) {
            int i3 = this.f631f - 1;
            this.f631f = i3;
            int[] iArr = this.f634i;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.q = 0;
            return;
        }
        StringBuilder f2 = a.f("Expected END_ARRAY but was ");
        f2.append(f0());
        f2.append(" at path ");
        f2.append(u());
        throw new a(f2.toString());
    }

    @Override // c.b.a.e0.h0.c
    public String e0() {
        String str;
        i iVar;
        int i2 = this.q;
        if (i2 == 0) {
            i2 = m0();
        }
        if (i2 == 10) {
            str = r0();
        } else {
            if (i2 == 9) {
                iVar = f644k;
            } else if (i2 == 8) {
                iVar = f643j;
            } else if (i2 == 11) {
                str = this.t;
                this.t = null;
            } else if (i2 == 16) {
                str = Long.toString(this.r);
            } else if (i2 == 17) {
                str = this.p.k0((long) this.s);
            } else {
                StringBuilder f2 = a.f("Expected a string but was ");
                f2.append(f0());
                f2.append(" at path ");
                f2.append(u());
                throw new a(f2.toString());
            }
            str = q0(iVar);
        }
        this.q = 0;
        int[] iArr = this.f634i;
        int i3 = this.f631f - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    @Override // c.b.a.e0.h0.c
    public c.b f0() {
        int i2 = this.q;
        if (i2 == 0) {
            i2 = m0();
        }
        switch (i2) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // c.b.a.e0.h0.c
    public int h0(c.a aVar) {
        int i2 = this.q;
        if (i2 == 0) {
            i2 = m0();
        }
        if (i2 < 12 || i2 > 15) {
            return -1;
        }
        if (i2 == 15) {
            return n0(this.t, aVar);
        }
        int c0 = this.o.c0(aVar.b);
        if (c0 != -1) {
            this.q = 0;
            this.f633h[this.f631f - 1] = aVar.a[c0];
            return c0;
        }
        String str = this.f633h[this.f631f - 1];
        String d0 = d0();
        int n0 = n0(d0, aVar);
        if (n0 == -1) {
            this.q = 15;
            this.t = d0;
            this.f633h[this.f631f - 1] = str;
        }
        return n0;
    }

    @Override // c.b.a.e0.h0.c
    public void i0() {
        i iVar;
        int i2 = this.q;
        if (i2 == 0) {
            i2 = m0();
        }
        if (i2 == 14) {
            u0();
        } else {
            if (i2 == 13) {
                iVar = f644k;
            } else if (i2 == 12) {
                iVar = f643j;
            } else if (i2 != 15) {
                StringBuilder f2 = a.f("Expected a name but was ");
                f2.append(f0());
                f2.append(" at path ");
                f2.append(u());
                throw new a(f2.toString());
            }
            t0(iVar);
        }
        this.q = 0;
        this.f633h[this.f631f - 1] = "null";
    }

    @Override // c.b.a.e0.h0.c
    public void j0() {
        i iVar;
        int i2 = 0;
        do {
            int i3 = this.q;
            if (i3 == 0) {
                i3 = m0();
            }
            if (i3 == 3) {
                g0(1);
            } else if (i3 == 1) {
                g0(3);
            } else {
                if (i3 == 4) {
                    i2--;
                    if (i2 < 0) {
                        StringBuilder f2 = a.f("Expected a value but was ");
                        f2.append(f0());
                        f2.append(" at path ");
                        f2.append(u());
                        throw new a(f2.toString());
                    }
                } else if (i3 == 2) {
                    i2--;
                    if (i2 < 0) {
                        StringBuilder f3 = a.f("Expected a value but was ");
                        f3.append(f0());
                        f3.append(" at path ");
                        f3.append(u());
                        throw new a(f3.toString());
                    }
                } else if (i3 == 14 || i3 == 10) {
                    u0();
                    this.q = 0;
                } else {
                    if (i3 == 9 || i3 == 13) {
                        iVar = f644k;
                    } else if (i3 == 8 || i3 == 12) {
                        iVar = f643j;
                    } else {
                        if (i3 == 17) {
                            this.p.a((long) this.s);
                        } else if (i3 == 18) {
                            StringBuilder f4 = a.f("Expected a value but was ");
                            f4.append(f0());
                            f4.append(" at path ");
                            f4.append(u());
                            throw new a(f4.toString());
                        }
                        this.q = 0;
                    }
                    t0(iVar);
                    this.q = 0;
                }
                this.f631f--;
                this.q = 0;
            }
            i2++;
            this.q = 0;
        } while (i2 != 0);
        int[] iArr = this.f634i;
        int i4 = this.f631f;
        int i5 = i4 - 1;
        iArr[i5] = iArr[i5] + 1;
        this.f633h[i4 - 1] = "null";
    }

    public final void l0() {
        k0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01ab, code lost:
        if (o0(r2) != false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01ad, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01ae, code lost:
        if (r5 != r2) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01b0, code lost:
        if (r6 == false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01b6, code lost:
        if (r7 != Long.MIN_VALUE) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01b8, code lost:
        if (r9 == false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01be, code lost:
        if (r7 != 0) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01c0, code lost:
        if (r9 != false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01c2, code lost:
        if (r9 == false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01c5, code lost:
        r7 = -r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01c6, code lost:
        r17.r = r7;
        r17.p.a((long) r1);
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01d1, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01d2, code lost:
        if (r5 == r2) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01d4, code lost:
        if (r5 == 4) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01d7, code lost:
        if (r5 != 7) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01d9, code lost:
        r17.s = r1;
        r1 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01dd, code lost:
        r14 = r1;
        r17.q = r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0124 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m0() {
        /*
        // Method dump skipped, instructions count: 699
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.a.e0.h0.d.m0():int");
    }

    @Override // c.b.a.e0.h0.c
    public void n() {
        int i2 = this.q;
        if (i2 == 0) {
            i2 = m0();
        }
        if (i2 == 2) {
            int i3 = this.f631f - 1;
            this.f631f = i3;
            this.f633h[i3] = null;
            int[] iArr = this.f634i;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.q = 0;
            return;
        }
        StringBuilder f2 = a.f("Expected END_OBJECT but was ");
        f2.append(f0());
        f2.append(" at path ");
        f2.append(u());
        throw new a(f2.toString());
    }

    public final int n0(String str, c.a aVar) {
        int length = aVar.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(aVar.a[i2])) {
                this.q = 0;
                this.f633h[this.f631f - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    public final boolean o0(int i2) {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (!(i2 == 47 || i2 == 61)) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        l0();
        throw null;
    }

    public final int p0(boolean z) {
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (this.o.f((long) i3)) {
                byte b0 = this.p.b0((long) i2);
                if (b0 == 10 || b0 == 32 || b0 == 13 || b0 == 9) {
                    i2 = i3;
                } else {
                    this.p.a((long) (i3 - 1));
                    if (b0 == 47) {
                        if (!this.o.f(2)) {
                            return b0;
                        }
                        l0();
                        throw null;
                    } else if (b0 != 35) {
                        return b0;
                    } else {
                        l0();
                        throw null;
                    }
                }
            } else if (!z) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public final String q0(i iVar) {
        StringBuilder sb = null;
        while (true) {
            long o2 = this.o.o(iVar);
            if (o2 == -1) {
                k0("Unterminated string");
                throw null;
            } else if (this.p.b0(o2) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.p.k0(o2));
                this.p.readByte();
                sb.append(s0());
            } else {
                String k0 = this.p.k0(o2);
                if (sb == null) {
                    this.p.readByte();
                    return k0;
                }
                sb.append(k0);
                this.p.readByte();
                return sb.toString();
            }
        }
    }

    public final String r0() {
        long o2 = this.o.o(f645l);
        return o2 != -1 ? this.p.k0(o2) : this.p.j0();
    }

    public final char s0() {
        int i2;
        int i3;
        if (this.o.f(1)) {
            byte readByte = this.p.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return '\b';
            }
            if (readByte == 102) {
                return '\f';
            }
            if (readByte == 110) {
                return '\n';
            }
            if (readByte == 114) {
                return '\r';
            }
            if (readByte == 116) {
                return '\t';
            }
            if (readByte != 117) {
                StringBuilder f2 = a.f("Invalid escape sequence: \\");
                f2.append((char) readByte);
                k0(f2.toString());
                throw null;
            } else if (this.o.f(4)) {
                char c2 = 0;
                for (int i4 = 0; i4 < 4; i4++) {
                    byte b0 = this.p.b0((long) i4);
                    char c3 = (char) (c2 << 4);
                    if (b0 < 48 || b0 > 57) {
                        if (b0 >= 97 && b0 <= 102) {
                            i3 = b0 - 97;
                        } else if (b0 < 65 || b0 > 70) {
                            StringBuilder f3 = a.f("\\u");
                            f3.append(this.p.k0(4));
                            k0(f3.toString());
                            throw null;
                        } else {
                            i3 = b0 - 65;
                        }
                        i2 = i3 + 10;
                    } else {
                        i2 = b0 - 48;
                    }
                    c2 = (char) (i2 + c3);
                }
                this.p.a(4);
                return c2;
            } else {
                StringBuilder f4 = a.f("Unterminated escape sequence at path ");
                f4.append(u());
                throw new EOFException(f4.toString());
            }
        } else {
            k0("Unterminated escape sequence");
            throw null;
        }
    }

    public final void t0(i iVar) {
        while (true) {
            long o2 = this.o.o(iVar);
            if (o2 == -1) {
                k0("Unterminated string");
                throw null;
            } else if (this.p.b0(o2) == 92) {
                this.p.a(o2 + 1);
                s0();
            } else {
                this.p.a(o2 + 1);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder f2 = a.f("JsonReader(");
        f2.append(this.o);
        f2.append(")");
        return f2.toString();
    }

    public final void u0() {
        long o2 = this.o.o(f645l);
        e eVar = this.p;
        if (o2 == -1) {
            o2 = eVar.f3738f;
        }
        eVar.a(o2);
    }
}
