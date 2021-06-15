package j.n0.j;

import i.j;
import i.s.c.h;
import j.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Objects;
import k.a0;
import k.e;
import k.z;

public final class o {
    public long a;
    public long b;

    /* renamed from: c  reason: collision with root package name */
    public long f3650c;

    /* renamed from: d  reason: collision with root package name */
    public long f3651d;
    public final ArrayDeque<x> e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3652f;

    /* renamed from: g  reason: collision with root package name */
    public final b f3653g;

    /* renamed from: h  reason: collision with root package name */
    public final a f3654h;

    /* renamed from: i  reason: collision with root package name */
    public final c f3655i = new c();

    /* renamed from: j  reason: collision with root package name */
    public final c f3656j = new c();

    /* renamed from: k  reason: collision with root package name */
    public b f3657k;

    /* renamed from: l  reason: collision with root package name */
    public IOException f3658l;

    /* renamed from: m  reason: collision with root package name */
    public final int f3659m;
    public final f n;

    public final class a implements k.x {
        public final e e = new e();

        /* renamed from: f  reason: collision with root package name */
        public boolean f3660f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f3661g;

        public a(boolean z) {
            this.f3661g = z;
        }

        /* JADX INFO: finally extract failed */
        public final void b(boolean z) {
            long min;
            boolean z2;
            synchronized (o.this) {
                o.this.f3656j.h();
                while (true) {
                    try {
                        o oVar = o.this;
                        if (oVar.f3650c < oVar.f3651d || this.f3661g || this.f3660f || oVar.f() != null) {
                            o.this.f3656j.l();
                            o.this.b();
                            o oVar2 = o.this;
                            min = Math.min(oVar2.f3651d - oVar2.f3650c, this.e.f3738f);
                            o oVar3 = o.this;
                            oVar3.f3650c += min;
                        } else {
                            o.this.l();
                        }
                    } catch (Throwable th) {
                        o.this.f3656j.l();
                        throw th;
                    }
                }
                o.this.f3656j.l();
                o.this.b();
                o oVar22 = o.this;
                min = Math.min(oVar22.f3651d - oVar22.f3650c, this.e.f3738f);
                o oVar32 = o.this;
                oVar32.f3650c += min;
                z2 = z && min == this.e.f3738f && oVar32.f() == null;
            }
            o.this.f3656j.h();
            try {
                o oVar4 = o.this;
                oVar4.n.Q(oVar4.f3659m, z2, this.e, min);
            } finally {
                o.this.f3656j.l();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
            r0 = r14.f3662h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
            if (r0.f3654h.f3661g != false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
            if (r14.e.f3738f <= 0) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
            if (r2 == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
            if (r14.e.f3738f <= 0) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
            b(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
            if (r1 == false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
            r0.n.Q(r0.f3659m, true, null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
            r0 = r14.f3662h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            r14.f3660f = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
            r14.f3662h.n.F.flush();
            r14.f3662h.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
            return;
         */
        @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r14 = this;
                j.n0.j.o r0 = j.n0.j.o.this
                byte[] r1 = j.n0.c.a
                monitor-enter(r0)
                boolean r1 = r14.f3660f     // Catch:{ all -> 0x005f }
                if (r1 == 0) goto L_0x000b
                monitor-exit(r0)
                return
            L_0x000b:
                j.n0.j.o r1 = j.n0.j.o.this
                j.n0.j.b r1 = r1.f()
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0017
                r1 = r3
                goto L_0x0018
            L_0x0017:
                r1 = r2
            L_0x0018:
                monitor-exit(r0)
                j.n0.j.o r0 = j.n0.j.o.this
                j.n0.j.o$a r4 = r0.f3654h
                boolean r4 = r4.f3661g
                if (r4 != 0) goto L_0x0047
                k.e r4 = r14.e
                long r4 = r4.f3738f
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 <= 0) goto L_0x002c
                r2 = r3
            L_0x002c:
                if (r2 == 0) goto L_0x003a
            L_0x002e:
                k.e r0 = r14.e
                long r0 = r0.f3738f
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0047
                r14.b(r3)
                goto L_0x002e
            L_0x003a:
                if (r1 == 0) goto L_0x0047
                j.n0.j.f r8 = r0.n
                int r9 = r0.f3659m
                r10 = 1
                r11 = 0
                r12 = 0
                r8.Q(r9, r10, r11, r12)
            L_0x0047:
                j.n0.j.o r0 = j.n0.j.o.this
                monitor-enter(r0)
                r14.f3660f = r3     // Catch:{ all -> 0x005c }
                monitor-exit(r0)
                j.n0.j.o r0 = j.n0.j.o.this
                j.n0.j.f r0 = r0.n
                j.n0.j.p r0 = r0.F
                r0.flush()
                j.n0.j.o r0 = j.n0.j.o.this
                r0.a()
                return
            L_0x005c:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x005f:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: j.n0.j.o.a.close():void");
        }

        @Override // k.x, java.io.Flushable
        public void flush() {
            o oVar = o.this;
            byte[] bArr = j.n0.c.a;
            synchronized (oVar) {
                o.this.b();
            }
            while (this.e.f3738f > 0) {
                b(false);
                o.this.n.F.flush();
            }
        }

        @Override // k.x
        public a0 g() {
            return o.this.f3656j;
        }

        @Override // k.x
        public void l(e eVar, long j2) {
            h.f(eVar, "source");
            byte[] bArr = j.n0.c.a;
            this.e.l(eVar, j2);
            while (this.e.f3738f >= 16384) {
                b(false);
            }
        }
    }

    public final class b implements z {
        public final e e = new e();

        /* renamed from: f  reason: collision with root package name */
        public final e f3663f = new e();

        /* renamed from: g  reason: collision with root package name */
        public boolean f3664g;

        /* renamed from: h  reason: collision with root package name */
        public final long f3665h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f3666i;

        public b(long j2, boolean z) {
            this.f3665h = j2;
            this.f3666i = z;
        }

        public final void b(long j2) {
            o oVar = o.this;
            byte[] bArr = j.n0.c.a;
            oVar.n.K(j2);
        }

        @Override // k.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long j2;
            synchronized (o.this) {
                this.f3664g = true;
                e eVar = this.f3663f;
                j2 = eVar.f3738f;
                eVar.a(j2);
                o oVar = o.this;
                if (oVar != null) {
                    oVar.notifyAll();
                } else {
                    throw new j("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (j2 > 0) {
                b(j2);
            }
            o.this.a();
        }

        @Override // k.z
        public a0 g() {
            return o.this.f3655i;
        }

        @Override // k.z
        public long r(e eVar, long j2) {
            Throwable th;
            long j3;
            boolean z;
            long j4;
            h.f(eVar, "sink");
            long j5 = 0;
            if (j2 >= 0) {
                while (true) {
                    synchronized (o.this) {
                        o.this.f3655i.h();
                        try {
                            th = null;
                            if (o.this.f() != null) {
                                Throwable th2 = o.this.f3658l;
                                if (th2 == null) {
                                    b f2 = o.this.f();
                                    if (f2 != null) {
                                        th2 = new u(f2);
                                    } else {
                                        h.j();
                                        throw null;
                                    }
                                }
                                th = th2;
                            }
                            if (!this.f3664g) {
                                e eVar2 = this.f3663f;
                                long j6 = eVar2.f3738f;
                                if (j6 > j5) {
                                    j4 = eVar2.r(eVar, Math.min(j2, j6));
                                    o oVar = o.this;
                                    long j7 = oVar.a + j4;
                                    oVar.a = j7;
                                    long j8 = j7 - oVar.b;
                                    if (th == null && j8 >= ((long) (oVar.n.y.a() / 2))) {
                                        o oVar2 = o.this;
                                        oVar2.n.d0(oVar2.f3659m, j8);
                                        o oVar3 = o.this;
                                        oVar3.b = oVar3.a;
                                    }
                                } else if (this.f3666i || th != null) {
                                    j4 = -1;
                                } else {
                                    o.this.l();
                                    z = true;
                                    j3 = -1;
                                }
                                j3 = j4;
                                z = false;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            o.this.f3655i.l();
                        }
                    }
                    if (z) {
                        j5 = 0;
                    } else if (j3 != -1) {
                        b(j3);
                        return j3;
                    } else if (th == null) {
                        return -1;
                    } else {
                        throw th;
                    }
                }
            } else {
                throw new IllegalArgumentException(c.c.a.a.a.n("byteCount < 0: ", j2).toString());
            }
        }
    }

    public final class c extends k.b {
        public c() {
        }

        @Override // k.b
        public IOException j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // k.b
        public void k() {
            o.this.e(b.f3573j);
            f fVar = o.this.n;
            synchronized (fVar) {
                long j2 = fVar.v;
                long j3 = fVar.u;
                if (j2 >= j3) {
                    fVar.u = j3 + 1;
                    fVar.x = System.nanoTime() + ((long) 1000000000);
                    j.n0.f.c cVar = fVar.o;
                    String e = c.c.a.a.a.e(new StringBuilder(), fVar.f3602j, " ping");
                    cVar.c(new l(e, true, e, true, fVar), 0);
                }
            }
        }

        public final void l() {
            if (i()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public o(int i2, f fVar, boolean z, boolean z2, x xVar) {
        h.f(fVar, "connection");
        this.f3659m = i2;
        this.n = fVar;
        this.f3651d = (long) fVar.z.a();
        ArrayDeque<x> arrayDeque = new ArrayDeque<>();
        this.e = arrayDeque;
        this.f3653g = new b((long) fVar.y.a(), z2);
        this.f3654h = new a(z);
        if (xVar != null) {
            if (!h()) {
                arrayDeque.add(xVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!h()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() {
        boolean z;
        boolean i2;
        byte[] bArr = j.n0.c.a;
        synchronized (this) {
            b bVar = this.f3653g;
            if (!bVar.f3666i && bVar.f3664g) {
                a aVar = this.f3654h;
                if (aVar.f3661g || aVar.f3660f) {
                    z = true;
                    i2 = i();
                }
            }
            z = false;
            i2 = i();
        }
        if (z) {
            c(b.f3573j, null);
        } else if (!i2) {
            this.n.n(this.f3659m);
        }
    }

    public final void b() {
        a aVar = this.f3654h;
        if (aVar.f3660f) {
            throw new IOException("stream closed");
        } else if (aVar.f3661g) {
            throw new IOException("stream finished");
        } else if (this.f3657k != null) {
            Throwable th = this.f3658l;
            if (th == null) {
                b bVar = this.f3657k;
                if (bVar == null) {
                    h.j();
                    throw null;
                }
                th = new u(bVar);
            }
            throw th;
        }
    }

    public final void c(b bVar, IOException iOException) {
        h.f(bVar, "rstStatusCode");
        if (d(bVar, iOException)) {
            f fVar = this.n;
            int i2 = this.f3659m;
            Objects.requireNonNull(fVar);
            h.f(bVar, "statusCode");
            fVar.F.Q(i2, bVar);
        }
    }

    public final boolean d(b bVar, IOException iOException) {
        byte[] bArr = j.n0.c.a;
        synchronized (this) {
            if (this.f3657k != null) {
                return false;
            }
            if (this.f3653g.f3666i && this.f3654h.f3661g) {
                return false;
            }
            this.f3657k = bVar;
            this.f3658l = iOException;
            notifyAll();
            this.n.n(this.f3659m);
            return true;
        }
    }

    public final void e(b bVar) {
        h.f(bVar, "errorCode");
        if (d(bVar, null)) {
            this.n.b0(this.f3659m, bVar);
        }
    }

    public final synchronized b f() {
        return this.f3657k;
    }

    public final k.x g() {
        synchronized (this) {
            if (!(this.f3652f || h())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f3654h;
    }

    public final boolean h() {
        return this.n.f3599g == ((this.f3659m & 1) == 1);
    }

    public final synchronized boolean i() {
        if (this.f3657k != null) {
            return false;
        }
        b bVar = this.f3653g;
        if (bVar.f3666i || bVar.f3664g) {
            a aVar = this.f3654h;
            if ((aVar.f3661g || aVar.f3660f) && this.f3652f) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(j.x r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            i.s.c.h.f(r3, r0)
            byte[] r0 = j.n0.c.a
            monitor-enter(r2)
            boolean r0 = r2.f3652f     // Catch:{ all -> 0x0035 }
            r1 = 1
            if (r0 == 0) goto L_0x0016
            if (r4 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            j.n0.j.o$b r3 = r2.f3653g     // Catch:{ all -> 0x0035 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0035 }
            goto L_0x001d
        L_0x0016:
            r2.f3652f = r1     // Catch:{ all -> 0x0035 }
            java.util.ArrayDeque<j.x> r0 = r2.e     // Catch:{ all -> 0x0035 }
            r0.add(r3)     // Catch:{ all -> 0x0035 }
        L_0x001d:
            if (r4 == 0) goto L_0x0023
            j.n0.j.o$b r3 = r2.f3653g     // Catch:{ all -> 0x0035 }
            r3.f3666i = r1     // Catch:{ all -> 0x0035 }
        L_0x0023:
            boolean r3 = r2.i()     // Catch:{ all -> 0x0035 }
            r2.notifyAll()     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0034
            j.n0.j.f r3 = r2.n
            int r4 = r2.f3659m
            r3.n(r4)
        L_0x0034:
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.j.o.j(j.x, boolean):void");
    }

    public final synchronized void k(b bVar) {
        h.f(bVar, "errorCode");
        if (this.f3657k == null) {
            this.f3657k = bVar;
            notifyAll();
        }
    }

    public final void l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
