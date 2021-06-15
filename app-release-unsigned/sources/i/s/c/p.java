package i.s.c;

import i.v.b;
import java.util.Objects;

public class p {
    public static final q a;
    public static final b[] b = new b[0];

    static {
        q qVar = null;
        try {
            qVar = (q) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (qVar == null) {
            qVar = new q();
        }
        a = qVar;
    }

    public static b a(Class cls) {
        Objects.requireNonNull(a);
        return new d(cls);
    }
}
