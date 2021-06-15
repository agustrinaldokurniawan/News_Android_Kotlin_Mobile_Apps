package d.a.a;

import d.a.a.a;
import d.a.a0;
import d.a.m;
import d.a.n;
import d.a.s;
import d.a.w;
import d.a.w0;
import i.g;
import i.q.f;
import i.q.j.a.d;
import i.s.c.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class e<T> extends w<T> implements d, i.q.d<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1756h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_reusableCancellableContinuation");
    public volatile Object _reusableCancellableContinuation;

    /* renamed from: i  reason: collision with root package name */
    public Object f1757i = f.a;

    /* renamed from: j  reason: collision with root package name */
    public final d f1758j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f1759k;

    /* renamed from: l  reason: collision with root package name */
    public final s f1760l;

    /* renamed from: m  reason: collision with root package name */
    public final i.q.d<T> f1761m;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: i.q.d<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(s sVar, i.q.d<? super T> dVar) {
        super(-1);
        this.f1760l = sVar;
        this.f1761m = dVar;
        this.f1758j = (d) (!(dVar instanceof d) ? null : dVar);
        f d2 = d();
        o oVar = a.a;
        Object fold = d2.fold(0, a.b.f1753f);
        h.c(fold);
        this.f1759k = fold;
        this._reusableCancellableContinuation = null;
    }

    @Override // i.q.d
    public void a(Object obj) {
        f d2 = this.f1761m.d();
        Throwable a = g.a(obj);
        Object mVar = a == null ? obj : new m(a, false, 2);
        if (this.f1760l.e0(d2)) {
            this.f1757i = mVar;
            this.f1836g = 0;
            this.f1760l.d0(d2, this);
            return;
        }
        w0 w0Var = w0.b;
        a0 a2 = w0.a();
        if (a2.f1771f >= a2.g0(true)) {
            this.f1757i = mVar;
            this.f1836g = 0;
            a2.h0(this);
            return;
        }
        a2.i0(true);
        try {
            f d3 = d();
            Object b = a.b(d3, this.f1759k);
            try {
                this.f1761m.a(obj);
                do {
                } while (a2.j0());
            } finally {
                a.a(d3, b);
            }
        } catch (Throwable th) {
            a2.f0(true);
            throw th;
        }
        a2.f0(true);
    }

    @Override // d.a.w
    public void b(Object obj, Throwable th) {
        if (obj instanceof n) {
            ((n) obj).b.o(th);
        }
    }

    @Override // d.a.w
    public i.q.d<T> c() {
        return this;
    }

    @Override // i.q.d
    public f d() {
        return this.f1761m.d();
    }

    @Override // d.a.w
    public Object h() {
        Object obj = this.f1757i;
        this.f1757i = f.a;
        return obj;
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("DispatchedContinuation[");
        f2.append(this.f1760l);
        f2.append(", ");
        f2.append(h.a.t.a.a0(this.f1761m));
        f2.append(']');
        return f2.toString();
    }
}
