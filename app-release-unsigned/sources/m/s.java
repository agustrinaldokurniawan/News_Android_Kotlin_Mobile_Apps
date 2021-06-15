package m;

import j.a0;
import j.b0;
import j.d0;
import j.e;
import j.e0;
import j.f;
import j.g0;
import j.h0;
import j.i0;
import j.j0;
import j.u;
import j.w;
import j.x;
import j.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import k.h;
import k.k;
import k.t;
import k.z;
import m.y;

public final class s<T> implements d<T> {
    public final z e;

    /* renamed from: f  reason: collision with root package name */
    public final Object[] f3844f;

    /* renamed from: g  reason: collision with root package name */
    public final e.a f3845g;

    /* renamed from: h  reason: collision with root package name */
    public final h<j0, T> f3846h;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f3847i;
    @GuardedBy("this")
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public e f3848j;
    @GuardedBy("this")
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public Throwable f3849k;
    @GuardedBy("this")

    /* renamed from: l  reason: collision with root package name */
    public boolean f3850l;

    public class a implements f {
        public final /* synthetic */ f a;

        public a(f fVar) {
            this.a = fVar;
        }

        public void a(e eVar, IOException iOException) {
            try {
                this.a.a(s.this, iOException);
            } catch (Throwable th) {
                g0.o(th);
                th.printStackTrace();
            }
        }

        public void b(e eVar, i0 i0Var) {
            try {
                try {
                    this.a.b(s.this, s.this.f(i0Var));
                } catch (Throwable th) {
                    g0.o(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                g0.o(th2);
                th2.printStackTrace();
            }
        }
    }

    public static final class b extends j0 {

        /* renamed from: g  reason: collision with root package name */
        public final j0 f3851g;

        /* renamed from: h  reason: collision with root package name */
        public final h f3852h;
        @Nullable

        /* renamed from: i  reason: collision with root package name */
        public IOException f3853i;

        public class a extends k {
            public a(z zVar) {
                super(zVar);
            }

            @Override // k.z
            public long r(k.e eVar, long j2) {
                try {
                    i.s.c.h.f(eVar, "sink");
                    return this.e.r(eVar, j2);
                } catch (IOException e) {
                    b.this.f3853i = e;
                    throw e;
                }
            }
        }

        public b(j0 j0Var) {
            this.f3851g = j0Var;
            a aVar = new a(j0Var.e());
            i.s.c.h.f(aVar, "$this$buffer");
            this.f3852h = new t(aVar);
        }

        @Override // j.j0
        public long b() {
            return this.f3851g.b();
        }

        @Override // j.j0
        public a0 c() {
            return this.f3851g.c();
        }

        @Override // java.io.Closeable, j.j0, java.lang.AutoCloseable
        public void close() {
            this.f3851g.close();
        }

        @Override // j.j0
        public h e() {
            return this.f3852h;
        }
    }

    public static final class c extends j0 {
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        public final a0 f3855g;

        /* renamed from: h  reason: collision with root package name */
        public final long f3856h;

        public c(@Nullable a0 a0Var, long j2) {
            this.f3855g = a0Var;
            this.f3856h = j2;
        }

        @Override // j.j0
        public long b() {
            return this.f3856h;
        }

        @Override // j.j0
        public a0 c() {
            return this.f3855g;
        }

        @Override // j.j0
        public h e() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public s(z zVar, Object[] objArr, e.a aVar, h<j0, T> hVar) {
        this.e = zVar;
        this.f3844f = objArr;
        this.f3845g = aVar;
        this.f3846h = hVar;
    }

    @Override // m.d
    public void K(f<T> fVar) {
        e eVar;
        Throwable th;
        synchronized (this) {
            if (!this.f3850l) {
                this.f3850l = true;
                eVar = this.f3848j;
                th = this.f3849k;
                if (eVar == null && th == null) {
                    try {
                        e a2 = a();
                        this.f3848j = a2;
                        eVar = a2;
                    } catch (Throwable th2) {
                        th = th2;
                        g0.o(th);
                        this.f3849k = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            fVar.a(this, th);
            return;
        }
        if (this.f3847i) {
            eVar.cancel();
        }
        eVar.u(new a(fVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: j.e0$a */
    /* JADX WARN: Multi-variable type inference failed */
    public final e a() {
        y yVar;
        e.a aVar = this.f3845g;
        z zVar = this.e;
        Object[] objArr = this.f3844f;
        w<?>[] wVarArr = zVar.f3886j;
        int length = objArr.length;
        if (length == wVarArr.length) {
            y yVar2 = new y(zVar.f3880c, zVar.b, zVar.f3881d, zVar.e, zVar.f3882f, zVar.f3883g, zVar.f3884h, zVar.f3885i);
            if (zVar.f3887k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(objArr[i2]);
                wVarArr[i2].a(yVar2, objArr[i2]);
            }
            y.a aVar2 = yVar2.f3871f;
            if (aVar2 != null) {
                yVar = aVar2.a();
            } else {
                y yVar3 = yVar2.f3870d;
                String str = yVar2.e;
                Objects.requireNonNull(yVar3);
                i.s.c.h.f(str, "link");
                y.a f2 = yVar3.f(str);
                yVar = f2 != null ? f2.a() : null;
                if (yVar == null) {
                    StringBuilder f3 = c.c.a.a.a.f("Malformed URL. Base: ");
                    f3.append(yVar2.f3870d);
                    f3.append(", Relative: ");
                    f3.append(yVar2.e);
                    throw new IllegalArgumentException(f3.toString());
                }
            }
            h0 h0Var = yVar2.f3878m;
            if (h0Var == null) {
                u.a aVar3 = yVar2.f3877l;
                if (aVar3 != null) {
                    h0Var = new u(aVar3.a, aVar3.b);
                } else {
                    b0.a aVar4 = yVar2.f3876k;
                    if (aVar4 != null) {
                        if (!aVar4.f3368c.isEmpty()) {
                            h0Var = new b0(aVar4.a, aVar4.b, j.n0.c.v(aVar4.f3368c));
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.".toString());
                        }
                    } else if (yVar2.f3875j) {
                        byte[] bArr = new byte[0];
                        i.s.c.h.f(bArr, "content");
                        i.s.c.h.f(bArr, "$this$toRequestBody");
                        long j2 = (long) 0;
                        j.n0.c.b(j2, j2, j2);
                        h0Var = new g0(bArr, null, 0, 0);
                    }
                }
            }
            a0 a0Var = yVar2.f3874i;
            y.a aVar5 = h0Var;
            if (a0Var != null) {
                if (h0Var != null) {
                    aVar5 = new y.a(h0Var, a0Var);
                } else {
                    yVar2.f3873h.a("Content-Type", a0Var.f3358d);
                    aVar5 = h0Var;
                }
            }
            e0.a aVar6 = yVar2.f3872g;
            aVar6.f(yVar);
            x c2 = yVar2.f3873h.c();
            i.s.c.h.f(c2, "headers");
            aVar6.f3398c = c2.c();
            aVar6.c(yVar2.f3869c, aVar5);
            aVar6.e(l.class, new l(zVar.a, arrayList));
            e a2 = aVar.a(aVar6.a());
            Objects.requireNonNull(a2, "Call.Factory returned null.");
            return a2;
        }
        StringBuilder g2 = c.c.a.a.a.g("Argument count (", length, ") doesn't match expected count (");
        g2.append(wVarArr.length);
        g2.append(")");
        throw new IllegalArgumentException(g2.toString());
    }

    @Override // m.d
    public synchronized e0 b() {
        try {
        } catch (IOException e2) {
            throw new RuntimeException("Unable to create request.", e2);
        }
        return d().b();
    }

    @Override // m.d
    public a0<T> c() {
        e d2;
        synchronized (this) {
            if (!this.f3850l) {
                this.f3850l = true;
                d2 = d();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f3847i) {
            d2.cancel();
        }
        return f(d2.c());
    }

    @Override // m.d
    public void cancel() {
        e eVar;
        this.f3847i = true;
        synchronized (this) {
            eVar = this.f3848j;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        return new s(this.e, this.f3844f, this.f3845g, this.f3846h);
    }

    @GuardedBy("this")
    public final e d() {
        e eVar = this.f3848j;
        if (eVar != null) {
            return eVar;
        }
        Throwable th = this.f3849k;
        if (th == null) {
            try {
                e a2 = a();
                this.f3848j = a2;
                return a2;
            } catch (IOException | Error | RuntimeException e2) {
                g0.o(e2);
                this.f3849k = e2;
                throw e2;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    @Override // m.d
    public boolean e() {
        boolean z = true;
        if (this.f3847i) {
            return true;
        }
        synchronized (this) {
            e eVar = this.f3848j;
            if (eVar == null || !eVar.e()) {
                z = false;
            }
        }
        return z;
    }

    public a0<T> f(i0 i0Var) {
        j0 j0Var = i0Var.f3413k;
        i.s.c.h.f(i0Var, "response");
        e0 e0Var = i0Var.e;
        d0 d0Var = i0Var.f3408f;
        int i2 = i0Var.f3410h;
        String str = i0Var.f3409g;
        w wVar = i0Var.f3411i;
        x.a c2 = i0Var.f3412j.c();
        i0 i0Var2 = i0Var.f3414l;
        i0 i0Var3 = i0Var.f3415m;
        i0 i0Var4 = i0Var.n;
        long j2 = i0Var.o;
        long j3 = i0Var.p;
        j.n0.g.c cVar = i0Var.q;
        c cVar2 = new c(j0Var.c(), j0Var.b());
        if (!(i2 >= 0)) {
            throw new IllegalStateException(c.c.a.a.a.l("code < 0: ", i2).toString());
        } else if (e0Var == null) {
            throw new IllegalStateException("request == null".toString());
        } else if (d0Var == null) {
            throw new IllegalStateException("protocol == null".toString());
        } else if (str != null) {
            i0 i0Var5 = new i0(e0Var, d0Var, str, i2, wVar, c2.c(), cVar2, i0Var2, i0Var3, i0Var4, j2, j3, cVar);
            int i3 = i0Var5.f3410h;
            if (i3 < 200 || i3 >= 300) {
                try {
                    j0 a2 = g0.a(j0Var);
                    if (!i0Var5.c()) {
                        return new a0<>(i0Var5, null, a2);
                    }
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                } finally {
                    j0Var.close();
                }
            } else if (i3 == 204 || i3 == 205) {
                j0Var.close();
                return a0.b(null, i0Var5);
            } else {
                b bVar = new b(j0Var);
                try {
                    return a0.b(this.f3846h.a(bVar), i0Var5);
                } catch (RuntimeException e2) {
                    IOException iOException = bVar.f3853i;
                    if (iOException == null) {
                        throw e2;
                    }
                    throw iOException;
                }
            }
        } else {
            throw new IllegalStateException("message == null".toString());
        }
    }

    @Override // m.d
    public d n() {
        return new s(this.e, this.f3844f, this.f3845g, this.f3846h);
    }
}
