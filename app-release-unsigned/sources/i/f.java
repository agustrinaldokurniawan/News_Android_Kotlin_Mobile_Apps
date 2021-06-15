package i;

import i.s.c.h;
import java.io.Serializable;

public final class f<A, B> implements Serializable {
    public final A e;

    /* renamed from: f  reason: collision with root package name */
    public final B f3289f;

    public f(A a, B b) {
        this.e = a;
        this.f3289f = b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return h.a(this.e, fVar.e) && h.a(this.f3289f, fVar.f3289f);
    }

    public int hashCode() {
        A a = this.e;
        int i2 = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f3289f;
        if (b != null) {
            i2 = b.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return '(' + ((Object) this.e) + ", " + ((Object) this.f3289f) + ')';
    }
}
