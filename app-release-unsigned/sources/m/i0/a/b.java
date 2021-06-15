package m.i0.a;

import c.e.b.c0.c;
import c.e.b.i;
import c.e.b.x;
import j.a0;
import j.f0;
import j.h0;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Objects;
import k.e;
import k.f;
import m.h;

public final class b<T> implements h<T, h0> {
    public static final a0 a = a0.a.a("application/json; charset=UTF-8");
    public static final Charset b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    public final i f3832c;

    /* renamed from: d  reason: collision with root package name */
    public final x<T> f3833d;

    static {
        a0.a aVar = a0.f3357c;
    }

    public b(i iVar, x<T> xVar) {
        this.f3832c = iVar;
        this.f3833d = xVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // m.h
    public h0 a(Object obj) {
        e eVar = new e();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new f(eVar), b);
        Objects.requireNonNull(this.f3832c);
        c cVar = new c(outputStreamWriter);
        cVar.n = false;
        this.f3833d.b(cVar, obj);
        cVar.close();
        a0 a0Var = a;
        k.i g0 = eVar.g0();
        i.s.c.h.f(g0, "content");
        i.s.c.h.f(g0, "$this$toRequestBody");
        return new f0(g0, a0Var);
    }
}
