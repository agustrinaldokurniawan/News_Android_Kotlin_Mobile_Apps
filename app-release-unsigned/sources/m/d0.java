package m;

import c.c.a.a.a;
import j.a0;
import j.b0;
import j.e;
import j.h0;
import j.i0;
import j.j0;
import j.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import javax.annotation.Nullable;
import m.c;
import m.g0;
import m.j0.b;
import m.j0.d;
import m.j0.e;
import m.j0.f;
import m.j0.g;
import m.j0.h;
import m.j0.i;
import m.j0.j;
import m.j0.k;
import m.j0.l;
import m.j0.m;
import m.j0.n;
import m.j0.o;
import m.j0.p;
import m.j0.q;
import m.j0.r;
import m.j0.s;
import m.j0.t;
import m.j0.u;
import m.j0.v;
import m.j0.y;
import m.k;
import m.w;
import m.z;

public abstract class d0<T> {
    public static <T> d0<T> b(c0 c0Var, Method method) {
        Type type;
        boolean z;
        String str;
        int i2;
        int i3;
        w<?> wVar;
        Type type2;
        String str2;
        int i4;
        Type type3;
        w<?> wVar2;
        w<?> wVar3;
        w<?> wVar4;
        w<?> cVar;
        String str3;
        String str4;
        String str5;
        String str6;
        String value;
        String str7;
        z.a aVar = new z.a(c0Var, method);
        Annotation[] annotationArr = aVar.e;
        int length = annotationArr.length;
        int i5 = 0;
        int i6 = 0;
        loop0:
        while (true) {
            String str8 = "HEAD";
            int i7 = 1;
            if (i6 < length) {
                Annotation annotation = annotationArr[i6];
                if (annotation instanceof b) {
                    value = ((b) annotation).value();
                    str7 = "DELETE";
                } else if (annotation instanceof f) {
                    value = ((f) annotation).value();
                    str7 = "GET";
                } else if (annotation instanceof g) {
                    str3 = ((g) annotation).value();
                    aVar.b(str8, str3, false);
                    i6++;
                } else {
                    if (annotation instanceof n) {
                        str5 = ((n) annotation).value();
                        str4 = "PATCH";
                    } else if (annotation instanceof o) {
                        str5 = ((o) annotation).value();
                        str4 = "POST";
                    } else if (annotation instanceof p) {
                        str5 = ((p) annotation).value();
                        str4 = "PUT";
                    } else if (annotation instanceof m) {
                        value = ((m) annotation).value();
                        str7 = "OPTIONS";
                    } else {
                        if (annotation instanceof h) {
                            h hVar = (h) annotation;
                            aVar.b(hVar.method(), hVar.path(), hVar.hasBody());
                        } else if (annotation instanceof k) {
                            String[] value2 = ((k) annotation).value();
                            if (value2.length != 0) {
                                x.a aVar2 = new x.a();
                                int length2 = value2.length;
                                for (int i8 = 0; i8 < length2; i8++) {
                                    str6 = value2[i8];
                                    int indexOf = str6.indexOf(58);
                                    if (indexOf != -1 && indexOf != 0 && indexOf != str6.length() - 1) {
                                        String substring = str6.substring(0, indexOf);
                                        String trim = str6.substring(indexOf + 1).trim();
                                        if ("Content-Type".equalsIgnoreCase(substring)) {
                                            try {
                                                aVar.v = a0.a(trim);
                                            } catch (IllegalArgumentException e) {
                                                throw g0.k(aVar.f3889d, e, "Malformed content type: %s", trim);
                                            }
                                        } else {
                                            aVar2.a(substring, trim);
                                        }
                                    }
                                }
                                aVar.u = aVar2.c();
                            } else {
                                throw g0.j(aVar.f3889d, "@Headers annotation is empty.", new Object[0]);
                            }
                        } else if (annotation instanceof l) {
                            if (!aVar.r) {
                                aVar.s = true;
                            } else {
                                throw g0.j(aVar.f3889d, "Only one encoding annotation is allowed.", new Object[0]);
                            }
                        } else if (!(annotation instanceof e)) {
                            continue;
                        } else if (!aVar.s) {
                            aVar.r = true;
                        } else {
                            throw g0.j(aVar.f3889d, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        i6++;
                    }
                    aVar.b(str4, str5, true);
                    i6++;
                }
                str3 = value;
                str8 = str7;
                aVar.b(str8, str3, false);
                i6++;
            } else if (aVar.p != null) {
                if (!aVar.q) {
                    if (aVar.s) {
                        throw g0.j(aVar.f3889d, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (aVar.r) {
                        throw g0.j(aVar.f3889d, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length3 = aVar.f3890f.length;
                aVar.x = new w[length3];
                int i9 = length3 - 1;
                int i10 = 0;
                while (i5 < length3) {
                    w<?>[] wVarArr = aVar.x;
                    Type type4 = aVar.f3891g[i5];
                    Annotation[] annotationArr2 = aVar.f3890f[i5];
                    if (i5 != i9) {
                        i7 = i10;
                    }
                    if (annotationArr2 != null) {
                        int length4 = annotationArr2.length;
                        wVar = null;
                        while (i10 < length4) {
                            Annotation annotation2 = annotationArr2[i10];
                            if (annotation2 instanceof y) {
                                aVar.c(i5, type4);
                                if (aVar.o) {
                                    throw g0.l(aVar.f3889d, i5, "Multiple @Url method annotations found.", new Object[0]);
                                } else if (aVar.f3895k) {
                                    throw g0.l(aVar.f3889d, i5, "@Path parameters may not be used with @Url.", new Object[0]);
                                } else if (aVar.f3896l) {
                                    throw g0.l(aVar.f3889d, i5, "A @Url parameter must not come after a @Query.", new Object[0]);
                                } else if (aVar.f3897m) {
                                    throw g0.l(aVar.f3889d, i5, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                } else if (aVar.n) {
                                    throw g0.l(aVar.f3889d, i5, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                } else if (aVar.t == null) {
                                    aVar.o = true;
                                    if (type4 == j.y.class || type4 == String.class || type4 == URI.class || ((type4 instanceof Class) && "android.net.Uri".equals(((Class) type4).getName()))) {
                                        wVar2 = new w.n(aVar.f3889d, i5);
                                        str2 = str8;
                                        i4 = length4;
                                        type3 = type4;
                                    } else {
                                        throw g0.l(aVar.f3889d, i5, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                    }
                                } else {
                                    throw g0.l(aVar.f3889d, i5, "@Url cannot be used with @%s URL", aVar.p);
                                }
                            } else {
                                i4 = length4;
                                if (annotation2 instanceof s) {
                                    aVar.c(i5, type4);
                                    if (aVar.f3896l) {
                                        throw g0.l(aVar.f3889d, i5, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    } else if (aVar.f3897m) {
                                        throw g0.l(aVar.f3889d, i5, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    } else if (aVar.n) {
                                        throw g0.l(aVar.f3889d, i5, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    } else if (aVar.o) {
                                        throw g0.l(aVar.f3889d, i5, "@Path parameters may not be used with @Url.", new Object[0]);
                                    } else if (aVar.t != null) {
                                        aVar.f3895k = true;
                                        s sVar = (s) annotation2;
                                        String value3 = sVar.value();
                                        if (!z.a.b.matcher(value3).matches()) {
                                            throw g0.l(aVar.f3889d, i5, "@Path parameter name must match %s. Found: %s", z.a.a.pattern(), value3);
                                        } else if (aVar.w.contains(value3)) {
                                            aVar.f3888c.e(type4, annotationArr2);
                                            type3 = type4;
                                            annotationArr2 = annotationArr2;
                                            wVar2 = new w.i(aVar.f3889d, i5, value3, c.d.a, sVar.encoded());
                                        } else {
                                            throw g0.l(aVar.f3889d, i5, "URL \"%s\" does not contain \"{%s}\".", aVar.t, value3);
                                        }
                                    } else {
                                        throw g0.l(aVar.f3889d, i5, "@Path can only be used with relative url on @%s", aVar.p);
                                    }
                                } else {
                                    type3 = type4;
                                    if (annotation2 instanceof t) {
                                        aVar.c(i5, type3);
                                        t tVar = (t) annotation2;
                                        String value4 = tVar.value();
                                        boolean encoded = tVar.encoded();
                                        Class<?> f2 = g0.f(type3);
                                        aVar.f3896l = true;
                                        if (Iterable.class.isAssignableFrom(f2)) {
                                            if (type3 instanceof ParameterizedType) {
                                                aVar.f3888c.e(g0.e(0, (ParameterizedType) type3), annotationArr2);
                                                wVar2 = new u(new w.j(value4, c.d.a, encoded));
                                            } else {
                                                throw g0.l(aVar.f3889d, i5, a.k(f2, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                        } else if (f2.isArray()) {
                                            aVar.f3888c.e(z.a.a(f2.getComponentType()), annotationArr2);
                                            wVar2 = new v(new w.j(value4, c.d.a, encoded));
                                        } else {
                                            aVar.f3888c.e(type3, annotationArr2);
                                            wVar2 = new w.j(value4, c.d.a, encoded);
                                        }
                                    } else if (annotation2 instanceof v) {
                                        aVar.c(i5, type3);
                                        boolean encoded2 = ((v) annotation2).encoded();
                                        Class<?> f3 = g0.f(type3);
                                        aVar.f3897m = true;
                                        if (Iterable.class.isAssignableFrom(f3)) {
                                            if (type3 instanceof ParameterizedType) {
                                                aVar.f3888c.e(g0.e(0, (ParameterizedType) type3), annotationArr2);
                                                wVar2 = new u(new w.l(c.d.a, encoded2));
                                            } else {
                                                throw g0.l(aVar.f3889d, i5, a.k(f3, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                        } else if (f3.isArray()) {
                                            aVar.f3888c.e(z.a.a(f3.getComponentType()), annotationArr2);
                                            wVar2 = new v(new w.l(c.d.a, encoded2));
                                        } else {
                                            aVar.f3888c.e(type3, annotationArr2);
                                            str2 = str8;
                                            wVar2 = new w.l(c.d.a, encoded2);
                                        }
                                    } else if (annotation2 instanceof u) {
                                        aVar.c(i5, type3);
                                        Class<?> f4 = g0.f(type3);
                                        aVar.n = true;
                                        if (Map.class.isAssignableFrom(f4)) {
                                            Type g2 = g0.g(type3, f4, Map.class);
                                            if (g2 instanceof ParameterizedType) {
                                                ParameterizedType parameterizedType = (ParameterizedType) g2;
                                                Type e2 = g0.e(0, parameterizedType);
                                                if (String.class == e2) {
                                                    aVar.f3888c.e(g0.e(1, parameterizedType), annotationArr2);
                                                    wVar2 = new w.k<>(aVar.f3889d, i5, c.d.a, ((u) annotation2).encoded());
                                                } else {
                                                    throw g0.l(aVar.f3889d, i5, a.d("@QueryMap keys must be of type String: ", e2), new Object[0]);
                                                }
                                            } else {
                                                throw g0.l(aVar.f3889d, i5, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                        } else {
                                            throw g0.l(aVar.f3889d, i5, "@QueryMap parameter type must be Map.", new Object[0]);
                                        }
                                    } else if (annotation2 instanceof i) {
                                        aVar.c(i5, type3);
                                        String value5 = ((i) annotation2).value();
                                        Class<?> f5 = g0.f(type3);
                                        if (Iterable.class.isAssignableFrom(f5)) {
                                            if (type3 instanceof ParameterizedType) {
                                                aVar.f3888c.e(g0.e(0, (ParameterizedType) type3), annotationArr2);
                                                wVar2 = new u(new w.d(value5, c.d.a));
                                            } else {
                                                throw g0.l(aVar.f3889d, i5, a.k(f5, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                        } else if (f5.isArray()) {
                                            aVar.f3888c.e(z.a.a(f5.getComponentType()), annotationArr2);
                                            wVar2 = new v(new w.d(value5, c.d.a));
                                        } else {
                                            aVar.f3888c.e(type3, annotationArr2);
                                            str2 = str8;
                                            wVar2 = new w.d(value5, c.d.a);
                                        }
                                    } else {
                                        if (annotation2 instanceof j) {
                                            if (type3 == x.class) {
                                                cVar = new w.f(aVar.f3889d, i5);
                                            } else {
                                                aVar.c(i5, type3);
                                                Class<?> f6 = g0.f(type3);
                                                if (Map.class.isAssignableFrom(f6)) {
                                                    Type g3 = g0.g(type3, f6, Map.class);
                                                    if (g3 instanceof ParameterizedType) {
                                                        ParameterizedType parameterizedType2 = (ParameterizedType) g3;
                                                        Type e3 = g0.e(0, parameterizedType2);
                                                        if (String.class == e3) {
                                                            aVar.f3888c.e(g0.e(1, parameterizedType2), annotationArr2);
                                                            wVar2 = new w.e<>(aVar.f3889d, i5, c.d.a);
                                                        } else {
                                                            throw g0.l(aVar.f3889d, i5, a.d("@HeaderMap keys must be of type String: ", e3), new Object[0]);
                                                        }
                                                    } else {
                                                        throw g0.l(aVar.f3889d, i5, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                } else {
                                                    throw g0.l(aVar.f3889d, i5, "@HeaderMap parameter type must be Map.", new Object[0]);
                                                }
                                            }
                                        } else if (annotation2 instanceof m.j0.c) {
                                            aVar.c(i5, type3);
                                            if (aVar.r) {
                                                m.j0.c cVar2 = (m.j0.c) annotation2;
                                                String value6 = cVar2.value();
                                                boolean encoded3 = cVar2.encoded();
                                                aVar.f3892h = true;
                                                Class<?> f7 = g0.f(type3);
                                                if (Iterable.class.isAssignableFrom(f7)) {
                                                    if (type3 instanceof ParameterizedType) {
                                                        aVar.f3888c.e(g0.e(0, (ParameterizedType) type3), annotationArr2);
                                                        cVar = new u(new w.b(value6, c.d.a, encoded3));
                                                    } else {
                                                        throw g0.l(aVar.f3889d, i5, a.k(f7, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                    }
                                                } else if (f7.isArray()) {
                                                    aVar.f3888c.e(z.a.a(f7.getComponentType()), annotationArr2);
                                                    cVar = new v(new w.b(value6, c.d.a, encoded3));
                                                } else {
                                                    aVar.f3888c.e(type3, annotationArr2);
                                                    wVar2 = new w.b(value6, c.d.a, encoded3);
                                                }
                                            } else {
                                                throw g0.l(aVar.f3889d, i5, "@Field parameters can only be used with form encoding.", new Object[0]);
                                            }
                                        } else if (annotation2 instanceof d) {
                                            aVar.c(i5, type3);
                                            if (aVar.r) {
                                                Class<?> f8 = g0.f(type3);
                                                if (Map.class.isAssignableFrom(f8)) {
                                                    Type g4 = g0.g(type3, f8, Map.class);
                                                    if (g4 instanceof ParameterizedType) {
                                                        ParameterizedType parameterizedType3 = (ParameterizedType) g4;
                                                        Type e4 = g0.e(0, parameterizedType3);
                                                        if (String.class == e4) {
                                                            aVar.f3888c.e(g0.e(1, parameterizedType3), annotationArr2);
                                                            c.d dVar = c.d.a;
                                                            aVar.f3892h = true;
                                                            cVar = new w.c<>(aVar.f3889d, i5, dVar, ((d) annotation2).encoded());
                                                        } else {
                                                            throw g0.l(aVar.f3889d, i5, a.d("@FieldMap keys must be of type String: ", e4), new Object[0]);
                                                        }
                                                    } else {
                                                        throw g0.l(aVar.f3889d, i5, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                } else {
                                                    throw g0.l(aVar.f3889d, i5, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                            } else {
                                                throw g0.l(aVar.f3889d, i5, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                            }
                                        } else if (annotation2 instanceof q) {
                                            aVar.c(i5, type3);
                                            if (aVar.s) {
                                                q qVar = (q) annotation2;
                                                aVar.f3893i = true;
                                                String value7 = qVar.value();
                                                Class<?> f9 = g0.f(type3);
                                                if (!value7.isEmpty()) {
                                                    str2 = str8;
                                                    x c2 = x.e.c("Content-Disposition", a.c("form-data; name=\"", value7, "\""), "Content-Transfer-Encoding", qVar.encoding());
                                                    if (Iterable.class.isAssignableFrom(f9)) {
                                                        if (type3 instanceof ParameterizedType) {
                                                            Type e5 = g0.e(0, (ParameterizedType) type3);
                                                            if (!b0.b.class.isAssignableFrom(g0.f(e5))) {
                                                                wVar4 = new u(new w.g(aVar.f3889d, i5, c2, aVar.f3888c.c(e5, annotationArr2, aVar.e)));
                                                            } else {
                                                                throw g0.l(aVar.f3889d, i5, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                        } else {
                                                            throw g0.l(aVar.f3889d, i5, a.k(f9, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                        }
                                                    } else if (f9.isArray()) {
                                                        Class<?> a = z.a.a(f9.getComponentType());
                                                        if (!b0.b.class.isAssignableFrom(a)) {
                                                            wVar4 = new v(new w.g(aVar.f3889d, i5, c2, aVar.f3888c.c(a, annotationArr2, aVar.e)));
                                                        } else {
                                                            throw g0.l(aVar.f3889d, i5, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                    } else if (!b0.b.class.isAssignableFrom(f9)) {
                                                        wVar2 = new w.g<>(aVar.f3889d, i5, c2, aVar.f3888c.c(type3, annotationArr2, aVar.e));
                                                    } else {
                                                        throw g0.l(aVar.f3889d, i5, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                    }
                                                    wVar2 = wVar4;
                                                } else if (Iterable.class.isAssignableFrom(f9)) {
                                                    if (!(type3 instanceof ParameterizedType)) {
                                                        throw g0.l(aVar.f3889d, i5, a.k(f9, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                    } else if (b0.b.class.isAssignableFrom(g0.f(g0.e(0, (ParameterizedType) type3)))) {
                                                        wVar2 = new u(w.m.a);
                                                    } else {
                                                        throw g0.l(aVar.f3889d, i5, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                } else if (f9.isArray()) {
                                                    if (b0.b.class.isAssignableFrom(f9.getComponentType())) {
                                                        wVar2 = new v(w.m.a);
                                                    } else {
                                                        throw g0.l(aVar.f3889d, i5, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                } else if (b0.b.class.isAssignableFrom(f9)) {
                                                    wVar2 = w.m.a;
                                                } else {
                                                    throw g0.l(aVar.f3889d, i5, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                            } else {
                                                throw g0.l(aVar.f3889d, i5, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                            }
                                        } else {
                                            str2 = str8;
                                            if (annotation2 instanceof r) {
                                                aVar.c(i5, type3);
                                                if (aVar.s) {
                                                    aVar.f3893i = true;
                                                    Class<?> f10 = g0.f(type3);
                                                    if (Map.class.isAssignableFrom(f10)) {
                                                        Type g5 = g0.g(type3, f10, Map.class);
                                                        if (g5 instanceof ParameterizedType) {
                                                            ParameterizedType parameterizedType4 = (ParameterizedType) g5;
                                                            Type e6 = g0.e(0, parameterizedType4);
                                                            if (String.class == e6) {
                                                                Type e7 = g0.e(1, parameterizedType4);
                                                                if (!b0.b.class.isAssignableFrom(g0.f(e7))) {
                                                                    wVar3 = new w.h<>(aVar.f3889d, i5, aVar.f3888c.c(e7, annotationArr2, aVar.e), ((r) annotation2).encoding());
                                                                } else {
                                                                    throw g0.l(aVar.f3889d, i5, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                                }
                                                            } else {
                                                                throw g0.l(aVar.f3889d, i5, a.d("@PartMap keys must be of type String: ", e6), new Object[0]);
                                                            }
                                                        } else {
                                                            throw g0.l(aVar.f3889d, i5, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                    } else {
                                                        throw g0.l(aVar.f3889d, i5, "@PartMap parameter type must be Map.", new Object[0]);
                                                    }
                                                } else {
                                                    throw g0.l(aVar.f3889d, i5, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                            } else if (annotation2 instanceof m.j0.a) {
                                                aVar.c(i5, type3);
                                                if (aVar.r || aVar.s) {
                                                    throw g0.l(aVar.f3889d, i5, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                } else if (!aVar.f3894j) {
                                                    try {
                                                        h<T, h0> c3 = aVar.f3888c.c(type3, annotationArr2, aVar.e);
                                                        aVar.f3894j = true;
                                                        wVar3 = new w.a<>(aVar.f3889d, i5, c3);
                                                    } catch (RuntimeException e8) {
                                                        throw g0.m(aVar.f3889d, e8, i5, "Unable to create @Body converter for %s", type3);
                                                    }
                                                } else {
                                                    throw g0.l(aVar.f3889d, i5, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                            } else if (annotation2 instanceof m.j0.x) {
                                                aVar.c(i5, type3);
                                                Class<?> f11 = g0.f(type3);
                                                for (int i11 = i5 - 1; i11 >= 0; i11--) {
                                                    w<?> wVar5 = aVar.x[i11];
                                                    if ((wVar5 instanceof w.o) && ((w.o) wVar5).a.equals(f11)) {
                                                        Method method2 = aVar.f3889d;
                                                        StringBuilder f12 = a.f("@Tag type ");
                                                        f12.append(f11.getName());
                                                        f12.append(" is duplicate of parameter #");
                                                        f12.append(i11 + 1);
                                                        f12.append(" and would always overwrite its value.");
                                                        throw g0.l(method2, i5, f12.toString(), new Object[0]);
                                                    }
                                                }
                                                wVar3 = new w.o<>(f11);
                                            } else {
                                                wVar2 = null;
                                            }
                                            wVar2 = wVar3;
                                        }
                                        wVar2 = cVar;
                                    }
                                }
                                str2 = str8;
                            }
                            if (wVar2 != null) {
                                if (wVar == null) {
                                    wVar = wVar2;
                                } else {
                                    throw g0.l(aVar.f3889d, i5, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                            }
                            i10++;
                            type4 = type3;
                            length3 = length3;
                            i9 = i9;
                            length4 = i4;
                            str8 = str2;
                        }
                        i3 = length3;
                        i2 = i9;
                        str = str8;
                        type2 = type4;
                    } else {
                        i3 = length3;
                        i2 = i9;
                        str = str8;
                        type2 = type4;
                        wVar = null;
                    }
                    if (wVar == null) {
                        if (i7 != 0) {
                            try {
                                if (g0.f(type2) == i.q.d.class) {
                                    aVar.y = true;
                                    wVar = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw g0.l(aVar.f3889d, i5, "No Retrofit annotation found.", new Object[0]);
                    }
                    wVarArr[i5] = wVar;
                    i5++;
                    i10 = 0;
                    i7 = 1;
                    length3 = i3;
                    i9 = i2;
                    str8 = str;
                }
                if (aVar.t != null || aVar.o) {
                    boolean z2 = aVar.r;
                    if (!z2 && !aVar.s && !aVar.q && aVar.f3894j) {
                        throw g0.j(aVar.f3889d, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (z2 && !aVar.f3892h) {
                        throw g0.j(aVar.f3889d, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    } else if (!aVar.s || aVar.f3893i) {
                        z zVar = new z(aVar);
                        Type genericReturnType = method.getGenericReturnType();
                        if (g0.h(genericReturnType)) {
                            throw g0.j(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
                        } else if (genericReturnType != Void.TYPE) {
                            boolean z3 = zVar.f3887k;
                            Annotation[] annotations = method.getAnnotations();
                            if (z3) {
                                Type[] genericParameterTypes = method.getGenericParameterTypes();
                                Type type5 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                                if (type5 instanceof WildcardType) {
                                    type5 = ((WildcardType) type5).getLowerBounds()[0];
                                }
                                if (g0.f(type5) != a0.class || !(type5 instanceof ParameterizedType)) {
                                    z = false;
                                } else {
                                    type5 = g0.e(0, (ParameterizedType) type5);
                                    z = true;
                                }
                                type = new g0.b(null, d.class, type5);
                                if (!g0.i(annotations, e0.class)) {
                                    Annotation[] annotationArr3 = new Annotation[(annotations.length + 1)];
                                    annotationArr3[0] = f0.a;
                                    System.arraycopy(annotations, 0, annotationArr3, 1, annotations.length);
                                    annotations = annotationArr3;
                                }
                            } else {
                                type = method.getGenericReturnType();
                                z = false;
                            }
                            try {
                                e<?, ?> a2 = c0Var.a(type, annotations);
                                Type a3 = a2.a();
                                if (a3 == i0.class) {
                                    StringBuilder f13 = a.f("'");
                                    f13.append(g0.f(a3).getName());
                                    f13.append("' is not a valid response body type. Did you mean ResponseBody?");
                                    throw g0.j(method, f13.toString(), new Object[0]);
                                } else if (a3 == a0.class) {
                                    throw g0.j(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                                } else if (!zVar.f3880c.equals(str8) || Void.class.equals(a3)) {
                                    try {
                                        h<j0, T> d2 = c0Var.d(a3, method.getAnnotations());
                                        e.a aVar3 = c0Var.b;
                                        if (!z3) {
                                            return new k.a(zVar, aVar3, d2, a2);
                                        }
                                        return z ? new k.c(zVar, aVar3, d2, a2) : new k.b(zVar, aVar3, d2, a2, false);
                                    } catch (RuntimeException e9) {
                                        throw g0.k(method, e9, "Unable to create converter for %s", a3);
                                    }
                                } else {
                                    throw g0.j(method, "HEAD method must use Void as response type.", new Object[0]);
                                }
                            } catch (RuntimeException e10) {
                                throw g0.k(method, e10, "Unable to create call adapter for %s", type);
                            }
                        } else {
                            throw g0.j(method, "Service methods cannot return void.", new Object[0]);
                        }
                    } else {
                        throw g0.j(aVar.f3889d, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw g0.j(aVar.f3889d, "Missing either @%s URL or @Url parameter.", aVar.p);
                }
            } else {
                throw g0.j(aVar.f3889d, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
        throw g0.j(aVar.f3889d, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str6);
    }

    @Nullable
    public abstract T a(Object[] objArr);
}
