package c.d.a.m.x.c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import c.d.a.m.c;
import c.d.a.m.p;
import c.d.a.m.s;
import c.d.a.m.v.c0.d;
import c.d.a.m.v.w;
import java.io.File;

public class b implements s<BitmapDrawable> {
    public final d a;
    public final s<Bitmap> b;

    public b(d dVar, s<Bitmap> sVar) {
        this.a = dVar;
        this.b = sVar;
    }

    @Override // c.d.a.m.d
    public boolean a(Object obj, File file, p pVar) {
        return this.b.a(new e(((BitmapDrawable) ((w) obj).get()).getBitmap(), this.a), file, pVar);
    }

    @Override // c.d.a.m.s
    public c b(p pVar) {
        return this.b.b(pVar);
    }
}
