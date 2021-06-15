package j.n0.k;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import i.j;
import i.s.c.f;
import j.d0;
import j.n0.k.i.f;
import j.n0.k.i.g;
import j.n0.k.i.h;
import j.n0.k.i.i;
import j.n0.k.i.k;
import j.n0.k.i.l;
import j.n0.m.c;
import j.n0.m.e;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

public final class b extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f3680d;
    public static final a e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public final List<k> f3681f;

    /* renamed from: g  reason: collision with root package name */
    public final h f3682g;

    public static final class a {
        public a(f fVar) {
        }
    }

    /* renamed from: j.n0.k.b$b  reason: collision with other inner class name */
    public static final class C0126b implements e {
        public final X509TrustManager a;
        public final Method b;

        public C0126b(X509TrustManager x509TrustManager, Method method) {
            i.s.c.h.f(x509TrustManager, "trustManager");
            i.s.c.h.f(method, "findByIssuerAndSignatureMethod");
            this.a = x509TrustManager;
            this.b = method;
        }

        @Override // j.n0.m.e
        public X509Certificate a(X509Certificate x509Certificate) {
            i.s.c.h.f(x509Certificate, "cert");
            try {
                Object invoke = this.b.invoke(this.a, x509Certificate);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new j("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0126b)) {
                return false;
            }
            C0126b bVar = (C0126b) obj;
            return i.s.c.h.a(this.a, bVar.a) && i.s.c.h.a(this.b, bVar.b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.a;
            int i2 = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.b;
            if (method != null) {
                i2 = method.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("CustomTrustRootIndex(trustManager=");
            f2.append(this.a);
            f2.append(", findByIssuerAndSignatureMethod=");
            f2.append(this.b);
            f2.append(")");
            return f2.toString();
        }
    }

    static {
        boolean z = false;
        if (h.f3695c.c() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f3680d = z;
    }

    public b() {
        l lVar;
        Method method;
        Method method2;
        k[] kVarArr = new k[4];
        l.a aVar = l.f3702h;
        i.s.c.h.f("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt" + ".OpenSSLSocketFactoryImpl");
            Class<?> cls3 = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            i.s.c.h.b(cls3, "paramsClass");
            lVar = new l(cls, cls2, cls3);
        } catch (Exception e2) {
            h.a.i("unable to load android socket classes", 5, e2);
            lVar = null;
        }
        kVarArr[0] = lVar;
        f.a aVar2 = j.n0.k.i.f.b;
        kVarArr[1] = new j.n0.k.i.j(j.n0.k.i.f.a);
        kVarArr[2] = new j.n0.k.i.j(i.a);
        kVarArr[3] = new j.n0.k.i.j(g.a);
        List i2 = i.o.e.i(kVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) i2).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((k) next).c()) {
                arrayList.add(next);
            }
        }
        this.f3681f = arrayList;
        try {
            Class<?> cls4 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls4.getMethod("get", new Class[0]);
            method = cls4.getMethod("open", String.class);
            method2 = cls4.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.f3682g = new h(method3, method, method2);
    }

    @Override // j.n0.k.h
    public c b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        i.s.c.h.f(x509TrustManager, "trustManager");
        i.s.c.h.f(x509TrustManager, "trustManager");
        j.n0.k.i.b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new j.n0.k.i.b(x509TrustManager, x509TrustManagerExtensions);
        }
        return bVar != null ? bVar : super.b(x509TrustManager);
    }

    @Override // j.n0.k.h
    public e c(X509TrustManager x509TrustManager) {
        i.s.c.h.f(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            i.s.c.h.b(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C0126b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // j.n0.k.h
    public void d(SSLSocket sSLSocket, String str, List<d0> list) {
        T t;
        i.s.c.h.f(sSLSocket, "sslSocket");
        i.s.c.h.f(list, "protocols");
        Iterator<T> it = this.f3681f.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.a(sSLSocket)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            t2.d(sSLSocket, str, list);
        }
    }

    @Override // j.n0.k.h
    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        i.s.c.h.f(socket, "socket");
        i.s.c.h.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    @Override // j.n0.k.h
    public String f(SSLSocket sSLSocket) {
        T t;
        i.s.c.h.f(sSLSocket, "sslSocket");
        Iterator<T> it = this.f3681f.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.a(sSLSocket)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            return t2.b(sSLSocket);
        }
        return null;
    }

    @Override // j.n0.k.h
    public Object g(String str) {
        i.s.c.h.f(str, "closer");
        h hVar = this.f3682g;
        Objects.requireNonNull(hVar);
        i.s.c.h.f(str, "closer");
        Method method = hVar.a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, new Object[0]);
            Method method2 = hVar.b;
            if (method2 != null) {
                method2.invoke(invoke, str);
                return invoke;
            }
            i.s.c.h.j();
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // j.n0.k.h
    public boolean h(String str) {
        i.s.c.h.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // j.n0.k.h
    public void k(String str, Object obj) {
        i.s.c.h.f(str, "message");
        h hVar = this.f3682g;
        Objects.requireNonNull(hVar);
        boolean z = false;
        if (obj != null) {
            try {
                Method method = hVar.f3701c;
                if (method != null) {
                    method.invoke(obj, new Object[0]);
                    z = true;
                } else {
                    i.s.c.h.j();
                    throw null;
                }
            } catch (Exception unused) {
            }
        }
        if (!z) {
            h.j(this, str, 5, null, 4, null);
        }
    }
}
