package h.a.s.f;

import c.f.a.b;
import h.a.s.c.d;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class c<T> implements d<T> {
    public static final int e = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: f  reason: collision with root package name */
    public static final Object f3196f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public final AtomicLong f3197g;

    /* renamed from: h  reason: collision with root package name */
    public int f3198h;

    /* renamed from: i  reason: collision with root package name */
    public long f3199i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3200j;

    /* renamed from: k  reason: collision with root package name */
    public AtomicReferenceArray<Object> f3201k;

    /* renamed from: l  reason: collision with root package name */
    public final int f3202l;

    /* renamed from: m  reason: collision with root package name */
    public AtomicReferenceArray<Object> f3203m;
    public final AtomicLong n = new AtomicLong();

    public c(int i2) {
        AtomicLong atomicLong = new AtomicLong();
        this.f3197g = atomicLong;
        int e2 = b.e(Math.max(8, i2));
        int i3 = e2 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(e2 + 1);
        this.f3201k = atomicReferenceArray;
        this.f3200j = i3;
        this.f3198h = Math.min(e2 / 4, e);
        this.f3203m = atomicReferenceArray;
        this.f3202l = i3;
        this.f3199i = (long) (i3 - 1);
        atomicLong.lazySet(0);
    }

    @Override // h.a.s.c.e
    public void clear() {
        while (true) {
            if (d() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // h.a.s.c.d, h.a.s.c.e
    public T d() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f3203m;
        long j2 = this.n.get();
        int i2 = this.f3202l;
        int i3 = ((int) j2) & i2;
        T t = (T) atomicReferenceArray.get(i3);
        boolean z = t == f3196f;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i3, null);
            this.n.lazySet(j2 + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            int i4 = i2 + 1;
            AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i4);
            atomicReferenceArray.lazySet(i4, null);
            this.f3203m = atomicReferenceArray2;
            T t2 = (T) atomicReferenceArray2.get(i3);
            if (t2 != null) {
                atomicReferenceArray2.lazySet(i3, null);
                this.n.lazySet(j2 + 1);
            }
            return t2;
        }
    }

    @Override // h.a.s.c.e
    public boolean i(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        AtomicReferenceArray<Object> atomicReferenceArray = this.f3201k;
        long j2 = this.f3197g.get();
        int i2 = this.f3200j;
        int i3 = ((int) j2) & i2;
        if (j2 < this.f3199i) {
            atomicReferenceArray.lazySet(i3, t);
            this.f3197g.lazySet(j2 + 1);
            return true;
        }
        long j3 = ((long) this.f3198h) + j2;
        if (atomicReferenceArray.get(((int) j3) & i2) == null) {
            this.f3199i = j3 - 1;
            atomicReferenceArray.lazySet(i3, t);
            this.f3197g.lazySet(j2 + 1);
            return true;
        }
        long j4 = j2 + 1;
        if (atomicReferenceArray.get(((int) j4) & i2) == null) {
            atomicReferenceArray.lazySet(i3, t);
            this.f3197g.lazySet(j4);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f3201k = atomicReferenceArray2;
        this.f3199i = (((long) i2) + j2) - 1;
        atomicReferenceArray2.lazySet(i3, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i3, f3196f);
        this.f3197g.lazySet(j4);
        return true;
    }

    @Override // h.a.s.c.e
    public boolean isEmpty() {
        return this.f3197g.get() == this.n.get();
    }
}
