package d.a.z0;

import android.os.Handler;
import android.os.Looper;
import d.a.r0;
import i.q.f;
import i.s.c.h;

public final class a extends b {
    public volatile a _immediate;

    /* renamed from: f  reason: collision with root package name */
    public final a f1838f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f1839g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1840h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1841i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Handler handler, String str, boolean z) {
        super(null);
        a aVar = null;
        this.f1839g = handler;
        this.f1840h = str;
        this.f1841i = z;
        this._immediate = z ? this : aVar;
        a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new a(handler, str, true);
            this._immediate = aVar2;
        }
        this.f1838f = aVar2;
    }

    @Override // d.a.s
    public void d0(f fVar, Runnable runnable) {
        this.f1839g.post(runnable);
    }

    @Override // d.a.s
    public boolean e0(f fVar) {
        return !this.f1841i || (h.a(Looper.myLooper(), this.f1839g.getLooper()) ^ true);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f1839g == this.f1839g;
    }

    @Override // d.a.r0
    public r0 f0() {
        return this.f1838f;
    }

    public int hashCode() {
        return System.identityHashCode(this.f1839g);
    }

    @Override // d.a.s, d.a.r0
    public String toString() {
        String g0 = g0();
        if (g0 != null) {
            return g0;
        }
        String str = this.f1840h;
        if (str == null) {
            str = this.f1839g.toString();
        }
        return this.f1841i ? c.c.a.a.a.q(str, ".immediate") : str;
    }
}
