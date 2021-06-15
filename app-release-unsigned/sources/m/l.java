package m;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public final class l {
    public final Method a;
    public final List<?> b;

    public l(Method method, List<?> list) {
        this.a = method;
        this.b = Collections.unmodifiableList(list);
    }

    public String toString() {
        return String.format("%s.%s() %s", this.a.getDeclaringClass().getName(), this.a.getName(), this.b);
    }
}
