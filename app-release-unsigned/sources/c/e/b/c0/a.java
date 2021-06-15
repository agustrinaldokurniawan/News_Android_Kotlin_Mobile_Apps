package c.e.b.c0;

import c.e.b.a0.q;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

public class a implements Closeable {
    public final Reader e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1513f = false;

    /* renamed from: g  reason: collision with root package name */
    public final char[] f1514g = new char[1024];

    /* renamed from: h  reason: collision with root package name */
    public int f1515h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f1516i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f1517j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1518k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f1519l = 0;

    /* renamed from: m  reason: collision with root package name */
    public long f1520m;
    public int n;
    public String o;
    public int[] p;
    public int q;
    public String[] r;
    public int[] s;

    /* renamed from: c.e.b.c0.a$a  reason: collision with other inner class name */
    public class C0050a extends q {
    }

    static {
        q.a = new C0050a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.p = iArr;
        this.q = 0;
        this.q = 0 + 1;
        iArr[0] = 6;
        this.r = new String[32];
        this.s = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.e = reader;
    }

    public void K() {
        int i2 = this.f1519l;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 2) {
            int i3 = this.q - 1;
            this.q = i3;
            this.r[i3] = null;
            int[] iArr = this.s;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f1519l = 0;
            return;
        }
        StringBuilder f2 = c.c.a.a.a.f("Expected END_OBJECT but was ");
        f2.append(p0());
        f2.append(e0());
        throw new IllegalStateException(f2.toString());
    }

    public final boolean Q(int i2) {
        int i3;
        int i4;
        char[] cArr = this.f1514g;
        int i5 = this.f1518k;
        int i6 = this.f1515h;
        this.f1518k = i5 - i6;
        int i7 = this.f1516i;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f1516i = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f1516i = 0;
        }
        this.f1515h = 0;
        do {
            Reader reader = this.e;
            int i9 = this.f1516i;
            int read = reader.read(cArr, i9, cArr.length - i9);
            if (read == -1) {
                return false;
            }
            i3 = this.f1516i + read;
            this.f1516i = i3;
            if (this.f1517j == 0 && (i4 = this.f1518k) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f1515h++;
                this.f1518k = i4 + 1;
                i2++;
                continue;
            }
        } while (i3 < i2);
        return true;
    }

    public String V() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.q;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.p[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.s[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.r;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    public void b() {
        int i2 = this.f1519l;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 3) {
            q0(1);
            this.s[this.q - 1] = 0;
            this.f1519l = 0;
            return;
        }
        StringBuilder f2 = c.c.a.a.a.f("Expected BEGIN_ARRAY but was ");
        f2.append(p0());
        f2.append(e0());
        throw new IllegalStateException(f2.toString());
    }

    public boolean b0() {
        int i2 = this.f1519l;
        if (i2 == 0) {
            i2 = n();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public void c() {
        int i2 = this.f1519l;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 1) {
            q0(3);
            this.f1519l = 0;
            return;
        }
        StringBuilder f2 = c.c.a.a.a.f("Expected BEGIN_OBJECT but was ");
        f2.append(p0());
        f2.append(e0());
        throw new IllegalStateException(f2.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1519l = 0;
        this.p[0] = 8;
        this.q = 1;
        this.e.close();
    }

    public final boolean d0(char c2) {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (!(c2 == '/' || c2 == '=')) {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e();
        return false;
    }

    public final void e() {
        if (!this.f1513f) {
            v0("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    public String e0() {
        return " at line " + (this.f1517j + 1) + " column " + ((this.f1515h - this.f1518k) + 1) + " path " + V();
    }

    public boolean f0() {
        int i2 = this.f1519l;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 5) {
            this.f1519l = 0;
            int[] iArr = this.s;
            int i3 = this.q - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.f1519l = 0;
            int[] iArr2 = this.s;
            int i4 = this.q - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            StringBuilder f2 = c.c.a.a.a.f("Expected a boolean but was ");
            f2.append(p0());
            f2.append(e0());
            throw new IllegalStateException(f2.toString());
        }
    }

    public double g0() {
        String str;
        int i2 = this.f1519l;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 15) {
            this.f1519l = 0;
            int[] iArr = this.s;
            int i3 = this.q - 1;
            iArr[i3] = iArr[i3] + 1;
            return (double) this.f1520m;
        }
        if (i2 == 16) {
            this.o = new String(this.f1514g, this.f1515h, this.n);
            this.f1515h += this.n;
        } else {
            if (i2 == 8 || i2 == 9) {
                str = m0(i2 == 8 ? '\'' : '\"');
            } else if (i2 == 10) {
                str = o0();
            } else if (i2 != 11) {
                StringBuilder f2 = c.c.a.a.a.f("Expected a double but was ");
                f2.append(p0());
                f2.append(e0());
                throw new IllegalStateException(f2.toString());
            }
            this.o = str;
        }
        this.f1519l = 11;
        double parseDouble = Double.parseDouble(this.o);
        if (this.f1513f || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.o = null;
            this.f1519l = 0;
            int[] iArr2 = this.s;
            int i4 = this.q - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        }
        throw new d("JSON forbids NaN and infinities: " + parseDouble + e0());
    }

    public int h0() {
        String str;
        int i2 = this.f1519l;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 15) {
            long j2 = this.f1520m;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.f1519l = 0;
                int[] iArr = this.s;
                int i4 = this.q - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            StringBuilder f2 = c.c.a.a.a.f("Expected an int but was ");
            f2.append(this.f1520m);
            f2.append(e0());
            throw new NumberFormatException(f2.toString());
        }
        if (i2 == 16) {
            this.o = new String(this.f1514g, this.f1515h, this.n);
            this.f1515h += this.n;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                str = o0();
            } else {
                str = m0(i2 == 8 ? '\'' : '\"');
            }
            this.o = str;
            try {
                int parseInt = Integer.parseInt(this.o);
                this.f1519l = 0;
                int[] iArr2 = this.s;
                int i5 = this.q - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder f3 = c.c.a.a.a.f("Expected an int but was ");
            f3.append(p0());
            f3.append(e0());
            throw new IllegalStateException(f3.toString());
        }
        this.f1519l = 11;
        double parseDouble = Double.parseDouble(this.o);
        int i6 = (int) parseDouble;
        if (((double) i6) == parseDouble) {
            this.o = null;
            this.f1519l = 0;
            int[] iArr3 = this.s;
            int i7 = this.q - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        StringBuilder f4 = c.c.a.a.a.f("Expected an int but was ");
        f4.append(this.o);
        f4.append(e0());
        throw new NumberFormatException(f4.toString());
    }

    public long i0() {
        String str;
        int i2 = this.f1519l;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 15) {
            this.f1519l = 0;
            int[] iArr = this.s;
            int i3 = this.q - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f1520m;
        }
        if (i2 == 16) {
            this.o = new String(this.f1514g, this.f1515h, this.n);
            this.f1515h += this.n;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                str = o0();
            } else {
                str = m0(i2 == 8 ? '\'' : '\"');
            }
            this.o = str;
            try {
                long parseLong = Long.parseLong(this.o);
                this.f1519l = 0;
                int[] iArr2 = this.s;
                int i4 = this.q - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder f2 = c.c.a.a.a.f("Expected a long but was ");
            f2.append(p0());
            f2.append(e0());
            throw new IllegalStateException(f2.toString());
        }
        this.f1519l = 11;
        double parseDouble = Double.parseDouble(this.o);
        long j2 = (long) parseDouble;
        if (((double) j2) == parseDouble) {
            this.o = null;
            this.f1519l = 0;
            int[] iArr3 = this.s;
            int i5 = this.q - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return j2;
        }
        StringBuilder f3 = c.c.a.a.a.f("Expected a long but was ");
        f3.append(this.o);
        f3.append(e0());
        throw new NumberFormatException(f3.toString());
    }

    public String j0() {
        String str;
        char c2;
        int i2 = this.f1519l;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 14) {
            str = o0();
        } else {
            if (i2 == 12) {
                c2 = '\'';
            } else if (i2 == 13) {
                c2 = '\"';
            } else {
                StringBuilder f2 = c.c.a.a.a.f("Expected a name but was ");
                f2.append(p0());
                f2.append(e0());
                throw new IllegalStateException(f2.toString());
            }
            str = m0(c2);
        }
        this.f1519l = 0;
        this.r[this.q - 1] = str;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r1 != '/') goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r9.f1515h = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r4 != r2) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r9.f1515h = r4 - 1;
        r2 = Q(2);
        r9.f1515h++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r2 != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        e();
        r2 = r9.f1515h;
        r4 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r4 == '*') goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r4 == '/') goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        r9.f1515h = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        r9.f1515h = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if ((r9.f1515h + 2) <= r9.f1516i) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (Q(2) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        r1 = r9.f1514g;
        r2 = r9.f1515h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0096, code lost:
        if (r1[r2] != '\n') goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        r9.f1517j++;
        r9.f1518k = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (r4 >= 2) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
        if (r9.f1514g[r9.f1515h + r4] == "*\/".charAt(r4)) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        r9.f1515h++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bc, code lost:
        if (r3 == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        v0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c9, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        r9.f1515h = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ce, code lost:
        if (r1 != '#') goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d0, code lost:
        e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d8, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int k0(boolean r10) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.b.c0.a.k0(boolean):int");
    }

    public void l0() {
        int i2 = this.f1519l;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 7) {
            this.f1519l = 0;
            int[] iArr = this.s;
            int i3 = this.q - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        StringBuilder f2 = c.c.a.a.a.f("Expected null but was ");
        f2.append(p0());
        f2.append(e0());
        throw new IllegalStateException(f2.toString());
    }

    public final String m0(char c2) {
        char[] cArr = this.f1514g;
        StringBuilder sb = null;
        while (true) {
            int i2 = this.f1515h;
            int i3 = this.f1516i;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 == c2) {
                        this.f1515h = i4;
                        int i5 = (i4 - i2) - 1;
                        if (sb == null) {
                            return new String(cArr, i2, i5);
                        }
                        sb.append(cArr, i2, i5);
                        return sb.toString();
                    } else if (c3 == '\\') {
                        this.f1515h = i4;
                        int i6 = (i4 - i2) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i2, i6);
                        sb.append(r0());
                    } else {
                        if (c3 == '\n') {
                            this.f1517j++;
                            this.f1518k = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i2 - i2) * 2, 16));
                    }
                    sb.append(cArr, i2, i2 - i2);
                    this.f1515h = i2;
                    if (!Q(1)) {
                        v0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01a0, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0213, code lost:
        if (d0(r1) != false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0216, code lost:
        if (r12 != 2) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0218, code lost:
        if (r14 == false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x021e, code lost:
        if (r4 != Long.MIN_VALUE) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0220, code lost:
        if (r15 == 0) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0226, code lost:
        if (r4 != 0) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0228, code lost:
        if (r15 != 0) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x022a, code lost:
        if (r15 == 0) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x022d, code lost:
        r4 = -r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x022e, code lost:
        r18.f1520m = r4;
        r18.f1515h += r10;
        r1 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0238, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0239, code lost:
        if (r12 == r1) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x023c, code lost:
        if (r12 == 4) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x023f, code lost:
        if (r12 != 7) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0241, code lost:
        r18.n = r10;
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0245, code lost:
        r13 = r1;
        r18.f1519l = r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0180 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int n() {
        /*
        // Method dump skipped, instructions count: 795
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.b.c0.a.n():int");
    }

    public String n0() {
        String str;
        char c2;
        int i2 = this.f1519l;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 10) {
            str = o0();
        } else {
            if (i2 == 8) {
                c2 = '\'';
            } else if (i2 == 9) {
                c2 = '\"';
            } else if (i2 == 11) {
                str = this.o;
                this.o = null;
            } else if (i2 == 15) {
                str = Long.toString(this.f1520m);
            } else if (i2 == 16) {
                str = new String(this.f1514g, this.f1515h, this.n);
                this.f1515h += this.n;
            } else {
                StringBuilder f2 = c.c.a.a.a.f("Expected a string but was ");
                f2.append(p0());
                f2.append(e0());
                throw new IllegalStateException(f2.toString());
            }
            str = m0(c2);
        }
        this.f1519l = 0;
        int[] iArr = this.s;
        int i3 = this.q - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String o0() {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.b.c0.a.o0():java.lang.String");
    }

    public b p0() {
        int i2 = this.f1519l;
        if (i2 == 0) {
            i2 = n();
        }
        switch (i2) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void q0(int i2) {
        int i3 = this.q;
        int[] iArr = this.p;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.p = Arrays.copyOf(iArr, i4);
            this.s = Arrays.copyOf(this.s, i4);
            this.r = (String[]) Arrays.copyOf(this.r, i4);
        }
        int[] iArr2 = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        iArr2[i5] = i2;
    }

    public final char r0() {
        int i2;
        int i3;
        if (this.f1515h != this.f1516i || Q(1)) {
            char[] cArr = this.f1514g;
            int i4 = this.f1515h;
            int i5 = i4 + 1;
            this.f1515h = i5;
            char c2 = cArr[i4];
            if (c2 == '\n') {
                this.f1517j++;
                this.f1518k = i5;
            } else if (!(c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\')) {
                if (c2 == 'b') {
                    return '\b';
                }
                if (c2 == 'f') {
                    return '\f';
                }
                if (c2 == 'n') {
                    return '\n';
                }
                if (c2 == 'r') {
                    return '\r';
                }
                if (c2 == 't') {
                    return '\t';
                }
                if (c2 != 'u') {
                    v0("Invalid escape sequence");
                    throw null;
                } else if (i5 + 4 <= this.f1516i || Q(4)) {
                    char c3 = 0;
                    int i6 = this.f1515h;
                    int i7 = i6 + 4;
                    while (i6 < i7) {
                        char c4 = this.f1514g[i6];
                        char c5 = (char) (c3 << 4);
                        if (c4 < '0' || c4 > '9') {
                            if (c4 >= 'a' && c4 <= 'f') {
                                i3 = c4 - 'a';
                            } else if (c4 < 'A' || c4 > 'F') {
                                StringBuilder f2 = c.c.a.a.a.f("\\u");
                                f2.append(new String(this.f1514g, this.f1515h, 4));
                                throw new NumberFormatException(f2.toString());
                            } else {
                                i3 = c4 - 'A';
                            }
                            i2 = i3 + 10;
                        } else {
                            i2 = c4 - '0';
                        }
                        c3 = (char) (i2 + c5);
                        i6++;
                    }
                    this.f1515h += 4;
                    return c3;
                } else {
                    v0("Unterminated escape sequence");
                    throw null;
                }
            }
            return c2;
        }
        v0("Unterminated escape sequence");
        throw null;
    }

    public final void s0(char c2) {
        char[] cArr = this.f1514g;
        while (true) {
            int i2 = this.f1515h;
            int i3 = this.f1516i;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 == c2) {
                        this.f1515h = i4;
                        return;
                    } else if (c3 == '\\') {
                        this.f1515h = i4;
                        r0();
                        break;
                    } else {
                        if (c3 == '\n') {
                            this.f1517j++;
                            this.f1518k = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    this.f1515h = i2;
                    if (!Q(1)) {
                        v0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public final void t0() {
        char c2;
        do {
            if (this.f1515h < this.f1516i || Q(1)) {
                char[] cArr = this.f1514g;
                int i2 = this.f1515h;
                int i3 = i2 + 1;
                this.f1515h = i3;
                c2 = cArr[i2];
                if (c2 == '\n') {
                    this.f1517j++;
                    this.f1518k = i3;
                    return;
                }
            } else {
                return;
            }
        } while (c2 != '\r');
    }

    public String toString() {
        return getClass().getSimpleName() + e0();
    }

    public void u() {
        int i2 = this.f1519l;
        if (i2 == 0) {
            i2 = n();
        }
        if (i2 == 4) {
            int i3 = this.q - 1;
            this.q = i3;
            int[] iArr = this.s;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f1519l = 0;
            return;
        }
        StringBuilder f2 = c.c.a.a.a.f("Expected END_ARRAY but was ");
        f2.append(p0());
        f2.append(e0());
        throw new IllegalStateException(f2.toString());
    }

    public void u0() {
        int i2;
        char c2;
        int i3 = 0;
        do {
            int i4 = this.f1519l;
            if (i4 == 0) {
                i4 = n();
            }
            if (i4 == 3) {
                q0(1);
            } else if (i4 == 1) {
                q0(3);
            } else if (i4 == 4 || i4 == 2) {
                this.q--;
                i3--;
                this.f1519l = 0;
            } else if (i4 == 14 || i4 == 10) {
                while (true) {
                    i2 = 0;
                    while (true) {
                        int i5 = this.f1515h + i2;
                        if (i5 < this.f1516i) {
                            char c3 = this.f1514g[i5];
                            if (!(c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ')) {
                                if (c3 != '#') {
                                    if (c3 != ',') {
                                        if (!(c3 == '/' || c3 == '=')) {
                                            if (!(c3 == '{' || c3 == '}' || c3 == ':')) {
                                                if (c3 != ';') {
                                                    switch (c3) {
                                                        case '[':
                                                        case ']':
                                                            break;
                                                        case '\\':
                                                            break;
                                                        default:
                                                            i2++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            this.f1515h = i5;
                            if (!Q(1)) {
                            }
                        }
                    }
                }
                e();
                this.f1515h += i2;
                this.f1519l = 0;
            } else {
                if (i4 == 8 || i4 == 12) {
                    c2 = '\'';
                } else if (i4 == 9 || i4 == 13) {
                    c2 = '\"';
                } else {
                    if (i4 == 16) {
                        this.f1515h += this.n;
                    }
                    this.f1519l = 0;
                }
                s0(c2);
                this.f1519l = 0;
            }
            i3++;
            this.f1519l = 0;
        } while (i3 != 0);
        int[] iArr = this.s;
        int i6 = this.q;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        this.r[i6 - 1] = "null";
    }

    public final IOException v0(String str) {
        StringBuilder f2 = c.c.a.a.a.f(str);
        f2.append(e0());
        throw new d(f2.toString());
    }
}
