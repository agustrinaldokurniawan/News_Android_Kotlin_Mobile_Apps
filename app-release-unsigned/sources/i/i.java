package i;

import i.s.b.a;
import i.s.c.h;
import java.io.Serializable;

public final class i<T> implements c<T>, Serializable {
    public a<? extends T> e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f3292f = k.a;

    /* renamed from: g  reason: collision with root package name */
    public final Object f3293g = this;

    public i(a aVar, Object obj, int i2) {
        int i3 = i2 & 2;
        h.e(aVar, "initializer");
        this.e = aVar;
    }

    @Override // i.c
    public T getValue() {
        T t;
        T t2 = (T) this.f3292f;
        k kVar = k.a;
        if (t2 != kVar) {
            return t2;
        }
        synchronized (this.f3293g) {
            t = (T) this.f3292f;
            if (t == kVar) {
                a<? extends T> aVar = this.e;
                h.c(aVar);
                t = (T) aVar.c();
                this.f3292f = t;
                this.e = null;
            }
        }
        return t;
    }

    public String toString() {
        return this.f3292f != k.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
