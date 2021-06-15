package m;

import c.c.a.a.a;
import java.lang.annotation.Annotation;

public final class f0 implements e0 {
    public static final e0 a = new f0();

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return e0.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof e0;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder f2 = a.f("@");
        f2.append(e0.class.getName());
        f2.append("()");
        return f2.toString();
    }
}
