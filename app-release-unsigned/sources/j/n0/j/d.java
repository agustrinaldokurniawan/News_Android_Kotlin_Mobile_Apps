package j.n0.j;

import j.n0.c;
import j.n0.j.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.e;
import k.h;
import k.i;
import k.t;
import k.z;

public final class d {
    public static final c[] a;
    public static final Map<i, Integer> b;

    /* renamed from: c  reason: collision with root package name */
    public static final d f3583c = new d();

    public static final class a {
        public final List<c> a;
        public final h b;

        /* renamed from: c  reason: collision with root package name */
        public c[] f3584c;

        /* renamed from: d  reason: collision with root package name */
        public int f3585d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f3586f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3587g;

        /* renamed from: h  reason: collision with root package name */
        public int f3588h;

        public a(z zVar, int i2, int i3, int i4) {
            i3 = (i4 & 4) != 0 ? i2 : i3;
            i.s.c.h.f(zVar, "source");
            this.f3587g = i2;
            this.f3588h = i3;
            this.a = new ArrayList();
            i.s.c.h.f(zVar, "$this$buffer");
            this.b = new t(zVar);
            this.f3584c = new c[8];
            this.f3585d = 7;
        }

        public final void a() {
            c[] cVarArr = this.f3584c;
            int length = cVarArr.length;
            i.s.c.h.e(cVarArr, "$this$fill");
            Arrays.fill(cVarArr, 0, length, (Object) null);
            this.f3585d = this.f3584c.length - 1;
            this.e = 0;
            this.f3586f = 0;
        }

        public final int b(int i2) {
            return this.f3585d + 1 + i2;
        }

        public final int c(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f3584c.length;
                while (true) {
                    length--;
                    i3 = this.f3585d;
                    if (length < i3 || i2 <= 0) {
                        c[] cVarArr = this.f3584c;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i4, this.e);
                        this.f3585d += i4;
                    } else {
                        c cVar = this.f3584c[length];
                        if (cVar != null) {
                            int i5 = cVar.f3580g;
                            i2 -= i5;
                            this.f3586f -= i5;
                            this.e--;
                            i4++;
                        } else {
                            i.s.c.h.j();
                            throw null;
                        }
                    }
                }
                c[] cVarArr2 = this.f3584c;
                System.arraycopy(cVarArr2, i3 + 1, cVarArr2, i3 + 1 + i4, this.e);
                this.f3585d += i4;
            }
            return i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final k.i d(int r5) {
            /*
                r4 = this;
                r0 = 1
                if (r5 < 0) goto L_0x000d
                j.n0.j.d r1 = j.n0.j.d.f3583c
                j.n0.j.c[] r1 = j.n0.j.d.a
                int r1 = r1.length
                int r1 = r1 - r0
                if (r5 > r1) goto L_0x000d
                r1 = r0
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                if (r1 == 0) goto L_0x0017
                j.n0.j.d r0 = j.n0.j.d.f3583c
                j.n0.j.c[] r0 = j.n0.j.d.a
                r5 = r0[r5]
                goto L_0x002d
            L_0x0017:
                j.n0.j.d r1 = j.n0.j.d.f3583c
                j.n0.j.c[] r1 = j.n0.j.d.a
                int r1 = r1.length
                int r1 = r5 - r1
                int r1 = r4.b(r1)
                if (r1 < 0) goto L_0x0035
                j.n0.j.c[] r2 = r4.f3584c
                int r3 = r2.length
                if (r1 >= r3) goto L_0x0035
                r5 = r2[r1]
                if (r5 == 0) goto L_0x0030
            L_0x002d:
                k.i r5 = r5.f3581h
                return r5
            L_0x0030:
                i.s.c.h.j()
                r5 = 0
                throw r5
            L_0x0035:
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "Header index too large "
                java.lang.StringBuilder r2 = c.c.a.a.a.f(r2)
                int r5 = r5 + r0
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: j.n0.j.d.a.d(int):k.i");
        }

        public final void e(int i2, c cVar) {
            this.a.add(cVar);
            int i3 = cVar.f3580g;
            if (i2 != -1) {
                c cVar2 = this.f3584c[this.f3585d + 1 + i2];
                if (cVar2 != null) {
                    i3 -= cVar2.f3580g;
                } else {
                    i.s.c.h.j();
                    throw null;
                }
            }
            int i4 = this.f3588h;
            if (i3 > i4) {
                a();
                return;
            }
            int c2 = c((this.f3586f + i3) - i4);
            if (i2 == -1) {
                int i5 = this.e + 1;
                c[] cVarArr = this.f3584c;
                if (i5 > cVarArr.length) {
                    c[] cVarArr2 = new c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f3585d = this.f3584c.length - 1;
                    this.f3584c = cVarArr2;
                }
                int i6 = this.f3585d;
                this.f3585d = i6 - 1;
                this.f3584c[i6] = cVar;
                this.e++;
            } else {
                this.f3584c[this.f3585d + 1 + i2 + c2 + i2] = cVar;
            }
            this.f3586f += i3;
        }

        public final i f() {
            byte readByte = this.b.readByte();
            byte[] bArr = c.a;
            int i2 = readByte & 255;
            int i3 = 0;
            boolean z = (i2 & 128) == 128;
            long g2 = (long) g(i2, 127);
            if (!z) {
                return this.b.t(g2);
            }
            e eVar = new e();
            q qVar = q.f3676d;
            h hVar = this.b;
            i.s.c.h.f(hVar, "source");
            i.s.c.h.f(eVar, "sink");
            q.a aVar = q.f3675c;
            int i4 = 0;
            for (long j2 = 0; j2 < g2; j2++) {
                byte readByte2 = hVar.readByte();
                byte[] bArr2 = c.a;
                i3 = (i3 << 8) | (readByte2 & 255);
                i4 += 8;
                while (i4 >= 8) {
                    int i5 = i4 - 8;
                    int i6 = (i3 >>> i5) & 255;
                    q.a[] aVarArr = aVar.a;
                    if (aVarArr != null) {
                        aVar = aVarArr[i6];
                        if (aVar == null) {
                            i.s.c.h.j();
                            throw null;
                        } else if (aVar.a == null) {
                            eVar.r0(aVar.b);
                            i4 -= aVar.f3677c;
                            aVar = q.f3675c;
                        } else {
                            i4 = i5;
                        }
                    } else {
                        i.s.c.h.j();
                        throw null;
                    }
                }
            }
            while (i4 > 0) {
                int i7 = (i3 << (8 - i4)) & 255;
                q.a[] aVarArr2 = aVar.a;
                if (aVarArr2 != null) {
                    q.a aVar2 = aVarArr2[i7];
                    if (aVar2 != null) {
                        if (aVar2.a != null || aVar2.f3677c > i4) {
                            break;
                        }
                        eVar.r0(aVar2.b);
                        i4 -= aVar2.f3677c;
                        aVar = q.f3675c;
                    } else {
                        i.s.c.h.j();
                        throw null;
                    }
                } else {
                    i.s.c.h.j();
                    throw null;
                }
            }
            return eVar.g0();
        }

        public final int g(int i2, int i3) {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                byte readByte = this.b.readByte();
                byte[] bArr = c.a;
                int i6 = readByte & 255;
                if ((i6 & 128) == 0) {
                    return i3 + (i6 << i5);
                }
                i3 += (i6 & 127) << i5;
                i5 += 7;
            }
        }
    }

    public static final class b {
        public int a;
        public boolean b;

        /* renamed from: c  reason: collision with root package name */
        public int f3589c;

        /* renamed from: d  reason: collision with root package name */
        public c[] f3590d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f3591f;

        /* renamed from: g  reason: collision with root package name */
        public int f3592g;

        /* renamed from: h  reason: collision with root package name */
        public int f3593h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f3594i;

        /* renamed from: j  reason: collision with root package name */
        public final e f3595j;

        public b(int i2, boolean z, e eVar, int i3) {
            i2 = (i3 & 1) != 0 ? 4096 : i2;
            z = (i3 & 2) != 0 ? true : z;
            i.s.c.h.f(eVar, "out");
            this.f3593h = i2;
            this.f3594i = z;
            this.f3595j = eVar;
            this.a = Integer.MAX_VALUE;
            this.f3589c = i2;
            this.f3590d = new c[8];
            this.e = 7;
        }

        public final void a() {
            c[] cVarArr = this.f3590d;
            int length = cVarArr.length;
            i.s.c.h.e(cVarArr, "$this$fill");
            Arrays.fill(cVarArr, 0, length, (Object) null);
            this.e = this.f3590d.length - 1;
            this.f3591f = 0;
            this.f3592g = 0;
        }

        public final int b(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f3590d.length;
                while (true) {
                    length--;
                    i3 = this.e;
                    if (length < i3 || i2 <= 0) {
                        c[] cVarArr = this.f3590d;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i4, this.f3591f);
                        c[] cVarArr2 = this.f3590d;
                        int i5 = this.e;
                        Arrays.fill(cVarArr2, i5 + 1, i5 + 1 + i4, (Object) null);
                        this.e += i4;
                    } else {
                        c[] cVarArr3 = this.f3590d;
                        c cVar = cVarArr3[length];
                        if (cVar != null) {
                            i2 -= cVar.f3580g;
                            int i6 = this.f3592g;
                            c cVar2 = cVarArr3[length];
                            if (cVar2 != null) {
                                this.f3592g = i6 - cVar2.f3580g;
                                this.f3591f--;
                                i4++;
                            } else {
                                i.s.c.h.j();
                                throw null;
                            }
                        } else {
                            i.s.c.h.j();
                            throw null;
                        }
                    }
                }
                c[] cVarArr4 = this.f3590d;
                System.arraycopy(cVarArr4, i3 + 1, cVarArr4, i3 + 1 + i4, this.f3591f);
                c[] cVarArr22 = this.f3590d;
                int i52 = this.e;
                Arrays.fill(cVarArr22, i52 + 1, i52 + 1 + i4, (Object) null);
                this.e += i4;
            }
            return i4;
        }

        public final void c(c cVar) {
            int i2 = cVar.f3580g;
            int i3 = this.f3589c;
            if (i2 > i3) {
                a();
                return;
            }
            b((this.f3592g + i2) - i3);
            int i4 = this.f3591f + 1;
            c[] cVarArr = this.f3590d;
            if (i4 > cVarArr.length) {
                c[] cVarArr2 = new c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.e = this.f3590d.length - 1;
                this.f3590d = cVarArr2;
            }
            int i5 = this.e;
            this.e = i5 - 1;
            this.f3590d[i5] = cVar;
            this.f3591f++;
            this.f3592g += i2;
        }

        public final void d(i iVar) {
            int i2;
            i.s.c.h.f(iVar, "data");
            int i3 = 0;
            if (this.f3594i) {
                q qVar = q.f3676d;
                i.s.c.h.f(iVar, "bytes");
                int d2 = iVar.d();
                long j2 = 0;
                for (int i4 = 0; i4 < d2; i4++) {
                    byte g2 = iVar.g(i4);
                    byte[] bArr = c.a;
                    j2 += (long) q.b[g2 & 255];
                }
                if (((int) ((j2 + ((long) 7)) >> 3)) < iVar.d()) {
                    e eVar = new e();
                    q qVar2 = q.f3676d;
                    i.s.c.h.f(iVar, "source");
                    i.s.c.h.f(eVar, "sink");
                    int d3 = iVar.d();
                    long j3 = 0;
                    byte b2 = 0;
                    while (i3 < d3) {
                        byte g3 = iVar.g(i3);
                        byte[] bArr2 = c.a;
                        int i5 = g3 & 255;
                        int i6 = q.a[i5];
                        byte b3 = q.b[i5];
                        j3 = (j3 << b3) | ((long) i6);
                        int i7 = b2 + b3;
                        while (i7 >= 8) {
                            i7 = (i7 == 1 ? 1 : 0) - 8;
                            eVar.T((int) (j3 >> i7));
                        }
                        i3++;
                        b2 = i7;
                    }
                    if (b2 > 0) {
                        eVar.T((int) ((255 >>> (b2 == 1 ? 1 : 0)) | (j3 << (8 - b2))));
                    }
                    iVar = eVar.g0();
                    i2 = iVar.d();
                    i3 = 128;
                    f(i2, 127, i3);
                    this.f3595j.n0(iVar);
                }
            }
            i2 = iVar.d();
            f(i2, 127, i3);
            this.f3595j.n0(iVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00c6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(java.util.List<j.n0.j.c> r14) {
            /*
            // Method dump skipped, instructions count: 266
            */
            throw new UnsupportedOperationException("Method not decompiled: j.n0.j.d.b.e(java.util.List):void");
        }

        public final void f(int i2, int i3, int i4) {
            int i5;
            e eVar;
            if (i2 < i3) {
                eVar = this.f3595j;
                i5 = i2 | i4;
            } else {
                this.f3595j.r0(i4 | i3);
                i5 = i2 - i3;
                while (i5 >= 128) {
                    this.f3595j.r0(128 | (i5 & 127));
                    i5 >>>= 7;
                }
                eVar = this.f3595j;
            }
            eVar.r0(i5);
        }
    }

    static {
        c cVar = new c(c.f3579f, "");
        i iVar = c.f3577c;
        i iVar2 = c.f3578d;
        i iVar3 = c.e;
        i iVar4 = c.b;
        c[] cVarArr = {cVar, new c(iVar, "GET"), new c(iVar, "POST"), new c(iVar2, "/"), new c(iVar2, "/index.html"), new c(iVar3, "http"), new c(iVar3, "https"), new c(iVar4, "200"), new c(iVar4, "204"), new c(iVar4, "206"), new c(iVar4, "304"), new c(iVar4, "400"), new c(iVar4, "404"), new c(iVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c[] cVarArr2 = a;
            if (!linkedHashMap.containsKey(cVarArr2[i2].f3581h)) {
                linkedHashMap.put(cVarArr2[i2].f3581h, Integer.valueOf(i2));
            }
        }
        Map<i, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        i.s.c.h.b(unmodifiableMap, "Collections.unmodifiableMap(result)");
        b = unmodifiableMap;
    }

    public final i a(i iVar) {
        i.s.c.h.f(iVar, "name");
        int d2 = iVar.d();
        for (int i2 = 0; i2 < d2; i2++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte g2 = iVar.g(i2);
            if (b2 <= g2 && b3 >= g2) {
                StringBuilder f2 = c.c.a.a.a.f("PROTOCOL_ERROR response malformed: mixed case name: ");
                f2.append(iVar.k());
                throw new IOException(f2.toString());
            }
        }
        return iVar;
    }
}
