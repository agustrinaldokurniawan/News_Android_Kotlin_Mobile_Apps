package c.e.a.a.m;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tsuga.news.R;
import java.util.Calendar;
import java.util.Locale;

public class f extends BaseAdapter {
    public static final int e = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: f  reason: collision with root package name */
    public final Calendar f1245f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1246g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1247h;

    public f() {
        Calendar e2 = a0.e();
        this.f1245f = e2;
        this.f1246g = e2.getMaximum(7);
        this.f1247h = e2.getFirstDayOfWeek();
    }

    public int getCount() {
        return this.f1246g;
    }

    public Object getItem(int i2) {
        int i3 = this.f1246g;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2 + this.f1247h;
        if (i4 > i3) {
            i4 -= i3;
        }
        return Integer.valueOf(i4);
    }

    public long getItemId(int i2) {
        return 0;
    }

    @SuppressLint({"WrongConstant"})
    public View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f1245f;
        int i3 = i2 + this.f1247h;
        int i4 = this.f1246g;
        if (i3 > i4) {
            i3 -= i4;
        }
        calendar.set(7, i3);
        textView.setText(this.f1245f.getDisplayName(7, e, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f1245f.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
