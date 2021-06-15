package j.n0.j;

import j.n0.f.a;
import java.io.IOException;
import java.util.List;

public final class i extends a {
    public final /* synthetic */ f e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3628f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f3629g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f3630h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str, boolean z, String str2, boolean z2, f fVar, int i2, List list, boolean z3) {
        super(str2, z2);
        this.e = fVar;
        this.f3628f = i2;
        this.f3629g = list;
        this.f3630h = z3;
    }

    @Override // j.n0.f.a
    public long a() {
        boolean b = this.e.r.b(this.f3628f, this.f3629g, this.f3630h);
        if (b) {
            try {
                this.e.F.Q(this.f3628f, b.f3573j);
            } catch (IOException unused) {
                return -1;
            }
        }
        if (!b && !this.f3630h) {
            return -1;
        }
        synchronized (this.e) {
            this.e.H.remove(Integer.valueOf(this.f3628f));
        }
        return -1;
    }
}
