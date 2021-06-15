package j.n0.j;

import j.n0.f.a;

public final class k extends a {
    public final /* synthetic */ f e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3633f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b f3634g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(String str, boolean z, String str2, boolean z2, f fVar, int i2, b bVar) {
        super(str2, z2);
        this.e = fVar;
        this.f3633f = i2;
        this.f3634g = bVar;
    }

    @Override // j.n0.f.a
    public long a() {
        this.e.r.c(this.f3633f, this.f3634g);
        synchronized (this.e) {
            this.e.H.remove(Integer.valueOf(this.f3633f));
        }
        return -1;
    }
}
