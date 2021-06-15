package okhttp3.internal.publicsuffix;

import i.s.c.f;
import i.s.c.h;
import i.x.e;
import j.n0.c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PublicSuffixDatabase {
    public static final byte[] a = {(byte) 42};
    public static final List<String> b = h.a.t.a.G("*");

    /* renamed from: c  reason: collision with root package name */
    public static final PublicSuffixDatabase f3898c = new PublicSuffixDatabase();

    /* renamed from: d  reason: collision with root package name */
    public static final a f3899d = new a(null);
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final CountDownLatch f3900f = new CountDownLatch(1);

    /* renamed from: g  reason: collision with root package name */
    public byte[] f3901g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f3902h;

    public static final class a {
        public a(f fVar) {
        }

        public static final String a(a aVar, byte[] bArr, byte[][] bArr2, int i2) {
            int i3;
            boolean z;
            int i4;
            int i5;
            int length = bArr.length;
            int i6 = 0;
            while (i6 < length) {
                int i7 = (i6 + length) / 2;
                while (i7 > -1 && bArr[i7] != ((byte) 10)) {
                    i7--;
                }
                int i8 = i7 + 1;
                int i9 = 1;
                while (true) {
                    i3 = i8 + i9;
                    if (bArr[i3] == ((byte) 10)) {
                        break;
                    }
                    i9++;
                }
                int i10 = i3 - i8;
                int i11 = i2;
                boolean z2 = false;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (z2) {
                        i4 = 46;
                        z = false;
                    } else {
                        byte b = bArr2[i11][i12];
                        byte[] bArr3 = c.a;
                        int i14 = b & 255;
                        z = z2;
                        i4 = i14;
                    }
                    byte b2 = bArr[i8 + i13];
                    byte[] bArr4 = c.a;
                    i5 = i4 - (b2 & 255);
                    if (i5 != 0) {
                        break;
                    }
                    i13++;
                    i12++;
                    if (i13 == i10) {
                        break;
                    } else if (bArr2[i11].length != i12) {
                        z2 = z;
                    } else if (i11 == bArr2.length - 1) {
                        break;
                    } else {
                        i11++;
                        i12 = -1;
                        z2 = true;
                    }
                }
                if (i5 >= 0) {
                    if (i5 <= 0) {
                        int i15 = i10 - i13;
                        int length2 = bArr2[i11].length - i12;
                        int length3 = bArr2.length;
                        for (int i16 = i11 + 1; i16 < length3; i16++) {
                            length2 += bArr2[i16].length;
                        }
                        if (length2 >= i15) {
                            if (length2 <= i15) {
                                Charset charset = StandardCharsets.UTF_8;
                                h.b(charset, "UTF_8");
                                return new String(bArr, i8, i10, charset);
                            }
                        }
                    }
                    i6 = i3 + 1;
                }
                length = i8 - 1;
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 560
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        h.a.t.a.k(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r4 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x0061
            k.m r1 = new k.m
            java.lang.String r2 = "$this$source"
            i.s.c.h.f(r0, r2)
            k.o r2 = new k.o
            k.a0 r3 = new k.a0
            r3.<init>()
            r2.<init>(r0, r3)
            r1.<init>(r2)
            java.lang.String r0 = "$this$buffer"
            i.s.c.h.f(r1, r0)
            k.t r0 = new k.t
            r0.<init>(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x005a }
            long r1 = (long) r1     // Catch:{ all -> 0x005a }
            byte[] r1 = r0.W(r1)     // Catch:{ all -> 0x005a }
            int r2 = r0.readInt()     // Catch:{ all -> 0x005a }
            long r2 = (long) r2     // Catch:{ all -> 0x005a }
            byte[] r2 = r0.W(r2)     // Catch:{ all -> 0x005a }
            r3 = 0
            h.a.t.a.k(r0, r3)
            monitor-enter(r4)
            if (r1 == 0) goto L_0x0054
            r4.f3901g = r1     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x004e
            r4.f3902h = r2     // Catch:{ all -> 0x0052 }
            monitor-exit(r4)
            java.util.concurrent.CountDownLatch r0 = r4.f3900f
            r0.countDown()
            return
        L_0x004e:
            i.s.c.h.j()
            throw r3
        L_0x0052:
            r0 = move-exception
            goto L_0x0058
        L_0x0054:
            i.s.c.h.j()
            throw r3
        L_0x0058:
            monitor-exit(r4)
            throw r0
        L_0x005a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005c }
        L_0x005c:
            r2 = move-exception
            h.a.t.a.k(r0, r1)
            throw r2
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b():void");
    }

    public final List<String> c(String str) {
        int i2 = 0;
        List<String> r = e.r(str, new char[]{'.'}, false, 0, 6);
        h.e(r, "$this$last");
        if (!r.isEmpty()) {
            h.e(r, "$this$lastIndex");
            if (!h.a(r.get(r.size() - 1), "")) {
                return r;
            }
            h.e(r, "$this$dropLast");
            int size = r.size() - 1;
            if (size < 0) {
                size = 0;
            }
            h.e(r, "$this$take");
            if (!(size >= 0)) {
                throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
            } else if (size == 0) {
                return i.o.h.e;
            } else {
                if (size >= r.size()) {
                    return i.o.e.o(r);
                }
                if (size == 1) {
                    h.e(r, "$this$first");
                    return h.a.t.a.G(i.o.e.f(r));
                }
                ArrayList arrayList = new ArrayList(size);
                Iterator<T> it = r.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                    i2++;
                    if (i2 == size) {
                        break;
                    }
                }
                return i.o.e.j(arrayList);
            }
        } else {
            throw new NoSuchElementException("List is empty.");
        }
    }
}
