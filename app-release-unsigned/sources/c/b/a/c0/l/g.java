package c.b.a.c0.l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import c.b.a.a0.b.d;
import c.b.a.c0.e;
import c.b.a.m;
import java.util.Collections;
import java.util.List;

public class g extends b {
    public final d z;

    public g(m mVar, e eVar) {
        super(mVar, eVar);
        d dVar = new d(mVar, this, new c.b.a.c0.k.m("__container", eVar.a, false));
        this.z = dVar;
        dVar.c(Collections.emptyList(), Collections.emptyList());
    }

    @Override // c.b.a.a0.b.e, c.b.a.c0.l.b
    public void a(RectF rectF, Matrix matrix, boolean z2) {
        super.a(rectF, matrix, z2);
        this.z.a(rectF, this.f608m, z2);
    }

    @Override // c.b.a.c0.l.b
    public void l(Canvas canvas, Matrix matrix, int i2) {
        this.z.g(canvas, matrix, i2);
    }

    @Override // c.b.a.c0.l.b
    public void p(e eVar, int i2, List<e> list, e eVar2) {
        this.z.e(eVar, i2, list, eVar2);
    }
}
