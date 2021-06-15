package c.b.a.c0.l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import c.b.a.a0.c.a;
import c.b.a.a0.c.p;
import c.b.a.g0.c;
import c.b.a.m;
import c.b.a.r;

public class h extends b {
    public final Paint A;
    public final float[] B;
    public final Path C;
    public final e D;
    public a<ColorFilter, ColorFilter> E;
    public final RectF z = new RectF();

    public h(m mVar, e eVar) {
        super(mVar, eVar);
        c.b.a.a0.a aVar = new c.b.a.a0.a();
        this.A = aVar;
        this.B = new float[8];
        this.C = new Path();
        this.D = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.f617l);
    }

    @Override // c.b.a.a0.b.e, c.b.a.c0.l.b
    public void a(RectF rectF, Matrix matrix, boolean z2) {
        super.a(rectF, matrix, z2);
        RectF rectF2 = this.z;
        e eVar = this.D;
        rectF2.set(0.0f, 0.0f, (float) eVar.f615j, (float) eVar.f616k);
        this.f608m.mapRect(this.z);
        rectF.set(this.z);
    }

    @Override // c.b.a.c0.f, c.b.a.c0.l.b
    public <T> void f(T t, c<T> cVar) {
        this.v.c(t, cVar);
        if (t != r.E) {
            return;
        }
        if (cVar == null) {
            this.E = null;
        } else {
            this.E = new p(cVar, null);
        }
    }

    @Override // c.b.a.c0.l.b
    public void l(Canvas canvas, Matrix matrix, int i2) {
        int i3;
        int alpha = Color.alpha(this.D.f617l);
        if (alpha != 0) {
            a<Integer, Integer> aVar = this.v.f515j;
            if (aVar == null) {
                i3 = 100;
            } else {
                i3 = aVar.e().intValue();
            }
            int i4 = (int) ((((((float) alpha) / 255.0f) * ((float) i3)) / 100.0f) * (((float) i2) / 255.0f) * 255.0f);
            this.A.setAlpha(i4);
            a<ColorFilter, ColorFilter> aVar2 = this.E;
            if (aVar2 != null) {
                this.A.setColorFilter(aVar2.e());
            }
            if (i4 > 0) {
                float[] fArr = this.B;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                e eVar = this.D;
                int i5 = eVar.f615j;
                fArr[2] = (float) i5;
                fArr[3] = 0.0f;
                fArr[4] = (float) i5;
                int i6 = eVar.f616k;
                fArr[5] = (float) i6;
                fArr[6] = 0.0f;
                fArr[7] = (float) i6;
                matrix.mapPoints(fArr);
                this.C.reset();
                Path path = this.C;
                float[] fArr2 = this.B;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.C;
                float[] fArr3 = this.B;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.C;
                float[] fArr4 = this.B;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.C;
                float[] fArr5 = this.B;
                path4.lineTo(fArr5[6], fArr5[7]);
                Path path5 = this.C;
                float[] fArr6 = this.B;
                path5.lineTo(fArr6[0], fArr6[1]);
                this.C.close();
                canvas.drawPath(this.C, this.A);
            }
        }
    }
}
