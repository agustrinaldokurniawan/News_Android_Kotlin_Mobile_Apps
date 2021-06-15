package j.n0.k;

import i.j;
import i.s.c.f;
import j.c0;
import j.d0;
import j.n0.m.b;
import j.n0.m.c;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import k.e;

public class h {
    public static volatile h a;
    public static final Logger b = Logger.getLogger(c0.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final a f3695c;

    public static final class a {
        public a(f fVar) {
        }

        public final List<String> a(List<? extends d0> list) {
            i.s.c.h.f(list, "protocols");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                T next = it.next();
                if (next != d0.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(h.a.t.a.l(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((d0) it2.next()).f3394m);
            }
            return arrayList2;
        }

        public final byte[] b(List<? extends d0> list) {
            i.s.c.h.f(list, "protocols");
            e eVar = new e();
            Iterator it = ((ArrayList) a(list)).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                eVar.r0(str.length());
                eVar.w0(str);
            }
            return eVar.W(eVar.f3738f);
        }

        public final boolean c() {
            return i.s.c.h.a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b0, code lost:
        if (r0 != null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d6, code lost:
        if (r0 != null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fc, code lost:
        if (r0 != null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0124, code lost:
        if (java.lang.Integer.parseInt(r0) >= 9) goto L_0x0187;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018b  */
    static {
        /*
        // Method dump skipped, instructions count: 415
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.k.h.<clinit>():void");
    }

    public static /* synthetic */ void j(h hVar, String str, int i2, Throwable th, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 4;
        }
        int i4 = i3 & 4;
        hVar.i(str, i2, null);
    }

    public void a(SSLSocket sSLSocket) {
        i.s.c.h.f(sSLSocket, "sslSocket");
    }

    public c b(X509TrustManager x509TrustManager) {
        i.s.c.h.f(x509TrustManager, "trustManager");
        return new j.n0.m.a(c(x509TrustManager));
    }

    public j.n0.m.e c(X509TrustManager x509TrustManager) {
        i.s.c.h.f(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        i.s.c.h.b(acceptedIssuers, "trustManager.acceptedIssuers");
        return new b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List<d0> list) {
        i.s.c.h.f(sSLSocket, "sslSocket");
        i.s.c.h.f(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        i.s.c.h.f(socket, "socket");
        i.s.c.h.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i2);
    }

    public String f(SSLSocket sSLSocket) {
        i.s.c.h.f(sSLSocket, "sslSocket");
        return null;
    }

    public Object g(String str) {
        i.s.c.h.f(str, "closer");
        if (b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean h(String str) {
        i.s.c.h.f(str, "hostname");
        return true;
    }

    public void i(String str, int i2, Throwable th) {
        i.s.c.h.f(str, "message");
        b.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void k(String str, Object obj) {
        i.s.c.h.f(str, "message");
        if (obj == null) {
            str = c.c.a.a.a.q(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(str, 5, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS");
        i.s.c.h.b(instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        i.s.c.h.f(x509TrustManager, "trustManager");
        try {
            SSLContext l2 = l();
            l2.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = l2.getSocketFactory();
            i.s.c.h.b(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        i.s.c.h.b(instance, "factory");
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
            i.s.c.h.b(arrays, "java.util.Arrays.toString(this)");
            f2.append(arrays);
            throw new IllegalStateException(f2.toString().toString());
        }
        i.s.c.h.j();
        throw null;
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        i.s.c.h.b(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
