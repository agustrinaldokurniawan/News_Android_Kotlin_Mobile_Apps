package c.d.a.q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import c.d.a.c;
import c.d.a.f;
import c.d.a.m.a;
import c.d.a.m.v.l;
import c.d.a.m.v.r;
import c.d.a.m.v.w;
import c.d.a.q.j.g;
import c.d.a.q.k.c;
import c.d.a.s.j;
import c.d.a.s.k.d;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class h<R> implements c, g, g {
    public static final boolean a = Log.isLoggable("Request", 2);
    public int A;
    public int B;
    public boolean C;
    public RuntimeException D;
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public final d f1138c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1139d;
    public final e<R> e;

    /* renamed from: f  reason: collision with root package name */
    public final d f1140f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f1141g;

    /* renamed from: h  reason: collision with root package name */
    public final c.d.a.d f1142h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f1143i;

    /* renamed from: j  reason: collision with root package name */
    public final Class<R> f1144j;

    /* renamed from: k  reason: collision with root package name */
    public final a<?> f1145k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1146l;

    /* renamed from: m  reason: collision with root package name */
    public final int f1147m;
    public final f n;
    public final c.d.a.q.j.h<R> o;
    public final List<e<R>> p;
    public final c<? super R> q;
    public final Executor r;
    public w<R> s;
    public l.d t;
    public long u;
    public volatile l v;
    public int w;
    public Drawable x;
    public Drawable y;
    public Drawable z;

    public h(Context context, c.d.a.d dVar, Object obj, Object obj2, Class<R> cls, a<?> aVar, int i2, int i3, f fVar, c.d.a.q.j.h<R> hVar, e<R> eVar, List<e<R>> list, d dVar2, l lVar, c<? super R> cVar, Executor executor) {
        this.b = a ? String.valueOf(hashCode()) : null;
        this.f1138c = new d.b();
        this.f1139d = obj;
        this.f1141g = context;
        this.f1142h = dVar;
        this.f1143i = obj2;
        this.f1144j = cls;
        this.f1145k = aVar;
        this.f1146l = i2;
        this.f1147m = i3;
        this.n = fVar;
        this.o = hVar;
        this.e = eVar;
        this.p = list;
        this.f1140f = dVar2;
        this.v = lVar;
        this.q = cVar;
        this.r = executor;
        this.w = 1;
        if (this.D == null && dVar.f745i.a.containsKey(c.C0011c.class)) {
            this.D = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // c.d.a.q.c
    public boolean a() {
        boolean z2;
        synchronized (this.f1139d) {
            z2 = this.w == 4;
        }
        return z2;
    }

    @Override // c.d.a.q.j.g
    public void b(int i2, int i3) {
        Object obj;
        Throwable th;
        int i4;
        int i5 = i2;
        this.f1138c.a();
        Object obj2 = this.f1139d;
        synchronized (obj2) {
            try {
                boolean z2 = a;
                if (z2) {
                    n("Got onSizeReady in " + c.d.a.s.f.a(this.u));
                }
                if (this.w == 3) {
                    this.w = 2;
                    float f2 = this.f1145k.f1127f;
                    if (i5 != Integer.MIN_VALUE) {
                        i5 = Math.round(((float) i5) * f2);
                    }
                    this.A = i5;
                    if (i3 == Integer.MIN_VALUE) {
                        i4 = i3;
                    } else {
                        i4 = Math.round(f2 * ((float) i3));
                    }
                    this.B = i4;
                    if (z2) {
                        n("finished setup for calling load in " + c.d.a.s.f.a(this.u));
                    }
                    l lVar = this.v;
                    c.d.a.d dVar = this.f1142h;
                    Object obj3 = this.f1143i;
                    a<?> aVar = this.f1145k;
                    try {
                        obj = obj2;
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                    try {
                        this.t = lVar.b(dVar, obj3, aVar.p, this.A, this.B, aVar.w, this.f1144j, this.n, aVar.f1128g, aVar.v, aVar.q, aVar.C, aVar.u, aVar.f1134m, aVar.A, aVar.D, aVar.B, this, this.r);
                        if (this.w != 2) {
                            this.t = null;
                        }
                        if (z2) {
                            n("finished onSizeReady in " + c.d.a.s.f.a(this.u));
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
                while (true) {
                    break;
                }
                throw th;
            }
        }
    }

    public final void c() {
        if (this.C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r5.v.f(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002e  */
    @Override // c.d.a.q.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f1139d
            monitor-enter(r0)
            r5.c()     // Catch:{ all -> 0x0042 }
            c.d.a.s.k.d r1 = r5.f1138c     // Catch:{ all -> 0x0042 }
            r1.a()     // Catch:{ all -> 0x0042 }
            int r1 = r5.w     // Catch:{ all -> 0x0042 }
            r2 = 6
            if (r1 != r2) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x0012:
            r5.d()     // Catch:{ all -> 0x0042 }
            c.d.a.m.v.w<R> r1 = r5.s     // Catch:{ all -> 0x0042 }
            r3 = 0
            if (r1 == 0) goto L_0x001d
            r5.s = r3     // Catch:{ all -> 0x0042 }
            goto L_0x001e
        L_0x001d:
            r1 = r3
        L_0x001e:
            c.d.a.q.d r3 = r5.f1140f     // Catch:{ all -> 0x0042 }
            if (r3 == 0) goto L_0x002b
            boolean r3 = r3.l(r5)     // Catch:{ all -> 0x0042 }
            if (r3 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r3 = 0
            goto L_0x002c
        L_0x002b:
            r3 = 1
        L_0x002c:
            if (r3 == 0) goto L_0x0037
            c.d.a.q.j.h<R> r3 = r5.o     // Catch:{ all -> 0x0042 }
            android.graphics.drawable.Drawable r4 = r5.k()     // Catch:{ all -> 0x0042 }
            r3.g(r4)     // Catch:{ all -> 0x0042 }
        L_0x0037:
            r5.w = r2     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0041
            c.d.a.m.v.l r0 = r5.v
            r0.f(r1)
        L_0x0041:
            return
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.q.h.clear():void");
    }

    public final void d() {
        c();
        this.f1138c.a();
        this.o.a(this);
        l.d dVar = this.t;
        if (dVar != null) {
            synchronized (l.this) {
                dVar.a.h(dVar.b);
            }
            this.t = null;
        }
    }

    @Override // c.d.a.q.c
    public void e() {
        synchronized (this.f1139d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    @Override // c.d.a.q.c
    public void f() {
        synchronized (this.f1139d) {
            c();
            this.f1138c.a();
            int i2 = c.d.a.s.f.b;
            this.u = SystemClock.elapsedRealtimeNanos();
            int i3 = 3;
            if (this.f1143i == null) {
                if (j.k(this.f1146l, this.f1147m)) {
                    this.A = this.f1146l;
                    this.B = this.f1147m;
                }
                if (g() == null) {
                    i3 = 5;
                }
                o(new r("Received null model"), i3);
                return;
            }
            int i4 = this.w;
            if (i4 != 2) {
                boolean z2 = false;
                if (i4 == 4) {
                    p(this.s, a.MEMORY_CACHE, false);
                    return;
                }
                this.w = 3;
                if (j.k(this.f1146l, this.f1147m)) {
                    b(this.f1146l, this.f1147m);
                } else {
                    this.o.h(this);
                }
                int i5 = this.w;
                if (i5 == 2 || i5 == 3) {
                    d dVar = this.f1140f;
                    if (dVar == null || dVar.k(this)) {
                        z2 = true;
                    }
                    if (z2) {
                        this.o.b(k());
                    }
                }
                if (a) {
                    n("finished run method in " + c.d.a.s.f.a(this.u));
                }
                return;
            }
            throw new IllegalArgumentException("Cannot restart a running request");
        }
    }

    public final Drawable g() {
        int i2;
        if (this.z == null) {
            a<?> aVar = this.f1145k;
            Drawable drawable = aVar.s;
            this.z = drawable;
            if (drawable == null && (i2 = aVar.t) > 0) {
                this.z = m(i2);
            }
        }
        return this.z;
    }

    @Override // c.d.a.q.c
    public boolean h(c cVar) {
        int i2;
        int i3;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        f fVar;
        int size;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        f fVar2;
        int size2;
        if (!(cVar instanceof h)) {
            return false;
        }
        synchronized (this.f1139d) {
            i2 = this.f1146l;
            i3 = this.f1147m;
            obj = this.f1143i;
            cls = this.f1144j;
            aVar = this.f1145k;
            fVar = this.n;
            List<e<R>> list = this.p;
            size = list != null ? list.size() : 0;
        }
        h hVar = (h) cVar;
        synchronized (hVar.f1139d) {
            i4 = hVar.f1146l;
            i5 = hVar.f1147m;
            obj2 = hVar.f1143i;
            cls2 = hVar.f1144j;
            aVar2 = hVar.f1145k;
            fVar2 = hVar.n;
            List<e<R>> list2 = hVar.p;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i2 == i4 && i3 == i5) {
            char[] cArr = j.a;
            if ((obj == null ? obj2 == null : obj instanceof c.d.a.m.w.l ? ((c.d.a.m.w.l) obj).a(obj2) : obj.equals(obj2)) && cls.equals(cls2) && aVar.equals(aVar2) && fVar == fVar2 && size == size2) {
                return true;
            }
        }
        return false;
    }

    @Override // c.d.a.q.c
    public boolean i() {
        boolean z2;
        synchronized (this.f1139d) {
            z2 = this.w == 4;
        }
        return z2;
    }

    @Override // c.d.a.q.c
    public boolean isRunning() {
        boolean z2;
        synchronized (this.f1139d) {
            int i2 = this.w;
            if (i2 != 2) {
                if (i2 != 3) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    @Override // c.d.a.q.c
    public boolean j() {
        boolean z2;
        synchronized (this.f1139d) {
            z2 = this.w == 6;
        }
        return z2;
    }

    public final Drawable k() {
        int i2;
        if (this.y == null) {
            a<?> aVar = this.f1145k;
            Drawable drawable = aVar.f1132k;
            this.y = drawable;
            if (drawable == null && (i2 = aVar.f1133l) > 0) {
                this.y = m(i2);
            }
        }
        return this.y;
    }

    public final boolean l() {
        d dVar = this.f1140f;
        return dVar == null || !dVar.c().a();
    }

    public final Drawable m(int i2) {
        Resources.Theme theme = this.f1145k.y;
        if (theme == null) {
            theme = this.f1141g.getTheme();
        }
        c.d.a.d dVar = this.f1142h;
        return c.d.a.m.x.e.a.a(dVar, dVar, i2, theme);
    }

    public final void n(String str) {
        StringBuilder h2 = c.c.a.a.a.h(str, " this: ");
        h2.append(this.b);
        Log.v("Request", h2.toString());
    }

    /* JADX INFO: finally extract failed */
    public final void o(r rVar, int i2) {
        boolean z2;
        this.f1138c.a();
        synchronized (this.f1139d) {
            Objects.requireNonNull(rVar);
            int i3 = this.f1142h.f746j;
            if (i3 <= i2) {
                Log.w("Glide", "Load failed for " + this.f1143i + " with size [" + this.A + "x" + this.B + "]", rVar);
                if (i3 <= 4) {
                    rVar.e("Glide");
                }
            }
            this.t = null;
            this.w = 5;
            boolean z3 = true;
            this.C = true;
            try {
                List<e<R>> list = this.p;
                if (list != null) {
                    z2 = false;
                    for (e<R> eVar : list) {
                        z2 |= eVar.b(rVar, this.f1143i, this.o, l());
                    }
                } else {
                    z2 = false;
                }
                e<R> eVar2 = this.e;
                if (eVar2 == null || !eVar2.b(rVar, this.f1143i, this.o, l())) {
                    z3 = false;
                }
                if (!z2 && !z3) {
                    r();
                }
                this.C = false;
                d dVar = this.f1140f;
                if (dVar != null) {
                    dVar.d(this);
                }
            } catch (Throwable th) {
                this.C = false;
                throw th;
            }
        }
    }

    public void p(w<?> wVar, a aVar, boolean z2) {
        Throwable th;
        h<R> hVar;
        Throwable th2;
        h<R> hVar2;
        Throwable th3;
        this.f1138c.a();
        w<?> wVar2 = null;
        try {
            synchronized (this.f1139d) {
                try {
                    this.t = null;
                    if (wVar == null) {
                        o(new r("Expected to receive a Resource<R> with an object of " + this.f1144j + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = wVar.get();
                    if (obj != null) {
                        if (this.f1144j.isAssignableFrom(obj.getClass())) {
                            d dVar = this.f1140f;
                            if (!(dVar == null || dVar.b(this))) {
                                try {
                                    this.s = null;
                                    this.w = 4;
                                    this.v.f(wVar);
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    wVar2 = wVar;
                                    hVar = this;
                                    try {
                                    } catch (Throwable th5) {
                                        hVar2 = hVar;
                                        th3 = th5;
                                        th2 = th3;
                                        hVar = hVar2;
                                        throw th2;
                                    }
                                    try {
                                        throw th2;
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                }
                            } else {
                                q(wVar, obj, aVar);
                                return;
                            }
                        }
                    }
                    this.s = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected to receive an object of ");
                    sb.append(this.f1144j);
                    sb.append(" but instead got ");
                    sb.append(obj != null ? obj.getClass() : "");
                    sb.append("{");
                    sb.append(obj);
                    sb.append("} inside Resource{");
                    sb.append(wVar);
                    sb.append("}.");
                    sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                    o(new r(sb.toString()), 5);
                    this.v.f(wVar);
                } catch (Throwable th7) {
                    th3 = th7;
                    hVar2 = this;
                    th2 = th3;
                    hVar = hVar2;
                    throw th2;
                }
            }
        } catch (Throwable th8) {
            th = th8;
            hVar = this;
            if (wVar2 != null) {
                hVar.v.f(wVar2);
            }
            throw th;
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (Lc/d/a/m/v/w<TR;>;TR;Lc/d/a/m/a;Z)V */
    /* JADX INFO: finally extract failed */
    public final void q(w wVar, Object obj, a aVar) {
        boolean z2;
        boolean l2 = l();
        this.w = 4;
        this.s = wVar;
        if (this.f1142h.f746j <= 3) {
            StringBuilder f2 = c.c.a.a.a.f("Finished loading ");
            f2.append(obj.getClass().getSimpleName());
            f2.append(" from ");
            f2.append(aVar);
            f2.append(" for ");
            f2.append(this.f1143i);
            f2.append(" with size [");
            f2.append(this.A);
            f2.append("x");
            f2.append(this.B);
            f2.append("] in ");
            f2.append(c.d.a.s.f.a(this.u));
            f2.append(" ms");
            Log.d("Glide", f2.toString());
        }
        boolean z3 = true;
        this.C = true;
        try {
            List<e<R>> list = this.p;
            if (list != null) {
                z2 = false;
                for (e<R> eVar : list) {
                    z2 |= eVar.a(obj, this.f1143i, this.o, aVar, l2);
                }
            } else {
                z2 = false;
            }
            e<R> eVar2 = this.e;
            if (eVar2 == null || !eVar2.a(obj, this.f1143i, this.o, aVar, l2)) {
                z3 = false;
            }
            if (!z3 && !z2) {
                Objects.requireNonNull(this.q);
                this.o.c(obj, c.d.a.q.k.a.a);
            }
            this.C = false;
            d dVar = this.f1140f;
            if (dVar != null) {
                dVar.g(this);
            }
        } catch (Throwable th) {
            this.C = false;
            throw th;
        }
    }

    public final void r() {
        int i2;
        d dVar = this.f1140f;
        if (dVar == null || dVar.k(this)) {
            Drawable drawable = null;
            if (this.f1143i == null) {
                drawable = g();
            }
            if (drawable == null) {
                if (this.x == null) {
                    a<?> aVar = this.f1145k;
                    Drawable drawable2 = aVar.f1130i;
                    this.x = drawable2;
                    if (drawable2 == null && (i2 = aVar.f1131j) > 0) {
                        this.x = m(i2);
                    }
                }
                drawable = this.x;
            }
            if (drawable == null) {
                drawable = k();
            }
            this.o.d(drawable);
        }
    }
}
