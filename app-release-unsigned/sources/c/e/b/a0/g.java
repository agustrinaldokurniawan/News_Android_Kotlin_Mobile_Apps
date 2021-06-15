package c.e.b.a0;

import c.e.b.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public final class g {
    public final Map<Type, j<?>> a;
    public final c.e.b.a0.a0.b b = c.e.b.a0.a0.b.a;

    public class a implements t<T> {
        public final /* synthetic */ j a;
        public final /* synthetic */ Type b;

        public a(g gVar, j jVar, Type type) {
            this.a = jVar;
            this.b = type;
        }

        @Override // c.e.b.a0.t
        public T a() {
            return (T) this.a.a(this.b);
        }
    }

    public class b implements t<T> {
        public final /* synthetic */ j a;
        public final /* synthetic */ Type b;

        public b(g gVar, j jVar, Type type) {
            this.a = jVar;
            this.b = type;
        }

        @Override // c.e.b.a0.t
        public T a() {
            return (T) this.a.a(this.b);
        }
    }

    public g(Map<Type, j<?>> map) {
        this.a = map;
    }

    public <T> t<T> a(c.e.b.b0.a<T> aVar) {
        h hVar;
        Type type = aVar.b;
        Class<? super T> cls = aVar.a;
        j<?> jVar = this.a.get(type);
        if (jVar != null) {
            return new a(this, jVar, type);
        }
        j<?> jVar2 = this.a.get(cls);
        if (jVar2 != null) {
            return new b(this, jVar2, type);
        }
        t<T> tVar = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.b.a(declaredConstructor);
            }
            hVar = new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            hVar = null;
        }
        if (hVar != null) {
            return hVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            tVar = SortedSet.class.isAssignableFrom(cls) ? new i(this) : EnumSet.class.isAssignableFrom(cls) ? new j(this, type) : Set.class.isAssignableFrom(cls) ? new k(this) : Queue.class.isAssignableFrom(cls) ? new l(this) : new m(this);
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                tVar = new n(this);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                tVar = new b(this);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                tVar = new c(this);
            } else {
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    Objects.requireNonNull(type2);
                    Type a2 = a.a(type2);
                    Class<?> e = a.e(a2);
                    a2.hashCode();
                    if (!String.class.isAssignableFrom(e)) {
                        tVar = new d(this);
                    }
                }
                tVar = new e(this);
            }
        }
        if (tVar != null) {
            return tVar;
        }
        return new f(this, cls, type);
    }

    public String toString() {
        return this.a.toString();
    }
}
