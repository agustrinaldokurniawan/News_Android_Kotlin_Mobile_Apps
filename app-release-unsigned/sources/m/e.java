package m;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public interface e<R, T> {

    public static abstract class a {
        @Nullable
        public abstract e<?, ?> a(Type type, Annotation[] annotationArr, c0 c0Var);
    }

    Type a();

    T b(d<R> dVar);
}
