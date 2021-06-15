package c.d.a.m.v;

import android.os.SystemClock;
import android.util.Log;
import c.d.a.m.m;
import c.d.a.m.p;
import c.d.a.m.t;
import c.d.a.m.v.a;
import c.d.a.m.v.d0.a;
import c.d.a.m.v.d0.e;
import c.d.a.m.v.d0.f;
import c.d.a.m.v.d0.h;
import c.d.a.m.v.d0.i;
import c.d.a.m.v.i;
import c.d.a.m.v.q;
import c.d.a.q.g;
import c.d.a.s.g;
import c.d.a.s.k.a;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class l implements n, i.a, q.a {
    public static final boolean a = Log.isLoggable("Engine", 2);
    public final t b;

    /* renamed from: c  reason: collision with root package name */
    public final p f932c;

    /* renamed from: d  reason: collision with root package name */
    public final i f933d;
    public final b e;

    /* renamed from: f  reason: collision with root package name */
    public final z f934f;

    /* renamed from: g  reason: collision with root package name */
    public final c f935g;

    /* renamed from: h  reason: collision with root package name */
    public final a f936h;

    /* renamed from: i  reason: collision with root package name */
    public final a f937i;

    public static class a {
        public final i.d a;
        public final g.h.i.c<i<?>> b = c.d.a.s.k.a.a(150, new C0021a());

        /* renamed from: c  reason: collision with root package name */
        public int f938c;

        /* renamed from: c.d.a.m.v.l$a$a  reason: collision with other inner class name */
        public class C0021a implements a.b<i<?>> {
            public C0021a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // c.d.a.s.k.a.b
            public i<?> a() {
                a aVar = a.this;
                return new i(aVar.a, aVar.b);
            }
        }

        public a(i.d dVar) {
            this.a = dVar;
        }
    }

    public static class b {
        public final c.d.a.m.v.e0.a a;
        public final c.d.a.m.v.e0.a b;

        /* renamed from: c  reason: collision with root package name */
        public final c.d.a.m.v.e0.a f939c;

        /* renamed from: d  reason: collision with root package name */
        public final c.d.a.m.v.e0.a f940d;
        public final n e;

        /* renamed from: f  reason: collision with root package name */
        public final q.a f941f;

        /* renamed from: g  reason: collision with root package name */
        public final g.h.i.c<m<?>> f942g = c.d.a.s.k.a.a(150, new a());

        public class a implements a.b<m<?>> {
            public a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // c.d.a.s.k.a.b
            public m<?> a() {
                b bVar = b.this;
                return new m(bVar.a, bVar.b, bVar.f939c, bVar.f940d, bVar.e, bVar.f941f, bVar.f942g);
            }
        }

        public b(c.d.a.m.v.e0.a aVar, c.d.a.m.v.e0.a aVar2, c.d.a.m.v.e0.a aVar3, c.d.a.m.v.e0.a aVar4, n nVar, q.a aVar5) {
            this.a = aVar;
            this.b = aVar2;
            this.f939c = aVar3;
            this.f940d = aVar4;
            this.e = nVar;
            this.f941f = aVar5;
        }
    }

    public static class c implements i.d {
        public final a.AbstractC0017a a;
        public volatile c.d.a.m.v.d0.a b;

        public c(a.AbstractC0017a aVar) {
            this.a = aVar;
        }

        public c.d.a.m.v.d0.a a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        c.d.a.m.v.d0.d dVar = (c.d.a.m.v.d0.d) this.a;
                        f fVar = (f) dVar.b;
                        File cacheDir = fVar.a.getCacheDir();
                        e eVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (fVar.b != null) {
                            cacheDir = new File(cacheDir, fVar.b);
                        }
                        if (cacheDir != null) {
                            if (cacheDir.isDirectory() || cacheDir.mkdirs()) {
                                eVar = new e(cacheDir, dVar.a);
                            }
                        }
                        this.b = eVar;
                    }
                    if (this.b == null) {
                        this.b = new c.d.a.m.v.d0.b();
                    }
                }
            }
            return this.b;
        }
    }

    public class d {
        public final m<?> a;
        public final g b;

        public d(g gVar, m<?> mVar) {
            this.b = gVar;
            this.a = mVar;
        }
    }

    public l(c.d.a.m.v.d0.i iVar, a.AbstractC0017a aVar, c.d.a.m.v.e0.a aVar2, c.d.a.m.v.e0.a aVar3, c.d.a.m.v.e0.a aVar4, c.d.a.m.v.e0.a aVar5, boolean z) {
        this.f933d = iVar;
        c cVar = new c(aVar);
        this.f935g = cVar;
        a aVar6 = new a(z);
        this.f937i = aVar6;
        synchronized (this) {
            synchronized (aVar6) {
                aVar6.f850d = this;
            }
        }
        this.f932c = new p();
        this.b = new t();
        this.e = new b(aVar2, aVar3, aVar4, aVar5, this, this);
        this.f936h = new a(cVar);
        this.f934f = new z();
        ((h) iVar).f888d = this;
    }

    public static void d(String str, long j2, m mVar) {
        StringBuilder h2 = c.c.a.a.a.h(str, " in ");
        h2.append(c.d.a.s.f.a(j2));
        h2.append("ms, key: ");
        h2.append(mVar);
        Log.v("Engine", h2.toString());
    }

    @Override // c.d.a.m.v.q.a
    public void a(m mVar, q<?> qVar) {
        a aVar = this.f937i;
        synchronized (aVar) {
            a.b remove = aVar.b.remove(mVar);
            if (remove != null) {
                remove.f851c = null;
                remove.clear();
            }
        }
        if (qVar.e) {
            w wVar = (w) ((h) this.f933d).d(mVar, qVar);
        } else {
            this.f934f.a(qVar, false);
        }
    }

    public <R> d b(c.d.a.d dVar, Object obj, m mVar, int i2, int i3, Class<?> cls, Class<R> cls2, c.d.a.f fVar, k kVar, Map<Class<?>, t<?>> map, boolean z, boolean z2, p pVar, boolean z3, boolean z4, boolean z5, boolean z6, g gVar, Executor executor) {
        long j2;
        if (a) {
            int i4 = c.d.a.s.f.b;
            j2 = SystemClock.elapsedRealtimeNanos();
        } else {
            j2 = 0;
        }
        Objects.requireNonNull(this.f932c);
        o oVar = new o(obj, mVar, i2, i3, map, cls, cls2, pVar);
        synchronized (this) {
            q<?> c2 = c(oVar, z3, j2);
            if (c2 == null) {
                return g(dVar, obj, mVar, i2, i3, cls, cls2, fVar, kVar, map, z, z2, pVar, z3, z4, z5, z6, gVar, executor, oVar, j2);
            }
            ((c.d.a.q.h) gVar).p(c2, c.d.a.m.a.MEMORY_CACHE, false);
            return null;
        }
    }

    public final q<?> c(o oVar, boolean z, long j2) {
        q<?> qVar;
        Y y;
        Y y2;
        if (!z) {
            return null;
        }
        a aVar = this.f937i;
        synchronized (aVar) {
            a.b bVar = aVar.b.get(oVar);
            if (bVar == null) {
                qVar = null;
            } else {
                qVar = (q) bVar.get();
                if (qVar == null) {
                    aVar.b(bVar);
                }
            }
        }
        if (qVar != null) {
            qVar.a();
        }
        if (qVar != null) {
            if (a) {
                d("Loaded resource from active resources", j2, oVar);
            }
            return qVar;
        }
        h hVar = (h) this.f933d;
        synchronized (hVar) {
            g.a<Y> remove = hVar.a.remove(oVar);
            if (remove == null) {
                y = null;
            } else {
                hVar.f1164c -= (long) remove.b;
                y = remove.a;
            }
        }
        Y y3 = y;
        if (y3 == null) {
            y2 = null;
        } else {
            y2 = y3 instanceof q ? y3 : new q<>(y3, true, true, oVar, this);
        }
        if (y2 != null) {
            y2.a();
            this.f937i.a(oVar, y2);
        }
        if (y2 == null) {
            return null;
        }
        if (a) {
            d("Loaded resource from cache", j2, oVar);
        }
        return y2;
    }

    public synchronized void e(m<?> mVar, m mVar2, q<?> qVar) {
        if (qVar != null) {
            if (qVar.e) {
                this.f937i.a(mVar2, qVar);
            }
        }
        t tVar = this.b;
        Objects.requireNonNull(tVar);
        Map<m, m<?>> a2 = tVar.a(mVar.u);
        if (mVar.equals(a2.get(mVar2))) {
            a2.remove(mVar2);
        }
    }

    public void f(w<?> wVar) {
        if (wVar instanceof q) {
            ((q) wVar).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r23v0, resolved type: java.lang.Class<R> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> c.d.a.m.v.l.d g(c.d.a.d r17, java.lang.Object r18, c.d.a.m.m r19, int r20, int r21, java.lang.Class<?> r22, java.lang.Class<R> r23, c.d.a.f r24, c.d.a.m.v.k r25, java.util.Map<java.lang.Class<?>, c.d.a.m.t<?>> r26, boolean r27, boolean r28, c.d.a.m.p r29, boolean r30, boolean r31, boolean r32, boolean r33, c.d.a.q.g r34, java.util.concurrent.Executor r35, c.d.a.m.v.o r36, long r37) {
        /*
        // Method dump skipped, instructions count: 281
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.m.v.l.g(c.d.a.d, java.lang.Object, c.d.a.m.m, int, int, java.lang.Class, java.lang.Class, c.d.a.f, c.d.a.m.v.k, java.util.Map, boolean, boolean, c.d.a.m.p, boolean, boolean, boolean, boolean, c.d.a.q.g, java.util.concurrent.Executor, c.d.a.m.v.o, long):c.d.a.m.v.l$d");
    }
}
