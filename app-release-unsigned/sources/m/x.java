package m;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

public class x {
    public static final x a = ("Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new x(true));
    public final boolean b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final Constructor<MethodHandles.Lookup> f3868c;

    public static final class a extends x {

        /* renamed from: m.x$a$a  reason: collision with other inner class name */
        public static final class ExecutorC0133a implements Executor {
            public final Handler e = new Handler(Looper.getMainLooper());

            public void execute(Runnable runnable) {
                this.e.post(runnable);
            }
        }

        public a() {
            super(true);
        }

        @Override // m.x
        public Executor a() {
            return new ExecutorC0133a();
        }

        @Override // m.x
        @Nullable
        public Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return x.super.b(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    public x(boolean z) {
        this.b = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            try {
                constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f3868c = constructor;
    }

    @Nullable
    public Executor a() {
        return null;
    }

    @Nullable
    @IgnoreJRERequirement
    public Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.f3868c;
        if (constructor != null) {
            lookup = constructor.newInstance(cls, -1);
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
