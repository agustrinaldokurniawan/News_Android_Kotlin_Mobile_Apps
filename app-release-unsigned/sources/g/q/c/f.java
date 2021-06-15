package g.q.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public class f extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.z a;
    public final /* synthetic */ ViewPropertyAnimator b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2897c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f2898d;

    public f(k kVar, RecyclerView.z zVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2898d = kVar;
        this.a = zVar;
        this.b = viewPropertyAnimator;
        this.f2897c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.f2897c.setAlpha(1.0f);
        this.f2898d.c(this.a);
        this.f2898d.r.remove(this.a);
        this.f2898d.k();
    }

    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2898d);
    }
}
