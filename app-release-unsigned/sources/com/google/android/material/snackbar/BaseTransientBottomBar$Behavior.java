package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.e.a.a.x.a;
import c.e.a.a.x.d;
import c.e.a.a.x.e;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h  reason: collision with root package name */
    public final a f1695h = new a(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public boolean B(View view) {
        Objects.requireNonNull(this.f1695h);
        return view instanceof d;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        Objects.requireNonNull(this.f1695h);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (e.a == null) {
                    e.a = new e();
                }
                synchronized (e.a.b) {
                }
            }
        } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (e.a == null) {
                e.a = new e();
            }
            synchronized (e.a.b) {
            }
        }
        return super.j(coordinatorLayout, view, motionEvent);
    }
}
