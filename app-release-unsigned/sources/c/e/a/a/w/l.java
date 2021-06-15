package c.e.a.a.w;

import android.graphics.Canvas;
import android.graphics.Matrix;
import c.e.a.a.v.a;
import c.e.a.a.w.m;
import java.util.List;

public class l extends m.f {
    public final /* synthetic */ List b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Matrix f1384c;

    public l(m mVar, List list, Matrix matrix) {
        this.b = list;
        this.f1384c = matrix;
    }

    @Override // c.e.a.a.w.m.f
    public void a(Matrix matrix, a aVar, int i2, Canvas canvas) {
        for (m.f fVar : this.b) {
            fVar.a(this.f1384c, aVar, i2, canvas);
        }
    }
}
