package c.e.b.a0;

import c.c.a.a.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class h implements t<T> {
    public final /* synthetic */ Constructor a;

    public h(g gVar, Constructor constructor) {
        this.a = constructor;
    }

    @Override // c.e.b.a0.t
    public T a() {
        try {
            return (T) this.a.newInstance(null);
        } catch (InstantiationException e) {
            StringBuilder f2 = a.f("Failed to invoke ");
            f2.append(this.a);
            f2.append(" with no args");
            throw new RuntimeException(f2.toString(), e);
        } catch (InvocationTargetException e2) {
            StringBuilder f3 = a.f("Failed to invoke ");
            f3.append(this.a);
            f3.append(" with no args");
            throw new RuntimeException(f3.toString(), e2.getTargetException());
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
