package j;

import i.o.e;
import i.s.c.f;
import i.s.c.h;
import i.s.c.r;
import j.n0.m.c;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import k.i;

public final class g {
    public static final g a = new g(e.r(new ArrayList()), null, 2);
    public static final a b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f3401c;

    /* renamed from: d  reason: collision with root package name */
    public final c f3402d;

    public static final class a {
        public a(f fVar) {
        }

        public final String a(Certificate certificate) {
            h.f(certificate, "certificate");
            return "sha256/" + b((X509Certificate) certificate).a();
        }

        public final i b(X509Certificate x509Certificate) {
            h.f(x509Certificate, "$this$sha256Hash");
            i.a aVar = i.f3739f;
            PublicKey publicKey = x509Certificate.getPublicKey();
            h.b(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            h.b(encoded, "publicKey.encoded");
            return i.a.c(aVar, encoded, 0, 0, 3).b("SHA-256");
        }
    }

    public static final class b {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            Objects.requireNonNull(bVar);
            if (!h.a(null, null)) {
                return false;
            }
            Objects.requireNonNull(bVar);
            if (!h.a(null, null)) {
                return false;
            }
            Objects.requireNonNull(bVar);
            return !(h.a(null, null) ^ true);
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append((String) null);
            sb.append('/');
            throw null;
        }
    }

    public g(Set<b> set, c cVar) {
        h.f(set, "pins");
        this.f3401c = set;
        this.f3402d = cVar;
    }

    public g(Set set, c cVar, int i2) {
        int i3 = i2 & 2;
        h.f(set, "pins");
        this.f3401c = set;
        this.f3402d = null;
    }

    public final void a(String str, i.s.b.a<? extends List<? extends X509Certificate>> aVar) {
        h.f(str, "hostname");
        h.f(aVar, "cleanedPeerCertificatesFn");
        h.f(str, "hostname");
        Set<b> set = this.f3401c;
        List<b> list = i.o.h.e;
        for (T t : set) {
            Objects.requireNonNull(t);
            h.f(str, "hostname");
            if (i.x.e.u(null, "**.", false, 2)) {
                throw null;
            } else if (i.x.e.u(null, "*.", false, 2)) {
                throw null;
            } else if (h.a(str, null)) {
                if (list.isEmpty()) {
                    list = new ArrayList();
                }
                if (!(list instanceof i.s.c.s.a)) {
                    list.add(t);
                } else {
                    ClassCastException classCastException = new ClassCastException(c.c.a.a.a.c(list.getClass().getName(), " cannot be cast to ", "kotlin.collections.MutableList"));
                    h.h(classCastException, r.class.getName());
                    throw classCastException;
                }
            }
        }
        if (!list.isEmpty()) {
            List<X509Certificate> list2 = (List) aVar.c();
            for (X509Certificate x509Certificate : list2) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    Objects.requireNonNull((b) it.next());
                    throw null;
                }
            }
            StringBuilder h2 = c.c.a.a.a.h("Certificate pinning failure!", "\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list2) {
                h2.append("\n    ");
                h.f(x509Certificate2, "certificate");
                StringBuilder sb = new StringBuilder();
                sb.append("sha256/");
                h.f(x509Certificate2, "$this$sha256Hash");
                i.a aVar2 = i.f3739f;
                PublicKey publicKey = x509Certificate2.getPublicKey();
                h.b(publicKey, "publicKey");
                byte[] encoded = publicKey.getEncoded();
                h.b(encoded, "publicKey.encoded");
                sb.append(i.a.c(aVar2, encoded, 0, 0, 3).b("SHA-256").a());
                h2.append(sb.toString());
                h2.append(": ");
                Principal subjectDN = x509Certificate2.getSubjectDN();
                h.b(subjectDN, "element.subjectDN");
                h2.append(subjectDN.getName());
            }
            h2.append("\n  Pinned certificates for ");
            h2.append(str);
            h2.append(":");
            for (b bVar : list) {
                h2.append("\n    ");
                h2.append(bVar);
            }
            String sb2 = h2.toString();
            h.b(sb2, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb2);
        }
    }

    public final g b(c cVar) {
        h.f(cVar, "certificateChainCleaner");
        return h.a(this.f3402d, cVar) ? this : new g(this.f3401c, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            return h.a(gVar.f3401c, this.f3401c) && h.a(gVar.f3402d, this.f3402d);
        }
    }

    public int hashCode() {
        int hashCode = (this.f3401c.hashCode() + 1517) * 41;
        c cVar = this.f3402d;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
