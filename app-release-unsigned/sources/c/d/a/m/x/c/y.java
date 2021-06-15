package c.d.a.m.x.c;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import c.d.a.m.p;
import c.d.a.m.r;
import c.d.a.m.v.w;
import c.d.a.m.x.e.b;
import c.d.a.m.x.e.d;

public class y implements r<Uri, Bitmap> {
    public final d a;
    public final c.d.a.m.v.c0.d b;

    public y(d dVar, c.d.a.m.v.c0.d dVar2) {
        this.a = dVar;
        this.b = dVar2;
    }

    /* Return type fixed from 'c.d.a.m.v.w' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public w<Bitmap> a(Uri uri, int i2, int i3, p pVar) {
        w c2 = this.a.c(uri);
        if (c2 == null) {
            return null;
        }
        return n.a(this.b, (Drawable) ((b) c2).get(), i2, i3);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public boolean b(Uri uri, p pVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
