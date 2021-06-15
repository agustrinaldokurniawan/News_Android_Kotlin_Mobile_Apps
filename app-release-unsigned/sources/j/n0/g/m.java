package j.n0.g;

import i.s.c.h;
import j.e;
import j.l0;
import j.n0.c;
import j.t;
import j.y;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public final class m {
    public List<? extends Proxy> a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends InetSocketAddress> f3536c;

    /* renamed from: d  reason: collision with root package name */
    public final List<l0> f3537d = new ArrayList();
    public final j.a e;

    /* renamed from: f  reason: collision with root package name */
    public final k f3538f;

    /* renamed from: g  reason: collision with root package name */
    public final e f3539g;

    /* renamed from: h  reason: collision with root package name */
    public final t f3540h;

    public static final class a {
        public int a;
        public final List<l0> b;

        public a(List<l0> list) {
            h.f(list, "routes");
            this.b = list;
        }

        public final boolean a() {
            return this.a < this.b.size();
        }

        public final l0 b() {
            if (a()) {
                List<l0> list = this.b;
                int i2 = this.a;
                this.a = i2 + 1;
                return list.get(i2);
            }
            throw new NoSuchElementException();
        }
    }

    public m(j.a aVar, k kVar, e eVar, t tVar) {
        List<? extends Proxy> list;
        h.f(aVar, "address");
        h.f(kVar, "routeDatabase");
        h.f(eVar, "call");
        h.f(tVar, "eventListener");
        this.e = aVar;
        this.f3538f = kVar;
        this.f3539g = eVar;
        this.f3540h = tVar;
        i.o.h hVar = i.o.h.e;
        this.a = hVar;
        this.f3536c = hVar;
        y yVar = aVar.a;
        Proxy proxy = aVar.f3355j;
        h.f(eVar, "call");
        h.f(yVar, "url");
        if (proxy != null) {
            list = h.a.t.a.G(proxy);
        } else {
            URI h2 = yVar.h();
            if (h2.getHost() == null) {
                list = c.k(Proxy.NO_PROXY);
            } else {
                List<Proxy> select = aVar.f3356k.select(h2);
                list = select == null || select.isEmpty() ? c.k(Proxy.NO_PROXY) : c.v(select);
            }
        }
        this.a = list;
        this.b = 0;
        h.f(eVar, "call");
        h.f(yVar, "url");
        h.f(list, "proxies");
    }

    public final boolean a() {
        return b() || (this.f3537d.isEmpty() ^ true);
    }

    public final boolean b() {
        return this.b < this.a.size();
    }
}
