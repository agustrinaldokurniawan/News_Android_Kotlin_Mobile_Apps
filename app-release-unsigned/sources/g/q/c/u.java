package g.q.c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class u extends z {

    /* renamed from: c  reason: collision with root package name */
    public s f2950c;

    /* renamed from: d  reason: collision with root package name */
    public s f2951d;

    @Override // g.q.c.z
    public int[] a(RecyclerView.l lVar, View view) {
        int[] iArr = new int[2];
        if (lVar.e()) {
            iArr[0] = c(view, e(lVar));
        } else {
            iArr[0] = 0;
        }
        if (lVar.f()) {
            iArr[1] = c(view, f(lVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final int c(View view, s sVar) {
        return ((sVar.c(view) / 2) + sVar.e(view)) - ((sVar.l() / 2) + sVar.k());
    }

    public final View d(RecyclerView.l lVar, s sVar) {
        int y = lVar.y();
        View view = null;
        if (y == 0) {
            return null;
        }
        int l2 = (sVar.l() / 2) + sVar.k();
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < y; i3++) {
            View x = lVar.x(i3);
            int abs = Math.abs(((sVar.c(x) / 2) + sVar.e(x)) - l2);
            if (abs < i2) {
                view = x;
                i2 = abs;
            }
        }
        return view;
    }

    public final s e(RecyclerView.l lVar) {
        s sVar = this.f2951d;
        if (sVar == null || sVar.a != lVar) {
            this.f2951d = new q(lVar);
        }
        return this.f2951d;
    }

    public final s f(RecyclerView.l lVar) {
        s sVar = this.f2950c;
        if (sVar == null || sVar.a != lVar) {
            this.f2950c = new r(lVar);
        }
        return this.f2950c;
    }
}
