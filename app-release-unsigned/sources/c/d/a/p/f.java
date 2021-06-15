package c.d.a.p;

import c.d.a.m.s;
import java.util.ArrayList;
import java.util.List;

public class f {
    public final List<a<?>> a = new ArrayList();

    public static final class a<T> {
        public final Class<T> a;
        public final s<T> b;

        public a(Class<T> cls, s<T> sVar) {
            this.a = cls;
            this.b = sVar;
        }
    }

    /* JADX DEBUG: Type inference failed for r5v3. Raw type applied. Possible types: c.d.a.m.s<T>, c.d.a.m.s<Z> */
    public synchronized <Z> s<Z> a(Class<Z> cls) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a<?> aVar = this.a.get(i2);
            if (aVar.a.isAssignableFrom(cls)) {
                return (s<T>) aVar.b;
            }
        }
        return null;
    }
}
