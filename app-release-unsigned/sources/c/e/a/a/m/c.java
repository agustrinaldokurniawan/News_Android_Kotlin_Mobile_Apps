package c.e.a.a.m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import c.e.a.a.a;
import c.e.a.a.b;
import com.tsuga.news.R;

public final class c {
    public final b a;
    public final b b;

    /* renamed from: c  reason: collision with root package name */
    public final b f1239c;

    /* renamed from: d  reason: collision with root package name */
    public final b f1240d;
    public final b e;

    /* renamed from: f  reason: collision with root package name */
    public final b f1241f;

    /* renamed from: g  reason: collision with root package name */
    public final b f1242g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f1243h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a.s(context, R.attr.materialCalendarStyle, g.class.getCanonicalName()), b.n);
        this.a = b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f1242g = b.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.b = b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f1239c = b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList g2 = a.g(context, obtainStyledAttributes, 6);
        this.f1240d = b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.e = b.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f1241f = b.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f1243h = paint;
        paint.setColor(g2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
