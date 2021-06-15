package j.n0.g;

import i.s.c.h;
import j.e0;
import j.h0;
import j.i0;
import j.n0.h.d;
import j.t;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import k.e;
import k.j;
import k.k;
import k.x;
import k.z;

public final class c {
    public boolean a;
    public final i b;

    /* renamed from: c  reason: collision with root package name */
    public final e f3487c;

    /* renamed from: d  reason: collision with root package name */
    public final t f3488d;
    public final d e;

    /* renamed from: f  reason: collision with root package name */
    public final d f3489f;

    public final class a extends j {

        /* renamed from: f  reason: collision with root package name */
        public boolean f3490f;

        /* renamed from: g  reason: collision with root package name */
        public long f3491g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3492h;

        /* renamed from: i  reason: collision with root package name */
        public final long f3493i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ c f3494j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, x xVar, long j2) {
            super(xVar);
            h.f(xVar, "delegate");
            this.f3494j = cVar;
            this.f3493i = j2;
        }

        public final <E extends IOException> E b(E e) {
            if (this.f3490f) {
                return e;
            }
            this.f3490f = true;
            return (E) this.f3494j.a(this.f3491g, false, true, e);
        }

        @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f3492h) {
                this.f3492h = true;
                long j2 = this.f3493i;
                if (j2 == -1 || this.f3491g == j2) {
                    try {
                        this.e.close();
                        b(null);
                    } catch (IOException e) {
                        throw b(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        @Override // k.x, java.io.Flushable
        public void flush() {
            try {
                this.e.flush();
            } catch (IOException e) {
                throw b(e);
            }
        }

        @Override // k.x
        public void l(e eVar, long j2) {
            h.f(eVar, "source");
            if (!this.f3492h) {
                long j3 = this.f3493i;
                if (j3 == -1 || this.f3491g + j2 <= j3) {
                    try {
                        h.f(eVar, "source");
                        this.e.l(eVar, j2);
                        this.f3491g += j2;
                    } catch (IOException e) {
                        throw b(e);
                    }
                } else {
                    StringBuilder f2 = c.c.a.a.a.f("expected ");
                    f2.append(this.f3493i);
                    f2.append(" bytes but received ");
                    f2.append(this.f3491g + j2);
                    throw new ProtocolException(f2.toString());
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public final class b extends k {

        /* renamed from: f  reason: collision with root package name */
        public long f3495f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f3496g = true;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3497h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f3498i;

        /* renamed from: j  reason: collision with root package name */
        public final long f3499j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ c f3500k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar, z zVar, long j2) {
            super(zVar);
            h.f(zVar, "delegate");
            this.f3500k = cVar;
            this.f3499j = j2;
            if (j2 == 0) {
                b(null);
            }
        }

        public final <E extends IOException> E b(E e) {
            if (this.f3497h) {
                return e;
            }
            this.f3497h = true;
            if (e == null && this.f3496g) {
                this.f3496g = false;
                c cVar = this.f3500k;
                t tVar = cVar.f3488d;
                e eVar = cVar.f3487c;
                Objects.requireNonNull(tVar);
                h.f(eVar, "call");
            }
            return (E) this.f3500k.a(this.f3495f, true, false, e);
        }

        @Override // k.z, java.io.Closeable, k.k, java.lang.AutoCloseable
        public void close() {
            if (!this.f3498i) {
                this.f3498i = true;
                try {
                    this.e.close();
                    b(null);
                } catch (IOException e) {
                    throw b(e);
                }
            }
        }

        @Override // k.z
        public long r(e eVar, long j2) {
            h.f(eVar, "sink");
            if (!this.f3498i) {
                try {
                    long r = this.e.r(eVar, j2);
                    if (this.f3496g) {
                        this.f3496g = false;
                        c cVar = this.f3500k;
                        t tVar = cVar.f3488d;
                        e eVar2 = cVar.f3487c;
                        Objects.requireNonNull(tVar);
                        h.f(eVar2, "call");
                    }
                    if (r == -1) {
                        b(null);
                        return -1;
                    }
                    long j3 = this.f3495f + r;
                    long j4 = this.f3499j;
                    if (j4 != -1) {
                        if (j3 > j4) {
                            throw new ProtocolException("expected " + this.f3499j + " bytes but received " + j3);
                        }
                    }
                    this.f3495f = j3;
                    if (j3 == j4) {
                        b(null);
                    }
                    return r;
                } catch (IOException e) {
                    throw b(e);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public c(e eVar, t tVar, d dVar, d dVar2) {
        h.f(eVar, "call");
        h.f(tVar, "eventListener");
        h.f(dVar, "finder");
        h.f(dVar2, "codec");
        this.f3487c = eVar;
        this.f3488d = tVar;
        this.e = dVar;
        this.f3489f = dVar2;
        this.b = dVar2.h();
    }

    public final <E extends IOException> E a(long j2, boolean z, boolean z2, E e2) {
        if (e2 != null) {
            f(e2);
        }
        if (z2) {
            t tVar = this.f3488d;
            e eVar = this.f3487c;
            if (e2 != null) {
                Objects.requireNonNull(tVar);
                h.f(eVar, "call");
                h.f(e2, "ioe");
            } else {
                Objects.requireNonNull(tVar);
                h.f(eVar, "call");
            }
        }
        if (z) {
            if (e2 != null) {
                t tVar2 = this.f3488d;
                e eVar2 = this.f3487c;
                Objects.requireNonNull(tVar2);
                h.f(eVar2, "call");
                h.f(e2, "ioe");
            } else {
                t tVar3 = this.f3488d;
                e eVar3 = this.f3487c;
                Objects.requireNonNull(tVar3);
                h.f(eVar3, "call");
            }
        }
        return (E) this.f3487c.j(this, z2, z, e2);
    }

    public final x b(e0 e0Var, boolean z) {
        h.f(e0Var, "request");
        this.a = z;
        h0 h0Var = e0Var.e;
        if (h0Var != null) {
            long a2 = h0Var.a();
            t tVar = this.f3488d;
            e eVar = this.f3487c;
            Objects.requireNonNull(tVar);
            h.f(eVar, "call");
            return new a(this, this.f3489f.d(e0Var, a2), a2);
        }
        h.j();
        throw null;
    }

    public final void c() {
        try {
            this.f3489f.c();
        } catch (IOException e2) {
            t tVar = this.f3488d;
            e eVar = this.f3487c;
            Objects.requireNonNull(tVar);
            h.f(eVar, "call");
            h.f(e2, "ioe");
            f(e2);
            throw e2;
        }
    }

    public final i0.a d(boolean z) {
        try {
            i0.a g2 = this.f3489f.g(z);
            if (g2 != null) {
                h.f(this, "deferredTrailers");
                g2.f3425m = this;
            }
            return g2;
        } catch (IOException e2) {
            t tVar = this.f3488d;
            e eVar = this.f3487c;
            Objects.requireNonNull(tVar);
            h.f(eVar, "call");
            h.f(e2, "ioe");
            f(e2);
            throw e2;
        }
    }

    public final void e() {
        t tVar = this.f3488d;
        e eVar = this.f3487c;
        Objects.requireNonNull(tVar);
        h.f(eVar, "call");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r6 > 1) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.io.IOException r6) {
        /*
            r5 = this;
            j.n0.g.d r0 = r5.e
            r0.c(r6)
            j.n0.h.d r0 = r5.f3489f
            j.n0.g.i r0 = r0.h()
            j.n0.g.e r1 = r5.f3487c
            monitor-enter(r0)
            java.lang.String r2 = "call"
            i.s.c.h.f(r1, r2)     // Catch:{ all -> 0x0056 }
            boolean r2 = r6 instanceof j.n0.j.u     // Catch:{ all -> 0x0056 }
            r3 = 1
            if (r2 == 0) goto L_0x0038
            r2 = r6
            j.n0.j.u r2 = (j.n0.j.u) r2     // Catch:{ all -> 0x0056 }
            j.n0.j.b r2 = r2.e     // Catch:{ all -> 0x0056 }
            j.n0.j.b r4 = j.n0.j.b.f3572i     // Catch:{ all -> 0x0056 }
            if (r2 != r4) goto L_0x002b
            int r6 = r0.f3532m     // Catch:{ all -> 0x0056 }
            int r6 = r6 + r3
            r0.f3532m = r6     // Catch:{ all -> 0x0056 }
            if (r6 <= r3) goto L_0x0054
        L_0x0028:
            r0.f3528i = r3     // Catch:{ all -> 0x0056 }
            goto L_0x004f
        L_0x002b:
            j.n0.j.u r6 = (j.n0.j.u) r6     // Catch:{ all -> 0x0056 }
            j.n0.j.b r6 = r6.e     // Catch:{ all -> 0x0056 }
            j.n0.j.b r2 = j.n0.j.b.f3573j     // Catch:{ all -> 0x0056 }
            if (r6 != r2) goto L_0x0028
            boolean r6 = r1.q     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0028
            goto L_0x0054
        L_0x0038:
            boolean r2 = r0.j()     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0042
            boolean r2 = r6 instanceof j.n0.j.a     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0054
        L_0x0042:
            r0.f3528i = r3     // Catch:{ all -> 0x0056 }
            int r2 = r0.f3531l     // Catch:{ all -> 0x0056 }
            if (r2 != 0) goto L_0x0054
            j.c0 r1 = r1.t     // Catch:{ all -> 0x0056 }
            j.l0 r2 = r0.q     // Catch:{ all -> 0x0056 }
            r0.d(r1, r2, r6)     // Catch:{ all -> 0x0056 }
        L_0x004f:
            int r6 = r0.f3530k     // Catch:{ all -> 0x0056 }
            int r6 = r6 + r3
            r0.f3530k = r6     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)
            return
        L_0x0056:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.g.c.f(java.io.IOException):void");
    }
}
