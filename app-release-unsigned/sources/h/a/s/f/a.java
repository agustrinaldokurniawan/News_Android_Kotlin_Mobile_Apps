package h.a.s.f;

import h.a.s.c.d;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T> implements d<T> {
    public final AtomicReference<C0111a<T>> e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<C0111a<T>> f3190f;

    /* renamed from: h.a.s.f.a$a  reason: collision with other inner class name */
    public static final class C0111a<E> extends AtomicReference<C0111a<E>> {
        public E e;

        public C0111a() {
        }

        public C0111a(E e2) {
            this.e = e2;
        }
    }

    public a() {
        AtomicReference<C0111a<T>> atomicReference = new AtomicReference<>();
        this.e = atomicReference;
        AtomicReference<C0111a<T>> atomicReference2 = new AtomicReference<>();
        this.f3190f = atomicReference2;
        C0111a<T> aVar = new C0111a<>();
        atomicReference2.lazySet(aVar);
        atomicReference.getAndSet(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    @Override // h.a.s.c.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.d()
            if (r0 == 0) goto L_0x000d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.s.f.a.clear():void");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, E] */
    @Override // h.a.s.c.d, h.a.s.c.e
    public T d() {
        C0111a<T> aVar = this.f3190f.get();
        C0111a<T> aVar2 = (C0111a) aVar.get();
        if (aVar2 == null) {
            if (aVar == this.e.get()) {
                return null;
            }
            do {
                aVar2 = (C0111a) aVar.get();
            } while (aVar2 == null);
        }
        E e2 = aVar2.e;
        aVar2.e = null;
        this.f3190f.lazySet(aVar2);
        return e2;
    }

    @Override // h.a.s.c.e
    public boolean i(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        C0111a<T> aVar = new C0111a<>(t);
        this.e.getAndSet(aVar).lazySet(aVar);
        return true;
    }

    @Override // h.a.s.c.e
    public boolean isEmpty() {
        return this.f3190f.get() == this.e.get();
    }
}
