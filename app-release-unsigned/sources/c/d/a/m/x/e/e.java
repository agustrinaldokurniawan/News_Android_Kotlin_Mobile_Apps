package c.d.a.m.x.e;

import android.graphics.drawable.Drawable;
import c.d.a.m.p;
import c.d.a.m.r;
import c.d.a.m.v.w;

public class e implements r<Drawable, Drawable> {
    /* Return type fixed from 'c.d.a.m.v.w' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public w<Drawable> a(Drawable drawable, int i2, int i3, p pVar) {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new c(drawable2);
        }
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public /* bridge */ /* synthetic */ boolean b(Drawable drawable, p pVar) {
        return true;
    }
}
