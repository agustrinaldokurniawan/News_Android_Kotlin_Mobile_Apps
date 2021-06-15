package c.e.a.a.d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.Objects;

public abstract class e<V extends View> extends g<V> {

    /* renamed from: c  reason: collision with root package name */
    public Runnable f1187c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f1188d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public int f1189f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f1190g;

    /* renamed from: h  reason: collision with root package name */
    public int f1191h = -1;

    /* renamed from: i  reason: collision with root package name */
    public VelocityTracker f1192i;

    public class a implements Runnable {
        public final CoordinatorLayout e;

        /* renamed from: f  reason: collision with root package name */
        public final V f1193f;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.e = coordinatorLayout;
            this.f1193f = v;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: c.e.a.a.d.e */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            OverScroller overScroller;
            if (this.f1193f != null && (overScroller = e.this.f1188d) != null) {
                if (overScroller.computeScrollOffset()) {
                    e eVar = e.this;
                    eVar.G(this.e, this.f1193f, eVar.f1188d.getCurrY());
                    this.f1193f.postOnAnimation(this);
                    return;
                }
                e eVar2 = e.this;
                CoordinatorLayout coordinatorLayout = this.e;
                V v = this.f1193f;
                AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) eVar2;
                Objects.requireNonNull(baseBehavior);
                V v2 = v;
                baseBehavior.O(coordinatorLayout, v2);
                if (v2.f1606m) {
                    v2.c(v2.d(baseBehavior.K(coordinatorLayout)));
                }
            }
        }
    }

    public e() {
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A(androidx.coordinatorlayout.widget.CoordinatorLayout r21, V r22, android.view.MotionEvent r23) {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.a.d.e.A(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int E();

    public final int F(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return H(coordinatorLayout, v, E() - i2, i3, i4);
    }

    public int G(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return H(coordinatorLayout, v, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public abstract int H(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        int findPointerIndex;
        if (this.f1191h < 0) {
            this.f1191h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.e) {
            int i2 = this.f1189f;
            if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f1190g) > this.f1191h) {
                this.f1190g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f1189f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            AppBarLayout appBarLayout = (AppBarLayout) v;
            WeakReference<View> weakReference = ((AppBarLayout.BaseBehavior) this).p;
            boolean z = (weakReference == null || ((view = weakReference.get()) != null && view.isShown() && !view.canScrollVertically(-1))) && coordinatorLayout.p(v, x, y2);
            this.e = z;
            if (z) {
                this.f1190g = y2;
                this.f1189f = motionEvent.getPointerId(0);
                if (this.f1192i == null) {
                    this.f1192i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f1188d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f1188d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f1192i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
