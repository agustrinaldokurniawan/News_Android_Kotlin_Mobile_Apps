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
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;

public final class g extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f3693d;
    public static final a e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f3694f = new OpenJSSE();

    public static final class a {
        public a(f fVar) {
        }
    }

    static {
        a aVar = new a(null);
        e = aVar;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f3693d = z;
    }

    @Override // j.n0.k.h
    public void d(SSLSocket sSLSocket, String str, List<d0> list) {
        h.f(sSLSocket, "sslSocket");
        h.f(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
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
                SSLParameters sSLParameters2 = sSLParameters;
                Object[] array = arrayList2.toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket2.setSSLParameters(sSLParameters);
                    return;
                }
                throw new j("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return;
        }
        h.f(sSLSocket, "sslSocket");
        h.f(list, "protocols");
    }

    @Override // j.n0.k.h
    public String f(SSLSocket sSLSocket) {
        h.f(sSLSocket, "sslSocket");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
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
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.f3694f);
        h.b(instance, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    @Override // j.n0.k.h
    public X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f3694f);
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
