package m;

import j.j0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import m.h;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
public final class t extends h.a {
    public static final h.a a = new t();

    @IgnoreJRERequirement
    public static final class a<T> implements h<j0, Optional<T>> {
        public final h<j0, T> a;

        public a(h<j0, T> hVar) {
            this.a = hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // m.h
        public Object a(j0 j0Var) {
            return Optional.ofNullable(this.a.a(j0Var));
        }
    }

    @Override // m.h.a
    @Nullable
    public h<j0, ?> b(Type type, Annotation[] annotationArr, c0 c0Var) {
        if (g0.f(type) != Optional.class) {
            return null;
        }
        return new a(c0Var.d(g0.e(0, (ParameterizedType) type), annotationArr));
    }
}
