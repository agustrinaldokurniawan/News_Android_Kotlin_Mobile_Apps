package j.n0.h;

import i.s.c.h;
import j.i0;
import j.n0.c;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.i;

public final class e {
    public static final i a;
    public static final i b;

    static {
        i.a aVar = i.f3739f;
        a = aVar.b("\"\\");
        b = aVar.b("\t ,=");
    }

    public static final boolean a(i0 i0Var) {
        h.f(i0Var, "$this$promisesBody");
        if (h.a(i0Var.e.f3395c, "HEAD")) {
            return false;
        }
        int i2 = i0Var.f3410h;
        if (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && c.j(i0Var) == -1 && !i.x.e.d("chunked", i0.b(i0Var, "Transfer-Encoding", null, 2), true)) {
            return false;
        }
        return true;
    }

    public static final void b(k.e eVar, List<j.i> list) {
        String c2;
        int r;
        int i2;
        int i3;
        String str;
        String str2;
        while (true) {
            String str3 = null;
            String str4 = null;
            while (true) {
                if (str3 == null) {
                    e(eVar);
                    str3 = c(eVar);
                    if (str3 == null) {
                        return;
                    }
                }
                boolean e = e(eVar);
                c2 = c(eVar);
                if (c2 != null) {
                    byte b2 = (byte) 61;
                    r = c.r(eVar, b2);
                    boolean e2 = e(eVar);
                    i2 = 0;
                    i3 = 1;
                    if (e || (!e2 && !eVar.R())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int r2 = c.r(eVar, b2) + r;
                        while (true) {
                            if (c2 == null) {
                                c2 = c(eVar);
                                if (e(eVar)) {
                                    continue;
                                    break;
                                }
                                r2 = c.r(eVar, b2);
                            }
                            if (r2 == 0) {
                                continue;
                                break;
                            } else if (r2 <= i3 && !e(eVar)) {
                                byte b3 = (byte) 34;
                                if (((eVar.R() || eVar.b0(0) != b3) ? i2 : i3) != 0) {
                                    if ((eVar.readByte() == b3 ? i3 : i2) != 0) {
                                        k.e eVar2 = new k.e();
                                        while (true) {
                                            long o = eVar.o(a);
                                            if (o == -1) {
                                                break;
                                            } else if (eVar.b0(o) == b3) {
                                                eVar2.l(eVar, o);
                                                eVar.readByte();
                                                str4 = eVar2.j0();
                                                break;
                                            } else if (eVar.f3738f == o + 1) {
                                                str = null;
                                                break;
                                            } else {
                                                eVar2.l(eVar, o);
                                                eVar.readByte();
                                                eVar2.l(eVar, 1);
                                                str4 = null;
                                            }
                                        }
                                        str = str4;
                                    } else {
                                        throw new IllegalArgumentException("Failed requirement.".toString());
                                    }
                                } else {
                                    str = c(eVar);
                                }
                                if (str != null && ((String) linkedHashMap.put(c2, str)) == null) {
                                    if (e(eVar) || eVar.R()) {
                                        str4 = null;
                                        c2 = null;
                                        i2 = 0;
                                        i3 = 1;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new j.i(str3, linkedHashMap));
                        str3 = c2;
                    }
                } else if (eVar.R()) {
                    list.add(new j.i(str3, i.o.i.e));
                    return;
                } else {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(c2);
            h.e("=", "$this$repeat");
            if (r >= 0) {
                if (r != 0) {
                    if (r != 1) {
                        int length = "=".length();
                        if (length != 0) {
                            if (length != 1) {
                                StringBuilder sb2 = new StringBuilder("=".length() * r);
                                if (1 <= r) {
                                    while (true) {
                                        sb2.append((CharSequence) "=");
                                        if (i3 == r) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                                str2 = sb2.toString();
                                h.d(str2, "sb.toString()");
                            } else {
                                char charAt = "=".charAt(0);
                                char[] cArr = new char[r];
                                while (i2 < r) {
                                    cArr[i2] = charAt;
                                    i2++;
                                }
                                str2 = new String(cArr);
                            }
                        }
                    } else {
                        str2 = "=".toString();
                    }
                    sb.append(str2);
                    Map singletonMap = Collections.singletonMap(str4, sb.toString());
                    h.b(singletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
                    list.add(new j.i(str3, singletonMap));
                }
                str2 = "";
                sb.append(str2);
                Map singletonMap2 = Collections.singletonMap(str4, sb.toString());
                h.b(singletonMap2, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
                list.add(new j.i(str3, singletonMap2));
            } else {
                throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + r + '.').toString());
            }
        }
    }

    public static final String c(k.e eVar) {
        long o = eVar.o(b);
        if (o == -1) {
            o = eVar.f3738f;
        }
        if (o != 0) {
            return eVar.k0(o);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f6, code lost:
        if (r8 == false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x020b, code lost:
        if (okhttp3.internal.publicsuffix.PublicSuffixDatabase.f3898c.a(r7) == null) goto L_0x020d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0252 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0203  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(j.p r28, j.y r29, j.x r30) {
        /*
        // Method dump skipped, instructions count: 625
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.h.e.d(j.p, j.y, j.x):void");
    }

    public static final boolean e(k.e eVar) {
        boolean z = false;
        while (!eVar.R()) {
            byte b0 = eVar.b0(0);
            if (b0 == 9 || b0 == 32) {
                eVar.readByte();
            } else if (b0 != 44) {
                break;
            } else {
                eVar.readByte();
                z = true;
            }
        }
        return z;
    }
}
