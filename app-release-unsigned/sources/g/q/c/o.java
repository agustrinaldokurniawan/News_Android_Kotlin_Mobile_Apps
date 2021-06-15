package g.q.c;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class o extends RecyclerView.v {

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f2944i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f2945j = new DecelerateInterpolator();

    /* renamed from: k  reason: collision with root package name */
    public PointF f2946k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f2947l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2948m = false;
    public float n;
    public int o = 0;
    public int p = 0;

    public o(Context context) {
        this.f2947l = context.getResources().getDisplayMetrics();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void c(View view, RecyclerView.w wVar, RecyclerView.v.a aVar) {
        int i2;
        int i3;
        int i4;
        PointF pointF = this.f2946k;
        int i5 = 0;
        int i6 = (pointF == null || pointF.x == 0.0f) ? 0 : i4 > 0 ? 1 : -1;
        RecyclerView.l lVar = this.f266c;
        if (lVar == null || !lVar.e()) {
            i2 = 0;
        } else {
            RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
            i2 = e(lVar.D(view) - ((ViewGroup.MarginLayoutParams) mVar).leftMargin, lVar.G(view) + ((ViewGroup.MarginLayoutParams) mVar).rightMargin, lVar.O(), lVar.p - lVar.P(), i6);
        }
        PointF pointF2 = this.f2946k;
        int i7 = (pointF2 == null || pointF2.y == 0.0f) ? 0 : i3 > 0 ? 1 : -1;
        RecyclerView.l lVar2 = this.f266c;
        if (lVar2 != null && lVar2.f()) {
            RecyclerView.m mVar2 = (RecyclerView.m) view.getLayoutParams();
            i5 = e(lVar2.H(view) - ((ViewGroup.MarginLayoutParams) mVar2).topMargin, lVar2.B(view) + ((ViewGroup.MarginLayoutParams) mVar2).bottomMargin, lVar2.Q(), lVar2.q - lVar2.N(), i7);
        }
        int ceil = (int) Math.ceil(((double) g((int) Math.sqrt((double) ((i5 * i5) + (i2 * i2))))) / 0.3356d);
        if (ceil > 0) {
            aVar.b(-i2, -i5, ceil, this.f2945j);
        }
    }

    public int e(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int g(int i2) {
        float abs = (float) Math.abs(i2);
        if (!this.f2948m) {
            this.n = f(this.f2947l);
            this.f2948m = true;
        }
        return (int) Math.ceil((double) (abs * this.n));
    }
}
