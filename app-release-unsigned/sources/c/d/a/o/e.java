package c.d.a.o;

import java.lang.reflect.InvocationTargetException;

@Deprecated
public final class e {
    public static c a(String str) {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        try {
            try {
                Object newInstance = Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof c) {
                    return (c) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (InstantiationException e) {
                b(cls, e);
                throw null;
            } catch (IllegalAccessException e2) {
                b(cls2, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                b(cls3, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                b(cls4, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void b(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }
}
