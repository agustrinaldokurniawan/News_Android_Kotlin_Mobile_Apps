package g.q.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import g.q.c.k;
import java.util.Objects;

public class j extends AnimatorListenerAdapter {
    public final /* synthetic */ k.a a;
    public final /* synthetic */ ViewPropertyAnimator b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2906c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f2907d;

    public j(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2907d = kVar;
        this.a = aVar;
        this.b = viewPropertyAnimator;
        this.f2906c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.f2906c.setAlpha(1.0f);
        this.f2906c.setTranslationX(0.0f);
        this.f2906c.setTranslationY(0.0f);
        this.f2907d.c(this.a.b);
        this.f2907d.s.remove(this.a.b);
        this.f2907d.k();
    }

    public void onAnimationStart(Animator animator) {
        k kVar = this.f2907d;
        RecyclerView.z zVar = this.a.b;
        Objects.requireNonNull(kVar);
    }
}
