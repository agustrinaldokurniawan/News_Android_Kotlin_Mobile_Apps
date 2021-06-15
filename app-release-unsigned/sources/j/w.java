package j;

import i.c;
import i.o.h;
import i.s.c.i;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class w {
    public final c a;
    public final m0 b;

    /* renamed from: c  reason: collision with root package name */
    public final j f3709c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Certificate> f3710d;

    public static final class a extends i implements i.s.b.a<List<? extends Certificate>> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ i.s.b.a f3711f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i.s.b.a aVar) {
            super(0);
            this.f3711f = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // i.s.b.a
        public List<? extends Certificate> c() {
            try {
                return (List) this.f3711f.c();
            } catch (SSLPeerUnverifiedException unused) {
                return h.e;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends java.security.cert.Certificate> */
    /* JADX WARN: Multi-variable type inference failed */
    public w(m0 m0Var, j jVar, List<? extends Certificate> list, i.s.b.a<? extends List<? extends Certificate>> aVar) {
        i.s.c.h.f(m0Var, "tlsVersion");
        i.s.c.h.f(jVar, "cipherSuite");
        i.s.c.h.f(list, "localCertificates");
        i.s.c.h.f(aVar, "peerCertificatesFn");
        this.b = m0Var;
        this.f3709c = jVar;
        this.f3710d = list;
        this.a = h.a.t.a.F(new a(aVar));
    }

    public static final w a(SSLSession sSLSession) {
        List list;
        i.s.c.h.f(sSLSession, "$this$handshake");
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            int hashCode = cipherSuite.hashCode();
            if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(c.c.a.a.a.q("cipherSuite == ", cipherSuite));
            }
            j b2 = j.s.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            } else if (!i.s.c.h.a("NONE", protocol)) {
                m0 a2 = m0.f3456k.a(protocol);
                try {
                    Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                    list = peerCertificates != null ? j.n0.c.k((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length)) : h.e;
                } catch (SSLPeerUnverifiedException unused) {
                    list = h.e;
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new w(a2, b2, localCertificates != null ? j.n0.c.k((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length)) : h.e, new v(list));
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IllegalStateException("cipherSuite == null".toString());
        }
    }

    public final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        i.s.c.h.b(type, "type");
        return type;
    }

    public final List<Certificate> c() {
        return (List) this.a.getValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            return wVar.b == this.b && i.s.c.h.a(wVar.f3709c, this.f3709c) && i.s.c.h.a(wVar.c(), c()) && i.s.c.h.a(wVar.f3710d, this.f3710d);
        }
    }

    public int hashCode() {
        int hashCode = this.f3709c.hashCode();
        int hashCode2 = c().hashCode();
        return this.f3710d.hashCode() + ((hashCode2 + ((hashCode + ((this.b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        List<Certificate> c2 = c();
        ArrayList arrayList = new ArrayList(h.a.t.a.l(c2, 10));
        Iterator<T> it = c2.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder h2 = c.c.a.a.a.h("Handshake{", "tlsVersion=");
        h2.append(this.b);
        h2.append(' ');
        h2.append("cipherSuite=");
        h2.append(this.f3709c);
        h2.append(' ');
        h2.append("peerCertificates=");
        h2.append(obj);
        h2.append(' ');
        h2.append("localCertificates=");
        List<Certificate> list = this.f3710d;
        ArrayList arrayList2 = new ArrayList(h.a.t.a.l(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b(it2.next()));
        }
        h2.append(arrayList2);
        h2.append('}');
        return h2.toString();
    }
}
