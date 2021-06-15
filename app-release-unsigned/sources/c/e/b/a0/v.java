package c.e.b.a0;

import java.lang.reflect.Method;

public class v extends y {
    public final /* synthetic */ Method a;
    public final /* synthetic */ int b;

    public v(Method method, int i2) {
        this.a = method;
        this.b = i2;
    }

    @Override // c.e.b.a0.y
    public <T> T b(Class<T> cls) {
        y.a(cls);
        return (T) this.a.invoke(null, cls, Integer.valueOf(this.b));
    }
}
