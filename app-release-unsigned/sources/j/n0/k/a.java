package j.n0.k;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import i.o.e;
import i.s.c.h;
import j.d0;
import j.n0.k.i.b;
import j.n0.k.i.f;
import j.n0.k.i.g;
import j.n0.k.i.i;
import j.n0.k.i.j;
import j.n0.k.i.k;
import j.n0.m.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

public final class a extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f3678d = (h.f3695c.c() && Build.VERSION.SDK_INT >= 29);
    public static final a e = null;

    /* renamed from: f  reason: collision with root package name */
    public final List<k> f3679f;

    public a() {
        k[] kVarArr = new k[4];
        kVarArr[0] = h.a("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29 ? new j.n0.k.i.a() : null;
        f.a aVar = f.b;
        kVarArr[1] = new j(f.a);
        kVarArr[2] = new j(i.a);
        kVarArr[3] = new j(g.a);
        List i2 = e.i(kVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) i2).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((k) next).c()) {
                arrayList.add(next);
            }
        }
        this.f3679f = arrayList;
    }

    @Override // j.n0.k.h
    public c b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        h.f(x509TrustManager, "trustManager");
        h.f(x509TrustManager, "trustManager");
        b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new b(x509TrustManager, x509TrustManagerExtensions);
        }
        return bVar != null ? bVar : super.b(x509TrustManager);
    }

    @Override // j.n0.k.h
    public void d(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        T t;
        h.f(sSLSocket, "sslSocket");
        h.f(list, "protocols");
        Iterator<T> it = this.f3679f.iterator();
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
    public String f(SSLSocket sSLSocket) {
        T t;
        h.f(sSLSocket, "sslSocket");
        Iterator<T> it = this.f3679f.iterator();
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
    @SuppressLint({"NewApi"})
    public boolean h(String str) {
        h.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
