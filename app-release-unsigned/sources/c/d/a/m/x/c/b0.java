package c.d.a.m.x.c;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import c.d.a.m.x.c.d0;

public class b0 implements d0.a {
    public final /* synthetic */ int a;

    public b0(int i2) {
        this.a = i2;
    }

    @Override // c.d.a.m.x.c.d0.a
    public void a(Canvas canvas, Paint paint, RectF rectF) {
        float f2 = (float) this.a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }
}
