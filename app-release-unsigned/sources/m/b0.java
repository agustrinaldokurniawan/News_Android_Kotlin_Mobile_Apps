package m;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

public class b0 implements InvocationHandler {
    public final x a = x.a;
    public final Object[] b = new Object[0];

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Class f3817c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c0 f3818d;

    public b0(c0 c0Var, Class cls) {
        this.f3818d = c0Var;
        this.f3817c = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    @Nullable
    public Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.b;
        }
        return this.a.b && method.isDefault() ? this.a.b(method, this.f3817c, obj, objArr) : this.f3818d.b(method).a(objArr);
    }
}
