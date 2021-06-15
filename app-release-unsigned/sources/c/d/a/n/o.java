package c.d.a.n;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import c.d.a.b;
import c.d.a.i;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Deprecated
public class o extends Fragment {
    public final a e;

    /* renamed from: f  reason: collision with root package name */
    public final q f1112f = new a();

    /* renamed from: g  reason: collision with root package name */
    public final Set<o> f1113g = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    public i f1114h;

    /* renamed from: i  reason: collision with root package name */
    public o f1115i;

    /* renamed from: j  reason: collision with root package name */
    public Fragment f1116j;

    public class a implements q {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        a aVar = new a();
        this.e = aVar;
    }

    public final void a(Activity activity) {
        b();
        p pVar = b.b(activity).f728l;
        Objects.requireNonNull(pVar);
        o h2 = pVar.h(activity.getFragmentManager(), null);
        this.f1115i = h2;
        if (!equals(h2)) {
            this.f1115i.f1113g.add(this);
        }
    }

    public final void b() {
        o oVar = this.f1115i;
        if (oVar != null) {
            oVar.f1113g.remove(this);
            this.f1115i = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.e.c();
        b();
    }

    public void onDetach() {
        super.onDetach();
        b();
    }

    public void onStart() {
        super.onStart();
        this.e.d();
    }

    public void onStop() {
        super.onStop();
        this.e.e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f1116j;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
