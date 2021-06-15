package j;

import i.s.c.h;
import i.x.e;
import j.n0.c;
import j.y;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class a {
    public final y a;
    public final List<d0> b;

    /* renamed from: c  reason: collision with root package name */
    public final List<m> f3349c;

    /* renamed from: d  reason: collision with root package name */
    public final s f3350d;
    public final SocketFactory e;

    /* renamed from: f  reason: collision with root package name */
    public final SSLSocketFactory f3351f;

    /* renamed from: g  reason: collision with root package name */
    public final HostnameVerifier f3352g;

    /* renamed from: h  reason: collision with root package name */
    public final g f3353h;

    /* renamed from: i  reason: collision with root package name */
    public final c f3354i;

    /* renamed from: j  reason: collision with root package name */
    public final Proxy f3355j = null;

    /* renamed from: k  reason: collision with root package name */
    public final ProxySelector f3356k;

    public a(String str, int i2, s sVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, c cVar, Proxy proxy, List<? extends d0> list, List<m> list2, ProxySelector proxySelector) {
        h.f(str, "uriHost");
        h.f(sVar, "dns");
        h.f(socketFactory, "socketFactory");
        h.f(cVar, "proxyAuthenticator");
        h.f(list, "protocols");
        h.f(list2, "connectionSpecs");
        h.f(proxySelector, "proxySelector");
        this.f3350d = sVar;
        this.e = socketFactory;
        this.f3351f = sSLSocketFactory;
        this.f3352g = hostnameVerifier;
        this.f3353h = gVar;
        this.f3354i = cVar;
        this.f3356k = proxySelector;
        y.a aVar = new y.a();
        String str2 = "https";
        String str3 = sSLSocketFactory != null ? str2 : "http";
        h.f(str3, "scheme");
        boolean z = true;
        if (e.d(str3, "http", true)) {
            str2 = "http";
        } else if (!e.d(str3, str2, true)) {
            throw new IllegalArgumentException(c.c.a.a.a.q("unexpected scheme: ", str3));
        }
        aVar.b = str2;
        h.f(str, "host");
        String Z = h.a.t.a.Z(y.b.d(y.b, str, 0, 0, false, 7));
        if (Z != null) {
            aVar.e = Z;
            if ((1 > i2 || 65535 < i2) ? false : z) {
                aVar.f3724f = i2;
                this.a = aVar.a();
                this.b = c.v(list);
                this.f3349c = c.v(list2);
                return;
            }
            throw new IllegalArgumentException(c.c.a.a.a.l("unexpected port: ", i2).toString());
        }
        throw new IllegalArgumentException(c.c.a.a.a.q("unexpected host: ", str));
    }

    public final boolean a(a aVar) {
        h.f(aVar, "that");
        return h.a(this.f3350d, aVar.f3350d) && h.a(this.f3354i, aVar.f3354i) && h.a(this.b, aVar.b) && h.a(this.f3349c, aVar.f3349c) && h.a(this.f3356k, aVar.f3356k) && h.a(this.f3355j, aVar.f3355j) && h.a(this.f3351f, aVar.f3351f) && h.a(this.f3352g, aVar.f3352g) && h.a(this.f3353h, aVar.f3353h) && this.a.f3717h == aVar.a.f3717h;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && a(aVar);
        }
    }

    public int hashCode() {
        int hashCode = this.f3350d.hashCode();
        int hashCode2 = this.f3354i.hashCode();
        int hashCode3 = this.b.hashCode();
        int hashCode4 = this.f3349c.hashCode();
        int hashCode5 = this.f3356k.hashCode();
        int hashCode6 = Objects.hashCode(this.f3355j);
        int hashCode7 = Objects.hashCode(this.f3351f);
        int hashCode8 = Objects.hashCode(this.f3352g);
        return Objects.hashCode(this.f3353h) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder f2 = c.c.a.a.a.f("Address{");
        f2.append(this.a.f3716g);
        f2.append(':');
        f2.append(this.a.f3717h);
        f2.append(", ");
        if (this.f3355j != null) {
            sb = c.c.a.a.a.f("proxy=");
            obj = this.f3355j;
        } else {
            sb = c.c.a.a.a.f("proxySelector=");
            obj = this.f3356k;
        }
        sb.append(obj);
        f2.append(sb.toString());
        f2.append("}");
        return f2.toString();
    }
}
