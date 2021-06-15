package g.l.b;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import g.l.b.c;

public class f implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.b f2678c;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            f fVar = f.this;
            fVar.a.endViewTransition(fVar.b);
            f.this.f2678c.a();
        }
    }

    public f(c cVar, ViewGroup viewGroup, View view, c.b bVar) {
        this.a = viewGroup;
        this.b = view;
        this.f2678c = bVar;
    }

    public void onAnimationEnd(Animation animation) {
        this.a.post(new a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
