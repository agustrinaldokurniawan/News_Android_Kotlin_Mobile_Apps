package j;

import c.c.a.a.a;
import i.s.c.h;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public final class i {
    public final Map<String, String> a;
    public final String b;

    public i(String str, Map<String, String> map) {
        String str2;
        h.f(str, "scheme");
        h.f(map, "authParams");
        this.b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                h.b(locale, "US");
                str2 = key.toLowerCase(locale);
                h.b(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        h.b(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.a = unmodifiableMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            return h.a(iVar.b, this.b) && h.a(iVar.a, this.a);
        }
    }

    public int hashCode() {
        return this.a.hashCode() + a.b(this.b, 899, 31);
    }

    public String toString() {
        return this.b + " authParams=" + this.a;
    }
}
