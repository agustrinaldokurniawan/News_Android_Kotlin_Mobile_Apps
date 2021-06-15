package c.e.b.c0;

import c.c.a.a.a;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;

public class c implements Closeable, Flushable {
    public static final String[] e = new String[128];

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f1529f;

    /* renamed from: g  reason: collision with root package name */
    public final Writer f1530g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f1531h = new int[32];

    /* renamed from: i  reason: collision with root package name */
    public int f1532i = 0;

    /* renamed from: j  reason: collision with root package name */
    public String f1533j;

    /* renamed from: k  reason: collision with root package name */
    public String f1534k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1535l;

    /* renamed from: m  reason: collision with root package name */
    public String f1536m;
    public boolean n;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            e[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f1529f = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        e0(6);
        this.f1534k = ":";
        this.n = true;
        Objects.requireNonNull(writer, "out == null");
        this.f1530g = writer;
    }

    public c K() {
        n(3, 5, '}');
        return this;
    }

    public c Q(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f1536m != null) {
            throw new IllegalStateException();
        } else if (this.f1532i != 0) {
            this.f1536m = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public final void V() {
        if (this.f1533j != null) {
            this.f1530g.write(10);
            int i2 = this.f1532i;
            for (int i3 = 1; i3 < i2; i3++) {
                this.f1530g.write(this.f1533j);
            }
        }
    }

    public final void b() {
        int d0 = d0();
        if (d0 == 1) {
            f0(2);
        } else if (d0 == 2) {
            this.f1530g.append(',');
        } else if (d0 != 4) {
            if (d0 != 6) {
                if (d0 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f1535l) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            f0(7);
            return;
        } else {
            this.f1530g.append((CharSequence) this.f1534k);
            f0(5);
            return;
        }
        V();
    }

    public c b0() {
        if (this.f1536m != null) {
            if (this.n) {
                m0();
            } else {
                this.f1536m = null;
                return this;
            }
        }
        b();
        this.f1530g.write("null");
        return this;
    }

    public c c() {
        m0();
        b();
        e0(1);
        this.f1530g.write(91);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1530g.close();
        int i2 = this.f1532i;
        if (i2 > 1 || (i2 == 1 && this.f1531h[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f1532i = 0;
    }

    public final int d0() {
        int i2 = this.f1532i;
        if (i2 != 0) {
            return this.f1531h[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c e() {
        m0();
        b();
        e0(3);
        this.f1530g.write(123);
        return this;
    }

    public final void e0(int i2) {
        int i3 = this.f1532i;
        int[] iArr = this.f1531h;
        if (i3 == iArr.length) {
            this.f1531h = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f1531h;
        int i4 = this.f1532i;
        this.f1532i = i4 + 1;
        iArr2[i4] = i2;
    }

    public final void f0(int i2) {
        this.f1531h[this.f1532i - 1] = i2;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f1532i != 0) {
            this.f1530g.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void g0(String str) {
        String str2;
        String[] strArr = e;
        this.f1530g.write(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i2 < i3) {
                this.f1530g.write(str, i2, i3 - i2);
            }
            this.f1530g.write(str2);
            i2 = i3 + 1;
        }
        if (i2 < length) {
            this.f1530g.write(str, i2, length - i2);
        }
        this.f1530g.write(34);
    }

    public c h0(long j2) {
        m0();
        b();
        this.f1530g.write(Long.toString(j2));
        return this;
    }

    public c i0(Boolean bool) {
        if (bool == null) {
            return b0();
        }
        m0();
        b();
        this.f1530g.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c j0(Number number) {
        if (number == null) {
            return b0();
        }
        m0();
        String obj = number.toString();
        if (this.f1535l || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            b();
            this.f1530g.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c k0(String str) {
        if (str == null) {
            return b0();
        }
        m0();
        b();
        g0(str);
        return this;
    }

    public c l0(boolean z) {
        m0();
        b();
        this.f1530g.write(z ? "true" : "false");
        return this;
    }

    public final void m0() {
        if (this.f1536m != null) {
            int d0 = d0();
            if (d0 == 5) {
                this.f1530g.write(44);
            } else if (d0 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            V();
            f0(4);
            g0(this.f1536m);
            this.f1536m = null;
        }
    }

    public final c n(int i2, int i3, char c2) {
        int d0 = d0();
        if (d0 != i3 && d0 != i2) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f1536m == null) {
            this.f1532i--;
            if (d0 == i3) {
                V();
            }
            this.f1530g.write(c2);
            return this;
        } else {
            StringBuilder f2 = a.f("Dangling name: ");
            f2.append(this.f1536m);
            throw new IllegalStateException(f2.toString());
        }
    }

    public c u() {
        n(1, 2, ']');
        return this;
    }
}
