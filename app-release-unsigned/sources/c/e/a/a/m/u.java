package c.e.a.a.m;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import c.e.a.a.m.g;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

public class u implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ v f1265f;

    public u(v vVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f1265f = vVar;
        this.e = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        t a = this.e.getAdapter();
        if (i2 >= a.b() && i2 <= a.d()) {
            g.e eVar = this.f1265f.f1268g;
            long longValue = this.e.getAdapter().getItem(i2).longValue();
            g.d dVar = (g.d) eVar;
            if (g.this.b0.f1228g.e(longValue)) {
                g.this.a0.g(longValue);
                Iterator<w<S>> it = g.this.X.iterator();
                while (it.hasNext()) {
                    it.next().a(g.this.a0.a());
                }
                g.this.g0.getAdapter().a.b();
                RecyclerView recyclerView = g.this.f0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().a.b();
                }
            }
        }
    }
}
