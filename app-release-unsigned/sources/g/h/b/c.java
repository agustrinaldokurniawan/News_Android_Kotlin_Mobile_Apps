package g.h.b;

import android.util.Log;
import java.lang.reflect.Method;

public class c implements Runnable {
    public final /* synthetic */ Object e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f2465f;

    public c(Object obj, Object obj2) {
        this.e = obj;
        this.f2465f = obj2;
    }

    public void run() {
        try {
            Method method = b.f2457d;
            if (method != null) {
                method.invoke(this.e, this.f2465f, Boolean.FALSE, "AppCompat recreation");
                return;
            }
            b.e.invoke(this.e, this.f2465f, Boolean.FALSE);
        } catch (RuntimeException e2) {
            if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                throw e2;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
