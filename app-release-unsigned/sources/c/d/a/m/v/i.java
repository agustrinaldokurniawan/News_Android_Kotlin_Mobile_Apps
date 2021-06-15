package c.d.a.m.v;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import c.d.a.m.m;
import c.d.a.m.o;
import c.d.a.m.p;
import c.d.a.m.s;
import c.d.a.m.u.e;
import c.d.a.m.v.g;
import c.d.a.m.v.j;
import c.d.a.m.v.m;
import c.d.a.s.k.a;
import c.d.a.s.k.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class i<R> implements g.a, Runnable, Comparable<i<?>>, a.d {
    public Thread A;
    public m B;
    public m C;
    public Object D;
    public c.d.a.m.a E;
    public c.d.a.m.u.d<?> F;
    public volatile g G;
    public volatile boolean H;
    public volatile boolean I;
    public boolean J;
    public final h<R> e = new h<>();

    /* renamed from: f  reason: collision with root package name */
    public final List<Throwable> f910f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final c.d.a.s.k.d f911g = new d.b();

    /* renamed from: h  reason: collision with root package name */
    public final d f912h;

    /* renamed from: i  reason: collision with root package name */
    public final g.h.i.c<i<?>> f913i;

    /* renamed from: j  reason: collision with root package name */
    public final c<?> f914j = new c<>();

    /* renamed from: k  reason: collision with root package name */
    public final e f915k = new e();

    /* renamed from: l  reason: collision with root package name */
    public c.d.a.d f916l;

    /* renamed from: m  reason: collision with root package name */
    public m f917m;
    public c.d.a.f n;
    public o o;
    public int p;
    public int q;
    public k r;
    public p s;
    public a<R> t;
    public int u;
    public g v;
    public f w;
    public long x;
    public boolean y;
    public Object z;

    public interface a<R> {
    }

    public final class b<Z> implements j.a<Z> {
        public final c.d.a.m.a a;

        public b(c.d.a.m.a aVar) {
            this.a = aVar;
        }
    }

    public static class c<Z> {
        public m a;
        public s<Z> b;

        /* renamed from: c  reason: collision with root package name */
        public v<Z> f918c;
    }

    public interface d {
    }

    public static class e {
        public boolean a;
        public boolean b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f919c;

        public final boolean a(boolean z) {
            return (this.f919c || z || this.b) && this.a;
        }
    }

    public enum f {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum g {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public i(d dVar, g.h.i.c<i<?>> cVar) {
        this.f912h = dVar;
        this.f913i = cVar;
    }

    @Override // c.d.a.s.k.a.d
    public c.d.a.s.k.d a() {
        return this.f911g;
    }

    @Override // c.d.a.m.v.g.a
    public void b() {
        this.w = f.SWITCH_TO_SOURCE_SERVICE;
        ((m) this.t).i(this);
    }

    @Override // c.d.a.m.v.g.a
    public void c(m mVar, Object obj, c.d.a.m.u.d<?> dVar, c.d.a.m.a aVar, m mVar2) {
        this.B = mVar;
        this.D = obj;
        this.F = dVar;
        this.E = aVar;
        this.C = mVar2;
        boolean z2 = false;
        if (mVar != this.e.a().get(0)) {
            z2 = true;
        }
        this.J = z2;
        if (Thread.currentThread() != this.A) {
            this.w = f.DECODE_DATA;
            ((m) this.t).i(this);
            return;
        }
        g();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(i<?> iVar) {
        i<?> iVar2 = iVar;
        int ordinal = this.n.ordinal() - iVar2.n.ordinal();
        return ordinal == 0 ? this.u - iVar2.u : ordinal;
    }

    @Override // c.d.a.m.v.g.a
    public void d(m mVar, Exception exc, c.d.a.m.u.d<?> dVar, c.d.a.m.a aVar) {
        dVar.b();
        r rVar = new r("Fetching data failed", exc);
        Class<?> a2 = dVar.a();
        rVar.f968g = mVar;
        rVar.f969h = aVar;
        rVar.f970i = a2;
        this.f910f.add(rVar);
        if (Thread.currentThread() != this.A) {
            this.w = f.SWITCH_TO_SOURCE_SERVICE;
            ((m) this.t).i(this);
            return;
        }
        m();
    }

    public final <Data> w<R> e(c.d.a.m.u.d<?> dVar, Data data, c.d.a.m.a aVar) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            int i2 = c.d.a.s.f.b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            w<R> f2 = f(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Decoded result " + f2, elapsedRealtimeNanos, null);
            }
            return f2;
        } finally {
            dVar.b();
        }
    }

    public final <Data> w<R> f(Data data, c.d.a.m.a aVar) {
        c.d.a.m.u.e<Data> b2;
        u<Data, ?, R> d2 = this.e.d(data.getClass());
        p pVar = this.s;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z2 = aVar == c.d.a.m.a.RESOURCE_DISK_CACHE || this.e.r;
            o<Boolean> oVar = c.d.a.m.x.c.m.f1048d;
            Boolean bool = (Boolean) pVar.c(oVar);
            if (bool == null || (bool.booleanValue() && !z2)) {
                pVar = new p();
                pVar.d(this.s);
                pVar.b.put(oVar, Boolean.valueOf(z2));
            }
        }
        c.d.a.m.u.f fVar = this.f916l.f740c.e;
        synchronized (fVar) {
            e.a<?> aVar2 = fVar.b.get(data.getClass());
            if (aVar2 == null) {
                Iterator<e.a<?>> it = fVar.b.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a<?> next = it.next();
                    if (next.a().isAssignableFrom(data.getClass())) {
                        aVar2 = next;
                        break;
                    }
                }
            }
            if (aVar2 == null) {
                aVar2 = c.d.a.m.u.f.a;
            }
            b2 = aVar2.b(data);
        }
        try {
            return d2.a(b2, pVar, this.p, this.q, new b(aVar));
        } finally {
            b2.b();
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x006b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v28. Raw type applied. Possible types: c.d.a.m.v.w<R> */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Class<?>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [c.d.a.m.v.v] */
    /* JADX WARN: Type inference failed for: r0v9, types: [c.d.a.m.v.v] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
        // Method dump skipped, instructions count: 358
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.m.v.i.g():void");
    }

    public final g h() {
        int ordinal = this.v.ordinal();
        if (ordinal == 1) {
            return new x(this.e, this);
        }
        if (ordinal == 2) {
            return new d(this.e, this);
        }
        if (ordinal == 3) {
            return new b0(this.e, this);
        }
        if (ordinal == 5) {
            return null;
        }
        StringBuilder f2 = c.c.a.a.a.f("Unrecognized stage: ");
        f2.append(this.v);
        throw new IllegalStateException(f2.toString());
    }

    public final g i(g gVar) {
        g gVar2 = g.RESOURCE_CACHE;
        g gVar3 = g.DATA_CACHE;
        g gVar4 = g.FINISHED;
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return this.r.b() ? gVar2 : i(gVar2);
        }
        if (ordinal == 1) {
            return this.r.a() ? gVar3 : i(gVar3);
        }
        if (ordinal == 2) {
            return this.y ? gVar4 : g.SOURCE;
        }
        if (ordinal == 3 || ordinal == 5) {
            return gVar4;
        }
        throw new IllegalArgumentException("Unrecognized stage: " + gVar);
    }

    public final void j(String str, long j2, String str2) {
        StringBuilder h2 = c.c.a.a.a.h(str, " in ");
        h2.append(c.d.a.s.f.a(j2));
        h2.append(", load key: ");
        h2.append(this.o);
        h2.append(str2 != null ? c.c.a.a.a.q(", ", str2) : "");
        h2.append(", thread: ");
        h2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", h2.toString());
    }

    public final void k() {
        boolean a2;
        o();
        r rVar = new r("Failed to load resource", new ArrayList(this.f910f));
        m<?> mVar = (m) this.t;
        synchronized (mVar) {
            mVar.y = rVar;
        }
        synchronized (mVar) {
            mVar.f945g.a();
            if (mVar.C) {
                mVar.g();
            } else if (mVar.f944f.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!mVar.z) {
                mVar.z = true;
                m mVar2 = mVar.q;
                m.e eVar = mVar.f944f;
                Objects.requireNonNull(eVar);
                ArrayList arrayList = new ArrayList(eVar.e);
                mVar.e(arrayList.size() + 1);
                ((l) mVar.f949k).e(mVar, mVar2, null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m.d dVar = (m.d) it.next();
                    dVar.b.execute(new m.a(dVar.a));
                }
                mVar.d();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        e eVar2 = this.f915k;
        synchronized (eVar2) {
            eVar2.f919c = true;
            a2 = eVar2.a(false);
        }
        if (a2) {
            l();
        }
    }

    public final void l() {
        e eVar = this.f915k;
        synchronized (eVar) {
            eVar.b = false;
            eVar.a = false;
            eVar.f919c = false;
        }
        c<?> cVar = this.f914j;
        cVar.a = null;
        cVar.b = null;
        cVar.f918c = null;
        h<R> hVar = this.e;
        hVar.f900c = null;
        hVar.f901d = null;
        hVar.n = null;
        hVar.f903g = null;
        hVar.f907k = null;
        hVar.f905i = null;
        hVar.o = null;
        hVar.f906j = null;
        hVar.p = null;
        hVar.a.clear();
        hVar.f908l = false;
        hVar.b.clear();
        hVar.f909m = false;
        this.H = false;
        this.f916l = null;
        this.f917m = null;
        this.s = null;
        this.n = null;
        this.o = null;
        this.t = null;
        this.v = null;
        this.G = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.x = 0;
        this.I = false;
        this.z = null;
        this.f910f.clear();
        this.f913i.a(this);
    }

    public final void m() {
        this.A = Thread.currentThread();
        int i2 = c.d.a.s.f.b;
        this.x = SystemClock.elapsedRealtimeNanos();
        boolean z2 = false;
        while (!this.I && this.G != null && !(z2 = this.G.a())) {
            this.v = i(this.v);
            this.G = h();
            if (this.v == g.SOURCE) {
                this.w = f.SWITCH_TO_SOURCE_SERVICE;
                ((m) this.t).i(this);
                return;
            }
        }
        if ((this.v == g.FINISHED || this.I) && !z2) {
            k();
        }
    }

    public final void n() {
        int ordinal = this.w.ordinal();
        if (ordinal == 0) {
            this.v = i(g.INITIALIZE);
            this.G = h();
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                g();
                return;
            }
            StringBuilder f2 = c.c.a.a.a.f("Unrecognized run reason: ");
            f2.append(this.w);
            throw new IllegalStateException(f2.toString());
        }
        m();
    }

    public final void o() {
        Throwable th;
        this.f911g.a();
        if (this.H) {
            if (this.f910f.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f910f;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.H = true;
    }

    public void run() {
        c.d.a.m.u.d<?> dVar = this.F;
        try {
            if (this.I) {
                k();
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            n();
            if (dVar != null) {
                dVar.b();
            }
        } catch (c e2) {
            throw e2;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.b();
            }
            throw th;
        }
    }
}
