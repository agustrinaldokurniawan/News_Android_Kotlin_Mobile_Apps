package j;

import i.s.c.h;
import k.g;

public final class g0 extends h0 {
    public final /* synthetic */ byte[] b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a0 f3403c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3404d;
    public final /* synthetic */ int e;

    public g0(byte[] bArr, a0 a0Var, int i2, int i3) {
        this.b = bArr;
        this.f3403c = a0Var;
        this.f3404d = i2;
        this.e = i3;
    }

    @Override // j.h0
    public long a() {
        return (long) this.f3404d;
    }

    @Override // j.h0
    public a0 b() {
        return this.f3403c;
    }

    @Override // j.h0
    public void c(g gVar) {
        h.f(gVar, "sink");
        gVar.i(this.b, this.e, this.f3404d);
    }
}
