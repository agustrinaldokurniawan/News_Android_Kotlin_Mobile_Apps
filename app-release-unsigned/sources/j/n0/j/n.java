package j.n0.j;

import j.n0.c;
import j.n0.j.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.a0;
import k.e;
import k.h;
import k.i;
import k.z;

public final class n implements Closeable {
    public static final Logger e;

    /* renamed from: f  reason: collision with root package name */
    public static final n f3640f = null;

    /* renamed from: g  reason: collision with root package name */
    public final a f3641g;

    /* renamed from: h  reason: collision with root package name */
    public final d.a f3642h;

    /* renamed from: i  reason: collision with root package name */
    public final h f3643i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3644j;

    public static final class a implements z {
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f3645f;

        /* renamed from: g  reason: collision with root package name */
        public int f3646g;

        /* renamed from: h  reason: collision with root package name */
        public int f3647h;

        /* renamed from: i  reason: collision with root package name */
        public int f3648i;

        /* renamed from: j  reason: collision with root package name */
        public final h f3649j;

        public a(h hVar) {
            i.s.c.h.f(hVar, "source");
            this.f3649j = hVar;
        }

        @Override // k.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // k.z
        public a0 g() {
            return this.f3649j.g();
        }

        @Override // k.z
        public long r(e eVar, long j2) {
            int i2;
            int readInt;
            i.s.c.h.f(eVar, "sink");
            do {
                int i3 = this.f3647h;
                if (i3 == 0) {
                    this.f3649j.a((long) this.f3648i);
                    this.f3648i = 0;
                    if ((this.f3645f & 4) != 0) {
                        return -1;
                    }
                    i2 = this.f3646g;
                    int q = c.q(this.f3649j);
                    this.f3647h = q;
                    this.e = q;
                    int readByte = this.f3649j.readByte() & 255;
                    this.f3645f = this.f3649j.readByte() & 255;
                    n nVar = n.f3640f;
                    Logger logger = n.e;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(e.e.b(true, this.f3646g, this.e, readByte, this.f3645f));
                    }
                    readInt = this.f3649j.readInt() & Integer.MAX_VALUE;
                    this.f3646g = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                } else {
                    long r = this.f3649j.r(eVar, Math.min(j2, (long) i3));
                    if (r == -1) {
                        return -1;
                    }
                    this.f3647h -= (int) r;
                    return r;
                }
            } while (readInt == i2);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }
    }

    public interface b {
        void a(boolean z, int i2, int i3, List<c> list);

        void b();

        void e(int i2, long j2);

        void f(boolean z, t tVar);

        void g(int i2, int i3, List<c> list);

        void h(boolean z, int i2, h hVar, int i3);

        void i(boolean z, int i2, int i3);

        void l(int i2, b bVar, i iVar);

        void m(int i2, int i3, int i4, boolean z);

        void p(int i2, b bVar);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        i.s.c.h.b(logger, "Logger.getLogger(Http2::class.java.name)");
        e = logger;
    }

    public n(h hVar, boolean z) {
        i.s.c.h.f(hVar, "source");
        this.f3643i = hVar;
        this.f3644j = z;
        a aVar = new a(hVar);
        this.f3641g = aVar;
        this.f3642h = new d.a(aVar, 4096, 0, 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d8, code lost:
        throw new java.io.IOException(c.c.a.a.a.l("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r11));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(boolean r17, j.n0.j.n.b r18) {
        /*
        // Method dump skipped, instructions count: 844
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.j.n.b(boolean, j.n0.j.n$b):boolean");
    }

    public final void c(b bVar) {
        i.s.c.h.f(bVar, "handler");
        if (!this.f3644j) {
            h hVar = this.f3643i;
            i iVar = e.a;
            i t = hVar.t((long) iVar.d());
            Logger logger = e;
            if (logger.isLoggable(Level.FINE)) {
                StringBuilder f2 = c.c.a.a.a.f("<< CONNECTION ");
                f2.append(t.e());
                logger.fine(c.h(f2.toString(), new Object[0]));
            }
            if (!i.s.c.h.a(iVar, t)) {
                StringBuilder f3 = c.c.a.a.a.f("Expected a connection header but was ");
                f3.append(t.k());
                throw new IOException(f3.toString());
            }
        } else if (!b(true, bVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3643i.close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<j.n0.j.c> e(int r3, int r4, int r5, int r6) {
        /*
        // Method dump skipped, instructions count: 324
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.j.n.e(int, int, int, int):java.util.List");
    }

    public final void n(b bVar, int i2) {
        int readInt = this.f3643i.readInt();
        boolean z = (((int) 2147483648L) & readInt) != 0;
        byte readByte = this.f3643i.readByte();
        byte[] bArr = c.a;
        bVar.m(i2, readInt & Integer.MAX_VALUE, (readByte & 255) + 1, z);
    }
}
