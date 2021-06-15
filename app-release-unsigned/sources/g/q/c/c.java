package g.q.c;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import g.q.c.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class c implements Runnable {
    public final /* synthetic */ ArrayList e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f2894f;

    public c(k kVar, ArrayList arrayList) {
        this.f2894f = kVar;
        this.e = arrayList;
    }

    public void run() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            k.b bVar = (k.b) it.next();
            k kVar = this.f2894f;
            RecyclerView.z zVar = bVar.a;
            int i2 = bVar.b;
            int i3 = bVar.f2917c;
            int i4 = bVar.f2918d;
            int i5 = bVar.e;
            Objects.requireNonNull(kVar);
            View view = zVar.b;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (i6 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i7 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            kVar.q.add(zVar);
            animate.setDuration(kVar.e).setListener(new h(kVar, zVar, i6, view, i7, animate)).start();
        }
        this.e.clear();
        this.f2894f.n.remove(this.e);
    }
}
