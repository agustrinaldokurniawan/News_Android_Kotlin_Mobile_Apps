package c.d.a.q;

import g.f.c.g;

public class i implements d, c {
    public final d a;
    public final Object b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f1148c;

    /* renamed from: d  reason: collision with root package name */
    public volatile c f1149d;
    public int e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f1150f = 3;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1151g;

    public i(Object obj, d dVar) {
        this.b = obj;
        this.a = dVar;
    }

    @Override // c.d.a.q.c, c.d.a.q.d
    public boolean a() {
        boolean z;
        synchronized (this.b) {
            if (!this.f1149d.a()) {
                if (!this.f1148c.a()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // c.d.a.q.d
    public boolean b(c cVar) {
        boolean z;
        boolean z2;
        synchronized (this.b) {
            d dVar = this.a;
            z = false;
            if (dVar != null) {
                if (!dVar.b(this)) {
                    z2 = false;
                    if (z2 && (cVar.equals(this.f1148c) || this.e != 4)) {
                        z = true;
                    }
                }
            }
            z2 = true;
            z = true;
        }
        return z;
    }

    @Override // c.d.a.q.d
    public d c() {
        d c2;
        synchronized (this.b) {
            d dVar = this.a;
            c2 = dVar != null ? dVar.c() : this;
        }
        return c2;
    }

    @Override // c.d.a.q.c
    public void clear() {
        synchronized (this.b) {
            this.f1151g = false;
            this.e = 3;
            this.f1150f = 3;
            this.f1149d.clear();
            this.f1148c.clear();
        }
    }

    @Override // c.d.a.q.d
    public void d(c cVar) {
        synchronized (this.b) {
            if (!cVar.equals(this.f1148c)) {
                this.f1150f = 5;
                return;
            }
            this.e = 5;
            d dVar = this.a;
            if (dVar != null) {
                dVar.d(this);
            }
        }
    }

    @Override // c.d.a.q.c
    public void e() {
        synchronized (this.b) {
            if (!g.j(this.f1150f)) {
                this.f1150f = 2;
                this.f1149d.e();
            }
            if (!g.j(this.e)) {
                this.e = 2;
                this.f1148c.e();
            }
        }
    }

    @Override // c.d.a.q.c
    public void f() {
        synchronized (this.b) {
            this.f1151g = true;
            try {
                if (!(this.e == 4 || this.f1150f == 1)) {
                    this.f1150f = 1;
                    this.f1149d.f();
                }
                if (this.f1151g && this.e != 1) {
                    this.e = 1;
                    this.f1148c.f();
                }
            } finally {
                this.f1151g = false;
            }
        }
    }

    @Override // c.d.a.q.d
    public void g(c cVar) {
        synchronized (this.b) {
            if (cVar.equals(this.f1149d)) {
                this.f1150f = 4;
                return;
            }
            this.e = 4;
            d dVar = this.a;
            if (dVar != null) {
                dVar.g(this);
            }
            if (!g.j(this.f1150f)) {
                this.f1149d.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // c.d.a.q.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(c.d.a.q.c r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof c.d.a.q.i
            r1 = 0
            if (r0 == 0) goto L_0x002e
            c.d.a.q.i r4 = (c.d.a.q.i) r4
            c.d.a.q.c r0 = r3.f1148c
            if (r0 != 0) goto L_0x0010
            c.d.a.q.c r0 = r4.f1148c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            c.d.a.q.c r0 = r3.f1148c
            c.d.a.q.c r2 = r4.f1148c
            boolean r0 = r0.h(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            c.d.a.q.c r0 = r3.f1149d
            if (r0 != 0) goto L_0x0023
            c.d.a.q.c r4 = r4.f1149d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            c.d.a.q.c r0 = r3.f1149d
            c.d.a.q.c r4 = r4.f1149d
            boolean r4 = r0.h(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.q.i.h(c.d.a.q.c):boolean");
    }

    @Override // c.d.a.q.c
    public boolean i() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 4;
        }
        return z;
    }

    @Override // c.d.a.q.c
    public boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // c.d.a.q.c
    public boolean j() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 3;
        }
        return z;
    }

    @Override // c.d.a.q.d
    public boolean k(c cVar) {
        boolean z;
        boolean z2;
        synchronized (this.b) {
            d dVar = this.a;
            z = false;
            if (dVar != null) {
                if (!dVar.k(this)) {
                    z2 = false;
                    if (z2 && cVar.equals(this.f1148c) && !a()) {
                        z = true;
                    }
                }
            }
            z2 = true;
            z = true;
        }
        return z;
    }

    @Override // c.d.a.q.d
    public boolean l(c cVar) {
        boolean z;
        boolean z2;
        synchronized (this.b) {
            d dVar = this.a;
            z = false;
            if (dVar != null) {
                if (!dVar.l(this)) {
                    z2 = false;
                    if (z2 && cVar.equals(this.f1148c) && this.e != 2) {
                        z = true;
                    }
                }
            }
            z2 = true;
            z = true;
        }
        return z;
    }
}
