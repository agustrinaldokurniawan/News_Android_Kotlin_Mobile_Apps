package c.a.a.b.b;

import i.s.c.f;

public abstract class n<T> {
    public final T a;

    public static final class a<T> extends n<T> {
        public a(String str, T t) {
            super((Object) null, str, (f) null);
        }
    }

    public static final class b<T> extends n<T> {
        public b(T t) {
            super((Object) null, (String) null, 2);
        }
    }

    public static final class c<T> extends n<T> {
        public c(T t) {
            super(t, (String) null, 2);
        }
    }

    public n(Object obj, String str, int i2) {
        this.a = (T) ((i2 & 1) != 0 ? (T) null : obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public n(Object obj, String str, f fVar) {
        this.a = obj;
    }
}
