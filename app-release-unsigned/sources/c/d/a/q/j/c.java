package c.d.a.q.j;

import android.graphics.drawable.Drawable;
import c.c.a.a.a;
import c.d.a.q.h;
import c.d.a.s.j;

public abstract class c<T> implements h<T> {
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1152f;

    /* renamed from: g  reason: collision with root package name */
    public c.d.a.q.c f1153g;

    public c() {
        if (j.k(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.e = Integer.MIN_VALUE;
            this.f1152f = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException(a.m("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", Integer.MIN_VALUE, " and height: ", Integer.MIN_VALUE));
    }

    @Override // c.d.a.q.j.h
    public final void a(g gVar) {
    }

    @Override // c.d.a.q.j.h
    public void b(Drawable drawable) {
    }

    @Override // c.d.a.q.j.h
    public void d(Drawable drawable) {
    }

    @Override // c.d.a.n.m
    public void e() {
    }

    @Override // c.d.a.q.j.h
    public final c.d.a.q.c f() {
        return this.f1153g;
    }

    @Override // c.d.a.q.j.h
    public final void h(g gVar) {
        ((h) gVar).b(this.e, this.f1152f);
    }

    @Override // c.d.a.n.m
    public void i() {
    }

    @Override // c.d.a.q.j.h
    public final void j(c.d.a.q.c cVar) {
        this.f1153g = cVar;
    }

    @Override // c.d.a.n.m
    public void k() {
    }
}
