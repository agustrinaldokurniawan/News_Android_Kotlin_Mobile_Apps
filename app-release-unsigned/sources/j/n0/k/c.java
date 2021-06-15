package j.n0.k;

import i.j;
import i.s.c.f;
import i.s.c.h;
import j.d0;
import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

public final class c extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f3683d;
    public static final a e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f3684f = new BouncyCastleJsseProvider();

    public static final class a {
        public a(f fVar) {
        }
    }

    static {
        a aVar = new a(null);
        e = aVar;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f3683d = z;
    }

    @Override // j.n0.k.h
    public void d(SSLSocket sSLSocket, String str, List<d0> list) {
        h.f(sSLSocket, "sslSocket");
        h.f(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            h.f(list, "protocols");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next != d0.HTTP_1_0) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(h.a.t.a.l(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((d0) it2.next()).f3394m);
            }
            h.b(parameters, "sslParameters");
            Object[] array = arrayList2.toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new j("null cannot be cast to non-null type kotlin.Array<T>");
        }
        h.f(sSLSocket, "sslSocket");
        h.f(list, "protocols");
    }

    @Override // j.n0.k.h
    public String f(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        if (sSLSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol != null && !h.a(applicationProtocol, "")) {
                return applicationProtocol;
            }
        } else {
            super.f(sSLSocket);
        }
        return null;
    }

    @Override // j.n0.k.h
    public SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f3684f);
        h.b(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    @Override // j.n0.k.h
    public X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        instance.init((KeyStore) null);
        h.b(instance, "factory");
        TrustManager[] trustManagers = instance.getTrustManagers();
        if (trustManagers != null) {
            boolean z = true;
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                z = false;
            }
            if (z) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new j("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
            StringBuilder f2 = c.c.a.a.a.f("Unexpected default trust managers: ");
            String arrays = Arrays.toString(trustManagers);
            h.b(arrays, "java.util.Arrays.toString(this)");
            f2.append(arrays);
            throw new IllegalStateException(f2.toString().toString());
        }
        h.j();
        throw null;
    }
}
