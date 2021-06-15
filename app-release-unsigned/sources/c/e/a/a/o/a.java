package c.e.a.a.o;

import android.content.Context;
import com.tsuga.news.R;

public class a {
    public final boolean a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1274c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1275d;

    public a(Context context) {
        this.a = c.e.a.a.a.r(context, R.attr.elevationOverlayEnabled, false);
        this.b = c.e.a.a.a.e(context, R.attr.elevationOverlayColor, 0);
        this.f1274c = c.e.a.a.a.e(context, R.attr.colorSurface, 0);
        this.f1275d = context.getResources().getDisplayMetrics().density;
    }
}
