package c.e.b.a0;

import c.c.a.a.a;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class f implements t<T> {
    public final y a;
    public final /* synthetic */ Class b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Type f1449c;

    public f(g gVar, Class cls, Type type) {
        y yVar;
        this.b = cls;
        this.f1449c = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            yVar = new u(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                yVar = new v(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    yVar = new w(declaredMethod3);
                } catch (Exception unused3) {
                    yVar = new x();
                }
            }
        }
        this.a = yVar;
    }

    @Override // c.e.b.a0.t
    public T a() {
        try {
            return (T) this.a.b(this.b);
        } catch (Exception e) {
            StringBuilder f2 = a.f("Unable to invoke no-args constructor for ");
            f2.append(this.f1449c);
            f2.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(f2.toString(), e);
        }
    }
}
