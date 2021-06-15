package c.e.b.a0.z;

import c.e.b.a0.g;
import c.e.b.a0.t;
import c.e.b.c0.c;
import c.e.b.i;
import c.e.b.x;
import c.e.b.y;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

public final class b implements y {
    public final g e;

    public static final class a<E> extends x<Collection<E>> {
        public final x<E> a;
        public final t<? extends Collection<E>> b;

        public a(i iVar, Type type, x<E> xVar, t<? extends Collection<E>> tVar) {
            this.a = new n(iVar, xVar, type);
            this.b = tVar;
        }

        @Override // c.e.b.x
        public Object a(c.e.b.c0.a aVar) {
            if (aVar.p0() == c.e.b.c0.b.NULL) {
                aVar.l0();
                return null;
            }
            Collection collection = (Collection) this.b.a();
            aVar.b();
            while (aVar.b0()) {
                collection.add(this.a.a(aVar));
            }
            aVar.u();
            return collection;
        }

        @Override // c.e.b.x
        public void b(c cVar, Object obj) {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                cVar.b0();
                return;
            }
            cVar.c();
            for (E e : collection) {
                this.a.b(cVar, e);
            }
            cVar.u();
        }
    }

    public b(g gVar) {
        this.e = gVar;
    }

    @Override // c.e.b.y
    public <T> x<T> a(i iVar, c.e.b.b0.a<T> aVar) {
        Type type = aVar.b;
        Class<? super T> cls = aVar.a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type f2 = c.e.b.a0.a.f(type, cls, Collection.class);
        if (f2 instanceof WildcardType) {
            f2 = ((WildcardType) f2).getUpperBounds()[0];
        }
        Class cls2 = f2 instanceof ParameterizedType ? ((ParameterizedType) f2).getActualTypeArguments()[0] : Object.class;
        return new a(iVar, cls2, iVar.b(new c.e.b.b0.a<>(cls2)), this.e.a(aVar));
    }
}
