package j;

import i.j;
import i.s.b.a;
import i.s.c.i;
import j.n0.m.c;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

public final class h extends i implements a<List<? extends X509Certificate>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f3405f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f3406g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f3407h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(g gVar, List list, String str) {
        super(0);
        this.f3405f = gVar;
        this.f3406g = list;
        this.f3407h = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // i.s.b.a
    public List<? extends X509Certificate> c() {
        List<Certificate> list;
        c cVar = this.f3405f.f3402d;
        if (cVar == null || (list = cVar.a(this.f3406g, this.f3407h)) == null) {
            list = this.f3406g;
        }
        ArrayList arrayList = new ArrayList(h.a.t.a.l(list, 10));
        for (T t : list) {
            if (t != null) {
                arrayList.add(t);
            } else {
                throw new j("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
        }
        return arrayList;
    }
}
