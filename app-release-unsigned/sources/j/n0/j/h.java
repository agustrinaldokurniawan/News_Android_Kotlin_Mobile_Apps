package j.n0.j;

import j.n0.f.a;
import java.io.IOException;
import k.e;

public final class h extends a {
    public final /* synthetic */ f e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3624f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e f3625g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f3626h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f3627i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(String str, boolean z, String str2, boolean z2, f fVar, int i2, e eVar, int i3, boolean z3) {
        super(str2, z2);
        this.e = fVar;
        this.f3624f = i2;
        this.f3625g = eVar;
        this.f3626h = i3;
        this.f3627i = z3;
    }

    @Override // j.n0.f.a
    public long a() {
        try {
            boolean d2 = this.e.r.d(this.f3624f, this.f3625g, this.f3626h, this.f3627i);
            if (d2) {
                this.e.F.Q(this.f3624f, b.f3573j);
            }
            if (!d2 && !this.f3627i) {
                return -1;
            }
            synchronized (this.e) {
                this.e.H.remove(Integer.valueOf(this.f3624f));
            }
            return -1;
        } catch (IOException unused) {
            return -1;
        }
    }
}
