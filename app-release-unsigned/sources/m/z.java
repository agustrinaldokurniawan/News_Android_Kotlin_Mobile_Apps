package m;

import j.a0;
import j.x;
import j.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public final class z {
    public final Method a;
    public final y b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3880c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final String f3881d;
    @Nullable
    public final x e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final a0 f3882f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3883g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3884h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3885i;

    /* renamed from: j  reason: collision with root package name */
    public final w<?>[] f3886j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f3887k;

    public static final class a {
        public static final Pattern a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        public static final Pattern b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: c  reason: collision with root package name */
        public final c0 f3888c;

        /* renamed from: d  reason: collision with root package name */
        public final Method f3889d;
        public final Annotation[] e;

        /* renamed from: f  reason: collision with root package name */
        public final Annotation[][] f3890f;

        /* renamed from: g  reason: collision with root package name */
        public final Type[] f3891g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3892h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f3893i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f3894j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f3895k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f3896l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f3897m;
        public boolean n;
        public boolean o;
        @Nullable
        public String p;
        public boolean q;
        public boolean r;
        public boolean s;
        @Nullable
        public String t;
        @Nullable
        public x u;
        @Nullable
        public a0 v;
        @Nullable
        public Set<String> w;
        @Nullable
        public w<?>[] x;
        public boolean y;

        public a(c0 c0Var, Method method) {
            this.f3888c = c0Var;
            this.f3889d = method;
            this.e = method.getAnnotations();
            this.f3891g = method.getGenericParameterTypes();
            this.f3890f = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z) {
            String str3 = this.p;
            if (str3 == null) {
                this.p = str;
                this.q = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (a.matcher(substring).find()) {
                            throw g0.j(this.f3889d, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.t = str2;
                    Matcher matcher = a.matcher(str2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (matcher.find()) {
                        linkedHashSet.add(matcher.group(1));
                    }
                    this.w = linkedHashSet;
                    return;
                }
                return;
            }
            throw g0.j(this.f3889d, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void c(int i2, Type type) {
            if (g0.h(type)) {
                throw g0.l(this.f3889d, i2, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public z(a aVar) {
        this.a = aVar.f3889d;
        this.b = aVar.f3888c.f3819c;
        this.f3880c = aVar.p;
        this.f3881d = aVar.t;
        this.e = aVar.u;
        this.f3882f = aVar.v;
        this.f3883g = aVar.q;
        this.f3884h = aVar.r;
        this.f3885i = aVar.s;
        this.f3886j = aVar.x;
        this.f3887k = aVar.y;
    }
}
