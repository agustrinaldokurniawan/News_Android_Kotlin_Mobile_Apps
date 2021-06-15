package g.q.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public class g extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.z a;
    public final /* synthetic */ View b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2899c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f2900d;

    public g(k kVar, RecyclerView.z zVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2900d = kVar;
        this.a = zVar;
        this.b = view;
        this.f2899c = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        this.b.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.f2899c.setListener(null);
        this.f2900d.c(this.a);
        this.f2900d.p.remove(this.a);
        this.f2900d.k();
    }

    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2900d);
    }
}
