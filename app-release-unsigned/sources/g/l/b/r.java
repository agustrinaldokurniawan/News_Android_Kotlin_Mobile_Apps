package g.l.b;

import android.view.ViewGroup;
import android.view.animation.Animation;
import g.l.b.b0;
import g.l.b.q0;

public class r implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ m b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q0.a f2761c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g.h.f.a f2762d;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            if (r.this.b.i() != null) {
                r.this.b.r0(null);
                r rVar = r.this;
                ((b0.d) rVar.f2761c).a(rVar.b, rVar.f2762d);
            }
        }
    }

    public r(ViewGroup viewGroup, m mVar, q0.a aVar, g.h.f.a aVar2) {
        this.a = viewGroup;
        this.b = mVar;
        this.f2761c = aVar;
        this.f2762d = aVar2;
    }

    public void onAnimationEnd(Animation animation) {
        this.a.post(new a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
