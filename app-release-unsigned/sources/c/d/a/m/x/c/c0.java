package c.d.a.m.x.c;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import c.d.a.m.x.c.d0;

public class c0 implements d0.a {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ float f1035c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ float f1036d;

    public c0(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.f1035c = f4;
        this.f1036d = f5;
    }

    @Override // c.d.a.m.x.c.d0.a
    public void a(Canvas canvas, Paint paint, RectF rectF) {
        Path path = new Path();
        float f2 = this.a;
        float f3 = this.b;
        float f4 = this.f1035c;
        float f5 = this.f1036d;
        path.addRoundRect(rectF, new float[]{f2, f2, f3, f3, f4, f4, f5, f5}, Path.Direction.CW);
        canvas.drawPath(path, paint);
    }
}
