package c.a.a.b.b.o.b.d;

import i.s.c.f;
import i.s.c.h;

public abstract class a<R> {

    /* renamed from: c.a.a.b.b.o.b.d.a$a  reason: collision with other inner class name */
    public static final class C0005a extends a {
    }

    public static final class b extends a {
        public final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            h.e(str, "errorMessage");
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && h.a(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("Error(errorMessage=");
            f2.append(this.a);
            f2.append(')');
            return f2.toString();
        }
    }

    public static final class c<T> extends a<T> {
        public final T a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && h.a(this.a, ((c) obj).a);
        }

        public int hashCode() {
            T t = this.a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("Success(data=");
            f2.append((Object) this.a);
            f2.append(')');
            return f2.toString();
        }
    }

    public a() {
    }

    public a(f fVar) {
    }
}
