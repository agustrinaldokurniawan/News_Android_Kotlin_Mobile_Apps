package j.n0.h;

import i.s.c.h;
import j.c0;
import j.e0;
import j.h0;
import j.i0;
import j.l0;
import j.n0.g.c;
import j.n0.g.d;
import j.n0.g.e;
import j.n0.g.m;
import j.y;
import j.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class i implements z {
    public final c0 a;

    public i(c0 c0Var) {
        h.f(c0Var, "client");
        this.a = c0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.List] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // j.z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j.i0 a(j.z.a r49) {
        /*
        // Method dump skipped, instructions count: 783
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.h.i.a(j.z$a):j.i0");
    }

    public final e0 b(i0 i0Var, c cVar) {
        String b;
        j.n0.g.i iVar;
        h0 h0Var = null;
        l0 l0Var = (cVar == null || (iVar = cVar.b) == null) ? null : iVar.q;
        int i2 = i0Var.f3410h;
        String str = i0Var.e.f3395c;
        boolean z = false;
        if (!(i2 == 307 || i2 == 308)) {
            if (i2 == 401) {
                return this.a.n.a(l0Var, i0Var);
            }
            if (i2 != 421) {
                if (i2 == 503) {
                    i0 i0Var2 = i0Var.n;
                    if ((i0Var2 == null || i0Var2.f3410h != 503) && d(i0Var, Integer.MAX_VALUE) == 0) {
                        return i0Var.e;
                    }
                    return null;
                } else if (i2 != 407) {
                    if (i2 != 408) {
                        switch (i2) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!this.a.f3376m) {
                        return null;
                    } else {
                        i0 i0Var3 = i0Var.n;
                        if ((i0Var3 == null || i0Var3.f3410h != 408) && d(i0Var, 0) <= 0) {
                            return i0Var.e;
                        }
                        return null;
                    }
                } else if (l0Var == null) {
                    h.j();
                    throw null;
                } else if (l0Var.b.type() == Proxy.Type.HTTP) {
                    return this.a.t.a(l0Var, i0Var);
                } else {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
            } else if (cVar == null || !(!h.a(cVar.e.f3505h.a.f3716g, cVar.b.q.a.a.f3716g))) {
                return null;
            } else {
                j.n0.g.i iVar2 = cVar.b;
                synchronized (iVar2) {
                    iVar2.f3529j = true;
                }
                return i0Var.e;
            }
        }
        if (!this.a.o || (b = i0.b(i0Var, "Location", null, 2)) == null) {
            return null;
        }
        y yVar = i0Var.e.b;
        Objects.requireNonNull(yVar);
        h.f(b, "link");
        y.a f2 = yVar.f(b);
        y a2 = f2 != null ? f2.a() : null;
        if (a2 == null) {
            return null;
        }
        if (!h.a(a2.f3714d, i0Var.e.b.f3714d) && !this.a.p) {
            return null;
        }
        e0.a aVar = new e0.a(i0Var.e);
        if (f.a(str)) {
            int i3 = i0Var.f3410h;
            h.f(str, "method");
            if (h.a(str, "PROPFIND") || i3 == 308 || i3 == 307) {
                z = true;
            }
            h.f(str, "method");
            if ((true ^ h.a(str, "PROPFIND")) && i3 != 308 && i3 != 307) {
                str = "GET";
            } else if (z) {
                h0Var = i0Var.e.e;
            }
            aVar.c(str, h0Var);
            if (!z) {
                aVar.d("Transfer-Encoding");
                aVar.d("Content-Length");
                aVar.d("Content-Type");
            }
        }
        if (!j.n0.c.a(i0Var.e.b, a2)) {
            aVar.d("Authorization");
        }
        aVar.f(a2);
        return aVar.a();
    }

    public final boolean c(IOException iOException, e eVar, e0 e0Var, boolean z) {
        boolean z2;
        m mVar;
        j.n0.g.i iVar;
        if (!this.a.f3376m) {
            return false;
        }
        if (z && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        d dVar = eVar.f3512j;
        l0 l0Var = null;
        if (dVar != null) {
            int i2 = dVar.f3501c;
            if (i2 == 0 && dVar.f3502d == 0 && dVar.e == 0) {
                z2 = false;
            } else {
                if (dVar.f3503f == null) {
                    if (i2 <= 1 && dVar.f3502d <= 1 && dVar.e <= 0 && (iVar = dVar.f3506i.f3513k) != null) {
                        synchronized (iVar) {
                            if (iVar.f3530k == 0) {
                                if (j.n0.c.a(iVar.q.a.a, dVar.f3505h.a)) {
                                    l0Var = iVar.q;
                                }
                            }
                        }
                    }
                    if (l0Var != null) {
                        dVar.f3503f = l0Var;
                    } else {
                        m.a aVar = dVar.a;
                        if ((aVar == null || !aVar.a()) && (mVar = dVar.b) != null) {
                            z2 = mVar.a();
                        }
                    }
                }
                z2 = true;
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        h.j();
        throw null;
    }

    public final int d(i0 i0Var, int i2) {
        String b = i0.b(i0Var, "Retry-After", null, 2);
        if (b == null) {
            return i2;
        }
        h.e("\\d+", "pattern");
        Pattern compile = Pattern.compile("\\d+");
        h.d(compile, "Pattern.compile(pattern)");
        h.e(compile, "nativePattern");
        h.e(b, "input");
        if (!compile.matcher(b).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(b);
        h.b(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }
}
