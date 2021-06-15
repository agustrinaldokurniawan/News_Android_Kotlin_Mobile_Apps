package h.a.o.a;

import android.os.Handler;
import android.os.Looper;
import h.a.m;
import h.a.s.j.b;
import java.util.Objects;

public final class a {
    public static final m a;

    /* renamed from: h.a.o.a.a$a  reason: collision with other inner class name */
    public static final class C0102a {
        public static final m a = new b(new Handler(Looper.getMainLooper()), false);
    }

    static {
        try {
            m mVar = C0102a.a;
            if (mVar != null) {
                a = mVar;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw b.b(th);
        }
    }

    public static m a() {
        m mVar = a;
        Objects.requireNonNull(mVar, "scheduler == null");
        return mVar;
    }
}
