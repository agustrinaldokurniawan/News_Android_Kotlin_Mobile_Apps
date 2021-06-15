package m;

import m.i;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ i.b.a e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f3813f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Throwable f3814g;

    public /* synthetic */ a(i.b.a aVar, f fVar, Throwable th) {
        this.e = aVar;
        this.f3813f = fVar;
        this.f3814g = th;
    }

    public final void run() {
        i.b.a aVar = this.e;
        this.f3813f.a(i.b.this, this.f3814g);
    }
}
