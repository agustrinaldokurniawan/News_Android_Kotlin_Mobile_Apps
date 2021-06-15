package c.b.a.e0;

import android.graphics.Color;
import android.graphics.PointF;
import c.b.a.c0.k.c;
import c.b.a.e0.h0.c;
import c.b.a.f0.f;
import java.util.ArrayList;

public class k implements g0<c> {
    public int a;

    public k(int i2) {
        this.a = i2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.b.a.e0.g0
    public c a(c.b.a.e0.h0.c cVar, float f2) {
        int i2;
        c cVar2;
        int i3;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 1;
        boolean z = cVar.f0() == c.b.BEGIN_ARRAY;
        if (z) {
            cVar.b();
        }
        while (cVar.K()) {
            arrayList.add(Float.valueOf((float) cVar.V()));
        }
        if (z) {
            cVar.e();
        }
        if (this.a == -1) {
            this.a = arrayList.size() / 4;
        }
        int i6 = this.a;
        float[] fArr = new float[i6];
        int[] iArr = new int[i6];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i2 = this.a * 4;
            if (i7 >= i2) {
                break;
            }
            int i10 = i7 / 4;
            double floatValue = (double) ((Float) arrayList.get(i7)).floatValue();
            int i11 = i7 % 4;
            if (i11 == 0) {
                if (i10 > 0) {
                    float f3 = (float) floatValue;
                    if (fArr[i10 - 1] >= f3) {
                        fArr[i10] = f3 + 0.01f;
                    }
                }
                fArr[i10] = (float) floatValue;
            } else if (i11 == 1) {
                i8 = (int) (floatValue * 255.0d);
            } else if (i11 == 2) {
                i9 = (int) (floatValue * 255.0d);
            } else if (i11 == 3) {
                iArr[i10] = Color.argb(255, i8, i9, (int) (floatValue * 255.0d));
            }
            i7++;
        }
        c.b.a.c0.k.c cVar3 = new c.b.a.c0.k.c(fArr, iArr);
        if (arrayList.size() > i2) {
            int size = (arrayList.size() - i2) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i12 = 0;
            while (i2 < arrayList.size()) {
                if (i2 % 2 == 0) {
                    dArr[i12] = (double) ((Float) arrayList.get(i2)).floatValue();
                } else {
                    dArr2[i12] = (double) ((Float) arrayList.get(i2)).floatValue();
                    i12++;
                }
                i2++;
            }
            while (true) {
                int[] iArr2 = cVar3.b;
                if (i4 >= iArr2.length) {
                    break;
                }
                int i13 = iArr2[i4];
                double d2 = (double) cVar3.a[i4];
                int i14 = i5;
                while (true) {
                    if (i14 >= size) {
                        cVar2 = cVar3;
                        i3 = (int) (dArr2[size - 1] * 255.0d);
                        break;
                    }
                    int i15 = i14 - 1;
                    double d3 = dArr[i15];
                    double d4 = dArr[i14];
                    if (dArr[i14] >= d2) {
                        double d5 = (d2 - d3) / (d4 - d3);
                        cVar2 = cVar3;
                        PointF pointF = f.a;
                        double max = Math.max(0.0d, Math.min(1.0d, d5));
                        double d6 = dArr2[i15];
                        i3 = (int) ((((dArr2[i14] - d6) * max) + d6) * 255.0d);
                        break;
                    }
                    i14++;
                }
                cVar2.b[i4] = Color.argb(i3, Color.red(i13), Color.green(i13), Color.blue(i13));
                i4++;
                cVar3 = cVar2;
                i5 = 1;
            }
        }
        return cVar3;
    }
}
