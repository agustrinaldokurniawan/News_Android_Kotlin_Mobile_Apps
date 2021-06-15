package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import g.h.j.o;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    public int a = 0;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f1726f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ c.e.a.a.p.a f1727g;

        public a(View view, int i2, c.e.a.a.p.a aVar) {
            this.e = view;
            this.f1726f = i2;
            this.f1727g = aVar;
        }

        public boolean onPreDraw() {
            this.e.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.a == this.f1726f) {
                c.e.a.a.p.a aVar = this.f1727g;
                expandableBehavior.C((View) aVar, this.e, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean B(boolean z) {
        if (!z) {
            return this.a == 1;
        }
        int i2 = this.a;
        return i2 == 0 || i2 == 2;
    }

    public abstract boolean C(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        c.e.a.a.p.a aVar = (c.e.a.a.p.a) view2;
        if (!B(aVar.a())) {
            return false;
        }
        this.a = aVar.a() ? 1 : 2;
        return C((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        c.e.a.a.p.a aVar;
        AtomicInteger atomicInteger = o.a;
        if (!view.isLaidOut()) {
            List<View> e = coordinatorLayout.e(view);
            int size = e.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = e.get(i3);
                if (d(coordinatorLayout, view, view2)) {
                    aVar = (c.e.a.a.p.a) view2;
                    break;
                }
                i3++;
            }
            if (aVar != null && B(aVar.a())) {
                int i4 = aVar.a() ? 1 : 2;
                this.a = i4;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i4, aVar));
            }
        }
        return false;
    }
}
