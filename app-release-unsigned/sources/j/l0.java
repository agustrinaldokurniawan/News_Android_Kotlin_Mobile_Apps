package j;

import c.c.a.a.a;
import i.s.c.h;
import java.net.InetSocketAddress;
import java.net.Proxy;

public final class l0 {
    public final a a;
    public final Proxy b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f3443c;

    public l0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        h.f(aVar, "address");
        h.f(proxy, "proxy");
        h.f(inetSocketAddress, "socketAddress");
        this.a = aVar;
        this.b = proxy;
        this.f3443c = inetSocketAddress;
    }

    public final boolean a() {
        return this.a.f3351f != null && this.b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            return h.a(l0Var.a, this.a) && h.a(l0Var.b, this.b) && h.a(l0Var.f3443c, this.f3443c);
        }
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        return this.f3443c.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder f2 = a.f("Route{");
        f2.append(this.f3443c);
        f2.append('}');
        return f2.toString();
    }
}
