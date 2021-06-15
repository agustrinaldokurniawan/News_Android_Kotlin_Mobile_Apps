package l.a.c.f;

import c.c.a.a.a;
import i.s.c.h;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class d {
    public final Map<String, Object> a;

    public d() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        h.e(concurrentHashMap, "data");
        this.a = concurrentHashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && h.a(this.a, ((d) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder f2 = a.f("Properties(data=");
        f2.append(this.a);
        f2.append(')');
        return f2.toString();
    }

    public d(Map map, int i2) {
        ConcurrentHashMap concurrentHashMap = (i2 & 1) != 0 ? new ConcurrentHashMap() : null;
        h.e(concurrentHashMap, "data");
        this.a = concurrentHashMap;
    }
}
