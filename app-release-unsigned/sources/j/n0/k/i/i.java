package j.n0.k.i;

import i.s.c.h;
import j.d0;
import j.n0.k.d;
import j.n0.k.i.j;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

public final class i implements k {
    public static final j.a a = new a();

    public static final class a implements j.a {
        @Override // j.n0.k.i.j.a
        public boolean a(SSLSocket sSLSocket) {
            h.f(sSLSocket, "sslSocket");
            d.a aVar = d.e;
            return d.f3685d && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // j.n0.k.i.j.a
        public k b(SSLSocket sSLSocket) {
            h.f(sSLSocket, "sslSocket");
            return new i();
        }
    }

    @Override // j.n0.k.i.k
    public boolean a(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // j.n0.k.i.k
    public String b(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // j.n0.k.i.k
    public boolean c() {
        d.a aVar = d.e;
        return d.f3685d;
    }

    @Override // j.n0.k.i.k
    public void d(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        h.f(sSLSocket, "sslSocket");
        h.f(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = ((ArrayList) j.n0.k.h.f3695c.a(list)).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new i.j("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
