package j.n0.g;

import j.a;
import j.c0;
import j.d0;
import j.e;
import j.k;
import j.l0;
import j.n0.c;
import j.n0.h.d;
import j.n0.j.b;
import j.n0.j.f;
import j.n0.j.m;
import j.n0.j.o;
import j.n0.j.p;
import j.n0.j.t;
import j.n0.k.h;
import j.w;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.a0;
import k.g;
import k.h;
import k.s;
import k.x;
import k.z;

public final class i extends f.c implements k {
    public Socket b;

    /* renamed from: c  reason: collision with root package name */
    public Socket f3523c;

    /* renamed from: d  reason: collision with root package name */
    public w f3524d;
    public d0 e;

    /* renamed from: f  reason: collision with root package name */
    public f f3525f;

    /* renamed from: g  reason: collision with root package name */
    public h f3526g;

    /* renamed from: h  reason: collision with root package name */
    public g f3527h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3528i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3529j;

    /* renamed from: k  reason: collision with root package name */
    public int f3530k;

    /* renamed from: l  reason: collision with root package name */
    public int f3531l;

    /* renamed from: m  reason: collision with root package name */
    public int f3532m;
    public int n = 1;
    public final List<Reference<e>> o = new ArrayList();
    public long p = Long.MAX_VALUE;
    public final l0 q;

    public i(j jVar, l0 l0Var) {
        i.s.c.h.f(jVar, "connectionPool");
        i.s.c.h.f(l0Var, "route");
        this.q = l0Var;
    }

    @Override // j.n0.j.f.c
    public synchronized void a(f fVar, t tVar) {
        i.s.c.h.f(fVar, "connection");
        i.s.c.h.f(tVar, "settings");
        this.n = (tVar.a & 16) != 0 ? tVar.b[4] : Integer.MAX_VALUE;
    }

    @Override // j.n0.j.f.c
    public void b(o oVar) {
        i.s.c.h.f(oVar, "stream");
        oVar.c(b.f3572i, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015b A[EDGE_INSN: B:78:0x015b->B:70:0x015b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r17, int r18, int r19, int r20, boolean r21, j.e r22, j.t r23) {
        /*
        // Method dump skipped, instructions count: 373
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.g.i.c(int, int, int, int, boolean, j.e, j.t):void");
    }

    public final void d(c0 c0Var, l0 l0Var, IOException iOException) {
        i.s.c.h.f(c0Var, "client");
        i.s.c.h.f(l0Var, "failedRoute");
        i.s.c.h.f(iOException, "failure");
        if (l0Var.b.type() != Proxy.Type.DIRECT) {
            a aVar = l0Var.a;
            aVar.f3356k.connectFailed(aVar.a.h(), l0Var.b.address(), iOException);
        }
        k kVar = c0Var.F;
        synchronized (kVar) {
            i.s.c.h.f(l0Var, "failedRoute");
            kVar.a.add(l0Var);
        }
    }

    public final void e(int i2, int i3, e eVar, j.t tVar) {
        Socket socket;
        int i4;
        l0 l0Var = this.q;
        Proxy proxy = l0Var.b;
        a aVar = l0Var.a;
        Proxy.Type type = proxy.type();
        if (type != null && ((i4 = f.a[type.ordinal()]) == 1 || i4 == 2)) {
            socket = aVar.e.createSocket();
            if (socket == null) {
                i.s.c.h.j();
                throw null;
            }
        } else {
            socket = new Socket(proxy);
        }
        this.b = socket;
        InetSocketAddress inetSocketAddress = this.q.f3443c;
        Objects.requireNonNull(tVar);
        i.s.c.h.f(eVar, "call");
        i.s.c.h.f(inetSocketAddress, "inetSocketAddress");
        i.s.c.h.f(proxy, "proxy");
        socket.setSoTimeout(i3);
        try {
            h.a aVar2 = j.n0.k.h.f3695c;
            j.n0.k.h.a.e(socket, this.q.f3443c, i2);
            try {
                z T = h.a.t.a.T(socket);
                i.s.c.h.f(T, "$this$buffer");
                this.f3526g = new k.t(T);
                x R = h.a.t.a.R(socket);
                i.s.c.h.f(R, "$this$buffer");
                this.f3527h = new s(R);
            } catch (NullPointerException e2) {
                if (i.s.c.h.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            StringBuilder f2 = c.c.a.a.a.f("Failed to connect to ");
            f2.append(this.q.f3443c);
            ConnectException connectException = new ConnectException(f2.toString());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable, j.c0] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(int r20, int r21, int r22, j.e r23, j.t r24) {
        /*
        // Method dump skipped, instructions count: 447
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.g.i.f(int, int, int, j.e, j.t):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(j.n0.g.b r18, int r19, j.e r20, j.t r21) {
        /*
        // Method dump skipped, instructions count: 561
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.g.i.g(j.n0.g.b, int, j.e, j.t):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d4, code lost:
        if (r8 == false) goto L_0x00d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00db A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dc A[SYNTHETIC, Splitter:B:57:0x00dc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(j.a r7, java.util.List<j.l0> r8) {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.g.i.h(j.a, java.util.List):boolean");
    }

    /* JADX INFO: finally extract failed */
    public final boolean i(boolean z) {
        long j2;
        byte[] bArr = c.a;
        long nanoTime = System.nanoTime();
        Socket socket = this.b;
        if (socket != null) {
            Socket socket2 = this.f3523c;
            if (socket2 != null) {
                k.h hVar = this.f3526g;
                if (hVar == null) {
                    i.s.c.h.j();
                    throw null;
                } else if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                    return false;
                } else {
                    f fVar = this.f3525f;
                    if (fVar != null) {
                        synchronized (fVar) {
                            return !fVar.f3605m && (fVar.v >= fVar.u || nanoTime < fVar.x);
                        }
                    }
                    synchronized (this) {
                        j2 = nanoTime - this.p;
                    }
                    if (j2 < 10000000000L || !z) {
                        return true;
                    }
                    i.s.c.h.f(socket2, "$this$isHealthy");
                    i.s.c.h.f(hVar, "source");
                    try {
                        int soTimeout = socket2.getSoTimeout();
                        try {
                            socket2.setSoTimeout(1);
                            boolean z2 = !hVar.R();
                            socket2.setSoTimeout(soTimeout);
                            return z2;
                        } catch (Throwable th) {
                            socket2.setSoTimeout(soTimeout);
                            throw th;
                        }
                    } catch (SocketTimeoutException unused) {
                        return true;
                    } catch (IOException unused2) {
                        return false;
                    }
                }
            } else {
                i.s.c.h.j();
                throw null;
            }
        } else {
            i.s.c.h.j();
            throw null;
        }
    }

    public final boolean j() {
        return this.f3525f != null;
    }

    public final d k(c0 c0Var, j.n0.h.g gVar) {
        i.s.c.h.f(c0Var, "client");
        i.s.c.h.f(gVar, "chain");
        Socket socket = this.f3523c;
        if (socket != null) {
            k.h hVar = this.f3526g;
            if (hVar != null) {
                g gVar2 = this.f3527h;
                if (gVar2 != null) {
                    f fVar = this.f3525f;
                    if (fVar != null) {
                        return new m(c0Var, this, gVar, fVar);
                    }
                    socket.setSoTimeout(gVar.f3546h);
                    a0 g2 = hVar.g();
                    long j2 = (long) gVar.f3546h;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    g2.g(j2, timeUnit);
                    gVar2.g().g((long) gVar.f3547i, timeUnit);
                    return new j.n0.i.b(c0Var, this, hVar, gVar2);
                }
                i.s.c.h.j();
                throw null;
            }
            i.s.c.h.j();
            throw null;
        }
        i.s.c.h.j();
        throw null;
    }

    public final synchronized void l() {
        this.f3528i = true;
    }

    public Socket m() {
        Socket socket = this.f3523c;
        if (socket != null) {
            return socket;
        }
        i.s.c.h.j();
        throw null;
    }

    public final void n(int i2) {
        StringBuilder sb;
        Socket socket = this.f3523c;
        if (socket != null) {
            k.h hVar = this.f3526g;
            if (hVar != null) {
                g gVar = this.f3527h;
                if (gVar != null) {
                    socket.setSoTimeout(0);
                    j.n0.f.d dVar = j.n0.f.d.a;
                    f.b bVar = new f.b(true, dVar);
                    String str = this.q.a.a.f3716g;
                    i.s.c.h.f(socket, "socket");
                    i.s.c.h.f(str, "peerName");
                    i.s.c.h.f(hVar, "source");
                    i.s.c.h.f(gVar, "sink");
                    bVar.a = socket;
                    if (bVar.f3611h) {
                        sb = new StringBuilder();
                        sb.append(c.f3472g);
                        sb.append(' ');
                    } else {
                        sb = c.c.a.a.a.f("MockWebServer ");
                    }
                    sb.append(str);
                    bVar.b = sb.toString();
                    bVar.f3607c = hVar;
                    bVar.f3608d = gVar;
                    i.s.c.h.f(this, "listener");
                    bVar.e = this;
                    bVar.f3610g = i2;
                    f fVar = new f(bVar);
                    this.f3525f = fVar;
                    f fVar2 = f.f3598f;
                    t tVar = f.e;
                    this.n = (tVar.a & 16) != 0 ? tVar.b[4] : Integer.MAX_VALUE;
                    i.s.c.h.f(dVar, "taskRunner");
                    p pVar = fVar.F;
                    synchronized (pVar) {
                        if (pVar.f3671h) {
                            throw new IOException("closed");
                        } else if (pVar.f3674k) {
                            Logger logger = p.e;
                            if (logger.isLoggable(Level.FINE)) {
                                logger.fine(c.h(">> CONNECTION " + j.n0.j.e.a.e(), new Object[0]));
                            }
                            pVar.f3673j.m(j.n0.j.e.a);
                            pVar.f3673j.flush();
                        }
                    }
                    p pVar2 = fVar.F;
                    t tVar2 = fVar.y;
                    synchronized (pVar2) {
                        i.s.c.h.f(tVar2, "settings");
                        if (!pVar2.f3671h) {
                            pVar2.e(0, Integer.bitCount(tVar2.a) * 6, 4, 0);
                            int i3 = 0;
                            while (i3 < 10) {
                                if (((1 << i3) & tVar2.a) != 0) {
                                    pVar2.f3673j.A(i3 != 4 ? i3 != 7 ? i3 : 4 : 3);
                                    pVar2.f3673j.E(tVar2.b[i3]);
                                }
                                i3++;
                            }
                            pVar2.f3673j.flush();
                        } else {
                            throw new IOException("closed");
                        }
                    }
                    int a = fVar.y.a();
                    if (a != 65535) {
                        fVar.F.V(0, (long) (a - 65535));
                    }
                    j.n0.f.c f2 = dVar.f();
                    String str2 = fVar.f3602j;
                    f2.c(new j.n0.f.b(fVar.G, str2, true, str2, true), 0);
                    return;
                }
                i.s.c.h.j();
                throw null;
            }
            i.s.c.h.j();
            throw null;
        }
        i.s.c.h.j();
        throw null;
    }

    public String toString() {
        Object obj;
        StringBuilder f2 = c.c.a.a.a.f("Connection{");
        f2.append(this.q.a.a.f3716g);
        f2.append(':');
        f2.append(this.q.a.a.f3717h);
        f2.append(',');
        f2.append(" proxy=");
        f2.append(this.q.b);
        f2.append(" hostAddress=");
        f2.append(this.q.f3443c);
        f2.append(" cipherSuite=");
        w wVar = this.f3524d;
        if (wVar == null || (obj = wVar.f3709c) == null) {
            obj = "none";
        }
        f2.append(obj);
        f2.append(" protocol=");
        f2.append(this.e);
        f2.append('}');
        return f2.toString();
    }
}
