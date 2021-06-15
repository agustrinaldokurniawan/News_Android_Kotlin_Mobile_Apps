package c.e.b.a0;

import c.c.a.a.a;
import java.lang.reflect.Modifier;

public abstract class y {
    public static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder f2 = a.f("Interface can't be instantiated! Interface name: ");
            f2.append(cls.getName());
            throw new UnsupportedOperationException(f2.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder f3 = a.f("Abstract class can't be instantiated! Class name: ");
            f3.append(cls.getName());
            throw new UnsupportedOperationException(f3.toString());
        }
    }

    public abstract <T> T b(Class<T> cls);
}
