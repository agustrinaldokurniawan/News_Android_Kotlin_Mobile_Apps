package j.n0.k.i;

import i.s.c.h;
import j.d0;
import j.n0.k.c;
import j.n0.k.i.j;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

public final class g implements k {
    public static final j.a a = new a();

    public static final class a implements j.a {
        @Override // j.n0.k.i.j.a
        public boolean a(SSLSocket sSLSocket) {
            h.f(sSLSocket, "sslSocket");
            c.a aVar = c.e;
            return c.f3683d && (sSLSocket instanceof BCSSLSocket);
        }

        @Override // j.n0.k.i.j.a
        public k b(SSLSocket sSLSocket) {
            h.f(sSLSocket, "sslSocket");
            return new g();
        }
    }

    @Override // j.n0.k.i.k
    public boolean a(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // j.n0.k.i.k
    public String b(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && !h.a(applicationProtocol, "")) {
            return applicationProtocol;
        }
        return null;
    }

    @Override // j.n0.k.i.k
    public boolean c() {
        c.a aVar = c.e;
        return c.f3683d;
    }

    @Override // j.n0.k.i.k
    public void d(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        h.f(sSLSocket, "sslSocket");
        h.f(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            h.b(parameters, "sslParameters");
            Object[] array = ((ArrayList) j.n0.k.h.f3695c.a(list)).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new i.j("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
