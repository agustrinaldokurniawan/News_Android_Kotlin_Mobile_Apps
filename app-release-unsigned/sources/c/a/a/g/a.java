package c.a.a.g;

import c.a.a.b.e.b;
import g.n.p;
import i.s.c.h;
import java.util.List;

public final /* synthetic */ class a implements p {
    public final /* synthetic */ b a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(b bVar, c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    @Override // g.n.p
    public final void a(Object obj) {
        b bVar = this.a;
        c cVar = this.b;
        List<c.a.a.b.d.a.a> list = (List) obj;
        int i2 = c.X;
        h.e(bVar, "$newsAdapter");
        h.e(cVar, "this$0");
        if (list != null) {
            bVar.e(list);
            cVar.B0(list);
        }
    }
}
