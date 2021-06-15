package m;

import j.b0;
import j.h0;
import j.x;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import m.c;

public abstract class w<T> {

    public static final class a<T> extends w<T> {
        public final Method a;
        public final int b;

        /* renamed from: c  reason: collision with root package name */
        public final h<T, h0> f3857c;

        public a(Method method, int i2, h<T, h0> hVar) {
            this.a = method;
            this.b = i2;
            this.f3857c = hVar;
        }

        @Override // m.w
        public void a(y yVar, @Nullable T t) {
            if (t != null) {
                try {
                    yVar.f3878m = this.f3857c.a(t);
                } catch (IOException e) {
                    Method method = this.a;
                    int i2 = this.b;
                    throw g0.m(method, e, i2, "Unable to convert " + ((Object) t) + " to RequestBody", new Object[0]);
                }
            } else {
                throw g0.l(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    public static final class b<T> extends w<T> {
        public final String a;
        public final h<T, String> b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3858c;

        public b(String str, h<T, String> hVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = hVar;
            this.f3858c = z;
        }

        @Override // m.w
        public void a(y yVar, @Nullable T t) {
            String a2;
            if (t != null && (a2 = this.b.a(t)) != null) {
                yVar.a(this.a, a2, this.f3858c);
            }
        }
    }

    public static final class c<T> extends w<Map<String, T>> {
        public final Method a;
        public final int b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3859c;

        public c(Method method, int i2, h<T, String> hVar, boolean z) {
            this.a = method;
            this.b = i2;
            this.f3859c = z;
        }

        @Override // m.w
        public void a(y yVar, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                yVar.a(str, obj2, this.f3859c);
                            } else {
                                Method method = this.a;
                                int i2 = this.b;
                                throw g0.l(method, i2, "Field map value '" + value + "' converted to null by " + c.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw g0.l(this.a, this.b, c.c.a.a.a.c("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw g0.l(this.a, this.b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw g0.l(this.a, this.b, "Field map was null.", new Object[0]);
        }
    }

    public static final class d<T> extends w<T> {
        public final String a;
        public final h<T, String> b;

        public d(String str, h<T, String> hVar) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = hVar;
        }

        @Override // m.w
        public void a(y yVar, @Nullable T t) {
            String a2;
            if (t != null && (a2 = this.b.a(t)) != null) {
                yVar.b(this.a, a2);
            }
        }
    }

    public static final class e<T> extends w<Map<String, T>> {
        public final Method a;
        public final int b;

        public e(Method method, int i2, h<T, String> hVar) {
            this.a = method;
            this.b = i2;
        }

        @Override // m.w
        public void a(y yVar, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            yVar.b(str, value.toString());
                        } else {
                            throw g0.l(this.a, this.b, c.c.a.a.a.c("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw g0.l(this.a, this.b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw g0.l(this.a, this.b, "Header map was null.", new Object[0]);
        }
    }

    public static final class f extends w<x> {
        public final Method a;
        public final int b;

        public f(Method method, int i2) {
            this.a = method;
            this.b = i2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [m.y, java.lang.Object] */
        @Override // m.w
        public void a(y yVar, @Nullable x xVar) {
            x xVar2 = xVar;
            if (xVar2 != null) {
                x.a aVar = yVar.f3873h;
                Objects.requireNonNull(aVar);
                i.s.c.h.f(xVar2, "headers");
                int size = xVar2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    aVar.b(xVar2.b(i2), xVar2.d(i2));
                }
                return;
            }
            throw g0.l(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    public static final class g<T> extends w<T> {
        public final Method a;
        public final int b;

        /* renamed from: c  reason: collision with root package name */
        public final x f3860c;

        /* renamed from: d  reason: collision with root package name */
        public final h<T, h0> f3861d;

        public g(Method method, int i2, x xVar, h<T, h0> hVar) {
            this.a = method;
            this.b = i2;
            this.f3860c = xVar;
            this.f3861d = hVar;
        }

        @Override // m.w
        public void a(y yVar, @Nullable T t) {
            if (t != null) {
                try {
                    yVar.c(this.f3860c, this.f3861d.a(t));
                } catch (IOException e) {
                    Method method = this.a;
                    int i2 = this.b;
                    throw g0.l(method, i2, "Unable to convert " + ((Object) t) + " to RequestBody", e);
                }
            }
        }
    }

    public static final class h<T> extends w<Map<String, T>> {
        public final Method a;
        public final int b;

        /* renamed from: c  reason: collision with root package name */
        public final h<T, h0> f3862c;

        /* renamed from: d  reason: collision with root package name */
        public final String f3863d;

        public h(Method method, int i2, h<T, h0> hVar, String str) {
            this.a = method;
            this.b = i2;
            this.f3862c = hVar;
            this.f3863d = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: m.h<T, j.h0> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // m.w
        public void a(y yVar, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            yVar.c(x.e.c("Content-Disposition", c.c.a.a.a.c("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f3863d), (h0) this.f3862c.a(value));
                        } else {
                            throw g0.l(this.a, this.b, c.c.a.a.a.c("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw g0.l(this.a, this.b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw g0.l(this.a, this.b, "Part map was null.", new Object[0]);
        }
    }

    public static final class i<T> extends w<T> {
        public final Method a;
        public final int b;

        /* renamed from: c  reason: collision with root package name */
        public final String f3864c;

        /* renamed from: d  reason: collision with root package name */
        public final h<T, String> f3865d;
        public final boolean e;

        public i(Method method, int i2, String str, h<T, String> hVar, boolean z) {
            this.a = method;
            this.b = i2;
            Objects.requireNonNull(str, "name == null");
            this.f3864c = str;
            this.f3865d = hVar;
            this.e = z;
        }

        @Override // m.w
        public void a(y yVar, @Nullable T t) {
            String str;
            int i2;
            int i3;
            if (t != null) {
                String str2 = this.f3864c;
                String a2 = this.f3865d.a(t);
                boolean z = this.e;
                if (yVar.e != null) {
                    int length = a2.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            str = a2;
                            break;
                        }
                        int codePointAt = a2.codePointAt(i4);
                        i2 = 47;
                        i3 = -1;
                        if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                            k.e eVar = new k.e();
                            eVar.x0(a2, 0, i4);
                            k.e eVar2 = null;
                        } else {
                            i4 += Character.charCount(codePointAt);
                        }
                    }
                    k.e eVar3 = new k.e();
                    eVar3.x0(a2, 0, i4);
                    k.e eVar22 = null;
                    while (i4 < length) {
                        int codePointAt2 = a2.codePointAt(i4);
                        if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i3 || (!z && (codePointAt2 == i2 || codePointAt2 == 37))) {
                                if (eVar22 == null) {
                                    eVar22 = new k.e();
                                }
                                eVar22.y0(codePointAt2);
                                while (!eVar22.R()) {
                                    int readByte = eVar22.readByte() & 255;
                                    eVar3.r0(37);
                                    char[] cArr = y.a;
                                    eVar3.r0(cArr[(readByte >> 4) & 15]);
                                    eVar3.r0(cArr[readByte & 15]);
                                }
                            } else {
                                eVar3.y0(codePointAt2);
                            }
                        }
                        i4 += Character.charCount(codePointAt2);
                        i2 = 47;
                        i3 = -1;
                    }
                    str = eVar3.j0();
                    String replace = yVar.e.replace("{" + str2 + "}", str);
                    if (!y.b.matcher(replace).matches()) {
                        yVar.e = replace;
                        return;
                    }
                    throw new IllegalArgumentException(c.c.a.a.a.q("@Path parameters shouldn't perform path traversal ('.' or '..'): ", a2));
                }
                throw new AssertionError();
            }
            throw g0.l(this.a, this.b, c.c.a.a.a.e(c.c.a.a.a.f("Path parameter \""), this.f3864c, "\" value must not be null."), new Object[0]);
        }
    }

    public static final class j<T> extends w<T> {
        public final String a;
        public final h<T, String> b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3866c;

        public j(String str, h<T, String> hVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = hVar;
            this.f3866c = z;
        }

        @Override // m.w
        public void a(y yVar, @Nullable T t) {
            String a2;
            if (t != null && (a2 = this.b.a(t)) != null) {
                yVar.d(this.a, a2, this.f3866c);
            }
        }
    }

    public static final class k<T> extends w<Map<String, T>> {
        public final Method a;
        public final int b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3867c;

        public k(Method method, int i2, h<T, String> hVar, boolean z) {
            this.a = method;
            this.b = i2;
            this.f3867c = z;
        }

        @Override // m.w
        public void a(y yVar, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                yVar.d(str, obj2, this.f3867c);
                            } else {
                                Method method = this.a;
                                int i2 = this.b;
                                throw g0.l(method, i2, "Query map value '" + value + "' converted to null by " + c.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw g0.l(this.a, this.b, c.c.a.a.a.c("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw g0.l(this.a, this.b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw g0.l(this.a, this.b, "Query map was null", new Object[0]);
        }
    }

    public static final class l<T> extends w<T> {
        public final boolean a;

        public l(h<T, String> hVar, boolean z) {
            this.a = z;
        }

        @Override // m.w
        public void a(y yVar, @Nullable T t) {
            if (t != null) {
                yVar.d(t.toString(), null, this.a);
            }
        }
    }

    public static final class m extends w<b0.b> {
        public static final m a = new m();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [m.y, java.lang.Object] */
        @Override // m.w
        public void a(y yVar, @Nullable b0.b bVar) {
            b0.b bVar2 = bVar;
            if (bVar2 != null) {
                b0.a aVar = yVar.f3876k;
                Objects.requireNonNull(aVar);
                i.s.c.h.f(bVar2, "part");
                aVar.f3368c.add(bVar2);
            }
        }
    }

    public static final class n extends w<Object> {
        public final Method a;
        public final int b;

        public n(Method method, int i2) {
            this.a = method;
            this.b = i2;
        }

        @Override // m.w
        public void a(y yVar, @Nullable Object obj) {
            if (obj != null) {
                Objects.requireNonNull(yVar);
                yVar.e = obj.toString();
                return;
            }
            throw g0.l(this.a, this.b, "@Url parameter is null.", new Object[0]);
        }
    }

    public static final class o<T> extends w<T> {
        public final Class<T> a;

        public o(Class<T> cls) {
            this.a = cls;
        }

        @Override // m.w
        public void a(y yVar, @Nullable T t) {
            yVar.f3872g.e(this.a, t);
        }
    }

    public abstract void a(y yVar, @Nullable T t);
}
