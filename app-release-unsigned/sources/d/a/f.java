package d.a;

import d.a.a.e;
import d.a.a.o;
import h.a.t.a;
import i.g;
import i.m;
import i.q.j.a.d;
import i.s.b.l;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class f<T> extends w<T> implements e<T>, d {

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1814h = AtomicIntegerFieldUpdater.newUpdater(f.class, "_decision");

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1815i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_state");
    public volatile int _decision = 0;
    public volatile Object _parentHandle = null;
    public volatile Object _state = b.e;

    /* renamed from: j  reason: collision with root package name */
    public final i.q.f f1816j;

    /* renamed from: k  reason: collision with root package name */
    public final i.q.d<T> f1817k;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: i.q.d<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(i.q.d<? super T> dVar, int i2) {
        super(i2);
        this.f1817k = dVar;
        this.f1816j = dVar.d();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: java.util.concurrent.atomic.AtomicIntegerFieldUpdater */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // i.q.d
    public void a(Object obj) {
        Object obj2;
        Object obj3;
        Throwable a = g.a(obj);
        if (a != null) {
            obj = new m(a, false, 2);
        }
        int i2 = this.f1836g;
        do {
            obj2 = this._state;
            if (obj2 instanceof u0) {
                u0 u0Var = (u0) obj2;
                if (!(obj instanceof m) && a.C(i2) && (u0Var instanceof d)) {
                    if (!(u0Var instanceof d)) {
                        u0Var = null;
                    }
                    obj3 = new l(obj, (d) u0Var, null, null, null, 16);
                } else {
                    obj3 = obj;
                }
            } else {
                if (obj2 instanceof g) {
                    g gVar = (g) obj2;
                    Objects.requireNonNull(gVar);
                    if (g.f1818c.compareAndSet(gVar, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        } while (!f1815i.compareAndSet(this, obj2, obj3));
        m();
        n(i2);
    }

    @Override // d.a.w
    public void b(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof u0) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof m)) {
                if (obj2 instanceof l) {
                    l lVar = (l) obj2;
                    if (!(lVar.e != null)) {
                        if (f1815i.compareAndSet(this, obj2, l.a(lVar, null, null, null, null, th, 15))) {
                            d dVar = lVar.b;
                            if (dVar != null) {
                                j(dVar, th);
                            }
                            l<Throwable, m> lVar2 = lVar.f1825c;
                            if (lVar2 != null) {
                                k(lVar2, th);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f1815i.compareAndSet(this, obj2, new l(obj2, null, null, null, th, 14))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // d.a.w
    public final i.q.d<T> c() {
        return this.f1817k;
    }

    @Override // i.q.d
    public i.q.f d() {
        return this.f1816j;
    }

    @Override // d.a.w
    public Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e != null) {
            return e;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // d.a.w
    public <T> T f(Object obj) {
        return obj instanceof l ? (T) ((l) obj).a : obj;
    }

    @Override // d.a.w
    public Object h() {
        return this._state;
    }

    public final void i(l<? super Throwable, m> lVar, Throwable th) {
        try {
            lVar.o(th);
        } catch (Throwable th2) {
            i.q.f fVar = this.f1816j;
            a.x(fVar, new p("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void j(d dVar, Throwable th) {
        try {
            dVar.a(th);
        } catch (Throwable th2) {
            i.q.f fVar = this.f1816j;
            a.x(fVar, new p("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(l<? super Throwable, m> lVar, Throwable th) {
        try {
            lVar.o(th);
        } catch (Throwable th2) {
            i.q.f fVar = this.f1816j;
            a.x(fVar, new p("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public boolean l(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof u0)) {
                return false;
            }
            z = obj instanceof d;
        } while (!f1815i.compareAndSet(this, obj, new g(this, th, z)));
        if (!z) {
            obj = null;
        }
        d dVar = (d) obj;
        if (dVar != null) {
            j(dVar, th);
        }
        m();
        n(this.f1836g);
        return true;
    }

    public final void m() {
        if (!q()) {
            y yVar = (y) this._parentHandle;
            if (yVar != null) {
                yVar.e();
            }
            this._parentHandle = t0.e;
        }
    }

    public final void n(int i2) {
        boolean z;
        boolean z2;
        while (true) {
            int i3 = this._decision;
            z = false;
            if (i3 == 0) {
                if (f1814h.compareAndSet(this, 0, 2)) {
                    z2 = true;
                    break;
                }
            } else if (i3 == 1) {
                z2 = false;
            } else {
                throw new IllegalStateException("Already resumed".toString());
            }
        }
        if (!z2) {
            i.q.d<T> c2 = c();
            boolean z3 = i2 == 4;
            if (z3 || !(c2 instanceof e) || a.C(i2) != a.C(this.f1836g)) {
                a.N(this, c2, z3);
                return;
            }
            s sVar = ((e) c2).f1760l;
            i.q.f d2 = c2.d();
            if (sVar.e0(d2)) {
                sVar.d0(d2, this);
                return;
            }
            w0 w0Var = w0.b;
            a0 a = w0.a();
            if (a.f1771f >= a.g0(true)) {
                z = true;
            }
            if (z) {
                a.h0(this);
                return;
            }
            a.i0(true);
            try {
                a.N(this, c(), true);
                do {
                } while (a.j0());
            } catch (Throwable th) {
                a.f0(true);
                throw th;
            }
            a.f0(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: java.util.concurrent.atomic.AtomicReferenceFieldUpdater */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: java.util.concurrent.atomic.AtomicReferenceFieldUpdater */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object o() {
        l0 l0Var;
        l0 l0Var2;
        boolean z = true;
        boolean z2 = !(this._state instanceof u0);
        if (this.f1836g == 2) {
            i.q.d<T> dVar = this.f1817k;
            Throwable th = null;
            if (!(dVar instanceof e)) {
                dVar = null;
            }
            e eVar = (e) dVar;
            if (eVar != null) {
                while (true) {
                    Object obj = eVar._reusableCancellableContinuation;
                    o oVar = d.a.a.f.b;
                    if (obj == oVar) {
                        if (e.f1756h.compareAndSet(eVar, oVar, this)) {
                            break;
                        }
                    } else if (obj != null) {
                        if (!(obj instanceof Throwable)) {
                            throw new IllegalStateException(("Inconsistent state " + obj).toString());
                        } else if (e.f1756h.compareAndSet(eVar, obj, null)) {
                            th = (Throwable) obj;
                        } else {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                }
                if (th != null) {
                    if (!z2) {
                        l(th);
                    }
                    z2 = true;
                }
            }
        }
        if (!z2 && ((y) this._parentHandle) == null && (l0Var2 = (l0) this.f1817k.d().get(l0.f1827d)) != null) {
            y A = a.A(l0Var2, true, false, new h(l0Var2, this), 2, null);
            this._parentHandle = A;
            if ((!(this._state instanceof u0)) && !q()) {
                A.e();
                this._parentHandle = t0.e;
            }
        }
        while (true) {
            int i2 = this._decision;
            if (i2 == 0) {
                if (f1814h.compareAndSet(this, 0, 1)) {
                    break;
                }
            } else if (i2 == 2) {
                z = false;
            } else {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z) {
            return i.q.i.a.e;
        }
        Object obj2 = this._state;
        if (obj2 instanceof m) {
            throw ((m) obj2).b;
        } else if (!a.C(this.f1836g) || (l0Var = (l0) this.f1816j.get(l0.f1827d)) == null || l0Var.b()) {
            return f(obj2);
        } else {
            CancellationException n = l0Var.n();
            b(obj2, n);
            throw n;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.concurrent.atomic.AtomicIntegerFieldUpdater */
    /* JADX WARN: Multi-variable type inference failed */
    public void p(l<? super Throwable, m> lVar) {
        d i0Var = lVar instanceof d ? (d) lVar : new i0(lVar);
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof b)) {
                Throwable th = null;
                if (!(obj instanceof d)) {
                    boolean z = obj instanceof m;
                    boolean z2 = true;
                    if (z) {
                        m mVar = (m) obj;
                        Objects.requireNonNull(mVar);
                        if (!m.a.compareAndSet(mVar, 0, 1)) {
                            r(lVar, obj);
                            throw null;
                        } else if (obj instanceof g) {
                            if (!z) {
                                obj = null;
                            }
                            m mVar2 = (m) obj;
                            if (mVar2 != null) {
                                th = mVar2.b;
                            }
                            i(lVar, th);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj instanceof l) {
                        l lVar2 = (l) obj;
                        if (lVar2.b == null) {
                            Throwable th2 = lVar2.e;
                            if (th2 == null) {
                                z2 = false;
                            }
                            if (z2) {
                                i(lVar, th2);
                                return;
                            } else {
                                if (f1815i.compareAndSet(this, obj, l.a(lVar2, null, i0Var, null, null, null, 29))) {
                                    return;
                                }
                            }
                        } else {
                            r(lVar, obj);
                            throw null;
                        }
                    } else {
                        if (f1815i.compareAndSet(this, obj, new l(obj, i0Var, null, null, null, 28))) {
                            return;
                        }
                    }
                } else {
                    r(lVar, obj);
                    throw null;
                }
            } else if (f1815i.compareAndSet(this, obj, i0Var)) {
                return;
            }
        }
    }

    public final boolean q() {
        i.q.d<T> dVar = this.f1817k;
        if (dVar instanceof e) {
            Object obj = ((e) dVar)._reusableCancellableContinuation;
            if (obj != null && (!(obj instanceof f) || obj == this)) {
                return true;
            }
        }
        return false;
    }

    public final void r(l<? super Throwable, m> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public String toString() {
        return "CancellableContinuation" + '(' + a.a0(this.f1817k) + "){" + this._state + "}@" + a.u(this);
    }
}
