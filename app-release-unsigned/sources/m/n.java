package m;

import d.a.e;
import h.a.t.a;
import i.b;
import i.s.c.h;
import j.e0;
import java.lang.reflect.Method;
import java.util.Objects;

public final class n implements f<T> {
    public final /* synthetic */ e a;

    public n(e eVar) {
        this.a = eVar;
    }

    @Override // m.f
    public void a(d<T> dVar, Throwable th) {
        h.f(dVar, "call");
        h.f(th, "t");
        this.a.a(a.n(th));
    }

    @Override // m.f
    public void b(d<T> dVar, a0<T> a0Var) {
        Object obj;
        e eVar;
        h.f(dVar, "call");
        h.f(a0Var, "response");
        if (a0Var.a()) {
            obj = a0Var.b;
            if (obj == null) {
                e0 b = dVar.b();
                Objects.requireNonNull(b);
                h.f(l.class, "type");
                Object cast = l.class.cast(b.f3397f.get(l.class));
                if (cast != null) {
                    h.b(cast, "call.request().tag(Invocation::class.java)!!");
                    Method method = ((l) cast).a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Response from ");
                    h.b(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    h.b(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(method.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    b bVar = new b(sb.toString());
                    eVar = this.a;
                    obj = a.n(bVar);
                } else {
                    h.j();
                    throw null;
                }
            } else {
                eVar = this.a;
            }
        } else {
            eVar = this.a;
            obj = a.n(new j(a0Var));
        }
        eVar.a(obj);
    }
}
