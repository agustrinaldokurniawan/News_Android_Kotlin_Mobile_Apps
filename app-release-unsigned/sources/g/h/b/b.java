package g.h.b;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class b {
    public static final Class<?> a;
    public static final Field b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f2456c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f2457d;
    public static final Method e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f2458f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f2459g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {
        public final /* synthetic */ c e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f2460f;

        public a(c cVar, Object obj) {
            this.e = cVar;
            this.f2460f = obj;
        }

        public void run() {
            this.e.a = this.f2460f;
        }
    }

    /* renamed from: g.h.b.b$b  reason: collision with other inner class name */
    public class RunnableC0073b implements Runnable {
        public final /* synthetic */ Application e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ c f2461f;

        public RunnableC0073b(Application application, c cVar) {
            this.e = application;
            this.f2461f = cVar;
        }

        public void run() {
            this.e.unregisterActivityLifecycleCallbacks(this.f2461f);
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {
        public Object a;
        public Activity b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2462c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2463d = false;
        public boolean e = false;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2464f = false;

        public c(Activity activity) {
            this.b = activity;
            this.f2462c = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.b == activity) {
                this.b = null;
                this.e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.e && !this.f2464f && !this.f2463d) {
                Object obj = this.a;
                int i2 = this.f2462c;
                boolean z = false;
                try {
                    Object obj2 = b.f2456c.get(activity);
                    if (obj2 == obj) {
                        if (activity.hashCode() == i2) {
                            b.f2459g.postAtFrontOfQueue(new c(b.b.get(activity), obj2));
                            z = true;
                        }
                    }
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while fetching field values", th);
                }
                if (z) {
                    this.f2464f = true;
                    this.a = null;
                }
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.b == activity) {
                this.f2463d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[SYNTHETIC, Splitter:B:25:0x005d] */
    static {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.b.b.<clinit>():void");
    }

    public static boolean a() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }

    public static boolean b(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (a() && f2458f == null) {
            return false;
        } else {
            if (e == null && f2457d == null) {
                return false;
            }
            try {
                Object obj2 = f2456c.get(activity);
                if (obj2 == null || (obj = b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                c cVar = new c(activity);
                application.registerActivityLifecycleCallbacks(cVar);
                Handler handler = f2459g;
                handler.post(new a(cVar, obj2));
                try {
                    if (a()) {
                        Method method = f2458f;
                        Boolean bool = Boolean.FALSE;
                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                    } else {
                        activity.recreate();
                    }
                    handler.post(new RunnableC0073b(application, cVar));
                    return true;
                } catch (Throwable th) {
                    f2459g.post(new RunnableC0073b(application, cVar));
                    throw th;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
