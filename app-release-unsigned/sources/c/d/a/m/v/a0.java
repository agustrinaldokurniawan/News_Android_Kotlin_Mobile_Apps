package c.d.a.m.v;

import c.d.a.m.m;
import c.d.a.m.u.d;
import c.d.a.m.v.g;
import c.d.a.m.w.n;

public class a0 implements d.a<Object> {
    public final /* synthetic */ n.a e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b0 f852f;

    public a0(b0 b0Var, n.a aVar) {
        this.f852f = b0Var;
        this.e = aVar;
    }

    @Override // c.d.a.m.u.d.a
    public void d(Exception exc) {
        b0 b0Var = this.f852f;
        n.a<?> aVar = this.e;
        n.a<?> aVar2 = b0Var.f857j;
        if (aVar2 != null && aVar2 == aVar) {
            b0 b0Var2 = this.f852f;
            n.a aVar3 = this.e;
            g.a aVar4 = b0Var2.f853f;
            e eVar = b0Var2.f858k;
            d<Data> dVar = aVar3.f1009c;
            aVar4.d(eVar, exc, dVar, dVar.c());
        }
    }

    @Override // c.d.a.m.u.d.a
    public void f(Object obj) {
        b0 b0Var = this.f852f;
        n.a<?> aVar = this.e;
        n.a<?> aVar2 = b0Var.f857j;
        if (aVar2 != null && aVar2 == aVar) {
            b0 b0Var2 = this.f852f;
            n.a aVar3 = this.e;
            k kVar = b0Var2.e.p;
            if (obj == null || !kVar.c(aVar3.f1009c.c())) {
                g.a aVar4 = b0Var2.f853f;
                m mVar = aVar3.a;
                d<Data> dVar = aVar3.f1009c;
                aVar4.c(mVar, obj, dVar, dVar.c(), b0Var2.f858k);
                return;
            }
            b0Var2.f856i = obj;
            b0Var2.f853f.b();
        }
    }
}
