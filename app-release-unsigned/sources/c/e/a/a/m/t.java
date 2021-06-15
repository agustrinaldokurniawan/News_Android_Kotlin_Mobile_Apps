package c.e.a.a.m;

import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

public class t extends BaseAdapter {
    public static final int e = a0.e().getMaximum(4);

    /* renamed from: f  reason: collision with root package name */
    public final s f1260f;

    /* renamed from: g  reason: collision with root package name */
    public final d<?> f1261g;

    /* renamed from: h  reason: collision with root package name */
    public Collection<Long> f1262h;

    /* renamed from: i  reason: collision with root package name */
    public c f1263i;

    /* renamed from: j  reason: collision with root package name */
    public final a f1264j;

    public t(s sVar, d<?> dVar, a aVar) {
        this.f1260f = sVar;
        this.f1261g = dVar;
        this.f1264j = aVar;
        this.f1262h = dVar.i();
    }

    public int a(int i2) {
        return b() + (i2 - 1);
    }

    public int b() {
        return this.f1260f.m();
    }

    /* renamed from: c */
    public Long getItem(int i2) {
        if (i2 < this.f1260f.m() || i2 > d()) {
            return null;
        }
        s sVar = this.f1260f;
        Calendar b = a0.b(sVar.e);
        b.set(5, (i2 - sVar.m()) + 1);
        return Long.valueOf(b.getTimeInMillis());
    }

    public int d() {
        return (this.f1260f.m() + this.f1260f.f1257i) - 1;
    }

    public final void e(TextView textView, long j2) {
        b bVar;
        if (textView != null) {
            boolean z = false;
            if (this.f1264j.f1228g.e(j2)) {
                textView.setEnabled(true);
                Iterator<Long> it = this.f1261g.i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (a0.a(j2) == a0.a(it.next().longValue())) {
                        z = true;
                        break;
                    }
                }
                bVar = z ? this.f1263i.b : a0.d().getTimeInMillis() == j2 ? this.f1263i.f1239c : this.f1263i.a;
            } else {
                textView.setEnabled(false);
                bVar = this.f1263i.f1242g;
            }
            bVar.b(textView);
        }
    }

    public final void f(MaterialCalendarGridView materialCalendarGridView, long j2) {
        if (s.l(j2).equals(this.f1260f)) {
            Calendar b = a0.b(this.f1260f.e);
            b.setTimeInMillis(j2);
            e((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(b.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j2);
        }
    }

    public int getCount() {
        return b() + this.f1260f.f1257i;
    }

    public long getItemId(int i2) {
        return (long) (i2 / this.f1260f.f1256h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.a.m.t.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public boolean hasStableIds() {
        return true;
    }
}
