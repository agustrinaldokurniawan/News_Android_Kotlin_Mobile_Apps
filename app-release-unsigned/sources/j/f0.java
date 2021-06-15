package j;

import i.s.c.h;
import k.g;
import k.i;

public final class f0 extends h0 {
    public final /* synthetic */ i b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a0 f3400c;

    public f0(i iVar, a0 a0Var) {
        this.b = iVar;
        this.f3400c = a0Var;
    }

    @Override // j.h0
    public long a() {
        return (long) this.b.d();
    }

    @Override // j.h0
    public a0 b() {
        return this.f3400c;
    }

    @Override // j.h0
    public void c(g gVar) {
        h.f(gVar, "sink");
        gVar.m(this.b);
    }
}
