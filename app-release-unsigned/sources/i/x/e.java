package i.x;

import i.s.c.h;
import i.u.a;
import i.u.c;
import i.u.d;
import i.w.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e extends d {
    public static boolean a(CharSequence charSequence, char c2, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        h.e(charSequence, "$this$contains");
        return i(charSequence, c2, 0, z, 2) >= 0;
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        h.e(charSequence, "$this$contains");
        h.e(charSequence2, "other");
        return j(charSequence, (String) charSequence2, 0, z, 2) >= 0;
    }

    public static boolean c(String str, String str2, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        h.e(str, "$this$endsWith");
        h.e(str2, "suffix");
        return !z ? str.endsWith(str2) : n(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static final boolean d(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final int e(CharSequence charSequence) {
        h.e(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    public static final int f(CharSequence charSequence, String str, int i2, boolean z) {
        h.e(charSequence, "$this$indexOf");
        h.e(str, "string");
        return (z || !(charSequence instanceof String)) ? h(charSequence, str, i2, charSequence.length(), z, false, 16) : ((String) charSequence).indexOf(str, i2);
    }

    public static final int g(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2) {
        a aVar;
        if (!z2) {
            if (i2 < 0) {
                i2 = 0;
            }
            int length = charSequence.length();
            if (i3 > length) {
                i3 = length;
            }
            aVar = new c(i2, i3);
        } else {
            int e = e(charSequence);
            if (i2 > e) {
                i2 = e;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            aVar = d.c(i2, i3);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i4 = aVar.e;
            int i5 = aVar.f3320f;
            int i6 = aVar.f3321g;
            if (i6 >= 0) {
                if (i4 > i5) {
                    return -1;
                }
            } else if (i4 < i5) {
                return -1;
            }
            while (!o(charSequence2, 0, charSequence, i4, charSequence2.length(), z)) {
                if (i4 == i5) {
                    return -1;
                }
                i4 += i6;
            }
            return i4;
        }
        int i7 = aVar.e;
        int i8 = aVar.f3320f;
        int i9 = aVar.f3321g;
        if (i9 >= 0) {
            if (i7 > i8) {
                return -1;
            }
        } else if (i7 < i8) {
            return -1;
        }
        while (!n((String) charSequence2, 0, (String) charSequence, i7, charSequence2.length(), z)) {
            if (i7 == i8) {
                return -1;
            }
            i7 += i9;
        }
        return i7;
    }

    public static /* synthetic */ int h(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2, int i4) {
        if ((i4 & 16) != 0) {
            z2 = false;
        }
        return g(charSequence, charSequence2, i2, i3, z, z2);
    }

    public static int i(CharSequence charSequence, char c2, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        h.e(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c2, i2);
        }
        return k(charSequence, new char[]{c2}, i2, z);
    }

    public static /* synthetic */ int j(CharSequence charSequence, String str, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return f(charSequence, str, i2, z);
    }

    public static final int k(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        boolean z2;
        h.e(charSequence, "$this$indexOfAny");
        h.e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i2 < 0) {
                i2 = 0;
            }
            int e = e(charSequence);
            if (i2 > e) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(i2);
                int length = cArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z2 = false;
                        break;
                    } else if (h.a.t.a.r(cArr[i3], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z2) {
                    return i2;
                }
                if (i2 == e) {
                    return -1;
                }
                i2++;
            }
        } else {
            return ((String) charSequence).indexOf(h.a.t.a.Q(cArr), i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean l(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$this$isBlank"
            i.s.c.h.e(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "$this$indices"
            i.s.c.h.e(r4, r0)
            i.u.c r0 = new i.u.c
            int r3 = r4.length()
            int r3 = r3 + -1
            r0.<init>(r1, r3)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x002b
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x002b
            goto L_0x0049
        L_0x002b:
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            r3 = r0
            i.u.b r3 = (i.u.b) r3
            boolean r3 = r3.f3322f
            if (r3 == 0) goto L_0x0049
            r3 = r0
            i.o.k r3 = (i.o.k) r3
            int r3 = r3.a()
            char r3 = r4.charAt(r3)
            boolean r3 = h.a.t.a.D(r3)
            if (r3 != 0) goto L_0x002f
            r4 = r1
            goto L_0x004a
        L_0x0049:
            r4 = r2
        L_0x004a:
            if (r4 == 0) goto L_0x004d
        L_0x004c:
            r1 = r2
        L_0x004d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.x.e.l(java.lang.CharSequence):boolean");
    }

    public static int m(CharSequence charSequence, char c2, int i2, boolean z, int i3) {
        boolean z2;
        if ((i3 & 2) != 0) {
            i2 = e(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        h.e(charSequence, "$this$lastIndexOf");
        if (!z) {
            return ((String) charSequence).lastIndexOf(c2, i2);
        }
        char[] cArr = {c2};
        h.e(charSequence, "$this$lastIndexOfAny");
        h.e(cArr, "chars");
        if (!z) {
            return ((String) charSequence).lastIndexOf(h.a.t.a.Q(cArr), i2);
        }
        int e = e(charSequence);
        if (i2 > e) {
            i2 = e;
        }
        while (i2 >= 0) {
            char charAt = charSequence.charAt(i2);
            int i4 = 0;
            while (true) {
                if (i4 >= 1) {
                    z2 = false;
                    break;
                } else if (h.a.t.a.r(cArr[i4], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    public static final boolean n(String str, int i2, String str2, int i3, int i4, boolean z) {
        h.e(str, "$this$regionMatches");
        h.e(str2, "other");
        return !z ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z, i2, str2, i3, i4);
    }

    public static final boolean o(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z) {
        h.e(charSequence, "$this$regionMatchesImpl");
        h.e(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!h.a.t.a.r(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z)) {
                return false;
            }
        }
        return true;
    }

    public static final String p(String str, CharSequence charSequence) {
        h.e(str, "$this$removePrefix");
        h.e(charSequence, "prefix");
        h.e(str, "$this$startsWith");
        h.e(charSequence, "prefix");
        if (!u(str, (String) charSequence, false, 2)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        h.d(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static String q(String str, String str2, String str3, boolean z, int i2) {
        int i3 = 0;
        if ((i2 & 4) != 0) {
            z = false;
        }
        h.e(str, "$this$replace");
        h.e(str2, "oldValue");
        h.e(str3, "newValue");
        int f2 = f(str, str2, 0, z);
        if (f2 < 0) {
            return str;
        }
        int length = str2.length();
        int i4 = 1;
        if (length >= 1) {
            i4 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i3, f2);
                sb.append(str3);
                i3 = f2 + length;
                if (f2 >= str.length()) {
                    break;
                }
                f2 = f(str, str2, f2 + i4, z);
            } while (f2 > 0);
            sb.append((CharSequence) str, i3, str.length());
            String sb2 = sb.toString();
            h.d(sb2, "stringBuilder.append(this, i, length).toString()");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static List r(CharSequence charSequence, char[] cArr, boolean z, int i2, int i3) {
        int i4 = 0;
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        h.e(charSequence, "$this$split");
        h.e(cArr, "delimiters");
        int i5 = 10;
        boolean z2 = true;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            if (i2 >= 0) {
                int f2 = f(charSequence, valueOf, 0, z);
                if (f2 == -1 || i2 == 1) {
                    return h.a.t.a.G(charSequence.toString());
                }
                if (i2 <= 0) {
                    z2 = false;
                }
                if (z2 && i2 <= 10) {
                    i5 = i2;
                }
                ArrayList arrayList = new ArrayList(i5);
                do {
                    arrayList.add(charSequence.subSequence(i4, f2).toString());
                    i4 = valueOf.length() + f2;
                    if (z2 && arrayList.size() == i2 - 1) {
                        break;
                    }
                    f2 = f(charSequence, valueOf, i4, z);
                } while (f2 != -1);
                arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
                return arrayList;
            }
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
        }
        if (i2 < 0) {
            z2 = false;
        }
        if (z2) {
            b bVar = new b(charSequence, 0, i2, new f(cArr, z));
            h.e(bVar, "$this$asIterable");
            g gVar = new g(bVar);
            ArrayList arrayList2 = new ArrayList(h.a.t.a.l(gVar, 10));
            Iterator it = gVar.iterator();
            while (it.hasNext()) {
                arrayList2.add(v(charSequence, (c) it.next()));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }

    public static final boolean s(String str, String str2, int i2, boolean z) {
        h.e(str, "$this$startsWith");
        h.e(str2, "prefix");
        return !z ? str.startsWith(str2, i2) : n(str, i2, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean t(String str, String str2, int i2, boolean z, int i3) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        return s(str, str2, i2, z);
    }

    public static boolean u(String str, String str2, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        h.e(str, "$this$startsWith");
        h.e(str2, "prefix");
        return !z ? str.startsWith(str2) : n(str, 0, str2, 0, str2.length(), z);
    }

    public static final String v(CharSequence charSequence, c cVar) {
        h.e(charSequence, "$this$substring");
        h.e(cVar, "range");
        return charSequence.subSequence(Integer.valueOf(cVar.e).intValue(), Integer.valueOf(cVar.f3320f).intValue() + 1).toString();
    }

    public static String w(String str, char c2, String str2, int i2) {
        String str3 = (i2 & 2) != 0 ? str : null;
        h.e(str, "$this$substringAfterLast");
        h.e(str3, "missingDelimiterValue");
        int m2 = m(str, c2, 0, false, 6);
        if (m2 == -1) {
            return str3;
        }
        String substring = str.substring(m2 + 1, str.length());
        h.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final Integer x(String str) {
        boolean z;
        int i2;
        h.e(str, "$this$toIntOrNull");
        h.e(str, "$this$toIntOrNull");
        h.a.t.a.j(10);
        int length = str.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str.charAt(0);
            int i4 = 1;
            int i5 = -2147483647;
            if ((charAt < '0' ? 65535 : charAt == '0' ? (char) 0 : 1) >= 0) {
                z = false;
                i4 = 0;
            } else if (length != 1) {
                if (charAt == '-') {
                    i5 = Integer.MIN_VALUE;
                    z = true;
                } else if (charAt == '+') {
                    z = false;
                }
            }
            int i6 = -59652323;
            while (i4 < length) {
                int digit = Character.digit((int) str.charAt(i4), 10);
                if (digit >= 0 && ((i3 >= i6 || (i6 == -59652323 && i3 >= (i6 = i5 / 10))) && (i2 = i3 * 10) >= i5 + digit)) {
                    i3 = i2 - digit;
                    i4++;
                }
            }
            return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
        }
        return null;
    }

    public static final CharSequence y(CharSequence charSequence) {
        h.e(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean D = h.a.t.a.D(charSequence.charAt(!z ? i2 : length));
            if (!z) {
                if (!D) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!D) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static String z(String str, String str2, int i2) {
        String str3;
        String str4 = (i2 & 1) != 0 ? "|" : null;
        h.e(str, "$this$trimMargin");
        h.e(str4, "marginPrefix");
        h.e(str, "$this$replaceIndentByMargin");
        h.e("", "newIndent");
        h.e(str4, "marginPrefix");
        if (!l(str4)) {
            h.e(str, "$this$lines");
            h.e(str, "$this$lineSequence");
            String[] strArr = {"\r\n", "\n", "\r"};
            h.e(str, "$this$splitToSequence");
            h.e(strArr, "delimiters");
            b bVar = new b(str, 0, 0, new g(i.o.e.a(strArr), false));
            h hVar = new h(str);
            h.e(bVar, "$this$map");
            h.e(hVar, "transform");
            List b0 = h.a.t.a.b0(new i.w.h(bVar, hVar));
            int size = (b0.size() * 0) + str.length();
            h.e(b0, "$this$lastIndex");
            int size2 = b0.size() - 1;
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (Object obj : b0) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    String str5 = (String) obj;
                    if ((i3 == 0 || i3 == size2) && l(str5)) {
                        str5 = null;
                    } else {
                        int length = str5.length();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i5 = -1;
                                break;
                            } else if (!h.a.t.a.D(str5.charAt(i5))) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (i5 != -1 && t(str5, str4, i5, false, 4)) {
                            str3 = str5.substring(str4.length() + i5);
                            h.d(str3, "(this as java.lang.String).substring(startIndex)");
                        } else {
                            str3 = null;
                        }
                        if (str3 != null) {
                            h.e(str3, "line");
                            str5 = str3;
                        }
                    }
                    if (str5 != null) {
                        arrayList.add(str5);
                    }
                    i3 = i4;
                } else {
                    i.o.e.m();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(size);
            i.o.e.g(arrayList, sb, "\n", "", "", -1, "...", null);
            String sb2 = sb.toString();
            h.d(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }
}
