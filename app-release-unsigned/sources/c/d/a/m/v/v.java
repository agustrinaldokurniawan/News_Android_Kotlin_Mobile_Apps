package c.d.a.m.v;

import c.d.a.s.k.a;
import c.d.a.s.k.d;
import g.h.i.c;
import java.util.Objects;

public final class v<Z> implements w<Z>, a.d {
    public static final c<v<?>> e = c.d.a.s.k.a.a(20, new a());

    /* renamed from: f  reason: collision with root package name */
    public final d f974f = new d.b();

    /* renamed from: g  reason: collision with root package name */
    public w<Z> f975g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f976h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f977i;

    public class a implements a.b<v<?>> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.d.a.s.k.a.b
        public v<?> a() {
            return new v();
        }
    }

    public static <Z> v<Z> e(w<Z> wVar) {
        v<Z> vVar = (v<Z>) e.b();
        Objects.requireNonNull(vVar, "Argument must not be null");
        vVar.f977i = false;
        vVar.f976h = true;
        vVar.f975g = wVar;
        return vVar;
    }

    @Override // c.d.a.s.k.a.d
    public d a() {
        return this.f974f;
    }

    @Override // c.d.a.m.v.w
    public int b() {
        return this.f975g.b();
    }

    @Override // c.d.a.m.v.w
    public Class<Z> c() {
        return this.f975g.c();
    }

    @Override // c.d.a.m.v.w
    public synchronized void d() {
        this.f974f.a();
        this.f977i = true;
        if (!this.f976h) {
            this.f975g.d();
            this.f975g = null;
            e.a(this);
        }
    }

    public synchronized void f() {
        this.f974f.a();
        if (this.f976h) {
            this.f976h = false;
            if (this.f977i) {
                d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // c.d.a.m.v.w
    public Z get() {
        return this.f975g.get();
    }
}
