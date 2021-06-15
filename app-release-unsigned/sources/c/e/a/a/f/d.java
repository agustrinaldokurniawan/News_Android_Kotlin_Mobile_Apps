package c.e.a.a.f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

public class d extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ ActionMenuView b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1200c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f1201d;
    public final /* synthetic */ BottomAppBar e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i2, boolean z) {
        this.e = bottomAppBar;
        this.b = actionMenuView;
        this.f1200c = i2;
        this.f1201d = z;
    }

    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.a) {
            BottomAppBar bottomAppBar = this.e;
            int i2 = bottomAppBar.b0;
            boolean z = i2 != 0;
            if (i2 != 0) {
                bottomAppBar.b0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.n(i2);
            }
            BottomAppBar bottomAppBar2 = this.e;
            ActionMenuView actionMenuView = this.b;
            int i3 = this.f1200c;
            boolean z2 = this.f1201d;
            Objects.requireNonNull(bottomAppBar2);
            e eVar = new e(bottomAppBar2, actionMenuView, i3, z2);
            if (z) {
                actionMenuView.post(eVar);
            } else {
                eVar.run();
            }
        }
    }
}
