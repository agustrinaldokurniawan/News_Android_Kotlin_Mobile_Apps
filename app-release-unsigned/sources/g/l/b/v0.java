package g.l.b;

import g.n.e;
import g.n.j;
import g.n.v;
import g.n.w;
import g.s.a;
import g.s.b;
import g.s.c;

public class v0 implements c, w {
    public final v e;

    /* renamed from: f  reason: collision with root package name */
    public j f2779f = null;

    /* renamed from: g  reason: collision with root package name */
    public b f2780g = null;

    public v0(m mVar, v vVar) {
        this.e = vVar;
    }

    @Override // g.n.i
    public e a() {
        e();
        return this.f2779f;
    }

    @Override // g.s.c
    public a c() {
        e();
        return this.f2780g.b;
    }

    public void d(e.a aVar) {
        j jVar = this.f2779f;
        jVar.d("handleLifecycleEvent");
        jVar.g(aVar.a());
    }

    public void e() {
        if (this.f2779f == null) {
            this.f2779f = new j(this);
            this.f2780g = new b(this);
        }
    }

    @Override // g.n.w
    public v g() {
        e();
        return this.e;
    }
}
