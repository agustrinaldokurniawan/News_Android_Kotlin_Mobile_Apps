package d.a.z0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import h.a.t.a;
import i.g;
import java.util.Objects;

public final class c {
    static {
        Object obj;
        Object obj2 = null;
        try {
            obj = new a(a(Looper.getMainLooper(), true), null, false);
        } catch (Throwable th) {
            obj = a.n(th);
        }
        if (!(obj instanceof g.a)) {
            obj2 = obj;
        }
        b bVar = (b) obj2;
    }

    public static final Handler a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
