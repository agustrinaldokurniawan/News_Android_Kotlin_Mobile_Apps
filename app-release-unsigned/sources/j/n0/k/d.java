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
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

public final class d extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f3685d;
    public static final a e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f3686f;

    public static final class a {
        public a(f fVar) {
        }

        public final boolean a(int i2, int i3, int i4) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i2 ? version.major() > i2 : version.minor() != i3 ? version.minor() > i3 : version.patch() >= i4;
        }
    }

    public static final class b implements ConscryptHostnameVerifier {
        public static final b a = new b();
    }

    static {
        a aVar = new a(null);
        e = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && aVar.a(2, 1, 0)) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f3685d = z;
    }

    public d() {
        Provider build = Conscrypt.newProviderBuilder().provideTrustManager(true).build();
        h.b(build, "Conscrypt.newProviderBui…rustManager(true).build()");
        this.f3686f = build;
    }

    @Override // j.n0.k.h
    public void d(SSLSocket sSLSocket, String str, List<d0> list) {
        h.f(sSLSocket, "sslSocket");
        h.f(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
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
            Object[] array = arrayList2.toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
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
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        super.f(sSLSocket);
        return null;
    }

    @Override // j.n0.k.h
    public SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f3686f);
        h.b(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    @Override // j.n0.k.h
    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        h.f(x509TrustManager, "trustManager");
        SSLContext instance = SSLContext.getInstance("TLS", this.f3686f);
        h.b(instance, "SSLContext.getInstance(\"TLS\", provider)");
        instance.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = instance.getSocketFactory();
        Conscrypt.setUseEngineSocket(socketFactory, true);
        h.b(socketFactory, "newSSLContext().apply {\n…ineSocket(it, true)\n    }");
        return socketFactory;
    }

    @Override // j.n0.k.h
    public X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        h.b(instance, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = instance.getTrustManagers();
        if (trustManagers != null) {
            boolean z = true;
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                z = false;
            }
            if (z) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager != null) {
                    X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                    Conscrypt.setHostnameVerifier(x509TrustManager, b.a);
                    return x509TrustManager;
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
