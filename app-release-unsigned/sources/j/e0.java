package j;

import i.o.e;
import i.o.i;
import i.s.c.h;
import j.n0.c;
import j.n0.h.f;
import j.x;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public final class e0 {
    public d a;
    public final y b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3395c;

    /* renamed from: d  reason: collision with root package name */
    public final x f3396d;
    public final h0 e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, Object> f3397f;

    public static class a {
        public y a;
        public String b;

        /* renamed from: c  reason: collision with root package name */
        public x.a f3398c;

        /* renamed from: d  reason: collision with root package name */
        public h0 f3399d;
        public Map<Class<?>, Object> e;

        public a() {
            this.e = new LinkedHashMap();
            this.b = "GET";
            this.f3398c = new x.a();
        }

        public a(e0 e0Var) {
            LinkedHashMap linkedHashMap;
            h.f(e0Var, "request");
            this.e = new LinkedHashMap();
            this.a = e0Var.b;
            this.b = e0Var.f3395c;
            this.f3399d = e0Var.e;
            if (e0Var.f3397f.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                Map<Class<?>, Object> map = e0Var.f3397f;
                h.e(map, "$this$toMutableMap");
                linkedHashMap = new LinkedHashMap(map);
            }
            this.e = linkedHashMap;
            this.f3398c = e0Var.f3396d.c();
        }

        public e0 a() {
            Map map;
            y yVar = this.a;
            if (yVar != null) {
                String str = this.b;
                x c2 = this.f3398c.c();
                h0 h0Var = this.f3399d;
                Map<Class<?>, Object> map2 = this.e;
                byte[] bArr = c.a;
                h.f(map2, "$this$toImmutableMap");
                if (map2.isEmpty()) {
                    map = i.e;
                } else {
                    map = Collections.unmodifiableMap(new LinkedHashMap(map2));
                    h.b(map, "Collections.unmodifiableMap(LinkedHashMap(this))");
                }
                return new e0(yVar, str, c2, h0Var, map);
            }
            throw new IllegalStateException("url == null".toString());
        }

        public a b(String str, String str2) {
            h.f(str, "name");
            h.f(str2, "value");
            x.a aVar = this.f3398c;
            Objects.requireNonNull(aVar);
            h.f(str, "name");
            h.f(str2, "value");
            x.b bVar = x.e;
            bVar.a(str);
            bVar.b(str2, str);
            aVar.d(str);
            aVar.b(str, str2);
            return this;
        }

        public a c(String str, h0 h0Var) {
            h.f(str, "method");
            boolean z = false;
            if (str.length() > 0) {
                if (h0Var == null) {
                    h.f(str, "method");
                    if (h.a(str, "POST") || h.a(str, "PUT") || h.a(str, "PATCH") || h.a(str, "PROPPATCH") || h.a(str, "REPORT")) {
                        z = true;
                    }
                    if (!(!z)) {
                        throw new IllegalArgumentException(c.c.a.a.a.c("method ", str, " must have a request body.").toString());
                    }
                } else if (!f.a(str)) {
                    throw new IllegalArgumentException(c.c.a.a.a.c("method ", str, " must not have a request body.").toString());
                }
                this.b = str;
                this.f3399d = h0Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public a d(String str) {
            h.f(str, "name");
            this.f3398c.d(str);
            return this;
        }

        public <T> a e(Class<? super T> cls, T t) {
            h.f(cls, "type");
            if (t == null) {
                this.e.remove(cls);
            } else {
                if (this.e.isEmpty()) {
                    this.e = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.e;
                Object cast = cls.cast(t);
                if (cast != null) {
                    map.put(cls, cast);
                } else {
                    h.j();
                    throw null;
                }
            }
            return this;
        }

        public a f(y yVar) {
            h.f(yVar, "url");
            this.a = yVar;
            return this;
        }
    }

    public e0(y yVar, String str, x xVar, h0 h0Var, Map<Class<?>, ? extends Object> map) {
        h.f(yVar, "url");
        h.f(str, "method");
        h.f(xVar, "headers");
        h.f(map, "tags");
        this.b = yVar;
        this.f3395c = str;
        this.f3396d = xVar;
        this.e = h0Var;
        this.f3397f = map;
    }

    public final d a() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar;
        }
        d b2 = d.a.b(this.f3396d);
        this.a = b2;
        return b2;
    }

    public final String b(String str) {
        h.f(str, "name");
        return this.f3396d.a(str);
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("Request{method=");
        f2.append(this.f3395c);
        f2.append(", url=");
        f2.append(this.b);
        if (this.f3396d.size() != 0) {
            f2.append(", headers=[");
            int i2 = 0;
            for (Object obj : this.f3396d) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    i.f fVar = (i.f) obj;
                    A a2 = fVar.e;
                    B b2 = fVar.f3289f;
                    if (i2 > 0) {
                        f2.append(", ");
                    }
                    f2.append((String) a2);
                    f2.append(':');
                    f2.append((String) b2);
                    i2 = i3;
                } else {
                    e.m();
                    throw null;
                }
            }
            f2.append(']');
        }
        if (!this.f3397f.isEmpty()) {
            f2.append(", tags=");
            f2.append(this.f3397f);
        }
        f2.append('}');
        String sb = f2.toString();
        h.b(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }
}
