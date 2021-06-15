package j.n0.k.i;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import i.j;
import i.s.c.h;
import j.d0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

@SuppressLint({"NewApi"})
public final class a implements k {
    @Override // j.n0.k.i.k
    public boolean a(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // j.n0.k.i.k
    @SuppressLint({"NewApi"})
    public String b(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && !h.a(applicationProtocol, "")) {
            return applicationProtocol;
        }
        return null;
    }

    @Override // j.n0.k.i.k
    public boolean c() {
        return j.n0.k.h.f3695c.c() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // j.n0.k.i.k
    @SuppressLint({"NewApi"})
    public void d(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        h.f(sSLSocket, "sslSocket");
        h.f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            h.b(sSLParameters, "sslParameters");
            Object[] array = ((ArrayList) j.n0.k.h.f3695c.a(list)).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new j("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
