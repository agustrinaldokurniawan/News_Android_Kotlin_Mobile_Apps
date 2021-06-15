package g.q.c;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import g.q.c.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class d implements Runnable {
    public final /* synthetic */ ArrayList e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f2895f;

    public d(k kVar, ArrayList arrayList) {
        this.f2895f = kVar;
        this.e = arrayList;
    }

    public void run() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            k.a aVar = (k.a) it.next();
            k kVar = this.f2895f;
            Objects.requireNonNull(kVar);
            RecyclerView.z zVar = aVar.a;
            View view = null;
            View view2 = zVar == null ? null : zVar.b;
            RecyclerView.z zVar2 = aVar.b;
            if (zVar2 != null) {
                view = zVar2.b;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(kVar.f243f);
                kVar.s.add(aVar.a);
                duration.translationX((float) (aVar.e - aVar.f2914c));
                duration.translationY((float) (aVar.f2916f - aVar.f2915d));
                duration.alpha(0.0f).setListener(new i(kVar, aVar, duration, view2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                kVar.s.add(aVar.b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f243f).alpha(1.0f).setListener(new j(kVar, aVar, animate, view)).start();
            }
        }
        this.e.clear();
        this.f2895f.o.remove(this.e);
    }
}
