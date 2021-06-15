package j.n0.g;

import i.s.c.h;
import j.c0;
import j.e0;
import j.f;
import j.i0;
import j.n0.k.h;
import j.q;
import j.t;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class e implements j.e {
    public final j e;

    /* renamed from: f  reason: collision with root package name */
    public final t f3508f;

    /* renamed from: g  reason: collision with root package name */
    public final c f3509g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f3510h = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    public Object f3511i;

    /* renamed from: j  reason: collision with root package name */
    public d f3512j;

    /* renamed from: k  reason: collision with root package name */
    public i f3513k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3514l;

    /* renamed from: m  reason: collision with root package name */
    public c f3515m;
    public boolean n;
    public boolean o;
    public boolean p = true;
    public volatile boolean q;
    public volatile c r;
    public volatile i s;
    public final c0 t;
    public final e0 u;
    public final boolean v;

    public final class a implements Runnable {
        public volatile AtomicInteger e = new AtomicInteger(0);

        /* renamed from: f  reason: collision with root package name */
        public final f f3516f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ e f3517g;

        public a(e eVar, f fVar) {
            h.f(fVar, "responseCallback");
            this.f3517g = eVar;
            this.f3516f = fVar;
        }

        public final String a() {
            return this.f3517g.u.b.f3716g;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0057 A[Catch:{ IOException -> 0x007c, all -> 0x004f, all -> 0x007a }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x007f A[Catch:{ IOException -> 0x007c, all -> 0x004f, all -> 0x007a }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x009f A[Catch:{ IOException -> 0x007c, all -> 0x004f, all -> 0x007a }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            // Method dump skipped, instructions count: 195
            */
            throw new UnsupportedOperationException("Method not decompiled: j.n0.g.e.a.run():void");
        }
    }

    public static final class b extends WeakReference<e> {
        public final Object a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            h.f(eVar, "referent");
            this.a = obj;
        }
    }

    public static final class c extends k.b {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ e f3518l;

        public c(e eVar) {
            this.f3518l = eVar;
        }

        @Override // k.b
        public void k() {
            this.f3518l.cancel();
        }
    }

    public e(c0 c0Var, e0 e0Var, boolean z) {
        h.f(c0Var, "client");
        h.f(e0Var, "originalRequest");
        this.t = c0Var;
        this.u = e0Var;
        this.v = z;
        this.e = c0Var.f3372i.a;
        this.f3508f = c0Var.f3375l.a(this);
        c cVar = new c(this);
        cVar.g((long) 0, TimeUnit.MILLISECONDS);
        this.f3509g = cVar;
    }

    public static final String a(e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(eVar.q ? "canceled " : "");
        sb.append(eVar.v ? "web socket" : "call");
        sb.append(" to ");
        sb.append(eVar.u.b.g());
        return sb.toString();
    }

    @Override // j.e
    public e0 b() {
        return this.u;
    }

    @Override // j.e
    public i0 c() {
        q qVar;
        if (this.f3510h.compareAndSet(false, true)) {
            this.f3509g.h();
            g();
            try {
                q qVar2 = this.t.f3371h;
                synchronized (qVar2) {
                    h.f(this, "call");
                    qVar2.f3704d.add(this);
                }
                return i();
            } finally {
                qVar = this.t.f3371h;
                Objects.requireNonNull(qVar);
                h.f(this, "call");
                qVar.a(qVar.f3704d, this);
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    @Override // j.e
    public void cancel() {
        Socket socket;
        if (!this.q) {
            this.q = true;
            c cVar = this.r;
            if (cVar != null) {
                cVar.f3489f.cancel();
            }
            i iVar = this.s;
            if (!(iVar == null || (socket = iVar.b) == null)) {
                j.n0.c.d(socket);
            }
            Objects.requireNonNull(this.f3508f);
            h.f(this, "call");
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        return new e(this.t, this.u, this.v);
    }

    public final void d(i iVar) {
        h.f(iVar, "connection");
        byte[] bArr = j.n0.c.a;
        if (this.f3513k == null) {
            this.f3513k = iVar;
            iVar.o.add(new b(this, this.f3511i));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // j.e
    public boolean e() {
        return this.q;
    }

    public final <E extends IOException> E f(E e2) {
        InterruptedIOException interruptedIOException;
        Socket l2;
        byte[] bArr = j.n0.c.a;
        i iVar = this.f3513k;
        if (iVar != null) {
            synchronized (iVar) {
                l2 = l();
            }
            if (this.f3513k == null) {
                if (l2 != null) {
                    j.n0.c.d(l2);
                }
                Objects.requireNonNull(this.f3508f);
                h.f(this, "call");
                h.f(iVar, "connection");
            } else {
                if (!(l2 == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f3514l && this.f3509g.i()) {
            InterruptedIOException interruptedIOException2 = new InterruptedIOException("timeout");
            interruptedIOException = interruptedIOException2;
            if (e2 != null) {
                interruptedIOException2.initCause(e2);
                interruptedIOException = interruptedIOException2;
            }
        } else {
            interruptedIOException = e2;
        }
        if (e2 != null) {
            t tVar = this.f3508f;
            if (interruptedIOException != null) {
                Objects.requireNonNull(tVar);
                h.f(this, "call");
                h.f(interruptedIOException, "ioe");
            } else {
                h.j();
                throw null;
            }
        } else {
            Objects.requireNonNull(this.f3508f);
            h.f(this, "call");
        }
        return interruptedIOException;
    }

    public final void g() {
        h.a aVar = j.n0.k.h.f3695c;
        this.f3511i = j.n0.k.h.a.g("response.body().close()");
        Objects.requireNonNull(this.f3508f);
        i.s.c.h.f(this, "call");
    }

    public final void h(boolean z) {
        c cVar;
        synchronized (this) {
            if (!this.p) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (cVar = this.r) != null) {
            cVar.f3489f.cancel();
            cVar.f3487c.j(cVar, true, true, null);
        }
        this.f3515m = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007e, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = k(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r0 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        throw new i.j("null cannot be cast to non-null type kotlin.Throwable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        r2 = r0;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
        if (r0 == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        k(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j.i0 i() {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.g.e.i():j.i0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027 A[Catch:{ all -> 0x0019 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E j(j.n0.g.c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            i.s.c.h.f(r3, r0)
            j.n0.g.c r0 = r2.r
            boolean r3 = i.s.c.h.a(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0010
            return r6
        L_0x0010:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x001b
            boolean r1 = r2.n     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0021
            goto L_0x001b
        L_0x0019:
            r3 = move-exception
            goto L_0x0042
        L_0x001b:
            if (r5 == 0) goto L_0x0044
            boolean r1 = r2.o     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0044
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r2.n = r3     // Catch:{ all -> 0x0019 }
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r2.o = r3     // Catch:{ all -> 0x0019 }
        L_0x0029:
            boolean r4 = r2.n     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x0033
            boolean r5 = r2.o     // Catch:{ all -> 0x0019 }
            if (r5 != 0) goto L_0x0033
            r5 = r0
            goto L_0x0034
        L_0x0033:
            r5 = r3
        L_0x0034:
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.o     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.p     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            r3 = r0
        L_0x003f:
            r4 = r3
            r3 = r5
            goto L_0x0045
        L_0x0042:
            monitor-exit(r2)
            throw r3
        L_0x0044:
            r4 = r3
        L_0x0045:
            monitor-exit(r2)
            if (r3 == 0) goto L_0x005a
            r3 = 0
            r2.r = r3
            j.n0.g.i r3 = r2.f3513k
            if (r3 == 0) goto L_0x005a
            monitor-enter(r3)
            int r5 = r3.f3531l     // Catch:{ all -> 0x0057 }
            int r5 = r5 + r0
            r3.f3531l = r5     // Catch:{ all -> 0x0057 }
            monitor-exit(r3)
            goto L_0x005a
        L_0x0057:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x005a:
            if (r4 == 0) goto L_0x0061
            java.io.IOException r3 = r2.f(r6)
            return r3
        L_0x0061:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n0.g.e.j(j.n0.g.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException k(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.p) {
                this.p = false;
                if (!this.n && !this.o) {
                    z = true;
                }
            }
        }
        return z ? f(iOException) : iOException;
    }

    public final Socket l() {
        i iVar = this.f3513k;
        if (iVar != null) {
            byte[] bArr = j.n0.c.a;
            List<Reference<e>> list = iVar.o;
            Iterator<Reference<e>> it = list.iterator();
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (i.s.c.h.a(it.next().get(), this)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                list.remove(i2);
                this.f3513k = null;
                if (list.isEmpty()) {
                    iVar.p = System.nanoTime();
                    j jVar = this.e;
                    Objects.requireNonNull(jVar);
                    i.s.c.h.f(iVar, "connection");
                    byte[] bArr2 = j.n0.c.a;
                    if (iVar.f3528i || jVar.e == 0) {
                        iVar.f3528i = true;
                        jVar.f3534d.remove(iVar);
                        if (jVar.f3534d.isEmpty()) {
                            jVar.b.a();
                        }
                        z = true;
                    } else {
                        jVar.b.c(jVar.f3533c, 0);
                    }
                    if (z) {
                        return iVar.m();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        i.s.c.h.j();
        throw null;
    }

    @Override // j.e
    public void u(f fVar) {
        a aVar;
        i.s.c.h.f(fVar, "responseCallback");
        if (this.f3510h.compareAndSet(false, true)) {
            g();
            q qVar = this.t.f3371h;
            a aVar2 = new a(this, fVar);
            Objects.requireNonNull(qVar);
            i.s.c.h.f(aVar2, "call");
            synchronized (qVar) {
                qVar.b.add(aVar2);
                if (!aVar2.f3517g.v) {
                    String a2 = aVar2.a();
                    Iterator<a> it = qVar.f3703c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<a> it2 = qVar.b.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    aVar = null;
                                    break;
                                }
                                aVar = it2.next();
                                if (i.s.c.h.a(aVar.a(), a2)) {
                                    break;
                                }
                            }
                        } else {
                            aVar = it.next();
                            if (i.s.c.h.a(aVar.a(), a2)) {
                                break;
                            }
                        }
                    }
                    if (aVar != null) {
                        i.s.c.h.f(aVar, "other");
                        aVar2.e = aVar.e;
                    }
                }
            }
            qVar.c();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }
}
