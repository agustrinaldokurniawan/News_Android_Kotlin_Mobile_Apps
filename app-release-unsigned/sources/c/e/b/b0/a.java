package c.e.b.b0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

public class a<T> {
    public final Class<? super T> a;
    public final Type b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1506c;

    public a() {
        Type genericSuperclass = a.class.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a2 = c.e.b.a0.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.b = a2;
            this.a = (Class<? super T>) c.e.b.a0.a.e(a2);
            this.f1506c = a2.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && c.e.b.a0.a.c(this.b, ((a) obj).b);
    }

    public final int hashCode() {
        return this.f1506c;
    }

    public final String toString() {
        return c.e.b.a0.a.i(this.b);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type a2 = c.e.b.a0.a.a(type);
        this.b = a2;
        this.a = (Class<? super T>) c.e.b.a0.a.e(a2);
        this.f1506c = a2.hashCode();
    }
}
