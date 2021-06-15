package c.e.b.a0.z;

import c.e.b.a0.s;
import c.e.b.c0.b;
import c.e.b.k;
import c.e.b.p;
import c.e.b.q;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class e extends c.e.b.c0.a {
    public static final Object t = new Object();
    public Object[] u;
    public int v;
    public String[] w;
    public int[] x;

    public class a extends Reader {
        @Override // java.io.Closeable, java.io.Reader, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    static {
        new a();
    }

    @Override // c.e.b.c0.a
    private String e0() {
        StringBuilder f2 = c.c.a.a.a.f(" at path ");
        f2.append(V());
        return f2.toString();
    }

    @Override // c.e.b.c0.a
    public void K() {
        w0(b.END_OBJECT);
        y0();
        y0();
        int i2 = this.v;
        if (i2 > 0) {
            int[] iArr = this.x;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // c.e.b.c0.a
    public String V() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = 0;
        while (i2 < this.v) {
            Object[] objArr = this.u;
            if (objArr[i2] instanceof k) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.x[i2]);
                    sb.append(']');
                }
            } else if (objArr[i2] instanceof q) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.w;
                    if (strArr[i2] != null) {
                        sb.append(strArr[i2]);
                    }
                }
            }
            i2++;
        }
        return sb.toString();
    }

    @Override // c.e.b.c0.a
    public void b() {
        w0(b.BEGIN_ARRAY);
        z0(((k) x0()).iterator());
        this.x[this.v - 1] = 0;
    }

    @Override // c.e.b.c0.a
    public boolean b0() {
        b p0 = p0();
        return (p0 == b.END_OBJECT || p0 == b.END_ARRAY) ? false : true;
    }

    @Override // c.e.b.c0.a
    public void c() {
        w0(b.BEGIN_OBJECT);
        z0(new s.b.a((s.b) ((q) x0()).a.entrySet()));
    }

    @Override // java.io.Closeable, c.e.b.c0.a, java.lang.AutoCloseable
    public void close() {
        this.u = new Object[]{t};
        this.v = 1;
    }

    @Override // c.e.b.c0.a
    public boolean f0() {
        w0(b.BOOLEAN);
        boolean b = ((c.e.b.s) y0()).b();
        int i2 = this.v;
        if (i2 > 0) {
            int[] iArr = this.x;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return b;
    }

    @Override // c.e.b.c0.a
    public double g0() {
        b p0 = p0();
        b bVar = b.NUMBER;
        if (p0 == bVar || p0 == b.STRING) {
            c.e.b.s sVar = (c.e.b.s) x0();
            double doubleValue = sVar.a instanceof Number ? sVar.c().doubleValue() : Double.parseDouble(sVar.d());
            if (this.f1513f || (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue))) {
                y0();
                int i2 = this.v;
                if (i2 > 0) {
                    int[] iArr = this.x;
                    int i3 = i2 - 1;
                    iArr[i3] = iArr[i3] + 1;
                }
                return doubleValue;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + p0 + e0());
    }

    @Override // c.e.b.c0.a
    public int h0() {
        b p0 = p0();
        b bVar = b.NUMBER;
        if (p0 == bVar || p0 == b.STRING) {
            c.e.b.s sVar = (c.e.b.s) x0();
            int intValue = sVar.a instanceof Number ? sVar.c().intValue() : Integer.parseInt(sVar.d());
            y0();
            int i2 = this.v;
            if (i2 > 0) {
                int[] iArr = this.x;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return intValue;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + p0 + e0());
    }

    @Override // c.e.b.c0.a
    public long i0() {
        b p0 = p0();
        b bVar = b.NUMBER;
        if (p0 == bVar || p0 == b.STRING) {
            c.e.b.s sVar = (c.e.b.s) x0();
            long longValue = sVar.a instanceof Number ? sVar.c().longValue() : Long.parseLong(sVar.d());
            y0();
            int i2 = this.v;
            if (i2 > 0) {
                int[] iArr = this.x;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return longValue;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + p0 + e0());
    }

    @Override // c.e.b.c0.a
    public String j0() {
        w0(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) x0()).next();
        String str = (String) entry.getKey();
        this.w[this.v - 1] = str;
        z0(entry.getValue());
        return str;
    }

    @Override // c.e.b.c0.a
    public void l0() {
        w0(b.NULL);
        y0();
        int i2 = this.v;
        if (i2 > 0) {
            int[] iArr = this.x;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // c.e.b.c0.a
    public String n0() {
        b p0 = p0();
        b bVar = b.STRING;
        if (p0 == bVar || p0 == b.NUMBER) {
            String d2 = ((c.e.b.s) y0()).d();
            int i2 = this.v;
            if (i2 > 0) {
                int[] iArr = this.x;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return d2;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + p0 + e0());
    }

    @Override // c.e.b.c0.a
    public b p0() {
        if (this.v == 0) {
            return b.END_DOCUMENT;
        }
        Object x0 = x0();
        if (x0 instanceof Iterator) {
            boolean z = this.u[this.v - 2] instanceof q;
            Iterator it = (Iterator) x0;
            if (!it.hasNext()) {
                return z ? b.END_OBJECT : b.END_ARRAY;
            }
            if (z) {
                return b.NAME;
            }
            z0(it.next());
            return p0();
        } else if (x0 instanceof q) {
            return b.BEGIN_OBJECT;
        } else {
            if (x0 instanceof k) {
                return b.BEGIN_ARRAY;
            }
            if (x0 instanceof c.e.b.s) {
                Object obj = ((c.e.b.s) x0).a;
                if (obj instanceof String) {
                    return b.STRING;
                }
                if (obj instanceof Boolean) {
                    return b.BOOLEAN;
                }
                if (obj instanceof Number) {
                    return b.NUMBER;
                }
                throw new AssertionError();
            } else if (x0 instanceof p) {
                return b.NULL;
            } else {
                if (x0 == t) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // c.e.b.c0.a
    public String toString() {
        return e.class.getSimpleName();
    }

    @Override // c.e.b.c0.a
    public void u() {
        w0(b.END_ARRAY);
        y0();
        y0();
        int i2 = this.v;
        if (i2 > 0) {
            int[] iArr = this.x;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // c.e.b.c0.a
    public void u0() {
        if (p0() == b.NAME) {
            j0();
            this.w[this.v - 2] = "null";
        } else {
            y0();
            int i2 = this.v;
            if (i2 > 0) {
                this.w[i2 - 1] = "null";
            }
        }
        int i3 = this.v;
        if (i3 > 0) {
            int[] iArr = this.x;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    public final void w0(b bVar) {
        if (p0() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + p0() + e0());
        }
    }

    public final Object x0() {
        return this.u[this.v - 1];
    }

    public final Object y0() {
        Object[] objArr = this.u;
        int i2 = this.v - 1;
        this.v = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void z0(Object obj) {
        int i2 = this.v;
        Object[] objArr = this.u;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.u = Arrays.copyOf(objArr, i3);
            this.x = Arrays.copyOf(this.x, i3);
            this.w = (String[]) Arrays.copyOf(this.w, i3);
        }
        Object[] objArr2 = this.u;
        int i4 = this.v;
        this.v = i4 + 1;
        objArr2[i4] = obj;
    }
}
