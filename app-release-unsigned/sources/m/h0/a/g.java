package m.h0.a;

import h.a.a;
import h.a.c;
import h.a.j;
import h.a.m;
import h.a.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import m.a0;
import m.c0;
import m.e;
import m.g0;

public final class g extends e.a {
    public g(@Nullable m mVar, boolean z) {
    }

    @Override // m.e.a
    @Nullable
    public e<?, ?> a(Type type, Annotation[] annotationArr, c0 c0Var) {
        boolean z;
        boolean z2;
        Type type2;
        Class<?> f2 = g0.f(type);
        if (f2 == a.class) {
            return new f(Void.class, null, false, false, true, false, false, false, true);
        }
        boolean z3 = f2 == c.class;
        boolean z4 = f2 == n.class;
        boolean z5 = f2 == h.a.g.class;
        if (f2 != j.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z3 ? !z4 ? z5 ? "Maybe" : "Observable" : "Single" : "Flowable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type e = g0.e(0, (ParameterizedType) type);
        Class<?> f3 = g0.f(e);
        if (f3 == a0.class) {
            if (e instanceof ParameterizedType) {
                type2 = g0.e(0, (ParameterizedType) e);
                z2 = false;
                z = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (f3 != d.class) {
            type2 = e;
            z = true;
            z2 = false;
        } else if (e instanceof ParameterizedType) {
            type2 = g0.e(0, (ParameterizedType) e);
            z2 = true;
            z = false;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        return new f(type2, null, false, z2, z, z3, z4, z5, false);
    }
}
