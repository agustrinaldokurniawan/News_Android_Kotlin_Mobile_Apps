package d.a.a;

import i.s.c.f;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class k<E> {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");
    public static final AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(k.class, "_state");

    /* renamed from: c  reason: collision with root package name */
    public static final o f1765c = new o("REMOVE_FROZEN");

    /* renamed from: d  reason: collision with root package name */
    public static final a f1766d = new a(null);
    public volatile Object _next = null;
    public volatile long _state = 0;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public AtomicReferenceArray f1767f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1768g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1769h;

    public static final class a {
        public a(f fVar) {
        }
    }

    public static final class b {
        public final int a;

        public b(int i2) {
            this.a = i2;
        }
    }

    public k(int i2, boolean z) {
        this.f1768g = i2;
        this.f1769h = z;
        int i3 = i2 - 1;
        this.e = i3;
        this.f1767f = new AtomicReferenceArray(i2);
        boolean z2 = false;
        if (i3 <= 1073741823) {
            if (!((i2 & i3) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int a(E e2) {
        while (true) {
            long j2 = this._state;
            if ((3458764513820540928L & j2) != 0) {
                return (j2 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i2 = (int) ((1073741823 & j2) >> 0);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i4 = this.e;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            if (!this.f1769h && this.f1767f.get(i3 & i4) != null) {
                int i5 = this.f1768g;
                if (i5 < 1024 || ((i3 - i2) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            } else if (b.compareAndSet(this, j2, (-1152921503533105153L & j2) | (((long) ((i3 + 1) & 1073741823)) << 30))) {
                this.f1767f.set(i3 & i4, e2);
                k<E> kVar = this;
                while ((kVar._state & 1152921504606846976L) != 0) {
                    kVar = kVar.d();
                    Object obj = kVar.f1767f.get(kVar.e & i3);
                    if (!(obj instanceof b) || ((b) obj).a != i3) {
                        kVar = null;
                        continue;
                    } else {
                        kVar.f1767f.set(kVar.e & i3, e2);
                        continue;
                    }
                    if (kVar == null) {
                        break;
                    }
                }
                return 0;
            }
        }
        return 1;
    }

    public final boolean b() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!b.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    public final boolean c() {
        long j2 = this._state;
        return ((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: java.util.concurrent.atomic.AtomicReferenceArray */
    /* JADX WARN: Multi-variable type inference failed */
    public final k<E> d() {
        long j2;
        while (true) {
            j2 = this._state;
            if ((j2 & 1152921504606846976L) == 0) {
                long j3 = j2 | 1152921504606846976L;
                if (b.compareAndSet(this, j2, j3)) {
                    j2 = j3;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            k<E> kVar = (k) this._next;
            if (kVar != null) {
                return kVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            k kVar2 = new k(this.f1768g * 2, this.f1769h);
            int i2 = (int) ((1073741823 & j2) >> 0);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i4 = this.e;
                int i5 = i2 & i4;
                if (i5 == (i4 & i3)) {
                    break;
                }
                Object obj = this.f1767f.get(i5);
                if (obj == null) {
                    obj = new b(i2);
                }
                kVar2.f1767f.set(kVar2.e & i2, obj);
                i2++;
            }
            kVar2._state = -1152921504606846977L & j2;
            atomicReferenceFieldUpdater.compareAndSet(this, null, kVar2);
        }
    }

    public final Object e() {
        while (true) {
            long j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                return f1765c;
            }
            int i2 = (int) ((j2 & 1073741823) >> 0);
            int i3 = this.e;
            int i4 = ((int) ((1152921503533105152L & j2) >> 30)) & i3;
            int i5 = i3 & i2;
            if (i4 == i5) {
                return null;
            }
            Object obj = this.f1767f.get(i5);
            if (obj == null) {
                if (this.f1769h) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                long j3 = ((long) ((i2 + 1) & 1073741823)) << 0;
                if (b.compareAndSet(this, j2, (j2 & -1073741824) | j3)) {
                    this.f1767f.set(this.e & i2, null);
                    return obj;
                } else if (this.f1769h) {
                    k<E> kVar = this;
                    while (true) {
                        long j4 = kVar._state;
                        int i6 = (int) ((j4 & 1073741823) >> 0);
                        if ((j4 & 1152921504606846976L) != 0) {
                            kVar = kVar.d();
                        } else if (b.compareAndSet(kVar, j4, (j4 & -1073741824) | j3)) {
                            kVar.f1767f.set(kVar.e & i6, null);
                            kVar = null;
                        } else {
                            continue;
                        }
                        if (kVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
