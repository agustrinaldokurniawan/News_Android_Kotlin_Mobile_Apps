package j.n0.j;

import i.s.c.h;
import java.util.List;
import k.e;

public final class r implements s {
    @Override // j.n0.j.s
    public boolean a(int i2, List<c> list) {
        h.f(list, "requestHeaders");
        return true;
    }

    @Override // j.n0.j.s
    public boolean b(int i2, List<c> list, boolean z) {
        h.f(list, "responseHeaders");
        return true;
    }

    @Override // j.n0.j.s
    public void c(int i2, b bVar) {
        h.f(bVar, "errorCode");
    }

    @Override // j.n0.j.s
    public boolean d(int i2, k.h hVar, int i3, boolean z) {
        h.f(hVar, "source");
        ((e) hVar).a((long) i3);
        return true;
    }
}
