package g.q.c;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class t extends o {
    public final /* synthetic */ u q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context) {
        super(context);
        this.q = uVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v, g.q.c.o
    public void c(View view, RecyclerView.w wVar, RecyclerView.v.a aVar) {
        u uVar = this.q;
        int[] a = uVar.a(uVar.a.getLayoutManager(), view);
        int i2 = a[0];
        int i3 = a[1];
        int ceil = (int) Math.ceil(((double) g(Math.max(Math.abs(i2), Math.abs(i3)))) / 0.3356d);
        if (ceil > 0) {
            aVar.b(i2, i3, ceil, this.f2945j);
        }
    }

    @Override // g.q.c.o
    public float f(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    @Override // g.q.c.o
    public int g(int i2) {
        return Math.min(100, super.g(i2));
    }
}
