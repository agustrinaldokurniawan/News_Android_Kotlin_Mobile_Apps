package c.d.a.m.x.h;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import c.d.a.m.p;
import c.d.a.m.v.w;
import c.d.a.m.x.c.v;

public class b implements e<Bitmap, BitmapDrawable> {
    public final Resources a;

    public b(Resources resources) {
        this.a = resources;
    }

    @Override // c.d.a.m.x.h.e
    public w<BitmapDrawable> a(w<Bitmap> wVar, p pVar) {
        return v.e(this.a, wVar);
    }
}
