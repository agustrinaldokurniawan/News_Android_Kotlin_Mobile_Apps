package c.d.a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class e {
    public final Map<Class<?>, ?> a;

    public static final class a {
        public final Map<Class<?>, ?> a = new HashMap();
    }

    public e(a aVar) {
        this.a = Collections.unmodifiableMap(new HashMap(aVar.a));
    }
}
