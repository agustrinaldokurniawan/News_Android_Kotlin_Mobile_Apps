package j.n0.h;

import c.c.a.a.a;
import i.s.c.h;
import j.e0;
import j.i0;
import j.n0.g.c;
import j.n0.g.e;
import j.z;
import java.util.List;

public final class g implements z.a {
    public int a;
    public final e b;

    /* renamed from: c  reason: collision with root package name */
    public final List<z> f3542c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3543d;
    public final c e;

    /* renamed from: f  reason: collision with root package name */
    public final e0 f3544f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3545g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3546h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3547i;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends j.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public g(e eVar, List<? extends z> list, int i2, c cVar, e0 e0Var, int i3, int i4, int i5) {
        h.f(eVar, "call");
        h.f(list, "interceptors");
        h.f(e0Var, "request");
        this.b = eVar;
        this.f3542c = list;
        this.f3543d = i2;
        this.e = cVar;
        this.f3544f = e0Var;
        this.f3545g = i3;
        this.f3546h = i4;
        this.f3547i = i5;
    }

    public static g a(g gVar, int i2, c cVar, e0 e0Var, int i3, int i4, int i5, int i6) {
        int i7 = (i6 & 1) != 0 ? gVar.f3543d : i2;
        c cVar2 = (i6 & 2) != 0 ? gVar.e : cVar;
        e0 e0Var2 = (i6 & 4) != 0 ? gVar.f3544f : e0Var;
        int i8 = (i6 & 8) != 0 ? gVar.f3545g : i3;
        int i9 = (i6 & 16) != 0 ? gVar.f3546h : i4;
        int i10 = (i6 & 32) != 0 ? gVar.f3547i : i5;
        h.f(e0Var2, "request");
        return new g(gVar.b, gVar.f3542c, i7, cVar2, e0Var2, i8, i9, i10);
    }

    public i0 b(e0 e0Var) {
        h.f(e0Var, "request");
        boolean z = false;
        if (this.f3543d < this.f3542c.size()) {
            this.a++;
            c cVar = this.e;
            if (cVar != null) {
                if (cVar.e.b(e0Var.b)) {
                    if (!(this.a == 1)) {
                        StringBuilder f2 = a.f("network interceptor ");
                        f2.append(this.f3542c.get(this.f3543d - 1));
                        f2.append(" must call proceed() exactly once");
                        throw new IllegalStateException(f2.toString().toString());
                    }
                } else {
                    StringBuilder f3 = a.f("network interceptor ");
                    f3.append(this.f3542c.get(this.f3543d - 1));
                    f3.append(" must retain the same host and port");
                    throw new IllegalStateException(f3.toString().toString());
                }
            }
            g a2 = a(this, this.f3543d + 1, null, e0Var, 0, 0, 0, 58);
            z zVar = this.f3542c.get(this.f3543d);
            i0 a3 = zVar.a(a2);
            if (a3 != null) {
                if (this.e != null) {
                    if (!(this.f3543d + 1 >= this.f3542c.size() || a2.a == 1)) {
                        throw new IllegalStateException(("network interceptor " + zVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a3.f3413k != null) {
                    z = true;
                }
                if (z) {
                    return a3;
                }
                throw new IllegalStateException(("interceptor " + zVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + zVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
