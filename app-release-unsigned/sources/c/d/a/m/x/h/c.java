package c.d.a.m.x.h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c.d.a.m.p;
import c.d.a.m.v.c0.d;
import c.d.a.m.v.w;
import c.d.a.m.x.c.e;

public final class c implements e<Drawable, byte[]> {
    public final d a;
    public final e<Bitmap, byte[]> b;

    /* renamed from: c  reason: collision with root package name */
    public final e<c.d.a.m.x.g.c, byte[]> f1105c;

    public c(d dVar, e<Bitmap, byte[]> eVar, e<c.d.a.m.x.g.c, byte[]> eVar2) {
        this.a = dVar;
        this.b = eVar;
        this.f1105c = eVar2;
    }

    @Override // c.d.a.m.x.h.e
    public w<byte[]> a(w<Drawable> wVar, p pVar) {
        Drawable drawable = wVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(e.e(((BitmapDrawable) drawable).getBitmap(), this.a), pVar);
        }
        if (drawable instanceof c.d.a.m.x.g.c) {
            return this.f1105c.a(wVar, pVar);
        }
        return null;
    }
}
