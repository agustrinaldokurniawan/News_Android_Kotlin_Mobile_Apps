package l.a.d;

import i.s.c.c;
import i.s.c.h;
import i.v.b;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class a {
    public static final Map<b<?>, String> a = new ConcurrentHashMap();

    public static final String a(b<?> bVar) {
        h.e(bVar, "<this>");
        Map<b<?>, String> map = a;
        String str = map.get(bVar);
        if (str != null) {
            return str;
        }
        h.e(bVar, "<this>");
        h.e(bVar, "$this$java");
        Class<?> a2 = ((c) bVar).a();
        Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.Class<T>");
        String name = a2.getName();
        h.d(name, "name");
        map.put(bVar, name);
        return name;
    }
}
