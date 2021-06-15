package j.n0.i;

import i.j;
import j.c0;
import j.e0;
import j.i0;
import j.n0.g.i;
import j.p;
import j.x;
import j.y;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k.a0;
import k.g;
import k.h;
import k.l;
import k.z;

public final class b implements j.n0.h.d {
    public int a;
    public final a b;

    /* renamed from: c  reason: collision with root package name */
    public x f3552c;

    /* renamed from: d  reason: collision with root package name */
    public final c0 f3553d;
    public final i e;

    /* renamed from: f  reason: collision with root package name */
    public final h f3554f;

    /* renamed from: g  reason: collision with root package name */
    public final g f3555g;

    public abstract class a implements z {
        public final l e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3556f;

        public a() {
            this.e = new l(b.this.f3554f.g());
        }

        public final void b() {
            b bVar = b.this;
            int i2 = bVar.a;
            if (i2 != 6) {
                if (i2 == 5) {
                    b.i(bVar, this.e);
                    b.this.a = 6;
                    return;
                }
                StringBuilder f2 = c.c.a.a.a.f("state: ");
                f2.append(b.this.a);
                throw new IllegalStateException(f2.toString());
            }
        }

        @Override // k.z
        public a0 g() {
            return this.e;
        }

        @Override // k.z
        public long r(k.e eVar, long j2) {
            i.s.c.h.f(eVar, "sink");
            try {
                return b.this.f3554f.r(eVar, j2);
            } catch (IOException e2) {
                b.this.e.l();
                b();
                throw e2;
            }
        }
    }

    /* renamed from: j.n0.i.b$b  reason: collision with other inner class name */
    public final class C0124b implements k.x {
        public final l e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3558f;

        public C0124b() {
            this.e = new l(b.this.f3555g.g());
        }

        @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (!this.f3558f) {
                this.f3558f = true;
                b.this.f3555g.N("0\r\n\r\n");
                b.i(b.this, this.e);
                b.this.a = 3;
            }
        }

        @Override // k.x, java.io.Flushable
        public synchronized void flush() {
            if (!this.f3558f) {
                b.this.f3555g.flush();
            }
        }

        @Override // k.x
        public a0 g() {
            return this.e;
        }

        @Override // k.x
        public void l(k.e eVar, long j2) {
            i.s.c.h.f(eVar, "source");
            if (!(!this.f3558f)) {
                throw new IllegalStateException("closed".toString());
            } else if (j2 != 0) {
                b.this.f3555g.p(j2);
                b.this.f3555g.N("\r\n");
                b.this.f3555g.l(eVar, j2);
                b.this.f3555g.N("\r\n");
            }
        }
    }

    public final class c extends a {

        /* renamed from: h  reason: collision with root package name */
        public long f3560h = -1;

        /* renamed from: i  reason: collision with root package name */
        public boolean f3561i = true;

        /* renamed from: j  reason: collision with root package name */
        public final y f3562j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ b f3563k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, y yVar) {
            super();
            i.s.c.h.f(yVar, "url");
            this.f3563k = bVar;
            this.f3562j = yVar;
        }

        @Override // k.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f3556f) {
                if (this.f3561i && !j.n0.c.g(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f3563k.e.l();
                    b();
                }
                this.f3556f = true;
            }
        }

        @Override // k.z, j.n0.i.b.a
        public long r(k.e eVar, long j2) {
            i.s.c.h.f(eVar, "sink");
            boolean z = true;
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(c.c.a.a.a.n("byteCount < 0: ", j2).toString());
            } else if (!(!this.f3556f)) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f3561i) {
                return -1;
            } else {
                long j3 = this.f3560h;
                if (j3 == 0 || j3 == -1) {
                    if (j3 != -1) {
                        this.f3563k.f3554f.J();
                    }
                    try {
                        this.f3560h = this.f3563k.f3554f.Y();
                        String J = this.f3563k.f3554f.J();
                        if (J != null) {
                            String obj = i.x.e.y(J).toString();
                            if (this.f3560h >= 0) {
                                if (obj.length() <= 0) {
                                    z = false;
                                }
                                if (!z || i.x.e.u(obj, ";", false, 2)) {
                                    if (this.f3560h == 0) {
                                        this.f3561i = false;
                                        b bVar = this.f3563k;
                                        bVar.f3552c = bVar.b.a();
                                        b bVar2 = this.f3563k;
                                        c0 c0Var = bVar2.f3553d;
                                        if (c0Var != null) {
                                            p pVar = c0Var.q;
                                            y yVar = this.f3562j;
                                            x xVar = bVar2.f3552c;
                                            if (xVar != null) {
                                                j.n0.h.e.d(pVar, yVar, xVar);
                                                b();
                                            } else {
                                                i.s.c.h.j();
                                                throw null;
                                            }
                                        } else {
                                            i.s.c.h.j();
                                            throw null;
                                        }
                                    }
                                    if (!this.f3561i) {
                                        return -1;
                                    }
                                }
                            }
                            throw new ProtocolException("expected chunk size and optional extensions" + " but was \"" + this.f3560h + obj + '\"');
                        }
                        throw new j("null cannot be cast to non-null type kotlin.CharSequence");
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long r = super.r(eVar, Math.min(j2, this.f3560h));
                if (r != -1) {
                    this.f3560h -= r;
                    return r;
                }
                this.f3563k.e.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
        }
    }

    public final class d extends a {

        /* renamed from: h  reason: collision with root package name */
        public long f3564h;

        public d(long j2) {
            super();
            this.f3564h = j2;
            if (j2 == 0) {
                b();
            }
        }

        @Override // k.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f3556f) {
                if (this.f3564h != 0 && !j.n0.c.g(this, 100, TimeUnit.MILLISECONDS)) {
                    b.this.e.l();
                    b();
                }
                this.f3556f = true;
            }
        }

        @Override // k.z, j.n0.i.b.a
        public long r(k.e eVar, long j2) {
            i.s.c.h.f(eVar, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(c.c.a.a.a.n("byteCount < 0: ", j2).toString());
            } else if (!this.f3556f) {
                long j3 = this.f3564h;
                if (j3 == 0) {
                    return -1;
                }
                long r = super.r(eVar, Math.min(j3, j2));
                if (r != -1) {
                    long j4 = this.f3564h - r;
                    this.f3564h = j4;
                    if (j4 == 0) {
                        b();
                    }
                    return r;
                }
                b.this.e.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public final class e implements k.x {
        public final l e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3566f;

        public e() {
            this.e = new l(b.this.f3555g.g());
        }

        @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f3566f) {
                this.f3566f = true;
                b.i(b.this, this.e);
                b.this.a = 3;
            }
        }

        @Override // k.x, java.io.Flushable
        public void flush() {
            if (!this.f3566f) {
                b.this.f3555g.flush();
            }
        }

        @Override // k.x
        public a0 g() {
            return this.e;
        }

        @Override // k.x
        public void l(k.e eVar, long j2) {
            i.s.c.h.f(eVar, "source");
            if (!this.f3566f) {
                j.n0.c.b(eVar.f3738f, 0, j2);
                b.this.f3555g.l(eVar, j2);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public final class f extends a {

        /* renamed from: h  reason: collision with root package name */
        public boolean f3568h;

        public f(b bVar) {
            super();
        }

        @Override // k.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f3556f) {
                if (!this.f3568h) {
                    b();
                }
                this.f3556f = true;
            }
        }

        @Override // k.z, j.n0.i.b.a
        public long r(k.e eVar, long j2) {
            i.s.c.h.f(eVar, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(c.c.a.a.a.n("byteCount < 0: ", j2).toString());
            } else if (!(!this.f3556f)) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f3568h) {
                return -1;
            } else {
                long r = super.r(eVar, j2);
                if (r != -1) {
                    return r;
                }
                this.f3568h = true;
                b();
                return -1;
            }
        }
    }

    public b(c0 c0Var, i iVar, h hVar, g gVar) {
        i.s.c.h.f(iVar, "connection");
        i.s.c.h.f(hVar, "source");
        i.s.c.h.f(gVar, "sink");
        this.f3553d = c0Var;
        this.e = iVar;
        this.f3554f = hVar;
        this.f3555g = gVar;
        this.b = new a(hVar);
    }

    public static final void i(b bVar, l lVar) {
        Objects.requireNonNull(bVar);
        a0 a0Var = lVar.e;
        a0 a0Var2 = a0.a;
        i.s.c.h.f(a0Var2, "delegate");
        lVar.e = a0Var2;
        a0Var.a();
        a0Var.b();
    }

    @Override // j.n0.h.d
    public void a() {
        this.f3555g.flush();
    }

    @Override // j.n0.h.d
    public void b(e0 e0Var) {
        i.s.c.h.f(e0Var, "request");
        Proxy.Type type = this.e.q.b.type();
        i.s.c.h.b(type, "connection.route().proxy.type()");
        i.s.c.h.f(e0Var, "request");
        i.s.c.h.f(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(e0Var.f3395c);
        sb.append(' ');
        y yVar = e0Var.b;
        if (!yVar.f3713c && type == Proxy.Type.HTTP) {
            sb.append(yVar);
        } else {
            i.s.c.h.f(yVar, "url");
            String b2 = yVar.b();
            String d2 = yVar.d();
            if (d2 != null) {
                b2 = b2 + '?' + d2;
            }
            sb.append(b2);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        i.s.c.h.b(sb2, "StringBuilder().apply(builderAction).toString()");
        k(e0Var.f3396d, sb2);
    }

    @Override // j.n0.h.d
    public void c() {
        this.f3555g.flush();
    }

    @Override // j.n0.h.d
    public void cancel() {
        Socket socket = this.e.b;
        if (socket != null) {
            j.n0.c.d(socket);
        }
    }

    @Override // j.n0.h.d
    public k.x d(e0 e0Var, long j2) {
        i.s.c.h.f(e0Var, "request");
        boolean z = true;
        if (i.x.e.d("chunked", e0Var.b("Transfer-Encoding"), true)) {
            if (this.a != 1) {
                z = false;
            }
            if (z) {
                this.a = 2;
                return new C0124b();
            }
            StringBuilder f2 = c.c.a.a.a.f("state: ");
            f2.append(this.a);
            throw new IllegalStateException(f2.toString().toString());
        } else if (j2 != -1) {
            if (this.a != 1) {
                z = false;
            }
            if (z) {
                this.a = 2;
                return new e();
            }
            StringBuilder f3 = c.c.a.a.a.f("state: ");
            f3.append(this.a);
            throw new IllegalStateException(f3.toString().toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    @Override // j.n0.h.d
    public long e(i0 i0Var) {
        i.s.c.h.f(i0Var, "response");
        if (!j.n0.h.e.a(i0Var)) {
            return 0;
        }
        if (i.x.e.d("chunked", i0.b(i0Var, "Transfer-Encoding", null, 2), true)) {
            return -1;
        }
        return j.n0.c.j(i0Var);
    }

    @Override // j.n0.h.d
    public z f(i0 i0Var) {
        i.s.c.h.f(i0Var, "response");
        if (!j.n0.h.e.a(i0Var)) {
            return j(0);
        }
        boolean z = true;
        if (i.x.e.d("chunked", i0.b(i0Var, "Transfer-Encoding", null, 2), true)) {
            y yVar = i0Var.e.b;
            if (this.a != 4) {
                z = false;
            }
            if (z) {
                this.a = 5;
                return new c(this, yVar);
            }
            StringBuilder f2 = c.c.a.a.a.f("state: ");
            f2.append(this.a);
            throw new IllegalStateException(f2.toString().toString());
        }
        long j2 = j.n0.c.j(i0Var);
        if (j2 != -1) {
            return j(j2);
        }
        if (this.a != 4) {
            z = false;
        }
        if (z) {
            this.a = 5;
            this.e.l();
            return new f(this);
        }
        StringBuilder f3 = c.c.a.a.a.f("state: ");
        f3.append(this.a);
        throw new IllegalStateException(f3.toString().toString());
    }

    @Override // j.n0.h.d
    public i0.a g(boolean z) {
        int i2 = this.a;
        boolean z2 = true;
        if (!(i2 == 1 || i2 == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                j.n0.h.j a2 = j.n0.h.j.a(this.b.b());
                i0.a aVar = new i0.a();
                aVar.f(a2.a);
                aVar.f3416c = a2.b;
                aVar.e(a2.f3551c);
                aVar.d(this.b.a());
                if (z && a2.b == 100) {
                    return null;
                }
                if (a2.b == 100) {
                    this.a = 3;
                    return aVar;
                }
                this.a = 4;
                return aVar;
            } catch (EOFException e2) {
                throw new IOException(c.c.a.a.a.q("unexpected end of stream on ", this.e.q.a.a.g()), e2);
            }
        } else {
            StringBuilder f2 = c.c.a.a.a.f("state: ");
            f2.append(this.a);
            throw new IllegalStateException(f2.toString().toString());
        }
    }

    @Override // j.n0.h.d
    public i h() {
        return this.e;
    }

    public final z j(long j2) {
        if (this.a == 4) {
            this.a = 5;
            return new d(j2);
        }
        StringBuilder f2 = c.c.a.a.a.f("state: ");
        f2.append(this.a);
        throw new IllegalStateException(f2.toString().toString());
    }

    public final void k(x xVar, String str) {
        i.s.c.h.f(xVar, "headers");
        i.s.c.h.f(str, "requestLine");
        if (this.a == 0) {
            this.f3555g.N(str).N("\r\n");
            int size = xVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f3555g.N(xVar.b(i2)).N(": ").N(xVar.d(i2)).N("\r\n");
            }
            this.f3555g.N("\r\n");
            this.a = 1;
            return;
        }
        StringBuilder f2 = c.c.a.a.a.f("state: ");
        f2.append(this.a);
        throw new IllegalStateException(f2.toString().toString());
    }
}
