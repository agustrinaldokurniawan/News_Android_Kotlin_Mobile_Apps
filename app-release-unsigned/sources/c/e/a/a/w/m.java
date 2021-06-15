package c.e.a.a.w;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class m {
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f1385c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f1386d;
    @Deprecated
    public float e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f1387f;

    /* renamed from: g  reason: collision with root package name */
    public final List<e> f1388g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List<f> f1389h = new ArrayList();

    public static class a extends f {
        public final c b;

        public a(c cVar) {
            this.b = cVar;
        }

        @Override // c.e.a.a.w.m.f
        public void a(Matrix matrix, c.e.a.a.v.a aVar, int i2, Canvas canvas) {
            c cVar = this.b;
            float f2 = cVar.f1395g;
            float f3 = cVar.f1396h;
            c cVar2 = this.b;
            RectF rectF = new RectF(cVar2.f1392c, cVar2.f1393d, cVar2.e, cVar2.f1394f);
            boolean z = f3 < 0.0f;
            Path path = aVar.f1337k;
            if (z) {
                int[] iArr = c.e.a.a.v.a.f1330c;
                iArr[0] = 0;
                iArr[1] = aVar.f1336j;
                iArr[2] = aVar.f1335i;
                iArr[3] = aVar.f1334h;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f2, f3);
                path.close();
                float f4 = (float) (-i2);
                rectF.inset(f4, f4);
                int[] iArr2 = c.e.a.a.v.a.f1330c;
                iArr2[0] = 0;
                iArr2[1] = aVar.f1334h;
                iArr2[2] = aVar.f1335i;
                iArr2[3] = aVar.f1336j;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f5 = 1.0f - (((float) i2) / width);
                float[] fArr = c.e.a.a.v.a.f1331d;
                fArr[1] = f5;
                fArr[2] = ((1.0f - f5) / 2.0f) + f5;
                aVar.f1332f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, c.e.a.a.v.a.f1330c, fArr, Shader.TileMode.CLAMP));
                canvas.save();
                canvas.concat(matrix);
                if (!z) {
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                    canvas.drawPath(path, aVar.f1338l);
                }
                canvas.drawArc(rectF, f2, f3, true, aVar.f1332f);
                canvas.restore();
            }
        }
    }

    public static class b extends f {
        public final d b;

        /* renamed from: c  reason: collision with root package name */
        public final float f1390c;

        /* renamed from: d  reason: collision with root package name */
        public final float f1391d;

        public b(d dVar, float f2, float f3) {
            this.b = dVar;
            this.f1390c = f2;
            this.f1391d = f3;
        }

        @Override // c.e.a.a.w.m.f
        public void a(Matrix matrix, c.e.a.a.v.a aVar, int i2, Canvas canvas) {
            d dVar = this.b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (dVar.f1397c - this.f1391d), (double) (dVar.b - this.f1390c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f1390c, this.f1391d);
            matrix2.preRotate(b());
            Objects.requireNonNull(aVar);
            rectF.bottom += (float) i2;
            rectF.offset(0.0f, (float) (-i2));
            int[] iArr = c.e.a.a.v.a.a;
            iArr[0] = aVar.f1336j;
            iArr[1] = aVar.f1335i;
            iArr[2] = aVar.f1334h;
            Paint paint = aVar.f1333g;
            float f2 = rectF.left;
            paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, c.e.a.a.v.a.b, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.f1333g);
            canvas.restore();
        }

        public float b() {
            d dVar = this.b;
            return (float) Math.toDegrees(Math.atan((double) ((dVar.f1397c - this.f1391d) / (dVar.b - this.f1390c))));
        }
    }

    public static class c extends e {
        public static final RectF b = new RectF();
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f1392c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f1393d;
        @Deprecated
        public float e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f1394f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f1395g;
        @Deprecated

        /* renamed from: h  reason: collision with root package name */
        public float f1396h;

        public c(float f2, float f3, float f4, float f5) {
            this.f1392c = f2;
            this.f1393d = f3;
            this.e = f4;
            this.f1394f = f5;
        }

        @Override // c.e.a.a.w.m.e
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = b;
            rectF.set(this.f1392c, this.f1393d, this.e, this.f1394f);
            path.arcTo(rectF, this.f1395g, this.f1396h, false);
            path.transform(matrix);
        }
    }

    public static class d extends e {
        public float b;

        /* renamed from: c  reason: collision with root package name */
        public float f1397c;

        @Override // c.e.a.a.w.m.e
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.f1397c);
            path.transform(matrix);
        }
    }

    public static abstract class e {
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class f {
        public static final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, c.e.a.a.v.a aVar, int i2, Canvas canvas);
    }

    public m() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        c cVar = new c(f2, f3, f4, f5);
        cVar.f1395g = f6;
        cVar.f1396h = f7;
        this.f1388g.add(cVar);
        a aVar = new a(cVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        float f9 = z ? (180.0f + f8) % 360.0f : f8;
        b(f6);
        this.f1389h.add(aVar);
        this.e = f9;
        double d2 = (double) f8;
        this.f1385c = (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))) + ((f2 + f4) * 0.5f);
        this.f1386d = (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))) + ((f3 + f5) * 0.5f);
    }

    public final void b(float f2) {
        float f3 = this.e;
        if (f3 != f2) {
            float f4 = ((f2 - f3) + 360.0f) % 360.0f;
            if (f4 <= 180.0f) {
                float f5 = this.f1385c;
                float f6 = this.f1386d;
                c cVar = new c(f5, f6, f5, f6);
                cVar.f1395g = this.e;
                cVar.f1396h = f4;
                this.f1389h.add(new a(cVar));
                this.e = f2;
            }
        }
    }

    public void c(Matrix matrix, Path path) {
        int size = this.f1388g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1388g.get(i2).a(matrix, path);
        }
    }

    public void d(float f2, float f3) {
        d dVar = new d();
        dVar.b = f2;
        dVar.f1397c = f3;
        this.f1388g.add(dVar);
        b bVar = new b(dVar, this.f1385c, this.f1386d);
        b(bVar.b() + 270.0f);
        this.f1389h.add(bVar);
        this.e = bVar.b() + 270.0f;
        this.f1385c = f2;
        this.f1386d = f3;
    }

    public void e(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.f1385c = f2;
        this.f1386d = f3;
        this.e = f4;
        this.f1387f = (f4 + f5) % 360.0f;
        this.f1388g.clear();
        this.f1389h.clear();
    }
}
