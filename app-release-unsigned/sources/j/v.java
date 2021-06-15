package j;

import i.s.b.a;
import i.s.c.i;
import java.security.cert.Certificate;
import java.util.List;

public final class v extends i implements a<List<? extends Certificate>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ List f3708f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(List list) {
        super(0);
        this.f3708f = list;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // i.s.b.a
    public List<? extends Certificate> c() {
        return this.f3708f;
    }
}
