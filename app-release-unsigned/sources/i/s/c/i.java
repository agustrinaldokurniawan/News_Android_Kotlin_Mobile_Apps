package i.s.c;

import java.io.Serializable;
import java.util.Objects;

public abstract class i<R> implements g<R>, Serializable {
    public final int e;

    public i(int i2) {
        this.e = i2;
    }

    @Override // i.s.c.g
    public int d() {
        return this.e;
    }

    public String toString() {
        Objects.requireNonNull(p.a);
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        h.d(obj, "Reflection.renderLambdaToString(this)");
        return obj;
    }
}
