package g.q.c;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class e implements Runnable {
    public final /* synthetic */ ArrayList e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f2896f;

    public e(k kVar, ArrayList arrayList) {
        this.f2896f = kVar;
        this.e = arrayList;
    }

    public void run() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            RecyclerView.z zVar = (RecyclerView.z) it.next();
            k kVar = this.f2896f;
            Objects.requireNonNull(kVar);
            View view = zVar.b;
            ViewPropertyAnimator animate = view.animate();
            kVar.p.add(zVar);
            animate.alpha(1.0f).setDuration(kVar.f241c).setListener(new g(kVar, zVar, view, animate)).start();
        }
        this.e.clear();
        this.f2896f.f2913m.remove(this.e);
    }
}
