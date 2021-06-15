package c.e.a.a.m;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g.h.i.b;
import java.util.Calendar;
import java.util.Objects;

public class h extends RecyclerView.k {
    public final Calendar a = a0.e();
    public final Calendar b = a0.e();

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f1249c;

    public h(g gVar) {
        this.f1249c = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.w wVar) {
        if ((recyclerView.getAdapter() instanceof c0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            c0 c0Var = (c0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (b<Long, Long> bVar : this.f1249c.a0.d()) {
                Objects.requireNonNull(bVar);
            }
        }
    }
}
