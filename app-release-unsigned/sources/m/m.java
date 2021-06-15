package m;

import i.s.b.l;
import i.s.c.i;

public final class m extends i implements l<Throwable, i.m> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f3838f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(d dVar) {
        super(1);
        this.f3838f = dVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // i.s.b.l
    public i.m o(Throwable th) {
        this.f3838f.cancel();
        return i.m.a;
    }
}
