package c.e.b.a0.z;

import c.e.b.c0.b;
import c.e.b.c0.c;
import c.e.b.i;
import c.e.b.x;
import c.e.b.y;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class a<E> extends x<Object> {
    public static final y a = new C0047a();
    public final Class<E> b;

    /* renamed from: c  reason: collision with root package name */
    public final x<E> f1472c;

    /* renamed from: c.e.b.a0.z.a$a  reason: collision with other inner class name */
    public class C0047a implements y {
        @Override // c.e.b.y
        public <T> x<T> a(i iVar, c.e.b.b0.a<T> aVar) {
            Type type = aVar.b;
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new a(iVar, iVar.b(new c.e.b.b0.a<>(genericComponentType)), c.e.b.a0.a.e(genericComponentType));
        }
    }

    public a(i iVar, x<E> xVar, Class<E> cls) {
        this.f1472c = new n(iVar, xVar, cls);
        this.b = cls;
    }

    @Override // c.e.b.x
    public Object a(c.e.b.c0.a aVar) {
        if (aVar.p0() == b.NULL) {
            aVar.l0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.b0()) {
            arrayList.add(this.f1472c.a(aVar));
        }
        aVar.u();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.b, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: c.e.b.x<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.e.b.x
    public void b(c cVar, Object obj) {
        if (obj == null) {
            cVar.b0();
            return;
        }
        cVar.c();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f1472c.b(cVar, Array.get(obj, i2));
        }
        cVar.u();
    }
}
