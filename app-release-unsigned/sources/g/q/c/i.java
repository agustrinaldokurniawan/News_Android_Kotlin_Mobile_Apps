package g.q.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import g.q.c.k;
import java.util.Objects;

public class i extends AnimatorListenerAdapter {
    public final /* synthetic */ k.a a;
    public final /* synthetic */ ViewPropertyAnimator b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2904c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f2905d;

    public i(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2905d = kVar;
        this.a = aVar;
        this.b = viewPropertyAnimator;
        this.f2904c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.f2904c.setAlpha(1.0f);
        this.f2904c.setTranslationX(0.0f);
        this.f2904c.setTranslationY(0.0f);
        this.f2905d.c(this.a.a);
        this.f2905d.s.remove(this.a.a);
        this.f2905d.k();
    }

    public void onAnimationStart(Animator animator) {
        k kVar = this.f2905d;
        RecyclerView.z zVar = this.a.a;
        Objects.requireNonNull(kVar);
    }
}
