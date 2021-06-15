package c.d.a.m.u;

import c.d.a.m.u.e;
import java.util.HashMap;
import java.util.Map;

public class f {
    public static final e.a<?> a = new a();
    public final Map<Class<?>, e.a<?>> b = new HashMap();

    public class a implements e.a<Object> {
        @Override // c.d.a.m.u.e.a
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // c.d.a.m.u.e.a
        public e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    public static final class b implements e<Object> {
        public final Object a;

        public b(Object obj) {
            this.a = obj;
        }

        @Override // c.d.a.m.u.e
        public Object a() {
            return this.a;
        }

        @Override // c.d.a.m.u.e
        public void b() {
        }
    }
}
