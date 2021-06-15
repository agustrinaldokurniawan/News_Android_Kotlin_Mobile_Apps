package j.n0.k.i;

import i.s.c.h;
import j.d0;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class j implements k {
    public k a;
    public final a b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a aVar) {
        h.f(aVar, "socketAdapterFactory");
        this.b = aVar;
    }

    @Override // j.n0.k.i.k
    public boolean a(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        return this.b.a(sSLSocket);
    }

    @Override // j.n0.k.i.k
    public String b(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        k e = e(sSLSocket);
        if (e != null) {
            return e.b(sSLSocket);
        }
        return null;
    }

    @Override // j.n0.k.i.k
    public boolean c() {
        return true;
    }

    @Override // j.n0.k.i.k
    public void d(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        h.f(sSLSocket, "sslSocket");
        h.f(list, "protocols");
        k e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized k e(SSLSocket sSLSocket) {
        if (this.a == null && this.b.a(sSLSocket)) {
            this.a = this.b.b(sSLSocket);
        }
        return this.a;
    }
}
