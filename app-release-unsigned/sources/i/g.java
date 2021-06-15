package i;

import i.s.c.h;
import java.io.Serializable;

public final class g<T> implements Serializable {

    public static final class a implements Serializable {
        public final Throwable e;

        public a(Throwable th) {
            h.e(th, "exception");
            this.e = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && h.a(this.e, ((a) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("Failure(");
            f2.append(this.e);
            f2.append(')');
            return f2.toString();
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).e;
        }
        return null;
    }
}
