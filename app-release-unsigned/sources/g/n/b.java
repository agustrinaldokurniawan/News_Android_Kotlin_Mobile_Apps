package g.n;

import g.n.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class b {
    public static b a = new b();
    public final Map<Class<?>, a> b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, Boolean> f2806c = new HashMap();

    public static class a {
        public final Map<e.a, List<C0086b>> a = new HashMap();
        public final Map<C0086b, e.a> b;

        public a(Map<C0086b, e.a> map) {
            this.b = map;
            for (Map.Entry<C0086b, e.a> entry : map.entrySet()) {
                e.a value = entry.getValue();
                List<C0086b> list = this.a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void a(List<C0086b> list, i iVar, e.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0086b bVar = list.get(size);
                    Objects.requireNonNull(bVar);
                    try {
                        int i2 = bVar.a;
                        if (i2 == 0) {
                            bVar.b.invoke(obj, new Object[0]);
                        } else if (i2 == 1) {
                            bVar.b.invoke(obj, iVar);
                        } else if (i2 == 2) {
                            bVar.b.invoke(obj, iVar, aVar);
                        }
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
    }

    /* renamed from: g.n.b$b  reason: collision with other inner class name */
    public static final class C0086b {
        public final int a;
        public final Method b;

        public C0086b(int i2, Method method) {
            this.a = i2;
            this.b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0086b)) {
                return false;
            }
            C0086b bVar = (C0086b) obj;
            return this.a == bVar.a && this.b.getName().equals(bVar.b.getName());
        }

        public int hashCode() {
            return this.b.getName().hashCode() + (this.a * 31);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i2;
        a b2;
        Class<?> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b2 = b(superclass)) == null)) {
            hashMap.putAll(b2.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0086b, e.a> entry : b(cls2).b.entrySet()) {
                c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            q qVar = (q) method.getAnnotation(q.class);
            if (qVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else if (parameterTypes[0].isAssignableFrom(i.class)) {
                    i2 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                e.a value = qVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(e.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == e.a.ON_ANY) {
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new C0086b(i2, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.b.put(cls, aVar);
        this.f2806c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    public a b(Class<?> cls) {
        a aVar = this.b.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public final void c(Map<C0086b, e.a> map, C0086b bVar, e.a aVar, Class<?> cls) {
        e.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.b;
            StringBuilder f2 = c.c.a.a.a.f("Method ");
            f2.append(method.getName());
            f2.append(" in ");
            f2.append(cls.getName());
            f2.append(" already declared with different @OnLifecycleEvent value: previous value ");
            f2.append(aVar2);
            f2.append(", new value ");
            f2.append(aVar);
            throw new IllegalArgumentException(f2.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }
}
