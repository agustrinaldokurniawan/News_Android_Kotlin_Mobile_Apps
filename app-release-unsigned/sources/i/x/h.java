package i.x;

import i.s.b.l;
import i.s.c.i;
import i.u.c;

public final class h extends i implements l<c, String> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ CharSequence f3346f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(CharSequence charSequence) {
        super(1);
        this.f3346f = charSequence;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // i.s.b.l
    public String o(c cVar) {
        c cVar2 = cVar;
        i.s.c.h.e(cVar2, "it");
        return e.v(this.f3346f, cVar2);
    }
}
