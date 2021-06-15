package c.e.b.a0;

import c.c.a.a.a;
import c.e.b.o;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

public class j implements t<T> {
    public final /* synthetic */ Type a;

    public j(g gVar, Type type) {
        this.a = type;
    }

    @Override // c.e.b.a0.t
    public T a() {
        Type type = this.a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            StringBuilder f2 = a.f("Invalid EnumSet type: ");
            f2.append(this.a.toString());
            throw new o(f2.toString());
        }
        StringBuilder f3 = a.f("Invalid EnumSet type: ");
        f3.append(this.a.toString());
        throw new o(f3.toString());
    }
}
