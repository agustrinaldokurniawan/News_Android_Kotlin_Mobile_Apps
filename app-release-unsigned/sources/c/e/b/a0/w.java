package c.e.b.a0;

import java.lang.reflect.Method;

public class w extends y {
    public final /* synthetic */ Method a;

    public w(Method method) {
        this.a = method;
    }

    @Override // c.e.b.a0.y
    public <T> T b(Class<T> cls) {
        y.a(cls);
        return (T) this.a.invoke(null, cls, Object.class);
    }
}
