package c.a.a.b.b;

import c.a.a.b.b.o.a.b.a;
import i.s.c.h;
import java.util.Objects;

public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ m e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f347f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f348g;

    public /* synthetic */ i(m mVar, a aVar, boolean z) {
        this.e = mVar;
        this.f347f = aVar;
        this.f348g = z;
    }

    public final void run() {
        m mVar = this.e;
        a aVar = this.f347f;
        boolean z = this.f348g;
        h.e(mVar, "this$0");
        h.e(aVar, "$newsEntity");
        c.a.a.b.b.o.a.a aVar2 = mVar.b;
        Objects.requireNonNull(aVar2);
        h.e(aVar, "newsEntity");
        aVar.f357i = z;
        aVar2.a.e(aVar);
    }
}
