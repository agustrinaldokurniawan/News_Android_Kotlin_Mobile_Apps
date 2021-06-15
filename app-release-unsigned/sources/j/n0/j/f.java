package j.n0.j;

import i.j;
import i.m;
import j.n0.j.n;
import j.n0.j.o;
import j.n0.k.h;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import k.g;
import k.h;
import k.i;

public final class f implements Closeable {
    public static final t e;

    /* renamed from: f  reason: collision with root package name */
    public static final f f3598f = null;
    public long A;
    public long B;
    public long C;
    public long D;
    public final Socket E;
    public final p F;
    public final d G;
    public final Set<Integer> H;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3599g;

    /* renamed from: h  reason: collision with root package name */
    public final c f3600h;

    /* renamed from: i  reason: collision with root package name */
    public final Map<Integer, o> f3601i = new LinkedHashMap();

    /* renamed from: j  reason: collision with root package name */
    public final String f3602j;

    /* renamed from: k  reason: collision with root package name */
    public int f3603k;

    /* renamed from: l  reason: collision with root package name */
    public int f3604l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3605m;
    public final j.n0.f.d n;
    public final j.n0.f.c o;
    public final j.n0.f.c p;
    public final j.n0.f.c q;
    public final s r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public final t y;
    public t z;

    public static final class a extends j.n0.f.a {
        public final /* synthetic */ f e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ long f3606f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, f fVar, long j2) {
            super(str2, true);
            this.e = fVar;
            this.f3606f = j2;
        }

        @Override // j.n0.f.a
        public long a() {
            f fVar;
            boolean z;
            synchronized (this.e) {
                fVar = this.e;
                long j2 = fVar.t;
                long j3 = fVar.s;
                if (j2 < j3) {
                    z = true;
                } else {
                    fVar.s = j3 + 1;
                    z = false;
                }
            }
            if (z) {
                b bVar = b.f3569f;
                fVar.b(bVar, bVar, null);
                return -1;
            }
            fVar.V(false, 1, 0);
            return this.f3606f;
        }
    }

    public static final class b {
        public Socket a;
        public String b;

        /* renamed from: c  reason: collision with root package name */
        public h f3607c;

        /* renamed from: d  reason: collision with root package name */
        public g f3608d;
        public c e = c.a;

        /* renamed from: f  reason: collision with root package name */
        public s f3609f = s.a;

        /* renamed from: g  reason: collision with root package name */
        public int f3610g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3611h;

        /* renamed from: i  reason: collision with root package name */
        public final j.n0.f.d f3612i;

        public b(boolean z, j.n0.f.d dVar) {
            i.s.c.h.f(dVar, "taskRunner");
            this.f3611h = z;
            this.f3612i = dVar;
        }
    }

    public static abstract class c {
        public static final c a = new a();

        public static final class a extends c {
            @Override // j.n0.j.f.c
            public void b(o oVar) {
                i.s.c.h.f(oVar, "stream");
                oVar.c(b.f3572i, null);
            }
        }

        public void a(f fVar, t tVar) {
            i.s.c.h.f(fVar, "connection");
            i.s.c.h.f(tVar, "settings");
        }

        public abstract void b(o oVar);
    }

    public final class d implements n.b, i.s.b.a<m> {
        public final n e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f f3613f;

        public static final class a extends j.n0.f.a {
            public final /* synthetic */ o e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ d f3614f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z, String str2, boolean z2, o oVar, d dVar, o oVar2, int i2, List list, boolean z3) {
                super(str2, z2);
                this.e = oVar;
                this.f3614f = dVar;
            }

            @Override // j.n0.f.a
            public long a() {
                try {
                    this.f3614f.f3613f.f3600h.b(this.e);
                    return -1;
                } catch (IOException e2) {
                    h.a aVar = j.n0.k.h.f3695c;
                    j.n0.k.h hVar = j.n0.k.h.a;
                    StringBuilder f2 = c.c.a.a.a.f("Http2Connection.Listener failure for ");
                    f2.append(this.f3614f.f3613f.f3602j);
                    hVar.i(f2.toString(), 4, e2);
                    try {
                        this.e.c(b.f3569f, e2);
                        return -1;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
            }
        }

        public static final class b extends j.n0.f.a {
            public final /* synthetic */ d e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ int f3615f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ int f3616g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z, String str2, boolean z2, d dVar, int i2, int i3) {
                super(str2, z2);
                this.e = dVar;
                this.f3615f = i2;
                this.f3616g = i3;
            }

            @Override // j.n0.f.a
            public long a() {
                this.e.f3613f.V(true, this.f3615f, this.f3616g);
                return -1;
            }
        }

        public static final class c extends j.n0.f.a {
            public final /* synthetic */ d e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ boolean f3617f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ t f3618g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z, String str2, boolean z2, d dVar, boolean z3, t tVar) {
                super(str2, z2);
                this.e = dVar;
                this.f3617f = z3;
                this.f3618g = tVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:34:0x00ed  */
            /* JADX WARNING: Removed duplicated region for block: B:61:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
            @Override // j.n0.f.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public long a() {
                /*
                // Method dump skipped, instructions count: 291
                */
                throw new UnsupportedOperationException("Method not decompiled: j.n0.j.f.d.c.a():long");
            }
        }

        public d(f fVar, n nVar) {
            i.s.c.h.f(nVar, "reader");
            this.f3613f = fVar;
            this.e = nVar;
        }

        @Override // j.n0.j.n.b
        public void a(boolean z, int i2, int i3, List<c> list) {
            i.s.c.h.f(list, "headerBlock");
            if (this.f3613f.e(i2)) {
                f fVar = this.f3613f;
                Objects.requireNonNull(fVar);
                i.s.c.h.f(list, "requestHeaders");
                String str = fVar.f3602j + '[' + i2 + "] onHeaders";
                fVar.p.c(new i(str, true, str, true, fVar, i2, list, z), 0);
                return;
            }
            synchronized (this.f3613f) {
                o c2 = this.f3613f.c(i2);
                if (c2 == null) {
                    f fVar2 = this.f3613f;
                    if (!fVar2.f3605m) {
                        if (i2 > fVar2.f3603k) {
                            if (i2 % 2 != fVar2.f3604l % 2) {
                                o oVar = new o(i2, this.f3613f, false, z, j.n0.c.t(list));
                                f fVar3 = this.f3613f;
                                fVar3.f3603k = i2;
                                fVar3.f3601i.put(Integer.valueOf(i2), oVar);
                                String str2 = this.f3613f.f3602j + '[' + i2 + "] onStream";
                                this.f3613f.n.f().c(new a(str2, true, str2, true, oVar, this, c2, i2, list, z), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                c2.j(j.n0.c.t(list), z);
            }
        }

        @Override // j.n0.j.n.b
        public void b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // i.s.b.a
        public m c() {
            Throwable th;
            b bVar;
            b bVar2 = b.f3570g;
            IOException e2 = null;
            try {
                this.e.c(this);
                while (this.e.b(false, this)) {
                }
                bVar = b.e;
                try {
                    this.f3613f.b(bVar, b.f3573j, null);
                } catch (IOException e3) {
                    e2 = e3;
                    try {
                        b bVar3 = b.f3569f;
                        this.f3613f.b(bVar3, bVar3, e2);
                        j.n0.c.c(this.e);
                        return m.a;
                    } catch (Throwable th2) {
                        th = th2;
                        this.f3613f.b(bVar, bVar2, e2);
                        j.n0.c.c(this.e);
                        throw th;
                    }
                }
            } catch (IOException e4) {
                e2 = e4;
                bVar = bVar2;
                b bVar32 = b.f3569f;
                this.f3613f.b(bVar32, bVar32, e2);
                j.n0.c.c(this.e);
                return m.a;
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                this.f3613f.b(bVar, bVar2, e2);
                j.n0.c.c(this.e);
                throw th;
            }
            j.n0.c.c(this.e);
            return m.a;
        }

        @Override // j.n0.j.n.b
        public void e(int i2, long j2) {
            Object obj;
            if (i2 == 0) {
                Object obj2 = this.f3613f;
                synchronized (obj2) {
                    f fVar = this.f3613f;
                    fVar.D += j2;
                    fVar.notifyAll();
                    obj = obj2;
                }
            } else {
                o c2 = this.f3613f.c(i2);
                if (c2 != null) {
                    synchronized (c2) {
                        c2.f3651d += j2;
                        obj = c2;
                        if (j2 > 0) {
                            c2.notifyAll();
                            obj = c2;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        @Override // j.n0.j.n.b
        public void f(boolean z, t tVar) {
            i.s.c.h.f(tVar, "settings");
            j.n0.f.c cVar = this.f3613f.o;
            String e2 = c.c.a.a.a.e(new StringBuilder(), this.f3613f.f3602j, " applyAndAckSettings");
            cVar.c(new c(e2, true, e2, true, this, z, tVar), 0);
        }

        @Override // j.n0.j.n.b
        public void g(int i2, int i3, List<c> list) {
            i.s.c.h.f(list, "requestHeaders");
            f fVar = this.f3613f;
            Objects.requireNonNull(fVar);
            i.s.c.h.f(list, "requestHeaders");
            synchronized (fVar) {
                if (fVar.H.contains(Integer.valueOf(i3))) {
                    fVar.b0(i3, b.f3569f);
                    return;
                }
                fVar.H.add(Integer.valueOf(i3));
                String str = fVar.f3602j + '[' + i3 + "] onRequest";
                fVar.p.c(new j(str, true, str, true, fVar, i3, list), 0);
            }
        }

        @Override // j.n0.j.n.b
        public void h(boolean z, int i2, k.h hVar, int i3) {
            boolean z2;
            boolean z3;
            long j2;
            i.s.c.h.f(hVar, "source");
            if (this.f3613f.e(i2)) {
                f fVar = this.f3613f;
                Objects.requireNonNull(fVar);
                i.s.c.h.f(hVar, "source");
                k.e eVar = new k.e();
                long j3 = (long) i3;
                hVar.M(j3);
                hVar.r(eVar, j3);
                String str = fVar.f3602j + '[' + i2 + "] onData";
                fVar.p.c(new h(str, true, str, true, fVar, i2, eVar, i3, z), 0);
                return;
            }
            o c2 = this.f3613f.c(i2);
            if (c2 == null) {
                this.f3613f.b0(i2, b.f3569f);
                long j4 = (long) i3;
                this.f3613f.K(j4);
                hVar.a(j4);
                return;
            }
            i.s.c.h.f(hVar, "source");
            byte[] bArr = j.n0.c.a;
            o.b bVar = c2.f3653g;
            long j5 = (long) i3;
            Objects.requireNonNull(bVar);
            i.s.c.h.f(hVar, "source");
            while (true) {
                boolean z4 = true;
                if (j5 <= 0) {
                    break;
                }
                synchronized (o.this) {
                    z2 = bVar.f3666i;
                    z3 = bVar.f3663f.f3738f + j5 > bVar.f3665h;
                }
                if (z3) {
                    hVar.a(j5);
                    o.this.e(b.f3571h);
                    break;
                } else if (z2) {
                    hVar.a(j5);
                    break;
                } else {
                    long r = hVar.r(bVar.e, j5);
                    if (r != -1) {
                        j5 -= r;
                        synchronized (o.this) {
                            if (bVar.f3664g) {
                                k.e eVar2 = bVar.e;
                                j2 = eVar2.f3738f;
                                eVar2.a(j2);
                            } else {
                                k.e eVar3 = bVar.f3663f;
                                if (eVar3.f3738f != 0) {
                                    z4 = false;
                                }
                                eVar3.q0(bVar.e);
                                if (z4) {
                                    o oVar = o.this;
                                    if (oVar != null) {
                                        oVar.notifyAll();
                                    } else {
                                        throw new j("null cannot be cast to non-null type java.lang.Object");
                                    }
                                }
                                j2 = 0;
                            }
                        }
                        if (j2 > 0) {
                            bVar.b(j2);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (z) {
                c2.j(j.n0.c.b, true);
            }
        }

        @Override // j.n0.j.n.b
        public void i(boolean z, int i2, int i3) {
            if (z) {
                synchronized (this.f3613f) {
                    if (i2 == 1) {
                        this.f3613f.t++;
                    } else if (i2 == 2) {
                        this.f3613f.v++;
                    } else if (i2 == 3) {
                        f fVar = this.f3613f;
                        fVar.w++;
                        fVar.notifyAll();
                    }
                }
                return;
            }
            j.n0.f.c cVar = this.f3613f.o;
            String e2 = c.c.a.a.a.e(new StringBuilder(), this.f3613f.f3602j, " ping");
            cVar.c(new b(e2, true, e2, true, this, i2, i3), 0);
        }

        @Override // j.n0.j.n.b
        public void l(int i2, b bVar, i iVar) {
            int i3;
            o[] oVarArr;
            i.s.c.h.f(bVar, "errorCode");
            i.s.c.h.f(iVar, "debugData");
            iVar.d();
            synchronized (this.f3613f) {
                Object[] array = this.f3613f.f3601i.values().toArray(new o[0]);
                if (array != null) {
                    oVarArr = (o[]) array;
                    this.f3613f.f3605m = true;
                } else {
                    throw new j("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (o oVar : oVarArr) {
                if (oVar.f3659m > i2 && oVar.h()) {
                    oVar.k(b.f3572i);
                    this.f3613f.n(oVar.f3659m);
                }
            }
        }

        @Override // j.n0.j.n.b
        public void m(int i2, int i3, int i4, boolean z) {
        }

        @Override // j.n0.j.n.b
        public void p(int i2, b bVar) {
            i.s.c.h.f(bVar, "errorCode");
            if (this.f3613f.e(i2)) {
                f fVar = this.f3613f;
                Objects.requireNonNull(fVar);
                i.s.c.h.f(bVar, "errorCode");
                String str = fVar.f3602j + '[' + i2 + "] onReset";
                fVar.p.c(new k(str, true, str, true, fVar, i2, bVar), 0);
                return;
            }
            o n = this.f3613f.n(i2);
            if (n != null) {
                n.k(bVar);
            }
        }
    }

    public static final class e extends j.n0.f.a {
        public final /* synthetic */ f e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f3619f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ b f3620g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z, String str2, boolean z2, f fVar, int i2, b bVar) {
            super(str2, z2);
            this.e = fVar;
            this.f3619f = i2;
            this.f3620g = bVar;
        }

        @Override // j.n0.f.a
        public long a() {
            try {
                f fVar = this.e;
                int i2 = this.f3619f;
                b bVar = this.f3620g;
                Objects.requireNonNull(fVar);
                i.s.c.h.f(bVar, "statusCode");
                fVar.F.Q(i2, bVar);
                return -1;
            } catch (IOException e2) {
                f fVar2 = this.e;
                b bVar2 = b.f3569f;
                fVar2.b(bVar2, bVar2, e2);
                return -1;
            }
        }
    }

    /* renamed from: j.n0.j.f$f  reason: collision with other inner class name */
    public static final class C0125f extends j.n0.f.a {
        public final /* synthetic */ f e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f3621f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ long f3622g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0125f(String str, boolean z, String str2, boolean z2, f fVar, int i2, long j2) {
            super(str2, z2);
            this.e = fVar;
            this.f3621f = i2;
            this.f3622g = j2;
        }

        @Override // j.n0.f.a
        public long a() {
            try {
                this.e.F.V(this.f3621f, this.f3622g);
                return -1;
            } catch (IOException e2) {
                f fVar = this.e;
                b bVar = b.f3569f;
                fVar.b(bVar, bVar, e2);
                return -1;
            }
        }
    }

    static {
        t tVar = new t();
        tVar.c(7, 65535);
        tVar.c(5, 16384);
        e = tVar;
    }

    public f(b bVar) {
        i.s.c.h.f(bVar, "builder");
        boolean z2 = bVar.f3611h;
        this.f3599g = z2;
        this.f3600h = bVar.e;
        String str = bVar.b;
        if (str != null) {
            this.f3602j = str;
            this.f3604l = bVar.f3611h ? 3 : 2;
            j.n0.f.d dVar = bVar.f3612i;
            this.n = dVar;
            j.n0.f.c f2 = dVar.f();
            this.o = f2;
            this.p = dVar.f();
            this.q = dVar.f();
            this.r = bVar.f3609f;
            t tVar = new t();
            if (bVar.f3611h) {
                tVar.c(7, 16777216);
            }
            this.y = tVar;
            t tVar2 = e;
            this.z = tVar2;
            this.D = (long) tVar2.a();
            Socket socket = bVar.a;
            if (socket != null) {
                this.E = socket;
                g gVar = bVar.f3608d;
                if (gVar != null) {
                    this.F = new p(gVar, z2);
                    k.h hVar = bVar.f3607c;
                    if (hVar != null) {
                        this.G = new d(this, new n(hVar, z2));
                        this.H = new LinkedHashSet();
                        int i2 = bVar.f3610g;
                        if (i2 != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i2);
                            String q2 = c.c.a.a.a.q(str, " ping");
                            f2.c(new a(q2, q2, this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    i.s.c.h.k("source");
                    throw null;
                }
                i.s.c.h.k("sink");
                throw null;
            }
            i.s.c.h.k("socket");
            throw null;
        }
        i.s.c.h.k("connectionName");
        throw null;
    }

    public final synchronized void K(long j2) {
        long j3 = this.A + j2;
        this.A = j3;
        long j4 = j3 - this.B;
        if (j4 >= ((long) (this.y.a() / 2))) {
            d0(0, j4);
            this.B += j4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.F.f3670g);
        r8.C += (long) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Q(int r9, boolean r10, k.e r11, long r12) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.j.f.Q(int, boolean, k.e, long):void");
    }

    public final void V(boolean z2, int i2, int i3) {
        try {
            this.F.K(z2, i2, i3);
        } catch (IOException e2) {
            b bVar = b.f3569f;
            b(bVar, bVar, e2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|(2:1|2)|3|10|(2:16|(5:18|19|20|33|21))|23|24|25|26|27|29) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(j.n0.j.b r4, j.n0.j.b r5, java.io.IOException r6) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.j.f.b(j.n0.j.b, j.n0.j.b, java.io.IOException):void");
    }

    public final void b0(int i2, b bVar) {
        i.s.c.h.f(bVar, "errorCode");
        String str = this.f3602j + '[' + i2 + "] writeSynReset";
        this.o.c(new e(str, true, str, true, this, i2, bVar), 0);
    }

    public final synchronized o c(int i2) {
        return this.f3601i.get(Integer.valueOf(i2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b(b.e, b.f3573j, null);
    }

    public final void d0(int i2, long j2) {
        String str = this.f3602j + '[' + i2 + "] windowUpdate";
        this.o.c(new C0125f(str, true, str, true, this, i2, j2), 0);
    }

    public final boolean e(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public final synchronized o n(int i2) {
        o remove;
        remove = this.f3601i.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    public final void u(b bVar) {
        i.s.c.h.f(bVar, "statusCode");
        synchronized (this.F) {
            synchronized (this) {
                if (!this.f3605m) {
                    this.f3605m = true;
                    this.F.n(this.f3603k, bVar, j.n0.c.a);
                }
            }
        }
    }
}
