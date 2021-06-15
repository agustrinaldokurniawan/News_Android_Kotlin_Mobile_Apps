package j.n0;

import i.j;
import i.s.c.h;
import j.c0;
import j.i0;
import j.j0;
import j.k0;
import j.x;
import j.y;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import k.e;
import k.i;
import k.p;
import k.z;

public final class c {
    public static final byte[] a;
    public static final x b = x.e.c(new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final j0 f3469c;

    /* renamed from: d  reason: collision with root package name */
    public static final p f3470d;
    public static final TimeZone e;

    /* renamed from: f  reason: collision with root package name */
    public static final i.x.c f3471f = new i.x.c("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: g  reason: collision with root package name */
    public static final String f3472g;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        h.f(bArr, "$this$toResponseBody");
        e eVar = new e();
        eVar.o0(bArr);
        long j2 = (long) 0;
        h.f(eVar, "$this$asResponseBody");
        f3469c = new k0(eVar, null, j2);
        h.f(bArr, "$this$toRequestBody");
        b(j2, j2, j2);
        p.a aVar = p.e;
        i.a aVar2 = i.f3739f;
        f3470d = aVar.c(aVar2.a("efbbbf"), aVar2.a("feff"), aVar2.a("fffe"), aVar2.a("0000ffff"), aVar2.a("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        if (timeZone != null) {
            e = timeZone;
            String name = c0.class.getName();
            h.b(name, "OkHttpClient::class.java.name");
            String p = i.x.e.p(name, "okhttp3.");
            h.e(p, "$this$removeSuffix");
            h.e("Client", "suffix");
            h.e(p, "$this$endsWith");
            h.e("Client", "suffix");
            if (i.x.e.c(p, "Client", false, 2)) {
                p = p.substring(0, p.length() - "Client".length());
                h.d(p, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            f3472g = p;
            return;
        }
        h.j();
        throw null;
    }

    public static final boolean a(y yVar, y yVar2) {
        h.f(yVar, "$this$canReuseConnectionFor");
        h.f(yVar2, "other");
        return h.a(yVar.f3716g, yVar2.f3716g) && yVar.f3717h == yVar2.f3717h && h.a(yVar.f3714d, yVar2.f3714d);
    }

    public static final void b(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void c(Closeable closeable) {
        h.f(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        h.f(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final int e(String str, char c2, int i2, int i3) {
        h.f(str, "$this$delimiterOffset");
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final int f(String str, String str2, int i2, int i3) {
        h.f(str, "$this$delimiterOffset");
        h.f(str2, "delimiters");
        while (i2 < i3) {
            if (i.x.e.a(str2, str.charAt(i2), false, 2)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final boolean g(z zVar, int i2, TimeUnit timeUnit) {
        h.f(zVar, "$this$discard");
        h.f(timeUnit, "timeUnit");
        try {
            return s(zVar, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String str, Object... objArr) {
        h.f(str, "format");
        h.f(objArr, "args");
        Locale locale = Locale.US;
        h.b(locale, "Locale.US");
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        h.b(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        h.f(strArr, "$this$hasIntersection");
        h.f(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long j(i0 i0Var) {
        h.f(i0Var, "$this$headersContentLength");
        String a2 = i0Var.f3412j.a("Content-Length");
        if (a2 != null) {
            h.f(a2, "$this$toLongOrDefault");
            try {
                return Long.parseLong(a2);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    @SafeVarargs
    public static final <T> List<T> k(T... tArr) {
        h.f(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(objArr, objArr.length)));
        h.b(unmodifiableList, "Collections.unmodifiable…sList(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int l(String str) {
        h.f(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static final int m(String str, int i2, int i3) {
        h.f(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final int n(String str, int i2, int i3) {
        h.f(str, "$this$indexOfLastNonAsciiWhitespace");
        int i4 = i3 - 1;
        if (i4 >= i2) {
            while (true) {
                char charAt = str.charAt(i4);
                if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                    if (i4 == i2) {
                        break;
                    }
                    i4--;
                } else {
                    return i4 + 1;
                }
            }
        }
        return i2;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        h.f(strArr, "$this$intersect");
        h.f(strArr2, "other");
        h.f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new j("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final int p(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' > c2 || 'f' < c2) {
            c3 = 'A';
            if ('A' > c2 || 'F' < c2) {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public static final int q(k.h hVar) {
        h.f(hVar, "$this$readMedium");
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public static final int r(e eVar, byte b2) {
        h.f(eVar, "$this$skipAll");
        int i2 = 0;
        while (!eVar.R() && eVar.b0(0) == b2) {
            i2++;
            eVar.readByte();
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        if (r5 == Long.MAX_VALUE) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        if (r5 != Long.MAX_VALUE) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        r11.g().a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r11.g().d(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean s(k.z r11, int r12, java.util.concurrent.TimeUnit r13) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.c.s(k.z, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final x t(List<j.n0.j.c> list) {
        h.f(list, "$this$toHeaders");
        ArrayList arrayList = new ArrayList(20);
        for (j.n0.j.c cVar : list) {
            i iVar = cVar.f3581h;
            i iVar2 = cVar.f3582i;
            String k2 = iVar.k();
            String k3 = iVar2.k();
            h.f(k2, "name");
            h.f(k3, "value");
            arrayList.add(k2);
            arrayList.add(i.x.e.y(k3).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new x((String[]) array, null);
        }
        throw new j("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String u(j.y r4, boolean r5) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.c.u(j.y, boolean):java.lang.String");
    }

    public static final <T> List<T> v(List<? extends T> list) {
        h.f(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(i.o.e.q(list));
        h.b(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int w(String str, int i2) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Integer.MAX_VALUE)) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    public static final String x(String str, int i2, int i3) {
        h.f(str, "$this$trimSubstring");
        int m2 = m(str, i2, i3);
        String substring = str.substring(m2, n(str, m2, i3));
        h.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final Throwable y(Exception exc, List<? extends Exception> list) {
        h.f(exc, "$this$withSuppressed");
        h.f(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception exc2 : list) {
            exc.addSuppressed(exc2);
        }
        return exc;
    }
}
