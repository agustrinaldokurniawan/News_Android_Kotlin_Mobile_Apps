package j.n0.j;

import c.c.a.a.a;
import i.s.c.h;
import j.n0.c;
import k.i;

public final class e {
    public static final i a = i.f3739f.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f3596c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f3597d;
    public static final e e = new e();

    static {
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            h.b(binaryString, "Integer.toBinaryString(it)");
            String h2 = c.h("%8s", binaryString);
            h.e(h2, "$this$replace");
            String replace = h2.replace(' ', '0');
            h.d(replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            strArr[i2] = replace;
        }
        f3597d = strArr;
        String[] strArr2 = f3596c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = f3596c;
            strArr3[i4 | 8] = h.i(strArr3[i4], "|PADDED");
        }
        String[] strArr4 = f3596c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = f3596c;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + "|" + strArr5[i6];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i8]);
                sb.append("|");
                strArr5[i9 | 8] = a.e(sb, strArr5[i6], "|PADDED");
            }
        }
        int length = f3596c.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr6 = f3596c;
            if (strArr6[i10] == null) {
                strArr6[i10] = f3597d[i10];
            }
        }
    }

    public final String a(int i2) {
        String[] strArr = b;
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        return c.h("0x%02x", Integer.valueOf(i2));
    }

    public final String b(boolean z, int i2, int i3, int i4, int i5) {
        String str;
        String str2;
        String str3;
        String str4;
        String a2 = a(i4);
        if (i5 == 0) {
            str = "";
        } else {
            if (!(i4 == 2 || i4 == 3)) {
                if (i4 == 4 || i4 == 6) {
                    str = i5 == 1 ? "ACK" : f3597d[i5];
                } else if (!(i4 == 7 || i4 == 8)) {
                    String[] strArr = f3596c;
                    if (i5 < strArr.length) {
                        str2 = strArr[i5];
                        if (str2 == null) {
                            h.j();
                            throw null;
                        }
                    } else {
                        str2 = f3597d[i5];
                    }
                    if (i4 == 5 && (i5 & 4) != 0) {
                        str4 = "HEADERS";
                        str3 = "PUSH_PROMISE";
                    } else if (i4 != 0 || (i5 & 32) == 0) {
                        str = str2;
                    } else {
                        str4 = "PRIORITY";
                        str3 = "COMPRESSED";
                    }
                    str = i.x.e.q(str2, str4, str3, false, 4);
                }
            }
            str = f3597d[i5];
        }
        return c.h("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), a2, str);
    }
}
