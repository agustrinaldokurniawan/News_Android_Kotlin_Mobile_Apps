package d.a.a;

import i.s.c.h;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class i {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next");

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1762f = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev");

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1763g = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef");
    public volatile Object _next = this;
    public volatile Object _prev = this;
    public volatile Object _removedRef = null;

    public static abstract class a extends d<i> {
        public i b;

        /* renamed from: c  reason: collision with root package name */
        public final i f1764c;

        public a(i iVar) {
            this.f1764c = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // d.a.a.d
        public void b(i iVar, Object obj) {
            i iVar2 = iVar;
            boolean z = obj == null;
            i iVar3 = z ? this.f1764c : this.b;
            if (iVar3 != null && i.e.compareAndSet(iVar2, this, iVar3) && z) {
                i iVar4 = this.f1764c;
                i iVar5 = this.b;
                h.c(iVar5);
                iVar4.g(iVar5);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (d.a.a.i.e.compareAndSet(r2, r1, ((d.a.a.n) r3).a) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final d.a.a.i a(d.a.a.m r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r7 = r6._prev
            d.a.a.i r7 = (d.a.a.i) r7
            r0 = 0
            r1 = r7
        L_0x0006:
            r2 = r0
        L_0x0007:
            java.lang.Object r3 = r1._next
            if (r3 != r6) goto L_0x0018
            if (r7 != r1) goto L_0x000e
            return r1
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = d.a.a.i.f1762f
            boolean r7 = r0.compareAndSet(r6, r7, r1)
            if (r7 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r1
        L_0x0018:
            boolean r4 = r6.m()
            if (r4 == 0) goto L_0x001f
            return r0
        L_0x001f:
            if (r3 != 0) goto L_0x0022
            return r1
        L_0x0022:
            boolean r4 = r3 instanceof d.a.a.m
            if (r4 == 0) goto L_0x002c
            d.a.a.m r3 = (d.a.a.m) r3
            r3.a(r1)
            goto L_0x0000
        L_0x002c:
            boolean r4 = r3 instanceof d.a.a.n
            if (r4 == 0) goto L_0x0046
            if (r2 == 0) goto L_0x0041
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = d.a.a.i.e
            d.a.a.n r3 = (d.a.a.n) r3
            d.a.a.i r3 = r3.a
            boolean r1 = r4.compareAndSet(r2, r1, r3)
            if (r1 != 0) goto L_0x003f
            goto L_0x0000
        L_0x003f:
            r1 = r2
            goto L_0x0006
        L_0x0041:
            java.lang.Object r1 = r1._prev
            d.a.a.i r1 = (d.a.a.i) r1
            goto L_0x0007
        L_0x0046:
        */
        //  java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
        /*
            java.util.Objects.requireNonNull(r3, r2)
            r2 = r3
            d.a.a.i r2 = (d.a.a.i) r2
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.i.a(d.a.a.m):d.a.a.i");
    }

    public final void g(i iVar) {
        i iVar2;
        do {
            iVar2 = (i) iVar._prev;
            if (h() != iVar) {
                return;
            }
        } while (!f1762f.compareAndSet(iVar, iVar2, this));
        if (m()) {
            iVar.a(null);
        }
    }

    public final Object h() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof m)) {
                return obj;
            }
            ((m) obj).a(this);
        }
    }

    public final i i() {
        i iVar;
        Object h2 = h();
        n nVar = (n) (!(h2 instanceof n) ? null : h2);
        if (nVar != null && (iVar = nVar.a) != null) {
            return iVar;
        }
        Objects.requireNonNull(h2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        return (i) h2;
    }

    public final i l() {
        i a2 = a(null);
        if (a2 == null) {
            Object obj = this._prev;
            while (true) {
                a2 = (i) obj;
                if (!a2.m()) {
                    break;
                }
                obj = a2._prev;
            }
        }
        return a2;
    }

    public boolean m() {
        return h() instanceof n;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }
}
