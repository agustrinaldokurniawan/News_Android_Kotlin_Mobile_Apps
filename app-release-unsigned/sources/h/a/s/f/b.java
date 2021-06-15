package h.a.s.f;

import h.a.s.c.d;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class b<E> extends AtomicReferenceArray<E> implements d<E> {
    public static final Integer e = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: f  reason: collision with root package name */
    public final int f3191f = (length() - 1);

    /* renamed from: g  reason: collision with root package name */
    public final AtomicLong f3192g = new AtomicLong();

    /* renamed from: h  reason: collision with root package name */
    public long f3193h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicLong f3194i = new AtomicLong();

    /* renamed from: j  reason: collision with root package name */
    public final int f3195j;

    public b(int i2) {
        super(c.f.a.b.e(i2));
        this.f3195j = Math.min(i2 / 4, e.intValue());
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
    public E d() {
        long j2 = this.f3194i.get();
        int i2 = ((int) j2) & this.f3191f;
        E e2 = get(i2);
        if (e2 == null) {
            return null;
        }
        this.f3194i.lazySet(j2 + 1);
        lazySet(i2, null);
        return e2;
    }

    @Override // h.a.s.c.e
    public boolean i(E e2) {
        Objects.requireNonNull(e2, "Null is not a valid element");
        int i2 = this.f3191f;
        long j2 = this.f3192g.get();
        int i3 = ((int) j2) & i2;
        if (j2 >= this.f3193h) {
            long j3 = ((long) this.f3195j) + j2;
            if (get(i2 & ((int) j3)) == null) {
                this.f3193h = j3;
            } else if (get(i3) != null) {
                return false;
            }
        }
        lazySet(i3, e2);
        this.f3192g.lazySet(j2 + 1);
        return true;
    }

    @Override // h.a.s.c.e
    public boolean isEmpty() {
        return this.f3192g.get() == this.f3194i.get();
    }
}
