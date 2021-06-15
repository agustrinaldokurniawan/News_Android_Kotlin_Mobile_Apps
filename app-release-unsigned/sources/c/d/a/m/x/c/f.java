package c.d.a.m.x.c;

import android.content.Context;
import android.graphics.Bitmap;
import c.d.a.b;
import c.d.a.m.t;
import c.d.a.m.v.c0.d;
import c.d.a.m.v.w;
import c.d.a.s.j;

public abstract class f implements t<Bitmap> {
    @Override // c.d.a.m.t
    public final w<Bitmap> b(Context context, w<Bitmap> wVar, int i2, int i3) {
        if (j.k(i2, i3)) {
            d dVar = b.b(context).f723g;
            Bitmap bitmap = wVar.get();
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getWidth();
            }
            if (i3 == Integer.MIN_VALUE) {
                i3 = bitmap.getHeight();
            }
            Bitmap c2 = c(dVar, bitmap, i2, i3);
            return bitmap.equals(c2) ? wVar : e.e(c2, dVar);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i2 + " or height: " + i3 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(d dVar, Bitmap bitmap, int i2, int i3);
}
