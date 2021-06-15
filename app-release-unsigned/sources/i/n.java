package i;

import i.s.b.a;
import i.s.c.h;
import java.io.Serializable;

public final class n<T> implements c<T>, Serializable {
    public a<? extends T> e;

    /* renamed from: f  reason: collision with root package name */
    public Object f3294f = k.a;

    public n(a<? extends T> aVar) {
        h.e(aVar, "initializer");
        this.e = aVar;
    }

    @Override // i.c
    public T getValue() {
        if (this.f3294f == k.a) {
            a<? extends T> aVar = this.e;
            h.c(aVar);
            this.f3294f = aVar.c();
            this.e = null;
        }
        return (T) this.f3294f;
    }

    public String toString() {
        return this.f3294f != k.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
