package i.s.c;

import i.s.b.c;
import i.s.b.e;
import i.s.b.f;
import i.s.b.g;
import i.s.b.h;
import i.s.b.i;
import i.s.b.j;
import i.s.b.k;
import i.s.b.l;
import i.s.b.m;
import i.s.b.n;
import i.s.b.o;
import i.s.b.p;
import i.s.b.q;
import i.s.b.r;
import i.s.b.s;
import i.s.b.t;
import i.s.b.u;
import i.s.b.v;
import i.s.b.w;
import i.v.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class d implements b<Object>, c {
    public static final Map<Class<? extends i.a<?>>, Integer> a;
    public static final HashMap<String, String> b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap<String, String> f3315c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<String, String> f3316d;
    public static final a e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f3317f;

    public static final class a {
        public a(f fVar) {
        }
    }

    static {
        Map<Class<? extends i.a<?>>, Integer> map;
        Class[] clsArr = {i.s.b.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, i.s.b.b.class, c.class, i.s.b.d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class};
        h.e(clsArr, "elements");
        List a2 = i.o.e.a(clsArr);
        ArrayList arrayList = new ArrayList(h.a.t.a.l(a2, 10));
        int i2 = 0;
        for (Object obj : a2) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                arrayList.add(new i.f((Class) obj, Integer.valueOf(i2)));
                i2 = i3;
            } else {
                i.o.e.m();
                throw null;
            }
        }
        h.e(arrayList, "$this$toMap");
        int size = arrayList.size();
        if (size == 0) {
            map = i.o.i.e;
        } else if (size != 1) {
            map = new LinkedHashMap<>(h.a.t.a.H(arrayList.size()));
            i.o.e.p(arrayList, map);
        } else {
            i.f fVar = (i.f) arrayList.get(0);
            h.e(fVar, "pair");
            map = Collections.singletonMap(fVar.e, fVar.f3289f);
            h.d(map, "java.util.Collections.si…(pair.first, pair.second)");
        }
        a = map;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        b = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f3315c = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        h.d(values, "primitiveFqNames.values");
        for (T t : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            h.d(t, "kotlinName");
            sb.append(i.x.e.w(t, '.', null, 2));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), ((String) t) + ".Companion");
        }
        for (Map.Entry<Class<? extends i.a<?>>, Integer> entry : a.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        f3316d = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.a.t.a.H(hashMap3.size()));
        for (T t2 : hashMap3.entrySet()) {
            linkedHashMap.put(t2.getKey(), i.x.e.w((String) t2.getValue(), '.', null, 2));
        }
    }

    public d(Class<?> cls) {
        h.e(cls, "jClass");
        this.f3317f = cls;
    }

    @Override // i.s.c.c
    public Class<?> a() {
        return this.f3317f;
    }

    @Override // i.v.b
    public boolean b(Object obj) {
        Class<?> cls = this.f3317f;
        h.e(cls, "jClass");
        Map<Class<? extends i.a<?>>, Integer> map = a;
        Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K, V>");
        Integer num = map.get(cls);
        if (num != null) {
            int intValue = num.intValue();
            if (obj instanceof i.a) {
                if ((obj instanceof g ? ((g) obj).d() : obj instanceof i.s.b.a ? 0 : obj instanceof l ? 1 : obj instanceof p ? 2 : obj instanceof q ? 3 : obj instanceof r ? 4 : obj instanceof s ? 5 : obj instanceof t ? 6 : obj instanceof u ? 7 : obj instanceof v ? 8 : obj instanceof w ? 9 : obj instanceof i.s.b.b ? 10 : obj instanceof c ? 11 : obj instanceof i.s.b.d ? 12 : obj instanceof e ? 13 : obj instanceof f ? 14 : obj instanceof g ? 15 : obj instanceof h ? 16 : obj instanceof i ? 17 : obj instanceof j ? 18 : obj instanceof k ? 19 : obj instanceof m ? 20 : obj instanceof n ? 21 : obj instanceof o ? 22 : -1) == intValue) {
                    return true;
                }
            }
            return false;
        }
        if (cls.isPrimitive()) {
            h.e(cls, "$this$kotlin");
            cls = h.a.t.a.v(p.a(cls));
        }
        return cls.isInstance(obj);
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && h.a(h.a.t.a.v(this), h.a.t.a.v((b) obj));
    }

    @Override // i.v.b
    public int hashCode() {
        return h.a.t.a.v(this).hashCode();
    }

    public String toString() {
        return this.f3317f.toString() + " (Kotlin reflection is not available)";
    }
}
