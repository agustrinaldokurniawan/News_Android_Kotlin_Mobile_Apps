package h.a.t;

import android.os.Bundle;
import d.a.a.p;
import d.a.l0;
import d.a.w;
import d.a.y;
import g.n.t;
import g.n.u;
import i.c;
import i.d;
import i.g;
import i.i;
import i.m;
import i.n;
import i.q.e;
import i.q.f;
import i.s.b.l;
import i.s.c.h;
import i.x.e;
import i.y.b;
import j.n0.f.d;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import k.a0;
import k.o;
import k.q;
import k.x;
import k.z;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class a {
    public static /* synthetic */ y A(l0 l0Var, boolean z, boolean z2, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return l0Var.e(z, z2, lVar);
    }

    public static final boolean B(AssertionError assertionError) {
        h.f(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? e.b(message, "getsockname failed", false, 2) : false;
    }

    public static final boolean C(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static final boolean D(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static final <T> c<T> E(d dVar, i.s.b.a<? extends T> aVar) {
        h.e(dVar, "mode");
        h.e(aVar, "initializer");
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            return new i(aVar, null, 2);
        }
        if (ordinal == 1) {
            return new i.h(aVar);
        }
        if (ordinal == 2) {
            return new n(aVar);
        }
        throw new i.e();
    }

    public static final <T> c<T> F(i.s.b.a<? extends T> aVar) {
        h.e(aVar, "initializer");
        return new i(aVar, null, 2);
    }

    public static final <T> List<T> G(T t) {
        List<T> singletonList = Collections.singletonList(t);
        h.d(singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    public static final int H(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((((float) i2) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final double I(i.s.b.a<m> aVar) {
        h.e(aVar, "code");
        i.y.d a = i.y.e.a.a();
        aVar.c();
        return b.e(a.a(), TimeUnit.MILLISECONDS);
    }

    public static final int J(int i2, int i3) {
        int i4 = i2 % i3;
        return i4 >= 0 ? i4 : i4 + i3;
    }

    public static l.a.c.j.a K(boolean z, boolean z2, l lVar, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        h.e(lVar, "moduleDeclaration");
        l.a.c.j.a aVar = new l.a.c.j.a(z, z2);
        lVar.o(aVar);
        return aVar;
    }

    public static final int L(i.t.c cVar, i.u.c cVar2) {
        h.e(cVar, "$this$nextInt");
        h.e(cVar2, "range");
        if (!cVar2.isEmpty()) {
            int i2 = cVar2.f3320f;
            if (i2 < Integer.MAX_VALUE) {
                return cVar.c(cVar2.e, i2 + 1);
            }
            int i3 = cVar2.e;
            return i3 > Integer.MIN_VALUE ? cVar.c(i3 - 1, i2) + 1 : cVar.b();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + cVar2);
    }

    public static void M(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else {
            boolean z = true;
            if (!(th instanceof h.a.q.c) && !(th instanceof h.a.q.b) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof h.a.q.a)) {
                z = false;
            }
            if (!z) {
                th = new h.a.q.e(th);
            }
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static final <T> void N(w<? super T> wVar, i.q.d<? super T> dVar, boolean z) {
        Object h2 = wVar.h();
        Throwable e = wVar.e(h2);
        Object n = e != null ? n(e) : wVar.f(h2);
        if (z) {
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
            d.a.a.e eVar = (d.a.a.e) dVar;
            f d2 = eVar.d();
            Object b = d.a.a.a.b(d2, eVar.f1759k);
            try {
                eVar.f1761m.a(n);
            } finally {
                d.a.a.a.a(d2, b);
            }
        } else {
            dVar.a(n);
        }
    }

    public static final int O(k.w wVar, int i2) {
        int i3;
        h.f(wVar, "$this$segment");
        int[] iArr = wVar.f3770k;
        int i4 = i2 + 1;
        int length = wVar.f3769j.length;
        h.f(iArr, "$this$binarySearch");
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static final void P(l.a.c.f.a<?> aVar) {
        h.e(aVar, "<this>");
        l.a.c.f.d dVar = aVar.f3790h;
        Boolean bool = Boolean.TRUE;
        Objects.requireNonNull(dVar);
        h.e("isViewModel", "key");
        Map<String, Object> map = dVar.a;
        Objects.requireNonNull(bool, "null cannot be cast to non-null type kotlin.Any");
        map.put("isViewModel", bool);
    }

    public static final char Q(char[] cArr) {
        h.e(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static final x R(Socket socket) {
        h.f(socket, "$this$sink");
        k.y yVar = new k.y(socket);
        OutputStream outputStream = socket.getOutputStream();
        h.b(outputStream, "getOutputStream()");
        q qVar = new q(outputStream, yVar);
        h.f(qVar, "sink");
        return new k.c(yVar, qVar);
    }

    public static final z S(InputStream inputStream) {
        h.f(inputStream, "$this$source");
        return new o(inputStream, new a0());
    }

    public static final z T(Socket socket) {
        h.f(socket, "$this$source");
        k.y yVar = new k.y(socket);
        InputStream inputStream = socket.getInputStream();
        h.b(inputStream, "getInputStream()");
        o oVar = new o(inputStream, yVar);
        h.f(oVar, "source");
        return new k.d(yVar, oVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object U(java.lang.Exception r4, i.q.d<?> r5) {
        /*
            boolean r0 = r5 instanceof m.r
            if (r0 == 0) goto L_0x0013
            r0 = r5
            m.r r0 = (m.r) r0
            int r1 = r0.f3842i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3842i = r1
            goto L_0x0018
        L_0x0013:
            m.r r0 = new m.r
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f3841h
            i.q.i.a r1 = i.q.i.a.e
            int r2 = r0.f3842i
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.f3843j
            java.lang.Exception r4 = (java.lang.Exception) r4
            boolean r4 = r5 instanceof i.g.a
            if (r4 != 0) goto L_0x002e
            i.m r4 = i.m.a
            return r4
        L_0x002e:
            i.g$a r5 = (i.g.a) r5
            java.lang.Throwable r4 = r5.e
            throw r4
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            boolean r2 = r5 instanceof i.g.a
            if (r2 != 0) goto L_0x0058
            r0.f3843j = r4
            r0.f3842i = r3
            d.a.s r5 = d.a.x.a
            i.q.f r2 = r0.f3306g
            i.s.c.h.c(r2)
            m.q r3 = new m.q
            r3.<init>(r0, r4)
            r5.d0(r2, r3)
            java.lang.String r4 = "frame"
            i.s.c.h.e(r0, r4)
            return r1
        L_0x0058:
            i.g$a r5 = (i.g.a) r5
            java.lang.Throwable r4 = r5.e
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.t.a.U(java.lang.Exception, i.q.d):java.lang.Object");
    }

    public static final long V(String str, long j2, long j3, long j4) {
        Long l2;
        String W = W(str);
        if (W == null) {
            return j2;
        }
        h.e(W, "$this$toLongOrNull");
        h.e(W, "$this$toLongOrNull");
        j(10);
        int length = W.length();
        if (length != 0) {
            int i2 = 0;
            char charAt = W.charAt(0);
            boolean z = true;
            long j5 = -9223372036854775807L;
            if ((charAt < '0' ? 65535 : charAt == '0' ? (char) 0 : 1) >= 0) {
                z = false;
            } else if (length != 1) {
                if (charAt == '-') {
                    j5 = Long.MIN_VALUE;
                    i2 = 1;
                } else if (charAt == '+') {
                    z = false;
                    i2 = 1;
                }
            }
            long j6 = 0;
            long j7 = -256204778801521550L;
            while (true) {
                if (i2 < length) {
                    int digit = Character.digit((int) W.charAt(i2), 10);
                    if (digit < 0) {
                        break;
                    }
                    if (j6 < j7) {
                        if (j7 != -256204778801521550L) {
                            break;
                        }
                        j7 = j5 / ((long) 10);
                        if (j6 < j7) {
                            break;
                        }
                    }
                    long j8 = j6 * ((long) 10);
                    long j9 = (long) digit;
                    if (j8 < j5 + j9) {
                        break;
                    }
                    j6 = j8 - j9;
                    i2++;
                } else {
                    l2 = z ? Long.valueOf(j6) : Long.valueOf(-j6);
                }
            }
        }
        l2 = null;
        if (l2 != null) {
            long longValue = l2.longValue();
            if (j3 <= longValue && j4 >= longValue) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + W + '\'').toString());
    }

    public static final String W(String str) {
        int i2 = p.a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static int X(String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) V(str, (long) i2, (long) i3, (long) i4);
    }

    public static /* synthetic */ long Y(String str, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = 1;
        }
        if ((i2 & 8) != 0) {
            j4 = Long.MAX_VALUE;
        }
        return V(str, j2, j3, j4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0106, code lost:
        r1 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String Z(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.t.a.Z(java.lang.String):java.lang.String");
    }

    public static final void a(j.n0.f.a aVar, j.n0.f.c cVar, String str) {
        d.b bVar = j.n0.f.d.f3478c;
        Logger logger = j.n0.f.d.b;
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f3477f);
        sb.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        h.b(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.f3473c);
        logger.fine(sb.toString());
    }

    public static final String a0(i.q.d<?> dVar) {
        Object obj;
        if (dVar instanceof d.a.a.e) {
            return dVar.toString();
        }
        try {
            obj = dVar + '@' + u(dVar);
        } catch (Throwable th) {
            obj = n(th);
        }
        if (g.a(obj) != null) {
            obj = dVar.getClass().getName() + '@' + u(dVar);
        }
        return (String) obj;
    }

    public static final <T> boolean b(Collection<? super T> collection, Iterable<? extends T> iterable) {
        h.e(collection, "$this$addAll");
        h.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((Object) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> List<T> b0(i.w.e<? extends T> eVar) {
        h.e(eVar, "$this$toList");
        h.e(eVar, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        h.e(eVar, "$this$toCollection");
        h.e(arrayList, "destination");
        Iterator<? extends T> it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return i.o.e.j(arrayList);
    }

    public static final void c(HashSet<l.a.c.f.a<?>> hashSet, l.a.c.f.a<?> aVar) {
        h.e(hashSet, "<this>");
        h.e(aVar, "bean");
        boolean add = hashSet.add(aVar);
        if (!add && !aVar.f3789g.b) {
            throw new l.a.c.g.b("Definition '" + aVar + "' try to override existing definition. Please use override option to fix it");
        } else if (!add && aVar.f3789g.b) {
            hashSet.remove(aVar);
            hashSet.add(aVar);
        }
    }

    public static final <K, V> Map<K, V> c0(Map<? extends K, ? extends V> map) {
        h.e(map, "$this$toSingletonMap");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        h.d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static final void d(Throwable th, Throwable th2) {
        h.e(th, "$this$addSuppressed");
        h.e(th2, "exception");
        if (th != th2) {
            i.r.b.a.a(th, th2);
        }
    }

    public static final <T> void e(Appendable appendable, T t, l<? super T, ? extends CharSequence> lVar) {
        T t2;
        h.e(appendable, "$this$appendElement");
        if (lVar != null) {
            t = (T) lVar.o(t);
        } else {
            if (!(t != null ? t instanceof CharSequence : true)) {
                if (t instanceof Character) {
                    appendable.append(t.charValue());
                    return;
                }
                t2 = String.valueOf(t);
                appendable.append(t2);
            }
        }
        t2 = t;
        appendable.append(t2);
    }

    public static final boolean f(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        h.f(bArr, "a");
        h.f(bArr2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final <T> i.w.e<T> g(Iterator<? extends T> it) {
        h.e(it, "$this$asSequence");
        i.w.f fVar = new i.w.f(it);
        h.e(fVar, "$this$constrainOnce");
        return fVar instanceof i.w.a ? fVar : new i.w.a(fVar);
    }

    public static h.a.m h(Callable<h.a.m> callable) {
        try {
            h.a.m call = callable.call();
            Objects.requireNonNull(call, "Scheduler Callable result can't be null");
            return call;
        } catch (Throwable th) {
            throw h.a.s.j.b.b(th);
        }
    }

    public static final void i(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static final int j(int i2) {
        if (2 <= i2 && 36 >= i2) {
            return i2;
        }
        StringBuilder g2 = c.c.a.a.a.g("radix ", i2, " was not in valid range ");
        g2.append(new i.u.c(2, 36));
        throw new IllegalArgumentException(g2.toString());
    }

    public static final void k(Closeable closeable, Throwable th) {
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            d(th, th2);
        }
    }

    public static final <T> int l(Iterable<? extends T> iterable, int i2) {
        h.e(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }

    public static final <T extends Comparable<?>> int m(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static final Object n(Throwable th) {
        h.e(th, "exception");
        return new g.a(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d8, code lost:
        if (r7 == r0) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00db, code lost:
        if (r8 != -1) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00dd, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00de, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f1, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.net.InetAddress o(java.lang.String r16, int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.t.a.o(java.lang.String, int, int):java.net.InetAddress");
    }

    public static final long p(long j2) {
        long j3 = (j2 << 1) + 1;
        b.b(j3);
        return j3;
    }

    public static final long q(long j2) {
        long j3 = j2 << 1;
        b.b(j3);
        return j3;
    }

    public static final boolean r(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final String s(long j2) {
        StringBuilder sb;
        long j3;
        long j4;
        long j5;
        if (j2 <= ((long) -999500000)) {
            sb = new StringBuilder();
            j3 = j2 - ((long) 500000000);
        } else {
            if (j2 <= ((long) -999500)) {
                sb = new StringBuilder();
                j4 = j2 - ((long) 500000);
            } else {
                if (j2 <= 0) {
                    sb = new StringBuilder();
                    j5 = j2 - ((long) 500);
                } else if (j2 < ((long) 999500)) {
                    sb = new StringBuilder();
                    j5 = j2 + ((long) 500);
                } else if (j2 < ((long) 999500000)) {
                    sb = new StringBuilder();
                    j4 = j2 + ((long) 500000);
                } else {
                    sb = new StringBuilder();
                    j3 = j2 + ((long) 500000000);
                }
                sb.append(j5 / ((long) 1000));
                sb.append(" µs");
                String format = String.format("%6s", Arrays.copyOf(new Object[]{sb.toString()}, 1));
                h.b(format, "java.lang.String.format(format, *args)");
                return format;
            }
            sb.append(j4 / ((long) 1000000));
            sb.append(" ms");
            String format2 = String.format("%6s", Arrays.copyOf(new Object[]{sb.toString()}, 1));
            h.b(format2, "java.lang.String.format(format, *args)");
            return format2;
        }
        sb.append(j3 / ((long) 1000000000));
        sb.append(" s ");
        String format22 = String.format("%6s", Arrays.copyOf(new Object[]{sb.toString()}, 1));
        h.b(format22, "java.lang.String.format(format, *args)");
        return format22;
    }

    public static final String t(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String u(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final <T> Class<T> v(i.v.b<T> bVar) {
        h.e(bVar, "$this$javaObjectType");
        Class<T> cls = (Class<T>) ((i.s.c.c) bVar).a();
        if (!cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : cls;
            case 104431:
                return name.equals("int") ? Integer.class : cls;
            case 3039496:
                return name.equals("byte") ? Byte.class : cls;
            case 3052374:
                return name.equals("char") ? Character.class : cls;
            case 3327612:
                return name.equals("long") ? Long.class : cls;
            case 3625364:
                return name.equals("void") ? Void.class : cls;
            case 64711720:
                return name.equals("boolean") ? Boolean.class : cls;
            case 97526364:
                return name.equals("float") ? Float.class : cls;
            case 109413500:
                return name.equals("short") ? Short.class : cls;
            default:
                return cls;
        }
    }

    public static final <T extends t> T w(g.l.b.m mVar, l.a.c.l.a aVar, i.s.b.a<Bundle> aVar2, i.s.b.a<l.a.b.a.a> aVar3, i.v.b<T> bVar, i.s.b.a<? extends l.a.c.k.a> aVar4) {
        l.a.c.a aVar5;
        String str;
        T t;
        h.e(mVar, "<this>");
        h.e(aVar3, "owner");
        h.e(bVar, "clazz");
        h.e(mVar, "<this>");
        if (mVar instanceof l.a.c.d.a) {
            aVar5 = ((l.a.c.d.a) mVar).a();
        } else {
            aVar5 = l.a.c.e.a.b;
            if (aVar5 == null) {
                throw new IllegalStateException("KoinApplication has not been started".toString());
            }
        }
        h.e(aVar5, "<this>");
        h.e(aVar3, "owner");
        h.e(bVar, "clazz");
        l.a.c.n.a aVar6 = aVar5.a.e;
        if (aVar6 != null) {
            h.e(aVar6, "<this>");
            h.e(aVar3, "owner");
            h.e(bVar, "clazz");
            l.a.b.a.a c2 = aVar3.c();
            l.a.b.a.b bVar2 = new l.a.b.a.b(bVar, null, null, null, c2.a, c2.b);
            h.e(aVar6, "<this>");
            h.e(bVar2, "viewModelParameters");
            h.e(aVar6, "<this>");
            h.e(bVar2, "viewModelParameters");
            u uVar = new u(bVar2.e, (bVar2.f3778f == null || bVar2.f3777d == null) ? new l.a.b.a.c.a(aVar6, bVar2) : new l.a.b.a.c.c(aVar6, bVar2));
            h.e(uVar, "<this>");
            h.e(bVar2, "viewModelParameters");
            i.v.b<T> bVar3 = bVar2.a;
            h.e(bVar3, "$this$java");
            Class<?> a = ((i.s.c.c) bVar3).a();
            Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.Class<T>");
            l.a.c.l.a aVar7 = bVar2.b;
            h.e(uVar, "<this>");
            h.e(bVar2, "viewModelParameters");
            h.e(a, "javaClass");
            if (bVar2.b != null) {
                t = (T) uVar.b(String.valueOf(aVar7), a);
                str = "{\n        get(qualifier.toString(), javaClass)\n    }";
            } else {
                t = (T) uVar.a(a);
                str = "{\n        get(javaClass)\n    }";
            }
            h.d(t, str);
            return t;
        }
        throw new IllegalStateException("No root scope".toString());
    }

    public static final void x(f fVar, Throwable th) {
        try {
            int i2 = CoroutineExceptionHandler.f3773c;
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) fVar.get(CoroutineExceptionHandler.a.a);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(fVar, th);
            } else {
                d.a.t.a(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                d(runtimeException, th);
                th = runtimeException;
            }
            d.a.t.a(fVar, th);
        }
    }

    public static final String y(i.v.b<?> bVar, l.a.c.l.a aVar) {
        h.e(bVar, "clazz");
        if ((aVar == null ? null : aVar.getValue()) == null) {
            return l.a.d.a.a(bVar);
        }
        return l.a.d.a.a(bVar) + "::" + aVar.getValue();
    }

    public static final <T> i.q.d<T> z(i.q.d<? super T> dVar) {
        h.e(dVar, "$this$intercepted");
        i.q.j.a.c cVar = (i.q.j.a.c) (!(dVar instanceof i.q.j.a.c) ? null : dVar);
        if (cVar != null && (dVar = (i.q.d<T>) cVar.f3305f) == null) {
            f fVar = cVar.f3306g;
            h.c(fVar);
            int i2 = i.q.e.b;
            i.q.e eVar = (i.q.e) fVar.get(e.a.a);
            if (eVar == null || (dVar = eVar.u(cVar)) == null) {
                dVar = cVar;
            }
            cVar.f3305f = dVar;
        }
        return (i.q.d<T>) dVar;
    }
}
