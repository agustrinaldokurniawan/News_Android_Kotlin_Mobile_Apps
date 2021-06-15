package g.h.g;

import g.h.c.b.e;
import g.h.d.c;

public class b implements Runnable {
    public final /* synthetic */ m e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2491f;

    public b(c cVar, m mVar, int i2) {
        this.e = mVar;
        this.f2491f = i2;
    }

    public void run() {
        m mVar = this.e;
        int i2 = this.f2491f;
        e eVar = ((c.a) mVar).a;
        if (eVar != null) {
            eVar.d(i2);
        }
    }
}
