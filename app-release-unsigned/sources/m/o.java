package m;

import i.m;
import i.s.b.l;
import i.s.c.i;

public final class o extends i implements l<Throwable, m> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f3839f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(d dVar) {
        super(1);
        this.f3839f = dVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // i.s.b.l
    public m o(Throwable th) {
        this.f3839f.cancel();
        return m.a;
    }
}
