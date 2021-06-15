package d.a;

import i.q.b;
import i.q.d;
import i.q.e;
import i.q.f;
import i.s.c.f;
import i.s.c.h;

public abstract class s extends i.q.a implements e {
    public static final a e = new a(null);

    public static final class a extends b<e, s> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar) {
            super(e.a.a, r.f1833f);
            int i2 = e.b;
        }
    }

    public s() {
        super(e.a.a);
    }

    @Override // i.q.e
    public void c(d<?> dVar) {
        Object obj = ((d.a.a.e) dVar)._reusableCancellableContinuation;
        if (!(obj instanceof f)) {
            obj = null;
        }
        f fVar = (f) obj;
        if (fVar != null) {
            y yVar = (y) fVar._parentHandle;
            if (yVar != null) {
                yVar.e();
            }
            fVar._parentHandle = t0.e;
        }
    }

    public abstract void d0(i.q.f fVar, Runnable runnable);

    public boolean e0(i.q.f fVar) {
        return !(this instanceof x0);
    }

    @Override // i.q.a, i.q.f, i.q.f.a
    public <E extends f.a> E get(f.b<E> bVar) {
        h.e(bVar, "key");
        if (bVar instanceof b) {
            b bVar2 = (b) bVar;
            f.b<?> key = getKey();
            h.e(key, "key");
            if (!(key == bVar2 || bVar2.a == key)) {
                return null;
            }
            h.e(this, "element");
            E o = bVar2.b.o(this);
            if (!(o instanceof f.a)) {
                return null;
            }
            return o;
        } else if (e.a.a == bVar) {
            return this;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r3.a(r2) != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (i.q.e.a.a == r3) goto L_0x0024;
     */
    @Override // i.q.a, i.q.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i.q.f minusKey(i.q.f.b<?> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            i.s.c.h.e(r3, r0)
            boolean r1 = r3 instanceof i.q.b
            if (r1 == 0) goto L_0x0029
            i.q.b r3 = (i.q.b) r3
            i.q.f$b r1 = r2.getKey()
            i.s.c.h.e(r1, r0)
            if (r1 == r3) goto L_0x001b
            i.q.f$b<?> r0 = r3.a
            if (r0 != r1) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x0027
            i.q.f$a r3 = r3.a(r2)
            if (r3 == 0) goto L_0x0027
        L_0x0024:
            i.q.h r3 = i.q.h.e
            goto L_0x002e
        L_0x0027:
            r3 = r2
            goto L_0x002e
        L_0x0029:
            i.q.e$a r0 = i.q.e.a.a
            if (r0 != r3) goto L_0x0027
            goto L_0x0024
        L_0x002e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.s.minusKey(i.q.f$b):i.q.f");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + h.a.t.a.u(this);
    }

    @Override // i.q.e
    public final <T> d<T> u(d<? super T> dVar) {
        return new d.a.a.e(this, dVar);
    }
}
