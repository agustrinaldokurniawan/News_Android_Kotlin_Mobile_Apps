package j;

import i.s.c.h;
import j.n0.g.c;
import j.x;
import java.io.Closeable;
import java.util.Objects;

public final class i0 implements Closeable {
    public final e0 e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f3408f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3409g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3410h;

    /* renamed from: i  reason: collision with root package name */
    public final w f3411i;

    /* renamed from: j  reason: collision with root package name */
    public final x f3412j;

    /* renamed from: k  reason: collision with root package name */
    public final j0 f3413k;

    /* renamed from: l  reason: collision with root package name */
    public final i0 f3414l;

    /* renamed from: m  reason: collision with root package name */
    public final i0 f3415m;
    public final i0 n;
    public final long o;
    public final long p;
    public final c q;

    public static class a {
        public e0 a;
        public d0 b;

        /* renamed from: c  reason: collision with root package name */
        public int f3416c;

        /* renamed from: d  reason: collision with root package name */
        public String f3417d;
        public w e;

        /* renamed from: f  reason: collision with root package name */
        public x.a f3418f;

        /* renamed from: g  reason: collision with root package name */
        public j0 f3419g;

        /* renamed from: h  reason: collision with root package name */
        public i0 f3420h;

        /* renamed from: i  reason: collision with root package name */
        public i0 f3421i;

        /* renamed from: j  reason: collision with root package name */
        public i0 f3422j;

        /* renamed from: k  reason: collision with root package name */
        public long f3423k;

        /* renamed from: l  reason: collision with root package name */
        public long f3424l;

        /* renamed from: m  reason: collision with root package name */
        public c f3425m;

        public a() {
            this.f3416c = -1;
            this.f3418f = new x.a();
        }

        public a(i0 i0Var) {
            h.f(i0Var, "response");
            this.f3416c = -1;
            this.a = i0Var.e;
            this.b = i0Var.f3408f;
            this.f3416c = i0Var.f3410h;
            this.f3417d = i0Var.f3409g;
            this.e = i0Var.f3411i;
            this.f3418f = i0Var.f3412j.c();
            this.f3419g = i0Var.f3413k;
            this.f3420h = i0Var.f3414l;
            this.f3421i = i0Var.f3415m;
            this.f3422j = i0Var.n;
            this.f3423k = i0Var.o;
            this.f3424l = i0Var.p;
            this.f3425m = i0Var.q;
        }

        public i0 a() {
            int i2 = this.f3416c;
            if (i2 >= 0) {
                e0 e0Var = this.a;
                if (e0Var != null) {
                    d0 d0Var = this.b;
                    if (d0Var != null) {
                        String str = this.f3417d;
                        if (str != null) {
                            return new i0(e0Var, d0Var, str, i2, this.e, this.f3418f.c(), this.f3419g, this.f3420h, this.f3421i, this.f3422j, this.f3423k, this.f3424l, this.f3425m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            StringBuilder f2 = c.c.a.a.a.f("code < 0: ");
            f2.append(this.f3416c);
            throw new IllegalStateException(f2.toString().toString());
        }

        public a b(i0 i0Var) {
            c("cacheResponse", i0Var);
            this.f3421i = i0Var;
            return this;
        }

        public final void c(String str, i0 i0Var) {
            if (i0Var != null) {
                boolean z = true;
                if (i0Var.f3413k == null) {
                    if (i0Var.f3414l == null) {
                        if (i0Var.f3415m == null) {
                            if (i0Var.n != null) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException(c.c.a.a.a.q(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(c.c.a.a.a.q(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(c.c.a.a.a.q(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(c.c.a.a.a.q(str, ".body != null").toString());
            }
        }

        public a d(x xVar) {
            h.f(xVar, "headers");
            this.f3418f = xVar.c();
            return this;
        }

        public a e(String str) {
            h.f(str, "message");
            this.f3417d = str;
            return this;
        }

        public a f(d0 d0Var) {
            h.f(d0Var, "protocol");
            this.b = d0Var;
            return this;
        }

        public a g(e0 e0Var) {
            h.f(e0Var, "request");
            this.a = e0Var;
            return this;
        }
    }

    public i0(e0 e0Var, d0 d0Var, String str, int i2, w wVar, x xVar, j0 j0Var, i0 i0Var, i0 i0Var2, i0 i0Var3, long j2, long j3, c cVar) {
        h.f(e0Var, "request");
        h.f(d0Var, "protocol");
        h.f(str, "message");
        h.f(xVar, "headers");
        this.e = e0Var;
        this.f3408f = d0Var;
        this.f3409g = str;
        this.f3410h = i2;
        this.f3411i = wVar;
        this.f3412j = xVar;
        this.f3413k = j0Var;
        this.f3414l = i0Var;
        this.f3415m = i0Var2;
        this.n = i0Var3;
        this.o = j2;
        this.p = j3;
        this.q = cVar;
    }

    public static String b(i0 i0Var, String str, String str2, int i2) {
        int i3 = i2 & 2;
        Objects.requireNonNull(i0Var);
        h.f(str, "name");
        String a2 = i0Var.f3412j.a(str);
        if (a2 != null) {
            return a2;
        }
        return null;
    }

    public final boolean c() {
        int i2 = this.f3410h;
        return 200 <= i2 && 299 >= i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j0 j0Var = this.f3413k;
        if (j0Var != null) {
            j0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("Response{protocol=");
        f2.append(this.f3408f);
        f2.append(", code=");
        f2.append(this.f3410h);
        f2.append(", message=");
        f2.append(this.f3409g);
        f2.append(", url=");
        f2.append(this.e.b);
        f2.append('}');
        return f2.toString();
    }
}
