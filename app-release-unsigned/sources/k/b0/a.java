package k.b0;

import i.s.c.h;
import k.e;
import k.p;
import k.u;

public final class a {
    public static final byte[] a;

    static {
        h.f("0123456789abcdef", "$this$asUtf8ToByteArray");
        byte[] bytes = "0123456789abcdef".getBytes(i.x.a.a);
        h.b(bytes, "(this as java.lang.String).getBytes(charset)");
        a = bytes;
    }

    public static final String a(e eVar, long j2) {
        h.f(eVar, "$this$readUtf8Line");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (eVar.b0(j3) == ((byte) 13)) {
                String k0 = eVar.k0(j3);
                eVar.a(2);
                return k0;
            }
        }
        String k02 = eVar.k0(j2);
        eVar.a(1);
        return k02;
    }

    public static final int b(e eVar, p pVar, boolean z) {
        int i2;
        int i3;
        int i4;
        u uVar;
        int i5;
        h.f(eVar, "$this$selectPrefix");
        h.f(pVar, "options");
        u uVar2 = eVar.e;
        if (uVar2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = uVar2.a;
        int i6 = uVar2.b;
        int i7 = uVar2.f3763c;
        int[] iArr = pVar.f3752g;
        u uVar3 = uVar2;
        int i8 = -1;
        int i9 = 0;
        loop0:
        while (true) {
            int i10 = i9 + 1;
            int i11 = iArr[i9];
            int i12 = i10 + 1;
            int i13 = iArr[i10];
            if (i13 != -1) {
                i8 = i13;
            }
            if (uVar3 == null) {
                break;
            }
            if (i11 < 0) {
                int i14 = (i11 * -1) + i12;
                while (true) {
                    int i15 = i6 + 1;
                    int i16 = i12 + 1;
                    if ((bArr[i6] & 255) != iArr[i12]) {
                        return i8;
                    }
                    boolean z2 = i16 == i14;
                    if (i15 != i7) {
                        i4 = i7;
                        i5 = i15;
                        uVar = uVar3;
                    } else if (uVar3 != null) {
                        u uVar4 = uVar3.f3765f;
                        if (uVar4 != null) {
                            i5 = uVar4.b;
                            byte[] bArr2 = uVar4.a;
                            i4 = uVar4.f3763c;
                            if (uVar4 != uVar2) {
                                uVar = uVar4;
                                bArr = bArr2;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                uVar = null;
                            }
                        } else {
                            h.j();
                            throw null;
                        }
                    } else {
                        h.j();
                        throw null;
                    }
                    if (z2) {
                        i3 = iArr[i16];
                        i2 = i5;
                        i7 = i4;
                        uVar3 = uVar;
                        break;
                    }
                    i6 = i5;
                    i7 = i4;
                    i12 = i16;
                    uVar3 = uVar;
                }
            } else {
                i2 = i6 + 1;
                int i17 = bArr[i6] & 255;
                int i18 = i12 + i11;
                while (i12 != i18) {
                    if (i17 == iArr[i12]) {
                        i3 = iArr[i12 + i11];
                        if (i2 == i7) {
                            uVar3 = uVar3.f3765f;
                            if (uVar3 != null) {
                                i2 = uVar3.b;
                                bArr = uVar3.a;
                                i7 = uVar3.f3763c;
                                if (uVar3 == uVar2) {
                                    uVar3 = null;
                                }
                            } else {
                                h.j();
                                throw null;
                            }
                        }
                    } else {
                        i12++;
                    }
                }
                return i8;
            }
            if (i3 >= 0) {
                return i3;
            }
            i9 = -i3;
            i6 = i2;
        }
        if (z) {
            return -2;
        }
        return i8;
    }
}
