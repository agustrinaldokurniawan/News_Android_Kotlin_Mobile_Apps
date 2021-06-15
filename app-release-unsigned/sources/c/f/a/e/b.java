package c.f.a.e;

import android.content.Context;
import android.content.res.TypedArray;
import com.tsuga.news.R;
import g.h.c.a;
import i.s.c.h;

public final class b {
    public final int a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f1549c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1550d;
    public final int e;

    public b(Context context, TypedArray typedArray) {
        h.f(context, "context");
        h.f(typedArray, "attr");
        Integer valueOf = Integer.valueOf(typedArray.getResourceId(10, -1));
        this.f1549c = !(valueOf.intValue() > 0) ? null : valueOf;
        this.f1550d = typedArray.getDimension(9, Float.MAX_VALUE);
        Object obj = a.a;
        this.a = typedArray.getColor(4, context.getColor(R.color.cnb_default_badge_color));
        this.b = typedArray.getColor(11, context.getColor(R.color.cnb_default_unselected_color));
        this.e = (int) typedArray.getDimension(5, context.getResources().getDimension(R.dimen.cnb_icon_size));
    }
}
