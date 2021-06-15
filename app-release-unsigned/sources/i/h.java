package i;

import i.s.b.a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class h<T> implements c<T>, Serializable {
    public static final AtomicReferenceFieldUpdater<h<?>, Object> e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "g");

    /* renamed from: f  reason: collision with root package name */
    public volatile a<? extends T> f3290f;

    /* renamed from: g  reason: collision with root package name */
    public volatile Object f3291g = k.a;

    public h(a<? extends T> aVar) {
        i.s.c.h.e(aVar, "initializer");
        this.f3290f = aVar;
    }

    @Override // i.c
    public T getValue() {
        T t = (T) this.f3291g;
        k kVar = k.a;
        if (t != kVar) {
            return t;
        }
        a<? extends T> aVar = this.f3290f;
        if (aVar != null) {
            T t2 = (T) aVar.c();
            if (e.compareAndSet(this, kVar, t2)) {
                this.f3290f = null;
                return t2;
            }
        }
        return (T) this.f3291g;
    }

    public String toString() {
        return this.f3291g != k.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
