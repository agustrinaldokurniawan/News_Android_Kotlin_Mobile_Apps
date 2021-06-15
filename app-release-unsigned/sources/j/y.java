package j;

import i.j;
import i.s.c.f;
import i.s.c.h;
import i.x.e;
import j.n0.c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class y {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final b b = new b(null);

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3713c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3714d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3715f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3716g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3717h;

    /* renamed from: i  reason: collision with root package name */
    public final List<String> f3718i;

    /* renamed from: j  reason: collision with root package name */
    public final List<String> f3719j;

    /* renamed from: k  reason: collision with root package name */
    public final String f3720k;

    /* renamed from: l  reason: collision with root package name */
    public final String f3721l;

    public static final class a {
        public static final C0127a a = new C0127a(null);
        public String b;

        /* renamed from: c  reason: collision with root package name */
        public String f3722c = "";

        /* renamed from: d  reason: collision with root package name */
        public String f3723d = "";
        public String e;

        /* renamed from: f  reason: collision with root package name */
        public int f3724f = -1;

        /* renamed from: g  reason: collision with root package name */
        public final List<String> f3725g;

        /* renamed from: h  reason: collision with root package name */
        public List<String> f3726h;

        /* renamed from: i  reason: collision with root package name */
        public String f3727i;

        /* renamed from: j.y$a$a  reason: collision with other inner class name */
        public static final class C0127a {
            public C0127a(f fVar) {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f3725g = arrayList;
            arrayList.add("");
        }

        public final y a() {
            ArrayList arrayList;
            String str = this.b;
            if (str != null) {
                b bVar = y.b;
                String d2 = b.d(bVar, this.f3722c, 0, 0, false, 7);
                String d3 = b.d(bVar, this.f3723d, 0, 0, false, 7);
                String str2 = this.e;
                if (str2 != null) {
                    int b2 = b();
                    List<String> list = this.f3725g;
                    ArrayList arrayList2 = new ArrayList(h.a.t.a.l(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(b.d(y.b, it.next(), 0, 0, false, 7));
                    }
                    List<String> list2 = this.f3726h;
                    if (list2 != null) {
                        arrayList = new ArrayList(h.a.t.a.l(list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            T next = it2.next();
                            arrayList.add(next != null ? b.d(y.b, next, 0, 0, true, 3) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str3 = this.f3727i;
                    return new y(str, d2, d3, str2, b2, arrayList2, arrayList, str3 != null ? b.d(y.b, str3, 0, 0, false, 7) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final int b() {
            int i2 = this.f3724f;
            if (i2 != -1) {
                return i2;
            }
            String str = this.b;
            if (str != null) {
                h.f(str, "scheme");
                int hashCode = str.hashCode();
                if (hashCode != 3213448) {
                    if (hashCode == 99617003 && str.equals("https")) {
                        return 443;
                    }
                } else if (str.equals("http")) {
                    return 80;
                }
                return -1;
            }
            h.j();
            throw null;
        }

        public final a c(String str) {
            List<String> list;
            if (str != null) {
                b bVar = y.b;
                list = bVar.e(b.a(bVar, str, 0, 0, " \"'<>#", true, false, true, false, null, 211));
            } else {
                list = null;
            }
            this.f3726h = list;
            return this;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:217:0x0306 */
        /* JADX WARN: Type inference failed for: r7v4, types: [int, boolean] */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v41 */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
            */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x0309  */
        /* JADX WARNING: Removed duplicated region for block: B:216:0x03cf A[SYNTHETIC] */
        public final j.y.a d(j.y r26, java.lang.String r27) {
            /*
            // Method dump skipped, instructions count: 1110
            */
            throw new UnsupportedOperationException("Method not decompiled: j.y.a.d(j.y, java.lang.String):j.y$a");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
            if ((r10.f3723d.length() > 0) != false) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b4, code lost:
            if (r1 != r6) goto L_0x00bb;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
            // Method dump skipped, instructions count: 341
            */
            throw new UnsupportedOperationException("Method not decompiled: j.y.a.toString():java.lang.String");
        }
    }

    public static final class b {
        public b(f fVar) {
        }

        public static String a(b bVar, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i4) {
            boolean z5;
            int i5 = (i4 & 1) != 0 ? 0 : i2;
            int length = (i4 & 2) != 0 ? str.length() : i3;
            boolean z6 = (i4 & 8) != 0 ? false : z;
            boolean z7 = (i4 & 16) != 0 ? false : z2;
            boolean z8 = (i4 & 32) != 0 ? false : z3;
            boolean z9 = (i4 & 64) != 0 ? false : z4;
            Charset charset2 = (i4 & 128) != 0 ? null : charset;
            h.f(str, "$this$canonicalize");
            h.f(str2, "encodeSet");
            int i6 = i5;
            while (i6 < length) {
                int codePointAt = str.codePointAt(i6);
                int i7 = 2;
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z9) || e.a(str2, (char) codePointAt, false, 2) || ((codePointAt == 37 && (!z6 || (z7 && !bVar.c(str, i6, length)))) || (codePointAt == 43 && z8)))) {
                    k.e eVar = new k.e();
                    eVar.x0(str, i5, i6);
                    k.e eVar2 = null;
                    while (i6 < length) {
                        int codePointAt2 = str.codePointAt(i6);
                        if (!z6 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 != 43 || !z8) {
                                if (codePointAt2 < 32 || codePointAt2 == 127 || (codePointAt2 >= 128 && !z9)) {
                                    z5 = z8;
                                } else {
                                    z5 = z8;
                                    if (!e.a(str2, (char) codePointAt2, false, i7) && (codePointAt2 != 37 || (z6 && (!z7 || bVar.c(str, i6, length))))) {
                                        eVar.y0(codePointAt2);
                                        i6 += Character.charCount(codePointAt2);
                                        i7 = 2;
                                        z8 = z5;
                                    }
                                }
                                if (eVar2 == null) {
                                    eVar2 = new k.e();
                                }
                                if (charset2 == null || h.a(charset2, StandardCharsets.UTF_8)) {
                                    eVar2.y0(codePointAt2);
                                } else {
                                    int charCount = Character.charCount(codePointAt2) + i6;
                                    h.f(str, "string");
                                    h.f(charset2, "charset");
                                    boolean z10 = true;
                                    if (i6 >= 0) {
                                        if (charCount >= i6) {
                                            if (charCount > str.length()) {
                                                z10 = false;
                                            }
                                            if (!z10) {
                                                StringBuilder g2 = c.c.a.a.a.g("endIndex > string.length: ", charCount, " > ");
                                                g2.append(str.length());
                                                throw new IllegalArgumentException(g2.toString().toString());
                                            } else if (h.a(charset2, i.x.a.a)) {
                                                eVar2.x0(str, i6, charCount);
                                            } else {
                                                String substring = str.substring(i6, charCount);
                                                h.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                                byte[] bytes = substring.getBytes(charset2);
                                                h.b(bytes, "(this as java.lang.String).getBytes(charset)");
                                                eVar2.p0(bytes, 0, bytes.length);
                                            }
                                        } else {
                                            throw new IllegalArgumentException(c.c.a.a.a.m("endIndex < beginIndex: ", charCount, " < ", i6).toString());
                                        }
                                    } else {
                                        throw new IllegalArgumentException(c.c.a.a.a.l("beginIndex < 0: ", i6).toString());
                                    }
                                }
                                while (!eVar2.R()) {
                                    int readByte = eVar2.readByte() & 255;
                                    eVar.r0(37);
                                    char[] cArr = y.a;
                                    eVar.r0(cArr[(readByte >> 4) & 15]);
                                    eVar.r0(cArr[readByte & 15]);
                                }
                                i6 += Character.charCount(codePointAt2);
                                i7 = 2;
                                z8 = z5;
                            } else {
                                eVar.w0(z6 ? "+" : "%2B");
                            }
                        }
                        z5 = z8;
                        i6 += Character.charCount(codePointAt2);
                        i7 = 2;
                        z8 = z5;
                    }
                    return eVar.j0();
                }
                i6 += Character.charCount(codePointAt);
            }
            String substring2 = str.substring(i5, length);
            h.b(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring2;
        }

        public static String d(b bVar, String str, int i2, int i3, boolean z, int i4) {
            int i5;
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = str.length();
            }
            if ((i4 & 4) != 0) {
                z = false;
            }
            h.f(str, "$this$percentDecode");
            int i6 = i2;
            while (i6 < i3) {
                char charAt = str.charAt(i6);
                if (charAt == '%' || (charAt == '+' && z)) {
                    k.e eVar = new k.e();
                    eVar.x0(str, i2, i6);
                    while (i6 < i3) {
                        int codePointAt = str.codePointAt(i6);
                        if (codePointAt == 37 && (i5 = i6 + 2) < i3) {
                            int p = c.p(str.charAt(i6 + 1));
                            int p2 = c.p(str.charAt(i5));
                            if (!(p == -1 || p2 == -1)) {
                                eVar.r0((p << 4) + p2);
                                i6 = Character.charCount(codePointAt) + i5;
                            }
                        } else if (codePointAt == 43 && z) {
                            eVar.r0(32);
                            i6++;
                        }
                        eVar.y0(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    }
                    return eVar.j0();
                }
                i6++;
            }
            String substring = str.substring(i2, i3);
            h.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final int b(String str) {
            h.f(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final boolean c(String str, int i2, int i3) {
            int i4 = i2 + 2;
            return i4 < i3 && str.charAt(i2) == '%' && c.p(str.charAt(i2 + 1)) != -1 && c.p(str.charAt(i4)) != -1;
        }

        public final List<String> e(String str) {
            String str2;
            h.f(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 <= str.length()) {
                int i3 = e.i(str, '&', i2, false, 4);
                if (i3 == -1) {
                    i3 = str.length();
                }
                int i4 = e.i(str, '=', i2, false, 4);
                if (i4 == -1 || i4 > i3) {
                    String substring = str.substring(i2, i3);
                    h.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    str2 = null;
                } else {
                    String substring2 = str.substring(i2, i4);
                    h.b(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    str2 = str.substring(i4 + 1, i3);
                    h.b(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(str2);
                i2 = i3 + 1;
            }
            return arrayList;
        }
    }

    public y(String str, String str2, String str3, String str4, int i2, List<String> list, List<String> list2, String str5, String str6) {
        h.f(str, "scheme");
        h.f(str2, "username");
        h.f(str3, "password");
        h.f(str4, "host");
        h.f(list, "pathSegments");
        h.f(str6, "url");
        this.f3714d = str;
        this.e = str2;
        this.f3715f = str3;
        this.f3716g = str4;
        this.f3717h = i2;
        this.f3718i = list;
        this.f3719j = list2;
        this.f3720k = str5;
        this.f3721l = str6;
        this.f3713c = h.a(str, "https");
    }

    public final String a() {
        if (this.f3715f.length() == 0) {
            return "";
        }
        int i2 = e.i(this.f3721l, ':', this.f3714d.length() + 3, false, 4) + 1;
        int i3 = e.i(this.f3721l, '@', 0, false, 6);
        String str = this.f3721l;
        if (str != null) {
            String substring = str.substring(i2, i3);
            h.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new j("null cannot be cast to non-null type java.lang.String");
    }

    public final String b() {
        int i2 = e.i(this.f3721l, '/', this.f3714d.length() + 3, false, 4);
        String str = this.f3721l;
        int f2 = c.f(str, "?#", i2, str.length());
        String str2 = this.f3721l;
        if (str2 != null) {
            String substring = str2.substring(i2, f2);
            h.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new j("null cannot be cast to non-null type java.lang.String");
    }

    public final List<String> c() {
        int i2 = e.i(this.f3721l, '/', this.f3714d.length() + 3, false, 4);
        String str = this.f3721l;
        int f2 = c.f(str, "?#", i2, str.length());
        ArrayList arrayList = new ArrayList();
        while (i2 < f2) {
            int i3 = i2 + 1;
            int e2 = c.e(this.f3721l, '/', i3, f2);
            String str2 = this.f3721l;
            if (str2 != null) {
                String substring = str2.substring(i3, e2);
                h.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
                i2 = e2;
            } else {
                throw new j("null cannot be cast to non-null type java.lang.String");
            }
        }
        return arrayList;
    }

    public final String d() {
        if (this.f3719j == null) {
            return null;
        }
        int i2 = e.i(this.f3721l, '?', 0, false, 6) + 1;
        String str = this.f3721l;
        int e2 = c.e(str, '#', i2, str.length());
        String str2 = this.f3721l;
        if (str2 != null) {
            String substring = str2.substring(i2, e2);
            h.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new j("null cannot be cast to non-null type java.lang.String");
    }

    public final String e() {
        if (this.e.length() == 0) {
            return "";
        }
        int length = this.f3714d.length() + 3;
        String str = this.f3721l;
        int f2 = c.f(str, ":@", length, str.length());
        String str2 = this.f3721l;
        if (str2 != null) {
            String substring = str2.substring(length, f2);
            h.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new j("null cannot be cast to non-null type java.lang.String");
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && h.a(((y) obj).f3721l, this.f3721l);
    }

    public final a f(String str) {
        h.f(str, "link");
        try {
            a aVar = new a();
            aVar.d(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String g() {
        a f2 = f("/...");
        if (f2 != null) {
            Objects.requireNonNull(f2);
            h.f("", "username");
            b bVar = b;
            f2.f3722c = b.a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
            h.f("", "password");
            f2.f3723d = b.a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
            return f2.a().f3721l;
        }
        h.j();
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cf A[LOOP:0: B:24:0x00cd->B:25:0x00cf, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.URI h() {
        /*
        // Method dump skipped, instructions count: 393
        */
        throw new UnsupportedOperationException("Method not decompiled: j.y.h():java.net.URI");
    }

    public int hashCode() {
        return this.f3721l.hashCode();
    }

    public String toString() {
        return this.f3721l;
    }
}
