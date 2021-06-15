package j.n0.m;

import i.s.c.h;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class b implements e {
    public final Map<X500Principal, Set<X509Certificate>> a;

    public b(X509Certificate... x509CertificateArr) {
        h.f(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            h.b(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.a = linkedHashMap;
    }

    @Override // j.n0.m.e
    public X509Certificate a(X509Certificate x509Certificate) {
        boolean z;
        h.f(x509Certificate, "cert");
        Set<X509Certificate> set = this.a.get(x509Certificate.getIssuerX500Principal());
        T t = null;
        if (set == null) {
            return null;
        }
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            try {
                x509Certificate.verify(next.getPublicKey());
                z = true;
                continue;
            } catch (Exception unused) {
                z = false;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        return t;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof b) && h.a(((b) obj).a, this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
