package i.q.j.a;

import i.q.d;
import i.q.j.a.f;
import i.s.c.h;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class a implements d<Object>, d, Serializable {
    public final d<Object> e;

    public a(d<Object> dVar) {
        this.e = dVar;
    }

    @Override // i.q.d
    public final void a(Object obj) {
        a aVar = this;
        while (true) {
            h.e(aVar, "frame");
            d<Object> dVar = aVar.e;
            h.c(dVar);
            try {
                obj = aVar.c(obj);
                if (obj == i.q.i.a.e) {
                    return;
                }
            } catch (Throwable th) {
                obj = h.a.t.a.n(th);
            }
            aVar.e();
            if (dVar instanceof a) {
                aVar = (a) dVar;
            } else {
                dVar.a(obj);
                return;
            }
        }
    }

    public StackTraceElement b() {
        int i2;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        h.e(this, "$this$getStackTraceElementImpl");
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v = eVar.v();
        if (v <= 1) {
            int i3 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                h.d(declaredField, "field");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                if (!(obj instanceof Integer)) {
                    obj = null;
                }
                Integer num = (Integer) obj;
                i2 = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i2 = -1;
            }
            if (i2 >= 0) {
                i3 = eVar.l()[i2];
            }
            h.e(this, "continuation");
            f.a aVar = f.b;
            if (aVar == null) {
                try {
                    f.a aVar2 = new f.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    f.b = aVar2;
                    aVar = aVar2;
                } catch (Exception unused2) {
                    aVar = f.a;
                    f.b = aVar;
                }
            }
            if (!(aVar == f.a || (method = aVar.a) == null || (invoke = method.invoke(getClass(), new Object[0])) == null || (method2 = aVar.b) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null)) {
                Method method3 = aVar.f3308c;
                Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                if (invoke3 instanceof String) {
                    str2 = invoke3;
                }
                str2 = str2;
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i3);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + 1 + ", got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object c(Object obj);

    public void e() {
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("Continuation at ");
        Object b = b();
        if (b == null) {
            b = getClass().getName();
        }
        f2.append(b);
        return f2.toString();
    }
}
