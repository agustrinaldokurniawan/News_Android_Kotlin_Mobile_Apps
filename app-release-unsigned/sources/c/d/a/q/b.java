package c.d.a.q;

public final class b implements d, c {
    public final Object a;
    public final d b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f1135c;

    /* renamed from: d  reason: collision with root package name */
    public volatile c f1136d;
    public int e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f1137f = 3;

    public b(Object obj, d dVar) {
        this.a = obj;
        this.b = dVar;
    }

    @Override // c.d.a.q.c, c.d.a.q.d
    public boolean a() {
        boolean z;
        synchronized (this.a) {
            if (!this.f1135c.a()) {
                if (!this.f1136d.a()) {
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
        synchronized (this.a) {
            d dVar = this.b;
            z = false;
            if (dVar != null) {
                if (!dVar.b(this)) {
                    z2 = false;
                    if (z2 && m(cVar)) {
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
        synchronized (this.a) {
            d dVar = this.b;
            c2 = dVar != null ? dVar.c() : this;
        }
        return c2;
    }

    @Override // c.d.a.q.c
    public void clear() {
        synchronized (this.a) {
            this.e = 3;
            this.f1135c.clear();
            if (this.f1137f != 3) {
                this.f1137f = 3;
                this.f1136d.clear();
            }
        }
    }

    @Override // c.d.a.q.d
    public void d(c cVar) {
        synchronized (this.a) {
            if (!cVar.equals(this.f1136d)) {
                this.e = 5;
                if (this.f1137f != 1) {
                    this.f1137f = 1;
                    this.f1136d.f();
                }
                return;
            }
            this.f1137f = 5;
            d dVar = this.b;
            if (dVar != null) {
                dVar.d(this);
            }
        }
    }

    @Override // c.d.a.q.c
    public void e() {
        synchronized (this.a) {
            if (this.e == 1) {
                this.e = 2;
                this.f1135c.e();
            }
            if (this.f1137f == 1) {
                this.f1137f = 2;
                this.f1136d.e();
            }
        }
    }

    @Override // c.d.a.q.c
    public void f() {
        synchronized (this.a) {
            if (this.e != 1) {
                this.e = 1;
                this.f1135c.f();
            }
        }
    }

    @Override // c.d.a.q.d
    public void g(c cVar) {
        synchronized (this.a) {
            if (cVar.equals(this.f1135c)) {
                this.e = 4;
            } else if (cVar.equals(this.f1136d)) {
                this.f1137f = 4;
            }
            d dVar = this.b;
            if (dVar != null) {
                dVar.g(this);
            }
        }
    }

    @Override // c.d.a.q.c
    public boolean h(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        return this.f1135c.h(bVar.f1135c) && this.f1136d.h(bVar.f1136d);
    }

    @Override // c.d.a.q.c
    public boolean i() {
        boolean z;
        synchronized (this.a) {
            if (this.e != 4) {
                if (this.f1137f != 4) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // c.d.a.q.c
    public boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            z = true;
            if (this.e != 1) {
                if (this.f1137f != 1) {
                    z = false;
                }
            }
        }
        return z;
    }

    @Override // c.d.a.q.c
    public boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.e == 3 && this.f1137f == 3;
        }
        return z;
    }

    @Override // c.d.a.q.d
    public boolean k(c cVar) {
        boolean z;
        boolean z2;
        synchronized (this.a) {
            d dVar = this.b;
            z = false;
            if (dVar != null) {
                if (!dVar.k(this)) {
                    z2 = false;
                    if (z2 && m(cVar)) {
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
        synchronized (this.a) {
            d dVar = this.b;
            z = false;
            if (dVar != null) {
                if (!dVar.l(this)) {
                    z2 = false;
                    if (z2 && m(cVar)) {
                        z = true;
                    }
                }
            }
            z2 = true;
            z = true;
        }
        return z;
    }

    public final boolean m(c cVar) {
        return cVar.equals(this.f1135c) || (this.e == 5 && cVar.equals(this.f1136d));
    }
}
