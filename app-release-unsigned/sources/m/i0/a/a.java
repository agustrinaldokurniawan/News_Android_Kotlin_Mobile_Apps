package m.i0.a;

import c.e.b.i;
import j.h0;
import j.j0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import m.c0;
import m.h;

public final class a extends h.a {
    public final i a;

    public a(i iVar) {
        this.a = iVar;
    }

    @Override // m.h.a
    public h<?, h0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, c0 c0Var) {
        return new b(this.a, this.a.b(new c.e.b.b0.a(type)));
    }

    @Override // m.h.a
    public h<j0, ?> b(Type type, Annotation[] annotationArr, c0 c0Var) {
        return new c(this.a, this.a.b(new c.e.b.b0.a(type)));
    }
}
