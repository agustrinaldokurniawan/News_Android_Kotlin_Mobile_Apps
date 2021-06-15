package c.b.a.e0.h0;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import k.e;
import k.i;
import k.p;

public abstract class c implements Closeable {
    public static final String[] e = new String[128];

    /* renamed from: f  reason: collision with root package name */
    public int f631f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f632g = new int[32];

    /* renamed from: h  reason: collision with root package name */
    public String[] f633h = new String[32];

    /* renamed from: i  reason: collision with root package name */
    public int[] f634i = new int[32];

    public static final class a {
        public final String[] a;
        public final p b;

        public a(String[] strArr, p pVar) {
            this.a = strArr;
            this.b = pVar;
        }

        public static a a(String... strArr) {
            String str;
            try {
                i[] iVarArr = new i[strArr.length];
                e eVar = new e();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    String str2 = strArr[i2];
                    String[] strArr2 = c.e;
                    eVar.r0(34);
                    int length = str2.length();
                    int i3 = 0;
                    for (int i4 = 0; i4 < length; i4++) {
                        char charAt = str2.charAt(i4);
                        if (charAt < 128) {
                            str = strArr2[charAt];
                            if (str == null) {
                            }
                        } else if (charAt == 8232) {
                            str = "\\u2028";
                        } else if (charAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i3 < i4) {
                            eVar.x0(str2, i3, i4);
                        }
                        eVar.w0(str);
                        i3 = i4 + 1;
                    }
                    if (i3 < length) {
                        eVar.x0(str2, i3, length);
                    }
                    eVar.r0(34);
                    eVar.readByte();
                    iVarArr[i2] = eVar.g0();
                }
                return new a((String[]) strArr.clone(), p.e.c(iVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

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
    }

    public abstract boolean K();

    public abstract boolean Q();

    public abstract double V();

    public abstract void b();

    public abstract int b0();

    public abstract void c();

    public abstract String d0();

    public abstract void e();

    public abstract String e0();

    public abstract b f0();

    public final void g0(int i2) {
        int i3 = this.f631f;
        int[] iArr = this.f632g;
        if (i3 == iArr.length) {
            if (i3 != 256) {
                this.f632g = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f633h;
                this.f633h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f634i;
                this.f634i = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder f2 = c.c.a.a.a.f("Nesting too deep at ");
                f2.append(u());
                throw new a(f2.toString());
            }
        }
        int[] iArr3 = this.f632g;
        int i4 = this.f631f;
        this.f631f = i4 + 1;
        iArr3[i4] = i2;
    }

    public abstract int h0(a aVar);

    public abstract void i0();

    public abstract void j0();

    public final b k0(String str) {
        StringBuilder h2 = c.c.a.a.a.h(str, " at path ");
        h2.append(u());
        throw new b(h2.toString());
    }

    public abstract void n();

    public final String u() {
        int i2 = this.f631f;
        int[] iArr = this.f632g;
        String[] strArr = this.f633h;
        int[] iArr2 = this.f634i;
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(iArr2[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }
}
