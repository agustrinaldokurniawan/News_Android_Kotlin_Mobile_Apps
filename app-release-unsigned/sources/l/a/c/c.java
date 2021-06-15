package l.a.c;

import i.m;
import i.s.b.a;
import i.s.c.i;
import java.util.List;

public final class c extends i implements a<m> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f3784f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List<l.a.c.j.a> f3785g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(b bVar, List<l.a.c.j.a> list) {
        super(0);
        this.f3784f = bVar;
        this.f3785g = list;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // i.s.b.a
    public m c() {
        b bVar = this.f3784f;
        a.b(bVar.a, this.f3785g, false, 2);
        return m.a;
    }
}
