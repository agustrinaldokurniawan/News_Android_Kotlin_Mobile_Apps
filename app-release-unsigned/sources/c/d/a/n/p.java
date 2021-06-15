package c.d.a.n;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import c.d.a.c;
import c.d.a.e;
import c.d.a.i;
import c.d.a.m.x.c.s;
import c.d.a.s.j;
import g.l.b.b0;
import g.l.b.m;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class p implements Handler.Callback {
    public static final b a = new a();
    public volatile i b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<FragmentManager, o> f1117c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<b0, s> f1118d = new HashMap();
    public final Handler e;

    /* renamed from: f  reason: collision with root package name */
    public final b f1119f;

    /* renamed from: g  reason: collision with root package name */
    public final g.e.a<View, m> f1120g = new g.e.a<>();

    /* renamed from: h  reason: collision with root package name */
    public final g.e.a<View, Fragment> f1121h = new g.e.a<>();

    /* renamed from: i  reason: collision with root package name */
    public final Bundle f1122i = new Bundle();

    /* renamed from: j  reason: collision with root package name */
    public final k f1123j;

    public class a implements b {
    }

    public interface b {
    }

    public p(b bVar, e eVar) {
        this.f1119f = bVar == null ? a : bVar;
        this.e = new Handler(Looper.getMainLooper(), this);
        this.f1123j = (!s.b || !s.a) ? new g() : eVar.a.containsKey(c.d.class) ? new i() : new j();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void c(Collection<m> collection, Map<View, m> map) {
        View view;
        if (collection != null) {
            for (m mVar : collection) {
                if (!(mVar == null || (view = mVar.J) == null)) {
                    map.put(view, mVar);
                    c(mVar.j().L(), map);
                }
            }
        }
    }

    public static boolean j(Context context) {
        Activity a2 = a(context);
        return a2 == null || !a2.isFinishing();
    }

    @TargetApi(26)
    @Deprecated
    public final void b(FragmentManager fragmentManager, g.e.a<View, Fragment> aVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    b(fragment.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            this.f1122i.putInt("key", i2);
            Fragment fragment2 = null;
            try {
                fragment2 = fragmentManager.getFragment(this.f1122i, "key");
            } catch (Exception unused) {
            }
            if (fragment2 != null) {
                if (fragment2.getView() != null) {
                    aVar.put(fragment2.getView(), fragment2);
                    b(fragment2.getChildFragmentManager(), aVar);
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    @Deprecated
    public final i d(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        o h2 = h(fragmentManager, fragment);
        i iVar = h2.f1114h;
        if (iVar != null) {
            return iVar;
        }
        c.d.a.b b2 = c.d.a.b.b(context);
        b bVar = this.f1119f;
        a aVar = h2.e;
        q qVar = h2.f1112f;
        Objects.requireNonNull((a) bVar);
        i iVar2 = new i(b2, aVar, qVar, context);
        if (z) {
            iVar2.i();
        }
        h2.f1114h = iVar2;
        return iVar2;
    }

    public i e(Activity activity) {
        if (j.i()) {
            return f(activity.getApplicationContext());
        }
        if (activity instanceof g.l.b.p) {
            return g((g.l.b.p) activity);
        }
        if (!activity.isDestroyed()) {
            this.f1123j.a(activity);
            return d(activity, activity.getFragmentManager(), null, j(activity));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public i f(Context context) {
        if (context != null) {
            if (j.j() && !(context instanceof Application)) {
                if (context instanceof g.l.b.p) {
                    return g((g.l.b.p) context);
                }
                if (context instanceof Activity) {
                    return e((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return f(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        c.d.a.b b2 = c.d.a.b.b(context.getApplicationContext());
                        b bVar = this.f1119f;
                        b bVar2 = new b();
                        h hVar = new h();
                        Context applicationContext = context.getApplicationContext();
                        Objects.requireNonNull((a) bVar);
                        this.b = new i(b2, bVar2, hVar, applicationContext);
                    }
                }
            }
            return this.b;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public i g(g.l.b.p pVar) {
        if (j.i()) {
            return f(pVar.getApplicationContext());
        }
        if (!pVar.isDestroyed()) {
            this.f1123j.a(pVar);
            return k(pVar, pVar.m(), null, j(pVar));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final o h(FragmentManager fragmentManager, Fragment fragment) {
        o oVar = (o) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (oVar == null && (oVar = this.f1117c.get(fragmentManager)) == null) {
            oVar = new o();
            oVar.f1116j = fragment;
            if (!(fragment == null || fragment.getActivity() == null)) {
                oVar.a(fragment.getActivity());
            }
            this.f1117c.put(fragmentManager, oVar);
            fragmentManager.beginTransaction().add(oVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.e.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return oVar;
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        int i2 = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i2 == 1) {
            obj2 = (FragmentManager) message.obj;
            map = this.f1117c;
        } else if (i2 != 2) {
            z = false;
            obj = null;
            if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
            }
            return z;
        } else {
            obj2 = (b0) message.obj;
            map = this.f1118d;
        }
        obj3 = map.remove(obj2);
        obj = obj2;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        return z;
    }

    public final s i(b0 b0Var, m mVar) {
        s sVar = (s) b0Var.I("com.bumptech.glide.manager");
        if (sVar == null && (sVar = this.f1118d.get(b0Var)) == null) {
            sVar = new s();
            sVar.c0 = mVar;
            if (!(mVar == null || mVar.k() == null)) {
                m mVar2 = mVar;
                while (true) {
                    m mVar3 = mVar2.z;
                    if (mVar3 == null) {
                        break;
                    }
                    mVar2 = mVar3;
                }
                b0 b0Var2 = mVar2.w;
                if (b0Var2 != null) {
                    sVar.C0(mVar.k(), b0Var2);
                }
            }
            this.f1118d.put(b0Var, sVar);
            g.l.b.a aVar = new g.l.b.a(b0Var);
            aVar.d(0, sVar, "com.bumptech.glide.manager", 1);
            aVar.g(true);
            this.e.obtainMessage(2, b0Var).sendToTarget();
        }
        return sVar;
    }

    public final i k(Context context, b0 b0Var, m mVar, boolean z) {
        s i2 = i(b0Var, mVar);
        i iVar = i2.b0;
        if (iVar != null) {
            return iVar;
        }
        c.d.a.b b2 = c.d.a.b.b(context);
        b bVar = this.f1119f;
        a aVar = i2.X;
        q qVar = i2.Y;
        Objects.requireNonNull((a) bVar);
        i iVar2 = new i(b2, aVar, qVar, context);
        if (z) {
            iVar2.i();
        }
        i2.b0 = iVar2;
        return iVar2;
    }
}
