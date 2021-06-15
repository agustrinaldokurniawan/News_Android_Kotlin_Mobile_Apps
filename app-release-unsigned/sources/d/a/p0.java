package d.a;

import d.a.a.h;
import d.a.a.i;
import d.a.a.m;
import i.q.f;
import i.s.b.l;
import i.s.b.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class p0 implements l0 {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(p0.class, Object.class, "_state");
    public volatile Object _state;

    public static final class a implements h0 {
        public volatile Object _exceptionsHolder;
        public volatile int _isCompleting;
        public volatile Object _rootCause;
        public final s0 e;

        public final boolean a() {
            return ((Throwable) this._rootCause) != null;
        }

        @Override // d.a.h0
        public boolean b() {
            return ((Throwable) this._rootCause) == null;
        }

        @Override // d.a.h0
        public s0 f() {
            return this.e;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.StringBuilder */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r2 = this;
                java.lang.String r0 = "Finishing[cancelling="
                java.lang.StringBuilder r0 = c.c.a.a.a.f(r0)
                boolean r1 = r2.a()
                r0.append(r1)
                java.lang.String r1 = ", completing="
                r0.append(r1)
                int r1 = r2._isCompleting
                r0.append(r1)
                java.lang.String r1 = ", rootCause="
                r0.append(r1)
                java.lang.Object r1 = r2._rootCause
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.append(r1)
                java.lang.String r1 = ", exceptions="
                r0.append(r1)
                java.lang.Object r1 = r2._exceptionsHolder
                r0.append(r1)
                java.lang.String r1 = ", list="
                r0.append(r1)
                d.a.s0 r1 = r2.e
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.p0.a.toString():java.lang.String");
        }
    }

    public static final class b extends i.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ p0 f1829d;
        public final /* synthetic */ Object e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(i iVar, i iVar2, p0 p0Var, Object obj) {
            super(iVar2);
            this.f1829d = p0Var;
            this.e = obj;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // d.a.a.d
        public Object c(i iVar) {
            if (this.f1829d.d() == this.e) {
                return null;
            }
            return h.a;
        }
    }

    public final boolean a(Object obj, s0 s0Var, o0<?> o0Var) {
        boolean z;
        b bVar = new b(o0Var, o0Var, this, obj);
        do {
            i l2 = s0Var.l();
            i.f1762f.lazySet(o0Var, l2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i.e;
            atomicReferenceFieldUpdater.lazySet(o0Var, s0Var);
            bVar.b = s0Var;
            z = !atomicReferenceFieldUpdater.compareAndSet(l2, s0Var, bVar) ? false : bVar.a(l2) == null ? true : true;
            if (z) {
                return true;
            }
        } while (!z);
        return false;
    }

    @Override // d.a.l0
    public boolean b() {
        Object d2 = d();
        return (d2 instanceof h0) && ((h0) d2).b();
    }

    public final Object d() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof m)) {
                return obj;
            }
            ((m) obj).a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [d.a.g0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // d.a.l0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final d.a.y e(boolean r8, boolean r9, i.s.b.l<? super java.lang.Throwable, i.m> r10) {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.p0.e(boolean, boolean, i.s.b.l):d.a.y");
    }

    public final o0<?> f(l<? super Throwable, i.m> lVar, boolean z) {
        n0 n0Var = null;
        if (z) {
            if (lVar instanceof n0) {
                n0Var = lVar;
            }
            n0 n0Var2 = n0Var;
            return n0Var2 != null ? n0Var2 : new j0(this, lVar);
        }
        if (lVar instanceof o0) {
            n0Var = lVar;
        }
        o0<?> o0Var = n0Var;
        return o0Var != null ? o0Var : new k0(this, lVar);
    }

    @Override // i.q.f
    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        return (R) f.a.C0119a.a(this, r, pVar);
    }

    public final void g(o0<?> o0Var) {
        s0 s0Var = new s0();
        i.f1762f.lazySet(s0Var, o0Var);
        i.e.lazySet(s0Var, o0Var);
        while (true) {
            if (o0Var.h() == o0Var) {
                if (i.e.compareAndSet(o0Var, o0Var, s0Var)) {
                    s0Var.g(o0Var);
                    break;
                }
            } else {
                break;
            }
        }
        e.compareAndSet(this, o0Var, o0Var.i());
    }

    @Override // i.q.f, i.q.f.a
    public <E extends f.a> E get(f.b<E> bVar) {
        return (E) f.a.C0119a.b(this, bVar);
    }

    @Override // i.q.f.a
    public final f.b<?> getKey() {
        return l0.f1827d;
    }

    public final String h(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (aVar.a()) {
                return "Cancelling";
            }
            return aVar._isCompleting != 0 ? "Completing" : "Active";
        } else if (!(obj instanceof h0)) {
            return obj instanceof m ? "Cancelled" : "Completed";
        } else {
            if (((h0) obj).b()) {
                return "Active";
            }
            return "New";
        }
    }

    public final CancellationException i(Throwable th, String str) {
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException == null) {
            if (str == null) {
                str = "Job was cancelled";
            }
            cancellationException = new m0(str, th, this);
        }
        return cancellationException;
    }

    @Override // i.q.f
    public f minusKey(f.b<?> bVar) {
        return f.a.C0119a.c(this, bVar);
    }

    @Override // d.a.l0
    public final CancellationException n() {
        Object d2 = d();
        if (d2 instanceof a) {
            Throwable th = (Throwable) ((a) d2)._rootCause;
            if (th != null) {
                return i(th, p0.class.getSimpleName() + " is cancelling");
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (d2 instanceof h0) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (d2 instanceof m) {
            return i(((m) d2).b, null);
        } else {
            return new m0(p0.class.getSimpleName() + " has completed normally", null, this);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(p0.class.getSimpleName() + '{' + h(d()) + '}');
        sb.append('@');
        sb.append(h.a.t.a.u(this));
        return sb.toString();
    }
}
