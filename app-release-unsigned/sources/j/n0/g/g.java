package j.n0.g;

import i.s.b.a;
import i.s.c.h;
import i.s.c.i;
import j.n0.m.c;
import j.w;
import java.security.cert.Certificate;
import java.util.List;

public final class g extends i implements a<List<? extends Certificate>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j.g f3519f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ w f3520g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ j.a f3521h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(j.g gVar, w wVar, j.a aVar) {
        super(0);
        this.f3519f = gVar;
        this.f3520g = wVar;
        this.f3521h = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // i.s.b.a
    public List<? extends Certificate> c() {
        c cVar = this.f3519f.f3402d;
        if (cVar != null) {
            return cVar.a(this.f3520g.c(), this.f3521h.a.f3716g);
        }
        h.j();
        throw null;
    }
}
