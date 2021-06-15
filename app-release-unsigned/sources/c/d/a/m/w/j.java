package c.d.a.m.w;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class j implements h {
    public final Map<String, List<i>> b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Map<String, String> f1003c;

    public static final class a {
        public static final String a;
        public static final Map<String, List<i>> b;

        /* renamed from: c  reason: collision with root package name */
        public Map<String, List<i>> f1004c = b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = property.charAt(i2);
                    if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                        charAt = '?';
                    }
                    sb.append(charAt);
                }
                property = sb.toString();
            }
            a = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            b = Collections.unmodifiableMap(hashMap);
        }
    }

    public static final class b implements i {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // c.d.a.m.w.i
        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("StringHeaderFactory{value='");
            f2.append(this.a);
            f2.append('\'');
            f2.append('}');
            return f2.toString();
        }
    }

    public j(Map<String, List<i>> map) {
        this.b = Collections.unmodifiableMap(map);
    }

    @Override // c.d.a.m.w.h
    public Map<String, String> a() {
        if (this.f1003c == null) {
            synchronized (this) {
                if (this.f1003c == null) {
                    this.f1003c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f1003c;
    }

    public final Map<String, String> b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.b.entrySet()) {
            List<i> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = value.size();
            for (int i2 = 0; i2 < size; i2++) {
                String a2 = value.get(i2).a();
                if (!TextUtils.isEmpty(a2)) {
                    sb.append(a2);
                    if (i2 != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.b.equals(((j) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("LazyHeaders{headers=");
        f2.append(this.b);
        f2.append('}');
        return f2.toString();
    }
}
