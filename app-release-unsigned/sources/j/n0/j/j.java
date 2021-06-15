package j.n0.j;

import j.n0.f.a;
import java.io.IOException;
import java.util.List;

public final class j extends a {
    public final /* synthetic */ f e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3631f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f3632g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(String str, boolean z, String str2, boolean z2, f fVar, int i2, List list) {
        super(str2, z2);
        this.e = fVar;
        this.f3631f = i2;
        this.f3632g = list;
    }

    @Override // j.n0.f.a
    public long a() {
        if (!this.e.r.a(this.f3631f, this.f3632g)) {
            return -1;
        }
        try {
            this.e.F.Q(this.f3631f, b.f3573j);
            synchronized (this.e) {
                this.e.H.remove(Integer.valueOf(this.f3631f));
            }
            return -1;
        } catch (IOException unused) {
            return -1;
        }
    }
}
