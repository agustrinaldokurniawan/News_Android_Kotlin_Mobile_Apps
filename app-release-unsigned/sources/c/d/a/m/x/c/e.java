package c.d.a.m.x.c;

import android.graphics.Bitmap;
import c.d.a.m.v.c0.d;
import c.d.a.m.v.s;
import c.d.a.m.v.w;
import c.d.a.s.j;
import java.util.Objects;

public class e implements w<Bitmap>, s {
    public final Bitmap e;

    /* renamed from: f  reason: collision with root package name */
    public final d f1039f;

    public e(Bitmap bitmap, d dVar) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        this.e = bitmap;
        Objects.requireNonNull(dVar, "BitmapPool must not be null");
        this.f1039f = dVar;
    }

    public static e e(Bitmap bitmap, d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    @Override // c.d.a.m.v.s
    public void a() {
        this.e.prepareToDraw();
    }

    @Override // c.d.a.m.v.w
    public int b() {
        return j.d(this.e);
    }

    @Override // c.d.a.m.v.w
    public Class<Bitmap> c() {
        return Bitmap.class;
    }

    @Override // c.d.a.m.v.w
    public void d() {
        this.f1039f.e(this.e);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.d.a.m.v.w
    public Bitmap get() {
        return this.e;
    }
}
