package j.n0.k.i;

import android.net.http.X509TrustManagerExtensions;
import i.j;
import i.s.c.h;
import j.n0.m.c;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

public final class b extends c {
    public final X509TrustManager a;
    public final X509TrustManagerExtensions b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        h.f(x509TrustManager, "trustManager");
        h.f(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.a = x509TrustManager;
        this.b = x509TrustManagerExtensions;
    }

    @Override // j.n0.m.c
    public List<Certificate> a(List<? extends Certificate> list, String str) {
        h.f(list, "chain");
        h.f(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.b.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                h.b(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new j("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).a == this.a;
    }

    public int hashCode() {
        return System.identityHashCode(this.a);
    }
}
