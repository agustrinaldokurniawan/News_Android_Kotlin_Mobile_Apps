package j.n0.h;

import i.o.e;
import i.s.c.h;
import j.a0;
import j.e0;
import j.h0;
import j.i0;
import j.j0;
import j.n;
import j.n0.c;
import j.p;
import j.x;
import j.z;
import java.util.List;
import k.m;
import k.t;

public final class a implements z {
    public final p a;

    public a(p pVar) {
        h.f(pVar, "cookieJar");
        this.a = pVar;
    }

    @Override // j.z
    public i0 a(z.a aVar) {
        boolean z;
        j0 j0Var;
        h.f(aVar, "chain");
        g gVar = (g) aVar;
        e0 e0Var = gVar.f3544f;
        e0.a aVar2 = new e0.a(e0Var);
        h0 h0Var = e0Var.e;
        if (h0Var != null) {
            a0 b = h0Var.b();
            if (b != null) {
                aVar2.b("Content-Type", b.f3358d);
            }
            long a2 = h0Var.a();
            if (a2 != -1) {
                aVar2.b("Content-Length", String.valueOf(a2));
                aVar2.d("Transfer-Encoding");
            } else {
                aVar2.b("Transfer-Encoding", "chunked");
                aVar2.d("Content-Length");
            }
        }
        int i2 = 0;
        if (e0Var.b("Host") == null) {
            aVar2.b("Host", c.u(e0Var.b, false));
        }
        if (e0Var.b("Connection") == null) {
            aVar2.b("Connection", "Keep-Alive");
        }
        if (e0Var.b("Accept-Encoding") == null && e0Var.b("Range") == null) {
            aVar2.b("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List<n> a3 = this.a.a(e0Var.b);
        if (!a3.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (T t : a3) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    T t2 = t;
                    if (i2 > 0) {
                        sb.append("; ");
                    }
                    sb.append(t2.f3460f);
                    sb.append('=');
                    sb.append(t2.f3461g);
                    i2 = i3;
                } else {
                    e.m();
                    throw null;
                }
            }
            String sb2 = sb.toString();
            h.b(sb2, "StringBuilder().apply(builderAction).toString()");
            aVar2.b("Cookie", sb2);
        }
        if (e0Var.b("User-Agent") == null) {
            aVar2.b("User-Agent", "okhttp/4.8.0");
        }
        i0 b2 = gVar.b(aVar2.a());
        e.d(this.a, e0Var.b, b2.f3412j);
        i0.a aVar3 = new i0.a(b2);
        aVar3.g(e0Var);
        if (z && i.x.e.d("gzip", i0.b(b2, "Content-Encoding", null, 2), true) && e.a(b2) && (j0Var = b2.f3413k) != null) {
            m mVar = new m(j0Var.e());
            x.a c2 = b2.f3412j.c();
            c2.d("Content-Encoding");
            c2.d("Content-Length");
            aVar3.d(c2.c());
            String b3 = i0.b(b2, "Content-Type", null, 2);
            h.f(mVar, "$this$buffer");
            aVar3.f3419g = new h(b3, -1, new t(mVar));
        }
        return aVar3.a();
    }
}
