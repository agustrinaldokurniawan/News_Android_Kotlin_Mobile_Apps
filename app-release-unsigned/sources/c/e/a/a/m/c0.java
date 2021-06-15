package c.e.a.a.m;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tsuga.news.R;
import java.util.Calendar;
import java.util.Locale;

public class c0 extends RecyclerView.d<a> {

    /* renamed from: d  reason: collision with root package name */
    public final g<?> f1244d;

    public static class a extends RecyclerView.z {
        public final TextView u;

        public a(TextView textView) {
            super(textView);
            this.u = textView;
        }
    }

    public c0(g<?> gVar) {
        this.f1244d = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public int a() {
        return this.f1244d.b0.f1230i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$z, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.d
    public void c(a aVar, int i2) {
        a aVar2 = aVar;
        int i3 = this.f1244d.b0.e.f1255g + i2;
        String string = aVar2.u.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar2.u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i3)));
        aVar2.u.setContentDescription(String.format(string, Integer.valueOf(i3)));
        c cVar = this.f1244d.e0;
        Calendar d2 = a0.d();
        b bVar = d2.get(1) == i3 ? cVar.f1241f : cVar.f1240d;
        for (Long l2 : this.f1244d.a0.i()) {
            d2.setTimeInMillis(l2.longValue());
            if (d2.get(1) == i3) {
                bVar = cVar.e;
            }
        }
        bVar.b(aVar2.u);
        aVar2.u.setOnClickListener(new b0(this, i3));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$z' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.d
    public a d(ViewGroup viewGroup, int i2) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    public int e(int i2) {
        return i2 - this.f1244d.b0.e.f1255g;
    }
}
