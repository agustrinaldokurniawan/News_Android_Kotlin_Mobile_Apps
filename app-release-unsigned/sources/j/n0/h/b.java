package j.n0.h;

import c.c.a.a.a;
import i.s.c.h;
import j.d0;
import j.e0;
import j.h0;
import j.i0;
import j.j0;
import j.n0.g.c;
import j.n0.g.e;
import j.t;
import j.w;
import j.x;
import j.z;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import k.s;
import k.x;

public final class b implements z {
    public final boolean a;

    public b(boolean z) {
        this.a = z;
    }

    @Override // j.z
    public i0 a(z.a aVar) {
        i0.a aVar2;
        int i2;
        i0 i0Var;
        boolean z;
        h.f(aVar, "chain");
        g gVar = (g) aVar;
        c cVar = gVar.e;
        if (cVar != null) {
            e0 e0Var = gVar.f3544f;
            h0 h0Var = e0Var.e;
            long currentTimeMillis = System.currentTimeMillis();
            h.f(e0Var, "request");
            try {
                t tVar = cVar.f3488d;
                e eVar = cVar.f3487c;
                Objects.requireNonNull(tVar);
                h.f(eVar, "call");
                cVar.f3489f.b(e0Var);
                t tVar2 = cVar.f3488d;
                e eVar2 = cVar.f3487c;
                Objects.requireNonNull(tVar2);
                h.f(eVar2, "call");
                h.f(e0Var, "request");
                boolean z2 = true;
                if (!f.a(e0Var.f3395c) || h0Var == null) {
                    cVar.f3487c.j(cVar, true, false, null);
                    aVar2 = null;
                } else {
                    if (i.x.e.d("100-continue", e0Var.b("Expect"), true)) {
                        cVar.c();
                        aVar2 = cVar.d(true);
                        cVar.e();
                        z = false;
                    } else {
                        aVar2 = null;
                        z = true;
                    }
                    if (aVar2 == null) {
                        x b = cVar.b(e0Var, false);
                        h.f(b, "$this$buffer");
                        s sVar = new s(b);
                        h0Var.c(sVar);
                        sVar.close();
                    } else {
                        cVar.f3487c.j(cVar, true, false, null);
                        if (!cVar.b.j()) {
                            cVar.f3489f.h().l();
                        }
                    }
                    z2 = z;
                }
                try {
                    cVar.f3489f.a();
                    if (aVar2 == null) {
                        aVar2 = cVar.d(false);
                        if (aVar2 == null) {
                            h.j();
                            throw null;
                        } else if (z2) {
                            cVar.e();
                            z2 = false;
                        }
                    }
                    aVar2.g(e0Var);
                    aVar2.e = cVar.b.f3524d;
                    aVar2.f3423k = currentTimeMillis;
                    aVar2.f3424l = System.currentTimeMillis();
                    i0 a2 = aVar2.a();
                    int i3 = a2.f3410h;
                    if (i3 == 100) {
                        i0.a d2 = cVar.d(false);
                        if (d2 != null) {
                            if (z2) {
                                cVar.e();
                            }
                            d2.g(e0Var);
                            d2.e = cVar.b.f3524d;
                            d2.f3423k = currentTimeMillis;
                            d2.f3424l = System.currentTimeMillis();
                            a2 = d2.a();
                            i3 = a2.f3410h;
                        } else {
                            h.j();
                            throw null;
                        }
                    }
                    h.f(a2, "response");
                    t tVar3 = cVar.f3488d;
                    e eVar3 = cVar.f3487c;
                    Objects.requireNonNull(tVar3);
                    h.f(eVar3, "call");
                    h.f(a2, "response");
                    if (!this.a || i3 != 101) {
                        i2 = i3;
                        h.f(a2, "response");
                        e0 e0Var2 = a2.e;
                        d0 d0Var = a2.f3408f;
                        int i4 = a2.f3410h;
                        String str = a2.f3409g;
                        w wVar = a2.f3411i;
                        x.a c2 = a2.f3412j.c();
                        i0 i0Var2 = a2.f3414l;
                        i0 i0Var3 = a2.f3415m;
                        i0 i0Var4 = a2.n;
                        long j2 = a2.o;
                        long j3 = a2.p;
                        c cVar2 = a2.q;
                        h.f(a2, "response");
                        try {
                            String b2 = i0.b(a2, "Content-Type", null, 2);
                            long e = cVar.f3489f.e(a2);
                            c.b bVar = new c.b(cVar, cVar.f3489f.f(a2), e);
                            h.f(bVar, "$this$buffer");
                            h hVar = new h(b2, e, new k.t(bVar));
                            if (!(i4 >= 0)) {
                                throw new IllegalStateException(a.l("code < 0: ", i4).toString());
                            } else if (e0Var2 == null) {
                                throw new IllegalStateException("request == null".toString());
                            } else if (d0Var == null) {
                                throw new IllegalStateException("protocol == null".toString());
                            } else if (str != null) {
                                i0Var = new i0(e0Var2, d0Var, str, i4, wVar, c2.c(), hVar, i0Var2, i0Var3, i0Var4, j2, j3, cVar2);
                            } else {
                                throw new IllegalStateException("message == null".toString());
                            }
                        } catch (IOException e2) {
                            t tVar4 = cVar.f3488d;
                            e eVar4 = cVar.f3487c;
                            Objects.requireNonNull(tVar4);
                            h.f(eVar4, "call");
                            h.f(e2, "ioe");
                            cVar.f(e2);
                            throw e2;
                        }
                    } else {
                        h.f(a2, "response");
                        e0 e0Var3 = a2.e;
                        d0 d0Var2 = a2.f3408f;
                        int i5 = a2.f3410h;
                        String str2 = a2.f3409g;
                        w wVar2 = a2.f3411i;
                        x.a c3 = a2.f3412j.c();
                        i0 i0Var5 = a2.f3414l;
                        i0 i0Var6 = a2.f3415m;
                        i0 i0Var7 = a2.n;
                        long j4 = a2.o;
                        i2 = i3;
                        long j5 = a2.p;
                        c cVar3 = a2.q;
                        j0 j0Var = j.n0.c.f3469c;
                        if (!(i5 >= 0)) {
                            throw new IllegalStateException(a.l("code < 0: ", i5).toString());
                        } else if (e0Var3 == null) {
                            throw new IllegalStateException("request == null".toString());
                        } else if (d0Var2 == null) {
                            throw new IllegalStateException("protocol == null".toString());
                        } else if (str2 != null) {
                            i0Var = new i0(e0Var3, d0Var2, str2, i5, wVar2, c3.c(), j0Var, i0Var5, i0Var6, i0Var7, j4, j5, cVar3);
                        } else {
                            throw new IllegalStateException("message == null".toString());
                        }
                    }
                    if (i.x.e.d("close", i0Var.e.b("Connection"), true) || i.x.e.d("close", i0.b(i0Var, "Connection", null, 2), true)) {
                        cVar.f3489f.h().l();
                    }
                    if (i2 == 204 || i2 == 205) {
                        j0 j0Var2 = i0Var.f3413k;
                        if ((j0Var2 != null ? j0Var2.b() : -1) > 0) {
                            StringBuilder g2 = a.g("HTTP ", i2, " had non-zero Content-Length: ");
                            j0 j0Var3 = i0Var.f3413k;
                            g2.append(j0Var3 != null ? Long.valueOf(j0Var3.b()) : null);
                            throw new ProtocolException(g2.toString());
                        }
                    }
                    return i0Var;
                } catch (IOException e3) {
                    t tVar5 = cVar.f3488d;
                    e eVar5 = cVar.f3487c;
                    Objects.requireNonNull(tVar5);
                    h.f(eVar5, "call");
                    h.f(e3, "ioe");
                    cVar.f(e3);
                    throw e3;
                }
            } catch (IOException e4) {
                t tVar6 = cVar.f3488d;
                e eVar6 = cVar.f3487c;
                Objects.requireNonNull(tVar6);
                h.f(eVar6, "call");
                h.f(e4, "ioe");
                cVar.f(e4);
                throw e4;
            }
        } else {
            h.j();
            throw null;
        }
    }
}
