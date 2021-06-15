package c.e.b.a0;

import java.lang.reflect.Method;

public class u extends y {
    public final /* synthetic */ Method a;
    public final /* synthetic */ Object b;

    public u(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    @Override // c.e.b.a0.y
    public <T> T b(Class<T> cls) {
        y.a(cls);
        return (T) this.a.invoke(this.b, cls);
    }
}
