package c.e.a.a.v;

import android.graphics.Paint;
import android.graphics.Path;

public class a {
    public static final int[] a = new int[3];
    public static final float[] b = {0.0f, 0.5f, 1.0f};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1330c = new int[4];

    /* renamed from: d  reason: collision with root package name */
    public static final float[] f1331d = {0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint e = new Paint();

    /* renamed from: f  reason: collision with root package name */
    public final Paint f1332f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f1333g;

    /* renamed from: h  reason: collision with root package name */
    public int f1334h;

    /* renamed from: i  reason: collision with root package name */
    public int f1335i;

    /* renamed from: j  reason: collision with root package name */
    public int f1336j;

    /* renamed from: k  reason: collision with root package name */
    public final Path f1337k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public Paint f1338l = new Paint();

    public a() {
        a(-16777216);
        this.f1338l.setColor(0);
        Paint paint = new Paint(4);
        this.f1332f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1333g = new Paint(paint);
    }

    public void a(int i2) {
        this.f1334h = g.h.d.a.c(i2, 68);
        this.f1335i = g.h.d.a.c(i2, 20);
        this.f1336j = g.h.d.a.c(i2, 0);
        this.e.setColor(this.f1334h);
    }
}
