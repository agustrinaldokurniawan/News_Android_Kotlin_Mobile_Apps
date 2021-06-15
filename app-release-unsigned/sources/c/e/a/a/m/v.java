package c.e.a.a.m;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c.e.a.a.m.g;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.tsuga.news.R;
import g.h.j.o;
import g.h.j.s;
import java.util.concurrent.atomic.AtomicInteger;

public class v extends RecyclerView.d<a> {

    /* renamed from: d  reason: collision with root package name */
    public final Context f1266d;
    public final a e;

    /* renamed from: f  reason: collision with root package name */
    public final d<?> f1267f;

    /* renamed from: g  reason: collision with root package name */
    public final g.e f1268g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1269h;

    public static class a extends RecyclerView.z {
        public final TextView u;
        public final MaterialCalendarGridView v;

        public a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.u = textView;
            AtomicInteger atomicInteger = o.a;
            s sVar = new s(R.id.tag_accessibility_heading, Boolean.class, 28);
            Boolean bool = Boolean.TRUE;
            if (Build.VERSION.SDK_INT >= 28) {
                sVar.d(textView, bool);
            } else if (sVar.e(sVar.c(textView), bool)) {
                g.h.j.a e = o.e(textView);
                o.o(textView, e == null ? new g.h.j.a() : e);
                textView.setTag(R.id.tag_accessibility_heading, bool);
                o.i(textView, 0);
            }
            this.v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public v(Context context, d<?> dVar, a aVar, g.e eVar) {
        s sVar = aVar.e;
        s sVar2 = aVar.f1227f;
        s sVar3 = aVar.f1229h;
        if (sVar.compareTo(sVar3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (sVar3.compareTo(sVar2) <= 0) {
            int i2 = t.e;
            int i3 = g.Y;
            int dimensionPixelSize = i2 * context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
            int dimensionPixelSize2 = o.F0(context) ? context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0;
            this.f1266d = context;
            this.f1269h = dimensionPixelSize + dimensionPixelSize2;
            this.e = aVar;
            this.f1267f = dVar;
            this.f1268g = eVar;
            if (!this.a.a()) {
                this.b = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public int a() {
        return this.e.f1231j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public long b(int i2) {
        return this.e.e.o(i2).e.getTimeInMillis();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$z, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.d
    public void c(a aVar, int i2) {
        a aVar2 = aVar;
        s o = this.e.e.o(i2);
        aVar2.u.setText(o.n(aVar2.b.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !o.equals(materialCalendarGridView.getAdapter().f1260f)) {
            t tVar = new t(o, this.f1267f, this.e);
            materialCalendarGridView.setNumColumns(o.f1256h);
            materialCalendarGridView.setAdapter((ListAdapter) tVar);
        } else {
            materialCalendarGridView.invalidate();
            t a2 = materialCalendarGridView.getAdapter();
            for (Long l2 : a2.f1262h) {
                a2.f(materialCalendarGridView, l2.longValue());
            }
            d<?> dVar = a2.f1261g;
            if (dVar != null) {
                for (Long l3 : dVar.i()) {
                    a2.f(materialCalendarGridView, l3.longValue());
                }
                a2.f1262h = a2.f1261g.i();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new u(this, materialCalendarGridView));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$z' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.d
    public a d(ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!o.F0(viewGroup.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.m(-1, this.f1269h));
        return new a(linearLayout, true);
    }

    public s e(int i2) {
        return this.e.e.o(i2);
    }

    public int f(s sVar) {
        return this.e.e.p(sVar);
    }
}
