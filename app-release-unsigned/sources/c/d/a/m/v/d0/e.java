package c.d.a.m.v.d0;

import android.util.Log;
import c.d.a.k.a;
import c.d.a.m.m;
import c.d.a.m.v.d0.a;
import c.d.a.m.v.d0.c;
import c.d.a.m.v.f;
import java.io.File;
import java.io.IOException;

public class e implements a {
    public final k a;
    public final File b;

    /* renamed from: c  reason: collision with root package name */
    public final long f886c;

    /* renamed from: d  reason: collision with root package name */
    public final c f887d = new c();
    public a e;

    @Deprecated
    public e(File file, long j2) {
        this.b = file;
        this.f886c = j2;
        this.a = new k();
    }

    @Override // c.d.a.m.v.d0.a
    public void a(m mVar, a.b bVar) {
        c.a aVar;
        String a2 = this.a.a(mVar);
        c cVar = this.f887d;
        synchronized (cVar) {
            aVar = cVar.a.get(a2);
            if (aVar == null) {
                c.b bVar2 = cVar.b;
                synchronized (bVar2.a) {
                    aVar = bVar2.a.poll();
                }
                if (aVar == null) {
                    aVar = new c.a();
                }
                cVar.a.put(a2, aVar);
            }
            aVar.b++;
        }
        aVar.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + a2 + " for for Key: " + mVar);
            }
            try {
                c.d.a.k.a c2 = c();
                if (c2.Q(a2) == null) {
                    a.c u = c2.u(a2);
                    if (u != null) {
                        try {
                            f fVar = (f) bVar;
                            if (fVar.a.a(fVar.b, u.b(0), fVar.f899c)) {
                                c.d.a.k.a.b(c.d.a.k.a.this, u, true);
                                u.f775c = true;
                            }
                            if (!u.f775c) {
                                try {
                                    u.a();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            if (!u.f775c) {
                                try {
                                    u.a();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("Had two simultaneous puts for: " + a2);
                    }
                }
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
        } finally {
            this.f887d.a(a2);
        }
    }

    @Override // c.d.a.m.v.d0.a
    public File b(m mVar) {
        String a2 = this.a.a(mVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a2 + " for for Key: " + mVar);
        }
        try {
            a.e Q = c().Q(a2);
            if (Q != null) {
                return Q.a[0];
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }

    public final synchronized c.d.a.k.a c() {
        if (this.e == null) {
            this.e = c.d.a.k.a.b0(this.b, 1, 1, this.f886c);
        }
        return this.e;
    }
}
