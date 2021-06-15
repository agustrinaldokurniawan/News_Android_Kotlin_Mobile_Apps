package g.n;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import g.n.e;

public class r extends Fragment {

    public static class a implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            r.a(activity, e.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            r.a(activity, e.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            r.a(activity, e.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            r.a(activity, e.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            r.a(activity, e.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            r.a(activity, e.a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public static void a(Activity activity, e.a aVar) {
        if (activity instanceof k) {
            j a2 = ((k) activity).a();
            a2.d("handleLifecycleEvent");
            a2.g(aVar.a());
        } else if (activity instanceof i) {
            e a3 = ((i) activity).a();
            if (a3 instanceof j) {
                j jVar = (j) a3;
                jVar.d("handleLifecycleEvent");
                jVar.g(aVar.a());
            }
        }
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new r(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void b(e.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), aVar);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(e.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        b(e.a.ON_DESTROY);
    }

    public void onPause() {
        super.onPause();
        b(e.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        b(e.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        b(e.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        b(e.a.ON_STOP);
    }
}
