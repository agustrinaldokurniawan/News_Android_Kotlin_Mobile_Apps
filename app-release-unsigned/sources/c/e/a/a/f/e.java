package c.e.a.a.f;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

public class e implements Runnable {
    public final /* synthetic */ ActionMenuView e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1202f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f1203g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f1204h;

    public e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i2, boolean z) {
        this.f1204h = bottomAppBar;
        this.e = actionMenuView;
        this.f1202f = i2;
        this.f1203g = z;
    }

    public void run() {
        ActionMenuView actionMenuView = this.e;
        actionMenuView.setTranslationX((float) this.f1204h.z(actionMenuView, this.f1202f, this.f1203g));
    }
}
