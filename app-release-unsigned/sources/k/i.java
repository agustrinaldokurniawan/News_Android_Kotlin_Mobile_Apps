package k;

import i.o.e;
import i.s.c.f;
import i.s.c.h;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import k.b0.b;

public class i implements Serializable, Comparable<i> {
    public static final i e = new i(new byte[0]);

    /* renamed from: f  reason: collision with root package name */
    public static final a f3739f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public transient int f3740g;

    /* renamed from: h  reason: collision with root package name */
    public transient String f3741h;

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f3742i;

    public static final class a {
        public a(f fVar) {
        }

        public static i c(a aVar, byte[] bArr, int i2, int i3, int i4) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = bArr.length;
            }
            h.f(bArr, "$this$toByteString");
            h.a.t.a.i((long) bArr.length, (long) i2, (long) i3);
            return new i(e.e(bArr, i2, i3 + i2));
        }

        public final i a(String str) {
            h.f(str, "$this$decodeHex");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    bArr[i2] = (byte) (b.a(str.charAt(i3 + 1)) + (b.a(str.charAt(i3)) << 4));
                }
                return new i(bArr);
            }
            throw new IllegalArgumentException(c.c.a.a.a.q("Unexpected hex string: ", str).toString());
        }

        public final i b(String str) {
            h.f(str, "$this$encodeUtf8");
            h.f(str, "$this$asUtf8ToByteArray");
            byte[] bytes = str.getBytes(i.x.a.a);
            h.b(bytes, "(this as java.lang.String).getBytes(charset)");
            i iVar = new i(bytes);
            iVar.f3741h = str;
            return iVar;
        }
    }

    public i(byte[] bArr) {
        h.f(bArr, "data");
        this.f3742i = bArr;
    }

    public static final i c(String str) {
        h.f(str, "$this$encodeUtf8");
        h.f(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(i.x.a.a);
        h.b(bytes, "(this as java.lang.String).getBytes(charset)");
        i iVar = new i(bytes);
        iVar.f3741h = str;
        return iVar;
    }

    public String a() {
        byte[] bArr = this.f3742i;
        byte[] bArr2 = a.a;
        byte[] bArr3 = a.a;
        h.f(bArr, "$this$encodeBase64");
        h.f(bArr3, "map");
        byte[] bArr4 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            int i6 = i5 + 1;
            byte b3 = bArr[i5];
            int i7 = i3 + 1;
            bArr4[i3] = bArr3[(b & 255) >> 2];
            int i8 = i7 + 1;
            bArr4[i7] = bArr3[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i9 = i8 + 1;
            bArr4[i8] = bArr3[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 = i9 + 1;
            bArr4[i9] = bArr3[b3 & 63];
            i2 = i6;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i2];
            int i10 = i3 + 1;
            bArr4[i3] = bArr3[(b4 & 255) >> 2];
            int i11 = i10 + 1;
            bArr4[i10] = bArr3[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr4[i11] = b5;
            bArr4[i11 + 1] = b5;
        } else if (length2 == 2) {
            int i12 = i2 + 1;
            byte b6 = bArr[i2];
            byte b7 = bArr[i12];
            int i13 = i3 + 1;
            bArr4[i3] = bArr3[(b6 & 255) >> 2];
            int i14 = i13 + 1;
            bArr4[i13] = bArr3[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr4[i14] = bArr3[(b7 & 15) << 2];
            bArr4[i14 + 1] = (byte) 61;
        }
        h.f(bArr4, "$this$toUtf8String");
        return new String(bArr4, i.x.a.a);
    }

    public i b(String str) {
        h.f(str, "algorithm");
        byte[] digest = MessageDigest.getInstance(str).digest(this.f3742i);
        h.b(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new i(digest);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        if (r6 < r7) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r0 < r1) goto L_0x0031;
     */
    @Override // java.lang.Comparable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(k.i r9) {
        /*
            r8 = this;
            k.i r9 = (k.i) r9
            java.lang.String r0 = "other"
            i.s.c.h.f(r9, r0)
            int r0 = r8.d()
            int r1 = r9.d()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0015:
            r5 = -1
            if (r4 >= r2) goto L_0x002c
            byte r6 = r8.g(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r7 = r9.g(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r6 != r7) goto L_0x0029
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0029:
            if (r6 >= r7) goto L_0x0033
            goto L_0x0031
        L_0x002c:
            if (r0 != r1) goto L_0x002f
            goto L_0x0034
        L_0x002f:
            if (r0 >= r1) goto L_0x0033
        L_0x0031:
            r3 = r5
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k.i.compareTo(java.lang.Object):int");
    }

    public int d() {
        return this.f3742i.length;
    }

    public String e() {
        byte[] bArr = this.f3742i;
        char[] cArr = new char[(bArr.length * 2)];
        int i2 = 0;
        for (byte b : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = b.a;
            cArr[i2] = cArr2[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int d2 = iVar.d();
            byte[] bArr = this.f3742i;
            if (d2 == bArr.length && iVar.i(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f3742i;
    }

    public byte g(int i2) {
        return this.f3742i[i2];
    }

    public boolean h(int i2, i iVar, int i3, int i4) {
        h.f(iVar, "other");
        return iVar.i(i3, this.f3742i, i2, i4);
    }

    public int hashCode() {
        int i2 = this.f3740g;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f3742i);
        this.f3740g = hashCode;
        return hashCode;
    }

    public boolean i(int i2, byte[] bArr, int i3, int i4) {
        h.f(bArr, "other");
        if (i2 >= 0) {
            byte[] bArr2 = this.f3742i;
            return i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && h.a.t.a.f(bArr2, i2, bArr, i3, i4);
        }
    }

    public i j() {
        byte b;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f3742i;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i2];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i2++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                h.b(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b4 = copyOf[i3];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i3] = (byte) (b4 + 32);
                    }
                }
                return new i(copyOf);
            }
        }
    }

    public String k() {
        String str = this.f3741h;
        if (str != null) {
            return str;
        }
        byte[] f2 = f();
        h.f(f2, "$this$toUtf8String");
        String str2 = new String(f2, i.x.a.a);
        this.f3741h = str2;
        return str2;
    }

    public void l(e eVar, int i2, int i3) {
        h.f(eVar, "buffer");
        h.f(this, "$this$commonWrite");
        h.f(eVar, "buffer");
        eVar.p0(this.f3742i, i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0121, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x015f, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0172, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0183, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0192, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01a8, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01b0, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01b7, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x01ec, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x01ef, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008a, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a6, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00e4, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00f7, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0106, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0118, code lost:
        if (r4 == 64) goto L_0x01f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 689
        */
        throw new UnsupportedOperationException("Method not decompiled: k.i.toString():java.lang.String");
    }
}
