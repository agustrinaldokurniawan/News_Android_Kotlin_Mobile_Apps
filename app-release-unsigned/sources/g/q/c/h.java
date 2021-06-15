package g.q.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public class h extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.z a;
    public final /* synthetic */ int b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2901c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2902d;
    public final /* synthetic */ ViewPropertyAnimator e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f2903f;

    public h(k kVar, RecyclerView.z zVar, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2903f = kVar;
        this.a = zVar;
        this.b = i2;
        this.f2901c = view;
        this.f2902d = i3;
        this.e = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.b != 0) {
            this.f2901c.setTranslationX(0.0f);
        }
        if (this.f2902d != 0) {
            this.f2901c.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        this.f2903f.c(this.a);
        this.f2903f.q.remove(this.a);
        this.f2903f.k();
    }

    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2903f);
    }
}
