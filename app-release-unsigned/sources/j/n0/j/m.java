package j.n0.j;

import i.j;
import i.s.c.h;
import j.c0;
import j.d0;
import j.e0;
import j.i0;
import j.n0.c;
import j.n0.g.i;
import j.n0.h.d;
import j.n0.h.e;
import j.n0.h.g;
import j.n0.j.o;
import j.x;
import j.y;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k.z;

public final class m implements d {
    public static final List<String> a = c.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List<String> b = c.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: c  reason: collision with root package name */
    public volatile o f3635c;

    /* renamed from: d  reason: collision with root package name */
    public final d0 f3636d;
    public volatile boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final i f3637f;

    /* renamed from: g  reason: collision with root package name */
    public final g f3638g;

    /* renamed from: h  reason: collision with root package name */
    public final f f3639h;

    public m(c0 c0Var, i iVar, g gVar, f fVar) {
        h.f(c0Var, "client");
        h.f(iVar, "connection");
        h.f(gVar, "chain");
        h.f(fVar, "http2Connection");
        this.f3637f = iVar;
        this.f3638g = gVar;
        this.f3639h = fVar;
        List<d0> list = c0Var.y;
        d0 d0Var = d0.H2_PRIOR_KNOWLEDGE;
        this.f3636d = !list.contains(d0Var) ? d0.HTTP_2 : d0Var;
    }

    @Override // j.n0.h.d
    public void a() {
        o oVar = this.f3635c;
        if (oVar != null) {
            ((o.a) oVar.g()).close();
        } else {
            h.j();
            throw null;
        }
    }

    @Override // j.n0.h.d
    public void b(e0 e0Var) {
        int i2;
        o oVar;
        h.f(e0Var, "request");
        if (this.f3635c == null) {
            boolean z = false;
            boolean z2 = e0Var.e != null;
            h.f(e0Var, "request");
            x xVar = e0Var.f3396d;
            ArrayList arrayList = new ArrayList(xVar.size() + 4);
            arrayList.add(new c(c.f3577c, e0Var.f3395c));
            k.i iVar = c.f3578d;
            y yVar = e0Var.b;
            h.f(yVar, "url");
            String b2 = yVar.b();
            String d2 = yVar.d();
            if (d2 != null) {
                b2 = b2 + '?' + d2;
            }
            arrayList.add(new c(iVar, b2));
            String b3 = e0Var.b("Host");
            if (b3 != null) {
                arrayList.add(new c(c.f3579f, b3));
            }
            arrayList.add(new c(c.e, e0Var.b.f3714d));
            int size = xVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                String b4 = xVar.b(i3);
                Locale locale = Locale.US;
                h.b(locale, "Locale.US");
                if (b4 != null) {
                    String lowerCase = b4.toLowerCase(locale);
                    h.b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (!a.contains(lowerCase) || (h.a(lowerCase, "te") && h.a(xVar.d(i3), "trailers"))) {
                        arrayList.add(new c(lowerCase, xVar.d(i3)));
                    }
                } else {
                    throw new j("null cannot be cast to non-null type java.lang.String");
                }
            }
            f fVar = this.f3639h;
            Objects.requireNonNull(fVar);
            h.f(arrayList, "requestHeaders");
            boolean z3 = !z2;
            synchronized (fVar.F) {
                synchronized (fVar) {
                    if (fVar.f3604l > 1073741823) {
                        fVar.u(b.f3572i);
                    }
                    if (!fVar.f3605m) {
                        i2 = fVar.f3604l;
                        fVar.f3604l = i2 + 2;
                        oVar = new o(i2, fVar, z3, false, null);
                        if (!z2 || fVar.C >= fVar.D || oVar.f3650c >= oVar.f3651d) {
                            z = true;
                        }
                        if (oVar.i()) {
                            fVar.f3601i.put(Integer.valueOf(i2), oVar);
                        }
                    } else {
                        throw new a();
                    }
                }
                fVar.F.u(z3, i2, arrayList);
            }
            if (z) {
                fVar.F.flush();
            }
            this.f3635c = oVar;
            if (this.e) {
                o oVar2 = this.f3635c;
                if (oVar2 == null) {
                    h.j();
                    throw null;
                } else {
                    oVar2.e(b.f3573j);
                    throw new IOException("Canceled");
                }
            } else {
                o oVar3 = this.f3635c;
                if (oVar3 != null) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    oVar3.f3655i.g((long) this.f3638g.f3546h, timeUnit);
                    o oVar4 = this.f3635c;
                    if (oVar4 != null) {
                        oVar4.f3656j.g((long) this.f3638g.f3547i, timeUnit);
                    } else {
                        h.j();
                        throw null;
                    }
                } else {
                    h.j();
                    throw null;
                }
            }
        }
    }

    @Override // j.n0.h.d
    public void c() {
        this.f3639h.F.flush();
    }

    @Override // j.n0.h.d
    public void cancel() {
        this.e = true;
        o oVar = this.f3635c;
        if (oVar != null) {
            oVar.e(b.f3573j);
        }
    }

    @Override // j.n0.h.d
    public k.x d(e0 e0Var, long j2) {
        h.f(e0Var, "request");
        o oVar = this.f3635c;
        if (oVar != null) {
            return oVar.g();
        }
        h.j();
        throw null;
    }

    @Override // j.n0.h.d
    public long e(i0 i0Var) {
        h.f(i0Var, "response");
        if (!e.a(i0Var)) {
            return 0;
        }
        return c.j(i0Var);
    }

    @Override // j.n0.h.d
    public z f(i0 i0Var) {
        h.f(i0Var, "response");
        o oVar = this.f3635c;
        if (oVar != null) {
            return oVar.f3653g;
        }
        h.j();
        throw null;
    }

    /* JADX INFO: finally extract failed */
    @Override // j.n0.h.d
    public i0.a g(boolean z) {
        x xVar;
        o oVar = this.f3635c;
        if (oVar != null) {
            synchronized (oVar) {
                oVar.f3655i.h();
                while (oVar.e.isEmpty() && oVar.f3657k == null) {
                    try {
                        oVar.l();
                    } catch (Throwable th) {
                        oVar.f3655i.l();
                        throw th;
                    }
                }
                oVar.f3655i.l();
                if (!oVar.e.isEmpty()) {
                    x removeFirst = oVar.e.removeFirst();
                    h.b(removeFirst, "headersQueue.removeFirst()");
                    xVar = removeFirst;
                } else {
                    Throwable th2 = oVar.f3658l;
                    if (th2 == null) {
                        b bVar = oVar.f3657k;
                        if (bVar == null) {
                            h.j();
                            throw null;
                        }
                        th2 = new u(bVar);
                    }
                    throw th2;
                }
            }
            d0 d0Var = this.f3636d;
            h.f(xVar, "headerBlock");
            h.f(d0Var, "protocol");
            ArrayList arrayList = new ArrayList(20);
            int size = xVar.size();
            j.n0.h.j jVar = null;
            for (int i2 = 0; i2 < size; i2++) {
                String b2 = xVar.b(i2);
                String d2 = xVar.d(i2);
                if (h.a(b2, ":status")) {
                    jVar = j.n0.h.j.a("HTTP/1.1 " + d2);
                } else if (!b.contains(b2)) {
                    h.f(b2, "name");
                    h.f(d2, "value");
                    arrayList.add(b2);
                    arrayList.add(i.x.e.y(d2).toString());
                }
            }
            if (jVar != null) {
                i0.a aVar = new i0.a();
                aVar.f(d0Var);
                aVar.f3416c = jVar.b;
                aVar.e(jVar.f3551c);
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    aVar.d(new x((String[]) array, null));
                    if (!z || aVar.f3416c != 100) {
                        return aVar;
                    }
                    return null;
                }
                throw new j("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        h.j();
        throw null;
    }

    @Override // j.n0.h.d
    public i h() {
        return this.f3637f;
    }
}
