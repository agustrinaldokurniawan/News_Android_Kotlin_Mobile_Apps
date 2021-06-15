package c.d.a.m.v;

import c.d.a.m.m;
import java.util.Objects;

public class q<Z> implements w<Z> {
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f961f;

    /* renamed from: g  reason: collision with root package name */
    public final w<Z> f962g;

    /* renamed from: h  reason: collision with root package name */
    public final a f963h;

    /* renamed from: i  reason: collision with root package name */
    public final m f964i;

    /* renamed from: j  reason: collision with root package name */
    public int f965j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f966k;

    public interface a {
        void a(m mVar, q<?> qVar);
    }

    public q(w<Z> wVar, boolean z, boolean z2, m mVar, a aVar) {
        Objects.requireNonNull(wVar, "Argument must not be null");
        this.f962g = wVar;
        this.e = z;
        this.f961f = z2;
        this.f964i = mVar;
        Objects.requireNonNull(aVar, "Argument must not be null");
        this.f963h = aVar;
    }

    public synchronized void a() {
        if (!this.f966k) {
            this.f965j++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // c.d.a.m.v.w
    public int b() {
        return this.f962g.b();
    }

    @Override // c.d.a.m.v.w
    public Class<Z> c() {
        return this.f962g.c();
    }

    @Override // c.d.a.m.v.w
    public synchronized void d() {
        if (this.f965j > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f966k) {
            this.f966k = true;
            if (this.f961f) {
                this.f962g.d();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public void e() {
        boolean z;
        synchronized (this) {
            int i2 = this.f965j;
            if (i2 > 0) {
                z = true;
                int i3 = i2 - 1;
                this.f965j = i3;
                if (i3 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f963h.a(this.f964i, this);
        }
    }

    @Override // c.d.a.m.v.w
    public Z get() {
        return this.f962g.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.e + ", listener=" + this.f963h + ", key=" + this.f964i + ", acquired=" + this.f965j + ", isRecycled=" + this.f966k + ", resource=" + this.f962g + '}';
    }
}
