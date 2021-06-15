package m;

import j.i0;
import j.j0;
import javax.annotation.Nullable;

public final class a0<T> {
    public final i0 a;
    @Nullable
    public final T b;

    public a0(i0 i0Var, @Nullable T t, @Nullable j0 j0Var) {
        this.a = i0Var;
        this.b = t;
    }

    public static <T> a0<T> b(@Nullable T t, i0 i0Var) {
        if (i0Var.c()) {
            return new a0<>(i0Var, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public boolean a() {
        return this.a.c();
    }

    public String toString() {
        return this.a.toString();
    }
}
