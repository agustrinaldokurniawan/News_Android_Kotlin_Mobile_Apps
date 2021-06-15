package j.n0.g;

import i.j;
import i.s.b.a;
import i.s.c.i;
import j.w;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

public final class h extends i implements a<List<? extends X509Certificate>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i f3522f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(0);
        this.f3522f = iVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // i.s.b.a
    public List<? extends X509Certificate> c() {
        w wVar = this.f3522f.f3524d;
        if (wVar != null) {
            List<Certificate> c2 = wVar.c();
            ArrayList arrayList = new ArrayList(h.a.t.a.l(c2, 10));
            for (T t : c2) {
                if (t != null) {
                    arrayList.add(t);
                } else {
                    throw new j("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            }
            return arrayList;
        }
        i.s.c.h.j();
        throw null;
    }
}
