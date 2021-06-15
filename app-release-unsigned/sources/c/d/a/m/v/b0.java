package c.d.a.m.v;

import android.os.SystemClock;
import android.util.Log;
import c.d.a.m.a;
import c.d.a.m.d;
import c.d.a.m.m;
import c.d.a.m.v.g;
import c.d.a.m.w.n;
import c.d.a.s.f;
import java.util.Collections;
import java.util.List;

public class b0 implements g, g.a {
    public final h<?> e;

    /* renamed from: f  reason: collision with root package name */
    public final g.a f853f;

    /* renamed from: g  reason: collision with root package name */
    public int f854g;

    /* renamed from: h  reason: collision with root package name */
    public d f855h;

    /* renamed from: i  reason: collision with root package name */
    public Object f856i;

    /* renamed from: j  reason: collision with root package name */
    public volatile n.a<?> f857j;

    /* renamed from: k  reason: collision with root package name */
    public e f858k;

    public b0(h<?> hVar, g.a aVar) {
        this.e = hVar;
        this.f853f = aVar;
    }

    /* JADX INFO: finally extract failed */
    @Override // c.d.a.m.v.g
    public boolean a() {
        Object obj = this.f856i;
        if (obj != null) {
            this.f856i = null;
            int i2 = f.b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                d<X> e2 = this.e.e(obj);
                f fVar = new f(e2, obj, this.e.f905i);
                m mVar = this.f857j.a;
                h<?> hVar = this.e;
                this.f858k = new e(mVar, hVar.n);
                hVar.b().a(this.f858k, fVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f858k + ", data: " + obj + ", encoder: " + e2 + ", duration: " + f.a(elapsedRealtimeNanos));
                }
                this.f857j.f1009c.b();
                this.f855h = new d(Collections.singletonList(this.f857j.a), this.e, this);
            } catch (Throwable th) {
                this.f857j.f1009c.b();
                throw th;
            }
        }
        d dVar = this.f855h;
        if (dVar != null && dVar.a()) {
            return true;
        }
        this.f855h = null;
        this.f857j = null;
        boolean z = false;
        while (!z) {
            if (!(this.f854g < this.e.c().size())) {
                break;
            }
            List<n.a<?>> c2 = this.e.c();
            int i3 = this.f854g;
            this.f854g = i3 + 1;
            this.f857j = c2.get(i3);
            if (this.f857j != null && (this.e.p.c(this.f857j.f1009c.c()) || this.e.g(this.f857j.f1009c.a()))) {
                this.f857j.f1009c.e(this.e.o, new a0(this, this.f857j));
                z = true;
            }
        }
        return z;
    }

    @Override // c.d.a.m.v.g.a
    public void b() {
        throw new UnsupportedOperationException();
    }

    @Override // c.d.a.m.v.g.a
    public void c(m mVar, Object obj, c.d.a.m.u.d<?> dVar, a aVar, m mVar2) {
        this.f853f.c(mVar, obj, dVar, this.f857j.f1009c.c(), mVar);
    }

    @Override // c.d.a.m.v.g
    public void cancel() {
        n.a<?> aVar = this.f857j;
        if (aVar != null) {
            aVar.f1009c.cancel();
        }
    }

    @Override // c.d.a.m.v.g.a
    public void d(m mVar, Exception exc, c.d.a.m.u.d<?> dVar, a aVar) {
        this.f853f.d(mVar, exc, dVar, this.f857j.f1009c.c());
    }
}
