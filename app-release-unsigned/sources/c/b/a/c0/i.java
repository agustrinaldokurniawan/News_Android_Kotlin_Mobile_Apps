package c.b.a.c0;

import c.c.a.a.a;
import g.h.i.b;
import java.util.Objects;

public class i<T> {
    public T a;
    public T b;

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        Objects.requireNonNull((b) obj);
        if (!(this.a == null)) {
            return false;
        }
        return this.b == null;
    }

    public int hashCode() {
        T t = this.a;
        int i2 = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.b;
        if (t2 != null) {
            i2 = t2.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        StringBuilder f2 = a.f("Pair{");
        f2.append(String.valueOf(this.a));
        f2.append(" ");
        f2.append(String.valueOf(this.b));
        f2.append("}");
        return f2.toString();
    }
}
